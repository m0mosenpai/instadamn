package X;

import java.util.HashMap;

/* renamed from: X.HGb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39025HGb extends C1P1 {
    public final C1P1 A00;

    public final void A00(H9U h9u) {
        C18920wW c18920wW;
        String str;
        String str2;
        String str3;
        C18920wW c18920wW2;
        String str4;
        String str5;
        String str6;
        if (this instanceof C39475Hc1) {
            C39475Hc1 c39475Hc1 = (C39475Hc1) this;
            if (h9u != null) {
                if (h9u.A00 == null) {
                    AbstractC31171DnF.A0w();
                    throw C00O.createAndThrow();
                }
                c18920wW2 = c39475Hc1.A00;
                str4 = c39475Hc1.A02;
                str5 = c39475Hc1.A01;
                AbstractC167027dH.A12(c18920wW2, str4, str5);
                str6 = "mutation_success_instagram_only";
            } else {
                c18920wW2 = c39475Hc1.A00;
                str4 = c39475Hc1.A02;
                str5 = c39475Hc1.A01;
                AbstractC167027dH.A12(c18920wW2, str4, str5);
                str6 = "mutation_fail_instagram_only";
            }
            C41684IdD.A00(c18920wW2, str4, str5, str6);
            return;
        }
        C39474Hc0 c39474Hc0 = (C39474Hc0) this;
        if (h9u != null) {
            C38622GyP c38622GyP = h9u.A00;
            if (c38622GyP == null) {
                AbstractC31171DnF.A0w();
                throw C00O.createAndThrow();
            }
            boolean A1P = AbstractC167007dF.A1P(c38622GyP.A01 ? 1 : 0, 1);
            HashMap hashMap = c38622GyP.A00;
            if (hashMap != null && AbstractC166997dE.A1Z(hashMap.get("FB"), true)) {
                if (A1P) {
                    c18920wW = c39474Hc0.A00;
                    str = c39474Hc0.A02;
                    str2 = c39474Hc0.A01;
                    C14360o3.A0B(c18920wW, 0);
                    AbstractC167007dF.A1D(str, 1, str2);
                    str3 = "mutation_success_both";
                } else {
                    return;
                }
            } else if (A1P) {
                c18920wW = c39474Hc0.A00;
                str = c39474Hc0.A02;
                str2 = c39474Hc0.A01;
                C14360o3.A0B(c18920wW, 0);
                AbstractC167007dF.A1D(str, 1, str2);
                str3 = "mutation_fail_facebook_only";
            }
            C41684IdD.A00(c18920wW, str, str2, str3);
        }
        c18920wW = c39474Hc0.A00;
        str = c39474Hc0.A02;
        str2 = c39474Hc0.A01;
        AbstractC167027dH.A12(c18920wW, str, str2);
        str3 = "mutation_fail_both";
        C41684IdD.A00(c18920wW, str, str2, str3);
    }

    public AbstractC39025HGb(C1P1 c1p1) {
        this.A00 = c1p1;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -1744628563);
        C1P1 c1p1 = this.A00;
        if (c1p1 != null) {
            c1p1.onFail(abstractC115105If);
        }
        C0f9.A0A(-1877725371, A0N);
    }

    @Override // X.C1P1
    public final void onFailInBackground(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 109344693);
        A00((H9U) abstractC115105If.A00());
        C1P1 c1p1 = this.A00;
        if (c1p1 != null) {
            c1p1.onFailInBackground(abstractC115105If);
        }
        C0f9.A0A(-1229030608, A0N);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-1063453639);
        C1P1 c1p1 = this.A00;
        if (c1p1 != null) {
            c1p1.onFinish();
        }
        C0f9.A0A(-765423945, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-1473931779);
        C1P1 c1p1 = this.A00;
        if (c1p1 != null) {
            c1p1.onStart();
        }
        C0f9.A0A(-1368367227, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1672381386);
        int A0N = AbstractC167017dG.A0N(obj, 1091590520);
        C1P1 c1p1 = this.A00;
        if (c1p1 != null) {
            c1p1.onSuccess(obj);
        }
        C0f9.A0A(-102075554, A0N);
        C0f9.A0A(-1069194958, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(171054826);
        H9U h9u = (H9U) obj;
        int A0N = AbstractC167017dG.A0N(h9u, -1084403144);
        A00(h9u);
        C1P1 c1p1 = this.A00;
        if (c1p1 != null) {
            c1p1.onSuccessInBackground(h9u);
        }
        C0f9.A0A(506401421, A0N);
        C0f9.A0A(8412982, A03);
    }
}
