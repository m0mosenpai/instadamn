package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.io.StringWriter;

/* renamed from: X.2kh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57682kh extends AbstractC57542kT {
    public C25301Lk A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.2kh, X.2kT] */
    public static C57682kh A00(final UserSession userSession) {
        C57502kP A00 = AbstractC57492kO.A00(userSession);
        C57682kh c57682kh = (C57682kh) ((AbstractC57542kT) A00.A04.get(C57682kh.class));
        if (c57682kh == null) {
            C25301Lk c25301Lk = new C25301Lk(AbstractC12290kX.A00, new InterfaceC25281Li() { // from class: X.2ki
                @Override // X.InterfaceC25281Li
                public final /* bridge */ /* synthetic */ Object E3T(String str) {
                    return AbstractC54224Ny3.parseFromJson(C07950bF.A04.A01(UserSession.this, str));
                }

                @Override // X.InterfaceC25281Li
                public final /* bridge */ /* synthetic */ String EOt(Object obj) {
                    C4JM c4jm = (C4JM) obj;
                    StringWriter stringWriter = new StringWriter();
                    C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                    A0A.A0d();
                    if (c4jm.A00 != null) {
                        C16V.A03(A0A, MSV.A00(1485));
                        for (OW1 ow1 : c4jm.A00) {
                            if (ow1 != null) {
                                A0A.A0d();
                                A0A.A0R("creation_time", ow1.A03);
                                if (ow1.A04 != null) {
                                    A0A.A0r(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT);
                                    AbstractC38841rG.A00(A0A, ow1.A04.AKi().A00());
                                }
                                String str = ow1.A05;
                                if (str != null) {
                                    A0A.A0S("container_module", str);
                                }
                                String str2 = ow1.A06;
                                if (str2 != null) {
                                    A0A.A0S("radio_type", str2);
                                }
                                A0A.A0T(MSV.A00(34), ow1.A07);
                                A0A.A0Q(MSV.A00(93), ow1.A01);
                                A0A.A0Q("carousel_index", ow1.A00);
                                A0A.A0Q(MSV.A00(555), ow1.A02);
                                A0A.A0T(MSV.A00(1339), ow1.A09);
                                A0A.A0T(MSV.A00(1341), ow1.A0A);
                                A0A.A0a();
                            }
                        }
                        A0A.A0Z();
                    }
                    A0A.A0a();
                    A0A.close();
                    return stringWriter.toString();
                }
            }, 789611494);
            ?? abstractC57542kT = new AbstractC57542kT(userSession);
            abstractC57542kT.A00 = c25301Lk;
            A00.A03(abstractC57542kT, C57682kh.class);
            return abstractC57542kT;
        }
        return c57682kh;
    }

    public final void A0L(OW1 ow1) {
        if (!A0J(ow1.A00().A0G)) {
            ow1.A00();
            A0H(ow1.A00().A0G, ow1);
        }
    }
}
