package X;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* renamed from: X.PpL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC58096PpL {
    boolean isAvailableOnDevice();

    void onCreateCredential(Context context, SH5 sh5, CancellationSignal cancellationSignal, Executor executor, InterfaceC65463Tkf interfaceC65463Tkf);

    void onGetCredential(Context context, C62471SCy c62471SCy, CancellationSignal cancellationSignal, Executor executor, InterfaceC65463Tkf interfaceC65463Tkf);
}
