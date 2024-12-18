package X;

import java.util.List;

/* renamed from: X.NRg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52659NRg extends AbstractC53517Nlj {
    public final List A00;

    public C52659NRg(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C52659NRg) && C14360o3.A0K(this.A00, ((C52659NRg) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
