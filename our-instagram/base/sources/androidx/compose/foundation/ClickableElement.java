package androidx.compose.foundation;

import X.C14360o3;
import X.C58N;
import X.C5XO;
import X.C5XQ;
import X.InterfaceC118065Vq;
import X.InterfaceC16820sZ;

/* loaded from: classes3.dex */
public final class ClickableElement extends C58N {
    public final InterfaceC118065Vq A00;
    public final C5XO A01;
    public final C5XQ A02;
    public final String A03;
    public final InterfaceC16820sZ A04;
    public final boolean A05;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                ClickableElement clickableElement = (ClickableElement) obj;
                if (!C14360o3.A0K(this.A01, clickableElement.A01) || !C14360o3.A0K(this.A00, clickableElement.A00) || this.A05 != clickableElement.A05 || !C14360o3.A0K(this.A03, clickableElement.A03) || !C14360o3.A0K(this.A02, clickableElement.A02) || this.A04 != clickableElement.A04) {
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
        C5XO c5xo = this.A01;
        int i4 = 0;
        if (c5xo != null) {
            i = c5xo.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        InterfaceC118065Vq interfaceC118065Vq = this.A00;
        if (interfaceC118065Vq != null) {
            i2 = interfaceC118065Vq.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        int i7 = 1237;
        if (this.A05) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        String str = this.A03;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        C5XQ c5xq = this.A02;
        if (c5xq != null) {
            i4 = c5xq.A00;
        }
        return ((i9 + i4) * 31) + this.A04.hashCode();
    }

    public ClickableElement(InterfaceC118065Vq interfaceC118065Vq, C5XO c5xo, C5XQ c5xq, String str, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        this.A01 = c5xo;
        this.A00 = interfaceC118065Vq;
        this.A05 = z;
        this.A03 = str;
        this.A02 = c5xq;
        this.A04 = interfaceC16820sZ;
    }
}
