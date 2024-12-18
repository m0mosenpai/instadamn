package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import java.util.Collections;
import java.util.List;

/* renamed from: X.6qj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150856qj {
    public static InterfaceC11380iw A01(Activity activity) {
        InterfaceC08430c6 interfaceC08430c6;
        if (activity instanceof FragmentActivity) {
            List A04 = ((FragmentActivity) activity).getSupportFragmentManager().A0U.A04();
            if (!A04.isEmpty()) {
                int size = A04.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    Fragment fragment = (Fragment) A04.get(size);
                    if (fragment != null && fragment.isResumed() && fragment.mUserVisibleHint && !fragment.isHidden()) {
                        interfaceC08430c6 = A00(fragment);
                        break;
                    }
                }
            }
        }
        interfaceC08430c6 = null;
        if (interfaceC08430c6 instanceof InterfaceC11380iw) {
            return (InterfaceC11380iw) interfaceC08430c6;
        }
        return A02(activity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC11380iw A02(Context context) {
        Class<C150856qj> cls;
        String str;
        if (context instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) context;
            Fragment A0O = fragmentActivity.getSupportFragmentManager().A0O(R.id.layout_container_main);
            if ((A0O instanceof InterfaceC11380iw) && A0O.mUserVisibleHint) {
                return (InterfaceC11380iw) A0O;
            }
            if (!(context instanceof InterfaceC11380iw)) {
                context = AbstractC13110lx.A00(fragmentActivity);
                if (!(context instanceof InterfaceC11380iw)) {
                    cls = C150856qj.class;
                    str = "Cannot report navigation because current fragment is not AnalyticsModule";
                }
            }
            return (InterfaceC11380iw) context;
        }
        cls = C150856qj.class;
        str = "Cannot find AnalyticsModule because activity is not FragmentActivity";
        C0K8.A03(cls, str);
        return null;
    }

    public static void A03(Context context, C19280xC c19280xC) {
        if (context != null) {
            c19280xC.A09("is_connected", Boolean.valueOf(AbstractC15820qc.A0E(context)));
        }
    }

    public static Fragment A00(Fragment fragment) {
        List emptyList;
        if (fragment.isAdded()) {
            emptyList = fragment.getChildFragmentManager().A0U.A04();
        } else {
            emptyList = Collections.emptyList();
        }
        if (!emptyList.isEmpty()) {
            int size = emptyList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    Fragment fragment2 = (Fragment) emptyList.get(size);
                    if (fragment2 != null && fragment2.isResumed() && fragment2.mUserVisibleHint && !fragment2.isHidden()) {
                        return A00(fragment2);
                    }
                } else {
                    return fragment;
                }
            }
        } else {
            return fragment;
        }
    }
}
