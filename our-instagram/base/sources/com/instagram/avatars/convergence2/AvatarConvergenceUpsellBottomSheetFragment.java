package com.instagram.avatars.convergence2;

import X.AbstractC09440dt;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167027dH;
import X.AbstractC18680vv;
import X.AbstractC25225BEi;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31180DnO;
import X.AbstractC43591JPw;
import X.AbstractC47193KtS;
import X.AbstractC59962oe;
import X.AbstractC60492pY;
import X.C00O;
import X.C07S;
import X.C07X;
import X.C07Y;
import X.C0f9;
import X.C14360o3;
import X.C148236lt;
import X.C37048GUe;
import X.EEN;
import X.EEO;
import X.EnumC09460dv;
import X.EnumC143276dS;
import X.Fp1;
import X.InterfaceC09390do;
import X.InterfaceC56392iX;
import X.JZ8;
import X.MCQ;
import X.MHV;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* loaded from: classes6.dex */
public abstract class AvatarConvergenceUpsellBottomSheetFragment extends AbstractC59962oe {
    public int A00;
    public Resources A01;
    public View A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public ConstraintLayout A06;
    public IgImageView A07;
    public InterfaceC56392iX A08;
    public SpinnerImageView A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(10:5|6|7|(1:(2:10|11)(2:22|23))(8:24|(4:28|(1:30)(1:34)|(1:32)|33)|35|(4:39|(1:41)|(1:43)|44)|45|(1:49)|50|(1:52))|12|(1:14)|15|(1:17)|19|20))|56|6|7|(0)(0)|12|(0)|15|(0)|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00da, code lost:
    
        X.AbstractC167007dF.A0x(r13.A06);
        X.AbstractC167007dF.A0w(r13.A07);
        r2 = r13.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e6, code lost:
    
        if (r2 != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e8, code lost:
    
        X.AbstractC166997dE.A19(r13.requireContext(), r2, r13.A00);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00cd A[Catch: Exception -> 0x00da, TryCatch #0 {Exception -> 0x00da, blocks: (B:11:0x00c6, B:12:0x00c9, B:14:0x00cd, B:15:0x00d2, B:17:0x00d6, B:50:0x00b7), top: B:7:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d6 A[Catch: Exception -> 0x00da, TRY_LEAVE, TryCatch #0 {Exception -> 0x00da, blocks: (B:11:0x00c6, B:12:0x00c9, B:14:0x00cd, B:15:0x00d2, B:17:0x00d6, B:50:0x00b7), top: B:7:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.avatars.convergence2.AvatarConvergenceUpsellBottomSheetFragment r13, java.lang.String r14, X.InterfaceC23621Ds r15) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.convergence2.AvatarConvergenceUpsellBottomSheetFragment.A00(com.instagram.avatars.convergence2.AvatarConvergenceUpsellBottomSheetFragment, java.lang.String, X.1Ds):java.lang.Object");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        View view2;
        TextView textView;
        int i;
        int A01;
        int i2;
        int i3;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = AbstractC166997dE.A0N(this);
        this.A05 = AbstractC166997dE.A0T(view, R.id.avatar_convergence_upsell_title);
        this.A04 = AbstractC166997dE.A0T(view, R.id.avatar_convergence_upsell_subtitle);
        this.A03 = AbstractC166997dE.A0T(view, R.id.avatar_convergence_upsell_cta_button);
        this.A07 = AbstractC31172DnG.A0Z(view, R.id.avatar_convergence_no_avatar_upsell_icon);
        this.A08 = AbstractC31173DnH.A0U(view, R.id.avatar_convergence_upsell_secondary_cta_button);
        this.A02 = view.findViewById(R.id.bottom_sheet_drag_handle);
        this.A09 = (SpinnerImageView) view.findViewById(R.id.avatar_convergence_upsell_loading_spinner);
        this.A06 = (ConstraintLayout) view.findViewById(R.id.avatar_convergence_with_avatar_upsell_image_container);
        TextView textView2 = this.A05;
        if (textView2 != null) {
            Resources resources = this.A01;
            if (resources != null) {
                if (this instanceof EEO) {
                    i3 = AbstractC167027dH.A01(((EEO) this).A07);
                } else {
                    i3 = 2131956824;
                }
                textView2.setText(resources.getText(i3));
            }
            C14360o3.A0F("contextResources");
            throw C00O.createAndThrow();
        }
        TextView textView3 = this.A04;
        if (textView3 != null) {
            Resources resources2 = this.A01;
            if (resources2 != null) {
                if (this instanceof EEO) {
                    i2 = AbstractC167027dH.A01(((EEO) this).A06);
                } else {
                    i2 = 2131956823;
                }
                textView3.setText(resources2.getText(i2));
            }
            C14360o3.A0F("contextResources");
            throw C00O.createAndThrow();
        }
        TextView textView4 = this.A03;
        if (textView4 != null) {
            Resources resources3 = this.A01;
            if (resources3 != null) {
                if (this instanceof EEO) {
                    A01 = AbstractC167027dH.A01(((EEO) this).A03);
                } else {
                    A01 = AbstractC167027dH.A01(((EEN) this).A02);
                }
                textView4.setText(resources3.getText(A01));
            }
            C14360o3.A0F("contextResources");
            throw C00O.createAndThrow();
        }
        TextView textView5 = this.A03;
        if (textView5 != null) {
            Fp1.A00(textView5, 22, this);
        }
        boolean z = this instanceof EEO;
        if (!z || AbstractC167007dF.A1Z(((EEO) this).A05)) {
            InterfaceC56392iX interfaceC56392iX = this.A08;
            if (interfaceC56392iX != null) {
                interfaceC56392iX.setVisibility(0);
            }
            InterfaceC56392iX interfaceC56392iX2 = this.A08;
            if (interfaceC56392iX2 != null && (textView = (TextView) interfaceC56392iX2.getView()) != null) {
                Resources resources4 = this.A01;
                if (resources4 != null) {
                    if (z) {
                        i = AbstractC167027dH.A01(((EEO) this).A04);
                    } else {
                        i = 2131956822;
                    }
                    textView.setText(resources4.getText(i));
                }
                C14360o3.A0F("contextResources");
                throw C00O.createAndThrow();
            }
            InterfaceC56392iX interfaceC56392iX3 = this.A08;
            if (interfaceC56392iX3 != null && (view2 = interfaceC56392iX3.getView()) != null) {
                Fp1.A00(view2, 23, this);
            }
        }
        AbstractC167007dF.A0x(this.A02);
        InterfaceC09390do interfaceC09390do = this.A0B;
        if (AbstractC31180DnO.A1a(interfaceC09390do)) {
            AbstractC167007dF.A0x(this.A07);
            ConstraintLayout constraintLayout = this.A06;
            if (constraintLayout != null) {
                constraintLayout.setVisibility(4);
            }
            C07S c07s = C07S.STARTED;
            C07X viewLifecycleOwner = getViewLifecycleOwner();
            AbstractC166987dD.A1Z(new MCQ(viewLifecycleOwner, c07s, this, null, 31), C07Y.A00(viewLifecycleOwner));
            ((C148236lt) interfaceC09390do.getValue()).A02(EnumC143276dS.A0I);
            return;
        }
        IgImageView igImageView = this.A07;
        if (igImageView != null) {
            igImageView.setVisibility(0);
        }
        IgImageView igImageView2 = this.A07;
        if (igImageView2 == null) {
            return;
        }
        AbstractC166997dE.A19(requireContext(), igImageView2, this.A00);
    }

    public final String A01() {
        String str;
        if (this instanceof EEO) {
            str = ((EEO) this).A02;
        } else {
            str = ((EEN) this).A01;
        }
        if (str != null) {
            return str;
        }
        C14360o3.A0F("editorLoggingSurface");
        throw C00O.createAndThrow();
    }

    public void A02() {
        String str;
        JZ8 jz8 = AbstractC47193KtS.A01;
        UserSession A0r = AbstractC166987dD.A0r(this.A0A);
        FragmentActivity requireActivity = requireActivity();
        String A01 = A01();
        if (this instanceof EEO) {
            str = ((EEO) this).A01;
            if (str == null) {
                C14360o3.A0F("editorLoggingMechanism");
                throw C00O.createAndThrow();
            }
        } else {
            str = "mux_identity_sheet";
        }
        jz8.A02(requireActivity, null, A0r, A01, str, AbstractC43591JPw.A00(161));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0A);
    }

    public AvatarConvergenceUpsellBottomSheetFragment() {
        C37048GUe A00 = C37048GUe.A00(this, 48);
        InterfaceC09390do A002 = AbstractC09440dt.A00(EnumC09460dv.A02, C37048GUe.A00(C37048GUe.A00(this, 45), 46));
        this.A0B = AbstractC25225BEi.A0a(C37048GUe.A00(A002, 47), A00, new MHV(29, (Object) null, A002), AbstractC25225BEi.A1D(C148236lt.class));
        this.A00 = R.drawable.ig_avatars_style_2_g6_casual_alpha_style2;
        this.A0A = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-644064248);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.avatar_convergence_upsell_sheet_fragment, viewGroup, false);
        C0f9.A09(504430892, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onDestroyView() {
        int A02 = C0f9.A02(-1215805179);
        super.onDestroyView();
        this.A05 = null;
        this.A04 = null;
        this.A03 = null;
        this.A08 = null;
        this.A07 = null;
        this.A02 = null;
        this.A09 = null;
        this.A06 = null;
        C0f9.A09(1717475448, A02);
    }
}
