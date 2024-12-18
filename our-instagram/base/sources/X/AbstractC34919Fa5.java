package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.List;

/* renamed from: X.Fa5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34919Fa5 {
    public static final C36559GAj A03 = GSQ.A02(15);
    public static final C36559GAj A09 = GSQ.A02(21);
    public static final C36559GAj A07 = GSQ.A02(19);
    public static final C36559GAj A0A = GSQ.A02(22);
    public static final C36559GAj A02 = GSQ.A02(14);
    public static final C36559GAj A04 = GSQ.A02(16);
    public static final C36559GAj A05 = GSQ.A02(17);
    public static final C36559GAj A08 = GSQ.A02(20);
    public static final C36559GAj A06 = GSQ.A02(18);
    public static final C36559GAj A01 = new C36559GAj(new C36560GAk(new GSB(22, null)));
    public static final C19270xB A00 = AbstractC31171DnF.A0D("aymh");

    public static final AbstractC59962oe A00(FragmentActivity fragmentActivity) {
        List A042 = fragmentActivity.getSupportFragmentManager().A0U.A04();
        C14360o3.A07(A042);
        int A052 = AbstractC25226BEj.A05(A042);
        AbstractC59962oe abstractC59962oe = null;
        while (A052 >= 0) {
            Fragment fragment = (Fragment) A042.get(A052);
            if (fragment instanceof AbstractC59962oe) {
                abstractC59962oe = (AbstractC59962oe) fragment;
            }
            A052--;
            if (abstractC59962oe != null) {
                break;
            }
        }
        return abstractC59962oe;
    }
}
