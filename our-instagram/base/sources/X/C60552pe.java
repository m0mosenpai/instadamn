package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.2pe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60552pe extends AbstractC59962oe {
    public static final int A0A = View.generateViewId();
    public static final String __redex_internal_original_name = "NavigationBoundaryTestWrapperFragment";
    public Fragment A00;
    public InterfaceC16660sJ A01;
    public boolean A02;
    public boolean A03;
    public long A05;
    public long A06;
    public SpinnerImageView A07;
    public final InterfaceC09390do A08 = AbstractC60492pY.A02(this);
    public int A04 = -1;
    public final Handler A09 = new Handler(Looper.getMainLooper());

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        C14360o3.A0B(context, 0);
        super.onAttach(context);
        this.A05 = System.currentTimeMillis();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("wrapped_fragment_added", this.A02);
    }

    private final void A00() {
        if (!this.A02) {
            long currentTimeMillis = this.A06 - (System.currentTimeMillis() - this.A05);
            if (currentTimeMillis <= 0) {
                A01(this);
            } else {
                this.A09.postDelayed(new RunnableC71385Wsu(this), currentTimeMillis);
            }
        }
    }

    public final Fragment A02(InterfaceC16660sJ interfaceC16660sJ) {
        Fragment fragment = null;
        if (this.A03) {
            fragment = this.A00;
            if (fragment == null) {
                C14360o3.A0F("wrappedFragment");
                throw C00O.createAndThrow();
            }
        } else {
            this.A01 = interfaceC16660sJ;
        }
        return fragment;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A08.getValue();
    }

    public static final void A01(C60552pe c60552pe) {
        if (!c60552pe.isStateSaved() && !c60552pe.A02) {
            c60552pe.A02 = true;
            AbstractC10360h2 childFragmentManager = c60552pe.getChildFragmentManager();
            C14360o3.A07(childFragmentManager);
            C14240no c14240no = new C14240no(childFragmentManager);
            int i = A0A;
            Fragment fragment = c60552pe.A00;
            if (fragment == null) {
                C14360o3.A0F("wrappedFragment");
                throw C00O.createAndThrow();
            }
            c14240no.A09(fragment, i);
            c14240no.A0G = true;
            c14240no.A0I(null);
            c14240no.A00();
            C14240no c14240no2 = new C14240no(c60552pe.getParentFragmentManager());
            c14240no2.A0I("test");
            c14240no2.A00();
            c60552pe.getParentFragmentManager().A0b();
            SpinnerImageView spinnerImageView = c60552pe.A07;
            if (spinnerImageView != null) {
                spinnerImageView.setLoadingStatus(C3T1.SUCCESS);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        int A02 = C0f9.A02(1531842925);
        super.onCreate(bundle);
        if (bundle != null) {
            this.A02 = bundle.getBoolean("wrapped_fragment_added", false);
        }
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A04 = bundle2.getInt("background_color", this.A04);
            this.A06 = bundle2.getLong("delay_ms", 0L);
            if (!this.A02) {
                Context context = getContext();
                if (context != null) {
                    String string = bundle2.getString("wrapped_fragment_class");
                    Bundle bundle3 = bundle2.getBundle("wrapped_fragment_args");
                    if (bundle3 == null) {
                        bundle3 = new Bundle();
                        Object obj = bundle2.get("ClipsViewerLauncher.KEY_CONFIG");
                        if ((obj instanceof Parcelable) && (parcelable = (Parcelable) obj) != null) {
                            bundle3.putParcelable("ClipsViewerLauncher.KEY_CONFIG", parcelable);
                        }
                    }
                    if (string != null) {
                        this.A00 = Fragment.instantiate(context, string, bundle3);
                        getChildFragmentManager().A0q(new UF2(this), false);
                        Fragment.SavedState savedState = (Fragment.SavedState) AbstractC53062bn.A01(bundle2, Fragment.SavedState.class, "wrapped_fragment_state");
                        if (savedState != null) {
                            Fragment fragment = this.A00;
                            if (fragment == null) {
                                C14360o3.A0F("wrappedFragment");
                                throw C00O.createAndThrow();
                            }
                            fragment.setInitialSavedState(savedState);
                        }
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
            } else {
                Fragment A0O = getChildFragmentManager().A0O(A0A);
                if (A0O != null) {
                    this.A00 = A0O;
                    this.A03 = true;
                }
            }
        }
        C0f9.A09(901744348, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout;
        int A02 = C0f9.A02(249384213);
        Context context = getContext();
        if (context != null) {
            frameLayout = new FrameLayout(context);
            SpinnerImageView spinnerImageView = new SpinnerImageView(context);
            this.A07 = spinnerImageView;
            spinnerImageView.setImageResource(R.drawable.spinner_large);
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setBackgroundColor(this.A04);
            NFY nfy = new NFY(context, viewGroup);
            nfy.setId(A0A);
            frameLayout.addView(frameLayout2);
            frameLayout.addView(this.A07);
            frameLayout.addView(nfy);
            A00();
        } else {
            frameLayout = null;
        }
        C0f9.A09(21831693, A02);
        return frameLayout;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1766861494);
        super.onDestroyView();
        this.A07 = null;
        C0f9.A09(1307487616, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(356737490);
        A01(this);
        super.onPause();
        C0f9.A09(1908171807, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(454966362);
        super.onResume();
        A00();
        C0f9.A09(1133121634, A02);
    }
}
