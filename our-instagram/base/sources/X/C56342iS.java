package X;

import android.R;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.2iS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C56342iS {
    public static final C56352iT A01(View.OnClickListener onClickListener, ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 0);
        return new C56352iT(onClickListener, viewGroup);
    }

    public final C56352iT A05(Fragment fragment) {
        FragmentActivity fragmentActivity = null;
        if (fragment != null) {
            InterfaceC08430c6 interfaceC08430c6 = fragment.mParentFragment;
            if (interfaceC08430c6 != null && (interfaceC08430c6 instanceof C2d4)) {
                return ((C2d4) interfaceC08430c6).AYT();
            }
            fragmentActivity = fragment.getActivity();
        }
        return A00(fragmentActivity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C56352iT A00(Activity activity) {
        if (activity != 0) {
            if (activity instanceof C2d4) {
                return ((C2d4) activity).AYT();
            }
            C0w9.A01.EmN("ActionBarService null provider", AnonymousClass001.A0R(activity.getClass().getSimpleName(), " is not an ActionBarServiceProvider"));
            return null;
        }
        C0w9.A01.EmN("ActionBarService null activity", "attempting to get action bar service from a null activity");
        return null;
    }

    public static final void A02(Resources.Theme theme, View view, C114795Gm c114795Gm) {
        int i;
        if (view.getBackground() instanceof C3DW) {
            Integer num = c114795Gm.A0D;
            Resources.Theme theme2 = c114795Gm.A07;
            if (theme2 != null) {
                theme = theme2;
            }
            view.setBackground(new C3DW(theme, num));
            return;
        }
        if (!view.isClickable() || (i = c114795Gm.A05) == -2) {
            return;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, new ColorDrawable(i));
        view.setBackgroundDrawable(stateListDrawable);
    }

    public final C56352iT A03(Activity activity) {
        C56352iT A00 = A00(activity);
        if (A00 != null) {
            return A00;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final C56352iT A04(Fragment fragment) {
        C56352iT A05 = A05(fragment);
        if (A05 != null) {
            return A05;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
