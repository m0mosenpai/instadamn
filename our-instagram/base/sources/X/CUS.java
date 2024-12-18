package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes5.dex */
public final class CUS {
    public final Context A00;
    public final C62862tP A01;
    public final UserSession A02;
    public final C39G A03;
    public final InterfaceC60442pS A04;
    public final InterfaceC76043b9 A05;
    public final AnonymousClass399 A06;
    public final C39D A07;
    public final C33P A08;
    public final C30E A09;
    public final InterfaceC60682pr A0A;
    public final boolean A0B;
    public final CP2 A0C;
    public final C3VU A0D;
    public final C41V A0E;
    public final C57332k8 A0F;
    public final C33P A0G;

    public final AbstractC50812Vc A00(C41H c41h, C38321qM c38321qM, C79293ga c79293ga, C75113Zb c75113Zb, List list, int i) {
        C14360o3.A0B(c38321qM, 0);
        AbstractC167017dG.A1Q(c75113Zb, c79293ga);
        UserSession userSession = this.A02;
        if (C18U.A06(C06090Tz.A05, userSession, 2342166337911467176L)) {
            EnumC40111tc BRp = c38321qM.BRp();
            CP2 cp2 = this.A0C;
            boolean A00 = AbstractC905141m.A00(userSession, c38321qM, BRp);
            HashMap hashMap = cp2.A00;
            Integer valueOf = Integer.valueOf(i);
            C42644Iu1 c42644Iu1 = (C42644Iu1) hashMap.get(valueOf);
            if (c42644Iu1 == null) {
                c42644Iu1 = new C42644Iu1(userSession, c75113Zb, A00);
            }
            hashMap.put(valueOf, c42644Iu1);
            C75933ay c75933ay = C51722Yv.A02;
            C76623c7 A1a = c38321qM.A1a();
            InterfaceC60442pS interfaceC60442pS = this.A04;
            C51722Yv A002 = AbstractC77823e9.A00(EnumC71343Hv.A08, c75933ay, userSession, A1a, interfaceC60442pS, null, false, false);
            if (AbstractC905141m.A00(userSession, c38321qM, BRp)) {
                C38321qM c38321qM2 = c41h.A0C;
                boolean z = this.A0B;
                C41V c41v = this.A0E;
                int i2 = c41h.A03;
                return new C26623BpK(A002, interfaceC60442pS, userSession, c42644Iu1, this.A0D, c41v, c38321qM2, interfaceC60442pS, c75113Zb, this.A0F, this.A0G, i, i2, z);
            }
            return new C26621BpI(A002, userSession, this.A0D.Am6(), c42644Iu1, c41h.A0C, interfaceC60442pS, c75113Zb, this.A0F, list, c41h.A03, i, this.A0B);
        }
        C33P c33p = this.A08;
        Context context = this.A00;
        InterfaceC60442pS interfaceC60442pS2 = this.A04;
        J7K j7k = new J7K(c79293ga.A00(context, c38321qM, interfaceC60442pS2, c75113Zb, c33p), 42);
        C29289Cvk c29289Cvk = new C29289Cvk(this.A06, 0);
        C30E c30e = this.A09;
        InterfaceC76043b9 interfaceC76043b9 = this.A05;
        return new C76343be(null, null, this.A01, userSession, this.A03, interfaceC60442pS2, interfaceC76043b9, c29289Cvk, this.A07, c30e, this.A0A, j7k, this.A0B, false);
    }

    public CUS(Context context, C62862tP c62862tP, UserSession userSession, C39G c39g, CP2 cp2, C3VU c3vu, C41V c41v, InterfaceC60442pS interfaceC60442pS, InterfaceC76043b9 interfaceC76043b9, AnonymousClass399 anonymousClass399, C39D c39d, C57332k8 c57332k8, C33P c33p, C33P c33p2, C30E c30e, InterfaceC60682pr interfaceC60682pr, boolean z) {
        AbstractC25234BEr.A1R(userSession, interfaceC60442pS, cp2, anonymousClass399, c33p);
        AbstractC167007dF.A1J(c41v, 7, c57332k8);
        C14360o3.A0B(interfaceC76043b9, 11);
        AbstractC25234BEr.A1Q(c33p2, c30e, c39g);
        C14360o3.A0B(c39d, 15);
        C14360o3.A0B(interfaceC60682pr, 18);
        this.A00 = context;
        this.A02 = userSession;
        this.A04 = interfaceC60442pS;
        this.A0C = cp2;
        this.A06 = anonymousClass399;
        this.A0G = c33p;
        this.A0E = c41v;
        this.A0B = z;
        this.A0F = c57332k8;
        this.A0D = c3vu;
        this.A05 = interfaceC76043b9;
        this.A08 = c33p2;
        this.A09 = c30e;
        this.A03 = c39g;
        this.A07 = c39d;
        this.A01 = c62862tP;
        this.A0A = interfaceC60682pr;
    }
}
