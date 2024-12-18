package X;

import java.util.List;

/* renamed from: X.EcP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32821EcP extends AbstractC33544EsI {
    public final List A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C32821EcP) && C14360o3.A0K(this.A00, ((C32821EcP) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C32821EcP(List list) {
        this.A00 = list;
    }
}
