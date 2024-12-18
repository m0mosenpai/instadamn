package X;

import java.util.List;

/* renamed from: X.EeO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32942EeO extends AbstractC33557EsV {
    public final List A00;

    public C32942EeO(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C32942EeO) && C14360o3.A0K(this.A00, ((C32942EeO) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
