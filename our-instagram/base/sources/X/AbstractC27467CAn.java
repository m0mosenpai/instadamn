package X;

/* renamed from: X.CAn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27467CAn {
    public static final InterfaceC74953Yl A00(C5XP c5xp, C5Tl c5Tl, int i) {
        if (C0fH.A02()) {
            C0fH.A01(817983922, "androidx.compose.foundation.interaction.collectIsPressedAsState (PressInteraction.kt:83)");
        }
        Object EEc = c5Tl.EEc();
        Object obj = C5UI.A00;
        boolean z = false;
        InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) AbstractC25234BEr.A0c(c5Tl, EEc, obj, false);
        if ((((i & 14) ^ 6) > 4 && c5Tl.AH4(c5xp)) || (i & 6) == 4) {
            z = true;
        }
        Object EEc2 = c5Tl.EEc();
        if (z || EEc2 == obj) {
            EEc2 = new D52(c5xp, interfaceC74953Yl, (InterfaceC23621Ds) null, 5);
            c5Tl.FBy(EEc2);
        }
        C5UX.A04(c5Tl, c5xp, (InterfaceC16620sF) EEc2);
        if (C0fH.A02()) {
            C0fH.A00(-1743438095);
        }
        return interfaceC74953Yl;
    }
}
