package androidx.compose.foundation.gestures;

import X.C14360o3;
import X.C58N;
import X.C5XO;
import X.C6M3;
import X.C6M4;
import X.C6MZ;
import X.InterfaceC137936Mt;
import X.InterfaceC31113Dlv;

/* loaded from: classes3.dex */
public final class ScrollableElement extends C58N {
    public final InterfaceC137936Mt A00;
    public final InterfaceC31113Dlv A01;
    public final C6MZ A02;
    public final C6M3 A03;
    public final C6M4 A04;
    public final C5XO A05;
    public final boolean A06;
    public final boolean A07;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ScrollableElement) {
                ScrollableElement scrollableElement = (ScrollableElement) obj;
                if (!C14360o3.A0K(this.A04, scrollableElement.A04) || this.A03 != scrollableElement.A03 || !C14360o3.A0K(this.A00, scrollableElement.A00) || this.A06 != scrollableElement.A06 || this.A07 != scrollableElement.A07 || !C14360o3.A0K(this.A02, scrollableElement.A02) || !C14360o3.A0K(this.A05, scrollableElement.A05) || !C14360o3.A0K(this.A01, scrollableElement.A01)) {
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
        int hashCode = ((this.A04.hashCode() * 31) + this.A03.hashCode()) * 31;
        InterfaceC137936Mt interfaceC137936Mt = this.A00;
        int i4 = 0;
        if (interfaceC137936Mt != null) {
            i = interfaceC137936Mt.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 31;
        int i6 = 1237;
        if (this.A06) {
            i6 = 1231;
        }
        int i7 = (i5 + i6) * 31;
        int i8 = 1237;
        if (this.A07) {
            i8 = 1231;
        }
        int i9 = (i7 + i8) * 31;
        C6MZ c6mz = this.A02;
        if (c6mz != null) {
            i2 = c6mz.hashCode();
        } else {
            i2 = 0;
        }
        int i10 = (i9 + i2) * 31;
        C5XO c5xo = this.A05;
        if (c5xo != null) {
            i3 = c5xo.hashCode();
        } else {
            i3 = 0;
        }
        int i11 = (i10 + i3) * 31;
        InterfaceC31113Dlv interfaceC31113Dlv = this.A01;
        if (interfaceC31113Dlv != null) {
            i4 = interfaceC31113Dlv.hashCode();
        }
        return i11 + i4;
    }

    public ScrollableElement(InterfaceC137936Mt interfaceC137936Mt, InterfaceC31113Dlv interfaceC31113Dlv, C6MZ c6mz, C6M3 c6m3, C6M4 c6m4, C5XO c5xo, boolean z, boolean z2) {
        this.A04 = c6m4;
        this.A03 = c6m3;
        this.A00 = interfaceC137936Mt;
        this.A06 = z;
        this.A07 = z2;
        this.A02 = c6mz;
        this.A05 = c5xo;
        this.A01 = interfaceC31113Dlv;
    }
}
