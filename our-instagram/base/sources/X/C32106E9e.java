package X;

import java.util.HashMap;

/* renamed from: X.E9e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32106E9e extends C0T6 implements InterfaceC57867PlX {
    public final InterfaceC37110GWv A00;
    public final HashMap A01;

    public C32106E9e(InterfaceC37110GWv interfaceC37110GWv, HashMap hashMap) {
        C14360o3.A0B(interfaceC37110GWv, 1);
        this.A00 = interfaceC37110GWv;
        this.A01 = hashMap;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32106E9e) {
                C32106E9e c32106E9e = (C32106E9e) obj;
                if (!C14360o3.A0K(this.A00, c32106E9e.A00) || !C14360o3.A0K(this.A01, c32106E9e.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A00) + AbstractC167017dG.A0M(this.A01);
    }
}
