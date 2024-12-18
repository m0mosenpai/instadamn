package X;

/* renamed from: X.Vtp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69694Vtp {
    public final /* synthetic */ C46442Bh A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

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
        if (c4ap == null) {
            return false;
        }
        String str = this.A01;
        C4AN c4an = c4ap.A0D;
        if (str.equals(c4an.A0A)) {
            return (this.A02 && c4an.A0N) ? false : true;
        }
        return false;
    }

    public C69694Vtp(C46442Bh c46442Bh, String str, boolean z) {
        this.A00 = c46442Bh;
        this.A01 = str;
        this.A02 = z;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }
}
