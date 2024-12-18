package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.common.math.matrix.Matrix4;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.ui.ConstrainedMultiListenerTextureView;
import com.instagram.creation.base.ui.ConstrainedTextureView;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.creation.photo.edit.effectfilter.UnifiedVideoCoverFrameFilter;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.pendingmedia.model.ClipInfo;

/* renamed from: X.OxD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class TextureViewSurfaceTextureListenerC56204OxD implements InterfaceC58195Pr1, TextureView.SurfaceTextureListener {
    public ConstrainedTextureView A00;
    public C9KJ A01;
    public boolean A02;
    public boolean A03;
    public C53611NnI A04;
    public boolean A05;
    public final ViewGroup A06;
    public final FilterGroupModel A07;
    public final Rect A08;
    public final View A09;
    public final FilterChain A0A;
    public final UserSession A0B;
    public final InterfaceC58165PqV A0C;
    public final ConstrainedMultiListenerTextureView A0D;
    public final C47Z A0E;

    public TextureViewSurfaceTextureListenerC56204OxD(View view, UserSession userSession, InterfaceC58165PqV interfaceC58165PqV, FilterGroupModel filterGroupModel, C47Z c47z, int i, int i2) {
        FilterChain filterChain;
        AbstractC167007dF.A1H(interfaceC58165PqV, 3, userSession);
        this.A09 = view;
        this.A0E = c47z;
        this.A0C = interfaceC58165PqV;
        this.A07 = filterGroupModel;
        this.A0B = userSession;
        ViewGroup A0C = AbstractC31176DnK.A0C(view, R.id.album_filter_view_container);
        this.A06 = A0C;
        this.A08 = AbstractC166987dD.A0U();
        ConstrainedMultiListenerTextureView constrainedMultiListenerTextureView = new ConstrainedMultiListenerTextureView(AbstractC166997dE.A0L(view));
        this.A0D = constrainedMultiListenerTextureView;
        constrainedMultiListenerTextureView.A02(this);
        constrainedMultiListenerTextureView.setAspectRatio(c47z.A02);
        A0C.addView(constrainedMultiListenerTextureView, 0);
        interfaceC58165PqV.CO1(constrainedMultiListenerTextureView, i, i2);
        if (filterGroupModel != null) {
            filterChain = ((FilterGroupModelImpl) filterGroupModel).A02;
        } else {
            filterChain = null;
        }
        this.A0A = filterChain;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, X.AGr] */
    public final void A03(C9KK c9kk) {
        if (this.A00 == null) {
            ConstrainedTextureView constrainedTextureView = new ConstrainedTextureView(AbstractC166997dE.A0L(this.A09));
            c9kk.A03 = constrainedTextureView;
            this.A00 = constrainedTextureView;
            this.A06.addView(constrainedTextureView, 1);
        }
        Matrix4 matrix4 = C9KJ.A0R;
        C9KJ c9kj = new C9KJ(this.A09.getContext(), this.A0B, new Object(), "feed", true, true);
        this.A01 = c9kj;
        ConstrainedTextureView constrainedTextureView2 = this.A00;
        if (constrainedTextureView2 != null) {
            c9kk.A07 = c9kj;
            constrainedTextureView2.setSurfaceTextureListener(c9kk);
            C47Z c47z = this.A0E;
            constrainedTextureView2.setAspectRatio(c47z.A02);
            c9kj.A08(c47z, 0);
            if (c47z.A1N != ClipInfo.A0Q.getValue()) {
                ClipInfo clipInfo = c47z.A1N;
                int i = clipInfo.A09;
                int i2 = clipInfo.A06;
                c9kk.A01 = i;
                c9kk.A00 = i2;
            }
            FilterChain filterChain = this.A0A;
            if (filterChain != null) {
                C915647m c915647m = c47z.A1i;
                AbstractC53885NsH.A00(filterChain, c915647m.A01, c915647m.A00);
            }
            this.A03 = true;
            this.A02 = false;
            c9kj.A06(new P1G(this));
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC58195Pr1
    public final boolean Cff() {
        return true;
    }

    @Override // X.InterfaceC58195Pr1
    public final void CoV() {
    }

    @Override // X.InterfaceC58195Pr1
    public final void EZa() {
        this.A05 = true;
    }

    @Override // X.InterfaceC58195Pr1
    public final void Ee2() {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.instagram.creation.photo.edit.effectfilter.PhotoFilter, com.instagram.creation.photo.edit.effectfilter.UnifiedVideoCoverFrameFilter] */
    private final UnifiedVideoCoverFrameFilter A00() {
        UserSession userSession = this.A0B;
        C1YQ A00 = C8M4.A00(userSession);
        C47Z c47z = this.A0E;
        ?? photoFilter = new PhotoFilter(userSession, A00.A01(c47z.A1i.A01), C05F.A0C);
        photoFilter.A00(c47z.A1i.A00);
        return photoFilter;
    }

    public static void A01(TextureViewSurfaceTextureListenerC56204OxD textureViewSurfaceTextureListenerC56204OxD) {
        C9KJ c9kj = textureViewSurfaceTextureListenerC56204OxD.A01;
        if (c9kj != null) {
            c9kj.A00();
            textureViewSurfaceTextureListenerC56204OxD.A06.removeView(textureViewSurfaceTextureListenerC56204OxD.A00);
            c9kj.A06(null);
            textureViewSurfaceTextureListenerC56204OxD.A00 = null;
            textureViewSurfaceTextureListenerC56204OxD.A01 = null;
        }
    }

    public final void A02() {
        if (!this.A02) {
            this.A02 = true;
            C9KJ c9kj = this.A01;
            if (c9kj != null) {
                c9kj.A01();
            }
        }
    }

    @Override // X.InterfaceC58195Pr1
    public final void Ag8(C51272Mkv c51272Mkv, int i, int i2) {
        this.A0C.AQ0(A00(), this.A07, new C50260MHp(c51272Mkv, 23), i, i2);
    }

    @Override // X.InterfaceC58195Pr1
    public final Bitmap AzJ(int i, int i2) {
        Bitmap bitmap = this.A0D.getBitmap(i, i2);
        if (bitmap != null) {
            return bitmap;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC58195Pr1
    public final String BkZ() {
        return this.A0E.A33;
    }

    @Override // X.InterfaceC58195Pr1
    public final void CoJ() {
        if (this.A05) {
            this.A05 = false;
            C9KJ c9kj = this.A01;
            if (c9kj != null) {
                C47Z c47z = this.A0E;
                c9kj.A08(c47z, 0);
                FilterChain filterChain = this.A0A;
                if (filterChain != null) {
                    C915647m c915647m = c47z.A1i;
                    AbstractC53885NsH.A00(filterChain, c915647m.A01, c915647m.A00);
                }
                c9kj.CoQ();
            }
            this.A0C.AQ7(A00(), this.A07);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, X.NnI] */
    @Override // X.InterfaceC58195Pr1
    public final boolean E48(InterfaceC58030PoG interfaceC58030PoG) {
        P06 p06 = new P06(this.A09.getContext(), this.A0B, interfaceC58030PoG, this.A0D, this.A0E);
        FilterGroupModel filterGroupModel = this.A07;
        if (filterGroupModel != null) {
            ?? obj = new Object();
            obj.A00 = p06;
            C11T.A04(new PLZ(obj), 2000L);
            this.A04 = obj;
            this.A0C.AQ7(A00(), filterGroupModel);
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC58195Pr1
    public final boolean isVisible() {
        return this.A09.getLocalVisibleRect(this.A08);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        InterfaceC58165PqV interfaceC58165PqV = this.A0C;
        interfaceC58165PqV.CO1(this.A0D, i, i2);
        interfaceC58165PqV.AQ7(A00(), this.A07);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.A0C.AP4();
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C53611NnI c53611NnI = this.A04;
        if (c53611NnI != null) {
            this.A04 = null;
            P06 p06 = c53611NnI.A00;
            if (p06 != null) {
                c53611NnI.A00 = null;
                C11T.A04(new RunnableC56856PLb(p06), 17L);
            }
        }
    }

    @Override // X.InterfaceC58195Pr1
    public final void cleanup() {
        A01(this);
        this.A02 = false;
        this.A06.removeView(this.A0D);
    }
}
