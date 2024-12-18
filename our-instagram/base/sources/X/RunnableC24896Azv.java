package X;

import android.app.Activity;
import android.graphics.RectF;
import android.view.ViewGroup;
import com.instagram.common.gallery.Medium;
import com.instagram.model.direct.camera.DirectCameraViewModel;

/* renamed from: X.Azv, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24896Azv implements Runnable {
    public final /* synthetic */ RectF A00;
    public final /* synthetic */ RectF A01;
    public final /* synthetic */ ViewGroup A02;
    public final /* synthetic */ C22P A03;
    public final /* synthetic */ Medium A04;
    public final /* synthetic */ C214859fN A05;
    public final /* synthetic */ String A06;

    public RunnableC24896Azv(RectF rectF, RectF rectF2, ViewGroup viewGroup, C22P c22p, Medium medium, C214859fN c214859fN, String str) {
        this.A05 = c214859fN;
        this.A02 = viewGroup;
        this.A03 = c22p;
        this.A00 = rectF;
        this.A01 = rectF2;
        this.A04 = medium;
        this.A06 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C214859fN c214859fN = this.A05;
        if (c214859fN.mView != null) {
            ViewGroup viewGroup = this.A02;
            C14360o3.A0A(viewGroup);
            C22P c22p = this.A03;
            RectF rectF = this.A00;
            RectF rectF2 = this.A01;
            DirectCameraViewModel directCameraViewModel = c214859fN.A02;
            Medium medium = this.A04;
            String str = this.A06;
            C81J A01 = C81J.A01();
            InterfaceC25214BDm interfaceC25214BDm = c214859fN.A04;
            interfaceC25214BDm.getClass();
            A01.A0l = interfaceC25214BDm;
            InterfaceC09390do interfaceC09390do = c214859fN.A05;
            C81J.A0L(A01, interfaceC09390do);
            Activity rootActivity = c214859fN.getRootActivity();
            C14360o3.A0A(rootActivity);
            C81J.A03(rootActivity, c214859fN, A01);
            C81J.A0C(AbstractC166987dD.A0r(interfaceC09390do), C81O.A02, C81T.A00, A01);
            A01.A3h = true;
            A01.A0R = c214859fN.volumeKeyPressController;
            C81I c81i = c214859fN.A01;
            c81i.getClass();
            A01.A0t = c81i;
            viewGroup.getClass();
            A01.A09 = viewGroup;
            A01.A0B = c22p;
            A01.A0O = c214859fN;
            A01.A3I = true;
            C81J.A04(rectF, rectF2, A01);
            A01.A0P = medium;
            A01.A0w = null;
            A01.A2G = str;
            A01.A3y = true;
            C81J.A0E(A01);
            A01.A3Q = true;
            if (directCameraViewModel != null) {
                A01.A1I = directCameraViewModel;
                A01.A28 = C05F.A01;
                A01.A3C = true;
                A01.A3n = true;
                A01.A2q = null;
                A01.A1K = null;
                A01.A2l = null;
                A01.A37 = true;
                A01.A3V = false;
                A01.A03 = 2;
            }
            C81Y c81y = new C81Y(A01);
            c214859fN.A00 = c81y;
            if (c214859fN.isResumed()) {
                c81y.A01();
            }
        }
    }
}
