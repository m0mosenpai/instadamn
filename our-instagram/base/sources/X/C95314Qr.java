package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.facebook.R;
import java.lang.ref.WeakReference;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.4Qr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C95314Qr {
    public int A00;
    public WeakReference A01;
    public WeakReference A02;
    public WeakReference A03;
    public final boolean A04;
    public final int[] A05 = {15000, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS};
    public final WeakReference A06;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r4, 36312097358545826L) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C95314Qr(com.instagram.common.session.UserSession r4, java.lang.ref.WeakReference r5) {
        /*
            r3 = this;
            r0 = 2
            r3.<init>()
            r3.A06 = r5
            int[] r0 = new int[r0]
            r0 = {x0026: FILL_ARRAY_DATA , data: [15000, 2000} // fill-array
            r3.A05 = r0
            boolean r0 = com.facebook.endtoend.EndToEnd.isRunningEndToEndTest()
            if (r0 == 0) goto L21
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36312097358545826(0x8101a9001b03a2, double:3.0272548143996883E-306)
            boolean r1 = X.C18U.A06(r2, r4, r0)
            r0 = 1
            if (r1 != 0) goto L22
        L21:
            r0 = 0
        L22:
            r3.A04 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95314Qr.<init>(com.instagram.common.session.UserSession, java.lang.ref.WeakReference):void");
    }

    public final void A00(ViewGroup viewGroup, String str) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        C14360o3.A0B(str, 2);
        if (this.A04) {
            WeakReference weakReference = this.A06;
            this.A03 = new WeakReference(new TextView((Context) weakReference.get()));
            this.A01 = new WeakReference(new TextView((Context) weakReference.get()));
            this.A02 = new WeakReference(new TextView((Context) weakReference.get()));
            new FrameLayout.LayoutParams(-1, -1);
            TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-1, -1);
            int color = viewGroup.getContext().getColor(R.color.igds_active_badge);
            WeakReference weakReference2 = this.A03;
            if (weakReference2 != null && (textView3 = (TextView) weakReference2.get()) != null) {
                textView3.setPadding(20, 20, 20, 20);
                textView3.setText(str);
                textView3.setTextColor(color);
                textView3.setTextSize(20.0f);
                if (!C14360o3.A0K(textView3.getParent(), viewGroup)) {
                    textView3.setLayoutParams(layoutParams);
                    viewGroup.addView(textView3);
                }
            }
            WeakReference weakReference3 = this.A01;
            if (weakReference3 != null && (textView2 = (TextView) weakReference3.get()) != null) {
                textView2.setPadding(20, 5, 20, 5);
                textView2.setText(str);
                textView2.setTextColor(color);
                textView2.setTextSize(20.0f);
                textView2.setGravity(85);
                if (!C14360o3.A0K(textView2.getParent(), viewGroup)) {
                    textView2.setLayoutParams(layoutParams);
                    viewGroup.addView(textView2);
                }
            }
            WeakReference weakReference4 = this.A02;
            if (weakReference4 != null && (textView = (TextView) weakReference4.get()) != null) {
                textView.setPadding(20, 5, 20, 5);
                textView.setText(str);
                textView.setTextColor(color);
                textView.setTextSize(20.0f);
                textView.setGravity(17);
                if (!C14360o3.A0K(textView.getParent(), viewGroup)) {
                    textView.setLayoutParams(layoutParams);
                    viewGroup.addView(textView);
                }
            }
        }
    }
}
