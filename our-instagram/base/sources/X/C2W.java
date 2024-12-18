package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class C2W extends AbstractC65902yS {
    public final InterfaceC09390do A00;
    public final FragmentActivity A01;
    public final C62862tP A02;
    public final UserSession A03;
    public final C39G A04;
    public final InterfaceC686136y A05;
    public final InterfaceC75403a7 A06;
    public final InterfaceC60442pS A07;
    public final InterfaceC75453aC A08;
    public final InterfaceC76043b9 A09;
    public final AnonymousClass399 A0A;
    public final InterfaceC75543aL A0B;
    public final C39D A0C;
    public final C30E A0D;
    public final InterfaceC60682pr A0E;
    public final String A0F;
    public final boolean A0G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2W(Context context, FragmentActivity fragmentActivity, C07X c07x, C62862tP c62862tP, UserSession userSession, InterfaceC686136y interfaceC686136y, InterfaceC60442pS interfaceC60442pS, InterfaceC75453aC interfaceC75453aC, InterfaceC76043b9 interfaceC76043b9, AnonymousClass399 anonymousClass399, InterfaceC75543aL interfaceC75543aL, C39D c39d, C30E c30e, InterfaceC60682pr interfaceC60682pr, String str, boolean z) {
        super(context, c07x, userSession, null, DO8.A00, new DRQ(anonymousClass399, 29), 152);
        C14360o3.A0B(interfaceC76043b9, 7);
        AbstractC167007dF.A1J(interfaceC75453aC, 8, interfaceC75543aL);
        C14360o3.A0B(c39d, 10);
        AbstractC25229BEm.A1M(anonymousClass399, 12, c30e);
        C14360o3.A0B(interfaceC60682pr, 16);
        this.A01 = fragmentActivity;
        this.A03 = userSession;
        this.A07 = interfaceC60442pS;
        this.A0G = z;
        this.A09 = interfaceC76043b9;
        this.A08 = interfaceC75453aC;
        this.A0B = interfaceC75543aL;
        this.A0C = c39d;
        this.A0F = str;
        this.A0A = anonymousClass399;
        this.A0D = c30e;
        this.A02 = c62862tP;
        this.A05 = interfaceC686136y;
        this.A0E = interfaceC60682pr;
        this.A04 = interfaceC76043b9.Ar3();
        this.A06 = interfaceC686136y.BS6();
        this.A00 = DGY.A00(context, 8);
    }

    @Override // X.AbstractC65902yS
    public final int A01() {
        return AbstractC167027dH.A01(this.A00);
    }

    @Override // X.AbstractC65902yS
    public final AbstractC50812Vc A02(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        C29289Cvk c29289Cvk = new C29289Cvk(this.A0A, AbstractC167017dG.A1a(interfaceC16820sZ, interfaceC16820sZ2) ? 1 : 0);
        FragmentActivity fragmentActivity = this.A01;
        UserSession userSession = this.A03;
        InterfaceC60442pS interfaceC60442pS = this.A07;
        InterfaceC76043b9 interfaceC76043b9 = this.A09;
        InterfaceC75453aC interfaceC75453aC = this.A08;
        InterfaceC75543aL interfaceC75543aL = this.A0B;
        C39D c39d = this.A0C;
        InterfaceC75403a7 interfaceC75403a7 = this.A06;
        boolean z = this.A0G;
        String str = this.A0F;
        return new C26533Bns(fragmentActivity, this.A02, userSession, this.A04, this.A05, interfaceC75403a7, interfaceC60442pS, interfaceC75453aC, interfaceC76043b9, c29289Cvk, interfaceC75543aL, c39d, this.A0D, this.A0E, str, interfaceC16820sZ, interfaceC16820sZ2, z);
    }

    @Override // X.AbstractC65902yS
    public final String A04() {
        return "LITHO_COALESCED_MEDIA";
    }
}
