package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.3eP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C77973eP extends AbstractC77583di {
    public static final C51532Yb A0A = new C51532Yb(C77603dk.A00, C77983eQ.A00, 5, true);
    public final int A00;
    public final int A01;
    public final int A02;
    public final InterfaceC11380iw A03;
    public final ImageUrl A04;
    public final C3PD A05;
    public final boolean A06;
    public final boolean A07;
    public final C51722Yv A08;
    public final boolean A09;

    public C77973eP(C51722Yv c51722Yv, InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, C3PD c3pd, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(imageUrl, 1);
        C14360o3.A0B(interfaceC11380iw, 3);
        this.A04 = imageUrl;
        this.A00 = i;
        this.A03 = interfaceC11380iw;
        this.A02 = i2;
        this.A01 = i3;
        this.A07 = z;
        this.A09 = z2;
        this.A06 = z3;
        this.A05 = c3pd;
        this.A08 = c51722Yv;
    }

    @Override // X.AbstractC77583di
    public final C78053eX A0Y(C77993eR c77993eR) {
        C14360o3.A0B(c77993eR, 0);
        if (this.A09) {
            C1OG A0J = C25821No.A00().A0J(this.A04, this.A03.getModuleName());
            A0J.A0I = true;
            A0J.A01();
        }
        return new C78053eX(this.A08, C78083ea.A00, new C2YP(A0A, C78093eb.A00, new C207179Ew(36, c77993eR, this), c77993eR.A01()));
    }
}
