package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.analytics.traffic.IGNetworkStateLogger;
import com.instagram.appreciation.analytics.creator.CreatorLoggingData;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.HashMap;

/* renamed from: X.MDk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50157MDk extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50157MDk(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C1QT c1qt;
        long j;
        String str;
        C29166CtX c29166CtX;
        switch (this.A00) {
            case 10:
                return C7F4.A00(((C25853Bc8) this.A01).A01);
            case 11:
                UserSession userSession = ((C28370CfW) this.A01).A00;
                return userSession.A01(C29166CtX.class, new C50157MDk(userSession, 12));
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new C29166CtX((UserSession) this.A01);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                c29166CtX = (C29166CtX) this.A01;
                ((UserFlowLoggerImpl) c29166CtX.A02.getValue()).flowEndCancel(c29166CtX.A00, CancelReason.USER_CANCELLED);
                c29166CtX.A00 = 0L;
                return C0eB.A00;
            case 14:
                c29166CtX = (C29166CtX) this.A01;
                ((UserFlowLoggerImpl) c29166CtX.A02.getValue()).flowEndSuccess(c29166CtX.A00);
                c29166CtX.A00 = 0L;
                return C0eB.A00;
            case Process.SIGTERM /* 15 */:
                return C1QS.A00(((C29166CtX) this.A01).A01);
            case 16:
                C7W9 c7w9 = (C7W9) this.A01;
                c7w9.A02.flowEndSuccess(c7w9.A00);
                c7w9.A00 = 0L;
                return C0eB.A00;
            case 17:
                C7W9 c7w92 = (C7W9) this.A01;
                c1qt = c7w92.A02;
                j = c7w92.A00;
                str = "creator_button_clicked";
                c1qt.flowMarkPoint(j, str);
                return C0eB.A00;
            case 18:
                C7W9 c7w93 = (C7W9) this.A01;
                c1qt = c7w93.A02;
                j = c7w93.A00;
                str = "thread_details_entered";
                c1qt.flowMarkPoint(j, str);
                return C0eB.A00;
            case Process.SIGSTOP /* 19 */:
                C7W9 c7w94 = (C7W9) this.A01;
                c1qt = c7w94.A02;
                j = c7w94.A00;
                str = "share_button_clicked";
                c1qt.flowMarkPoint(j, str);
                return C0eB.A00;
            case 20:
                return new NSM((UserSession) this.A01);
            case 21:
                C26818Bsg c26818Bsg = (C26818Bsg) this.A01;
                return new C28370CfW(AbstractC166987dD.A0r(c26818Bsg.A03), AbstractC25225BEi.A15(c26818Bsg.A04), null);
            case 22:
                return C7F4.A00(AbstractC166987dD.A0r(((C26818Bsg) this.A01).A03));
            case 23:
            case 44:
                return this.A01;
            case 24:
            case 45:
                return AbstractC25226BEj.A1C(this.A01);
            case 25:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return AbstractC167027dH.A0B(this.A01);
            case 26:
                return new KFM(AbstractC166987dD.A0r(((C26818Bsg) this.A01).A03));
            case 27:
                C48123LRx c48123LRx = (C48123LRx) this.A01;
                java.util.Set set = C48123LRx.A06;
                return AbstractC12220kQ.A02(c48123LRx.A01);
            case 28:
                return new C38431qX((AbstractC12990ll) this.A01);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return new ILH((AbstractC12990ll) this.A01);
            case 30:
                return new C3KO((UserSession) this.A01);
            case 31:
                return new C47238KuB((AbstractC12990ll) this.A01);
            case 32:
                UserSession userSession2 = (UserSession) this.A01;
                return new C43271yu(AbstractC25225BEi.A0F(userSession2), userSession2);
            case 33:
                return new C59112nC(C18U.A06(C06090Tz.A05, (AbstractC12990ll) this.A01, 36314098811537818L));
            case 34:
                return new IGNetworkStateLogger((UserSession) this.A01);
            case 35:
                UserSession userSession3 = (UserSession) this.A01;
                boolean z = C23051Ak.A05;
                return new C22983ABi(C23061Al.A00(userSession3), userSession3);
            case 36:
                return new C84243pG((UserSession) this.A01);
            case 37:
                C2DG A00 = C2DG.A00((UserSession) ((AbstractC12990ll) this.A01));
                C2DG.A07(A00, "early_dispatch_during_app_start", C2DG.A08(A00.A09));
                return C0eB.A00;
            case 38:
                return new JQB((JQ6) this.A01);
            case 39:
                C55982hj c55982hj = ((C43743JWc) this.A01).A02;
                C14360o3.A07(c55982hj);
                c55982hj.A09(C43743JWc.A04);
                c55982hj.A06 = true;
                c55982hj.A02();
                c55982hj.A04();
                return C0eB.A00;
            case 40:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                C45523KDo c45523KDo = (C45523KDo) this.A01;
                CreatorLoggingData A002 = AbstractC46602Kjf.A00(c45523KDo.requireArguments());
                ((LLN) c45523KDo.A00.getValue()).A07(Boolean.valueOf(A002.A01), Boolean.valueOf(A002.A02), null, null, C05F.A1F, C05F.A0u, A002.A00, null, AbstractC06930Yk.A0E());
                return C0eB.A00;
            case Seq.NULL_REFNUM /* 41 */:
                C45523KDo c45523KDo2 = (C45523KDo) this.A01;
                CreatorLoggingData A003 = AbstractC46602Kjf.A00(c45523KDo2.requireArguments());
                ((LLN) c45523KDo2.A00.getValue()).A07(Boolean.valueOf(A003.A01), Boolean.valueOf(A003.A02), null, null, C05F.A1F, C05F.A04, A003.A00, null, AbstractC06930Yk.A0E());
                InterfaceC09390do interfaceC09390do = c45523KDo2.A01;
                HashMap A02 = AbstractC06930Yk.A02(AbstractC167007dF.A1b("initial_media_product_type", "CLIPS", AbstractC166987dD.A1L("target_id", AbstractC31173DnH.A0t(interfaceC09390do)), AbstractC166987dD.A1L("timeframe", "TWO_YEARS")));
                C140966Yy A0c = AbstractC25231BEo.A0c(c45523KDo2.requireActivity(), interfaceC09390do);
                A0c.A0B(null, W6d.A02(new IgBloksScreenConfig(AbstractC166987dD.A0o(interfaceC09390do)), C66277U6x.A01("com.instagram.insights.account.media_grid.gifts.container", A02)));
                A0c.A07();
                return C0eB.A00;
            case 43:
                C45523KDo c45523KDo3 = (C45523KDo) this.A01;
                return new LLN(LAu.A01(c45523KDo3), c45523KDo3, AbstractC12220kQ.A01(c45523KDo3, AbstractC166987dD.A0o(c45523KDo3.A01)));
            case 47:
                C45523KDo c45523KDo4 = (C45523KDo) this.A01;
                UserSession A0r = AbstractC166987dD.A0r(c45523KDo4.A01);
                return new KGT((LLN) c45523KDo4.A00.getValue(), AbstractC46602Kjf.A00(c45523KDo4.requireArguments()), A0r, LAu.A01(c45523KDo4).A01);
            case 48:
                C45515KDg c45515KDg = (C45515KDg) this.A01;
                return new LLN(LAu.A01(c45515KDg), c45515KDg, AbstractC12220kQ.A01(c45515KDg, AbstractC166987dD.A0o(c45515KDg.A01)));
            case 49:
                N6G n6g = (N6G) this.A01;
                return new LLN(LAu.A01(n6g), n6g, AbstractC12220kQ.A01(n6g, n6g.A06()));
            default:
                AbstractC166987dD.A1Y(this.A01);
                return C0eB.A00;
        }
    }
}
