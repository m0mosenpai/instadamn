package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.ViewStub;
import com.instagram.igds.components.imagebutton.IgImageButton;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.IwY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42796IwY implements InterfaceC58290Psi {
    public final int A00;
    public final InterfaceC56392iX A01;
    public final IgImageButton A02;
    public final MediaFrameLayout A03;

    public C42796IwY(Context context, ViewStub viewStub, IgImageButton igImageButton, MediaFrameLayout mediaFrameLayout) {
        C14360o3.A0B(viewStub, 4);
        this.A03 = mediaFrameLayout;
        this.A02 = igImageButton;
        this.A01 = AbstractC56372iV.A00(viewStub);
        this.A00 = context.getColor(AbstractC53242c7.A04(context));
    }

    @Override // X.InterfaceC58290Psi
    public final /* synthetic */ void El5(boolean z) {
    }

    @Override // X.InterfaceC72963Ox
    public final /* synthetic */ RectF Ahl() {
        return AbstractC13880nE.A0G(this.A03);
    }

    @Override // X.InterfaceC58290Psi
    /* renamed from: Bfj */
    public final RectF Ahl() {
        return AbstractC13880nE.A0G(this.A03);
    }

    @Override // X.InterfaceC58290Psi
    public final void CMt() {
        this.A03.setVisibility(4);
    }

    @Override // X.InterfaceC58290Psi
    public final void ElQ() {
        this.A03.setVisibility(0);
    }
}
