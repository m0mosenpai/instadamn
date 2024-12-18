package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.2sx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC62582sx {
    /* JADX WARN: Multi-variable type inference failed */
    public static final AbstractC10360h2 A00(FragmentActivity fragmentActivity) {
        AbstractC10360h2 Auu;
        C14360o3.A0B(fragmentActivity, 0);
        if ((fragmentActivity instanceof InterfaceC53802dJ) && (Auu = ((InterfaceC53802dJ) fragmentActivity).Auu()) != null) {
            return Auu;
        }
        AbstractC10360h2 supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        C14360o3.A07(supportFragmentManager);
        return supportFragmentManager;
    }
}
