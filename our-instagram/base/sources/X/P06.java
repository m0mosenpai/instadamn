package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.ui.ConstrainedMultiListenerTextureView;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class P06 implements InterfaceC58147PqC {
    public final Context A00;
    public final UserSession A01;
    public final InterfaceC58030PoG A02;
    public final ConstrainedMultiListenerTextureView A03;
    public final C47Z A04;

    @Override // X.InterfaceC58147PqC
    public final void DfK() {
    }

    @Override // X.InterfaceC58147PqC
    public final void DiC(Map map) {
    }

    @Override // X.InterfaceC58147PqC
    public final void DfF() {
        this.A02.AGm();
        String stackTraceString = android.util.Log.getStackTraceString(new Throwable());
        C14360o3.A0B(stackTraceString, 1);
        AbstractC12120kG.A0C("VideoCoverFrameRenderCompleteListener", stackTraceString, null);
    }

    @Override // X.InterfaceC58147PqC
    public final void DfI(List list) {
        ((InterfaceC189598ae) AbstractC13320mI.A01(this.A00, InterfaceC189598ae.class)).EDa(new Runnable() { // from class: X.PMM
            @Override // java.lang.Runnable
            public final void run() {
                P06 p06 = P06.this;
                ConstrainedMultiListenerTextureView constrainedMultiListenerTextureView = p06.A03;
                Bitmap bitmap = constrainedMultiListenerTextureView.getBitmap();
                Matrix transform = constrainedMultiListenerTextureView.getTransform(null);
                if (bitmap != null) {
                    Context context = p06.A00;
                    UserSession userSession = p06.A01;
                    C47Z c47z = p06.A04;
                    float f = c47z.A02;
                    int i = c47z.A1N.A09;
                    P1H p1h = new P1H(c47z);
                    AbstractC167007dF.A1E(context, 0, transform);
                    C55186Odr.A02(context, bitmap, userSession, p1h, null, f, i);
                    p06.A02.AGm();
                    bitmap.recycle();
                }
            }
        });
    }

    public P06(Context context, UserSession userSession, InterfaceC58030PoG interfaceC58030PoG, ConstrainedMultiListenerTextureView constrainedMultiListenerTextureView, C47Z c47z) {
        this.A00 = context;
        this.A04 = c47z;
        this.A01 = userSession;
        this.A02 = interfaceC58030PoG;
        this.A03 = constrainedMultiListenerTextureView;
    }
}
