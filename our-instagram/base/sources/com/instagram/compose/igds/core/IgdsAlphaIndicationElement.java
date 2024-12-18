package com.instagram.compose.igds.core;

import X.C14360o3;
import X.C58N;
import X.C5XO;

/* loaded from: classes3.dex */
public final class IgdsAlphaIndicationElement extends C58N {
    public final float A00;
    public final C5XO A01;
    public final boolean A02;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IgdsAlphaIndicationElement) {
                IgdsAlphaIndicationElement igdsAlphaIndicationElement = (IgdsAlphaIndicationElement) obj;
                if (!C14360o3.A0K(this.A01, igdsAlphaIndicationElement.A01) || this.A02 != igdsAlphaIndicationElement.A02 || Float.compare(this.A00, igdsAlphaIndicationElement.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C58N
    public final int hashCode() {
        int hashCode = this.A01.hashCode() * 31;
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        return ((hashCode + i) * 31) + Float.floatToIntBits(this.A00);
    }

    public IgdsAlphaIndicationElement(C5XO c5xo, float f, boolean z) {
        this.A01 = c5xo;
        this.A02 = z;
        this.A00 = f;
    }
}
