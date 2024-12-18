package X;

import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;

/* renamed from: X.07K, reason: invalid class name */
/* loaded from: classes.dex */
public final class C07K {
    public static final C07K A01 = new Object();
    public static C07J A00 = C07J.A02;

    public static final C07J A00(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                fragment.getParentFragmentManager();
            }
            fragment = fragment.mParentFragment;
        }
        return A00;
    }

    public static final void A01(Fragment fragment) {
        StringBuilder sb = new StringBuilder();
        sb.append("Attempting to get retain instance for fragment ");
        sb.append(fragment);
        C07L c07l = new C07L(fragment, sb.toString());
        AbstractC10360h2.A0H(3);
        C07J A002 = A00(fragment);
        if (A002.A01.contains(C07F.DETECT_RETAIN_INSTANCE_USAGE) && A05(A002, fragment.getClass(), c07l.getClass())) {
            A04(A002, c07l);
        }
    }

    public static final void A02(Fragment fragment) {
        StringBuilder sb = new StringBuilder();
        sb.append("Attempting to get target request code from fragment ");
        sb.append(fragment);
        C07L c07l = new C07L(fragment, sb.toString());
        AbstractC10360h2.A0H(3);
        C07J A002 = A00(fragment);
        if (A002.A01.contains(C07F.DETECT_TARGET_FRAGMENT_USAGE) && A05(A002, fragment.getClass(), c07l.getClass())) {
            A04(A002, c07l);
        }
    }

    public static final void A03(Fragment fragment, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Attempting to reuse fragment ");
        sb.append(fragment);
        sb.append(" with previous ID ");
        sb.append(str);
        C07L c07l = new C07L(fragment, sb.toString());
        AbstractC10360h2.A0H(3);
        C07J A002 = A00(fragment);
        if (A002.A01.contains(C07F.DETECT_FRAGMENT_REUSE) && A05(A002, fragment.getClass(), c07l.getClass())) {
            A04(A002, c07l);
        }
    }

    public static final void A04(C07J c07j, final C07L c07l) {
        Fragment fragment = c07l.A00;
        final String name = fragment.getClass().getName();
        java.util.Set set = c07j.A01;
        set.contains(C07F.PENALTY_LOG);
        if (set.contains(C07F.PENALTY_DEATH)) {
            Runnable runnable = new Runnable() { // from class: X.07E
                @Override // java.lang.Runnable
                public final void run() {
                    String str = name;
                    C07L c07l2 = c07l;
                    C07K c07k = C07K.A01;
                    android.util.Log.e("FragmentStrictMode", AnonymousClass001.A0R("Policy violation with PENALTY_DEATH in ", str), c07l2);
                    throw c07l2;
                }
            };
            if (fragment.isAdded()) {
                Handler handler = fragment.getParentFragmentManager().A0A.A02;
                if (!C14360o3.A0K(handler.getLooper(), Looper.myLooper())) {
                    handler.post(runnable);
                    return;
                }
            }
            runnable.run();
            throw null;
        }
    }

    public static final boolean A05(C07J c07j, Class cls, Class cls2) {
        java.util.Set set = (java.util.Set) c07j.A00.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (!C14360o3.A0K(cls2.getSuperclass(), C07L.class) && AbstractC001800i.A0u(set, cls2.getSuperclass())) {
            return false;
        }
        return !set.contains(cls2);
    }
}
