package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.Ae9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23674Ae9 implements InterfaceC25177BCa {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ C5RP A01;
    public final /* synthetic */ C210949Ur A02;
    public final /* synthetic */ C148276lx A03;

    @Override // X.InterfaceC25177BCa
    public final void DZL() {
    }

    public C23674Ae9(Drawable drawable, C5RP c5rp, C210949Ur c210949Ur, C148276lx c148276lx) {
        this.A01 = c5rp;
        this.A02 = c210949Ur;
        this.A00 = drawable;
        this.A03 = c148276lx;
    }

    @Override // X.InterfaceC25177BCa
    public final void DQ0() {
        this.A01.EFh(this);
        C210949Ur c210949Ur = this.A02;
        AbstractC13880nE.A0q(c210949Ur.A03, new RunnableC24750AxY(this.A00, c210949Ur, this.A03));
    }
}
