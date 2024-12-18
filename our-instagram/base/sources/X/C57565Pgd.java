package X;

import android.view.MotionEvent;

/* renamed from: X.Pgd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57565Pgd extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ MotionEvent A02;
    public final /* synthetic */ MotionEvent A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57565Pgd(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        super(1);
        this.A03 = motionEvent;
        this.A02 = motionEvent2;
        this.A00 = f;
        this.A01 = f2;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        InterfaceC144626fi interfaceC144626fi = (InterfaceC144626fi) obj;
        C14360o3.A0B(interfaceC144626fi, 0);
        return Boolean.valueOf(interfaceC144626fi.Drb(this.A03, this.A02, this.A00, this.A01));
    }
}
