package com.instagram.barcelonaig.tixu.vpvd;

import X.C14360o3;
import X.C58N;
import X.InterfaceC16620sF;

/* loaded from: classes3.dex */
public final class VPVDElement extends C58N {
    public String A00;
    public InterfaceC16620sF A01;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VPVDElement) {
                VPVDElement vPVDElement = (VPVDElement) obj;
                if (!C14360o3.A0K(this.A00, vPVDElement.A00) || !C14360o3.A0K(this.A01, vPVDElement.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C58N
    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }
}
