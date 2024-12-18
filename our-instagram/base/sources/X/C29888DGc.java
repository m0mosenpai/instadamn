package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import go.Seq;

/* renamed from: X.DGc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29888DGc extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29888DGc(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C29888DGc A00(Object obj, int i) {
        return new C29888DGc(obj, i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        InterfaceC09390do interfaceC09390do;
        C26029BfI c26029BfI;
        String str;
        String str2;
        String str3;
        switch (this.A00) {
            case 0:
                J27 j27 = (J27) this.A01;
                J27.A00(j27, 0);
                j27.A04.A03(j27);
                return C0eB.A00;
            case 1:
            case 5:
            case 8:
            case 23:
            case 34:
            case 45:
                return this.A01;
            case 2:
            case 6:
            case 9:
            case 24:
            case 35:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return AbstractC25226BEj.A1C(this.A01);
            case 3:
            case 7:
            case 10:
            case 25:
            case 36:
            case 47:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case 4:
                interfaceC09390do = ((C26837Bsz) this.A01).A0C;
                return AbstractC62822tL.A00(AbstractC166987dD.A0r(interfaceC09390do));
            case 11:
            case 37:
                AbstractC166987dD.A1Y(this.A01);
                return C0eB.A00;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new C27885CQw((UserSession) this.A01);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return C1QS.A00((AbstractC12990ll) this.A01);
            case 14:
                interfaceC09390do = ((C26835Bsx) this.A01).A0O;
                return AbstractC62822tL.A00(AbstractC166987dD.A0r(interfaceC09390do));
            case Process.SIGTERM /* 15 */:
            case 21:
            case 28:
                return AbstractC25235BEs.A0U(this.A01);
            case 16:
                C26835Bsx c26835Bsx = (C26835Bsx) this.A01;
                FragmentActivity requireActivity = c26835Bsx.requireActivity();
                Context requireContext = c26835Bsx.requireContext();
                UserSession A0r = AbstractC166987dD.A0r(c26835Bsx.A0O);
                C08790ch A00 = AbstractC018607g.A00(c26835Bsx);
                String str4 = c26835Bsx.A0M;
                AbstractC167007dF.A1G(A0r, 2, str4);
                return new C27049BwT(requireActivity, requireContext, A00, c26835Bsx, A0r, str4, 1);
            case 17:
                interfaceC09390do = ((C26833Bsv) this.A01).A0G;
                return AbstractC62822tL.A00(AbstractC166987dD.A0r(interfaceC09390do));
            case 18:
                C26833Bsv c26833Bsv = (C26833Bsv) this.A01;
                C26085BgE c26085BgE = (C26085BgE) ((C25837Bbs) c26833Bsv.A0F.getValue()).A00.A02();
                if (c26085BgE != null && (c26029BfI = (C26029BfI) c26085BgE.A02) != null && (str = c26029BfI.A08) != null) {
                    InterfaceC09390do interfaceC09390do2 = c26833Bsv.A0G;
                    AbstractC25236BEt.A0h(AbstractC31364DqT.A03().A01.A01(AbstractC166987dD.A0r(interfaceC09390do2), AbstractC31402Dr6.A02(AbstractC166987dD.A0r(interfaceC09390do2), str, "remix_pivot_page", "clips_remix_page").A03()), c26833Bsv, AbstractC166987dD.A0o(interfaceC09390do2));
                    if (c26833Bsv.A07 != null) {
                        UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do2);
                        C38321qM c38321qM = c26833Bsv.A07;
                        if (c38321qM != null) {
                            C211729Zg c211729Zg = c26833Bsv.A03;
                            str2 = "arguments";
                            if (c211729Zg != null) {
                                String str5 = c211729Zg.A03;
                                int i = c211729Zg.A01;
                                C38321qM c38321qM2 = c26833Bsv.A06;
                                if (c38321qM2 != null) {
                                    String A38 = c38321qM2.A38();
                                    if (A38 != null) {
                                        AbstractC167017dG.A1Q(A0r2, str5);
                                        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(c26833Bsv, A0r2), "instagram_organic_clips_remix_page_owner_tap");
                                        AbstractC25225BEi.A1M(EnumC39652Hih.A0B, A0f);
                                        AbstractC25225BEi.A1O(A0f, "clips_remix_page");
                                        String A382 = c38321qM.A38();
                                        if (A382 != null) {
                                            AbstractC25236BEt.A0r(A0f, A382);
                                            A0f.A9K("container_id", AbstractC166997dE.A0j(A38));
                                            User A2E = c38321qM.A2E(A0r2);
                                            C14360o3.A0A(A2E);
                                            A0f.AAK(C4SX.A00(A2E.getId()), "media_author_id");
                                            AbstractC25230BEn.A1C(A0f, i);
                                            A0f.AAP("media_tap_token", str5);
                                            AbstractC25234BEr.A10(A0f, c38321qM);
                                            User A2E2 = c38321qM.A2E(A0r2);
                                            if (A2E2 != null) {
                                                A0f.AAK(C4SX.A00(A2E2.getId()), "target_id");
                                                AbstractC167017dG.A1C(A0f);
                                            } else {
                                                throw AbstractC166987dD.A14("Required value was null.");
                                            }
                                        } else {
                                            throw AbstractC166987dD.A14("Required value was null.");
                                        }
                                    } else {
                                        throw AbstractC166987dD.A14("Required value was null.");
                                    }
                                }
                                str2 = "media";
                            }
                            C14360o3.A0F(str2);
                            throw C00O.createAndThrow();
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
                return C0eB.A00;
            case Process.SIGSTOP /* 19 */:
                C26833Bsv c26833Bsv2 = (C26833Bsv) this.A01;
                UserSession A0r3 = AbstractC166987dD.A0r(c26833Bsv2.A0G);
                C38321qM c38321qM3 = c26833Bsv2.A06;
                if (c38321qM3 != null) {
                    F7S.A00(c26833Bsv2, A0r3, c38321qM3, "clips_remix_page");
                    return C0eB.A00;
                }
                str2 = "media";
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 20:
                C26833Bsv c26833Bsv3 = (C26833Bsv) this.A01;
                C211729Zg c211729Zg2 = c26833Bsv3.A03;
                if (c211729Zg2 == null) {
                    str3 = "arguments";
                } else {
                    String str6 = c211729Zg2.A02;
                    Context requireContext2 = c26833Bsv3.requireContext();
                    UserSession A0r4 = AbstractC166987dD.A0r(c26833Bsv3.A0G);
                    C08790ch A002 = AbstractC018607g.A00(c26833Bsv3);
                    String str7 = c26833Bsv3.A0D;
                    C26912BuF c26912BuF = c26833Bsv3.A05;
                    if (c26912BuF == null) {
                        str3 = "remixPivotPagePerfLogger";
                    } else {
                        AbstractC167017dG.A1O(str6, A0r4);
                        C14360o3.A0B(str7, 5);
                        return new C27052BwW(requireContext2, A002, c26912BuF, c26833Bsv3, A0r4, str7, str6);
                    }
                }
                C14360o3.A0F(str3);
                throw C00O.createAndThrow();
            case 22:
                return AbstractC166997dE.A0c(C06090Tz.A05, (AbstractC12990ll) this.A01, 36317947102893790L);
            case 26:
                C26831Bst c26831Bst = (C26831Bst) this.A01;
                String str8 = c26831Bst.A03;
                if (str8 == null) {
                    str2 = "attributionAppId";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                FragmentActivity requireActivity2 = c26831Bst.requireActivity();
                UserSession A0r5 = AbstractC166987dD.A0r(c26831Bst.A0E);
                String str9 = c26831Bst.A0D;
                C08790ch A003 = AbstractC018607g.A00(c26831Bst);
                AbstractC167007dF.A1F(A0r5, 2, str9);
                return new C27050BwU(requireActivity2, A003, c26831Bst, A0r5, str9, str8, 0);
            case 27:
                C26864BtQ c26864BtQ = (C26864BtQ) this.A01;
                return new OVl(c26864BtQ.requireContext(), AbstractC018607g.A00(c26864BtQ), AbstractC166987dD.A0r(c26864BtQ.A04));
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return ((Fragment) this.A01).requireActivity().getDefaultViewModelProviderFactory();
            case 30:
                UserSession userSession = (UserSession) this.A01;
                C14360o3.A0B(userSession, 0);
                return new C27267C1k(userSession, new C27886CQx(userSession, AbstractC40691uc.A01(userSession)));
            case 31:
                return ((C8CV) this.A01).A00();
            case 32:
                C26854BtG c26854BtG = (C26854BtG) this.A01;
                return new C27053BwX(AbstractC166987dD.A0r(c26854BtG.A04), c26854BtG.requireArguments().getString("spins_author_name"), c26854BtG.requireArguments().getString("spins_content"), c26854BtG.requireArguments().getString("profile_pic_url"), c26854BtG.requireArguments().getString("spins_timestamp"), c26854BtG.requireArguments().getInt("spins_like_count"), c26854BtG.requireArguments().getBoolean("is_spins_liked"), c26854BtG.requireArguments().getBoolean("is_spin_author_reachable"));
            case 33:
                C189478aR c189478aR = ((C26854BtG) this.A01).A00;
                if (c189478aR != null) {
                    c189478aR.A07();
                }
                return C0eB.A00;
            case 38:
                return new C28179CbR((UserSession) this.A01);
            case 39:
                return AnonymousClass229.A01(((C28179CbR) this.A01).A01);
            case 40:
                return new OJ6((UserSession) this.A01);
            case Seq.NULL_REFNUM /* 41 */:
                AbstractC52922bZ abstractC52922bZ = (AbstractC52922bZ) this.A01;
                AbstractC166987dD.A1Z(new PXT(abstractC52922bZ, null, 1), AbstractC141776au.A00(abstractC52922bZ));
                return C0eB.A00;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                C26861BtN c26861BtN = (C26861BtN) this.A01;
                String string = c26861BtN.requireArguments().getString("stripped_media_id");
                String str10 = "";
                if (string == null) {
                    string = "";
                }
                String string2 = c26861BtN.requireArguments().getString("element_id");
                if (string2 != null) {
                    str10 = string2;
                }
                UserSession A0r6 = AbstractC166987dD.A0r(c26861BtN.A04);
                C14360o3.A0B(A0r6, 2);
                return new C27035BwF(A0r6, string, str10);
            case 43:
                return new C28179CbR(AbstractC166987dD.A0r(((C26861BtN) this.A01).A04));
            case 44:
                C26861BtN c26861BtN2 = (C26861BtN) this.A01;
                AbstractC41776Ies.A03(c26861BtN2.requireContext(), MSV.A00(1235));
                C448124l c448124l = ((C22C) ((C28179CbR) c26861BtN2.A03.getValue()).A02.getValue()).A09;
                C25531Mh A08 = C25531Mh.A08(c448124l.A01);
                if (AbstractC25226BEj.A1Z(A08)) {
                    A08.A0s("IG_CAMERA_ENTITY_TAP");
                    A08.A0q("SPINS_LEARN_MORE");
                    C448124l.A00(A08, c448124l);
                    A08.A0t(AbstractC25225BEi.A14());
                    A08.A0b(C22P.A1a);
                    A08.A0a(EnumC114925Hg.CLIPS_SPIN);
                    A08.Cht();
                }
                return C0eB.A00;
            case 48:
                return new LinearLayoutManager(((Fragment) this.A01).requireContext(), 1, false);
            case 49:
                return Integer.valueOf(AbstractC166997dE.A0N((Fragment) this.A01).getDimensionPixelSize(R.dimen.action_bar_item_spacing_left));
        }
    }
}
