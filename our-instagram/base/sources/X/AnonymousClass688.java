package X;

import java.util.List;

/* renamed from: X.688, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass688 extends C0T6 implements AnonymousClass684 {
    public final C111074zO A00;
    public final List A01;

    public AnonymousClass688(C111074zO c111074zO, List list) {
        C14360o3.A0B(c111074zO, 1);
        C14360o3.A0B(list, 2);
        this.A00 = c111074zO;
        this.A01 = list;
    }

    @Override // X.AnonymousClass684
    public final AnonymousClass688 ExM(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass688) {
                AnonymousClass688 anonymousClass688 = (AnonymousClass688) obj;
                if (!C14360o3.A0K(this.A00, anonymousClass688.A00) || !C14360o3.A0K(this.A01, anonymousClass688.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final InterfaceC111084zP A00() {
        return this.A00;
    }
}
