package com.instagram.react.delegate;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC31172DnG;
import X.AbstractC53242c7;
import X.AbstractC60962Rck;
import X.AbstractC62448SCb;
import X.C0I2;
import X.C62453SCg;
import X.C63343Shy;
import X.C64489TFz;
import X.InterfaceC65352Tig;
import X.InterfaceC65357Til;
import X.Q21;
import X.Q59;
import X.Rb1;
import X.Rd0;
import X.Tg1;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.instagram.react.modules.exceptionmanager.IgReactExceptionManager;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* loaded from: classes10.dex */
public class IgReactDelegate extends AbstractC60962Rck implements InterfaceC65352Tig {
    public int A00;
    public Bundle A01;
    public Tg1 A02;
    public Q59 A03;
    public InterfaceC65357Til A04;
    public AbstractC18680vv A05;
    public C64489TFz A06;
    public IgReactExceptionManager A07;

    @Deprecated
    public C62453SCg A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public FrameLayout mFrameLayout;
    public View mInlineNavBar;
    public View mInlineNavCloseButton;
    public TextView mInlineNavTitle;
    public SpinnerImageView mLoadingIndicator;

    /* loaded from: classes10.dex */
    public interface RCTViewEventEmitter extends JavaScriptModule {
        void emit(String str, Object obj);
    }

    public static void A00(IgReactDelegate igReactDelegate) {
        FrameLayout frameLayout;
        View view;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (igReactDelegate.A0C) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            Fragment fragment = ((AbstractC62448SCb) igReactDelegate).A00;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = AbstractC166997dE.A0N(fragment).getDimensionPixelOffset(R.dimen.abc_alert_dialog_button_dimen);
            igReactDelegate.mFrameLayout.addView(igReactDelegate.A03, layoutParams);
            View inflate = LayoutInflater.from(fragment.getContext()).inflate(R.layout.react_inline_nav_bar, (ViewGroup) igReactDelegate.mFrameLayout, false);
            igReactDelegate.mInlineNavBar = inflate;
            TextView A0T = AbstractC166997dE.A0T(inflate, R.id.react_inline_title);
            igReactDelegate.mInlineNavTitle = A0T;
            A0T.setText(fragment.mArguments.getString("IgReactFragment.ARGUMENT_TITLE"));
            igReactDelegate.mInlineNavCloseButton = igReactDelegate.mInlineNavBar.findViewById(R.id.react_inline_close_button);
            C62453SCg c62453SCg = igReactDelegate.A08;
            if (c62453SCg != null) {
                Rd0 rd0 = c62453SCg.A00;
                TextView textView = ((IgReactDelegate) ((Rb1) rd0).A00).mInlineNavTitle;
                if (textView != null) {
                    textView.setGravity(17);
                    AbstractC166987dD.A1O(rd0.requireContext(), textView, AbstractC53242c7.A0E(rd0.getContext()));
                    ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
                    if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                        marginLayoutParams.leftMargin = 0;
                    }
                    textView.setText(rd0.getText(2131964122));
                    textView.setTextSize(0, AbstractC166997dE.A0N(rd0).getDimension(R.dimen.abc_text_size_menu_header_material));
                    View view2 = ((IgReactDelegate) ((Rb1) rd0).A00).mInlineNavBar;
                    if (view2 != null) {
                        view2.setBackgroundResource(R.drawable.iglive_ssi_banner);
                    }
                }
            }
            frameLayout = igReactDelegate.mFrameLayout;
            view = igReactDelegate.mInlineNavBar;
        } else {
            frameLayout = igReactDelegate.mFrameLayout;
            view = igReactDelegate.A03;
        }
        frameLayout.addView(view);
        C62453SCg c62453SCg2 = igReactDelegate.A08;
        if (c62453SCg2 != null) {
            Rd0 rd02 = c62453SCg2.A00;
            Q59 q59 = ((IgReactDelegate) ((Rb1) rd02).A00).A03;
            if (q59 != null) {
                AbstractC31172DnG.A1B(rd02.requireContext(), q59, AbstractC53242c7.A0D(q59.getContext()));
            }
        }
    }

    public static void A01(IgReactDelegate igReactDelegate) {
        FrameLayout frameLayout = igReactDelegate.mFrameLayout;
        if (frameLayout != null && igReactDelegate.A03 != null) {
            frameLayout.removeAllViews();
            View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(((AbstractC62448SCb) igReactDelegate).A00.getContext()), frameLayout, R.layout.react_error_layout);
            A0A.setBackgroundColor(-1);
            frameLayout.addView(A0A);
            igReactDelegate.A03 = null;
        }
        igReactDelegate.A09 = true;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (!this.A0A && !this.A09) {
            C63343Shy A01 = C64489TFz.A01(this);
            Q21 q21 = A01.A0G;
            if (q21 == null) {
                C0I2.A04("ReactInstanceManager", "Instance detached from instance manager");
                InterfaceC65357Til interfaceC65357Til = A01.A03;
                if (interfaceC65357Til != null) {
                    interfaceC65357Til.CP8();
                    return true;
                }
                return true;
            }
            DeviceEventManagerModule deviceEventManagerModule = (DeviceEventManagerModule) q21.A04(DeviceEventManagerModule.class);
            if (deviceEventManagerModule == null) {
                return true;
            }
            deviceEventManagerModule.emitHardwareBackPressed();
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC65352Tig
    public final void handleException(Exception exc) {
        A01(this);
    }

    @Override // X.InterfaceC60452pT
    public final boolean CJv(int i, KeyEvent keyEvent) {
        return false;
    }
}
