<template>
    <v-container class="w-50">
        <v-row class="my-10">
            <h1>Login</h1>
        </v-row>
        
        <v-row class="my-3">
            <v-text-field
            v-model="username"
            label="아이디" prepend-icon="mdi-account-box"
            ></v-text-field>
        </v-row>

        <v-row class="my-3">
            <v-text-field
            v-model="password"
            label="패스워드" prepend-icon="mdi-lock"
            ></v-text-field>
        </v-row>

        <v-row>
            <v-col cols="8">
                <v-checkbox
                v-model="remember"
                label="로그인 정보 기억하기"
                ></v-checkbox>
            </v-col>

            <v-col cols="2">
                <v-btn 
                outlined
                @click="clickSubmit()"
                >확인</v-btn>
            </v-col>
        </v-row>
    </v-container>
</template>

<script>
export default {
    data() {
        return {
            username: undefined,
            password: undefined,
            remember: false,
        }
    },
    methods: {
        clickSubmit() {
            // 제출 버튼 click
        },
    },
}
</script>
