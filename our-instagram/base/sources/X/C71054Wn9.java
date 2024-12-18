package X;

import android.app.Activity;
import com.facebook.R;

/* renamed from: X.Wn9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71054Wn9 implements InterfaceC86363t8 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C71054Wn9(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.InterfaceC86363t8
    public final /* synthetic */ void D5o() {
    }

    @Override // X.InterfaceC86363t8
    public final void DB6() {
        if (this.A00 == 0) {
            C6FQ c6fq = (C6FQ) this.A01;
            InterfaceC103384lE interfaceC103384lE = (InterfaceC103384lE) this.A02;
            C6FX c6fx = new C6FX();
            c6fx.A01(c6fq.A03);
            AbstractC25227BEk.A1M(c6fq, c6fx, interfaceC103384lE);
        }
    }

    @Override // X.InterfaceC86363t8
    public final /* synthetic */ void DId(Integer num) {
        if (this.A00 != 0) {
            Activity activity = (Activity) this.A02;
            AbstractC56402iY.A02(activity, AbstractC167007dF.A09(activity, R.attr.statusBarBackgroundColor));
            AbstractC56402iY.A06(activity, true);
        }
    }

    @Override // X.InterfaceC86363t8
    public final /* synthetic */ void DZk(int i, int i2) {
        if (this.A00 != 0) {
            Activity activity = (Activity) this.A02;
            AbstractC56402iY.A02(activity, 0);
            AbstractC56402iY.A06(activity, false);
        }
    }

    @Override // X.InterfaceC86363t8
    public final /* synthetic */ void CwQ(float f) {
    }

    @Override // X.InterfaceC86363t8
    public final /* synthetic */ void CwR(Integer num, float f) {
    }

    @Override // X.InterfaceC86363t8
    public final /* synthetic */ void D5p(Integer num) {
    }

    @Override // X.InterfaceC86363t8
    public final /* synthetic */ void Dyj(C51752Mtb c51752Mtb) {
    }
}
