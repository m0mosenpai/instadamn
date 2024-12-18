package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.2Yb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51532Yb implements InterfaceC50822Vd {
    public final int A00;
    public final C2V6 A01;
    public final InterfaceC51522Ya A02;
    public final Integer A03;
    public final boolean A04;

    public C51532Yb(C2V6 c2v6, InterfaceC51522Ya interfaceC51522Ya, int i, boolean z) {
        C14360o3.A0B(c2v6, 3);
        this.A00 = i;
        this.A04 = z;
        this.A01 = c2v6;
        this.A02 = interfaceC51522Ya;
        this.A03 = C05F.A01;
    }

    @Override // X.InterfaceC50822Vd
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final View ALq(Context context) {
        C14360o3.A0B(context, 0);
        return (View) this.A02.ABB(context);
    }

    @Override // X.InterfaceC50822Vd
    public final /* synthetic */ C2Wm D8D(int i) {
        return AbstractC79733hO.A00(this, i);
    }

    @Override // X.InterfaceC50822Vd
    public final boolean AFr() {
        return this.A04;
    }

    @Override // X.InterfaceC50822Vd
    public final Object BeR() {
        return this.A02.getClass();
    }

    @Override // X.InterfaceC50822Vd
    public final C2V6 BeU() {
        return this.A01;
    }

    @Override // X.InterfaceC50822Vd
    public final Integer Bmh() {
        return this.A03;
    }

    @Override // X.InterfaceC50822Vd
    public final int E4c() {
        return this.A00;
    }
}
