package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Sd6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63103Sd6 {
    public static List A00 = Arrays.asList("com.instagram.android", "com.instagram.barcelona", "com.facebook.katana", "com.facebook.wakizashi", "com.facebook.orca");
    public static Map A01;

    public static Map A01() {
        if (A01 == null) {
            HashMap A1G = AbstractC166987dD.A1G();
            A01 = A1G;
            A1G.put("com.facebook.wakizashi", "350685531728");
            A01.put("com.facebook.orca", "256002347743983");
            A01.put("com.facebook.pages.app", "121876164619130");
            A01.put("com.whatsapp", "306069495113");
            A01.put("com.instagram.android", "567067343352427");
            A01.put("com.instagram.bolt", "295940867235646");
            A01.put("com.instagram.layout", "881555691867714");
            A01.put(MSV.A00(1059), "358698234273213");
            A01.put("com.facebook.moments", "794956213882720");
            A01.put("com.facebook.slingshot", "255620677933453");
            A01.put("com.oculus.home", "1548792348668883");
            A01.put("com.oculus.horizon", "1437758943160428");
            A01.put("com.facebook.lite", "275254692598279");
            A01.put("com.instagram.barcelona", "3419628305025917");
        }
        return Collections.unmodifiableMap(A01);
    }

    public static String A00(String str) {
        if (A01().containsKey(str)) {
            return AbstractC166987dD.A1A(str, A01());
        }
        return str;
    }
}
