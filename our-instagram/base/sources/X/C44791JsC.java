package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.JsC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44791JsC extends C3OO implements C7QD, C7QE, InterfaceC162937Re, C7BG {
    public C47349Kvy A00;
    public final ViewGroup A01;
    public final ViewGroup A02;
    public final ViewGroup A03;
    public final IgImageView A04;
    public final C7BF A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44791JsC(ViewGroup viewGroup, ViewGroup viewGroup2, ViewGroup viewGroup3, IgImageView igImageView, C7BF c7bf) {
        super(viewGroup);
        AbstractC25233BEq.A0x(3, viewGroup2, viewGroup3, igImageView);
        this.A05 = c7bf;
        this.A03 = viewGroup;
        this.A01 = viewGroup2;
        this.A02 = viewGroup3;
        this.A04 = igImageView;
    }

    @Override // X.C7BG
    public final void EZ4(C7Q8 c7q8) {
        C14360o3.A0B(c7q8, 0);
        this.A05.A00 = c7q8;
    }

    @Override // X.C7QD
    public final View BKF() {
        return this.A03;
    }

    @Override // X.C7QE
    public final C7QH BYl() {
        return this.A05.A01;
    }

    @Override // X.C7QE
    public final void EZu(C7QH c7qh) {
        this.A05.A01 = c7qh;
    }

    @Override // X.InterfaceC162937Re
    public final void F82(int i) {
        this.A05.F82(i);
    }
}
