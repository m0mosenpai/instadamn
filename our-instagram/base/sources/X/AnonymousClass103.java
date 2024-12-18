package X;

/* renamed from: X.103, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass103 implements C12W {
    public final Throwable A00;
    public final /* synthetic */ C12W A01;

    @Override // X.C12W
    public final Object fold(Object obj, InterfaceC16620sF interfaceC16620sF) {
        return this.A01.fold(obj, interfaceC16620sF);
    }

    @Override // X.C12W
    public final C12V get(InterfaceC212412b interfaceC212412b) {
        return this.A01.get(interfaceC212412b);
    }

    @Override // X.C12W
    public final C12W minusKey(InterfaceC212412b interfaceC212412b) {
        return this.A01.minusKey(interfaceC212412b);
    }

    @Override // X.C12W
    public final C12W plus(C12W c12w) {
        return this.A01.plus(c12w);
    }

    public AnonymousClass103(C12W c12w, Throwable th) {
        this.A00 = th;
        this.A01 = c12w;
    }
}
