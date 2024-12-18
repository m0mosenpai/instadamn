package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes10.dex */
public final class T2R implements C2GC {
    public final SNL A00;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.QC6, X.0Zx] */
    public static QC6 A01(Long l, String str, String str2) {
        ?? c0Zx = new C0Zx();
        c0Zx.A06("contact_type", str);
        if (l != null) {
            c0Zx.A05("contact_id", l);
        }
        if (str2 != null) {
            c0Zx.A06("target_name", str2);
        }
        return c0Zx;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.QC7, X.0Zx] */
    public static QC7 A02(Long l) {
        ?? c0Zx = new C0Zx();
        c0Zx.A01(EnumC72431Xdb.A04, "credential_type");
        c0Zx.A05("credential_id", l);
        return c0Zx;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.QC7, X.0Zx] */
    public static QC7 A03(Long l) {
        ?? c0Zx = new C0Zx();
        c0Zx.A01(EnumC72431Xdb.A02, "credential_type");
        c0Zx.A05("credential_id", l);
        return c0Zx;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.QC7, X.0Zx] */
    public static QC7 A04(Long l, String str, String str2, String str3) {
        ?? c0Zx = new C0Zx();
        c0Zx.A01(EnumC72431Xdb.valueOf(str.toUpperCase(Locale.US)), "credential_type");
        if (l != null) {
            c0Zx.A05("credential_id", l);
        }
        if (str2 != null) {
            c0Zx.A06("target_name", str2);
        }
        if (str3 != null) {
            c0Zx.A06("view_name", str3);
        }
        return c0Zx;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.QCF, X.0Zx] */
    public static QCF A05(Long l) {
        ?? c0Zx = new C0Zx();
        c0Zx.A05("credential_id", l);
        return c0Zx;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.QCV, X.0Zx] */
    public static QCV A06(String str) {
        ?? c0Zx = new C0Zx();
        Enum A00 = AbstractC61766RtL.A00(VHU.class, str);
        A00.getClass();
        c0Zx.A01((VHU) A00, "legal_info_type");
        return c0Zx;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0Zx, X.QCj] */
    public static C58848QCj A07(Map map) {
        Object obj = map.get(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        obj.getClass();
        ?? c0Zx = new C0Zx();
        c0Zx.A05("shipping_address_id", (Long) obj);
        return c0Zx;
    }

    public T2R(SNL snl) {
        this.A00 = snl;
    }

    public static InterfaceC02550Ad A00(C0Zx c0Zx, T2R t2r, String str, String str2) {
        c0Zx.A06(str, str2);
        return t2r.A00.A00;
    }

    public static Long A08(Object obj, Map map) {
        Object obj2 = map.get(obj);
        obj2.getClass();
        return (Long) obj2;
    }

    public static String A09(Object obj, Map map) {
        Object obj2 = map.get(obj);
        obj2.getClass();
        return (String) obj2;
    }

    public static String A0A(String str) {
        String str2;
        switch (str.hashCode()) {
            case -2025722585:
                str2 = "edit_email";
                break;
            case 330394238:
                str2 = "add_email";
                break;
            default:
                return "phone";
        }
        if (!str.equals(str2)) {
            return "phone";
        }
        return "email";
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x006f. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v391, types: [X.SNL] */
    /* JADX WARN: Type inference failed for: r2v12, types: [X.0Zx, X.QCl] */
    /* JADX WARN: Type inference failed for: r2v18, types: [X.0Zx, X.QCn] */
    /* JADX WARN: Type inference failed for: r2v21, types: [X.0Zx] */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.0Zx, X.QCn] */
    /* JADX WARN: Type inference failed for: r2v30, types: [X.0Zx] */
    /* JADX WARN: Type inference failed for: r2v5, types: [X.0Zx] */
    /* JADX WARN: Type inference failed for: r4v14, types: [X.SNL] */
    /* JADX WARN: Type inference failed for: r4v27, types: [X.0Zx, X.QCl] */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.SNL] */
    /* JADX WARN: Type inference failed for: r4v9, types: [X.SNL] */
    @Override // X.C2GC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Chz(java.lang.String r27, java.util.Map r28) {
        /*
            Method dump skipped, instructions count: 5336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T2R.Chz(java.lang.String, java.util.Map):void");
    }
}
