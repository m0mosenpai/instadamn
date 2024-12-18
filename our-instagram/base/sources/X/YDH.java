package X;

/* loaded from: classes12.dex */
public final class YDH implements InterfaceC73608YNy {
    public final /* synthetic */ XXm A00;
    public final /* synthetic */ XXq A01;
    public final /* synthetic */ Class A02;

    public YDH(XXm xXm, XXq xXq, Class cls) {
        this.A00 = xXm;
        this.A02 = cls;
        this.A01 = xXq;
    }

    @Override // X.InterfaceC73608YNy
    public final /* bridge */ /* synthetic */ boolean CWt(Object obj) {
        AbstractC72503XfI abstractC72503XfI = (AbstractC72503XfI) obj;
        if (this.A02.isAssignableFrom(abstractC72503XfI.getClass()) && ((AbstractC72210XYe) abstractC72503XfI).A00 == this.A01) {
            return true;
        }
        return false;
    }
}
