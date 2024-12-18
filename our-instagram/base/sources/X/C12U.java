package X;

/* renamed from: X.12U, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C12U implements C12V {
    public final InterfaceC212412b key;

    public C12U(InterfaceC212412b interfaceC212412b) {
        C14360o3.A0B(interfaceC212412b, 1);
        this.key = interfaceC212412b;
    }

    @Override // X.C12W
    public Object fold(Object obj, InterfaceC16620sF interfaceC16620sF) {
        C14360o3.A0B(interfaceC16620sF, 2);
        return interfaceC16620sF.invoke(obj, this);
    }

    @Override // X.C12V
    public InterfaceC212412b getKey() {
        return this.key;
    }

    @Override // X.C12V, X.C12W
    public C12V get(InterfaceC212412b interfaceC212412b) {
        return AnonymousClass190.A00(this, interfaceC212412b);
    }

    @Override // X.C12W
    public C12W minusKey(InterfaceC212412b interfaceC212412b) {
        return AnonymousClass190.A01(this, interfaceC212412b);
    }

    @Override // X.C12W
    public C12W plus(C12W c12w) {
        return AnonymousClass190.A02(this, c12w);
    }
}
