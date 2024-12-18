package X;

/* renamed from: X.1xB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC42211xB extends C42221xC implements InterfaceC42241xE {
    public final AbstractC42041wu A00;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.KJt, X.1xB] */
    public final C45682KJt A0V() {
        AbstractC42041wu abstractC42041wu = this.A00;
        if (!(abstractC42041wu instanceof XMY)) {
            abstractC42041wu = new XMY(abstractC42041wu);
        }
        return new AbstractC42211xB(abstractC42041wu);
    }

    @Override // X.InterfaceC42241xE
    public final void accept(Object obj) {
        this.A00.DVo(obj);
    }

    public AbstractC42211xB(AbstractC42041wu abstractC42041wu) {
        super(abstractC42041wu);
        this.A00 = abstractC42041wu;
    }
}
