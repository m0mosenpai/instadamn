package X;

import android.content.Context;
import java.util.Map;

/* renamed from: X.8eb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC191798eb {
    public static void A04(Context context, InterfaceC191788ea interfaceC191788ea, String str, Map map, long j) {
        A03(context, interfaceC191788ea, str, null, map, j);
    }

    public static void A02(Context context, InterfaceC191788ea interfaceC191788ea, String str, String str2, Map map, long j) {
        if (str != null) {
            C191848eg A01 = C1LZ.A00().A01();
            try {
                A01.A00.AUs(context, A01.A01.A00(context, interfaceC191788ea, str, str2, map, j));
            } finally {
                C1LV.A01();
            }
        }
    }

    public static void A03(Context context, InterfaceC191788ea interfaceC191788ea, String str, String str2, Map map, long j) {
        if (str != null) {
            C191848eg A01 = C1LZ.A00().A01();
            A01.A00.E5C(context, A01.A01.A00(context, interfaceC191788ea, str, str2, map, j), j);
        }
    }

    public static InterfaceC192098fA A00(Context context, InterfaceC191788ea interfaceC191788ea, String str, String str2, Map map, long j) {
        C191848eg A01 = C1LZ.A00().A01();
        return new C192088f9(A01.A00.Bo6(context, A01.A01.A00(context, interfaceC191788ea, str, str2, map, j)));
    }

    public static void A01(Context context, InterfaceC191788ea interfaceC191788ea, String str, String str2, Map map) {
        C191848eg A01 = C1LZ.A00().A01();
        try {
            A01.A00.COu(context, A01.A01.A00(context, interfaceC191788ea, str, str2, map, 0L));
        } finally {
            A01.A02.A00(interfaceC191788ea, str, str2, map);
        }
    }
}
