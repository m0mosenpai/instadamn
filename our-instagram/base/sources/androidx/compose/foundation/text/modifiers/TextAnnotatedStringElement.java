package androidx.compose.foundation.text.modifiers;

import X.C118125Vw;
import X.C14360o3;
import X.C58N;
import X.C5C8;
import X.C5DD;
import X.InterfaceC16660sJ;
import java.util.List;

/* loaded from: classes3.dex */
public final class TextAnnotatedStringElement extends C58N {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C5C8 A03;
    public final C118125Vw A04;
    public final C5DD A05;
    public final List A06;
    public final InterfaceC16660sJ A07;
    public final InterfaceC16660sJ A08;
    public final InterfaceC16660sJ A09;
    public final boolean A0A;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TextAnnotatedStringElement) {
                TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
                if (!C14360o3.A0K(this.A03, textAnnotatedStringElement.A03) || !C14360o3.A0K(this.A04, textAnnotatedStringElement.A04) || !C14360o3.A0K(this.A06, textAnnotatedStringElement.A06) || !C14360o3.A0K(this.A05, textAnnotatedStringElement.A05) || this.A09 != textAnnotatedStringElement.A09 || this.A08 != textAnnotatedStringElement.A08 || this.A02 != textAnnotatedStringElement.A02 || this.A0A != textAnnotatedStringElement.A0A || this.A00 != textAnnotatedStringElement.A00 || this.A01 != textAnnotatedStringElement.A01 || this.A07 != textAnnotatedStringElement.A07) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C58N
    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = ((((this.A03.hashCode() * 31) + this.A04.hashCode()) * 31) + this.A05.hashCode()) * 31;
        InterfaceC16660sJ interfaceC16660sJ = this.A09;
        int i4 = 0;
        if (interfaceC16660sJ != null) {
            i = interfaceC16660sJ.hashCode();
        } else {
            i = 0;
        }
        int i5 = (((hashCode + i) * 31) + this.A02) * 31;
        int i6 = 1237;
        if (this.A0A) {
            i6 = 1231;
        }
        int i7 = (((((i5 + i6) * 31) + this.A00) * 31) + this.A01) * 31;
        List list = this.A06;
        if (list != null) {
            i2 = list.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 31;
        InterfaceC16660sJ interfaceC16660sJ2 = this.A07;
        if (interfaceC16660sJ2 != null) {
            i3 = interfaceC16660sJ2.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31 * 31 * 31;
        InterfaceC16660sJ interfaceC16660sJ3 = this.A08;
        if (interfaceC16660sJ3 != null) {
            i4 = interfaceC16660sJ3.hashCode();
        }
        return i9 + i4;
    }

    public TextAnnotatedStringElement(C5C8 c5c8, C118125Vw c118125Vw, C5DD c5dd, List list, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3, int i, int i2, int i3, boolean z) {
        this.A03 = c5c8;
        this.A04 = c118125Vw;
        this.A05 = c5dd;
        this.A09 = interfaceC16660sJ;
        this.A02 = i;
        this.A0A = z;
        this.A00 = i2;
        this.A01 = i3;
        this.A06 = list;
        this.A07 = interfaceC16660sJ2;
        this.A08 = interfaceC16660sJ3;
    }
}
