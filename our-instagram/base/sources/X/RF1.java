package X;

import java.util.Map;

/* loaded from: classes10.dex */
public final class RF1 extends AbstractC61583Rq7 {
    public final InterfaceC65401TjY A00;
    public final Map A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof AbstractC61583Rq7)) {
                return false;
            }
            RF1 rf1 = (RF1) ((AbstractC61583Rq7) obj);
            if (!this.A00.equals(rf1.A00) || !this.A01.equals(rf1.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((this.A00.hashCode() ^ 1000003) * 1000003) ^ this.A01.hashCode();
    }

    public RF1(InterfaceC65401TjY interfaceC65401TjY, Map map) {
        this.A00 = interfaceC65401TjY;
        this.A01 = map;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SchedulerConfig{clock=");
        A1C.append(this.A00);
        A1C.append(", values=");
        return JQ0.A0l(this.A01, A1C);
    }
}
