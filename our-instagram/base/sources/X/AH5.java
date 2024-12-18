package X;

import com.facebook.odin.prediction.litennmodelparams.DynamicNNModelParams;
import java.io.File;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes4.dex */
public final class AH5 {
    public DynamicNNModelParams A00;
    public final C3RU A01;
    public final ReentrantLock A02;
    public final C53717Np6 A03;

    public AH5(C3RU c3ru, C53717Np6 c53717Np6) {
        C14360o3.A0B(c3ru, 1);
        this.A01 = c3ru;
        this.A03 = c53717Np6;
        this.A02 = new ReentrantLock();
    }

    public final void A02(DynamicNNModelParams dynamicNNModelParams) {
        C14360o3.A0B(dynamicNNModelParams, 0);
        ReentrantLock reentrantLock = this.A02;
        reentrantLock.lock();
        try {
            File A00 = A00(this);
            C73773Sh c73773Sh = AbstractC73763Sg.A03;
            C3R9[] c3r9Arr = DynamicNNModelParams.A08;
            AbstractC57194Pae.A07(A00, c73773Sh.A02(dynamicNNModelParams, X0Y.A00), C15W.A05);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final C3SN A01() {
        C3SN c3sn;
        ReentrantLock reentrantLock = this.A02;
        reentrantLock.lock();
        try {
            DynamicNNModelParams dynamicNNModelParams = this.A00;
            if (dynamicNNModelParams != null) {
                c3sn = new C3SN(dynamicNNModelParams, null, true);
            } else {
                File A00 = A00(this);
                if (A00.exists() && A00.canRead()) {
                    String A06 = AbstractC57194Pae.A06(A00, C15W.A05);
                    C73773Sh c73773Sh = AbstractC73763Sg.A03;
                    C3R9[] c3r9Arr = DynamicNNModelParams.A08;
                    DynamicNNModelParams dynamicNNModelParams2 = (DynamicNNModelParams) c73773Sh.A00(A06, AbstractC192698gB.A00(X0Y.A00));
                    this.A00 = dynamicNNModelParams2;
                    c3sn = new C3SN(dynamicNNModelParams2, null, true);
                } else {
                    c3sn = new C3SN(null, null, false);
                }
            }
            return c3sn;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final File A00(AH5 ah5) {
        return new File(AbstractC23881Ey.A00().AXd(null, 341716450), AnonymousClass001.A0R(ah5.A01.CDW(), "_weights.json"));
    }
}
