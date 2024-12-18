package androidx.compose.foundation;

import X.C14360o3;
import X.C58N;
import X.C5XO;
import X.C5XQ;
import X.InterfaceC118065Vq;
import X.InterfaceC16820sZ;

/* loaded from: classes3.dex */
public final class CombinedClickableElement extends C58N {
    public final InterfaceC118065Vq A00;
    public final C5XO A01;
    public final C5XQ A02;
    public final String A03;
    public final String A04;
    public final InterfaceC16820sZ A05;
    public final InterfaceC16820sZ A06;
    public final InterfaceC16820sZ A07;
    public final boolean A08;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
                if (!C14360o3.A0K(this.A01, combinedClickableElement.A01) || !C14360o3.A0K(this.A00, combinedClickableElement.A00) || this.A08 != combinedClickableElement.A08 || !C14360o3.A0K(this.A03, combinedClickableElement.A03) || !C14360o3.A0K(this.A02, combinedClickableElement.A02) || this.A05 != combinedClickableElement.A05 || !C14360o3.A0K(this.A04, combinedClickableElement.A04) || this.A07 != combinedClickableElement.A07 || this.A06 != combinedClickableElement.A06) {
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
        int i4;
        int i5;
        int i6;
        C5XO c5xo = this.A01;
        int i7 = 0;
        if (c5xo != null) {
            i = c5xo.hashCode();
        } else {
            i = 0;
        }
        int i8 = i * 31;
        InterfaceC118065Vq interfaceC118065Vq = this.A00;
        if (interfaceC118065Vq != null) {
            i2 = interfaceC118065Vq.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = (i8 + i2) * 31;
        int i10 = 1237;
        if (this.A08) {
            i10 = 1231;
        }
        int i11 = (i9 + i10) * 31;
        String str = this.A03;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i12 = (i11 + i3) * 31;
        C5XQ c5xq = this.A02;
        if (c5xq != null) {
            i4 = c5xq.A00;
        } else {
            i4 = 0;
        }
        int hashCode = (((i12 + i4) * 31) + this.A05.hashCode()) * 31;
        String str2 = this.A04;
        if (str2 != null) {
            i5 = str2.hashCode();
        } else {
            i5 = 0;
        }
        int i13 = (hashCode + i5) * 31;
        InterfaceC16820sZ interfaceC16820sZ = this.A07;
        if (interfaceC16820sZ != null) {
            i6 = interfaceC16820sZ.hashCode();
        } else {
            i6 = 0;
        }
        int i14 = (i13 + i6) * 31;
        InterfaceC16820sZ interfaceC16820sZ2 = this.A06;
        if (interfaceC16820sZ2 != null) {
            i7 = interfaceC16820sZ2.hashCode();
        }
        return i14 + i7;
    }

    public CombinedClickableElement(InterfaceC118065Vq interfaceC118065Vq, C5XO c5xo, C5XQ c5xq, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, boolean z) {
        this.A01 = c5xo;
        this.A00 = interfaceC118065Vq;
        this.A08 = z;
        this.A03 = str;
        this.A02 = c5xq;
        this.A05 = interfaceC16820sZ;
        this.A04 = str2;
        this.A07 = interfaceC16820sZ2;
        this.A06 = interfaceC16820sZ3;
    }
}
