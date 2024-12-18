package androidx.compose.foundation.text.modifiers;

import X.C118125Vw;
import X.C14360o3;
import X.C58N;
import X.C5DD;

/* loaded from: classes3.dex */
public final class TextStringSimpleElement extends C58N {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C118125Vw A03;
    public final C5DD A04;
    public final String A05;
    public final boolean A06;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TextStringSimpleElement) {
                TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
                if (!C14360o3.A0K(this.A05, textStringSimpleElement.A05) || !C14360o3.A0K(this.A03, textStringSimpleElement.A03) || !C14360o3.A0K(this.A04, textStringSimpleElement.A04) || this.A02 != textStringSimpleElement.A02 || this.A06 != textStringSimpleElement.A06 || this.A00 != textStringSimpleElement.A00 || this.A01 != textStringSimpleElement.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C58N
    public final int hashCode() {
        int hashCode = ((((((this.A05.hashCode() * 31) + this.A03.hashCode()) * 31) + this.A04.hashCode()) * 31) + this.A02) * 31;
        int i = 1237;
        if (this.A06) {
            i = 1231;
        }
        return (((((hashCode + i) * 31) + this.A00) * 31) + this.A01) * 31;
    }

    public TextStringSimpleElement(C118125Vw c118125Vw, C5DD c5dd, String str, int i, int i2, int i3, boolean z) {
        this.A05 = str;
        this.A03 = c118125Vw;
        this.A04 = c5dd;
        this.A02 = i;
        this.A06 = z;
        this.A00 = i2;
        this.A01 = i3;
    }
}
