package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.F7i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34210F7i {
    public static final void A00(FragmentActivity fragmentActivity, Integer num, String str, InterfaceC16820sZ interfaceC16820sZ) {
        if (fragmentActivity != null) {
            EHR ehr = new EHR();
            ehr.A00 = num;
            ehr.A02 = interfaceC16820sZ;
            ehr.A01 = str;
            AbstractC10360h2 A0D = AbstractC31172DnG.A0D(fragmentActivity);
            try {
                ehr.A0C(new C14240no(A0D), null);
                return;
            } catch (IllegalStateException unused) {
                if (fragmentActivity.isFinishing() || fragmentActivity.isDestroyed() || A0D.A0G) {
                    AbstractC166987dD.A1T(C18950wb.A01, "Error attempting to show loading screen while navigating to login bypass in A2W flow", 245701013);
                } else {
                    return;
                }
            }
        }
        interfaceC16820sZ.invoke();
    }
}
