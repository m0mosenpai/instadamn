package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.RealtimeClientManager;
import java.util.List;

/* renamed from: X.1bg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29651bg implements InterfaceC29301b7 {
    public static final C0KV A03 = new C0KV() { // from class: X.1bi
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A032 = C0f9.A03(-517364429);
            int A033 = C0f9.A03(-276063982);
            C29651bg c29651bg = new C29651bg(userSession, AbstractC28761aE.A00(userSession));
            C0f9.A0A(585740635, A033);
            C0f9.A0A(-59115245, A032);
            return c29651bg;
        }
    };
    public final UserSession A00;
    public final C2DS A01;
    public final InterfaceC09390do A02;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return LCX.A01(mnp, (AbstractC29011ae) c1ow, this.A01);
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        String str;
        String str2;
        Integer num;
        Long l;
        C29631be c29631be = (C29631be) c1ow;
        List C7R = c29631be.C7R();
        boolean z = true;
        if (C7R.size() != 1) {
            z = false;
        }
        C18C.A0E(z);
        DirectThreadKey directThreadKey = (DirectThreadKey) C7R.get(0);
        UserSession userSession = this.A00;
        if (AbstractC159387Cy.A00(userSession, c29631be, directThreadKey).A00()) {
            C47753L6x c47753L6x = (C47753L6x) this.A02.getValue();
            C14360o3.A0B(interfaceC37261GbE, 1);
            c47753L6x.A00(interfaceC37261GbE, c29631be);
            num = C05F.A0C;
        } else {
            String A06 = c29631be.A06();
            String str3 = c29631be.A05;
            JTa jTa = ((C1OW) c29631be).A02;
            boolean z2 = jTa.A09;
            String str4 = jTa.A04;
            C47588Kzy c47588Kzy = c29631be.A00;
            if (c47588Kzy != null) {
                str = c47588Kzy.A01;
                str2 = c47588Kzy.A00;
            } else {
                str = null;
                str2 = null;
            }
            C31281Dp3 c31281Dp3 = new C31281Dp3(interfaceC37261GbE, null);
            if (directThreadKey.A00 != null) {
                C14360o3.A0B(userSession, 0);
                if (RealtimeClientManager.getInstance(userSession).isMqttConnected()) {
                    String str5 = directThreadKey.A00;
                    JTa jTa2 = ((C1OW) c29631be).A02;
                    L1W l1w = jTa2.A00;
                    boolean z3 = jTa2.A07;
                    boolean z4 = jTa2.A0A;
                    C14360o3.A0B(str5, 1);
                    String BdA = AbstractC11060iN.A00(userSession).BdA();
                    C2EY c2ey = C2EY.A18;
                    Long l2 = null;
                    if (l1w != null) {
                        l = l1w.A01;
                        l2 = l1w.A02;
                    } else {
                        l = null;
                    }
                    AbstractC47886LDg.A00(userSession, new LGH(null, null, null, c2ey, Boolean.valueOf(z4), null, null, null, null, null, null, null, l, l2, null, BdA, str5, "send_item", null, null, null, A06, null, str3, str4, null, null, null, null, null, null, null, str, str2, null, null, null, null, null, null, null, null, null, null, null, z2, z3), c31281Dp3);
                    num = C05F.A01;
                }
            }
            JTa jTa3 = ((C1OW) c29631be).A02;
            L1W l1w2 = jTa3.A00;
            boolean z5 = jTa3.A07;
            boolean z6 = jTa3.A0A;
            C25621Ms c25621Ms = new C25621Ms(userSession);
            c25621Ms.A05();
            c25621Ms.A0B(new StringBuilder(AnonymousClass001.A0g("direct_v2/threads/broadcast/", C2EY.A18.A00, "/")).toString());
            c25621Ms.A0S(C32207EDg.class, C34793FUv.class);
            AbstractC47995LLh.A0D(c25621Ms, l1w2, directThreadKey, A06, str3, str4, z2, z5, z6);
            AbstractC47995LLh.A0E(c25621Ms, str, str2);
            C1ON A0N = c25621Ms.A0N();
            A0N.A00 = new EE4(userSession, c31281Dp3);
            C1GJ.A03(A0N);
            num = C05F.A00;
        }
        C162337Ov.A0Y(c19260xA, num);
    }

    public C29651bg(final UserSession userSession, C2DS c2ds) {
        this.A00 = userSession;
        this.A01 = c2ds;
        this.A02 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.M8q
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return new C47753L6x(UserSession.this);
            }
        });
    }
}
