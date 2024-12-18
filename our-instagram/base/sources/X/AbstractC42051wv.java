package X;

/* renamed from: X.1wv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC42051wv implements InterfaceC42061ww {
    public abstract void A02(InterfaceC42071wx interfaceC42071wx);

    public static AbstractC42051wv A00(C6D4 c6d4, InterfaceC42061ww[] interfaceC42061wwArr, int i) {
        AbstractC42141x4.A01(c6d4, "combiner is null");
        AbstractC42141x4.A00(i, "bufferSize");
        return new C72090XNk(c6d4, null, interfaceC42061wwArr, i << 1);
    }

    public final AbstractC42051wv A01(final AbstractC150996r0 abstractC150996r0) {
        final int i = AbstractC137366Kh.A00;
        AbstractC42141x4.A01(abstractC150996r0, "scheduler is null");
        AbstractC42141x4.A00(i, "bufferSize");
        return new C6D6(this, abstractC150996r0, i) { // from class: X.6Ki
            public final int A00;
            public final AbstractC150996r0 A01;

            @Override // X.AbstractC42051wv
            public final void A02(InterfaceC42071wx interfaceC42071wx) {
                AbstractC150996r0 abstractC150996r02 = this.A01;
                if (abstractC150996r02 instanceof C143046d4) {
                    super.A00.EpF(interfaceC42071wx);
                } else {
                    super.A00.EpF(new RunnableC137396Kk(interfaceC42071wx, abstractC150996r02.A00(), this.A00));
                }
            }

            {
                this.A01 = abstractC150996r0;
                this.A00 = i;
            }
        };
    }

    @Override // X.InterfaceC42061ww
    public final void EpF(InterfaceC42071wx interfaceC42071wx) {
        AbstractC42141x4.A01(interfaceC42071wx, "observer is null");
        try {
            AbstractC42141x4.A01(interfaceC42071wx, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            A02(interfaceC42071wx);
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
