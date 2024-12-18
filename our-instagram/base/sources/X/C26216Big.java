package X;

import java.util.List;

/* renamed from: X.Big, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26216Big extends C0T6 implements InterfaceC30827Dh2 {
    public final List A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26216Big) {
                C26216Big c26216Big = (C26216Big) obj;
                if (!C14360o3.A0K(this.A00, c26216Big.A00) || this.A01 != c26216Big.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public C26216Big(List list, boolean z) {
        this.A00 = list;
        this.A01 = z;
    }
}
