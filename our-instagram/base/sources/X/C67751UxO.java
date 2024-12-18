package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.UxO, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67751UxO extends UDB {
    public Fragment A00;

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        View A0S = AbstractC166997dE.A0S(view, R.id.bottom_sheet_container);
        View A0S2 = AbstractC166997dE.A0S(view, R.id.bottom_sheet_drag_handle);
        Context requireContext = requireContext();
        C69509Vpi A07 = C2FP.A02().A07();
        Drawable drawable = requireContext.getDrawable(R.drawable.bsc_bottom_sheet_background);
        if (drawable != null) {
            drawable.setTint(A07.A00(requireContext, 19));
        }
        A0S.setBackground(drawable);
        C69509Vpi A072 = C2FP.A02().A07();
        Drawable drawable2 = requireContext.getDrawable(R.drawable.bsc_bottom_sheet_drag_handle);
        if (drawable2 != null) {
            drawable2.setTint(A072.A00(requireContext, 14));
        }
        A0S2.setBackground(drawable2);
        Dialog dialog = this.A01;
        if (dialog instanceof Q5b) {
            BottomSheetBehavior A073 = ((Q5b) dialog).A07();
            C14360o3.A07(A073);
            A073.A0W(3);
        }
        Fragment fragment = this.A00;
        if (fragment == null) {
            fragment = getChildFragmentManager().A0Q("BOTTOM_SHEET_CONTENT_FRAGMENT_TAG");
            if (fragment != null) {
                this.A00 = fragment;
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        AbstractC10360h2 childFragmentManager = getChildFragmentManager();
        C14360o3.A07(childFragmentManager);
        C14240no c14240no = new C14240no(childFragmentManager);
        c14240no.A0D(fragment, "BOTTOM_SHEET_CONTENT_FRAGMENT_TAG", R.id.content_fragment);
        c14240no.A0I(null);
        c14240no.A00();
    }

    @Override // X.UDB, X.AbstractC66383UEr, X.C0SG
    public final Dialog A0F(Bundle bundle) {
        Context requireContext = requireContext();
        WFY.A02();
        DialogC67749UxM dialogC67749UxM = new DialogC67749UxM(requireContext);
        dialogC67749UxM.setOnShowListener(new WIG(this, 0));
        return dialogC67749UxM;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(8357107);
        C14360o3.A0B(layoutInflater, 0);
        Context requireContext = requireContext();
        WFY.A02();
        View inflate = layoutInflater.cloneInContext(new ContextThemeWrapper(requireContext, R.style.BSCIGTheme)).inflate(R.layout.bsc_bottom_sheet_fragment, viewGroup, false);
        C0f9.A09(-101293252, A02);
        return inflate;
    }
}
