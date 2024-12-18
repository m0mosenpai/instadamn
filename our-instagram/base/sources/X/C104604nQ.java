package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4nQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C104604nQ extends AbstractC51572Yf {
    public final long A00;
    public final InterfaceC16820sZ A01;
    public final C51722Yv A02;
    public final UserSession A03;
    public final C75113Zb A04;
    public final C80223iB A05;
    public final InterfaceC16820sZ A06;
    public final boolean A07;
    public final boolean A08;

    public C104604nQ(C51722Yv c51722Yv, UserSession userSession, C75113Zb c75113Zb, C80223iB c80223iB, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, long j, boolean z, boolean z2) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(c75113Zb, 2);
        C14360o3.A0B(c80223iB, 3);
        C14360o3.A0B(userSession, 4);
        C14360o3.A0B(str2, 10);
        this.A04 = c75113Zb;
        this.A05 = c80223iB;
        this.A03 = userSession;
        this.A08 = z;
        this.A00 = j;
        this.A06 = interfaceC16820sZ;
        this.A07 = z2;
        this.A01 = interfaceC16820sZ2;
        this.A02 = c51722Yv;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C51722Yv c51722Yv;
        List list;
        C14360o3.A0B(c76223bS, 0);
        C75113Zb c75113Zb = this.A04;
        C51762Yz A01 = AbstractC77273dD.A01(c76223bS, c75113Zb, C104624nS.A00, 58, false);
        C77123cy A00 = AbstractC77063cs.A00(c76223bS, C104634nT.A00);
        C51722Yv c51722Yv2 = this.A02;
        boolean z = this.A08;
        C51722Yv c51722Yv3 = C51722Yv.A02;
        if (z) {
            c51722Yv = new C51722Yv(new C51722Yv(null, new C77863eE(C05F.A00, new C9FO(36, this, A00, A01), "media_tags_timer_setup")), new C77863eE(C05F.A01, new C206849Dp(A00, 45), null));
        } else {
            c51722Yv = c51722Yv3;
        }
        C51722Yv A002 = c51722Yv2.A00(c51722Yv);
        C2Z0 c2z0 = new C2Z0(c76223bS.A05, new ArrayList());
        if (((Boolean) A01.A03).booleanValue()) {
            list = (List) this.A06.invoke();
        } else {
            list = C16930sl.A00;
        }
        C80223iB c80223iB = this.A05;
        boolean z2 = this.A07;
        UserSession userSession = this.A03;
        if (z) {
            c51722Yv3 = new C51722Yv(null, new C77863eE(C05F.A00, new C206849Dp(this, 46), "media_tags"));
        }
        c2z0.A00(new C104644nU(c51722Yv3, userSession, c75113Zb, c80223iB, list, z2));
        return AbstractC76963ci.A0J(c2z0, c76223bS, A002, null, null, null, null, null, false);
    }
}
