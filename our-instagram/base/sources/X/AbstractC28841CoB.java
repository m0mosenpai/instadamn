package X;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.ui.Modifier;

/* renamed from: X.CoB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28841CoB implements InterfaceC118895a6, InterfaceC118885a5 {
    public final InterfaceC74953Yl A00 = AbstractC25230BEn.A0U(new Object());

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ boolean ABA(InterfaceC16660sJ interfaceC16660sJ) {
        return C5X5.A00(this, interfaceC16660sJ);
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier Eq3(Modifier modifier) {
        return C58m.A00(this, modifier);
    }

    @Override // X.InterfaceC118885a5
    public final void DTl(InterfaceC1129258b interfaceC1129258b) {
        this.A00.Egh(new C28744Cmc(((BZY) this).A00, (WindowInsets) interfaceC1129258b.Au8(CZO.A00)));
    }

    @Override // X.InterfaceC118895a6
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00.getValue();
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Object AWJ(Object obj, InterfaceC16620sF interfaceC16620sF) {
        return interfaceC16620sF.invoke(obj, this);
    }

    @Override // X.InterfaceC118895a6
    public final C114175De BKT() {
        return CZO.A00;
    }
}
