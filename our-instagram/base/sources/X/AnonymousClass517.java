package X;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.517, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass517 implements Executor {
    public static final /* synthetic */ AnonymousClass517[] A00;
    public static final AnonymousClass517 A01;

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }

    static {
        AnonymousClass517 anonymousClass517 = new AnonymousClass517();
        A01 = anonymousClass517;
        A00 = new AnonymousClass517[]{anonymousClass517};
    }

    public static AnonymousClass517 valueOf(String name) {
        return (AnonymousClass517) Enum.valueOf(AnonymousClass517.class, name);
    }

    public static AnonymousClass517[] values() {
        return (AnonymousClass517[]) A00.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        command.run();
    }
}
