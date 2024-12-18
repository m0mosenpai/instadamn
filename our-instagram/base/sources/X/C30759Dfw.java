package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.Dfw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30759Dfw extends C0YY implements InterfaceC16570sA {
    public static final C30759Dfw A00 = new C30759Dfw();

    public C30759Dfw() {
        super(6);
    }

    @Override // X.InterfaceC16570sA
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i;
        String str = (String) obj;
        InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) obj2;
        C5Tl c5Tl = (C5Tl) obj5;
        int A0H = AbstractC166987dD.A0H(obj6);
        AbstractC167017dG.A1N(str, interfaceC16820sZ);
        if ((A0H & 6) == 0) {
            i = A0H | AbstractC25232BEp.A0R(c5Tl, str);
        } else {
            i = A0H;
        }
        if ((A0H & 48) == 0) {
            i |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((i & 8211) == 8210 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-816886716, "com.instagram.compose.igds.components.headline.ComposableSingletons$IgdsHeadlineKt.lambda-2.<anonymous> (IgdsHeadline.kt:371)");
            }
            C6GE.A06(c5Tl, AbstractC25227BEk.A0H(Modifier.A00, 12.0f), C6GA.A00(c5Tl), str, interfaceC16820sZ, ((i >> 3) & 14) | 384 | ((i << 3) & 112));
            if (C0fH.A02()) {
                C0fH.A00(-2072078834);
            }
        }
        return C0eB.A00;
    }
}
