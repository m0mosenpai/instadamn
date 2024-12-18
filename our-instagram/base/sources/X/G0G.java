package X;

import android.app.Activity;
import android.content.Context;

/* loaded from: classes6.dex */
public final class G0G implements XCU {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public G0G(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    @Override // X.XCU
    public final void onFailure(Exception exc) {
        String str;
        Context context;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(exc, 0);
                str = "shareToStory_unknown_error_occurred";
                context = (Context) this.A01;
                break;
            case 1:
                Activity activity = (Activity) this.A01;
                if (activity.isDestroyed()) {
                    return;
                }
                str = "unknown_error_occured";
                context = activity;
                break;
            default:
                return;
        }
        C9GR.A0C(context, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        if (r1 < 250) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01b6, code lost:
    
        if (r1 < 250) goto L137;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01c3 A[Catch: IOException -> 0x01dd, TryCatch #1 {IOException -> 0x01dd, blocks: (B:5:0x0009, B:8:0x0033, B:10:0x0039, B:14:0x0048, B:21:0x01bb, B:23:0x01c3, B:27:0x01d0), top: B:4:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01ce  */
    @Override // X.XCU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G0G.onSuccess(java.lang.Object):void");
    }
}
