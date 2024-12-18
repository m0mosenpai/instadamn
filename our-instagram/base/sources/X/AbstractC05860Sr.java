package X;

import java.lang.ref.PhantomReference;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0Sr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC05860Sr extends PhantomReference {
    public AbstractC05860Sr next;
    public AbstractC05860Sr previous;

    public abstract void destruct();

    public AbstractC05860Sr(Object obj) {
        super(obj, AbstractC05890Su.A02);
        AtomicReference atomicReference;
        AbstractC05860Sr abstractC05860Sr;
        C05880St c05880St = AbstractC05890Su.A01;
        do {
            atomicReference = c05880St.A00;
            abstractC05860Sr = (AbstractC05860Sr) atomicReference.get();
            this.next = abstractC05860Sr;
        } while (!C0DN.A00(abstractC05860Sr, this, atomicReference));
    }

    public AbstractC05860Sr() {
        super(null, AbstractC05890Su.A02);
    }
}
