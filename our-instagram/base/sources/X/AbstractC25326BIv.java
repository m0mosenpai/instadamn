package X;

/* renamed from: X.BIv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25326BIv {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void A00(C5Tl c5Tl, C07X c07x, InterfaceC16620sF interfaceC16620sF, int i, int i2) {
        Object obj;
        C14360o3.A0B(interfaceC16620sF, 1);
        c5Tl.Enr(164790624);
        int i3 = i2 & 1;
        int i4 = i;
        if (i3 != 0) {
            i4 = i | 2;
        }
        if ((i2 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16620sF);
        }
        if (i3 == 1 && (i4 & 91) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
            obj = c07x;
        } else {
            c5Tl.EnE();
            if ((i & 1) != 0 && !c5Tl.AwS()) {
                c5Tl.Em9();
            } else if (i3 != 0) {
                c07x = c5Tl.AJX(C5VN.A00);
            }
            if (AbstractC25227BEk.A1S(c5Tl)) {
                C0fH.A01(1973880390, "com.instagram.compose.core.lifecycle.OnLifecycleEvent (LifecycleEvent.kt:34)");
            }
            C5UX.A03(c5Tl, c07x, new BAO(2, C5WZ.A00(c5Tl, interfaceC16620sF), c07x));
            obj = c07x;
            if (C0fH.A02()) {
                C0fH.A00(653755291);
                obj = c07x;
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30504Dbn.A01(obj, interfaceC16620sF, i2, i, 20);
        }
    }
}
