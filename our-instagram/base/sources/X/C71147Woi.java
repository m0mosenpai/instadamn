package X;

/* renamed from: X.Woi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71147Woi implements XBT {
    public final X8Y A00;
    public final XBT A01;

    @Override // X.XBT
    public final long Bdx() {
        return this.A01.Bdx();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VideoSynchronizedQuestionEvent{mQuestionEvent=");
        return AbstractC58320PtC.A11(this.A00, sb);
    }

    public C71147Woi(XBT xbt, X8Y x8y) {
        this.A00 = x8y;
        this.A01 = xbt;
    }
}
