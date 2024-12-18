package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.List;

/* renamed from: X.U4u, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66224U4u {
    public static final C66224U4u A00 = new Object();

    public static final Activity A00(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return A00(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static final Object A01(Context context) {
        C66224U4u c66224U4u = A00;
        List A03 = A03(A00(context));
        if (A03 != null && !A03.isEmpty()) {
            return c66224U4u.A02(A03);
        }
        return null;
    }

    private final Object A02(List list) {
        int size = list.size() - 1;
        if (size < 0) {
            return null;
        }
        while (true) {
            int i = size - 1;
            Fragment fragment = (Fragment) list.get(size);
            if (InterfaceC72040XGi.class.isInstance(fragment)) {
                return InterfaceC72040XGi.class.cast(fragment);
            }
            List A04 = fragment.getChildFragmentManager().A0U.A04();
            C14360o3.A07(A04);
            Object A02 = A02(A04);
            if (A02 != null) {
                return A02;
            }
            if (i >= 0) {
                size = i;
            } else {
                return null;
            }
        }
    }

    public static final List A03(Activity activity) {
        if (activity instanceof FragmentActivity) {
            AbstractC10360h2 supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
            C14360o3.A07(supportFragmentManager);
            return supportFragmentManager.A0U.A04();
        }
        return null;
    }
}
