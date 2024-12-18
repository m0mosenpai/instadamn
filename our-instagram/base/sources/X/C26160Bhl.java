package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.Bhl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26160Bhl extends C0T6 implements C5HN {
    public final int A00;
    public final long A01;

    @Override // X.C5HN
    public final C26160Bhl F4K() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26160Bhl) {
                C26160Bhl c26160Bhl = (C26160Bhl) obj;
                if (this.A00 != c26160Bhl.A00 || this.A01 != c26160Bhl.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C5HN
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClipNuxInfo", CFR.A00(this));
    }

    public final int hashCode() {
        return (this.A00 * 31) + AbstractC25228BEl.A03(this.A01);
    }

    public C26160Bhl(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    @Override // X.C5HN
    public final int BID() {
        return this.A00;
    }

    @Override // X.C5HN
    public final long BjK() {
        return this.A01;
    }
}
