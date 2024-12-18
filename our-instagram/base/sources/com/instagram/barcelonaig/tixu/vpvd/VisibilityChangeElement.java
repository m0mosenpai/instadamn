package com.instagram.barcelonaig.tixu.vpvd;

import X.C14360o3;
import X.C58N;
import X.InterfaceC136496Gd;
import X.InterfaceC16620sF;

/* loaded from: classes3.dex */
public final class VisibilityChangeElement extends C58N {
    public InterfaceC136496Gd A00;
    public String A01;
    public InterfaceC16620sF A02;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VisibilityChangeElement) {
                VisibilityChangeElement visibilityChangeElement = (VisibilityChangeElement) obj;
                if (!C14360o3.A0K(this.A01, visibilityChangeElement.A01) || !C14360o3.A0K(this.A00, visibilityChangeElement.A00) || !C14360o3.A0K(this.A02, visibilityChangeElement.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C58N
    public final int hashCode() {
        return (((this.A01.hashCode() * 31) + this.A00.hashCode()) * 31) + this.A02.hashCode();
    }
}
