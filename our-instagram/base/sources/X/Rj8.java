package X;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class Rj8 implements Executor {
    public static final /* synthetic */ Rj8[] A00;
    public static final Rj8 A01;

    static {
        Rj8 rj8 = new Rj8();
        A01 = rj8;
        A00 = new Rj8[]{rj8};
    }

    public static Rj8[] values() {
        return (Rj8[]) A00.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        SXv.A00().A00.post(runnable);
    }
}
