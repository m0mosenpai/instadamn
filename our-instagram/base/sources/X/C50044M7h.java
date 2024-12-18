package X;

import android.view.WindowManager;
import java.util.Observable;
import java.util.Observer;

/* renamed from: X.M7h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50044M7h implements Observer {
    public WindowManager.LayoutParams A00;
    public WindowManager A01;
    public C3NG A02;
    public C44411Jjr A03;
    public C1QR A04;
    public boolean A05;

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        C44411Jjr c44411Jjr;
        boolean z;
        C44411Jjr c44411Jjr2;
        boolean z2;
        C44411Jjr c44411Jjr3 = this.A03;
        if (c44411Jjr3 != null) {
            C3NG c3ng = this.A02;
            if (c3ng != null) {
                String str = c3ng.A00;
                if (c3ng.A01) {
                    WindowManager windowManager = this.A01;
                    if (!this.A05 && windowManager != null) {
                        windowManager.addView(c44411Jjr3, this.A00);
                        z2 = true;
                        this.A05 = z2;
                    }
                    c44411Jjr3.A01 = str;
                    C44411Jjr.A00(c44411Jjr3);
                    c44411Jjr3.invalidate();
                } else {
                    WindowManager windowManager2 = this.A01;
                    if (this.A05 && windowManager2 != null) {
                        windowManager2.removeViewImmediate(c44411Jjr3);
                        z2 = false;
                        this.A05 = z2;
                    }
                    c44411Jjr3.A01 = str;
                    C44411Jjr.A00(c44411Jjr3);
                    c44411Jjr3.invalidate();
                }
            }
            C1QR c1qr = this.A04;
            if (c1qr != null) {
                if (c1qr.A01) {
                    WindowManager windowManager3 = this.A01;
                    if (!this.A05 && windowManager3 != null && (c44411Jjr2 = this.A03) != null) {
                        windowManager3.addView(c44411Jjr2, this.A00);
                        z = true;
                        this.A05 = z;
                    }
                    c44411Jjr3.A00 = c1qr.A00;
                    C44411Jjr.A00(c44411Jjr3);
                    c44411Jjr3.invalidate();
                }
                WindowManager windowManager4 = this.A01;
                if (this.A05 && windowManager4 != null && (c44411Jjr = this.A03) != null) {
                    windowManager4.removeViewImmediate(c44411Jjr);
                    z = false;
                    this.A05 = z;
                }
                c44411Jjr3.A00 = c1qr.A00;
                C44411Jjr.A00(c44411Jjr3);
                c44411Jjr3.invalidate();
            }
        }
    }
}
