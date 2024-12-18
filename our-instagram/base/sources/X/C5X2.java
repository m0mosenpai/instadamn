package X;

/* renamed from: X.5X2, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5X2 {
    public static final C117615Tw A01(C5Tl c5Tl) {
        C6NK c6nk;
        if (C0fH.A02()) {
            C0fH.A01(1552493093, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:484)");
        }
        C117505Tk c117505Tk = (C117505Tk) c5Tl;
        C117505Tk.A0K(c117505Tk, C5UC.A04, null, 206, 0);
        C117495Tj c117495Tj = null;
        if (c117505Tk.A0K) {
            C117565Tr c117565Tr = c117505Tk.A0D;
            int i = c117565Tr.A08;
            int A00 = C117565Tr.A00(c117565Tr, i);
            int[] iArr = c117565Tr.A0I;
            int i2 = (A00 * 5) + 1;
            int i3 = iArr[i2];
            if ((i3 & 134217728) == 0) {
                int i4 = i3 | 134217728;
                iArr[i2] = i4;
                if ((i4 & 67108864) == 0) {
                    C117565Tr.A08(c117565Tr, C117565Tr.A02(c117565Tr, iArr, i));
                }
            }
        }
        Object A0P = c117505Tk.A0P();
        if (!(A0P instanceof C6NK) || (c6nk = (C6NK) A0P) == null) {
            int i5 = c117505Tk.A02;
            boolean z = c117505Tk.A0J;
            boolean z2 = c117505Tk.A0P;
            C117415Ta c117415Ta = (C117415Ta) c117505Tk.A0V;
            if (c117415Ta != null) {
                c117495Tj = c117415Ta.A07;
            }
            c6nk = new C6NK(new C117615Tw(c117505Tk, c117495Tj, i5, z, z2));
            c117505Tk.A0Q(c6nk);
        }
        C117615Tw c117615Tw = c6nk.A00;
        c117615Tw.A02.Egh(C117505Tk.A04(c117505Tk));
        C117505Tk.A0L(c117505Tk, false);
        if (C0fH.A02()) {
            C0fH.A00(-1173500548);
        }
        return c117615Tw;
    }

    public static final int A00(C5Tl c5Tl) {
        if (C0fH.A02()) {
            C0fH.A01(-1973211340, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:228)");
        }
        int i = ((C117505Tk) c5Tl).A02;
        if (C0fH.A02()) {
            C0fH.A00(621651807);
        }
        return i;
    }
}
