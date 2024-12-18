package X;

import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class OKz {
    public String A00 = "amount";
    public final C2GS A01;
    public final C2GS A02;
    public final C41761wQ A03;
    public final O6G A04;

    public final C2GS A00() {
        if (C14360o3.A0K(this.A00, "amount")) {
            return this.A01;
        }
        return this.A02;
    }

    public final void A01(String str, boolean z, String str2) {
        C2GS c2gs;
        C51607Mqz c51607Mqz;
        if (C14360o3.A0K(this.A00, "time")) {
            c2gs = this.A02;
        } else {
            c2gs = this.A01;
        }
        String str3 = null;
        if (!z && ((c51607Mqz = (C51607Mqz) c2gs.A02()) == null || (str3 = c51607Mqz.A00) == null)) {
            return;
        }
        C51607Mqz c51607Mqz2 = (C51607Mqz) c2gs.A02();
        if (c51607Mqz2 != null) {
            c51607Mqz2.A03 = true;
        }
        AbstractC50523MSb.A0s(c2gs);
        C41761wQ c41761wQ = this.A03;
        O6G o6g = this.A04;
        String str4 = this.A00;
        C25621Ms A0M = AbstractC31177DnL.A0M(o6g.A00.A00);
        A0M.A0L("media/%s/user_pay_supporters/", str);
        A0M.A0P(null, N36.class, C54904OQb.class, true);
        A0M.A9s("sorting_type", str4);
        if (str3 != null) {
            A0M.A9s("cursor", str3);
        }
        if (str2 != null) {
            A0M.A9s("insights_id", str2);
        }
        c41761wQ.A02(AbstractC34046F0z.A00(A0M.A0N()), new PKD(c2gs, 6));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.2GT, X.2GS] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.2GT, X.2GS] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.Mqz] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, X.Mqz] */
    public OKz(O6G o6g) {
        this.A04 = o6g;
        ArrayList A1E = AbstractC166987dD.A1E();
        ?? obj = new Object();
        obj.A01 = A1E;
        obj.A00 = null;
        obj.A03 = false;
        obj.A02 = false;
        this.A01 = new C2GT(obj);
        ArrayList A1E2 = AbstractC166987dD.A1E();
        ?? obj2 = new Object();
        obj2.A01 = A1E2;
        obj2.A00 = null;
        obj2.A03 = false;
        obj2.A02 = false;
        this.A02 = new C2GT(obj2);
        this.A03 = AbstractC31173DnH.A0S();
    }
}
