package X;

import android.view.View;
import android.widget.SeekBar;

/* renamed from: X.IuQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42669IuQ implements C30B, C33Q, InterfaceC76043b9 {
    public C81303k0 A00;
    public C75113Zb A01;
    public C33P A02;
    public boolean A03;
    public final C6FG A04;
    public final C102884kP A05;
    public final AbstractC60592pi A06;
    public final InterfaceC60442pS A07;

    @Override // X.InterfaceC76053bA
    public final void DGZ(AbstractC39656Hil abstractC39656Hil) {
    }

    @Override // X.InterfaceC76043b9
    public final void DXy(C38321qM c38321qM, C3Y7 c3y7, C75113Zb c75113Zb, int i) {
    }

    @Override // X.C30B
    public final void DaS(C38321qM c38321qM, int i) {
    }

    @Override // X.InterfaceC76043b9
    public final void Dg6(View view, C38321qM c38321qM, int i) {
    }

    @Override // X.C30B
    public final void Dp2(C38321qM c38321qM, int i, int i2, int i3) {
        this.A03 = false;
        A00(this, this.A05.A0B(43));
        C75113Zb c75113Zb = this.A01;
        if (c75113Zb != null) {
            c75113Zb.A0E(i, c75113Zb.A03);
        }
    }

    @Override // X.C30B
    public final /* synthetic */ void DsL(C38321qM c38321qM, C3Y7 c3y7, C75113Zb c75113Zb) {
    }

    @Override // X.C33Q
    public final void Dyw() {
    }

    @Override // X.C30B
    public final void DzI(C38321qM c38321qM, String str) {
    }

    @Override // X.C30B
    public final void DzZ(C38321qM c38321qM, boolean z) {
    }

    @Override // X.C30B
    public final void E01(EnumC92424Bx enumC92424Bx, C38321qM c38321qM) {
    }

    public static void A00(C42669IuQ c42669IuQ, InterfaceC103384lE interfaceC103384lE) {
        if (interfaceC103384lE != null) {
            C6FP.A03(c42669IuQ.A04, c42669IuQ.A05, C6FW.A01, interfaceC103384lE);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.3hx, java.lang.Object] */
    @Override // X.C37M
    public final InterfaceC80083hx Ai8() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.3tf, java.lang.Object] */
    @Override // X.C37K
    public final InterfaceC86673tf ApH() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.39G, java.lang.Object] */
    @Override // X.AnonymousClass372
    public final C39G Ar3() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.3hr] */
    @Override // X.C37Y
    public final InterfaceC80023hr B5t() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.3jd] */
    @Override // X.C37Q
    public final InterfaceC81083jd BNt() {
        return new Object();
    }

    @Override // X.C37Q
    public final InterfaceC86223st BQy() {
        return new C42633Itq(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.3h2] */
    @Override // X.C37C
    public final C3h2 BRL() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.3hv, java.lang.Object] */
    @Override // X.C37D
    public final InterfaceC80063hv BRf() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.3t2, java.lang.Object] */
    @Override // X.InterfaceC686236z
    public final InterfaceC86303t2 BRj() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.3tG] */
    @Override // X.AnonymousClass374
    public final InterfaceC86433tG BRk() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.3hd, java.lang.Object] */
    @Override // X.AnonymousClass377
    public final InterfaceC79883hd BS5() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.38t, java.lang.Object] */
    @Override // X.InterfaceC687637n
    public final InterfaceC690738t BTh() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.SeekBar$OnSeekBarChangeListener, java.lang.Object] */
    @Override // X.C37N
    public final SeekBar.OnSeekBarChangeListener Bs2() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.39D, java.lang.Object] */
    @Override // X.C37V
    public final C39D CHG() {
        return new Object();
    }

    @Override // X.C33Q
    public final void DzB() {
        A00(this, this.A05.A0B(40));
    }

    @Override // X.C33Q
    public final void Dze(C38321qM c38321qM, C3Y7 c3y7, int i, int i2) {
        if (!this.A03) {
            this.A03 = true;
            A00(this, this.A05.A0B(42));
        }
    }

    public C42669IuQ(C6FG c6fg, C102884kP c102884kP, InterfaceC60442pS interfaceC60442pS) {
        this.A03 = false;
        this.A06 = new C37767Gji(this, 0);
        this.A05 = c102884kP;
        this.A04 = c6fg;
        this.A07 = interfaceC60442pS;
    }

    public C42669IuQ() {
    }
}
