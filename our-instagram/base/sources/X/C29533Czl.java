package X;

/* renamed from: X.Czl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29533Czl implements InterfaceC30851DhQ {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C29533Czl) {
                C29533Czl c29533Czl = (C29533Czl) obj;
                if (!C14360o3.A0K(this.A00, c29533Czl.A00) || !C14360o3.A0K(this.A01, c29533Czl.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return AnonymousClass001.A0v("IGStoriesCreationInput(mediaUrl=", this.A00, ", text=", this.A01, ')');
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166987dD.A0J(this.A00));
    }

    public C29533Czl(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
