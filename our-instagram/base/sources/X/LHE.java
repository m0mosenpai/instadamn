package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.friendmap.data.MapText;

/* loaded from: classes8.dex */
public abstract class LHE {
    public static final void A00(Activity activity, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        C3DN A0r = AbstractC31172DnG.A0r(activity);
        if (A0r != null) {
            C3DP c3dp = (C3DP) A0r;
            if (c3dp.A0h) {
                A0r.A0P(new C37910Gm7(true, z, false));
                c3dp.A0H = new C49624LwH(interfaceC16820sZ, 5);
                c3dp.A10.clear();
                A0r.A0B();
                return;
            }
            interfaceC16820sZ.invoke();
        }
    }

    public static void A01(Fragment fragment, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        C14360o3.A0B(fragment, 0);
        A00(fragment.requireActivity(), interfaceC16820sZ, z);
    }

    public static final void A02(FragmentActivity fragmentActivity, EnumC46180KcI enumC46180KcI) {
        int i;
        switch (enumC46180KcI.ordinal()) {
            case 0:
                i = 2131962842;
                break;
            case 1:
                i = 2131962843;
                break;
            case 2:
            case 6:
                i = 2131974293;
                break;
            case 3:
                i = 2131962839;
                break;
            case 4:
                i = 2131962841;
                break;
            case 5:
                i = 2131962840;
                break;
            default:
                throw B4Z.A00();
        }
        MapText.Res res = new MapText.Res(i, new String[0]);
        C9GR.A00(fragmentActivity, AbstractC47027Kqk.A00(fragmentActivity, res), AbstractC167017dG.A0n(enumC46180KcI, "IG_FRIEND_MAP_", AbstractC166987dD.A1C()), 0);
    }
}
