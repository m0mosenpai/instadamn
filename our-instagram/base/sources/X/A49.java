package X;

import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executors;

/* loaded from: classes4.dex */
public abstract class A49 {
    public static final InterfaceExecutorServiceC73393Qq A00;
    public static final AKC A02 = new Object();
    public static final C41761wQ A01 = C41761wQ.A00();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.AKC] */
    static {
        InterfaceExecutorServiceC73393Qq listeningDecorator = MoreExecutors.listeningDecorator(Executors.newSingleThreadExecutor());
        C14360o3.A07(listeningDecorator);
        A00 = listeningDecorator;
    }
}
