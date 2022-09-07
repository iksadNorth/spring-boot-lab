<template>
    <v-container class="w-50">
        <v-row class="my-5 text-center">
            <h2>일반 이용자 페이지</h2>
        </v-row>

        <v-row class="my-5">
            <v-textarea
            v-model="text"
            label="입력창"
            auto-grow
            ></v-textarea>
        </v-row>
        
        <v-row class="my-5">
            <v-btn
            outlined
            @click="clickWrite()"
            >쓰기</v-btn>
        </v-row>

        <v-row class="justify-center">
            <v-table>
                <thead>
                    <tr>
                        <th class="text-left">
                        text
                        </th>
                    </tr>
                </thead>
                <tbody>
                    <tr
                        v-for="item in items"
                        :key="item"
                    >
                        <td>{{ item }}</td>
                    </tr>
                </tbody>
            </v-table>
        </v-row>
    </v-container>
</template>

<script>
export default {
    data() {
        return {
            items: [],

            text: undefined,
        }
    },
    methods: {
        clickWrite() {
            // 쓰기 버튼 클릭
            this.items.push(this.text);
        }
    },
}
</script>
