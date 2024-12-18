package X;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.animation.OvershootInterpolator;
import com.instagram.ui.widget.flyingreactionview.FlyingReactionView;

/* renamed from: X.WfK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70697WfK implements C1NJ {
    public final /* synthetic */ Point A00;
    public final /* synthetic */ Point A01;
    public final /* synthetic */ FlyingReactionView A02;
    public final /* synthetic */ int[] A03;

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        C14360o3.A0B(c73033Pe, 1);
        FlyingReactionView flyingReactionView = this.A02;
        Point point = this.A01;
        Point point2 = this.A00;
        int[] iArr = this.A03;
        Point point3 = new Point(iArr[0], iArr[1]);
        Bitmap bitmap = c73033Pe.A01;
        if (bitmap != null) {
            OvershootInterpolator overshootInterpolator = FlyingReactionView.A06;
            flyingReactionView.A01 = new C69363Vm9(bitmap, point, point2, point3, flyingReactionView.A03);
            if (!flyingReactionView.A02) {
                flyingReactionView.A02 = true;
                flyingReactionView.setVisibility(0);
                flyingReactionView.bringToFront();
                C69363Vm9 c69363Vm9 = flyingReactionView.A01;
                if (c69363Vm9 != null) {
                    c69363Vm9.A00 = SystemClock.elapsedRealtime();
                    flyingReactionView.postInvalidateOnAnimation();
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    public C70697WfK(Point point, Point point2, FlyingReactionView flyingReactionView, int[] iArr) {
        this.A02 = flyingReactionView;
        this.A01 = point;
        this.A00 = point2;
        this.A03 = iArr;
    }
}
