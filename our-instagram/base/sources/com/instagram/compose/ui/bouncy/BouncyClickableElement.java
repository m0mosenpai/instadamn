package com.instagram.compose.ui.bouncy;

import X.C14360o3;
import X.C58N;
import X.C5XO;
import X.C5XQ;
import X.InterfaceC16820sZ;

/* loaded from: classes3.dex */
public final class BouncyClickableElement extends C58N {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final C5XO A04;
    public final C5XQ A05;
    public final String A06;
    public final InterfaceC16820sZ A07;
    public final InterfaceC16820sZ A08;
    public final boolean A09;

    public BouncyClickableElement(C5XO c5xo, C5XQ c5xq, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, float f, float f2, float f3, float f4, boolean z) {
        C14360o3.A0B(c5xo, 6);
        this.A09 = z;
        this.A02 = f;
        this.A01 = f2;
        this.A03 = f3;
        this.A00 = f4;
        this.A04 = c5xo;
        this.A06 = str;
        this.A05 = c5xq;
        this.A08 = interfaceC16820sZ;
        this.A07 = interfaceC16820sZ2;
    }

    @Override // X.C58N
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BouncyClickableElement) {
                BouncyClickableElement bouncyClickableElement = (BouncyClickableElement) obj;
                if (this.A09 != bouncyClickableElement.A09 || Float.compare(this.A02, bouncyClickableElement.A02) != 0 || Float.compare(this.A01, bouncyClickableElement.A01) != 0 || Float.compare(this.A03, bouncyClickableElement.A03) != 0 || Float.compare(this.A00, bouncyClickableElement.A00) != 0 || !C14360o3.A0K(this.A04, bouncyClickableElement.A04) || !C14360o3.A0K(this.A06, bouncyClickableElement.A06) || !C14360o3.A0K(this.A05, bouncyClickableElement.A05) || !C14360o3.A0K(this.A08, bouncyClickableElement.A08) || !C14360o3.A0K(this.A07, bouncyClickableElement.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C58N
    public final int hashCode() {
        int hashCode;
        int i;
        int i2 = 1237;
        if (this.A09) {
            i2 = 1231;
        }
        int floatToIntBits = ((((((((((i2 * 31) + Float.floatToIntBits(this.A02)) * 31) + Float.floatToIntBits(this.A01)) * 31) + Float.floatToIntBits(this.A03)) * 31) + Float.floatToIntBits(this.A00)) * 31) + this.A04.hashCode()) * 31;
        String str = this.A06;
        int i3 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i4 = (floatToIntBits + hashCode) * 31;
        C5XQ c5xq = this.A05;
        if (c5xq == null) {
            i = 0;
        } else {
            i = c5xq.A00;
        }
        int i5 = (i4 + i) * 31;
        InterfaceC16820sZ interfaceC16820sZ = this.A08;
        if (interfaceC16820sZ != null) {
            i3 = interfaceC16820sZ.hashCode();
        }
        return ((i5 + i3) * 31) + this.A07.hashCode();
    }
}
