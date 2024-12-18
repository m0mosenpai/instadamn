package X;

/* loaded from: classes10.dex */
public final class RF3 extends AbstractC61294RlE {
    public final long A00;
    public final AbstractC61581Rq5 A01;
    public final AbstractC61582Rq6 A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof AbstractC61294RlE)) {
                return false;
            }
            RF3 rf3 = (RF3) ((AbstractC61294RlE) obj);
            if (this.A00 != rf3.A00 || !this.A02.equals(rf3.A02) || !this.A01.equals(rf3.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode() ^ ((((AbstractC25228BEl.A03(this.A00) ^ 1000003) * 1000003) ^ this.A02.hashCode()) * 1000003);
    }

    public RF3(AbstractC61581Rq5 abstractC61581Rq5, AbstractC61582Rq6 abstractC61582Rq6, long j) {
        this.A00 = j;
        if (abstractC61582Rq6 != null) {
            this.A02 = abstractC61582Rq6;
            this.A01 = abstractC61581Rq5;
            return;
        }
        throw AbstractC166987dD.A15("Null transportContext");
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("PersistedEvent{id=");
        A1C.append(this.A00);
        A1C.append(", transportContext=");
        A1C.append(this.A02);
        A1C.append(", event=");
        return JQ0.A0l(this.A01, A1C);
    }
}
