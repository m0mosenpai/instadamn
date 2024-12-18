package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.Bpj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26648Bpj extends AbstractC77583di {
    public static final C51532Yb A0F = AbstractC25227BEk.A0d(C29020Cr9.A00, 5, false);
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final InterfaceC11380iw A05;
    public final UserSession A06;
    public final C38321qM A07;
    public final String A08;
    public final HashMap A09;
    public final HashMap A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final C51722Yv A0E;

    public C26648Bpj(C51722Yv c51722Yv, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, String str, HashMap hashMap, HashMap hashMap2, float f, int i, int i2, int i3, boolean z, boolean z2) {
        AbstractC167017dG.A1R(hashMap, hashMap2);
        C14360o3.A0B(interfaceC11380iw, 6);
        this.A07 = c38321qM;
        this.A09 = hashMap;
        this.A0A = hashMap2;
        this.A04 = i;
        this.A08 = str;
        this.A05 = interfaceC11380iw;
        this.A0D = true;
        this.A02 = 32;
        this.A03 = i2;
        this.A01 = i3;
        this.A00 = f;
        this.A0C = z;
        this.A0B = z2;
        this.A06 = userSession;
        this.A0E = c51722Yv;
    }

    @Override // X.AbstractC77583di
    public final C78053eX A0Y(C77993eR c77993eR) {
        C14360o3.A0B(c77993eR, 0);
        return AbstractC25225BEi.A0g(this.A0E, new C2YW(0, 0), AbstractC25229BEm.A0c(c77993eR, A0F, C29882DFw.A00, DRY.A00(this, c77993eR, 18)));
    }
}
