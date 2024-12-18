package X;

import androidx.recyclerview.widget.RecyclerView;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.igtv.draft.model.IGTVDraftsRepository;
import com.instagram.igtv.draft.model.IGTVDraftsRoomDataSource;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.PbP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57241PbP extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57241PbP(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Type inference failed for: r0v46, types: [X.Np6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [X.Np3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [X.Np4, java.lang.Object] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                final C4IY c4iy = new C4IY((UserSession) this.A01);
                return new C48F(c4iy) { // from class: X.4IX
                    public final C4IY A00;

                    public static final boolean A00(String str, String str2) {
                        return AbstractC001800i.A0k(AbstractC001900j.A0R(str, new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0)).contains(str2);
                    }

                    @Override // X.C48F
                    public final boolean getBoolForContext(String str, String str2, boolean z) {
                        UserSession userSession;
                        C06090Tz c06090Tz;
                        long j;
                        C14360o3.A0B(str, 0);
                        C14360o3.A0B(str2, 1);
                        if (str2.equals("shouldExecuteLiveQueryWithConfigId")) {
                            userSession = this.A00.A00;
                            c06090Tz = C06090Tz.A05;
                            if (A00(C18U.A04(c06090Tz, userSession, 36879449651675406L), str)) {
                                return false;
                            }
                            if (A00(C18U.A04(c06090Tz, userSession, 36879449652199698L), str)) {
                                return true;
                            }
                            if (A00(C18U.A04(c06090Tz, userSession, 36879449651740943L), str)) {
                                j = 36316499698586066L;
                            } else if (A00(C18U.A04(c06090Tz, userSession, 36879449651806480L), str)) {
                                j = 36316499698651603L;
                            } else {
                                if (!A00(C18U.A04(c06090Tz, userSession, 36879449651872017L), str)) {
                                    return z;
                                }
                                j = 36316499698717140L;
                            }
                        } else {
                            if (!str2.equals("shouldEnableUnsetFieldRemoval")) {
                                return z;
                            }
                            userSession = this.A00.A00;
                            c06090Tz = C06090Tz.A05;
                            j = 36314476773247608L;
                        }
                        return C18U.A06(c06090Tz, userSession, j);
                    }

                    @Override // X.C48F
                    public final boolean getGlobalBool(String str, boolean z) {
                        return z;
                    }

                    @Override // X.C48F
                    public final int getGlobalInt(String str, int i) {
                        return i;
                    }

                    @Override // X.C48F
                    public final String getGlobalString(String str, String str2) {
                        C14360o3.A0B(str, 0);
                        C14360o3.A0B(str2, 1);
                        if (str.equals("kGraphQLLiveQuerySandboxUrl")) {
                            return C1HO.A01();
                        }
                        return str2;
                    }

                    @Override // X.C48F
                    public final String getStringForContext(String str, String str2, String str3) {
                        C14360o3.A0B(str3, 2);
                        return str3;
                    }

                    {
                        this.A00 = c4iy;
                    }
                };
            case 1:
                return new C32569EVt(((EOM) this.A01).A0C());
            case 2:
            case 6:
            case 10:
            case 16:
            case 47:
                return this.A01;
            case 3:
            case 7:
            case 11:
            case 17:
            case 48:
                return AbstractC25226BEj.A1C(this.A01);
            case 4:
            case 8:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 18:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case 5:
                return new C32568EVs(AbstractC166987dD.A0r(((EOS) this.A01).A0F));
            case 9:
                return new C32569EVt(((EON) this.A01).A0C());
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new C32570EVu(AbstractC166987dD.A0r(((C32343EMp) this.A01).A0G));
            case 14:
                C32343EMp c32343EMp = (C32343EMp) this.A01;
                RecyclerView recyclerView = c32343EMp.A00;
                if (recyclerView != null) {
                    return new C33079Eic(c32343EMp.requireActivity(), recyclerView, c32343EMp.A0A, c32343EMp.A09);
                }
                return null;
            case Process.SIGTERM /* 15 */:
                C32343EMp c32343EMp2 = (C32343EMp) this.A01;
                return new C38E(c32343EMp2, AbstractC166987dD.A0r(c32343EMp2.A0G), new C38C(c32343EMp2));
            case Process.SIGSTOP /* 19 */:
                return AbstractC153636vY.A01(AbstractC31179DnN.A04(this.A01), "tray_session_id");
            case 20:
                return new C56125Ovl((UserSession) this.A01);
            case 21:
                V1R v1r = (V1R) this.A01;
                Hashtag hashtag = (Hashtag) v1r.A0h.getValue();
                C68809VcQ c68809VcQ = v1r.A0d;
                V1R.A00(v1r);
                return new W31(c68809VcQ, hashtag);
            case 22:
                return V1R.A00((V1R) this.A01);
            case 23:
                AbstractC166987dD.A1Y(this.A01);
                return AbstractC166997dE.A0a();
            case 24:
                return new C56057OuY((UserSession) this.A01);
            case 25:
                UserSession userSession = ((C23965Ajz) this.A01).A01;
                return ((C54657OCj) userSession.A01(C54657OCj.class, new C57243PbR(userSession, 46))).A02.getValue();
            case 26:
                ?? obj = new Object();
                C23965Ajz c23965Ajz = (C23965Ajz) this.A01;
                return new C55711Ood(obj, (C54514O6r) c23965Ajz.A03.getValue(), c23965Ajz.A02);
            case 27:
                return new AH5(((C23967Ak1) this.A01).A02, new Object());
            case 28:
                ?? obj2 = new Object();
                C23966Ak0 c23966Ak0 = (C23966Ak0) this.A01;
                return new C55712Ooe(obj2, (OKP) c23966Ak0.A04.getValue(), c23966Ak0.A02);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return AbstractC53716Np5.A00(((C23966Ak0) this.A01).A01);
            case 30:
                return new C48284LYh((UserSession) this.A01);
            case 31:
                return new MVO((UserSession) this.A01);
            case 32:
                return AbstractC166997dE.A0c(C06090Tz.A05, ((MVO) this.A01).A0H.A00, 36316503993225685L);
            case 33:
                return AbstractC166997dE.A0a();
            case 34:
                return null;
            case 35:
                return Double.valueOf(1.0d);
            case 36:
                return Integer.valueOf(AbstractC25225BEi.A07(C06090Tz.A05, ((MVO) this.A01).A0H.A00, 36597978970000466L));
            case 37:
                return new C49506LuJ(((P3Z) this.A01).A00);
            case 38:
                return C1AT.A01(((OIS) this.A01).A01).A03(C1AV.A21);
            case 39:
                return new IGTVDraftsRepository(new IGTVDraftsRoomDataSource((UserSession) this.A01));
            case 40:
                UserSession userSession2 = ((MXI) this.A01).A00;
                C14360o3.A0B(userSession2, 0);
                return userSession2.A01(IGTVDraftsRepository.class, new C57241PbP(userSession2, 39));
            case Seq.NULL_REFNUM /* 41 */:
                return AbstractC166987dD.A17(((C50875Me6) ((N7y) this.A01).A05.getValue()).A00);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                N7y n7y = (N7y) this.A01;
                UserSession A0r = AbstractC166987dD.A0r(n7y.A06);
                return new C47674L3h(n7y.requireContext(), n7y, A0r, (C57112jm) n7y.A07.getValue(), n7y, AbstractC25225BEi.A15(n7y.A01), new C57561PgZ(n7y, 14));
            case 43:
                N7y n7y2 = (N7y) this.A01;
                return new ND5(AbstractC166987dD.A0r(n7y2.A06), new O39(n7y2.requireContext()), AbstractC153636vY.A01(n7y2.requireArguments(), "igtv_topic_channel_id"), AbstractC153636vY.A01(n7y2.requireArguments(), "igtv_channel_title_arg"));
            case 44:
                N7y n7y3 = (N7y) this.A01;
                DialogInterfaceOnDismissListenerC41846Ig0 dialogInterfaceOnDismissListenerC41846Ig0 = new DialogInterfaceOnDismissListenerC41846Ig0(n7y3, AbstractC166987dD.A0r(n7y3.A06), n7y3, AbstractC25225BEi.A15(n7y3.A01));
                n7y3.getViewLifecycleOwner().getLifecycle().A09(dialogInterfaceOnDismissListenerC41846Ig0);
                return dialogInterfaceOnDismissListenerC41846Ig0;
            case 45:
                return AbstractC25235BEs.A0U(this.A01);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return AbstractC50523MSb.A0A(this.A01);
        }
    }
}
