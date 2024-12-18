package X;

import com.meta.compose.material.bottomsheet.AnchoredDraggableState;

/* renamed from: X.CmH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28725CmH implements InterfaceC30901DiE {
    public final /* synthetic */ AnchoredDraggableState A00;

    public C28725CmH(AnchoredDraggableState anchoredDraggableState) {
        this.A00 = anchoredDraggableState;
    }

    @Override // X.InterfaceC30901DiE
    public final void AQM(float f) {
        AnchoredDraggableState anchoredDraggableState = this.A00;
        CPS cps = anchoredDraggableState.A09;
        float A04 = anchoredDraggableState.A04(f);
        AnchoredDraggableState anchoredDraggableState2 = cps.A00;
        anchoredDraggableState2.A03.EUc(A04);
        anchoredDraggableState2.A02.EUc(0.0f);
    }
}
