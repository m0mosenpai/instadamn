package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.store.ReplaceDirectMessageLoader;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.JbP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43914JbP {
    public final Context A00;
    public final UserSession A01;
    public final C18240vB A02;
    public final C2DS A03;

    public final void A02(C1P1 c1p1, C2ED c2ed) {
        C81613kW c81613kW;
        String C7I = c2ed.C7I();
        if (C7I != null) {
            C81663kb A0h = AbstractC31172DnG.A0h(this.A03, C7I);
            if (A0h != null) {
                c81613kW = A0h.Aic();
            } else {
                c81613kW = null;
            }
            if (C161857Mv.A02.A03(this.A01, c81613kW)) {
                return;
            }
        }
        String CGs = c2ed.CGs();
        UserSession userSession = this.A01;
        String C7I2 = c2ed.C7I();
        if (C7I2 != null) {
            C25621Ms A0N = AbstractC31173DnH.A0N(userSession);
            A0N.A0L("direct_v2/visual_threads/%s/", C7I2);
            A0N.A0S(K8O.class, LCQ.class);
            if (CGs != null) {
                A0N.A9s("cursor", CGs);
            }
            AnonymousClass777 anonymousClass777 = new AnonymousClass777(new C45540KEf(new GRR(0), userSession), AbstractC31172DnG.A0T(A0N, "visual_message_return_type", "unseen"));
            anonymousClass777.A00(new C45389K8c(c1p1, userSession, c2ed.BKb()));
            C1GJ.A03(anonymousClass777);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A00(C83403nh c83403nh, C43914JbP c43914JbP) {
        C101584hT c101584hT;
        C101594hU c101594hU;
        C75363a3 c75363a3;
        UserSession userSession = c43914JbP.A01;
        if (c83403nh.A1f(userSession) && (c101584hT = c83403nh.A0e) != null && (c101594hU = c101584hT.A04) != null) {
            if (c101594hU.A0V) {
                c75363a3 = c101594hU.A09;
            } else {
                c75363a3 = null;
            }
            Context context = c43914JbP.A00;
            ExtendedImageUrl A00 = c101594hU.A00(context);
            if (c75363a3 != null && AbstractC97064Xr.A00(context, userSession, false)) {
                C4AD c4ad = new C4AD(c75363a3, "DirectStoryPreloader");
                c4ad.A02 = 5242880;
                C4AG.A00(userSession).A01(c4ad);
            } else {
                if (A00 == null) {
                    return;
                }
                c43914JbP.A02.ATO(new C44144Jf9(A00));
            }
        }
    }

    public final void A01() {
        int i = 0;
        for (C2EC c2ec : ((C2DU) this.A03).A0C.A0F(C4I1.A00)) {
            C83403nh BYi = c2ec.BYi();
            if (BYi != null) {
                UserSession userSession = this.A01;
                if (!BYi.A1f(userSession)) {
                    continue;
                } else {
                    C101584hT c101584hT = BYi.A0e;
                    if (c101584hT != null && c101584hT.A00()) {
                        String C7I = c2ec.C7I();
                        if (C7I != null) {
                            String A0h = BYi.A0h();
                            if (A0h != null) {
                                String A0g = BYi.A0g();
                                if (A0g != null) {
                                    ReplaceDirectMessageLoader.A01(userSession, new C49329LrN(this), C7I, A0h, A0g);
                                } else {
                                    throw AbstractC166987dD.A14("Required value was null.");
                                }
                            } else {
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    } else {
                        A00(BYi, this);
                    }
                    i++;
                    if (i >= 4) {
                        return;
                    }
                }
            }
        }
    }

    public C43914JbP(UserSession userSession) {
        this.A01 = userSession;
        this.A03 = AbstractC28761aE.A00(userSession);
        this.A00 = AbstractC25225BEi.A0F(userSession);
        C0o0 A00 = AbstractC14350nz.A00();
        A00.A01 = "DirectStoryPreloader";
        this.A02 = new C18240vB(A00);
    }
}
