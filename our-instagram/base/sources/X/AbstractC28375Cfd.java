package X;

import android.app.Application;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.meta.foa.cds.CdsBottomSheetDimmingBehaviour;
import com.meta.foa.cds.CdsBottomSheetTopSpan;
import com.meta.foa.cds.CdsOpenScreenConfig$BottomSheetMargins;
import com.meta.foa.session.FoaUserSession;

/* renamed from: X.Cfd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28375Cfd {
    public final Context A00;
    public final FoaUserSession A01;
    public final C05A A03 = AbstractC25225BEi.A1H(new C28279CdO(null, null, null, new C28276CdL(C87.A0G, null, C88.A0X, null, C05F.A00, "Close Bottom Sheet", C30152DQi.A00), "", null, C05F.A06, C05F.A0C, AbstractC25230BEn.A0M(), true, false, true));
    public final InterfaceC09390do A02 = AbstractC09440dt.A00(EnumC09460dv.A02, C29905DGt.A01(this, 2));

    public AbstractC28375Cfd(Context context, FoaUserSession foaUserSession) {
        this.A00 = context;
        this.A01 = foaUserSession;
    }

    public final void A0I(C28371CfX c28371CfX, String str, InterfaceC16660sJ interfaceC16660sJ) {
        String str2;
        C28215CcE c28215CcE;
        CWI cwi;
        C27992CVp c27992CVp;
        C14360o3.A0B(c28371CfX, 1);
        InterfaceC09390do interfaceC09390do = this.A02;
        if (((C28215CcE) interfaceC09390do.getValue()).A00 != null) {
            CWI cwi2 = ((C28215CcE) interfaceC09390do.getValue()).A00;
            if (cwi2 != null && (c27992CVp = (C27992CVp) cwi2.A04.A0R()) != null) {
                str2 = c27992CVp.A01;
            } else {
                str2 = null;
            }
            if (!C14360o3.A0K(str2, str) && (cwi = (c28215CcE = (C28215CcE) interfaceC09390do.getValue()).A00) != null) {
                cwi.A01(new C29724D8u(cwi, null, c28371CfX, AbstractC28141Cao.A00(str, new D8K(4, c28371CfX, cwi), C30170DRa.A00(cwi, C30170DRa.A00(c28215CcE, interfaceC16660sJ, 12), 11)), str, c28215CcE.A01, 2));
                AbstractC25227BEk.A1Q(cwi.A05, true);
                return;
            }
            return;
        }
        A0J(c28371CfX, str, interfaceC16660sJ);
    }

    public final void A0K(C28279CdO c28279CdO) {
        C14360o3.A0B(c28279CdO, 0);
        this.A03.Egh(c28279CdO);
    }

    public static CWI A09(AbstractC28375Cfd abstractC28375Cfd) {
        return C28215CcE.A00((C28215CcE) abstractC28375Cfd.A02.getValue());
    }

    public static C28215CcE A0A(AbstractC28375Cfd abstractC28375Cfd) {
        return (C28215CcE) abstractC28375Cfd.A02.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0F() {
        long j;
        String str;
        C28371CfX c28371CfX;
        InterfaceC16660sJ interfaceC16660sJ;
        String str2;
        C27333C4o c27333C4o;
        Integer num;
        if (this instanceof C27331C4m) {
            C27331C4m c27331C4m = (C27331C4m) this;
            if (c27331C4m.A08.A01.A04.A00) {
                num = C05F.A00;
            } else {
                num = C05F.A0C;
            }
            c27331C4m.A03 = num;
            C28353CfD c28353CfD = c27331C4m.A06;
            C28172CbJ c28172CbJ = c28353CfD.A02;
            Integer num2 = c28353CfD.A03.A05;
            EnumC72434Xde A00 = AbstractC72654Xjw.A00(num2);
            C8f c8f = C8f.WRITE;
            C28172CbJ.A00(c8f, A00, c28172CbJ, "bottom_sheet_open", null);
            C28172CbJ.A00(c8f, AbstractC72654Xjw.A00(num2), c28172CbJ, "open_intent", null);
            c28371CfX = C27331C4m.A00(c27331C4m);
            interfaceC16660sJ = C30181DRm.A01(c27331C4m, 24);
            str2 = "WriteWithAIActivity";
            c27333C4o = c27331C4m;
        } else if (this instanceof C27329C4k) {
            C27329C4k c27329C4k = (C27329C4k) this;
            Context context = ((AbstractC28375Cfd) c27329C4k).A00;
            String A0p = AbstractC166997dE.A0p(context, 2131966557);
            String A0p2 = AbstractC166997dE.A0p(context, 2131966555);
            String string = context.getString(2131966556);
            C87 c87 = C87.A0G;
            Integer num3 = C05F.A01;
            C28276CdL c28276CdL = new C28276CdL(c87, c87, C88.A0X, string, num3, A0p2, C30181DRm.A01(c27329C4k, 6));
            Integer num4 = c27329C4k.A03;
            c27329C4k.A0K(new C28279CdO(null, null, null, c28276CdL, A0p, null, C05F.A06, num4, AbstractC25230BEn.A0M(), true, true, true));
            C34941FaR.A00(c27329C4k.A01, null, 16);
            c28371CfX = new C28371CfX(new CdsBottomSheetDimmingBehaviour.FixedAlpha(0.5f), U6H.A0B, num4, num3, null, 48, true);
            interfaceC16660sJ = C30181DRm.A01(c27329C4k, 8);
            str2 = "PromptSheetActivity";
            c27333C4o = c27329C4k;
        } else if (this instanceof C27330C4l) {
            C27330C4l c27330C4l = (C27330C4l) this;
            if (c27330C4l.A05.A02 != C05F.A0C) {
                C28421CgT.A02(C8o.A0T, (C28421CgT) c27330C4l.A07.getValue());
            }
            Integer num5 = c27330C4l.A06;
            c28371CfX = new C28371CfX(CdsBottomSheetDimmingBehaviour.Default.A00, U6H.A08, num5, null, null, 48, false);
            interfaceC16660sJ = C30144DQa.A00;
            str2 = "MEmuLLoadingScreen";
            c27333C4o = c27330C4l;
        } else {
            if (this instanceof C27332C4n) {
                C27332C4n c27332C4n = (C27332C4n) this;
                if (c27332C4n.A06.A02 != C05F.A0C) {
                    C28421CgT.A02(C8o.A0T, (C28421CgT) c27332C4n.A0A.getValue());
                }
                C7H c7h = c27332C4n.A05;
                int ordinal = c7h.ordinal();
                boolean z = true;
                if (ordinal != 0) {
                    if (ordinal != 16) {
                        if (c7h != C7H.A02) {
                            z = false;
                        }
                        C27332C4n.A03(c27332C4n, z);
                        return;
                    }
                    C27332C4n.A01(c27332C4n);
                    return;
                }
                Integer num6 = c27332C4n.A07;
                C29910DGy A01 = C29910DGy.A01(c27332C4n, 23);
                C28371CfX c28371CfX2 = new C28371CfX(CdsBottomSheetDimmingBehaviour.Default.A00, U6H.A08, num6, null, A01, 48, true);
                if (c27332C4n.A0M()) {
                    C28279CdO c28279CdO = (C28279CdO) ((AbstractC28375Cfd) c27332C4n).A03.getValue();
                    Context context2 = ((AbstractC28375Cfd) c27332C4n).A00;
                    String A0p3 = AbstractC166997dE.A0p(context2, 2131966498);
                    String A0p4 = AbstractC166997dE.A0p(context2, 2131966511);
                    c27332C4n.A0K(C28279CdO.A00(null, null, c28279CdO, new C28276CdL(C87.A0E, null, C88.A0X, null, C05F.A00, A0p4, C30182DRn.A01(c27332C4n, 32)), A0p3, null, 4014, false, true));
                } else {
                    C27332C4n.A02(c27332C4n);
                    U6H u6h = U6H.A0B;
                    Integer num7 = c28371CfX2.A04;
                    c28371CfX2 = new C28371CfX(c28371CfX2.A02, u6h, num7, c28371CfX2.A00, c28371CfX2.A05, 48, true);
                }
                c27332C4n.A0I(c28371CfX2, "MEmuNuxScreen", C30182DRn.A01(c27332C4n, 30));
                return;
            }
            C27333C4o c27333C4o2 = (C27333C4o) this;
            C28362CfM c28362CfM = c27333C4o2.A0B;
            UserFlowLogger userFlowLogger = c28362CfM.A01;
            if (userFlowLogger != null) {
                j = userFlowLogger.generateNewFlowId(131281062);
            } else {
                j = 0;
            }
            c28362CfM.A00 = j;
            if (userFlowLogger != null) {
                userFlowLogger.flowStart(j, new UserFlowConfig("ImagineFlowLogger", false));
            }
            CWR cwr = c28362CfM.A02;
            C28362CfM.A01(c28362CfM, "surface", AbstractC72653Xjv.A00(cwr.A02).toString());
            C28362CfM.A01(c28362CfM, "surface_session_id", cwr.A0C);
            C28362CfM.A01(c28362CfM, "bottom_sheet_session_id", cwr.A0B);
            switch (cwr.A07.intValue()) {
                case 1:
                    str = "FbBirthday";
                    break;
                case 2:
                    str = "FbCommentsReactions";
                    break;
                case 3:
                    str = "IgStoriesMemuTieredPrompts";
                    break;
                default:
                    str = ServerW3CShippingAddressConstants.DEFAULT;
                    break;
            }
            C28362CfM.A01(c28362CfM, "ice_breakers_type", str);
            c27333C4o2.A0K(c27333C4o2.A0F);
            Integer num8 = c27333C4o2.A0G;
            int i = c27333C4o2.A07;
            c28371CfX = new C28371CfX(CdsBottomSheetDimmingBehaviour.Default.A00, U6H.A08, num8, null, null, i, false);
            interfaceC16660sJ = DQL.A00;
            str2 = "ImagineLoadingScreen";
            c27333C4o = c27333C4o2;
        }
        c27333C4o.A0J(c28371CfX, str2, interfaceC16660sJ);
    }

    public final Application A0B() {
        Context applicationContext = A0A(this).A02.getApplicationContext();
        C14360o3.A0C(applicationContext, "null cannot be cast to non-null type android.app.Application");
        return (Application) applicationContext;
    }

    public final Fragment A0C() {
        return A09(this).A02.A00();
    }

    public final C57312k6 A0D() {
        return C07Y.A00(A09(this).A02.A00());
    }

    public final String A0E() {
        C27992CVp c27992CVp;
        CWI cwi = A0A(this).A00;
        if (cwi != null && (c27992CVp = (C27992CVp) cwi.A04.A0R()) != null) {
            return c27992CVp.A01;
        }
        return null;
    }

    public final void A0G() {
        C28215CcE A0A = A0A(this);
        try {
            if (A0A.A01 != null) {
                A0A.A04.invoke();
            }
            CWI cwi = A0A.A00;
            if (cwi != null) {
                cwi.A01(C29905DGt.A01(cwi, 15));
            }
            A0A.A01 = null;
        } catch (IllegalStateException unused) {
        } catch (Throwable th) {
            A0A.A00 = null;
            throw th;
        }
        A0A.A00 = null;
    }

    public final void A0H() {
        CWI cwi = A0A(this).A00;
        if (cwi != null) {
            cwi.A01(C29905DGt.A01(cwi, 16));
        }
    }

    public final void A0J(C28371CfX c28371CfX, String str, InterfaceC16660sJ interfaceC16660sJ) {
        C28215CcE A0A = A0A(this);
        if (A0A.A00 != null) {
            throw AbstractC166987dD.A14("Bottom sheet already launched! Use push to add new screen to bottom sheet or dismiss existing bottom sheet");
        }
        CPZ cpz = new CPZ(A0A);
        int i = c28371CfX.A01;
        C27987CVk A00 = AbstractC28141Cao.A00(str, new D8K(5, c28371CfX, A0A), new C50365MLr(c28371CfX, A0A, interfaceC16660sJ, str, 44));
        Context context = A0A.A02;
        FoaUserSession foaUserSession = A0A.A03;
        U6H u6h = c28371CfX.A03;
        U6G u6g = U6G.A06;
        Integer num = c28371CfX.A04;
        EnumC68200VFs enumC68200VFs = EnumC68200VFs.A05;
        CdsBottomSheetTopSpan.Dp dp = new CdsBottomSheetTopSpan.Dp(16);
        CdsOpenScreenConfig$BottomSheetMargins cdsOpenScreenConfig$BottomSheetMargins = new CdsOpenScreenConfig$BottomSheetMargins(0, 0, 0, 0);
        AbstractC68608VXj.A00(context, new W1X(c28371CfX.A02, dp, C65981Txa.A0N, cdsOpenScreenConfig$BottomSheetMargins, enumC68200VFs, C65981Txa.A0Q, u6g, u6h, cpz, num, Integer.valueOf(i), true), A00, foaUserSession, new Object());
    }

    public final void A0L(InterfaceC16660sJ interfaceC16660sJ) {
        CWI cwi = A0A(this).A00;
        if (cwi != null) {
            cwi.A02(interfaceC16660sJ);
        }
    }

    public final boolean A0M() {
        return AbstractC167007dF.A1W(A0A(this).A00);
    }
}
