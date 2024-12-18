package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.systrace.Systrace;
import kotlin.Deprecated;

/* renamed from: X.6ur, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC153236ur {
    @Deprecated(message = "")
    public static final View A00(Context context, ViewGroup viewGroup) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(viewGroup, 1);
        LayoutInflater from = LayoutInflater.from(context);
        C14360o3.A07(from);
        View A01 = A01(from, viewGroup);
        A01.setTag(new C153276uw(A01));
        return A01;
    }

    public static final View A01(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C14360o3.A0B(layoutInflater, 0);
        C14360o3.A0B(viewGroup, 1);
        if (Systrace.A0E(1L)) {
            C0fO.A01("EmptyStateBinder.newView", 1353522714);
        }
        try {
            View inflate = layoutInflater.inflate(R.layout.layout_listview_empty_state, viewGroup, false);
            if (Systrace.A0E(1L)) {
                C0fO.A00(1644829417);
            }
            C14360o3.A07(inflate);
            return inflate;
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-563381524);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b A[Catch: all -> 0x0070, TryCatch #0 {all -> 0x0070, blocks: (B:5:0x001c, B:7:0x0025, B:8:0x0031, B:9:0x0034, B:11:0x003b, B:19:0x003f, B:21:0x0043, B:22:0x004d), top: B:4:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(final X.C1571273r r6, X.C153276uw r7, X.EnumC153216up r8) {
        /*
            r0 = 0
            X.C14360o3.A0B(r7, r0)
            r5 = 1
            X.C14360o3.A0B(r6, r5)
            r0 = 2
            X.C14360o3.A0B(r8, r0)
            r3 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r3)
            if (r0 == 0) goto L1c
            r1 = 1955577591(0x748fbef7, float:9.110982E31)
            java.lang.String r0 = "EmptyStateBinder.bindView"
            X.C0fO.A01(r0, r1)
        L1c:
            android.view.View r2 = r7.itemView     // Catch: java.lang.Throwable -> L70
            X.C14360o3.A06(r2)     // Catch: java.lang.Throwable -> L70
            boolean r0 = r6.A0L     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L3f
            X.AbstractC13880nE.A0X(r2, r5)     // Catch: java.lang.Throwable -> L70
            android.view.ViewTreeObserver r1 = r2.getViewTreeObserver()     // Catch: java.lang.Throwable -> L70
            X.6ux r0 = new X.6ux     // Catch: java.lang.Throwable -> L70
            r0.<init>()     // Catch: java.lang.Throwable -> L70
        L31:
            r1.addOnPreDrawListener(r0)     // Catch: java.lang.Throwable -> L70
        L34:
            A03(r6, r7, r8)     // Catch: java.lang.Throwable -> L70
            X.73s r0 = r6.A06     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L63
            r0.DDQ()     // Catch: java.lang.Throwable -> L70
            goto L63
        L3f:
            boolean r0 = r6.A0M     // Catch: java.lang.Throwable -> L70
            if (r0 != 0) goto L4d
            android.view.ViewTreeObserver r1 = r2.getViewTreeObserver()     // Catch: java.lang.Throwable -> L70
            X.9Hr r0 = new X.9Hr     // Catch: java.lang.Throwable -> L70
            r0.<init>()     // Catch: java.lang.Throwable -> L70
            goto L31
        L4d:
            android.content.res.Resources r1 = r2.getResources()     // Catch: java.lang.Throwable -> L70
            r0 = 2131165214(0x7f07001e, float:1.7944639E38)
            int r1 = r1.getDimensionPixelOffset(r0)     // Catch: java.lang.Throwable -> L70
            r0 = -2
            X.AbstractC13880nE.A0W(r2, r0)     // Catch: java.lang.Throwable -> L70
            X.AbstractC13880nE.A0d(r2, r1)     // Catch: java.lang.Throwable -> L70
            X.AbstractC13880nE.A0Y(r2, r1)     // Catch: java.lang.Throwable -> L70
            goto L34
        L63:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r3)
            if (r0 == 0) goto L6f
            r0 = 56621515(0x35ff9cb, float:6.582056E-37)
            X.C0fO.A00(r0)
        L6f:
            return
        L70:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r3)
            if (r0 == 0) goto L7d
            r0 = 1418325492(0x5489edf4, float:4.7392217E12)
            X.C0fO.A00(r0)
        L7d:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC153236ur.A02(X.73r, X.6uw, X.6up):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0059, code lost:
    
        if (r20.A0N == false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0168 A[Catch: all -> 0x019a, TryCatch #0 {all -> 0x019a, blocks: (B:5:0x0027, B:8:0x003d, B:11:0x0049, B:13:0x0052, B:16:0x005c, B:19:0x006c, B:21:0x0079, B:23:0x008b, B:25:0x0092, B:27:0x0099, B:28:0x0100, B:29:0x009e, B:31:0x00a2, B:33:0x00a8, B:34:0x00aa, B:36:0x00bd, B:38:0x00cf, B:40:0x00d3, B:42:0x00d7, B:47:0x0113, B:48:0x0123, B:52:0x0134, B:55:0x013b, B:56:0x0164, B:58:0x0168, B:59:0x016b, B:61:0x016f, B:63:0x0173, B:70:0x0188, B:71:0x015c, B:72:0x0144, B:78:0x0153, B:79:0x0156, B:80:0x010e, B:83:0x0120, B:84:0x011b, B:85:0x00c3, B:87:0x00c7, B:89:0x00f1, B:91:0x00f5, B:93:0x007f, B:95:0x0083, B:97:0x0056), top: B:4:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0144 A[Catch: all -> 0x019a, TryCatch #0 {all -> 0x019a, blocks: (B:5:0x0027, B:8:0x003d, B:11:0x0049, B:13:0x0052, B:16:0x005c, B:19:0x006c, B:21:0x0079, B:23:0x008b, B:25:0x0092, B:27:0x0099, B:28:0x0100, B:29:0x009e, B:31:0x00a2, B:33:0x00a8, B:34:0x00aa, B:36:0x00bd, B:38:0x00cf, B:40:0x00d3, B:42:0x00d7, B:47:0x0113, B:48:0x0123, B:52:0x0134, B:55:0x013b, B:56:0x0164, B:58:0x0168, B:59:0x016b, B:61:0x016f, B:63:0x0173, B:70:0x0188, B:71:0x015c, B:72:0x0144, B:78:0x0153, B:79:0x0156, B:80:0x010e, B:83:0x0120, B:84:0x011b, B:85:0x00c3, B:87:0x00c7, B:89:0x00f1, B:91:0x00f5, B:93:0x007f, B:95:0x0083, B:97:0x0056), top: B:4:0x0027 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.C1571273r r20, X.C153276uw r21, X.EnumC153216up r22) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC153236ur.A03(X.73r, X.6uw, X.6up):void");
    }
}
