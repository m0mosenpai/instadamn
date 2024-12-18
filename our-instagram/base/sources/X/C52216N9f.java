package X;

import android.content.Context;

/* renamed from: X.N9f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52216N9f extends C1P1 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ OEK A01;
    public final /* synthetic */ boolean A02;

    public C52216N9f(Context context, OEK oek, boolean z) {
        this.A01 = oek;
        this.A00 = context;
        this.A02 = z;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-609504905);
        C14360o3.A0B(abstractC115105If, 0);
        super.onFail(abstractC115105If);
        OEK oek = this.A01;
        C38321qM c38321qM = oek.A02;
        C79923hh.A04(this.A00, c38321qM, 2131974293);
        EnumC76753cN enumC76753cN = EnumC76753cN.A04;
        c38321qM.A4H(enumC76753cN);
        C79923hh.A06(oek, enumC76753cN, false);
        C0f9.A0A(-826370781, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int A03 = C0f9.A03(-891655096);
        int A0N = AbstractC167017dG.A0N(obj, 1761183877);
        super.onSuccess(obj);
        OEK oek = this.A01;
        C38321qM c38321qM = oek.A02;
        EnumC76753cN enumC76753cN = EnumC76753cN.A05;
        c38321qM.A4H(enumC76753cN);
        oek.A01.Dlm(enumC76753cN);
        Context context = this.A00;
        Integer num = oek.A03;
        boolean z = this.A02;
        Integer num2 = C05F.A00;
        if (z) {
            i = 2131972007;
            if (num == num2) {
                i = 2131972008;
            }
        } else {
            i = 2131972009;
            if (num == num2) {
                i = 2131972010;
            }
        }
        C79923hh.A04(context, c38321qM, i);
        C0f9.A0A(-1703033369, A0N);
        C0f9.A0A(1628370861, A03);
    }
}
