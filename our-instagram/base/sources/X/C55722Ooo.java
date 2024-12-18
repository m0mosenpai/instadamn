package X;

import android.graphics.SurfaceTexture;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* renamed from: X.Ooo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55722Ooo implements InterfaceC197408oB {
    public final int A00;
    public final int A01;
    public final SurfaceTexture A02;
    public final FilterGroupModel A03;
    public final InterfaceC197178nn A04;
    public final /* synthetic */ C56208OxH A05;

    public C55722Ooo(SurfaceTexture surfaceTexture, C56208OxH c56208OxH, InterfaceC197178nn interfaceC197178nn, int i, int i2) {
        C14360o3.A0B(interfaceC197178nn, 2);
        this.A05 = c56208OxH;
        this.A04 = interfaceC197178nn;
        this.A02 = surfaceTexture;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = C9OA.A00();
    }

    @Override // X.InterfaceC197408oB
    public final void CNl(C197368o7 c197368o7) {
        C14360o3.A0B(c197368o7, 0);
        C9RG c9rg = new C9RG(null, null, this.A04, false);
        c197368o7.A0B(c9rg);
        c197368o7.A0A(c9rg.A02);
        int i = this.A01;
        int i2 = this.A00;
        c197368o7.A06(i, i2, 0, false, false);
        C176517t9 c176517t9 = new C176517t9(C178747wm.A01, new C176507t8(this.A02, false));
        c197368o7.A07 = c176517t9;
        c197368o7.A0C(new RunnableC24567AuO(c176517t9, c197368o7));
        c197368o7.A05(i, i2);
        SurfaceCropFilter surfaceCropFilter = new SurfaceCropFilter(false);
        surfaceCropFilter.A0P(false);
        this.A03.EUT(surfaceCropFilter.A00, 3);
    }

    @Override // X.InterfaceC197408oB
    public final void EGX(C197368o7 c197368o7) {
        C14360o3.A0B(c197368o7, 0);
        PhotoFilter photoFilter = this.A05.A03;
        if (photoFilter != null) {
            FilterGroupModel filterGroupModel = this.A03;
            filterGroupModel.EUT(photoFilter.A03, 17);
            c197368o7.A07(((FilterGroupModelImpl) filterGroupModel).A02);
            C179067xI.A00(c197368o7.A0C, null);
        }
    }

    @Override // X.InterfaceC197408oB
    public final /* synthetic */ void cancel() {
        throw C00O.createAndThrow();
    }
}
