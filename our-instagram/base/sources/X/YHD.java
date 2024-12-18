package X;

import android.os.Handler;
import android.view.Surface;
import com.facebook.proxygen.TraceFieldType;

/* loaded from: classes12.dex */
public final class YHD implements Runnable {
    public final /* synthetic */ C73396YBi A00;
    public final /* synthetic */ C73397YBj A01;

    public YHD(C73396YBi c73396YBi, C73397YBj c73397YBj) {
        this.A01 = c73397YBj;
        this.A00 = c73396YBi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C73397YBj c73397YBj = this.A01;
        C73396YBi c73396YBi = this.A00;
        Handler A00 = c73396YBi.A00();
        StringBuilder sb = c73397YBj.A06;
        sb.append("asyncStop, ");
        try {
            if (c73397YBj.A00 != null) {
                if (c73397YBj.A0C) {
                    c73397YBj.A00.signalEndOfInputStream();
                    C73397YBj.A03(c73397YBj, true);
                } else {
                    c73397YBj.A03 = true;
                }
            }
            Surface surface = c73397YBj.A02;
            if (surface != null) {
                surface.release();
            }
            if (c73397YBj.A00 != null) {
                if (c73397YBj.A0C) {
                    C0fT.A06(c73397YBj.A00, -1400516943);
                }
                C0fT.A03(c73397YBj.A00, 358803077);
            }
            c73397YBj.A0B = C05F.A0N;
            c73397YBj.A00 = null;
            c73397YBj.A02 = null;
            c73397YBj.A01 = null;
            sb.append("asyncStop end, ");
            if (c73397YBj.A03) {
                AD8.A01(c73396YBi, A00);
                return;
            }
            AbstractC223559ty abstractC223559ty = new AbstractC223559ty(23001, "Codec not in End-Of-Stream stage when stopping");
            abstractC223559ty.A00(TraceFieldType.CurrentState, XgU.A00(c73397YBj.A0B));
            abstractC223559ty.A00("method_invocation", sb.toString());
            AD8.A00(A00, abstractC223559ty, c73396YBi);
        } catch (Exception e) {
            AbstractC223559ty abstractC223559ty2 = new AbstractC223559ty(23001, e);
            C73397YBj.A02(abstractC223559ty2, c73397YBj, e);
            c73397YBj.A0B = C05F.A0N;
            c73397YBj.A00 = null;
            c73397YBj.A02 = null;
            c73397YBj.A01 = null;
            AD8.A00(A00, abstractC223559ty2, c73396YBi);
        }
    }
}
