package X;

import java.util.List;

/* renamed from: X.Czk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29532Czk implements InterfaceC30851DhQ {
    public final List A00;

    public C29532Czk(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C29532Czk) && C14360o3.A0K(this.A00, ((C29532Czk) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("FBVideoCreationInput(mediaUrls=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
