package X;

/* renamed from: X.6Kh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC137366Kh {
    public static final int A00 = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    public abstract void A01(InterfaceC73610YPe interfaceC73610YPe);

    public final void A00(YRQ yrq) {
        AbstractC42141x4.A01(yrq, "s is null");
        try {
            AbstractC42141x4.A01(yrq, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            A01(yrq);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            AbstractC62281S5a.A00(th);
            AbstractC142886co.A02(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
