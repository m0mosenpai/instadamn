package X;

/* renamed from: X.DvQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31660DvQ {
    public final /* synthetic */ JR3 A00;

    public C31660DvQ(JR3 jr3) {
        this.A00 = jr3;
    }

    public final AbstractC46972Dl A00() {
        JR2 jr2 = this.A00.A05;
        if (jr2 != null) {
            return jr2.A0u();
        }
        throw AbstractC166997dE.A0g();
    }

    public final void A01() {
        String str;
        C56352iT c56352iT;
        JR3 jr3 = this.A00;
        C31261Doj c31261Doj = jr3.A02;
        if (c31261Doj == null) {
            str = "actionBarController";
        } else {
            if (c31261Doj.A04.isResumed() && (c56352iT = c31261Doj.A00) != null) {
                c56352iT.A0T();
            }
            C31665DvV c31665DvV = jr3.A06;
            if (c31665DvV != null) {
                C31256Doe c31256Doe = jr3.A04;
                if (c31256Doe == null) {
                    str = "actionBarRepository";
                } else {
                    boolean z = c31665DvV.A03;
                    int size = c31665DvV.A0D.size();
                    if (c31256Doe.A03 != z || c31256Doe.A00 != size) {
                        c31256Doe.A03 = z;
                        c31256Doe.A00 = size;
                        C31256Doe.A01(c31256Doe);
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
