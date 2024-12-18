package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.Bns, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26533Bns extends AbstractC51572Yf {
    public final InterfaceC16820sZ A00;
    public final FragmentActivity A01;
    public final C62862tP A02;
    public final UserSession A03;
    public final C39G A04;
    public final InterfaceC686136y A05;
    public final InterfaceC75403a7 A06;
    public final InterfaceC60442pS A07;
    public final InterfaceC75453aC A08;
    public final InterfaceC76043b9 A09;
    public final InterfaceC76323bc A0A;
    public final InterfaceC75543aL A0B;
    public final C39D A0C;
    public final C30E A0D;
    public final InterfaceC60682pr A0E;
    public final String A0F;
    public final String A0G;
    public final InterfaceC16820sZ A0H;
    public final boolean A0I;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        Object invoke = this.A0H.invoke();
        C2XE c2xe = c76223bS.A05;
        ArrayList A1E = AbstractC166987dD.A1E();
        C14360o3.A0B(c2xe, 1);
        DGY dgy = new DGY(invoke, 4);
        DGY dgy2 = new DGY(this, 5);
        FragmentActivity fragmentActivity = this.A01;
        UserSession userSession = this.A03;
        InterfaceC60442pS interfaceC60442pS = this.A07;
        InterfaceC75453aC interfaceC75453aC = this.A08;
        InterfaceC75543aL interfaceC75543aL = this.A0B;
        InterfaceC75403a7 interfaceC75403a7 = this.A06;
        boolean z = this.A0I;
        A1E.add(new C75943az(fragmentActivity, C51722Yv.A02, userSession, interfaceC75403a7, interfaceC60442pS, interfaceC75453aC, interfaceC75543aL, this.A0F, this.A0G, dgy, dgy2, z));
        InterfaceC76323bc interfaceC76323bc = this.A0A;
        InterfaceC76043b9 interfaceC76043b9 = this.A09;
        A1E.add(new C76343be(new C9BW(interfaceC75403a7, EnumC65592xv.A0n), null, this.A02, userSession, this.A04, interfaceC60442pS, interfaceC76043b9, interfaceC76323bc, this.A0C, this.A0D, this.A0E, new DGY(invoke, 6), z, false));
        A1E.add(new C89353yb(userSession, this.A05, interfaceC60442pS, new DGY(invoke, 7)));
        return new C2WF(null, null, null, A1E, false);
    }

    public C26533Bns(FragmentActivity fragmentActivity, C62862tP c62862tP, UserSession userSession, C39G c39g, InterfaceC686136y interfaceC686136y, InterfaceC75403a7 interfaceC75403a7, InterfaceC60442pS interfaceC60442pS, InterfaceC75453aC interfaceC75453aC, InterfaceC76043b9 interfaceC76043b9, InterfaceC76323bc interfaceC76323bc, InterfaceC75543aL interfaceC75543aL, C39D c39d, C30E c30e, InterfaceC60682pr interfaceC60682pr, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, boolean z) {
        C14360o3.A0B(userSession, 5);
        AbstractC167017dG.A1U(interfaceC60442pS, interfaceC76043b9);
        AbstractC25234BEr.A0l(8, interfaceC75453aC, interfaceC75543aL, c39d, interfaceC75403a7);
        AbstractC25229BEm.A1P(c39g, 15, c30e);
        C14360o3.A0B(interfaceC686136y, 18);
        C14360o3.A0B(interfaceC60682pr, 19);
        this.A0H = interfaceC16820sZ;
        this.A00 = interfaceC16820sZ2;
        this.A0A = interfaceC76323bc;
        this.A01 = fragmentActivity;
        this.A03 = userSession;
        this.A07 = interfaceC60442pS;
        this.A09 = interfaceC76043b9;
        this.A08 = interfaceC75453aC;
        this.A0B = interfaceC75543aL;
        this.A0C = c39d;
        this.A06 = interfaceC75403a7;
        this.A0I = z;
        this.A0F = str;
        this.A0G = "";
        this.A04 = c39g;
        this.A0D = c30e;
        this.A02 = c62862tP;
        this.A05 = interfaceC686136y;
        this.A0E = interfaceC60682pr;
    }
}
