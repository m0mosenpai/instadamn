package X;

import java.util.List;

/* renamed from: X.CVz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28002CVz {
    public final int A00;
    public final String A01;
    public final List A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28002CVz) {
                C28002CVz c28002CVz = (C28002CVz) obj;
                if (!C14360o3.A0K(this.A01, c28002CVz.A01) || !C14360o3.A0K(this.A02, c28002CVz.A02) || this.A00 != c28002CVz.A00 || this.A03 != c28002CVz.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A03, (AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0J(this.A01)) + this.A00) * 31);
    }

    public C28002CVz(String str, List list, int i, boolean z) {
        this.A01 = str;
        this.A02 = list;
        this.A00 = i;
        this.A03 = z;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ImagineGenerateResponse(prompt=");
        A1C.append(this.A01);
        A1C.append(", images=");
        A1C.append(this.A02);
        A1C.append(", numOfImagesRequested=");
        A1C.append(this.A00);
        A1C.append(", isMEmuPrompt=");
        return AbstractC25236BEt.A0a(A1C, this.A03);
    }
}
