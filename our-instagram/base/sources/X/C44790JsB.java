package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.JsB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44790JsB extends C3OO implements C7QD, C7QE, InterfaceC162937Re, C7BG {
    public final ViewGroup A00;
    public final ViewGroup A01;
    public final ViewGroup A02;
    public final C7BF A03;

    @Override // X.C7QD
    public final View BKF() {
        return this.A02;
    }

    @Override // X.C7QE
    public final C7QH BYl() {
        return this.A03.A01;
    }

    @Override // X.C7BG
    public final void EZ4(C7Q8 c7q8) {
        this.A03.EZ4(c7q8);
    }

    @Override // X.C7QE
    public final void EZu(C7QH c7qh) {
        this.A03.A01 = c7qh;
    }

    @Override // X.InterfaceC162937Re
    public final void F82(int i) {
        this.A03.F82(i);
    }

    public C44790JsB(ViewGroup viewGroup, ViewGroup viewGroup2, ViewGroup viewGroup3, C7BF c7bf) {
        super(viewGroup);
        this.A03 = c7bf;
        this.A02 = viewGroup;
        this.A00 = viewGroup2;
        this.A01 = viewGroup3;
    }
}
