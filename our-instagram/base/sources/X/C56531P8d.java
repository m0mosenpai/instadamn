package X;

import com.instagram.model.reels.Reel;

/* renamed from: X.P8d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56531P8d implements InterfaceC63982vJ {
    public final int A00;
    public final Object A01;

    public C56531P8d(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC63982vJ
    public final void DHC(Reel reel, C6X4 c6x4) {
        InterfaceC09390do interfaceC09390do;
        switch (this.A00) {
            case 0:
                interfaceC09390do = ((N7E) this.A01).A02;
                break;
            case 1:
            case 2:
            default:
                AbstractC166987dD.A1Y(this.A01);
                return;
            case 3:
                interfaceC09390do = ((N7L) this.A01).A0A;
                break;
            case 4:
                interfaceC09390do = ((N7M) this.A01).A07;
                break;
        }
        ((C2UU) interfaceC09390do.getValue()).notifyDataSetChanged();
    }

    @Override // X.InterfaceC63982vJ
    public final /* synthetic */ void Ddi(Reel reel) {
    }

    @Override // X.InterfaceC63982vJ
    public final /* synthetic */ void DeI(Reel reel) {
    }
}
