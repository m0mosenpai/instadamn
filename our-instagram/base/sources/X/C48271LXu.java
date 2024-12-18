package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.instagram.ui.widget.balloonsview.BalloonsView;
import java.util.List;

/* renamed from: X.LXu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48271LXu implements C1NJ {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C48271LXu(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A01 = i;
        this.A02 = obj;
    }

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        if (this.A00 != 0) {
            C14360o3.A0B(c73033Pe, 1);
            BalloonsView balloonsView = (BalloonsView) this.A02;
            List list = balloonsView.A08;
            list.add(c73033Pe.A01);
            if (list.size() == this.A01) {
                BalloonsView.A00(balloonsView);
                return;
            }
            return;
        }
        C14360o3.A0B(c73033Pe, 1);
        Bitmap bitmap = c73033Pe.A01;
        if (bitmap == null) {
            return;
        }
        int i = this.A01;
        Canvas canvas = (Canvas) this.A02;
        Bitmap A00 = C0fK.A00(bitmap, i, i, false);
        C14360o3.A07(A00);
        canvas.drawBitmap(A00, 0.0f, 0.0f, (Paint) null);
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
        if (this.A00 == 0) {
            C18950wb.A01.AEp("Exception getting bitmap from user cover image url", 817896325);
        }
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }
}
