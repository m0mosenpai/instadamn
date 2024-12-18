package X;

import java.util.List;

/* renamed from: X.689, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass689 extends C0T6 implements C68A {
    public final List A00;
    public final List A01;

    public AnonymousClass689(List list, List list2) {
        C14360o3.A0B(list, 1);
        C14360o3.A0B(list2, 2);
        this.A00 = list;
        this.A01 = list2;
    }

    @Override // X.C68A
    public final AnonymousClass689 EsK(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass689) {
                AnonymousClass689 anonymousClass689 = (AnonymousClass689) obj;
                if (!C14360o3.A0K(this.A00, anonymousClass689.A00) || !C14360o3.A0K(this.A01, anonymousClass689.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }
}
