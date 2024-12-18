package X;

import android.content.Context;
import com.facebook.proxygen.LigerSamplePolicy;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.WYq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70485WYq implements XEI {
    public int A00;
    public long A01;
    public C70494WZb A02;
    public int A03;

    @Override // X.XEI
    public final YCL BmY() {
        AbstractC1126356r.A07(false, "Not applicable for this consumer");
        throw C00O.createAndThrow();
    }

    @Override // X.XEI
    public final void release() {
    }

    @Override // X.XEI
    public final void E6B(ByteBuffer byteBuffer) {
        C70494WZb c70494WZb = this.A02;
        C66029TyR A00 = c70494WZb.A0B.A00.A00(LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
        if (A00 != null) {
            A00.AjR().put(byteBuffer);
            A00.EQc(0, byteBuffer.position(), TimeUnit.NANOSECONDS.toMicros((this.A01 * TimeUnit.SECONDS.toNanos(1L)) / this.A00), 1);
            c70494WZb.A0B.A00.A03(A00);
            this.A01 += byteBuffer.position() / this.A03;
        }
    }

    @Override // X.XEI
    public final boolean Em1() {
        return this.A02.Em0();
    }

    @Override // X.XEI
    public final void FDt() {
        this.A02.FDt();
    }

    @Override // X.XEI
    public final void flush() {
        this.A02.flush();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Vqk, java.lang.Object] */
    public C70485WYq(Context context, W25 w25, InterfaceC58019Po5 interfaceC58019Po5, C70129W5q c70129W5q, AbstractC66037TyZ abstractC66037TyZ, InterfaceC71972XDf interfaceC71972XDf, C69199VjS c69199VjS, C69489VoC c69489VoC, String str, ExecutorService executorService) {
        String str2;
        C69520Vqj c69520Vqj;
        int i;
        C70494WZb c70494WZb = new C70494WZb(context, interfaceC58019Po5, c70129W5q, interfaceC71972XDf, c69199VjS, c69489VoC, str, executorService);
        this.A02 = c70494WZb;
        c70494WZb.A0B = new Object();
        C70087W2j c70087W2j = c70494WZb.A05.A0C;
        if (c70087W2j.A02 == null) {
            Integer[] A00 = C05F.A00(4);
            int length = A00.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                Integer num = A00[i2];
                if (num == C05F.A00 && !c70087W2j.A03) {
                    i2++;
                } else {
                    switch (num.intValue()) {
                        case 1:
                            str2 = "LC";
                            break;
                        case 2:
                            str2 = "Main";
                            break;
                        case 3:
                            str2 = "SSR";
                            break;
                        default:
                            str2 = "HE";
                            break;
                    }
                    if ("lc".equalsIgnoreCase(str2)) {
                        i = 2;
                    } else if ("main".equalsIgnoreCase(str2)) {
                        i = 1;
                    } else if ("ssr".equalsIgnoreCase(str2)) {
                        i = 3;
                    } else if ("he".equalsIgnoreCase(str2)) {
                        i = 5;
                    } else {
                        c69520Vqj = null;
                        c70087W2j.A02 = c69520Vqj;
                        c70494WZb.A0B.A00(c70087W2j);
                    }
                    c69520Vqj = new C69520Vqj(i);
                    c70087W2j.A02 = c69520Vqj;
                    c70494WZb.A0B.A00(c70087W2j);
                }
            }
        } else {
            c70494WZb.A0B.A00(c70087W2j);
        }
        C70129W5q c70129W5q2 = c70494WZb.A03;
        String str3 = null;
        try {
            str3 = c70494WZb.A0B.A00.A05.getName();
        } catch (IllegalStateException unused) {
        }
        c70129W5q2.A0I = str3;
        this.A02.Emv(abstractC66037TyZ, 5);
        this.A03 = w25.A00 * 2;
        this.A00 = w25.A01;
        this.A01 = 0L;
    }
}
