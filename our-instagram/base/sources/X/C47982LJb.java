package X;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import com.instagram.ui.widget.textureview.ScalingTextureView;

/* renamed from: X.LJb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47982LJb {
    public boolean A00;
    public final PopupWindow A01;
    public final ScalingTextureView A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;

    public static final void A02(InterfaceC174767qC interfaceC174767qC, C47982LJb c47982LJb, int i, int i2) {
        interfaceC174767qC.setInitialCameraFacing(1);
        EnumC174667q0 enumC174667q0 = EnumC174667q0.HIGH;
        interfaceC174767qC.Ecy(new C212559bO(enumC174667q0, enumC174667q0, null));
        interfaceC174767qC.EbS(c47982LJb.A02.getSurfaceTexture(), i, i2);
        interfaceC174767qC.AJS(new C45328K4g(interfaceC174767qC, c47982LJb, i), null, C81S.A00);
    }

    public static final View A00(C47982LJb c47982LJb) {
        return AbstractC167007dF.A0L(c47982LJb.A0B);
    }

    public static InterfaceC09390do A01(Object obj, int i) {
        return C1XM.A00(new C57246PbU(obj, i));
    }

    public C47982LJb(Context context) {
        InterfaceC09390do A01 = A01(context, 48);
        this.A0B = A01;
        this.A01 = new PopupWindow(AbstractC167007dF.A0L(A01), -1, -1, true);
        this.A0A = A01(this, 47);
        this.A02 = (ScalingTextureView) AbstractC166997dE.A0R(AbstractC167007dF.A0L(this.A0B), R.id.camera_preview_texture_view);
        this.A03 = A01(this, 40);
        this.A08 = A01(this, 45);
        this.A07 = A01(this, 44);
        this.A09 = A01(this, 46);
        this.A06 = A01(this, 43);
        this.A05 = A01(this, 42);
        this.A04 = A01(this, 41);
        ((MediaFrameLayout) AbstractC166987dD.A17(this.A0A)).A00 = -1.0f;
        ((CircularImageView) AbstractC166987dD.A17(this.A03)).A02 = true;
    }
}
