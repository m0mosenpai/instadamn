package X;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* renamed from: X.50n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1114950n implements InterfaceC1115050o {
    public final C2MZ A00;
    public final C2M2 A01;
    public final C2LC A02;

    static {
        C48442Kl.A01("WMFgUpdater");
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, X.2Nr] */
    @Override // X.InterfaceC1115050o
    public final C49182Nr EUm(final Context context, final Q0Z id, final UUID foregroundInfo) {
        ?? obj = new Object();
        this.A02.ATa(new RunnableC58688Q0b(context, id, this, obj, foregroundInfo));
        return obj;
    }

    public C1114950n(WorkDatabase workDatabase, C2MZ foregroundProcessor, C2LC taskExecutor) {
        this.A00 = foregroundProcessor;
        this.A02 = taskExecutor;
        this.A01 = workDatabase.A05();
    }
}
