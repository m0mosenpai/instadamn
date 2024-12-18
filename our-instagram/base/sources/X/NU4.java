package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.rtc.rsys.models.ParticipantModel;
import com.instagram.user.model.User;

/* loaded from: classes9.dex */
public final class NU4 extends AbstractC54988OTw {
    public int A00;
    public long A01;
    public C51876MwK A02;
    public C51879MwN A03;
    public java.util.Set A04;
    public boolean A05;
    public final UserSession A06;
    public final C54610OAl A07;
    public final O4S A08;
    public final OWf A09;
    public final C54451O4f A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC16820sZ A0C;
    public final InterfaceC16660sJ A0D;
    public final C05A A0E;
    public final C05A A0F;
    public final C05A A0G;

    public static final C51879MwN A02(NU4 nu4) {
        return new C51879MwN(A01(nu4, false, !AbstractC25231BEo.A1b(nu4.A0C)), AbstractC06930Yk.A0E(), AbstractC06930Yk.A0E(), 0L, false, false, false, false, false, false, false, false, false, false, false, false, false);
    }

    public static final C51879MwN A03(NU4 nu4) {
        return new C51879MwN(A01(nu4, true, !AbstractC25231BEo.A1b(nu4.A0C)), AbstractC06930Yk.A0E(), AbstractC06930Yk.A0E(), 0L, false, false, false, true, false, false, false, false, false, false, false, false, false);
    }

    public static final MUW A00(ImageUrl imageUrl, ParticipantModel participantModel, String str) {
        Integer num;
        int i = participantModel.state;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 6) {
                        if (i != 7) {
                            num = C05F.A0j;
                        } else {
                            num = C05F.A0Y;
                        }
                    } else {
                        num = C05F.A0N;
                    }
                } else {
                    num = C05F.A0C;
                }
            } else {
                num = C05F.A01;
            }
        } else {
            num = C05F.A00;
        }
        String str2 = participantModel.userId;
        C14360o3.A07(str2);
        return new MUW(imageUrl, num, str, str2, 17);
    }

    public static final C51876MwK A01(NU4 nu4, boolean z, boolean z2) {
        String id;
        User A01 = C17060sy.A01.A01(nu4.A06);
        Long BTC = A01.BTC();
        if (BTC != null && BTC.longValue() > 0) {
            id = MSY.A0g(A01);
        } else {
            id = A01.getId();
        }
        return new C51876MwK(A01.Bhu(), id, A01.getUsername(), A01.B8y(), z, z2, false, false);
    }

    public static final void A04(NU4 nu4, C51879MwN c51879MwN) {
        if (!C14360o3.A0K(nu4.A03, c51879MwN)) {
            nu4.A03 = c51879MwN;
            AbstractC54157Nwt.A00(c51879MwN, ((AbstractC54988OTw) nu4).A01, nu4.A0G);
        }
    }

    public NU4(UserSession userSession, C54610OAl c54610OAl, O4S o4s, C54446O4a c54446O4a, OWf oWf, C54451O4f c54451O4f, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        super(c54446O4a);
        this.A06 = userSession;
        this.A08 = o4s;
        this.A09 = oWf;
        this.A07 = c54610OAl;
        this.A0C = interfaceC16820sZ;
        this.A0D = interfaceC16660sJ;
        this.A0A = c54451O4f;
        this.A0G = C10E.A00(A02(this));
        C16910sj c16910sj = C16910sj.A00;
        this.A0E = C10E.A00(c16910sj);
        this.A0F = C10E.A00(A01(this, false, !AbstractC25231BEo.A1b(this.A0C)));
        this.A0B = C1XM.A00(C57548PgM.A01(this, 21));
        this.A03 = A02(this);
        this.A04 = c16910sj;
        this.A02 = A01(this, false, !AbstractC25231BEo.A1b(this.A0C));
    }
}
