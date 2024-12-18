package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class P13 implements InterfaceC58169PqZ {
    public OL2 A00;
    public final AbstractC59962oe A01;
    public final InterfaceC41501vz A02;
    public final UserSession A03;
    public final AnonymousClass840 A04;
    public final AnonymousClass841 A05;
    public final C52458NJc A06;
    public final C55904Ort A07;
    public final NKA A08;
    public final NKI A09;
    public final InterfaceC58310Pt2 A0A;
    public final ODM A0B;
    public final C55099ObA A0C;
    public final C52253NAt A0D;
    public final String A0E;
    public final boolean A0F;
    public final EnumC53380NjV A0G;
    public final C81X A0H;

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        IgImageView igImageView;
        SpinnerImageView spinnerImageView;
        IgSimpleImageView igSimpleImageView;
        RecyclerView recyclerView;
        Context requireContext = this.A01.requireContext();
        UserSession userSession = this.A03;
        AnonymousClass840 anonymousClass840 = this.A04;
        C55099ObA c55099ObA = this.A0C;
        C52458NJc c52458NJc = this.A06;
        AnonymousClass841 anonymousClass841 = this.A05;
        OL2 ol2 = new OL2(requireContext, userSession, anonymousClass840, c55099ObA, new C55910Os2(userSession, anonymousClass840, anonymousClass841, c52458NJc, c55099ObA, this.A0E, new C30481DbQ(this, 20)), AbstractC55108ObP.A02(userSession, anonymousClass841, c52458NJc.A00, c55099ObA));
        this.A00 = ol2;
        Context context = ol2.A00;
        IgLinearLayout igLinearLayout = new IgLinearLayout(context);
        igLinearLayout.setOrientation(1);
        AbstractC50522MSa.A0z(igLinearLayout);
        C55099ObA c55099ObA2 = ol2.A01;
        View inflate = LayoutInflater.from(context).inflate(R.layout.tag_products_button, (ViewGroup) null);
        c55099ObA2.A01 = inflate;
        c55099ObA2.A02 = AbstractC166987dD.A0e(inflate, R.id.metadata_textview_product);
        c55099ObA2.A03 = AbstractC166987dD.A0e(c55099ObA2.A01, R.id.subtitle);
        c55099ObA2.A00 = c55099ObA2.A01.findViewById(R.id.badge);
        View view = c55099ObA2.A01;
        view.getClass();
        c55099ObA2.A05 = MSX.A0I(view, R.id.tag_products_row_icon);
        View view2 = c55099ObA2.A01;
        view2.getClass();
        c55099ObA2.A04 = MSX.A0I(view2, R.id.chevron_icon);
        OJZ ojz = c55099ObA2.A0C;
        if (ojz != null) {
            ojz.A00(c55099ObA2.A01);
        }
        IgSimpleImageView igSimpleImageView2 = c55099ObA2.A05;
        if (igSimpleImageView2 != null) {
            igSimpleImageView2.setVisibility(0);
        }
        View view3 = c55099ObA2.A00;
        if ((view3 == null || view3.getVisibility() != 0) && (((igImageView = c55099ObA2.A06) == null || igImageView.getVisibility() != 0) && (((spinnerImageView = c55099ObA2.A08) == null || spinnerImageView.getVisibility() != 0) && (igSimpleImageView = c55099ObA2.A04) != null))) {
            igSimpleImageView.setVisibility(0);
        }
        igLinearLayout.addView(c55099ObA2.A01);
        View inflate2 = LayoutInflater.from(context).inflate(R.layout.product_suggestions_row, (ViewGroup) null);
        if ((inflate2 instanceof RecyclerView) && (recyclerView = (RecyclerView) inflate2) != null) {
            igLinearLayout.addView(recyclerView);
            ol2.A02.A00(recyclerView);
        }
        return igLinearLayout;
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return this.A0G;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A0H;
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
        Integer num;
        int intValue;
        NKI nki = this.A09;
        C19L c19l = nki.A05;
        PZW pzw = new PZW((Object) nki, (InterfaceC23621Ds) null, 19, false);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, pzw, c19l);
        C52458NJc c52458NJc = this.A06;
        C47Z c47z = c52458NJc.A00;
        if (c47z != null) {
            UserSession userSession = this.A03;
            EnumC40111tc enumC40111tc = c47z.A1G;
            ArrayList arrayList = c47z.A41;
            AnonymousClass841 anonymousClass841 = this.A05;
            if (AbstractC55108ObP.A01(userSession, anonymousClass841, enumC40111tc, "ProductTagFeedRowItem", arrayList) && C18U.A06(C06090Tz.A05, userSession, 36310340715282456L)) {
                ODM odm = this.A0B;
                C006802i c006802i = odm.A01;
                C14360o3.A06(c006802i);
                java.util.Set set = odm.A03;
                C14360o3.A0B(set, 2);
                if (set.contains(37358359)) {
                    c006802i.markerEnd(37358359, (short) 111);
                }
                set.add(37358359);
                c006802i.markerStart(37358359);
                c006802i.markerAnnotate(37358359, "input_type", odm.A02);
                c006802i.markerAnnotate(37358359, "media_count", odm.A00);
                if (C55183Odo.A00(anonymousClass841, true) <= 3) {
                    C47Z A04 = c52458NJc.A04();
                    NKA nka = this.A08;
                    nki.A08(this.A01, A04, odm, nka.A04, nka.A00);
                }
            }
        }
        OL2 ol2 = this.A00;
        if (ol2 != null) {
            ol2.A01();
            C08730cb c08730cb = C17060sy.A01;
            UserSession userSession2 = this.A03;
            boolean A1S = AbstractC25230BEn.A1S(c08730cb.A01(userSession2).A0T().indexOf(EnumC199318rY.A05), -1);
            boolean A1S2 = AbstractC25230BEn.A1S(c08730cb.A01(userSession2).A0T().indexOf(EnumC199318rY.A07), -1);
            if (!A1S && !A1S2) {
                if (AbstractC55229Oez.A0K(userSession2, false)) {
                    num = C05F.A0u;
                } else {
                    num = C05F.A00;
                }
            } else {
                num = C05F.A0C;
            }
            AbstractC59962oe abstractC59962oe = this.A01;
            if (abstractC59962oe.mView != null) {
                OL2 ol22 = this.A00;
                if (ol22 != null) {
                    if (ol22.A01.A05() && (this.A0F || (((intValue = num.intValue()) == 1 || intValue == 2 || intValue == 6) && this.A0D.A01(num)))) {
                        C52253NAt c52253NAt = this.A0D;
                        View requireView = abstractC59962oe.requireView();
                        OL2 ol23 = this.A00;
                        if (ol23 != null) {
                            View view = ol23.A01.A01;
                            if (view != null) {
                                c52253NAt.A00(abstractC59962oe.requireActivity(), requireView, view, num);
                            } else {
                                throw AbstractC166997dE.A0g();
                            }
                        }
                    }
                }
            }
            C07S c07s = C07S.STARTED;
            C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
            C07X A0K = AbstractC31173DnH.A0K(abstractC59962oe, anonymousClass191, C57173PZr.A02(viewLifecycleOwner, c07s, this, null, 45), C07Y.A00(viewLifecycleOwner));
            AbstractC23641Du.A05(anonymousClass191, C57173PZr.A02(A0K, c07s, this, null, 46), C07Y.A00(A0K));
            abstractC59962oe.mLifecycleRegistry.A09(new C50623MWk(this, 3));
            return;
        }
        C14360o3.A0F("tagProductsSection");
        throw C00O.createAndThrow();
    }

    public P13(AbstractC59962oe abstractC59962oe, UserSession userSession, AnonymousClass840 anonymousClass840, AnonymousClass841 anonymousClass841, C52458NJc c52458NJc, C55904Ort c55904Ort, NKA nka, NKI nki, InterfaceC58310Pt2 interfaceC58310Pt2, ODM odm, C55099ObA c55099ObA, C52253NAt c52253NAt, String str) {
        JQ0.A1O(userSession, abstractC59962oe, c55099ObA, c52253NAt, c55904Ort);
        C14360o3.A0B(nka, 6);
        AbstractC25234BEr.A0l(8, odm, str, anonymousClass841, anonymousClass840);
        C14360o3.A0B(interfaceC58310Pt2, 13);
        this.A03 = userSession;
        this.A01 = abstractC59962oe;
        this.A0C = c55099ObA;
        this.A0D = c52253NAt;
        this.A07 = c55904Ort;
        this.A08 = nka;
        this.A09 = nki;
        this.A0B = odm;
        this.A0E = str;
        this.A05 = anonymousClass841;
        this.A04 = anonymousClass840;
        this.A06 = c52458NJc;
        this.A0A = interfaceC58310Pt2;
        this.A0F = C6WI.A01().A0X;
        this.A02 = C56035Ou7.A00(this, 68);
        this.A0H = C81X.A2f;
        this.A0G = EnumC53380NjV.A0M;
    }
}
