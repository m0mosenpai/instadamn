package X;

/* renamed from: X.4TJ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4TJ {
    public final /* synthetic */ C46442Bh A00;
    public final /* synthetic */ String A01;

    public final boolean equals(Object obj) {
        C4AP c4ap;
        if (obj == null) {
            return false;
        }
        if (obj instanceof C121985fq) {
            c4ap = ((C121985fq) obj).A00;
        } else {
            if (!(obj instanceof C91954Ab)) {
                return false;
            }
            c4ap = ((C91954Ab) obj).A02;
        }
        return c4ap != null && this.A01.equals(c4ap.A0D.A0G);
    }

    public C4TJ(C46442Bh c46442Bh, String str) {
        this.A00 = c46442Bh;
        this.A01 = str;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }
}
