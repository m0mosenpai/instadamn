package X;

import java.util.List;

/* renamed from: X.9lC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218409lC extends AbstractC223779uM {
    public final List A00;

    public C218409lC(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C218409lC) && C14360o3.A0K(this.A00, ((C218409lC) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
