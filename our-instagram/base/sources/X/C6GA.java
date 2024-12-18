package X;

/* renamed from: X.6GA, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6GA {
    public static final C6GA A00 = new Object();

    public final C25267BGf A03(C5Tl c5Tl, int i, boolean z, boolean z2) {
        boolean z3;
        long j;
        long j2;
        C6KV c6kv;
        long A02;
        long j3;
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if (C0fH.A02()) {
            C0fH.A01(1009613327, "com.instagram.compose.igds.components.button.IgdsButtonStyles.secondaryLabel (IgdsButton.kt:251)");
        }
        C1QL A0E = C1QI.A0E();
        if (C0fH.A02()) {
            C0fH.A01(1027139793, "com.instagram.compose.igds.components.button.IgdsButtonStyles.secondaryLabelInternal (IgdsButton.kt:259)");
        }
        C117505Tk c117505Tk = (C117505Tk) c5Tl;
        boolean z4 = ((C5WQ) C5UT.A01(C5WO.A00, C117505Tk.A04(c117505Tk))).A00;
        if (A0E == C1QL.A04) {
            j = AbstractC118025Vm.A0r;
            if (z4) {
                j2 = AbstractC118025Vm.A0J;
            } else {
                j2 = AbstractC118025Vm.A0L;
            }
            if (z4) {
                j3 = AbstractC118025Vm.A0J;
            } else {
                j3 = AbstractC118025Vm.A00;
            }
            c6kv = C6G9.A00(1.0f, j3);
        } else {
            if (z) {
                c5Tl.Eno(941222910);
                z3 = false;
                j = C5XL.A00(c5Tl).A0g;
            } else if (z2) {
                c5Tl.Eno(-886803727);
                z3 = false;
                j = C5XL.A00(c5Tl).A0j;
            } else {
                c5Tl.Eno(-886727436);
                z3 = false;
                j = C5XL.A00(c5Tl).A0S;
            }
            C117505Tk.A0L(c117505Tk, z3);
            if (z) {
                c5Tl.Eno(941237815);
                j2 = C5XL.A00(c5Tl).A0l;
            } else {
                c5Tl.Eno(941238901);
                j2 = C5XL.A00(c5Tl).A0o;
            }
            C117505Tk.A0L(c117505Tk, z3);
            c6kv = null;
        }
        A02 = C5AC.A02(AbstractC1132459m.A0K[(int) (j2 & 63)], C1132359l.A03(j2), C1132359l.A02(j2), C1132359l.A01(j2), 0.3f);
        C25267BGf c25267BGf = new C25267BGf(c6kv, 1.0f, j, j2, A02);
        if (C0fH.A02()) {
            C0fH.A00(-346892854);
        }
        if (C0fH.A02()) {
            C0fH.A00(-1390495159);
        }
        return c25267BGf;
    }

    public static final C6GB A00(C5Tl c5Tl) {
        long j;
        if (C0fH.A02()) {
            C0fH.A01(685404860, "com.instagram.compose.igds.components.button.IgdsButtonStyles.primaryLink (IgdsButton.kt:302)");
        }
        C1QL A0E = C1QI.A0E();
        c5Tl.AJX(C5WO.A00);
        if (A0E == C1QL.A04) {
            j = AbstractC118025Vm.A0X;
        } else {
            j = C5XL.A00(c5Tl).A0l;
        }
        C6GB c6gb = new C6GB(j);
        if (C0fH.A02()) {
            C0fH.A00(1755372377);
        }
        return c6gb;
    }

    public static final C6GB A01(C5Tl c5Tl) {
        long j;
        if (C0fH.A02()) {
            C0fH.A01(-311245888, "com.instagram.compose.igds.components.button.IgdsButtonStyles.secondaryLink (IgdsButton.kt:317)");
        }
        C1QL A0E = C1QI.A0E();
        boolean z = ((C5WQ) C5UT.A01(C5WO.A00, C117505Tk.A04((C117505Tk) c5Tl))).A00;
        if (A0E == C1QL.A04) {
            if (z) {
                j = AbstractC118025Vm.A0s;
            } else {
                j = AbstractC118025Vm.A00;
            }
        } else {
            j = C5XL.A00(c5Tl).A0o;
        }
        C6GB c6gb = new C6GB(j);
        if (C0fH.A02()) {
            C0fH.A00(-684680883);
        }
        return c6gb;
    }

    public final C25267BGf A02(C5Tl c5Tl) {
        long j;
        long j2;
        if (C0fH.A02()) {
            C0fH.A01(-845326052, "com.instagram.compose.igds.components.button.IgdsButtonStyles.primaryLabel (IgdsButton.kt:222)");
        }
        C1QL A0E = C1QI.A0E();
        if (C0fH.A02()) {
            C0fH.A01(987355121, "com.instagram.compose.igds.components.button.IgdsButtonStyles.primaryLabelInternal (IgdsButton.kt:226)");
        }
        c5Tl.AJX(C5WO.A00);
        if (A0E == C1QL.A04) {
            j = AbstractC118025Vm.A0X;
            j2 = AbstractC118025Vm.A0s;
        } else {
            j = C5XL.A00(c5Tl).A0l;
            j2 = C5XL.A00(c5Tl).A13;
        }
        C25267BGf c25267BGf = new C25267BGf(null, 0.3f, j, j2, j2);
        if (C0fH.A02()) {
            C0fH.A00(1447203059);
        }
        if (C0fH.A02()) {
            C0fH.A00(768142567);
        }
        return c25267BGf;
    }
}
