package X;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.JiH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC44324JiH implements Executor {
    public static final /* synthetic */ EnumC44324JiH[] A00;
    public static final EnumC44324JiH A01;

    public static EnumC44324JiH valueOf(String str) {
        return (EnumC44324JiH) Enum.valueOf(EnumC44324JiH.class, str);
    }

    public static EnumC44324JiH[] values() {
        return (EnumC44324JiH[]) A00.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        C14360o3.A0B(runnable, 0);
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return AbstractC111324zv.A00(3563);
    }

    static {
        EnumC44324JiH enumC44324JiH = new EnumC44324JiH();
        A01 = enumC44324JiH;
        A00 = new EnumC44324JiH[]{enumC44324JiH};
    }
}
