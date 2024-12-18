package X;

/* renamed from: X.Cbu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28197Cbu {
    public static final C28197Cbu A00 = new Object();

    public final void A00(C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z) {
        int i2;
        C14360o3.A0B(interfaceC16820sZ, 0);
        c5Tl.Enr(186292424);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0c(c5Tl, z);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1899919892, "com.instagram.direct.inbox.ui.conversationstartersmenu.FloatingActionButton.FloatingActionButton (FloatingActionButton.kt:43)");
            }
            if (AbstractC25235BEs.A1Z(c5Tl, new DSY(interfaceC16820sZ, "Conversation_Starters_Floating_Action_Button", 3, z), 467586890)) {
                C0fH.A00(-1026190340);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30488DbX(i, 14, this, interfaceC16820sZ, z);
        }
    }
}
