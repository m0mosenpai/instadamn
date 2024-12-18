package X;

/* renamed from: X.125, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass125 extends AbstractC211911v {
    @Override // X.AbstractC211911v
    public final String A06() {
        return "LiteProviderInitializer";
    }

    @Override // X.AbstractC211911v
    public final void A07() {
        C18Y c18y = C18Y.A01;
        synchronized (c18y) {
            c18y.A00 = true;
            c18y.notifyAll();
        }
    }
}
