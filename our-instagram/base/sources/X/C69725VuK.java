package X;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.facebook.R;

/* renamed from: X.VuK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C69725VuK {
    public View A01;
    public PopupWindow.OnDismissListener A02;
    public WPX A03;
    public InterfaceC71933XBi A04;
    public boolean A05;
    public final int A06;
    public final int A07;
    public final Context A08;
    public final WQH A0A;
    public final boolean A0B;
    public int A00 = 8388611;
    public final PopupWindow.OnDismissListener A09 = new C55523OlH(this, 0);

    public void A01() {
        this.A03 = null;
        PopupWindow.OnDismissListener onDismissListener = this.A02;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final WPX A00() {
        WPX wpx = this.A03;
        if (wpx == null) {
            Context context = this.A08;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                wpx = new UDJ(context, this.A01, this.A06, this.A07, this.A0B);
            } else {
                wpx = new UDK(context, this.A01, this.A0A, this.A06, this.A07, this.A0B);
            }
            WQH wqh = this.A0A;
            boolean z = wpx instanceof UDK;
            if (!z) {
                UDJ udj = (UDJ) wpx;
                wqh.A07(udj.A0H, udj);
                if (udj.CdI()) {
                    UDJ.A00(udj, wqh);
                } else {
                    udj.A0L.add(wqh);
                }
            }
            PopupWindow.OnDismissListener onDismissListener = this.A09;
            if (z) {
                ((UDK) wpx).A05 = onDismissListener;
            } else {
                ((UDJ) wpx).A08 = onDismissListener;
            }
            View view = this.A01;
            if (z) {
                ((UDK) wpx).A02 = view;
            } else {
                UDJ udj2 = (UDJ) wpx;
                if (udj2.A05 != view) {
                    udj2.A05 = view;
                    udj2.A00 = Gravity.getAbsoluteGravity(udj2.A02, view.getLayoutDirection());
                }
            }
            wpx.EQl(this.A04);
            wpx.A02(this.A05);
            int i = this.A00;
            if (z) {
                ((UDK) wpx).A01 = i;
            } else {
                UDJ udj3 = (UDJ) wpx;
                if (udj3.A02 != i) {
                    udj3.A02 = i;
                    udj3.A00 = Gravity.getAbsoluteGravity(i, udj3.A05.getLayoutDirection());
                }
            }
            this.A03 = wpx;
        }
        return wpx;
    }

    public C69725VuK(Context context, View view, WQH wqh, int i, int i2, boolean z) {
        this.A08 = context;
        this.A0A = wqh;
        this.A01 = view;
        this.A0B = z;
        this.A06 = i;
        this.A07 = i2;
    }
}
