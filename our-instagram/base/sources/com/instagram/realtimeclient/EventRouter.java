package com.instagram.realtimeclient;

import X.AbstractC166987dD;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public class EventRouter {
    public static String fill(String str, Map map) {
        String[] split = str.split("/");
        StringBuilder A1C = AbstractC166987dD.A1C();
        for (String str2 : split) {
            if (str2.startsWith(":")) {
                A1C.append(AbstractC166987dD.A1A(str2.substring(1), map));
            } else {
                A1C.append(str2);
            }
            A1C.append("/");
        }
        String obj = A1C.toString();
        return obj.substring(0, obj.length() - 1);
    }

    public static Map match(String str, String str2) {
        String[] split = str.split("/");
        String[] split2 = str2.split("/");
        int length = split.length;
        int length2 = split2.length;
        if (length > length2 || (length < length2 && !split[length - 1].equals("*"))) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < length; i++) {
            if (!split[i].equals("*")) {
                String str3 = split[i];
                if (str3.startsWith(":")) {
                    hashMap.put(str3.substring(1), split2[i]);
                } else if (!str3.equals(split2[i])) {
                    return null;
                }
            }
        }
        return hashMap;
    }
}
