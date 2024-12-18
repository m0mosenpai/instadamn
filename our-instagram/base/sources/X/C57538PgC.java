package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.igtv.live.model.IGTVLiveChannelNetworkDataSource;
import com.instagram.igtv.live.model.IGTVLiveChannelRepository;
import com.instagram.igtv.repository.series.IGTVSeriesNetworkDataSource;
import com.instagram.igtv.repository.series.IGTVSeriesRepository;
import com.instagram.igtv.uploadflow.IGTVUploadActivity;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import go.Seq;

/* renamed from: X.PgC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57538PgC extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57538PgC(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C60842q8 A00(Object obj, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16510rw interfaceC16510rw, int i) {
        return new C60842q8(interfaceC16820sZ, new C57538PgC(obj, i), interfaceC16820sZ2, interfaceC16510rw);
    }

    public static C57538PgC A01(Object obj, int i) {
        return new C57538PgC(obj, i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, X.Nlg] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        NMX nmx;
        IGTVUploadViewModel A0b;
        Object obj;
        switch (this.A00) {
            case 0:
                return new IGTVLiveChannelRepository(new IGTVLiveChannelNetworkDataSource((UserSession) this.A01));
            case 1:
                C4DW c4dw = new C4DW(15, IGTVSeriesRepository.A03);
                UserSession userSession = (UserSession) this.A01;
                return new IGTVSeriesRepository(AbstractC25651Mw.A00(userSession), new IGTVSeriesNetworkDataSource(userSession), c4dw);
            case 2:
                C45504KCt c45504KCt = (C45504KCt) this.A01;
                return new ILL(AbstractC166987dD.A0r(c45504KCt.A07), c45504KCt.getModuleName());
            case 3:
                return new O3B(AbstractC166987dD.A0r(((C45504KCt) this.A01).A07));
            case 4:
                C1UC A09 = AbstractC31171DnF.A09(this.A01);
                C14360o3.A0C(A09, "null cannot be cast to non-null type com.instagram.igds.components.snackbar.IgSnackBarProvider");
                return new L6Y((C2d5) A09);
            case 5:
            case 23:
                return this.A01;
            case 6:
            case 17:
            case 24:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return AbstractC25226BEj.A1C(this.A01);
            case 7:
            case 18:
            case 25:
            case 30:
                return AbstractC167027dH.A0B(this.A01);
            case 8:
                C45504KCt c45504KCt2 = (C45504KCt) this.A01;
                UserSession A0r = AbstractC166987dD.A0r(c45504KCt2.A07);
                O39 o39 = new O39(c45504KCt2.requireContext());
                String moduleName = c45504KCt2.getModuleName();
                Bundle requireArguments = c45504KCt2.requireArguments();
                String string = requireArguments.getString("igtv_series_id_arg");
                if (string != null) {
                    String string2 = requireArguments.getString("igtv_series_name_arg");
                    if (string2 != null) {
                        String string3 = requireArguments.getString("igtv_series_user_id_arg");
                        if (string3 != null) {
                            return new ND6(A0r, o39, new C47638L1x(string, string2, string3), moduleName);
                        }
                        throw new AssertionError(AnonymousClass001.A0g("Bundle key ", "igtv_series_user_id_arg", " cannot be null"));
                    }
                    throw new AssertionError(AnonymousClass001.A0g("Bundle key ", "igtv_series_name_arg", " cannot be null"));
                }
                throw new AssertionError(AnonymousClass001.A0g("Bundle key ", "igtv_series_id_arg", " cannot be null"));
            case 9:
                UserSession userSession2 = ((MWZ) this.A01).A02;
                return userSession2.A01(IGTVSeriesRepository.class, A01(userSession2, 1));
            case 10:
                View findViewById = ((AppCompatActivity) this.A01).findViewById(R.id.snack_bar_stub);
                C14360o3.A07(findViewById);
                return new C3O0((ViewStub) findViewById, false);
            case 11:
                return ((ComponentActivity) this.A01).getViewModelStore();
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                IGTVUploadActivity iGTVUploadActivity = (IGTVUploadActivity) this.A01;
                Bundle A0A = AbstractC31173DnH.A0A(iGTVUploadActivity);
                C14360o3.A0A(A0A);
                String string4 = A0A.getString("uploadflow.extra.viewer_session_id");
                String A0k = AbstractC31173DnH.A0k(A0A, "igtv_creation_session_id_arg");
                String string5 = A0A.getString("uploadflow.extra.target_group_profile_id");
                O3M o3m = new O3M(iGTVUploadActivity.getSession());
                OAK oak = new OAK(iGTVUploadActivity.getSession(), A0k, string4);
                UserSession session = iGTVUploadActivity.getSession();
                if (iGTVUploadActivity.A01 == null) {
                    C14360o3.A0F("entryPoint");
                    throw C00O.createAndThrow();
                }
                return new C52318NDh(iGTVUploadActivity.getSession(), oak, new C55042OZo(iGTVUploadActivity.A00, iGTVUploadActivity, session, oak, A0k), new OKf(iGTVUploadActivity.getSession(), new Object(), new C7FH(iGTVUploadActivity)), o3m, A0k, string5);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                OAK oak2 = ((C55042OZo) this.A01).A06;
                return new OAL(oak2.A00, oak2.A01, oak2.A02);
            case 14:
            case 26:
                return ((Fragment) this.A01).requireParentFragment();
            case Process.SIGTERM /* 15 */:
            case Process.SIGSTOP /* 19 */:
            case 21:
            case 27:
            case 31:
            case 33:
            case 34:
            case 36:
            case 40:
            case 44:
            default:
                return AbstractC25235BEs.A0U(this.A01);
            case 16:
            case 20:
            case 22:
            case 28:
            case 32:
            case 35:
            case 37:
            case Seq.NULL_REFNUM /* 41 */:
            case 45:
                return AbstractC50523MSb.A0A(this.A01);
            case 38:
                return new PIL((C45508KCx) this.A01);
            case 39:
                C44417JkC c44417JkC = new C44417JkC((C45508KCx) this.A01);
                c44417JkC.A01 = R.layout.gallery_picker_title_layout;
                c44417JkC.A00 = R.layout.gallery_picker_item_layout;
                return c44417JkC;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                C27961Xa A00 = AbstractC54912fq.A00();
                AbstractC52180N7p abstractC52180N7p = (AbstractC52180N7p) this.A01;
                UserSession A0r2 = AbstractC166987dD.A0r(abstractC52180N7p.A07);
                QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0w;
                C54922fr A0S = AbstractC31175DnJ.A0S();
                A0S.A01(new P73(abstractC52180N7p, 3), (C64742wY) abstractC52180N7p.A05.getValue());
                return AbstractC31175DnJ.A0T(abstractC52180N7p, A0r2, A0S, A00, quickPromotionSlot);
            case 43:
                return AbstractC54912fq.A00().A05(AbstractC166987dD.A0r(((AbstractC52180N7p) this.A01).A07), AbstractC06930Yk.A07(AbstractC25230BEn.A1b(QPTooltipAnchor.A05, new C64712wV())));
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                C08730cb c08730cb = C17060sy.A01;
                NMX nmx2 = (NMX) this.A01;
                InterfaceC09390do interfaceC09390do = nmx2.A0W;
                User A01 = c08730cb.A01(AbstractC166987dD.A0r(interfaceC09390do));
                A01.A03.Eg3(Integer.valueOf(AbstractC167017dG.A0K(A01.A03.C9r()) + 1));
                AnonymousClass189.A00(AbstractC166987dD.A0r(interfaceC09390do)).A03(A01);
                InterfaceC09390do interfaceC09390do2 = ((AbstractC52180N7p) nmx2).A06;
                if (MSX.A0R(interfaceC09390do2).A02.length() > 0) {
                    MSX.A0F(nmx2).E4s(new LYM(MSX.A0R(interfaceC09390do2).A02, C05F.A0N));
                }
                C54688ODo c54688ODo = nmx2.A0D;
                if (c54688ODo != null) {
                    C54813OKo c54813OKo = c54688ODo.A04;
                    boolean z = c54688ODo.A03.A0M.A0S;
                    boolean z2 = c54688ODo.A05;
                    boolean z3 = c54688ODo.A00;
                    C57551PgP c57551PgP = new C57551PgP(c54688ODo, 8);
                    if (C18U.A06(C06090Tz.A05, c54813OKo.A01, 36310791686717743L) && z && z2 && !z3) {
                        InterfaceC09390do interfaceC09390do3 = c54813OKo.A03;
                        if (AbstractC25226BEj.A10(interfaceC09390do3).A01.getInt("igtv_creation_monetization_toggle_turn_off_count", 0) <= 2) {
                            AbstractC50522MSa.A1T(AbstractC25226BEj.A10(interfaceC09390do3).A01, "igtv_creation_monetization_toggle_turn_off_count", 0);
                            InterfaceC19610xo A0w = AbstractC166987dD.A0w(AbstractC25226BEj.A10(interfaceC09390do3));
                            A0w.E7D("igtv_creation_monetization_toggle_tooltip_impression", 0);
                            A0w.apply();
                            c57551PgP.invoke();
                        }
                    }
                }
                return C0eB.A00;
            case 47:
                nmx = (NMX) this.A01;
                A0b = MSW.A0b(nmx.A0Y);
                obj = C52541NMn.A00;
                A0b.A04(nmx, obj);
                return C0eB.A00;
            case 48:
                NMX nmx3 = (NMX) this.A01;
                return new C56062Ouf(nmx3.requireContext(), nmx3);
            case 49:
                nmx = (NMX) this.A01;
                A0b = MSW.A0b(nmx.A0Y);
                obj = C52539NMl.A00;
                A0b.A04(nmx, obj);
                return C0eB.A00;
        }
    }
}
