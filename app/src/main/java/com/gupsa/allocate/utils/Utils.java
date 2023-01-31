package com.gupsa.allocate.utils;

import com.google.firebase.Timestamp;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class Utils {
    static SimpleDateFormat korDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
    static DecimalFormat commaDecimalFormat = new DecimalFormat("###,###");

    // Timestamp를 yyyy년 MM월 dd일 형식으로 반환
    public static String timeStampToKor(Timestamp firebaseTimestamp) {
        return korDateFormat.format(firebaseTimestamp.toDate().getTime());
    }

    // 숫자 3자리마다 콤마 넣기
    public static String getCommaString(int number) {
        return commaDecimalFormat.format(number);
    }

    // 휴대전화 번호 '-' 넣기
    public static String getPhoneString(String phone) {
        if (phone.startsWith("010")) {
            return phone.substring(0, 3) + "-" + phone.substring(3, 7) + "-" + phone.substring(7, 11);
        } else if (phone.startsWith("02")) {
            return phone.substring(0, 2) + "-" + phone.substring(2, 6) + "-" + phone.substring(6, 10);
        } else {
            return phone.substring(0, 3) + "-" + phone.substring(3, 7) + "-" + phone.substring(7, 11);
        }
    }
}
