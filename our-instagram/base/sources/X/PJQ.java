package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.widget.FrameLayout;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.ui.ConstrainedTextureView;
import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public final class PJQ implements InterfaceC58174Pqe, InterfaceC25193BCq {
    public boolean A00;
    public final C9KK A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final Context A05;
    public final FrameLayout A06;
    public final UserSession A07;
    public final ConstrainedTextureView A08;
    public final InterfaceC57942Pmm A09;
    public final InterfaceC58179Pqj A0A;

    @Override // X.InterfaceC58174Pqe
    public final void CMa() {
    }

    @Override // X.InterfaceC58174Pqe
    public final void DaI() {
    }

    @Override // X.InterfaceC25193BCq
    public final void DfG(RunnableC208819Lp runnableC208819Lp, C208719Lf c208719Lf) {
        NYO nyo = new NYO(this.A05, this.A07, runnableC208819Lp, c208719Lf, this, this.A0A, false);
        if (nyo.A09) {
            nyo.A09();
        } else {
            nyo.A0B = true;
        }
    }

    @Override // X.InterfaceC25193BCq
    public final void DfH() {
    }

    @Override // X.InterfaceC58174Pqe
    public final void Eky() {
    }

    @Override // X.InterfaceC58174Pqe
    public final void FC2() {
    }

    @Override // X.InterfaceC58174Pqe
    public final void ELo() {
        boolean z = this.A00;
        Context context = this.A05;
        UserSession userSession = this.A07;
        if (z) {
            Point C5V = this.A0A.C5V();
            float f = this.A02;
            int i = this.A04;
            InterfaceC57942Pmm interfaceC57942Pmm = this.A09;
            AbstractC167007dF.A1G(C5V, 2, interfaceC57942Pmm);
            int i2 = C5V.x;
            int i3 = C5V.y;
            ByteBuffer A00 = AbstractC66019TyH.A00(i2, i3);
            AbstractC66019TyH.A01(A00, i2, i3);
            Bitmap A0F = AbstractC167007dF.A0F(i2, i3);
            A0F.copyPixelsFromBuffer(A00);
            Bitmap A09 = C1NC.A09(A0F, C5V.x, C5V.y, 0, false);
            C14360o3.A07(A09);
            C55186Odr.A02(context, A09, userSession, interfaceC57942Pmm, null, f, i);
            A0F.recycle();
            this.A00 = false;
            return;
        }
        C55186Odr.A01(context, this.A08.getBitmap(), null, userSession, this.A09, null, this.A02, this.A04, this.A03);
    }

    public PJQ(Context context, FrameLayout frameLayout, UserSession userSession, InterfaceC57942Pmm interfaceC57942Pmm, InterfaceC58179Pqj interfaceC58179Pqj, float f, int i, int i2) {
        boolean A1V = AbstractC167007dF.A1V(userSession);
        this.A05 = context;
        this.A07 = userSession;
        this.A06 = frameLayout;
        this.A02 = f;
        this.A04 = i;
        this.A03 = i2;
        this.A09 = interfaceC57942Pmm;
        this.A0A = interfaceC58179Pqj;
        C9KK c9kk = new C9KK(context, userSession, "live_cover_photo_selector");
        this.A01 = c9kk;
        ConstrainedTextureView constrainedTextureView = new ConstrainedTextureView(context);
        c9kk.A03 = constrainedTextureView;
        constrainedTextureView.setSurfaceTextureListener(c9kk);
        frameLayout.addView(constrainedTextureView, 0);
        this.A08 = constrainedTextureView;
        this.A00 = A1V;
    }
}
