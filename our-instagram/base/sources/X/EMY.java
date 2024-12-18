package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class EMY extends AbstractC59962oe implements InterfaceC189488aT {
    public static final String __redex_internal_original_name = "DirectGenericInterstitialReplyModalFragment";
    public float A00;
    public MWT A01;
    public C35149Fer A02;
    public C35041FcE A03;
    public GXX A04;
    public User A05;
    public boolean A06;
    public boolean A07;
    public final InterfaceC09390do A09 = AbstractC09440dt.A01(new C37014GSt(this, 10));
    public boolean A08 = true;

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ABC() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ANe() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final int Aqi() {
        return -2;
    }

    @Override // X.InterfaceC189488aT
    public final int C9V() {
        return 0;
    }

    @Override // X.InterfaceC189488aT
    /* renamed from: CO7 */
    public final float Cpk() {
        return 1.0f;
    }

    @Override // X.InterfaceC189488aT
    public final boolean CQm() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final float Cnp() {
        return 1.0f;
    }

    @Override // X.InterfaceC189498aU
    public final void DON(int i) {
        this.A07 = true;
        if (this.A06 && i != 0) {
            View view = this.mView;
            if (view != null) {
                View requireViewById = view.requireViewById(R.id.ice_breaker_scroll_view);
                float f = (AbstractC31180DnO.A02(this, requireViewById).getDisplayMetrics().heightPixels - i) - this.A00;
                if (requireViewById.getMeasuredHeight() > f) {
                    ViewGroup.LayoutParams layoutParams = requireViewById.getLayoutParams();
                    C14360o3.A07(layoutParams);
                    layoutParams.height = (int) f;
                    requireViewById.setLayoutParams(layoutParams);
                    return;
                }
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.InterfaceC189488aT
    public final boolean Ei2() {
        return true;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final boolean isScrolledToTop() {
        return false;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, X.4q9] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        View requireViewById;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView A0N = AbstractC167007dF.A0N(view, R.id.banner_title);
        TextView A0N2 = AbstractC167007dF.A0N(view, R.id.banner_subtitle);
        IgImageView A0T = AbstractC167007dF.A0T(view, R.id.avatar);
        TextView A0N3 = AbstractC167007dF.A0N(view, R.id.content_title);
        TextView A0N4 = AbstractC167007dF.A0N(view, R.id.content_subtitle);
        AbstractC31171DnF.A15(A0N, ((C51761Mtk) A01().A01).A02);
        AbstractC31171DnF.A15(A0N3, ((C51760Mtj) A01().A00).A02);
        AbstractC31171DnF.A15(A0N4, ((C51760Mtj) A01().A00).A01);
        A0T.setUrl((ImageUrl) ((C51760Mtj) A01().A00).A00, this);
        CharSequence charSequence = (CharSequence) ((C51761Mtk) A01().A01).A00;
        if (charSequence != null && charSequence.length() != 0) {
            AbstractC31171DnF.A15(A0N2, ((C51761Mtk) A01().A01).A00);
            A0N2.setVisibility(0);
        } else {
            A0N2.setVisibility(8);
        }
        Context A0L = AbstractC166997dE.A0L(view);
        view.setOnTouchListener(new ViewOnTouchListenerC35710Fpk(new GestureDetector(A0L, new C32020E4y(A0L, new G2K(this))), 0));
        List list = (List) A01().A05;
        if (list != null && !list.isEmpty()) {
            FragmentActivity requireActivity = requireActivity();
            LayoutInflater from = LayoutInflater.from(getContext());
            C14360o3.A07(from);
            C35041FcE c35041FcE = new C35041FcE(requireActivity, from, view, this, AbstractC166987dD.A0r(this.A09), this.A05, "", new C30715DfD(this, 16), false);
            this.A03 = c35041FcE;
            c35041FcE.A02 = EnumC33392EpP.A03;
            ArrayList A1E = AbstractC166987dD.A1E();
            List list2 = (List) A01().A05;
            if (list2 != null) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    String A1B = AbstractC166987dD.A1B(it);
                    ?? obj = new Object();
                    obj.A05 = A1B;
                    obj.A03 = "";
                    obj.A00 = null;
                    obj.A06 = null;
                    obj.A04 = null;
                    obj.A02 = null;
                    obj.A01 = null;
                    A1E.add(obj);
                }
                c35041FcE.A02(null, null, null, A1E, false, false, false, false, false);
                view.findViewById(R.id.instant_reply_bar).setBackgroundColor(AbstractC53242c7.A0F(requireContext(), R.attr.igds_color_elevated_background));
                z = true;
            } else {
                throw AbstractC166997dE.A0g();
            }
        } else {
            z = false;
        }
        this.A06 = z;
        if (z && (requireViewById = view.requireViewById(R.id.ice_breaker)) != null) {
            requireViewById.setVisibility(0);
        }
        C35149Fer c35149Fer = this.A02;
        if (c35149Fer == null) {
            C14360o3.A0F("composerController");
            throw C00O.createAndThrow();
        }
        C35041FcE c35041FcE2 = this.A03;
        c35149Fer.A00 = (ComposerAutoCompleteTextView) view.requireViewById(R.id.messaging_edittext);
        View A0S = AbstractC166997dE.A0S(view, R.id.messaging_send_button);
        ComposerAutoCompleteTextView composerAutoCompleteTextView = c35149Fer.A00;
        if (composerAutoCompleteTextView != null) {
            composerAutoCompleteTextView.setHint(c35149Fer.A02.A03);
            ComposerAutoCompleteTextView composerAutoCompleteTextView2 = c35149Fer.A00;
            if (composerAutoCompleteTextView2 != null) {
                composerAutoCompleteTextView2.addTextChangedListener(new C35468Fl3(3, A0S, c35041FcE2));
                ComposerAutoCompleteTextView composerAutoCompleteTextView3 = c35149Fer.A00;
                if (composerAutoCompleteTextView3 != null) {
                    C35754Fqr.A00(composerAutoCompleteTextView3, c35149Fer, 3);
                    ViewOnClickListenerC35681FpG.A01(A0S, 47, c35149Fer);
                    if (this.A06) {
                        View view2 = this.mView;
                        if (view2 != null) {
                            View A0S2 = AbstractC166997dE.A0S(view2, R.id.header);
                            View view3 = this.mView;
                            if (view3 != null) {
                                View A0S3 = AbstractC166997dE.A0S(view3, R.id.content);
                                View view4 = this.mView;
                                if (view4 != null) {
                                    View A0S4 = AbstractC166997dE.A0S(view4, R.id.reply_modal_composer);
                                    A0S2.measure(0, 0);
                                    A0S3.measure(0, 0);
                                    A0S4.measure(0, 0);
                                    this.A00 = AbstractC166997dE.A0N(this).getDimension(R.dimen.account_group_management_clickable_width) + A0S2.getMeasuredHeight() + A0S3.getMeasuredHeight() + A0S4.getMeasuredHeight();
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
                    if (!this.A08) {
                        AbstractC31176DnK.A1D(view, R.id.bottom_sheet_drag_handle);
                        return;
                    }
                    return;
                }
            }
        }
        C14360o3.A0F("composerEditTextView");
        throw C00O.createAndThrow();
    }

    public static final void A00(EMY emy) {
        C35149Fer c35149Fer = emy.A02;
        if (c35149Fer == null) {
            C14360o3.A0F("composerController");
            throw C00O.createAndThrow();
        }
        c35149Fer.A02();
        AbstractC31176DnK.A12(emy.getContext(), C3DN.A00);
        View view = emy.mView;
        if (view != null) {
            AbstractC125325le A00 = AbstractC125325le.A00(view);
            A00.A0G();
            AbstractC125325le A0B = A00.A0A().A0B(0.5f);
            A0B.A0K(view.getHeight());
            A0B.A0H();
        }
    }

    public final MWT A01() {
        MWT mwt = this.A01;
        if (mwt != null) {
            return mwt;
        }
        C14360o3.A0F("viewModel");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC189498aU
    public final void DOM() {
        String str;
        if (this.A07) {
            C35149Fer c35149Fer = this.A02;
            if (c35149Fer == null) {
                str = "composerController";
            } else {
                ComposerAutoCompleteTextView composerAutoCompleteTextView = c35149Fer.A00;
                if (composerAutoCompleteTextView == null) {
                    str = "composerEditTextView";
                } else {
                    String A1A = AbstractC25228BEl.A1A(AbstractC167007dF.A0g(composerAutoCompleteTextView));
                    if (A1A == null || A1A.length() == 0) {
                        A00(this);
                        return;
                    }
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A09);
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetClosed() {
        C35149Fer c35149Fer = this.A02;
        if (c35149Fer == null) {
            C14360o3.A0F("composerController");
            throw C00O.createAndThrow();
        }
        c35149Fer.A02();
    }

    @Override // X.InterfaceC189488aT
    public final int Ahd(Context context) {
        return AbstractC31178DnM.A00(context);
    }

    @Override // X.InterfaceC189488aT
    public final View C5a() {
        return this.mView;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ float Cpk() {
        return 1.0f;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_interstitial_reply_modal";
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0154, code lost:
    
        if (r6 != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0151  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EMY.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-86365914);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_interstitial_reply_modal, viewGroup, false);
        C0f9.A09(1381366834, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1587909075);
        super.onPause();
        C35149Fer c35149Fer = this.A02;
        if (c35149Fer == null) {
            C14360o3.A0F("composerController");
            throw C00O.createAndThrow();
        }
        c35149Fer.A02();
        this.A07 = false;
        C0f9.A09(-418976155, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        String str;
        Window window;
        int A02 = C0f9.A02(266545979);
        super.onResume();
        C35149Fer c35149Fer = this.A02;
        if (c35149Fer == null) {
            str = "composerController";
        } else {
            ComposerAutoCompleteTextView composerAutoCompleteTextView = c35149Fer.A00;
            str = "composerEditTextView";
            if (composerAutoCompleteTextView != null) {
                composerAutoCompleteTextView.requestFocus();
                ComposerAutoCompleteTextView composerAutoCompleteTextView2 = c35149Fer.A00;
                if (composerAutoCompleteTextView2 != null) {
                    AbstractC13880nE.A0S(composerAutoCompleteTextView2);
                    Activity rootActivity = getRootActivity();
                    if (rootActivity != null && (window = rootActivity.getWindow()) != null) {
                        window.setSoftInputMode(48);
                    }
                    C0f9.A09(-398188411, A02);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
