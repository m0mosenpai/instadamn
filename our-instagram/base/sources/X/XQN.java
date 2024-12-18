package X;

import android.media.MediaCodec;
import java.nio.ByteOrder;
import java.util.ArrayDeque;

/* loaded from: classes12.dex */
public abstract class XQN extends AbstractC73334Y8p {
    public float A00;
    public float A01;
    public C72819Xnl A02;
    public C73298Xzo A03;
    public final float A04;
    public final MediaCodec.BufferInfo A05;
    public final C66397UFi A06;
    public final C66397UFi A07;
    public final C73289XzZ A08;
    public final XQG A09;
    public final YMM A0A;
    public final YQC A0B;
    public final ArrayDeque A0C;
    public final C66397UFi A0D;

    @Override // X.AbstractC73334Y8p
    public void A01() {
        this.A09.A00();
        this.A07.A00();
        this.A08.A00 = YQP.A00;
        A02();
        this.A00 = -1.0f;
    }

    public void A02() {
        this.A06.A01 = null;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, X.Xnl] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.XQG, X.UFi] */
    public XQN(YMM ymm, YQC yqc, float f, int i) {
        super(i);
        this.A0A = ymm;
        yqc.getClass();
        this.A0B = yqc;
        this.A04 = f;
        this.A0D = new C66397UFi(0);
        this.A06 = new C66397UFi(0);
        this.A07 = new C66397UFi(2);
        ?? c66397UFi = new C66397UFi(2);
        this.A09 = c66397UFi;
        this.A05 = new MediaCodec.BufferInfo();
        this.A01 = 1.0f;
        this.A0C = new ArrayDeque();
        this.A03 = C73298Xzo.A02;
        c66397UFi.A01(0);
        c66397UFi.A01.order(ByteOrder.nativeOrder());
        this.A08 = new C73289XzZ();
        this.A00 = -1.0f;
        this.A02 = new Object();
    }
}
