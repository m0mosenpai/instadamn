package com.instagram.compose.core.ui;

import X.C14360o3;
import X.C58N;
import X.C5XO;
import X.C5XQ;
import X.InterfaceC16820sZ;

/* loaded from: classes3.dex */
public final class NoIndicationClickableElement extends C58N {
    public final C5XO A00;
    public final C5XQ A01;
    public final String A02;
    public final InterfaceC16820sZ A03;
    public final InterfaceC16820sZ A04;
    public final InterfaceC16820sZ A05;
    public final boolean A06;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NoIndicationClickableElement) {
                NoIndicationClickableElement noIndicationClickableElement = (NoIndicationClickableElement) obj;
                if (!C14360o3.A0K(this.A00, noIndicationClickableElement.A00) || this.A06 != noIndicationClickableElement.A06 || !C14360o3.A0K(this.A02, noIndicationClickableElement.A02) || !C14360o3.A0K(this.A01, noIndicationClickableElement.A01) || !C14360o3.A0K(this.A05, noIndicationClickableElement.A05) || !C14360o3.A0K(this.A04, noIndicationClickableElement.A04) || !C14360o3.A0K(this.A03, noIndicationClickableElement.A03)) {
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
        int hashCode2;
        int hashCode3 = this.A00.hashCode() * 31;
        int i2 = 1237;
        if (this.A06) {
            i2 = 1231;
        }
        int i3 = (hashCode3 + i2) * 31;
        String str = this.A02;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = (i3 + hashCode) * 31;
        C5XQ c5xq = this.A01;
        if (c5xq == null) {
            i = 0;
        } else {
            i = c5xq.A00;
        }
        int i6 = (i5 + i) * 31 * 31;
        InterfaceC16820sZ interfaceC16820sZ = this.A05;
        if (interfaceC16820sZ == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = interfaceC16820sZ.hashCode();
        }
        int i7 = (i6 + hashCode2) * 31;
        InterfaceC16820sZ interfaceC16820sZ2 = this.A04;
        if (interfaceC16820sZ2 != null) {
            i4 = interfaceC16820sZ2.hashCode();
        }
        return ((i7 + i4) * 31) + this.A03.hashCode();
    }

    public NoIndicationClickableElement(C5XO c5xo, C5XQ c5xq, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, boolean z) {
        this.A00 = c5xo;
        this.A06 = z;
        this.A02 = str;
        this.A01 = c5xq;
        this.A05 = interfaceC16820sZ;
        this.A04 = interfaceC16820sZ2;
        this.A03 = interfaceC16820sZ3;
    }
}
