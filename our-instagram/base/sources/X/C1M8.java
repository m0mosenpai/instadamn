package X;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.1M8, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1M8 implements Executor {
    public static final /* synthetic */ C1M8[] A00;
    public static final C1M8 A01;

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }

    static {
        C1M8 c1m8 = new C1M8();
        A01 = c1m8;
        A00 = new C1M8[]{c1m8};
    }

    public static C1M8 valueOf(String name) {
        return (C1M8) Enum.valueOf(C1M8.class, name);
    }

    public static C1M8[] values() {
        return (C1M8[]) A00.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        command.run();
    }
}
