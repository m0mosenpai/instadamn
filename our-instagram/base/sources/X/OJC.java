package X;

import android.content.Context;
import android.os.Looper;
import com.facebook.papaya.client.ICallback;
import com.facebook.papaya.client.PapayaJNI;
import com.facebook.papaya.client.engine.IEngineFactory;
import com.facebook.papaya.log.LogSink;
import java.util.Map;

/* loaded from: classes9.dex */
public final class OJC {
    public boolean A00 = false;
    public final Context A01;
    public final ICallback A02;
    public final OED A03;
    public final LogSink A04;

    public final synchronized void A00() {
        C18C.A0F(AbstractC25229BEm.A1a(Looper.myLooper(), Looper.getMainLooper()));
        if (!this.A00) {
            OED oed = this.A03;
            PapayaJNI.initialize("ig4a", oed.A04, this.A01, oed.A00, oed.A05, oed.A06, oed.A01.A00());
            C1LC it = oed.A03.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(it);
                PapayaJNI.registerEngine(AbstractC31172DnG.A17(A1K), (IEngineFactory) A1K.getValue());
            }
            PapayaJNI.addLogSink("global_log_sink", oed.A02, this.A04);
            PapayaJNI.setCallback(this.A02);
            this.A00 = true;
        }
    }

    public OJC(Context context, ICallback iCallback, OED oed, LogSink logSink) {
        this.A01 = context;
        this.A03 = oed;
        this.A04 = logSink;
        this.A02 = iCallback;
    }
}
