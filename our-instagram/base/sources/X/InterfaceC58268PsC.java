package X;

import android.os.Bundle;

/* renamed from: X.PsC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC58268PsC {
    void Ci4(Bundle bundle, String str, String str2, String str3, String str4);

    static void A00(Bundle bundle, InterfaceC58268PsC interfaceC58268PsC, String str, String str2, String str3) {
        interfaceC58268PsC.Ci4(bundle, str, str2, str3, "click");
    }

    static void A01(Bundle bundle, InterfaceC58268PsC interfaceC58268PsC, String str, String str2, String str3) {
        interfaceC58268PsC.Ci4(bundle, str, str2, str3, "impression");
    }

    static void A02(InterfaceC58268PsC interfaceC58268PsC, String str, String str2, String str3) {
        interfaceC58268PsC.Ci4(null, str, str2, str3, "click");
    }

    static void A03(InterfaceC58268PsC interfaceC58268PsC, String str, String str2, String str3) {
        interfaceC58268PsC.Ci4(null, str, str2, str3, "impression");
    }
}
