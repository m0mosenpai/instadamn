package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Message;
import android.view.Surface;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.common.ui.blur.BlurUtil;

/* loaded from: classes9.dex */
public final class PI6 implements InterfaceC58085PpA {
    public final /* synthetic */ OB4 A00;
    public final /* synthetic */ OL3 A01;
    public final /* synthetic */ C53021Nct A02;

    @Override // X.InterfaceC58085PpA
    public final void EpW(Surface surface, int i, int i2) {
        Message obtainMessage;
        int i3;
        Bitmap bitmap;
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(i2);
        C53021Nct c53021Nct = this.A02;
        ConstraintLayout constraintLayout = this.A01.A03;
        ((AbstractC55102ObF) c53021Nct).A01 = constraintLayout.getWidth();
        int height = constraintLayout.getHeight();
        ((AbstractC55102ObF) c53021Nct).A00 = height;
        C55142Ocx c55142Ocx = c53021Nct.A0G;
        if (c55142Ocx != null) {
            c55142Ocx.A01 = ((AbstractC55102ObF) c53021Nct).A01;
            c55142Ocx.A00 = height;
        }
        if (c53021Nct.A03 != 0 && c53021Nct.A02 != 0) {
            obtainMessage = ((AbstractC55102ObF) c53021Nct).A09.A09.obtainMessage(6, i, i2, null);
        } else {
            c53021Nct.A03 = i;
            c53021Nct.A02 = i2;
            OYB.A00(((AbstractC55102ObF) c53021Nct).A07).A01(null, MSY.A0D(Integer.valueOf(c53021Nct.A03), c53021Nct.A02), null);
            obtainMessage = ((AbstractC55102ObF) c53021Nct).A09.A09.obtainMessage(6, i, i2, null);
        }
        obtainMessage.sendToTarget();
        C55142Ocx c55142Ocx2 = c53021Nct.A0G;
        if (c55142Ocx2 != null) {
            Surface surface2 = c53021Nct.A09;
            c55142Ocx2.A03 = i;
            c55142Ocx2.A02 = i2;
            if (c55142Ocx2.A0E) {
                c55142Ocx2.A04();
                c55142Ocx2.A05(surface2);
            }
        }
        c53021Nct.A01 = i;
        c53021Nct.A00 = i2;
        int i4 = c53021Nct.A03;
        if (i == i4 && i2 == (i3 = c53021Nct.A02) && c53021Nct.A0K == C05F.A0N && (bitmap = c53021Nct.A06) != null) {
            Bitmap A00 = C0fK.A00(bitmap, i4, i3, false);
            C14360o3.A07(A00);
            Canvas lockCanvas = surface.lockCanvas(null);
            BlurUtil.blur(A00, 1.0f, AbstractC166987dD.A0A(c53021Nct.A03, 0.074074075f));
            lockCanvas.drawBitmap(A00, 0.0f, 0.0f, (Paint) null);
            surface.unlockCanvasAndPost(lockCanvas);
        }
        c53021Nct.A0g.invoke(this.A00.A01, surface, valueOf, valueOf2);
        if (c53021Nct.A09 != surface) {
            c53021Nct.A09 = surface;
            if (!c53021Nct.A0O) {
                C53021Nct.A07(c53021Nct);
            }
        }
    }

    public PI6(OB4 ob4, OL3 ol3, C53021Nct c53021Nct) {
        this.A02 = c53021Nct;
        this.A01 = ol3;
        this.A00 = ob4;
    }

    @Override // X.InterfaceC58085PpA
    public final void EpY() {
        this.A02.A09 = null;
    }
}
