package X;

import java.util.List;

/* renamed from: X.BiP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26199BiP extends C0T6 implements InterfaceC30819Dgu {
    public final List A00;

    public C26199BiP(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C26199BiP) && C14360o3.A0K(this.A00, ((C26199BiP) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
