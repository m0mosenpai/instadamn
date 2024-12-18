package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import java.util.HashMap;

/* renamed from: X.5XX, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5XX {
    public static final HashMap A02 = A01(true);
    public static final HashMap A03 = A01(false);
    public static final InterfaceC1127857k A00 = new C5XY(C118195Wf.A0E, false);
    public static final InterfaceC1127857k A01 = C5XZ.A00;

    public static final InterfaceC1127857k A00(Alignment alignment, boolean z) {
        HashMap hashMap;
        if (z) {
            hashMap = A02;
        } else {
            hashMap = A03;
        }
        InterfaceC1127857k interfaceC1127857k = (InterfaceC1127857k) hashMap.get(alignment);
        if (interfaceC1127857k == null) {
            return new C5XY(alignment, z);
        }
        return interfaceC1127857k;
    }

    public static final HashMap A01(boolean z) {
        HashMap hashMap = new HashMap(9);
        Alignment alignment = C118195Wf.A0E;
        hashMap.put(alignment, new C5XY(alignment, z));
        Alignment alignment2 = C118195Wf.A0C;
        hashMap.put(alignment2, new C5XY(alignment2, z));
        Alignment alignment3 = C118195Wf.A0D;
        hashMap.put(alignment3, new C5XY(alignment3, z));
        Alignment alignment4 = C118195Wf.A0B;
        hashMap.put(alignment4, new C5XY(alignment4, z));
        Alignment alignment5 = C118195Wf.A09;
        hashMap.put(alignment5, new C5XY(alignment5, z));
        Alignment alignment6 = C118195Wf.A0A;
        hashMap.put(alignment6, new C5XY(alignment6, z));
        Alignment alignment7 = C118195Wf.A08;
        hashMap.put(alignment7, new C5XY(alignment7, z));
        Alignment alignment8 = C118195Wf.A06;
        hashMap.put(alignment8, new C5XY(alignment8, z));
        Alignment alignment9 = C118195Wf.A07;
        hashMap.put(alignment9, new C5XY(alignment9, z));
        return hashMap;
    }

    public static final void A02(C5Tl c5Tl, Modifier modifier, int i) {
        int i2;
        c5Tl.Enr(-211209833);
        if ((i & 6) == 0) {
            int i3 = 2;
            if (c5Tl.AH4(modifier)) {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-2041674866, "androidx.compose.foundation.layout.Box (Box.kt:236)");
            }
            InterfaceC1127857k interfaceC1127857k = A01;
            int A002 = C5X2.A00(c5Tl);
            Modifier A012 = C5X3.A01(c5Tl, modifier);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            c5Tl.Ent();
            if (c117505Tk.A0K) {
                c5Tl.AMd(interfaceC16820sZ);
            } else {
                c5Tl.FDO();
            }
            C5XJ.A00(c5Tl, interfaceC1127857k, C5X8.A03);
            C5XJ.A00(c5Tl, A04, C5X8.A05);
            C5XJ.A00(c5Tl, A012, C5X8.A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !C14360o3.A0K(c5Tl.EEc(), Integer.valueOf(A002))) {
                Integer valueOf = Integer.valueOf(A002);
                c5Tl.FBy(valueOf);
                c5Tl.ABx(valueOf, interfaceC16620sF);
            }
            C117505Tk.A0L(c117505Tk, true);
            if (C0fH.A02()) {
                C0fH.A00(-1687392504);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30499Dbi(modifier, i, 1);
        }
    }

    public static final void A03(Alignment alignment, InterfaceC1131559d interfaceC1131559d, C5AW c5aw, C59W c59w, AnonymousClass583 anonymousClass583, int i, int i2) {
        Alignment alignment2;
        C119155aX c119155aX;
        Object BbJ = interfaceC1131559d.BbJ();
        if (!(BbJ instanceof C119155aX) || (c119155aX = (C119155aX) BbJ) == null || (alignment2 = c119155aX.A00) == null) {
            alignment2 = alignment;
        }
        c5aw.A06(c59w, 0.0f, alignment2.AB9(anonymousClass583, AbstractC119215ad.A00(c59w.A01, c59w.A00), AbstractC119215ad.A00(i, i2)));
    }
}
