package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.MfP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50956MfP extends AbstractC52922bZ {
    public final int A00;
    public final long A01;
    public final UserSession A02;
    public final ImageUrl A03;
    public final OMD A04;
    public final P4W A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final InterfaceC24731Iq A09;
    public final InterfaceC19390xP A0A;

    public C50956MfP(C152406tQ c152406tQ, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        AbstractC167017dG.A1P(userSession, interfaceC11380iw);
        this.A02 = userSession;
        this.A04 = new OMD(userSession);
        Object A00 = c152406tQ.A00("args_entry_point");
        if (A00 != null) {
            String str = (String) A00;
            this.A08 = str;
            Object A002 = c152406tQ.A00("args_business_igid");
            if (A002 != null) {
                String str2 = (String) A002;
                this.A06 = str2;
                long A0t = AbstractC25232BEp.A0t((Number) c152406tQ.A00("args_business_fbid_v2"));
                this.A01 = A0t;
                Object A003 = c152406tQ.A00("args_business_username");
                if (A003 != null) {
                    this.A07 = (String) A003;
                    Object A004 = c152406tQ.A00("args_business_profile_pic");
                    if (A004 != null) {
                        this.A03 = (ImageUrl) A004;
                        Object A005 = c152406tQ.A00("args_business_follower_count");
                        if (A005 != null) {
                            this.A00 = AbstractC166987dD.A0H(A005);
                            this.A05 = new P4W(interfaceC11380iw, userSession, Long.valueOf(A0t), str2, str);
                            C24721Ip A0q = MSX.A0q();
                            this.A09 = A0q;
                            this.A0A = AbstractC07080Za.A03(A0q);
                            return;
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
