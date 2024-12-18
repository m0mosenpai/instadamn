package X;

import java.util.List;

/* renamed from: X.Ebm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32782Ebm extends AbstractC33535Es9 {
    public final List A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C32782Ebm) && C14360o3.A0K(this.A00, ((C32782Ebm) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C32782Ebm(List list) {
        this.A00 = list;
    }

    public C32782Ebm() {
        this(C16930sl.A00);
    }
}
