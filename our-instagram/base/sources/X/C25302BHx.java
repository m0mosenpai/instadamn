package X;

/* renamed from: X.BHx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25302BHx extends BH1 {
    public final int A00;
    public final C25303BHy A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25302BHx) {
                C25302BHx c25302BHx = (C25302BHx) obj;
                if (!C14360o3.A0K(this.A01, c25302BHx.A01) || this.A00 != c25302BHx.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public C25302BHx(C25303BHy c25303BHy, int i) {
        super(c25303BHy.A04, "content_type_suggested_user");
        this.A01 = c25303BHy;
        this.A00 = i;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A01) + this.A00;
    }
}
