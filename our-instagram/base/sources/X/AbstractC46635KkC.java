package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.KkC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46635KkC {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void A00(Fragment fragment, C48102LRc c48102LRc) {
        C56352iT c56352iT;
        C07X c07x;
        C2d4 c2d4;
        if (c48102LRc.A02 != null && c48102LRc.A01 != null && c48102LRc.A00 != null) {
            return;
        }
        c48102LRc.A00 = fragment.getViewLifecycleOwner();
        C1UC activity = fragment.getActivity();
        InterfaceC60122ou interfaceC60122ou = null;
        if ((activity instanceof C2d4) && (c2d4 = (C2d4) activity) != null) {
            c56352iT = c2d4.AYT();
        } else {
            c56352iT = null;
        }
        c48102LRc.A02 = c56352iT;
        if (fragment instanceof InterfaceC60122ou) {
            interfaceC60122ou = (InterfaceC60122ou) fragment;
        }
        c48102LRc.A01 = interfaceC60122ou;
        if (c56352iT != null && interfaceC60122ou != null && (c07x = c48102LRc.A00) != null) {
            C07T lifecycle = c07x.getLifecycle();
            if (lifecycle == null) {
                return;
            }
            lifecycle.A09(c48102LRc);
            return;
        }
        c48102LRc.A02 = null;
        c48102LRc.A01 = null;
        c48102LRc.A00 = null;
    }
}
