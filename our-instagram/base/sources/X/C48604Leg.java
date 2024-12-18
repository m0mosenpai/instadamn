package X;

/* renamed from: X.Leg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48604Leg implements MOU {
    public final /* synthetic */ C46050Ka5 A00;
    public final /* synthetic */ MRI A01;

    public C48604Leg(C46050Ka5 c46050Ka5, MRI mri) {
        this.A00 = c46050Ka5;
        this.A01 = mri;
    }

    @Override // X.MOU
    public final void DSp() {
        this.A00.setItems(this.A01.BST());
    }
}
