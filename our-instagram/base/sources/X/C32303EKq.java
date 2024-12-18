package X;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.EKq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32303EKq extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "HiddenWordsNuxFragment";
    public IgdsBottomButtonLayout A00;
    public IgdsHeadline A01;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC31175DnJ.A1I(interfaceC56362iU, getString(2131968102));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "HiddenWordsNUXBottomSheetFragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = (IgdsHeadline) view.findViewById(R.id.hidden_words_settings_nux);
        this.A00 = (IgdsBottomButtonLayout) view.findViewById(R.id.hidden_words_settings_bottom_button);
        IgdsHeadline igdsHeadline = this.A01;
        String str = "headline";
        if (igdsHeadline != null) {
            igdsHeadline.setImageResource(R.drawable.ig_illustrations_illo_hidden_words);
            IgdsHeadline igdsHeadline2 = this.A01;
            if (igdsHeadline2 != null) {
                igdsHeadline2.setHeadline(2131963678);
                IgdsHeadline igdsHeadline3 = this.A01;
                if (igdsHeadline3 != null) {
                    FragmentActivity activity = getActivity();
                    AbstractC31171DnF.A1P(activity);
                    C35228FgL A01 = C35228FgL.A01(activity, true);
                    A01.A04(getString(2131963675), getString(2131963674), R.drawable.instagram_comment_pano_outline_24);
                    A01.A04(getString(2131963677), getString(2131963676), R.drawable.instagram_eye_off_pano_outline_24);
                    C35228FgL.A02(A01, igdsHeadline3, getString(2131963673), getString(2131963672), R.drawable.instagram_settings_pano_outline_24);
                    IgdsBottomButtonLayout igdsBottomButtonLayout = this.A00;
                    str = "bottomButton";
                    if (igdsBottomButtonLayout != null) {
                        igdsBottomButtonLayout.setDividerVisible(true);
                        IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A00;
                        if (igdsBottomButtonLayout2 != null) {
                            AbstractC31173DnH.A1H(this, igdsBottomButtonLayout2, 2131956794);
                            IgdsBottomButtonLayout igdsBottomButtonLayout3 = this.A00;
                            if (igdsBottomButtonLayout3 != null) {
                                igdsBottomButtonLayout3.setPrimaryActionOnClickListener(new ViewOnClickListenerC35666Fp0(this, 61));
                                F79.A00(AbstractC166987dD.A0r(this.A02), 0);
                                return;
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        F79.A00(AbstractC166987dD.A0r(this.A02), 2);
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-312146830);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.fragment_hidden_words_nux_screen, false);
        C0f9.A09(2080691110, A02);
        return A0R;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        InterfaceC53712dA interfaceC53712dA;
        int A02 = C0f9.A02(-659015971);
        super.onStart();
        ComponentCallbacks2 rootActivity = getRootActivity();
        if ((rootActivity instanceof InterfaceC53712dA) && (interfaceC53712dA = (InterfaceC53712dA) rootActivity) != null) {
            interfaceC53712dA.EfL(8);
        }
        C0f9.A09(-541638065, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        InterfaceC53712dA interfaceC53712dA;
        int A02 = C0f9.A02(1770727895);
        super.onStop();
        ComponentCallbacks2 rootActivity = getRootActivity();
        if ((rootActivity instanceof InterfaceC53712dA) && (interfaceC53712dA = (InterfaceC53712dA) rootActivity) != null) {
            interfaceC53712dA.EfL(0);
        }
        C0f9.A09(677681095, A02);
    }
}
