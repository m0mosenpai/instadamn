package X;

import java.util.List;

/* renamed from: X.Cd2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28257Cd2 {
    public final List A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C28257Cd2) && C14360o3.A0K(this.A00, ((C28257Cd2) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C28257Cd2(List list) {
        this.A00 = list;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("WriteWithAIFetchPromptSuggestionsResponse(result=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }

    public C28257Cd2() {
        this(C16930sl.A00);
    }
}
