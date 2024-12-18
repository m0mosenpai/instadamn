package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class UDA extends AbstractC66383UEr {
    public Fragment A00;

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        View A0S = AbstractC166997dE.A0S(view, R.id.dialog_fragment_container);
        C69509Vpi A07 = C2FP.A02().A07();
        Context requireContext = requireContext();
        Drawable drawable = requireContext().getDrawable(R.drawable.bsc_dialog_background);
        if (drawable != null) {
            drawable.setTint(A07.A00(requireContext, 19));
        }
        A0S.setBackground(drawable);
        Fragment fragment = this.A00;
        if (fragment == null) {
            fragment = getChildFragmentManager().A0Q("DIALOG_CONTENT_FRAGMENT_TAG");
            if (fragment != null) {
                this.A00 = fragment;
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        AbstractC10360h2 childFragmentManager = getChildFragmentManager();
        C14360o3.A07(childFragmentManager);
        C14240no c14240no = new C14240no(childFragmentManager);
        c14240no.A0D(fragment, "DIALOG_CONTENT_FRAGMENT_TAG", R.id.dialog_fragment);
        c14240no.A0I(null);
        c14240no.A00();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        Window window2;
        int A02 = C0f9.A02(415389798);
        C14360o3.A0B(layoutInflater, 0);
        Context requireContext = requireContext();
        WFY.A02();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(new ContextThemeWrapper(requireContext, R.style.BSCIGTheme));
        Dialog dialog = this.A01;
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        Dialog dialog2 = this.A01;
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            window.requestFeature(1);
        }
        View inflate = cloneInContext.inflate(R.layout.bsc_dialog_fragment, viewGroup, false);
        C0f9.A09(-1909975196, A02);
        return inflate;
    }
}
