package X;

/* loaded from: classes12.dex */
public final class YDG implements InterfaceC73608YNy {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public YDG(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.InterfaceC73608YNy
    public final boolean CWt(Object obj) {
        if (this.A00 != 0) {
            AbstractC72503XfI abstractC72503XfI = (AbstractC72503XfI) obj;
            if (((Class) this.A02).isAssignableFrom(abstractC72503XfI.getClass()) && ((AbstractC72210XYe) abstractC72503XfI).A00 == ((YD7) this.A01).A01) {
                return true;
            }
            return false;
        }
        return ((Class) this.A02).isAssignableFrom(obj.getClass());
    }
}
