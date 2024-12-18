package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes7.dex */
public abstract class J69 implements Iterator {
    public AbstractC127945qN A00;
    public Iterator A01;
    public final C155376yQ A02;

    public AbstractC127945qN A00() {
        AbstractC127945qN abstractC127945qN;
        if (this.A01 != null) {
            while (this.A01.hasNext()) {
                try {
                    abstractC127945qN = (AbstractC127945qN) this.A01.next();
                } catch (C09590eA | NoSuchElementException unused) {
                    abstractC127945qN = null;
                }
                if ((abstractC127945qN instanceof InterfaceC127975qQ) && this.A02.EjD(((InterfaceC127975qQ) abstractC127945qN).BQN())) {
                    return abstractC127945qN;
                }
            }
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return AbstractC167007dF.A1W(this.A00);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.A01 != null) {
            AbstractC127945qN abstractC127945qN = this.A00;
            if (abstractC127945qN != null) {
                this.A00 = A00();
                return abstractC127945qN;
            }
            throw new NoSuchElementException();
        }
        throw new RuntimeException("Iterator should not be null when calling next()");
    }

    public J69(C155376yQ c155376yQ) {
        this.A02 = c155376yQ;
    }
}
