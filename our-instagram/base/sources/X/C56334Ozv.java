package X;

import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.Ozv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56334Ozv implements InterfaceC58146PqB {
    public final /* synthetic */ N4X A00;

    @Override // X.InterfaceC58146PqB
    public final void CyD(AudioOverlayTrack audioOverlayTrack) {
    }

    @Override // X.InterfaceC58146PqB
    public final void Dqe(JIN jin) {
    }

    public C56334Ozv(N4X n4x) {
        this.A00 = n4x;
    }

    @Override // X.InterfaceC58146PqB
    public final void CyE(AudioOverlayTrack audioOverlayTrack) {
        C50870Me1 c50870Me1 = (C50870Me1) this.A00.A06.getValue();
        C50870Me1.A04(c50870Me1);
        if (!c50870Me1.A0E.A08) {
            c50870Me1.A0K.add(AbstractC25226BEj.A1L(new C50533MSm((Object) audioOverlayTrack, (Object) c50870Me1, (InterfaceC23621Ds) null, 23, false), AbstractC141776au.A00(c50870Me1)));
        }
    }

    @Override // X.InterfaceC58146PqB
    public final void E2O() {
        ((C8BP) ((C56303OzO) this.A00.A04.getValue()).A01.getValue()).A0A(null, null, true, false);
    }
}
