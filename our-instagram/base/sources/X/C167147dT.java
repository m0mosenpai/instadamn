package X;

import java.util.List;

/* renamed from: X.7dT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C167147dT extends C0T6 implements InterfaceC166427cB {
    public final float A00;
    public final C167297di A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C167147dT) {
                C167147dT c167147dT = (C167147dT) obj;
                if (!C14360o3.A0K(this.A01, c167147dT.A01) || !C14360o3.A0K(this.A02, c167147dT.A02) || Float.compare(this.A00, c167147dT.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31) + Float.floatToIntBits(this.A00);
    }

    public C167147dT(C167297di c167297di, List list, float f) {
        this.A01 = c167297di;
        this.A02 = list;
        this.A00 = f;
    }
}
