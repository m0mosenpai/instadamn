package X;

/* renamed from: X.FPp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34680FPp {
    public final AbstractC12990ll A00;
    public final FH2 A01;
    public final String A02;

    public final boolean A00(boolean z, boolean z2) {
        if (this instanceof Ega) {
            if (z && !((C34564FKy) AbstractC166987dD.A16(this.A01.A00)).A00) {
                return true;
            }
        } else if (z && z2 && !((C34564FKy) AbstractC166987dD.A16(this.A01.A00)).A00) {
            return true;
        }
        return false;
    }

    public AbstractC34680FPp(AbstractC12990ll abstractC12990ll, FH2 fh2, String str) {
        this.A00 = abstractC12990ll;
        this.A02 = str;
        this.A01 = fh2;
    }
}
