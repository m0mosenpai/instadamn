package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.api.schemas.WorldLocationPagesInfo;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.io.Serializable;
import java.util.List;

/* renamed from: X.N5b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52128N5b extends AbstractC59962oe implements InterfaceC11380iw, InterfaceC60442pS, InterfaceC71918XAc {
    public static final String __redex_internal_original_name = "WorldPagesDetailFragment";
    public Nj6 A00;
    public C68034V7f A01;
    public C38321qM A02;
    public C38E A03;
    public GradientSpinnerAvatarView A04;
    public final InterfaceC09390do A07;
    public final String A05 = __redex_internal_original_name;
    public final InterfaceC09390do A08 = AbstractC60492pY.A02(this);
    public final String A06 = AbstractC167017dG.A0j();

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v2, types: [X.2y7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v21, types: [X.2zJ, java.lang.Object] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer num;
        String str;
        Integer num2;
        WorldLocationPagesInfo CHs;
        Integer BF1;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView A0N = AbstractC167007dF.A0N(view, R.id.meta_horizon_label);
        TextView A0N2 = AbstractC167007dF.A0N(view, R.id.presence_count);
        View A0R = AbstractC166997dE.A0R(view, R.id.presence_container);
        TextView A0N3 = AbstractC167007dF.A0N(view, R.id.world_name);
        TextView A0N4 = AbstractC167007dF.A0N(view, R.id.posts_count);
        View A0S = AbstractC166997dE.A0S(view, R.id.more_icon);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) view.requireViewById(R.id.world_pages_gradient_spinner_avatar);
        this.A04 = gradientSpinnerAvatarView;
        if (gradientSpinnerAvatarView != null) {
            gradientSpinnerAvatarView.setGradientSpinnerActivated(false);
        }
        InterfaceC09390do interfaceC09390do = this.A08;
        C38E c38e = new C38E(this, AbstractC166987dD.A0r(interfaceC09390do), new C38C(this));
        c38e.A0C = AbstractC166997dE.A0n();
        this.A03 = c38e;
        Context context = view.getContext();
        SpannableStringBuilder A05 = AbstractC31175DnJ.A05(context, 2131977121);
        String A0p = AbstractC166997dE.A0p(context, 2131977121);
        Context context2 = getContext();
        if (context2 != null) {
            num = AbstractC31174DnI.A0q(context2, AbstractC53242c7.A06(getContext()));
        } else {
            num = null;
        }
        AnonymousClass773.A05(A05, new NY0(num, this, 33), A0p);
        A0N.setText(A05);
        AbstractC010103p.A07(A0N);
        AbstractC25227BEk.A11(A0N);
        C38321qM c38321qM = this.A02;
        String str2 = "entryMedia";
        if (c38321qM != null) {
            InterfaceC43580JMo A0t = AbstractC25226BEj.A0t(c38321qM);
            if (A0t != null && (BF1 = A0t.BF1()) != null && BF1.intValue() > 0) {
                AbstractC31177DnL.A0r(context, A0N2, BF1, 2131977122);
                A0R.setVisibility(0);
            }
            C38321qM c38321qM2 = this.A02;
            if (c38321qM2 != null) {
                InterfaceC43580JMo A0t2 = AbstractC25226BEj.A0t(c38321qM2);
                if (A0t2 == null || (str = A0t2.getIconicHorizonWorldName()) == null) {
                    C38321qM c38321qM3 = this.A02;
                    if (c38321qM3 != null) {
                        InterfaceC43580JMo A0t3 = AbstractC25226BEj.A0t(c38321qM3);
                        if (A0t3 != null) {
                            str = A0t3.getAttributionTitle();
                        } else {
                            str = null;
                        }
                    }
                }
                A0N3.setText(str);
                C38321qM c38321qM4 = this.A02;
                if (c38321qM4 != null) {
                    InterfaceC43580JMo A0t4 = AbstractC25226BEj.A0t(c38321qM4);
                    if (A0t4 != null && (CHs = A0t4.CHs()) != null) {
                        num2 = CHs.Ber();
                    } else {
                        num2 = null;
                    }
                    AbstractC31177DnL.A0r(context, A0N4, AbstractC43744JWe.A01(context.getResources(), num2, false), 2131969867);
                    UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                    EnumC68206VFy enumC68206VFy = EnumC68206VFy.A08;
                    List A1J = AbstractC166987dD.A1J(enumC68206VFy);
                    InterfaceC09390do interfaceC09390do2 = this.A07;
                    this.A01 = C68034V7f.A01(A0r, enumC68206VFy, P2E.A00, new C1571273r(), (C51056MhA) interfaceC09390do2.getValue(), A1J);
                    FragmentActivity requireActivity = requireActivity();
                    UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                    String str3 = this.A06;
                    JIG A00 = AbstractC53972Ntj.A00(requireActivity, A0r2, this, str3, -1L, false, true);
                    C57112jm A0E = AbstractC37301Gc2.A0E();
                    interfaceC09390do.getValue();
                    ILK ilk = new ILK(A0E, new C41587Iaa(this, AbstractC166987dD.A0r(interfaceC09390do), null, null, str3));
                    UserSession A0r3 = AbstractC166987dD.A0r(interfaceC09390do);
                    C52510NLd c52510NLd = new C52510NLd(this);
                    C42426IqT c42426IqT = new C42426IqT(ilk, 3);
                    C37835Gkp c37835Gkp = new C37835Gkp();
                    C68034V7f c68034V7f = this.A01;
                    str2 = "dataSource";
                    if (c68034V7f != null) {
                        AbstractC167007dF.A1J(A0r3, 2, str3);
                        C66392zG A002 = AbstractC38092GpL.A00(requireContext(), this, A0r3, new Object(), c37835Gkp, c52510NLd, c68034V7f, c42426IqT, A00, this, null, str3, false, false);
                        A002.A01(new Object());
                        FragmentActivity requireActivity2 = requireActivity();
                        C51056MhA c51056MhA = (C51056MhA) interfaceC09390do2.getValue();
                        C68034V7f c68034V7f2 = this.A01;
                        if (c68034V7f2 != null) {
                            C66095TzW c66095TzW = new C66095TzW(requireActivity2, this, A002, AbstractC166987dD.A0r(interfaceC09390do), c68034V7f2, null, null, null, null, c51056MhA, false, false);
                            C66101Tzc c66101Tzc = new C66101Tzc(AbstractC166987dD.A0r(interfaceC09390do));
                            c66101Tzc.A01(new P2B());
                            c66101Tzc.A06 = c66095TzW;
                            C68034V7f c68034V7f3 = this.A01;
                            if (c68034V7f3 != null) {
                                c66101Tzc.A08 = c68034V7f3;
                                c66101Tzc.A0A = A00;
                                c66101Tzc.A04 = this;
                                c66101Tzc.A02(C38U.A00);
                                c66101Tzc.A0N = false;
                                c66101Tzc.A00(A0E);
                                c66101Tzc.A0I = true;
                                C65823Tug c65823Tug = new C65823Tug(c66101Tzc);
                                c65823Tug.A05(view, true);
                                c65823Tug.A06((C51056MhA) interfaceC09390do2.getValue());
                                AbstractC31176DnK.A0F(view).A12(new C55587OmQ());
                                C57312k6 A0a = AbstractC25229BEm.A0a(this);
                                PYu pYu = new PYu(this, null, 43);
                                AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
                                AbstractC23641Du.A05(anonymousClass191, pYu, A0a);
                                AbstractC23641Du.A05(anonymousClass191, new PYu(this, null, 44), AbstractC25229BEm.A0a(this));
                                C68034V7f c68034V7f4 = this.A01;
                                if (c68034V7f4 != null) {
                                    c68034V7f4.A08(enumC68206VFy, true);
                                    ((C51056MhA) interfaceC09390do2.getValue()).A00();
                                    GradientSpinnerAvatarView gradientSpinnerAvatarView2 = this.A04;
                                    if (gradientSpinnerAvatarView2 != null) {
                                        gradientSpinnerAvatarView2.A09();
                                    }
                                    C51056MhA c51056MhA2 = (C51056MhA) interfaceC09390do2.getValue();
                                    NST nst = c51056MhA2.A00;
                                    AbstractC23641Du.A04(anonymousClass191, new PZ1(nst, c51056MhA2.A01, null, 48), ((C4A7) nst).A01).CPD(new C30179DRk(nst, 33));
                                    ViewOnClickListenerC55463OkI.A00(A0S, 26, this);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC71918XAc
    public final void Drm(EnumC68206VFy enumC68206VFy) {
        C68034V7f c68034V7f = this.A01;
        if (c68034V7f == null) {
            C14360o3.A0F("dataSource");
            throw C00O.createAndThrow();
        }
        c68034V7f.A08(enumC68206VFy, true);
        InterfaceC09390do interfaceC09390do = this.A07;
        ((C51056MhA) interfaceC09390do.getValue()).A02.Egh(enumC68206VFy);
        if (MSW.A1B(((C51056MhA) interfaceC09390do.getValue()).A03).isEmpty()) {
            ((C51056MhA) interfaceC09390do.getValue()).A00();
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A05;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A08);
    }

    public C52128N5b() {
        C29892DGg c29892DGg = new C29892DGg(this, 18);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C29892DGg(new C29892DGg(this, 19), 20));
        this.A07 = AbstractC25225BEi.A0a(new C29892DGg(A00, 21), c29892DGg, new C29895DGj(36, null, A00), AbstractC25225BEi.A1D(C51056MhA.class));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        int A02 = C0f9.A02(-818279479);
        super.onCreate(bundle);
        Serializable serializable = requireArguments().getSerializable("arg_entry_surface");
        C14360o3.A0C(serializable, "null cannot be cast to non-null type com.facebook.analytics.structuredlogger.enums.IgWorldPagesSurface");
        this.A00 = (Nj6) serializable;
        C1DX A0Z = AbstractC31176DnK.A0Z(this.A08);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            str = bundle2.getString("arg_entry_media_id");
        } else {
            str = null;
        }
        C38321qM A022 = A0Z.A02(str);
        if (A022 != null) {
            this.A02 = A022;
            C0f9.A09(-2127785999, A02);
        } else {
            IllegalArgumentException A12 = AbstractC166987dD.A12("Entry Media must be provided");
            C0f9.A09(-605663146, A02);
            throw A12;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(64668512);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_world_pages_detail, viewGroup, false);
        C0f9.A09(-56020782, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1885723079);
        super.onDestroy();
        this.A04 = null;
        C0f9.A09(1717560908, A02);
    }
}
