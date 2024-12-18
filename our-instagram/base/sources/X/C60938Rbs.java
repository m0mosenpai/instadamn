package X;

import android.content.Context;
import android.util.Pair;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.common.io.Closeables;
import com.instagram.common.api.base.CacheBehaviorLogger;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.Rbs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60938Rbs extends C2AG {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C02950Bt A01;
    public final /* synthetic */ C41341vj A02;

    @Override // X.C11R
    public final int getRunnableId() {
        return 502;
    }

    public C60938Rbs(Context context, C02950Bt c02950Bt, C41341vj c41341vj) {
        this.A00 = context;
        this.A01 = c02950Bt;
        this.A02 = c41341vj;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        Pair pair;
        String str;
        InputStream inputStream;
        C0RQ c0rq;
        SHs sHs = new SHs(this.A01);
        C41341vj c41341vj = this.A02;
        c41341vj.A00 = sHs;
        synchronized (sHs) {
            C24261Gv c24261Gv = sHs.A02;
            C59732oG AXI = c24261Gv.AXI("previous_session");
            if (AXI.A00 != null) {
                DataInputStream dataInputStream = new DataInputStream((InputStream) AXI.A00());
                C0XO A03 = ((C0XI) sHs.A00.A03).A03();
                try {
                    try {
                        c0rq = sHs.A01;
                    } catch (IOException e) {
                        C0w9.A07("BatteryMetricsPersistentCache", e);
                        Closeables.A01(dataInputStream);
                        inputStream = (InputStream) AXI.A00();
                    }
                    if (dataInputStream.readShort() == 251 && dataInputStream.readShort() == 2 && dataInputStream.readLong() == c0rq.A00() && c0rq.A02(A03, dataInputStream)) {
                        pair = new Pair(Boolean.valueOf(dataInputStream.readBoolean()), A03);
                        Closeables.A01(dataInputStream);
                        Closeables.A01((InputStream) AXI.A00());
                    } else {
                        Closeables.A01(dataInputStream);
                        inputStream = (InputStream) AXI.A00();
                        Closeables.A01(inputStream);
                    }
                } catch (Throwable th) {
                    Closeables.A01(dataInputStream);
                    Closeables.A01((InputStream) AXI.A00());
                    throw th;
                }
            }
            if (c24261Gv.CKd("previous_session")) {
                c24261Gv.EEk("previous_session");
            }
            pair = null;
        }
        if (pair != null) {
            if (AbstractC166987dD.A1a(pair.first)) {
                str = AppStateModule.APP_STATE_BACKGROUND;
            } else {
                str = "foreground";
            }
            C0CC A00 = c41341vj.A02.A00((AbstractC02960Bu) pair.second, str);
            if (A00 != null) {
                A00.A7n(CacheBehaviorLogger.SOURCE, "disk");
                A00.CiO();
            }
        }
        C1GJ.A05(sHs.A03, 501, 4, 600000, false, true);
        return null;
    }
}
