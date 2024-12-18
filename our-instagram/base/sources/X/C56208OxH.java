package X;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.textureview.MultiListenerTextureView;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* renamed from: X.OxH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56208OxH implements InterfaceC58165PqV, InterfaceC57934Pme {
    public int A00;
    public int A01;
    public C197368o7 A02;
    public PhotoFilter A03;
    public SurfaceTexture A04;
    public final Handler A05;
    public final UserSession A06;
    public final MXC A07;
    public final MXD A08;
    public final InterfaceC197178nn A09;
    public final Runnable A0A;

    @Override // X.InterfaceC58165PqV
    public final void CO1(MultiListenerTextureView multiListenerTextureView, int i, int i2) {
        C14360o3.A0B(multiListenerTextureView, 0);
        SurfaceTexture surfaceTexture = this.A04;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        SurfaceTexture surfaceTexture2 = new SurfaceTexture(0);
        surfaceTexture2.detachFromGLContext();
        surfaceTexture2.setDefaultBufferSize(i, i2);
        multiListenerTextureView.setSurfaceTexture(surfaceTexture2);
        this.A04 = surfaceTexture2;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // X.InterfaceC58165PqV
    public final /* synthetic */ void DfN() {
    }

    @Override // X.InterfaceC58165PqV
    public final void AP4() {
        SurfaceTexture surfaceTexture = this.A04;
        if (surfaceTexture != null) {
            this.A05.post(new PQ0(surfaceTexture, this));
        }
        this.A04 = null;
    }

    @Override // X.InterfaceC58165PqV
    public final void AQ0(PhotoFilter photoFilter, FilterGroupModel filterGroupModel, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        this.A08.A02.post(new RunnableC57071PTk(this, photoFilter, filterGroupModel, interfaceC16660sJ, i, i2));
    }

    @Override // X.InterfaceC58165PqV
    public final void AQ7(PhotoFilter photoFilter, FilterGroupModel filterGroupModel) {
        this.A03 = photoFilter;
        SurfaceTexture surfaceTexture = this.A04;
        if (surfaceTexture != null) {
            this.A05.post(new PQ1(surfaceTexture, this));
        }
    }

    @Override // X.InterfaceC57934Pme
    public final void E3i() {
        Handler handler = this.A05;
        Runnable runnable = this.A0A;
        handler.removeCallbacks(runnable);
        handler.postAtFrontOfQueue(runnable);
    }

    public C56208OxH(UserSession userSession, MXC mxc, MXD mxd, InterfaceC197178nn interfaceC197178nn) {
        AbstractC167017dG.A1P(userSession, mxd);
        this.A06 = userSession;
        this.A08 = mxd;
        this.A09 = interfaceC197178nn;
        this.A07 = mxc;
        this.A05 = mxd.A02;
        this.A0A = new RunnableC56870PLp(this);
    }
}
