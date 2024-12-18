package X;

import java.util.HashMap;

/* renamed from: X.Mux, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51793Mux extends C0T6 implements InterfaceC58238Pri {
    public final HashMap A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C51793Mux) && C14360o3.A0K(this.A00, ((C51793Mux) obj).A00));
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00);
    }

    public C51793Mux(HashMap hashMap) {
        this.A00 = hashMap;
    }
}
