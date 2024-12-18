package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;

/* loaded from: classes6.dex */
public final class G0H implements XCU {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public G0H(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A04 = obj4;
        this.A03 = obj3;
        this.A02 = obj;
        this.A01 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.content.Context] */
    @Override // X.XCU
    public final void onFailure(Exception exc) {
        String str;
        Activity activity;
        switch (this.A00) {
            case 0:
                Activity activity2 = (Activity) this.A01;
                if (activity2.isDestroyed()) {
                    return;
                }
                Dialog dialog = (Dialog) this.A03;
                if (dialog != null) {
                    dialog.dismiss();
                }
                str = "unknown_error_occured";
                activity = activity2;
                break;
            case 1:
                str = "startCreateStandaloneFundraiserStickerStory_unknown_error_occured";
                activity = (Context) this.A01;
                break;
            case 2:
                str = "shareVotingInfoCenterToStory_unknown_error_occured";
                activity = (Context) this.A01;
                break;
            default:
                C006802i c006802i = C006802i.A0p;
                C14360o3.A07(c006802i);
                C55034OZb.A01(c006802i, "media_background_generator_failure");
                ((Activity) this.A02).finish();
                return;
        }
        C9GR.A0C(activity, str);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0281  */
    @Override // X.XCU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G0H.onSuccess(java.lang.Object):void");
    }
}
