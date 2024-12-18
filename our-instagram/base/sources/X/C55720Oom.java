package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.rsys.media.gen.StreamInfo;
import com.facebook.rsys.videorender.gen.VideoRenderApi;
import com.instagram.common.session.UserSession;
import org.webrtc.RendererCommon;

/* renamed from: X.Oom, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55720Oom implements InterfaceC178677wf {
    public static UserSession A0B;
    public C54552O8e A00;
    public UAG A01;
    public XB0 A02;
    public RendererCommon.ScalingType A05;
    public boolean A06;
    public boolean A07;
    public final InterfaceC09390do A0A;
    public InterfaceC16820sZ A03 = C57442Pee.A00;
    public InterfaceC16660sJ A04 = C57703Pis.A00;
    public final InterfaceC09390do A09 = C57524Pfy.A00(this, 46);
    public final InterfaceC178677wf A08 = this;

    @Override // X.InterfaceC178677wf
    public final void Dai(C176507t8 c176507t8) {
    }

    @Override // X.InterfaceC178677wf
    public final void Daj(C176507t8 c176507t8, int i, int i2) {
    }

    @Override // X.InterfaceC178677wf
    public final void Dan(View view) {
    }

    public static final void A00(C55720Oom c55720Oom) {
        FrameLayout.LayoutParams layoutParams;
        boolean A1X = AbstractC167007dF.A1X(c55720Oom.A05, RendererCommon.ScalingType.SCALE_ASPECT_FILL);
        UAG uag = c55720Oom.A01;
        if (uag != null) {
            if (A1X) {
                layoutParams = new FrameLayout.LayoutParams(-1, -1);
            } else {
                layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
            }
            uag.setLayoutParams(layoutParams);
        }
    }

    public final void A01() {
        C54552O8e c54552O8e = this.A00;
        if (c54552O8e != null) {
            UAG uag = this.A01;
            if (uag != null) {
                VideoRenderApi videoRenderApi = c54552O8e.A00.A01.A0D.A00;
                C0J8.A03(videoRenderApi, "VideoRenderProxy setApi must be called");
                videoRenderApi.removeRenderTarget(c54552O8e.A01, uag, new StreamInfo(1, null));
            }
            this.A00 = null;
            UAG uag2 = this.A01;
            if (uag2 != null && uag2.A06) {
                uag2.A0C.release();
                uag2.A06 = false;
            }
        }
    }

    @Override // X.InterfaceC178677wf
    public final void Dah(C176507t8 c176507t8) {
        this.A03.invoke();
    }

    public C55720Oom(Context context) {
        this.A0A = C57524Pfy.A00(context, 47);
    }
}
