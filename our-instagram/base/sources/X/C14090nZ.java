package X;

/* renamed from: X.0nZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14090nZ implements C12W {
    public final /* synthetic */ C12W A00;

    @Override // X.C12W
    public final Object fold(Object obj, InterfaceC16620sF interfaceC16620sF) {
        C14360o3.A0B(interfaceC16620sF, 1);
        return this.A00.fold(obj, interfaceC16620sF);
    }

    @Override // X.C12W
    public final C12V get(InterfaceC212412b interfaceC212412b) {
        C14360o3.A0B(interfaceC212412b, 0);
        return this.A00.get(interfaceC212412b);
    }

    @Override // X.C12W
    public final C12W minusKey(InterfaceC212412b interfaceC212412b) {
        C14360o3.A0B(interfaceC212412b, 0);
        return this.A00.minusKey(interfaceC212412b);
    }

    @Override // X.C12W
    public final C12W plus(C12W c12w) {
        C14360o3.A0B(c12w, 0);
        return this.A00.plus(c12w);
    }

    public final C14090nZ A00(int i) {
        C12V c12v = get(C12X.A00);
        C14360o3.A0C(c12v, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return new C14090nZ(plus(((C12T) c12v).A03(i)));
    }

    public C14090nZ(C12W c12w) {
        this.A00 = c12w;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14090nZ(C12T c12t, int i, int i2) {
        this(AnonymousClass190.A02(c12t, new C13990nP(i)).plus(new C14010nR(i2)));
        C14360o3.A0B(c12t, 1);
    }
}
