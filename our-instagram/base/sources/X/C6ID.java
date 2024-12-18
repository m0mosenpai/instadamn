package X;

/* renamed from: X.6ID, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6ID implements InterfaceC118335Wv {
    public final float A00;
    public final float A01;
    public final InterfaceC16620sF A02;
    public final boolean A03;

    @Override // X.InterfaceC118275Wp
    public final void ACX(InterfaceC1128957x interfaceC1128957x, AnonymousClass583 anonymousClass583, int[] iArr, int[] iArr2, int i) {
        int i2;
        int i3;
        InterfaceC16620sF interfaceC16620sF;
        int length = iArr.length;
        if (length != 0) {
            int EL8 = interfaceC1128957x.EL8(this.A00);
            if (this.A03) {
                i2 = 0;
                i3 = 0;
                if (anonymousClass583 == AnonymousClass583.Rtl) {
                    for (int i4 = length - 1; -1 < i4; i4--) {
                        int i5 = iArr[i4];
                        int min = Math.min(i2, i - i5);
                        iArr2[i4] = min;
                        i3 = Math.min(EL8, (i - min) - i5);
                        i2 = min + i5 + i3;
                    }
                    int i6 = i2 - i3;
                    interfaceC16620sF = this.A02;
                    if (interfaceC16620sF == null && i6 < i) {
                        int intValue = ((Number) interfaceC16620sF.invoke(Integer.valueOf(i - i6), anonymousClass583)).intValue();
                        int length2 = iArr2.length;
                        for (int i7 = 0; i7 < length2; i7++) {
                            iArr2[i7] = iArr2[i7] + intValue;
                        }
                        return;
                    }
                }
            }
            int i8 = 0;
            i2 = 0;
            i3 = 0;
            int i9 = 0;
            while (i8 < length) {
                int i10 = iArr[i8];
                int min2 = Math.min(i2, i - i10);
                iArr2[i9] = min2;
                i3 = Math.min(EL8, (i - min2) - i10);
                i2 = min2 + i10 + i3;
                i8++;
                i9++;
            }
            int i62 = i2 - i3;
            interfaceC16620sF = this.A02;
            if (interfaceC16620sF == null) {
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6ID) {
                C6ID c6id = (C6ID) obj;
                if (!C119145aW.A01(this.A00, c6id.A00) || this.A03 != c6id.A03 || !C14360o3.A0K(this.A02, c6id.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC118305Ws
    public final void ACY(InterfaceC1128957x interfaceC1128957x, int[] iArr, int[] iArr2, int i) {
        ACX(interfaceC1128957x, AnonymousClass583.Ltr, iArr, iArr2, i);
    }

    @Override // X.InterfaceC118275Wp
    public final float Byx() {
        return this.A01;
    }

    public final int hashCode() {
        int hashCode;
        int floatToIntBits = Float.floatToIntBits(this.A00) * 31;
        int i = 1237;
        if (this.A03) {
            i = 1231;
        }
        int i2 = (floatToIntBits + i) * 31;
        InterfaceC16620sF interfaceC16620sF = this.A02;
        if (interfaceC16620sF == null) {
            hashCode = 0;
        } else {
            hashCode = interfaceC16620sF.hashCode();
        }
        return i2 + hashCode;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.A03) {
            str = "";
        } else {
            str = "Absolute";
        }
        sb.append(str);
        sb.append("Arrangement#spacedAligned(");
        sb.append((Object) C119145aW.A00(this.A00));
        sb.append(", ");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    public C6ID(InterfaceC16620sF interfaceC16620sF, float f, boolean z) {
        this.A00 = f;
        this.A03 = z;
        this.A02 = interfaceC16620sF;
        this.A01 = f;
    }
}
