package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.3UZ, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3UZ {
    public static final C3Ui A00;
    public static final C3Uj A01;
    public static final java.util.Set A05;
    public static final Map A07;
    public static final java.util.Set A04 = new HashSet<String>() { // from class: X.3Ua
        {
            add("com.facebook.rti.fbnsdemo");
            add("com.facebook.katana");
            add("com.facebook.wakizashi");
            add("com.facebook.lite");
            add("com.facebook.orca");
            add("com.instagram.android");
            add("com.instagram.direct");
            add("com.instagram.lite");
            add("com.instagram.android.preload");
            add("com.facebook.alohaservices.push");
            add("com.facebook.mlite");
            add("com.facebook.mlite_debug");
            add("com.facebook.mlite_inhouse");
            add("com.facebook.aloha.push");
            add("com.whatsapp");
            add("com.whatsapp.w4b");
            add("com.facebook.pages.app");
            add("com.facebook.workchat");
            add("com.facebook.adsmanager");
        }
    };
    public static final Map A02 = new HashMap<String, Integer>() { // from class: X.3Ub
        {
            put("com.facebook.katana", 1);
            put("com.facebook.wakizashi", 2);
            put("com.facebook.orca", 3);
            put("com.instagram.android", 4);
            put("com.facebook.lite", 5);
            put("com.facebook.rti.fbnsdemo", 6);
            put("com.instagram.direct", 7);
            put("com.facebook.alohaservices.push", 8);
            put("com.facebook.mlite", 9);
            put("com.facebook.mlite_debug", 10);
            put("com.facebook.mlite_inhouse", 11);
            put("com.facebook.aloha.push", 12);
            put("com.whatsapp", 13);
            put("com.whatsapp.w4b", 14);
            put("com.instagram.lite", 15);
            put("com.facebook.pages.app", 16);
            put("com.facebook.workchat", 17);
            put("com.facebook.adsmanager", 18);
        }
    };
    public static final java.util.Set A06 = Collections.unmodifiableSet(new HashSet<C0B5>() { // from class: X.3Uc
        {
            add(AbstractC08760ce.A0d);
            add(AbstractC08760ce.A0m);
            addAll(C0B8.A0t);
            add(AbstractC08760ce.A1h);
            add(AbstractC08760ce.A1G);
            add(AbstractC08760ce.A08);
        }
    });
    public static final Map A03 = Collections.unmodifiableMap(new HashMap<String, Integer>() { // from class: X.3Ud
        {
            put("com.facebook.katana", 295);
            put("com.facebook.wakizashi", 295);
            put("com.facebook.orca", 289);
            put("com.instagram.android", 166);
            put("com.facebook.lite", 222);
            put("com.facebook.rti.fbnsdemo", 0);
            put("com.instagram.direct", 91);
            put("com.facebook.alohaservices.push", 1);
            put("com.facebook.mlite", 112);
            put("com.facebook.mlite_debug", 112);
            put("com.facebook.mlite_inhouse", 112);
            put("com.facebook.aloha.push", 0);
            put("com.whatsapp", 2);
            put("com.whatsapp.w4b", 2);
            put("com.instagram.lite", 223);
            put("com.facebook.work", 295);
            put("com.facebook.workdev", 295);
            put("com.facebook.workchat", 289);
        }
    });

    static {
        Map unmodifiableMap = Collections.unmodifiableMap(new HashMap<Integer, C3Ug>() { // from class: X.3Ue
            {
                put(0, new Object());
                put(1, new Object());
            }
        });
        A07 = unmodifiableMap;
        A00 = new C3Ui(unmodifiableMap);
        A01 = new C3Uj();
        A05 = Collections.unmodifiableSet(new HashSet<String>() { // from class: X.3Uk
            {
                add("android.permission.INTERNET");
                add("android.permission.ACCESS_NETWORK_STATE");
                add("android.permission.WAKE_LOCK");
                add("android.permission.RECEIVE_BOOT_COMPLETED");
                add("android.permission.CHANGE_DEVICE_IDLE_TEMP_WHITELIST");
            }
        });
    }
}
