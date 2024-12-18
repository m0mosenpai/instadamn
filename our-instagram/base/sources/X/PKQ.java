package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.save.api.SaveApiUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class PKQ implements InterfaceC43458JHw {
    public final /* synthetic */ C52159N6l A00;

    @Override // X.InterfaceC43458JHw
    public final void D57(C38514GwZ c38514GwZ, String str) {
        String str2;
        Long l;
        C52159N6l c52159N6l = this.A00;
        ((Gt6) c52159N6l.A0D.getValue()).A0G(c38514GwZ);
        AbstractC12990ll A0o = AbstractC166987dD.A0o(c52159N6l.A0M);
        C38321qM c38321qM = c38514GwZ.A00;
        if (c38321qM != null) {
            str2 = c38321qM.A2u();
        } else {
            str2 = null;
        }
        int bindingAdapterPosition = c38514GwZ.getBindingAdapterPosition();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31172DnG.A0Q(c52159N6l, A0o, 0), "instagram_organic_creator_inspiration_hub_reels_preview");
        try {
            if (A0f.isSampled()) {
                A0f.AAP("containermodule", "creator_inspiration_hub_reels");
                if (str2 == null) {
                    l = null;
                } else {
                    l = AbstractC166997dE.A0j(str2);
                }
                AbstractC37300Gc1.A0h(A0f, l);
                AbstractC25230BEn.A1C(A0f, bindingAdapterPosition);
                AbstractC37302Gc3.A0t(A0f);
                A0f.AAP("section_type", str);
                A0f.AAP("tab_type", "clips");
                A0f.Cht();
            }
        } catch (NumberFormatException unused) {
        }
    }

    @Override // X.InterfaceC43458JHw
    public final void D58(C38321qM c38321qM, O9V o9v, List list, int i) {
        String str;
        Long l;
        AbstractC167007dF.A1D(c38321qM, 0, o9v);
        C52159N6l c52159N6l = this.A00;
        InterfaceC09390do interfaceC09390do = c52159N6l.A0M;
        C116875Qr c116875Qr = new C116875Qr(ClipsViewerSource.A0p, AbstractC166987dD.A0r(interfaceC09390do));
        c116875Qr.A1D = c38321qM.getId();
        c116875Qr.A0o = o9v.A01;
        c116875Qr.A1d = false;
        c116875Qr.A0q = "creator_inspiration_hub_reels";
        if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do), 36323908517113528L)) {
            str = o9v.A00;
            c52159N6l.A03 = str;
            c116875Qr.A1G = str;
        } else {
            ArrayList A0q = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C38321qM A0i = AbstractC31172DnG.A0i(it);
                if (A0i != null) {
                    AbstractC31176DnK.A0Z(interfaceC09390do).A03(A0i);
                    String id = A0i.getId();
                    if (id != null) {
                        A0q.add(id);
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
            AbstractC31176DnK.A0Z(interfaceC09390do).A03(c38321qM);
            ImmutableList.Builder builder = new ImmutableList.Builder();
            builder.addAll(A0q);
            c116875Qr.A0B = builder.build();
            Map map = c52159N6l.A0A;
            str = o9v.A00;
            c116875Qr.A0j = AbstractC166987dD.A1A(str, map);
        }
        C77453dV.A06(c52159N6l.requireActivity(), c116875Qr.A00(), AbstractC166987dD.A0r(interfaceC09390do), 201);
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        String A2u = c38321qM.A2u();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31172DnG.A0Q(c52159N6l, A0o, 0), "instagram_organic_creator_inspiration_hub_reels_tap");
        try {
            if (A0f.isSampled()) {
                AbstractC25225BEi.A1M(EnumC39652Hih.A0L, A0f);
                AbstractC25233BEq.A17(A0f, "containermodule", "creator_inspiration_hub_reels");
                if (A2u == null) {
                    l = null;
                } else {
                    l = AbstractC166997dE.A0j(A2u);
                }
                AbstractC37300Gc1.A0h(A0f, l);
                A0f.AAP("section_type", str);
                A0f.AAP("tab_type", "clips");
                AbstractC25230BEn.A1C(A0f, i);
                A0f.Cht();
            }
        } catch (NumberFormatException unused) {
        }
    }

    @Override // X.InterfaceC43458JHw
    public final void D59(C120985dq c120985dq, IgSimpleImageView igSimpleImageView, IgImageView igImageView, C38321qM c38321qM) {
        EnumC77213d7 enumC77213d7;
        int i;
        C14360o3.A0B(igSimpleImageView, 2);
        C52159N6l c52159N6l = this.A00;
        C25852Bc7 c25852Bc7 = (C25852Bc7) c52159N6l.A0F.getValue();
        Context requireContext = c52159N6l.requireContext();
        FragmentActivity requireActivity = c52159N6l.requireActivity();
        UserSession A0r = AbstractC166987dD.A0r(c52159N6l.A0M);
        boolean A1a = AbstractC31175DnJ.A1a(A0r);
        c25852Bc7.A00 = igSimpleImageView;
        if (!SaveApiUtil.A09(A0r, c38321qM)) {
            enumC77213d7 = EnumC77213d7.A04;
        } else {
            enumC77213d7 = EnumC77213d7.A03;
        }
        c38321qM.Ed3(enumC77213d7);
        C1DW.A00(A0r).A01(c38321qM, A1a, false);
        EnumC77213d7 enumC77213d72 = EnumC77213d7.A04;
        if (enumC77213d7 == enumC77213d72) {
            AbstractC166997dE.A19(requireContext, igSimpleImageView, R.drawable.instagram_save_pano_filled_24);
            i = 2131975256;
        } else {
            AbstractC166997dE.A19(requireContext, igSimpleImageView, R.drawable.instagram_save_pano_outline_24);
            i = 2131975250;
        }
        AbstractC166997dE.A18(requireContext, igSimpleImageView, i);
        AbstractC166987dD.A1Z(new MC0(A0r, c38321qM, c52159N6l, requireActivity, requireContext, enumC77213d7, null, 10), AbstractC141776au.A00(c25852Bc7));
        if (enumC77213d7 == enumC77213d72) {
            FB6.A00().A06(requireActivity, A0r, c38321qM, c52159N6l, new C75113Zb(), new NXN(), 0, A1a);
        }
    }

    public PKQ(C52159N6l c52159N6l) {
        this.A00 = c52159N6l;
    }

    @Override // X.InterfaceC43458JHw
    public final void D5A(C38514GwZ c38514GwZ) {
        this.A00.A0D.getValue();
        J23 j23 = c38514GwZ.A01;
        if (j23 != null) {
            j23.A00();
        }
        c38514GwZ.A01 = null;
    }
}
