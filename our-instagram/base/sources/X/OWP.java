package X;

/* loaded from: classes9.dex */
public final class OWP {
    public final int A00;
    public final C006802i A01;

    public static final void A00(OWP owp, Integer num, String str, String str2, String str3, String str4, String str5) {
        owp.A02(AnonymousClass001.A0R(str, "carrier_id"), String.valueOf(num));
        String A0R = AnonymousClass001.A0R(str, "normal_eligibility_hash");
        if (str2 == null) {
            str2 = "";
        }
        owp.A02(A0R, str2);
        String A0R2 = AnonymousClass001.A0R(str, "basic_eligibility_hash");
        if (str3 == null) {
            str3 = "";
        }
        owp.A02(A0R2, str3);
        owp.A02(AnonymousClass001.A0R(str, "normal_token_string"), str4);
        owp.A02(AnonymousClass001.A0R(str, "basic_token_string"), str5);
    }

    public final void A01(String str) {
        this.A01.markerPoint(238960560, this.A00, str);
    }

    public OWP() {
        String A0n = AbstractC166997dE.A0n();
        C14360o3.A0B(A0n, 2);
        int A01 = MSW.A01();
        this.A00 = A01;
        C006802i A0N = AbstractC43592JPx.A0N();
        this.A01 = A0N;
        A0N.A0S(238960560, A01, A0n);
    }

    public final void A02(String str, String str2) {
        AbstractC167017dG.A1N(str, str2);
        this.A01.markerAnnotate(238960560, this.A00, str, str2);
    }
}
