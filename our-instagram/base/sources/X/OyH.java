package X;

import android.view.TextureView;
import com.instagram.creation.base.CropInfo;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* loaded from: classes9.dex */
public final class OyH implements InterfaceC58288Psg {
    public final TextureView A00;
    public final InterfaceC197218ns A01;

    @Override // X.InterfaceC58288Psg
    public final /* synthetic */ void ESU(CropInfo cropInfo) {
    }

    @Override // X.InterfaceC58288Psg
    public final /* synthetic */ void Ee2() {
    }

    @Override // X.InterfaceC58288Psg
    public final /* synthetic */ void Efd(FilterGroupModel filterGroupModel) {
    }

    @Override // X.InterfaceC58288Psg
    public final void AP4() {
        this.A01.AP4();
    }

    @Override // X.InterfaceC58288Psg
    public final void AQ8(FilterGroupModel filterGroupModel) {
        this.A01.AQ8(filterGroupModel);
    }

    @Override // X.InterfaceC58288Psg
    public final void CO0(int i, int i2) {
        this.A01.CO3(this.A00, null, i, i2);
    }

    @Override // X.C8MA
    public final void EGV() {
        this.A01.EGV();
    }

    @Override // X.InterfaceC58288Psg
    public final void EaN(int i, int i2) {
        this.A01.EaN(i, i2);
    }

    public OyH(TextureView textureView, InterfaceC197218ns interfaceC197218ns) {
        this.A01 = interfaceC197218ns;
        this.A00 = textureView;
    }
}
