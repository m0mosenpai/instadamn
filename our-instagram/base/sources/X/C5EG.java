package X;

/* renamed from: X.5EG, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5EG implements C5EH {
    public static Boolean A00;
    public static final C5EG A01 = new Object();

    @Override // X.C5EH
    public final /* synthetic */ void ETr(InterfaceC16660sJ interfaceC16660sJ) {
    }

    @Override // X.C5EH
    public final /* synthetic */ void ETy(InterfaceC16660sJ interfaceC16660sJ) {
    }

    @Override // X.C5EH
    public final boolean AkR() {
        Boolean bool = A00;
        if (bool != null) {
            return bool.booleanValue();
        }
        AbstractC28290Cdc.A02("canFocus is read before it is written");
        throw C00O.createAndThrow();
    }

    @Override // X.C5EH
    public final void ER6(boolean z) {
        A00 = Boolean.valueOf(z);
    }
}
