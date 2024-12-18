package X;

/* renamed from: X.2Jm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48232Jm implements InterfaceC48192Ji {
    public final /* synthetic */ InterfaceC48192Ji A00;

    @Override // X.InterfaceC48192Ji
    public final void invoke(AnonymousClass436 anonymousClass436) {
        C14360o3.A0B(anonymousClass436, 0);
        if (anonymousClass436 instanceof C4OZ) {
            C4OZ c4oz = (C4OZ) anonymousClass436;
            this.A00.invoke(new AnonymousClass435(c4oz.A00, c4oz.A01));
            return;
        }
        if (anonymousClass436 instanceof AnonymousClass435) {
            this.A00.invoke(anonymousClass436);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected result type: ");
        sb.append(anonymousClass436);
        throw new IllegalStateException(sb.toString());
    }

    public C48232Jm(InterfaceC48192Ji interfaceC48192Ji) {
        this.A00 = interfaceC48192Ji;
    }
}
