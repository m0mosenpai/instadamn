package X;

import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import java.util.List;

/* loaded from: classes9.dex */
public final class P03 implements InterfaceC58043PoT {
    public final List A00;
    public final InterfaceC58288Psg A01;
    public final FilterGroupModel A02;
    public final /* synthetic */ InterfaceC58110PpZ A03;
    public final /* synthetic */ OXA A04;
    public final /* synthetic */ InterfaceC16820sZ A05;
    public final /* synthetic */ InterfaceC16820sZ A06;

    public P03(InterfaceC58110PpZ interfaceC58110PpZ, InterfaceC58288Psg interfaceC58288Psg, OXA oxa, FilterGroupModel filterGroupModel, List list, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        this.A03 = interfaceC58110PpZ;
        this.A04 = oxa;
        this.A06 = interfaceC16820sZ;
        this.A05 = interfaceC16820sZ2;
        this.A00 = list;
        this.A01 = interfaceC58288Psg;
        this.A02 = filterGroupModel;
    }

    @Override // X.InterfaceC58043PoT
    public final void AJN() {
        OXA.A00(this.A04, this.A06);
    }

    @Override // X.InterfaceC58043PoT
    public final void cancel() {
        OXA.A00(this.A04, this.A05);
    }
}
