package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.ClipsTemplateBrowserV2Type;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class PKR implements InterfaceC43458JHw {
    public final /* synthetic */ C52161N6n A00;

    @Override // X.InterfaceC43458JHw
    public final void D58(C38321qM c38321qM, O9V o9v, List list, int i) {
        long parseLong;
        C24H c24h;
        C24H c24h2;
        int i2;
        C22P c22p;
        C24H c24h3;
        List BsT;
        InterfaceC110104xf AdG;
        String templateMediaId;
        Long A0j;
        C14360o3.A0B(c38321qM, 0);
        C52161N6n c52161N6n = this.A00;
        String A00 = c52161N6n.A00(c38321qM);
        InterfaceC09390do interfaceC09390do = c52161N6n.A0I;
        C22C A0T = AbstractC43593JPy.A0T(interfaceC09390do);
        interfaceC09390do.getValue();
        InterfaceC110214xq A1R = c38321qM.A1R();
        if (A1R != null && (AdG = A1R.AdG()) != null && (templateMediaId = AdG.getTemplateMediaId()) != null && (A0j = AbstractC166997dE.A0j(templateMediaId)) != null) {
            parseLong = A0j.longValue();
        } else {
            String A38 = c38321qM.A38();
            if (A38 != null) {
                parseLong = Long.parseLong(A38);
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        ((C22F) A0T).A04.A0H = Long.valueOf(parseLong);
        C22C A0T2 = AbstractC43593JPy.A0T(interfaceC09390do);
        Serializable serializable = c52161N6n.requireArguments().getSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        if (serializable == null) {
            c24h = C24H.UNKNOWN;
        } else {
            c24h = (C24H) serializable;
        }
        ((C22F) A0T2).A04.A0D = c24h;
        ((C22F) AbstractC43593JPy.A0T(interfaceC09390do)).A04.A0V = A00;
        C22C A0T3 = AbstractC43593JPy.A0T(interfaceC09390do);
        String A382 = c38321qM.A38();
        if (A382 != null) {
            Serializable serializable2 = c52161N6n.requireArguments().getSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            if (serializable2 == null) {
                c24h2 = C24H.UNKNOWN;
            } else {
                c24h2 = (C24H) serializable2;
            }
            C448124l c448124l = A0T3.A09;
            C14360o3.A0B(c24h2, 1);
            C25531Mh A0G = MSW.A0G(c448124l);
            C22M c22m = c448124l.A04;
            EnumC50631MWs enumC50631MWs = c22m.A0C;
            if (AbstractC25226BEj.A1Z(A0G) && c448124l.A0J() != null && enumC50631MWs != null) {
                MSW.A1W(A0G);
                MSZ.A1I(A0G, c448124l, "TEMPLATE_MEDIA_TAP");
                AbstractC167007dF.A14(A0G, c22m);
                MSW.A1P(enumC50631MWs, A0G);
                AbstractC167007dF.A13(A0G);
                A0G.A0Q("clips_template_media_id", AbstractC166997dE.A0j(A382));
                A0G.A0M(c24h2, "template_browser_entry_point");
                A0G.A0R("template_browser_view", "UNKNOWN");
                A0G.A0R("template_browser_section", A00);
                A0G.Cht();
            }
            c52161N6n.A02 = MSZ.A0X(AbstractC183548Cd.A00(c52161N6n.requireActivity(), AbstractC166987dD.A0r(interfaceC09390do)), c52161N6n.requireActivity());
            interfaceC09390do.getValue();
            InterfaceC110214xq A1R2 = c38321qM.A1R();
            if (A1R2 != null && (BsT = A1R2.BsT()) != null) {
                i2 = BsT.size();
            } else {
                i2 = 0;
            }
            if (((C22F) AbstractC43593JPy.A0T(interfaceC09390do)).A04.A09 != C22P.A5N) {
                C89P c89p = c52161N6n.A02;
                if (c89p != null) {
                    c89p.A02 = ((C22F) AbstractC43593JPy.A0T(interfaceC09390do)).A04.A09;
                }
                C14360o3.A0F("clipsTemplateViewModel");
                throw C00O.createAndThrow();
            }
            c52161N6n.A03 = c38321qM;
            ArrayList parcelableArrayList = c52161N6n.requireArguments().getParcelableArrayList("ClipsConstants.ARGS_PREFILL_MEDIUMS");
            c52161N6n.A05 = parcelableArrayList;
            if (parcelableArrayList != null && parcelableArrayList.size() > 0 && i2 < parcelableArrayList.size()) {
                C9GR.A07(c52161N6n.getContext(), 2131969904);
                return;
            }
            Object obj = c52161N6n.requireArguments().get("ARGS_CAMERA_ENTRY_POINT");
            if (!(obj instanceof C22P) || (c22p = (C22P) obj) == null) {
                C89P c89p2 = c52161N6n.A02;
                if (c89p2 != null) {
                    c22p = c89p2.A02;
                    if (c22p == null) {
                        c22p = ((C22F) AbstractC43593JPy.A0T(interfaceC09390do)).A04.A09;
                        C14360o3.A07(c22p);
                    }
                }
                C14360o3.A0F("clipsTemplateViewModel");
                throw C00O.createAndThrow();
            }
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
            FragmentActivity requireActivity = c52161N6n.requireActivity();
            Serializable serializable3 = c52161N6n.requireArguments().getSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            if (serializable3 == null) {
                c24h3 = C24H.UNKNOWN;
            } else {
                c24h3 = (C24H) serializable3;
            }
            AbstractC40927IAz.A00(requireActivity, c52161N6n, c22p, c24h3, A0r, c38321qM, c52161N6n.A05, false);
            return;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public PKR(C52161N6n c52161N6n) {
        this.A00 = c52161N6n;
    }

    @Override // X.InterfaceC43458JHw
    public final void D57(C38514GwZ c38514GwZ, String str) {
        MSX.A0X(this.A00).A0G(c38514GwZ);
    }

    @Override // X.InterfaceC43458JHw
    public final void D59(C120985dq c120985dq, IgSimpleImageView igSimpleImageView, IgImageView igImageView, C38321qM c38321qM) {
        EnumC77213d7 enumC77213d7;
        C50983Mfq c50983Mfq;
        EnumC77213d7 enumC77213d72;
        AbstractC167017dG.A1R(igSimpleImageView, igImageView);
        if (!c38321qM.CcN()) {
            enumC77213d7 = EnumC77213d7.A04;
        } else {
            enumC77213d7 = EnumC77213d7.A03;
        }
        C52161N6n c52161N6n = this.A00;
        InterfaceC09390do interfaceC09390do = c52161N6n.A0F;
        if (interfaceC09390do.getValue() == ClipsTemplateBrowserV2Type.A04) {
            C50983Mfq c50983Mfq2 = (C50983Mfq) c52161N6n.A0J.getValue();
            if (c50983Mfq2 != null) {
                c50983Mfq2.A00(c120985dq, enumC77213d7);
            }
        } else if (interfaceC09390do.getValue() == ClipsTemplateBrowserV2Type.A05 && (c50983Mfq = (C50983Mfq) c52161N6n.A0J.getValue()) != null) {
            c50983Mfq.A01(c38321qM);
        }
        C50999Mg6 c50999Mg6 = (C50999Mg6) c52161N6n.A0L.getValue();
        Context requireContext = c52161N6n.requireContext();
        UserSession A0r = AbstractC166987dD.A0r(c52161N6n.A0I);
        Map map = c52161N6n.A0A;
        Gt6 A0X = MSX.A0X(c52161N6n);
        C50983Mfq c50983Mfq3 = (C50983Mfq) c52161N6n.A0J.getValue();
        ClipsTemplateBrowserV2Type clipsTemplateBrowserV2Type = (ClipsTemplateBrowserV2Type) interfaceC09390do.getValue();
        AbstractC167007dF.A1H(A0r, 5, map);
        C14360o3.A0B(A0X, 8);
        if (!c38321qM.CcN()) {
            enumC77213d72 = EnumC77213d7.A04;
        } else {
            enumC77213d72 = EnumC77213d7.A03;
        }
        C50999Mg6.A00(requireContext, c120985dq, A0r, c38321qM, c52161N6n, enumC77213d72, A0X, c50999Mg6, map);
        C31349DqE c31349DqE = c50999Mg6.A00;
        if (c31349DqE != null) {
            AbstractC31177DnL.A1L(c31349DqE);
        }
        C146106i8 A0K = AbstractC31171DnF.A0K();
        int i = 2131975258;
        if (enumC77213d72 == EnumC77213d7.A04) {
            i = 2131975251;
        }
        AbstractC25226BEj.A1N(requireContext, A0K, i);
        Drawable drawable = igImageView.getDrawable();
        if (drawable == null) {
            drawable = new ColorDrawable(0);
        }
        A0K.A04 = drawable;
        A0K.A03();
        AbstractC31175DnJ.A0l(requireContext, A0K, 2131975257);
        A0K.A0A(new P3P(requireContext, clipsTemplateBrowserV2Type, c120985dq, A0r, igSimpleImageView, c38321qM, c52161N6n, enumC77213d72, c50983Mfq3, A0X, c50999Mg6, map));
        A0K.A0L = true;
        C31349DqE A00 = A0K.A00();
        c50999Mg6.A00 = A00;
        AbstractC166997dE.A1O(C41451vu.A01, A00);
    }

    @Override // X.InterfaceC43458JHw
    public final void D5A(C38514GwZ c38514GwZ) {
        this.A00.A0K.getValue();
        J23 j23 = c38514GwZ.A01;
        if (j23 != null) {
            j23.A00();
        }
        c38514GwZ.A01 = null;
    }
}
