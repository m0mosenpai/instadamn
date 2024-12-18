package X;

import com.meta.compose.material.bottomsheet.AnchoredDraggableState;

/* renamed from: X.CmI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28726CmI implements InterfaceC30902DiF {
    public final C28725CmH A00;
    public final /* synthetic */ AnchoredDraggableState A01;

    public C28726CmI(AnchoredDraggableState anchoredDraggableState) {
        this.A01 = anchoredDraggableState;
        this.A00 = new C28725CmH(anchoredDraggableState);
    }

    @Override // X.InterfaceC30902DiF
    public final Object AQL(EnumC27348C5d enumC27348C5d, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16620sF interfaceC16620sF) {
        Object A06 = this.A01.A06(enumC27348C5d, interfaceC23621Ds, new C50541MSu(this, (InterfaceC23621Ds) null, interfaceC16620sF));
        if (A06 != C1JX.A02) {
            return C0eB.A00;
        }
        return A06;
    }
}
