package X;

import java.util.Locale;

/* loaded from: classes11.dex */
public final class Wan implements C2GC {
    public final InterfaceC02550Ad A00;

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0198. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:23:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    @Override // X.C2GC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Chz(java.lang.String r61, java.util.Map r62) {
        /*
            Method dump skipped, instructions count: 1366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Wan.Chz(java.lang.String, java.util.Map):void");
    }

    public static void A00(C0Zx c0Zx, String str, String str2) {
        if (str != null && str.length() != 0) {
            c0Zx.A06(str2, str);
        }
    }

    public static void A01(C0Zx c0Zx, String str, String str2) {
        String str3;
        c0Zx.A06("payout_interface_type", "IG_ANDROID");
        if ("IG_ANDROID".equals("IG_ANDROID")) {
            str3 = "IG_ONLY_LOGIN";
        } else {
            str3 = "FB_LOGIN";
        }
        c0Zx.A06("login_mode", str3);
        String upperCase = str.toUpperCase(Locale.ROOT);
        C14360o3.A07(upperCase);
        c0Zx.A01(VHT.valueOf(upperCase), "endpoint");
        if (str2 != null && str2.length() != 0) {
            c0Zx.A05("financial_id", Long.valueOf(Long.parseLong(str2)));
        }
    }

    public static void A02(C0Zx c0Zx, String str, String str2) {
        if (str != null && str.length() != 0) {
            c0Zx.A05(str2, Long.valueOf(Long.parseLong(str)));
        }
    }

    public Wan(InterfaceC02550Ad interfaceC02550Ad) {
        this.A00 = interfaceC02550Ad;
    }

    public static void A03(C0Zx c0Zx, String str, String str2, String str3) {
        String str4;
        c0Zx.A06(str, str2);
        c0Zx.A06("payout_interface_type", "IG_ANDROID");
        if ("IG_ANDROID".equals("IG_ANDROID")) {
            str4 = "IG_ONLY_LOGIN";
        } else {
            str4 = "FB_LOGIN";
        }
        c0Zx.A06("login_mode", str4);
        if (str3 != null && str3.length() != 0) {
            c0Zx.A05("financial_id", Long.valueOf(Long.parseLong(str3)));
        }
    }
}
