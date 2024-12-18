package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.Dfv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30758Dfv extends C0YY implements InterfaceC16570sA {
    public static final C30758Dfv A00 = new C30758Dfv();

    public C30758Dfv() {
        super(6);
    }

    @Override // X.InterfaceC16570sA
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i;
        String str = (String) obj;
        InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) obj2;
        String str2 = (String) obj3;
        InterfaceC16820sZ interfaceC16820sZ2 = (InterfaceC16820sZ) obj4;
        C5Tl c5Tl = (C5Tl) obj5;
        int A0H = AbstractC166987dD.A0H(obj6);
        boolean A1R = AbstractC167007dF.A1R(0, str, interfaceC16820sZ);
        if ((A0H & 6) == 0) {
            i = AbstractC25232BEp.A0R(c5Tl, str) | A0H;
        } else {
            i = A0H;
        }
        if ((A0H & 48) == 0) {
            i |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((A0H & 384) == 0) {
            i |= AbstractC25232BEp.A0T(c5Tl, str2);
        }
        if ((A0H & 3072) == 0) {
            i |= AbstractC25232BEp.A0K(c5Tl, interfaceC16820sZ2);
        }
        if ((i & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(609763966, "com.instagram.compose.igds.components.headline.ComposableSingletons$IgdsHeadlineKt.lambda-1.<anonymous> (IgdsHeadline.kt:350)");
            }
            int i2 = i << 9;
            AbstractC28506Chz.A04(c5Tl, AbstractC118175Wb.A0E(Modifier.A00, 0.0f, 16.0f, 0.0f, 8.0f), null, str, str2, interfaceC16820sZ, interfaceC16820sZ2, null, (i & 14) | 384 | (i & 112) | (458752 & i2) | (i2 & 3670016), 27648, 8088, false, false, false, false, false, false, false, A1R);
            if (C0fH.A02()) {
                C0fH.A00(1847175523);
            }
        }
        return C0eB.A00;
    }
}
