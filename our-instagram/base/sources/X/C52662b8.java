package X;

/* renamed from: X.2b8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52662b8 implements InterfaceC52252aQ {
    public static final C52662b8 A00;
    public static final InterfaceC16130rD A01;
    public static final InterfaceC16130rD A02;
    public static final /* synthetic */ C0YR[] A03;

    /* JADX WARN: Type inference failed for: r1v2, types: [X.2aQ, java.lang.Object, X.2b8] */
    static {
        C0YR[] c0yrArr = {new AnonymousClass019(C52662b8.class, "isEnabled", "isEnabled()Lcom/instagram/experiments/LandingExperimentParameter;", 0), new AnonymousClass019(C52662b8.class, "timeoutInMs", "getTimeoutInMs()Lcom/instagram/experiments/LandingExperimentParameter;", 0)};
        A03 = c0yrArr;
        ?? obj = new Object();
        A00 = obj;
        A01 = AbstractC52262aR.A00(obj, c0yrArr[0]);
        A02 = AbstractC52262aR.A00(obj, c0yrArr[1]);
    }

    public final C52342aZ A00() {
        return (C52342aZ) A02.CES(this, A03[1]);
    }

    public final C52342aZ A01() {
        return (C52342aZ) A01.CES(this, A03[0]);
    }
}
