package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.8Xe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC188658Xe {
    public static final C23671Dx A00(Fragment fragment, C07S c07s, InterfaceC16620sF interfaceC16620sF) {
        if (fragment.mView == null) {
            return null;
        }
        C07X viewLifecycleOwner = fragment.getViewLifecycleOwner();
        C57312k6 A00 = C07Y.A00(viewLifecycleOwner);
        C9DH c9dh = new C9DH(viewLifecycleOwner, c07s, interfaceC16620sF, null, 24);
        return AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9dh, A00);
    }
}
