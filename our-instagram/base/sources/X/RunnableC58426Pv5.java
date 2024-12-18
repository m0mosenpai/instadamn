package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Pv5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC58426Pv5 implements Runnable {
    public final /* synthetic */ C2MP A00;

    public RunnableC58426Pv5(C2MP c2mp) {
        this.A00 = c2mp;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2MP c2mp = this.A00;
        synchronized (c2mp) {
            C2MP.A02(c2mp);
            C2MP.A01(c2mp);
            try {
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(C2MP.A00(c2mp), false));
                try {
                    C2MP.A00(c2mp).getPath();
                    Iterator A15 = AbstractC166997dE.A15(c2mp.A02);
                    while (A15.hasNext()) {
                        Map.Entry entry = (Map.Entry) A15.next();
                        entry.getKey();
                        outputStreamWriter.write((String) entry.getKey());
                        for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                            entry2.getKey();
                            entry2.getValue();
                            outputStreamWriter.write(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                            outputStreamWriter.write((String) entry2.getKey());
                            outputStreamWriter.write(":");
                            outputStreamWriter.write((String) entry2.getValue());
                        }
                        outputStreamWriter.write("\n");
                    }
                    outputStreamWriter.close();
                } catch (Throwable th) {
                    try {
                        outputStreamWriter.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                C0K8.A0G("LoggingMetadataStore", "Unable to write usage log", e);
            }
        }
    }
}
