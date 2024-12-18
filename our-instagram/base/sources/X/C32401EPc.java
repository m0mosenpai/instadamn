package X;

import android.content.Context;

/* renamed from: X.EPc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32401EPc extends C7E1 {
    public final FR0 A00;
    public final FR0 A01;
    public final FR0 A02;
    public final java.util.Set A03;
    public final Context A04;
    public final C32426EQb A05;
    public final EQP A06;
    public final ES2 A07;

    /* JADX WARN: Type inference failed for: r2v0, types: [X.EQP, X.2xz, java.lang.Object] */
    public C32401EPc(Context context, EKJ ekj, EKJ ekj2) {
        this.A04 = context;
        C32426EQb c32426EQb = new C32426EQb(ekj);
        this.A05 = c32426EQb;
        ?? obj = new Object();
        obj.A00 = ekj2;
        this.A06 = obj;
        ES2 es2 = new ES2(context);
        this.A07 = es2;
        this.A03 = AbstractC166987dD.A1H();
        A0A(AbstractC166987dD.A1F(AbstractC16960so.A1Q(c32426EQb, obj, es2)));
        String A0p = AbstractC166997dE.A0p(context, 2131972452);
        String A02 = AbstractC63260SgI.A02(context, MSV.A00(97));
        C14360o3.A07(A02);
        this.A02 = new FR0(A0p, A02);
        String A0p2 = AbstractC166997dE.A0p(context, 2131972449);
        String A022 = AbstractC63260SgI.A02(context, MSV.A00(31));
        C14360o3.A07(A022);
        this.A01 = new FR0(A0p2, A022);
        this.A00 = new FR0(AbstractC166997dE.A0p(context, 2131972451), "https://help.instagram.com/626057554667531");
    }

    public final void A0C() {
        A06();
        String string = this.A04.getString(2131952547);
        java.util.Set set = this.A03;
        A09(this.A05, string, Boolean.valueOf(AbstractC167007dF.A1P(set.size(), 3)));
        A08(this.A07, MZV.FULL_WIDTH);
        FR0 fr0 = this.A02;
        Boolean valueOf = Boolean.valueOf(set.contains(fr0));
        EQP eqp = this.A06;
        A09(eqp, fr0, valueOf);
        FR0 fr02 = this.A01;
        A09(eqp, fr02, Boolean.valueOf(set.contains(fr02)));
        FR0 fr03 = this.A00;
        A09(eqp, fr03, Boolean.valueOf(set.contains(fr03)));
        A07();
    }
}
