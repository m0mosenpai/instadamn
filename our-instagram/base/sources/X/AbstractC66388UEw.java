package X;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.R;

/* renamed from: X.UEw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC66388UEw extends Fragment {
    public Q1y A00;
    public final VTA A01;

    public static ContextThemeWrapper A00(AbstractC66388UEw abstractC66388UEw, Object obj) {
        C14360o3.A0B(obj, 0);
        Q1y q1y = abstractC66388UEw.A00;
        if (q1y != null) {
            C2FP.A0A();
            return new ContextThemeWrapper(q1y, R.style.FBPayUIWidget);
        }
        C14360o3.A0F("contextResourcesWrapper");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        C14360o3.A0B(context, 0);
        super.onAttach(context);
        this.A00 = new Q1y(context, this.A01);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        C14360o3.A0B(configuration, 0);
        C14360o3.A07(AbstractC166997dE.A0N(this));
        super.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        if (!(this instanceof C67722Uwo) || !((C67722Uwo) this).A0L) {
            Fragment fragment = this.mParentFragment;
            C14360o3.A0C(fragment, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment");
            C67752UxP c67752UxP = (C67752UxP) fragment;
            InterfaceC16530ry interfaceC16530ry = c67752UxP.A0S;
            C0YR[] c0yrArr = C67752UxP.A0X;
            AbstractC31171DnF.A1S(c67752UxP, "", interfaceC16530ry, c0yrArr, 0);
            Fragment fragment2 = this.mParentFragment;
            C14360o3.A0C(fragment2, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment");
            C67752UxP c67752UxP2 = (C67752UxP) fragment2;
            AbstractC31171DnF.A1S(c67752UxP2, null, c67752UxP2.A0E, c0yrArr, 1);
            WGJ.A03(this, null, null);
            WGJ.A00(null, this);
            Fragment fragment3 = this.mParentFragment;
            C14360o3.A0C(fragment3, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment");
            C67752UxP c67752UxP3 = (C67752UxP) fragment3;
            AbstractC31171DnF.A1S(c67752UxP3, null, c67752UxP3.A0K, c0yrArr, 4);
            AbstractC31171DnF.A1S(c67752UxP3, null, c67752UxP3.A0I, c0yrArr, 15);
            Fragment fragment4 = this.mParentFragment;
            C14360o3.A0C(fragment4, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment");
            C67752UxP c67752UxP4 = (C67752UxP) fragment4;
            AbstractC31171DnF.A1S(c67752UxP4, null, c67752UxP4.A0J, c0yrArr, 12);
            WGJ.A04(this, null, null);
            Fragment fragment5 = this.mParentFragment;
            C14360o3.A0C(fragment5, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment");
            C67752UxP c67752UxP5 = (C67752UxP) fragment5;
            AbstractC31171DnF.A1S(c67752UxP5, null, c67752UxP5.A0Q, c0yrArr, 14);
            Fragment fragment6 = this.mParentFragment;
            C14360o3.A0C(fragment6, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment");
            C67752UxP c67752UxP6 = (C67752UxP) fragment6;
            AbstractC31171DnF.A1S(c67752UxP6, null, c67752UxP6.A0M, c0yrArr, 5);
            AbstractC31171DnF.A1S(c67752UxP6, null, c67752UxP6.A0L, c0yrArr, 17);
            Fragment fragment7 = this.mParentFragment;
            C14360o3.A0C(fragment7, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment");
            C67752UxP c67752UxP7 = (C67752UxP) fragment7;
            AbstractC31171DnF.A1S(c67752UxP7, null, c67752UxP7.A0N, c0yrArr, 13);
            WGJ.A05(this, false);
        }
    }

    public AbstractC66388UEw() {
        VTA A09 = C2FP.A09();
        C14360o3.A07(A09);
        this.A01 = A09;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        int A02 = C0f9.A02(745891103);
        super.onResume();
        C14360o3.A07(AbstractC166997dE.A0N(this));
        C0f9.A09(-2117758440, A02);
    }
}
