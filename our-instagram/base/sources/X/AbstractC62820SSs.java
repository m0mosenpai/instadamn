package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.react.delegate.IgReactDelegate;

/* renamed from: X.SSs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62820SSs {
    /* JADX WARN: Multi-variable type inference failed */
    public static final AbstractC59962oe A00(Activity activity) {
        FragmentActivity fragmentActivity;
        AbstractC10360h2 supportFragmentManager;
        if (!(activity instanceof FragmentActivity)) {
            fragmentActivity = 0;
        } else {
            fragmentActivity = (FragmentActivity) activity;
        }
        if (fragmentActivity == 0) {
            return null;
        }
        if (fragmentActivity instanceof InterfaceC53802dJ) {
            supportFragmentManager = ((InterfaceC53802dJ) fragmentActivity).Auu();
        } else {
            supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        }
        if (supportFragmentManager == null) {
            return null;
        }
        Fragment A0O = supportFragmentManager.A0O(R.id.layout_container_main);
        if (!(A0O instanceof AbstractC59962oe)) {
            return null;
        }
        return (AbstractC59962oe) A0O;
    }

    public static final boolean A01(Activity activity, int i) {
        Rb1 rb1;
        int i2;
        AbstractC59962oe A00 = A00(activity);
        if (A00 != null && (A00 instanceof Rb1) && (rb1 = (Rb1) A00) != null) {
            Q59 q59 = ((IgReactDelegate) rb1.A00).A03;
            if (q59 != null) {
                i2 = q59.A01;
            } else {
                i2 = 0;
            }
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }
}
