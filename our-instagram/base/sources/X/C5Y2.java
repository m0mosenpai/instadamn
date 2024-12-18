package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* renamed from: X.5Y2, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5Y2 implements InterfaceC74963Ym {
    public long A00;
    public long A01;
    public AbstractC118405Xc A02;
    public boolean A03;
    public final InterfaceC118485Xk A04;
    public final InterfaceC74953Yl A05;

    public final Object A00() {
        return ((C118475Xj) this.A04).A00.invoke(this.A02);
    }

    @Override // X.InterfaceC74963Ym
    public final Object getValue() {
        return this.A05.getValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AnimationState(value=");
        sb.append(this.A05.getValue());
        sb.append(", velocity=");
        sb.append(A00());
        sb.append(", isRunning=");
        sb.append(this.A03);
        sb.append(", lastFrameTimeNanos=");
        sb.append(this.A01);
        sb.append(", finishedTimeNanos=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C5Y2(AbstractC118405Xc abstractC118405Xc, InterfaceC118485Xk interfaceC118485Xk, Object obj, long j, long j2, boolean z) {
        AbstractC118405Xc abstractC118405Xc2;
        this.A04 = interfaceC118485Xk;
        C74883Yd A00 = AbstractC74873Yc.A00();
        InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
        this.A05 = new ParcelableSnapshotMutableState(A00, obj);
        if (abstractC118405Xc != null) {
            abstractC118405Xc2 = AbstractC137336Kc.A00(abstractC118405Xc);
        } else {
            abstractC118405Xc2 = (AbstractC118405Xc) ((C118475Xj) interfaceC118485Xk).A01.invoke(obj);
            abstractC118405Xc2.A02();
        }
        this.A02 = abstractC118405Xc2;
        this.A01 = j;
        this.A00 = j2;
        this.A03 = z;
    }
}
