package X;

import androidx.compose.ui.text.input.ImeAction;

/* renamed from: X.CdS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28281CdS {
    public static final C28281CdS A04 = new C28281CdS(null, -1, 0, -1);
    public final int A00;
    public final int A01;
    public final int A02;
    public final Boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28281CdS) {
                C28281CdS c28281CdS = (C28281CdS) obj;
                if (this.A00 != c28281CdS.A00 || !C14360o3.A0K(this.A03, c28281CdS.A03) || this.A02 != c28281CdS.A02 || this.A01 != c28281CdS.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final C114085Cu A00(boolean z) {
        boolean z2;
        C114085Cu c114085Cu = C114085Cu.A06;
        int i = this.A00;
        if (i == -1) {
            i = 0;
        }
        Boolean bool = this.A03;
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            z2 = true;
        }
        int i2 = this.A02;
        if (i2 == 0) {
            i2 = 1;
        }
        int i3 = this.A01;
        if (i3 == -1) {
            i3 = 1;
        }
        return new C114085Cu(C114095Cv.A02, i, i2, i3, z, z2);
    }

    public final int hashCode() {
        return AbstractC25225BEi.A05(((((this.A00 * 31) + AbstractC25235BEs.A06(this.A03)) * 31) + this.A02) * 31, this.A01) * 31;
    }

    public C28281CdS(Boolean bool, int i, int i2, int i3) {
        this.A00 = i;
        this.A03 = bool;
        this.A02 = i2;
        this.A01 = i3;
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("KeyboardOptions(capitalization=");
        int i = this.A00;
        if (i == -1) {
            str = "Unspecified";
        } else if (i == 0) {
            str = "None";
        } else if (i == 1) {
            str = "Characters";
        } else if (i == 2) {
            str = "Words";
        } else {
            str = "Sentences";
        }
        A1C.append((Object) str);
        A1C.append(", autoCorrectEnabled=");
        A1C.append(this.A03);
        A1C.append(AbstractC111324zv.A00(3398));
        A1C.append((Object) AbstractC27481CBc.A00(this.A02));
        A1C.append(AbstractC111324zv.A00(3380));
        A1C.append((Object) ImeAction.A00(this.A01));
        A1C.append(AbstractC111324zv.A00(3420));
        A1C.append((Object) null);
        A1C.append("showKeyboardOnFocus=");
        A1C.append((Object) null);
        A1C.append(AbstractC111324zv.A00(3379));
        return AbstractC167017dG.A0o(null, A1C);
    }
}
