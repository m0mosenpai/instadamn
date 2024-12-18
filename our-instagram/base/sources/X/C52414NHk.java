package X;

/* renamed from: X.NHk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52414NHk extends AbstractC187488Sq implements InterfaceC187498Sr {
    public final int A00;
    public final Integer A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52414NHk) {
                C52414NHk c52414NHk = (C52414NHk) obj;
                if (this.A00 != c52414NHk.A00 || this.A01 != c52414NHk.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AbstractC187488Sq
    public final int getSegmentIndex() {
        return this.A00;
    }

    public final int hashCode() {
        int i = this.A00 * 31;
        Integer num = this.A01;
        return i + AbstractC25230BEn.A0C(num, AbstractC53902Nsb.A00(num));
    }

    public C52414NHk(int i, Integer num) {
        this.A00 = i;
        this.A01 = num;
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("JumpCut(segmentIndex=");
        A1C.append(this.A00);
        A1C.append(", detailedState=");
        Integer num = this.A01;
        if (num != null) {
            str = AbstractC53902Nsb.A00(num);
        } else {
            str = "null";
        }
        return AbstractC25236BEt.A0Y(str, A1C);
    }
}
