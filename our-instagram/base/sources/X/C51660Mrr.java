package X;

import java.util.List;

/* renamed from: X.Mrr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51660Mrr extends C0T6 {
    public final List A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51660Mrr) {
                C51660Mrr c51660Mrr = (C51660Mrr) obj;
                if (!C14360o3.A0K(this.A01, c51660Mrr.A01) || !C14360o3.A0K(this.A00, c51660Mrr.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0G(this.A01));
    }

    public C51660Mrr(List list, List list2) {
        AbstractC167017dG.A1P(list, list2);
        this.A01 = list;
        this.A00 = list2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ViewState(suggestedAudioTracks=");
        A1C.append(this.A01);
        A1C.append(", preSelectedAudio=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
