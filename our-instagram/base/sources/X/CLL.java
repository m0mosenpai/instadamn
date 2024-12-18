package X;

/* loaded from: classes5.dex */
public abstract class CLL {
    public static final void A00(C5Tl c5Tl, C26052Bff c26052Bff, InterfaceC16820sZ interfaceC16820sZ, int i) {
        int i2;
        C5UU ASZ;
        int i3;
        AbstractC167017dG.A1N(c26052Bff, interfaceC16820sZ);
        c5Tl.Enr(-1626869895);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c26052Bff) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1999410267, "instagram.features.clips.spins.feedback.ui.ClipsSpinsReplyBottomSheetHeader (ClipsSpinsReplyBottomSheetHeader.kt:28)");
            }
            String str = c26052Bff.A03;
            if (str == null) {
                if (C0fH.A02()) {
                    C0fH.A00(-814525572);
                }
                ASZ = c5Tl.ASZ();
                if (ASZ == null) {
                    return;
                } else {
                    i3 = 43;
                }
            } else {
                String str2 = c26052Bff.A02;
                if (str2 == null) {
                    if (C0fH.A02()) {
                        C0fH.A00(71392268);
                    }
                    ASZ = c5Tl.ASZ();
                    if (ASZ == null) {
                        return;
                    } else {
                        i3 = 42;
                    }
                } else {
                    if (AbstractC25235BEs.A1Y(c5Tl, AbstractC25227BEk.A0H(AbstractC25228BEl.A0W(), 12.0f), new C30228DTh(c26052Bff, interfaceC16820sZ, str2, str, c26052Bff.A04, 2), -2063481545)) {
                        C0fH.A00(-1328917735);
                    }
                }
            }
            C30508Dbr.A01(ASZ, c26052Bff, interfaceC16820sZ, i, i3);
        }
        ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            i3 = 41;
            C30508Dbr.A01(ASZ, c26052Bff, interfaceC16820sZ, i, i3);
        }
    }
}
