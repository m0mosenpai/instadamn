package X;

/* renamed from: X.Wkq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70944Wkq implements GZD {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C70944Wkq(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj;
        this.A02 = obj3;
        this.A01 = obj2;
    }

    @Override // X.GZD
    public final void onSearchCleared(String str) {
        if (this.A00 != 0) {
            Ut4 ut4 = (Ut4) this.A02;
            Object obj = this.A01;
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.facebook.rendercore.simplelist.ListLayoutData<com.instagram.common.bloks.component.base.BloksModel>");
            WXq.A00((U44) obj, ut4, "");
        }
    }

    @Override // X.GZD
    public final void onSearchTextChanged(String str) {
        if (this.A00 != 0) {
            C14360o3.A0B(str, 0);
            Ut4 ut4 = (Ut4) this.A02;
            Object obj = this.A01;
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.facebook.rendercore.simplelist.ListLayoutData<com.instagram.common.bloks.component.base.BloksModel>");
            WXq.A00((U44) obj, ut4, str);
            return;
        }
        C14360o3.A0B(str, 0);
        ((C46501Ki0) this.A03).A02 = str;
        C102884kP c102884kP = (C102884kP) this.A02;
        InterfaceC103384lE A0B = c102884kP.A0B(40);
        if (A0B == null) {
            return;
        }
        C6FX c6fx = new C6FX();
        c6fx.A03(c102884kP, 0);
        String A01 = AbstractC13670mt.A01(str);
        if (A01 != null) {
            c6fx.A02(A01);
            C6FG c6fg = (C6FG) this.A01;
            c6fx.A03(c6fg, 2);
            AbstractC65702TsY.A1Q(c6fg, c102884kP, c6fx, A0B);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
