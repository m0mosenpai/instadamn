package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.BJj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25340BJj extends AbstractC65902yS {
    public final Context A00;
    public final InterfaceC09390do A01;
    public final C62862tP A02;
    public final UserSession A03;
    public final C39G A04;
    public final C3VU A05;
    public final InterfaceC75403a7 A06;
    public final InterfaceC60442pS A07;
    public final InterfaceC76043b9 A08;
    public final AnonymousClass399 A09;
    public final C39D A0A;
    public final C57332k8 A0B;
    public final C33P A0C;
    public final C33P A0D;
    public final C30E A0E;
    public final InterfaceC60682pr A0F;
    public final boolean A0G;
    public final boolean A0H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25340BJj(Context context, C07X c07x, C62862tP c62862tP, UserSession userSession, C3VU c3vu, InterfaceC75403a7 interfaceC75403a7, InterfaceC60442pS interfaceC60442pS, InterfaceC76043b9 interfaceC76043b9, AnonymousClass399 anonymousClass399, C39D c39d, C57332k8 c57332k8, C33P c33p, C33P c33p2, C30E c30e, InterfaceC60682pr interfaceC60682pr, boolean z, boolean z2) {
        super(context, c07x, userSession, null, DO6.A00, null, 216);
        AbstractC167017dG.A1U(c30e, anonymousClass399);
        AbstractC167007dF.A1J(interfaceC76043b9, 8, c39d);
        C14360o3.A0B(c3vu, 12);
        AbstractC25229BEm.A1O(interfaceC75403a7, 14, interfaceC60682pr);
        this.A00 = context;
        this.A03 = userSession;
        this.A07 = interfaceC60442pS;
        this.A0G = z;
        this.A0D = c33p;
        this.A0E = c30e;
        this.A09 = anonymousClass399;
        this.A08 = interfaceC76043b9;
        this.A0A = c39d;
        this.A02 = c62862tP;
        this.A0B = c57332k8;
        this.A05 = c3vu;
        this.A0C = c33p2;
        this.A06 = interfaceC75403a7;
        this.A0F = interfaceC60682pr;
        this.A0H = z2;
        this.A04 = interfaceC76043b9.Ar3();
        this.A01 = AbstractC09440dt.A01(new J7K(this, 43));
    }

    @Override // X.AbstractC65902yS
    public final int A01() {
        return AbstractC167027dH.A01(this.A01);
    }

    @Override // X.AbstractC65902yS
    public final AbstractC50812Vc A02(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        AbstractC167017dG.A1N(interfaceC16820sZ, interfaceC16820sZ2);
        C33P c33p = this.A0D;
        C30E c30e = this.A0E;
        AnonymousClass399 anonymousClass399 = this.A09;
        InterfaceC76043b9 interfaceC76043b9 = this.A08;
        C39G c39g = this.A04;
        C39D c39d = this.A0A;
        UserSession userSession = this.A03;
        InterfaceC60442pS interfaceC60442pS = this.A07;
        boolean z = this.A0G;
        C62862tP c62862tP = this.A02;
        C33P c33p2 = this.A0C;
        return new C26532Bnr(c62862tP, userSession, c39g, new CP2(), this.A05, this.A06, interfaceC60442pS, interfaceC76043b9, anonymousClass399, c39d, this.A0B, c33p, c33p2, c30e, this.A0F, interfaceC16820sZ, interfaceC16820sZ2, z, this.A0H);
    }

    @Override // X.AbstractC65902yS
    public final String A04() {
        return "LITHO_CAROUSEL_CONTENT";
    }
}
