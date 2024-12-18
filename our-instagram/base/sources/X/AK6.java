package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* loaded from: classes4.dex */
public final class AK6 {
    public final int A00;
    public final Context A01;
    public final UserSession A02;
    public final TargetViewSizeProvider A03;
    public final String A04;

    public static final C8FC A00(float f, float f2, int i, int i2) {
        C23108AGw c23108AGw = new C23108AGw();
        c23108AGw.A04 = f;
        c23108AGw.A03 = f2;
        c23108AGw.A06 = new C221639qS(17, i, i2);
        return new C8FC(c23108AGw);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C09530e4 A01(X.C45116Jxl r18, X.AK6 r19, com.instagram.reels.channelchallenge.model.ChannelChallengeStickerWinnerModel r20, java.lang.Integer r21, java.lang.Integer r22, float r23, int r24, int r25, int r26, int r27, int r28, int r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AK6.A01(X.Jxl, X.AK6, com.instagram.reels.channelchallenge.model.ChannelChallengeStickerWinnerModel, java.lang.Integer, java.lang.Integer, float, int, int, int, int, int, int, boolean):X.0e4");
    }

    public AK6(Context context, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, String str) {
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = targetViewSizeProvider;
        this.A04 = str;
        this.A00 = context.getResources().getDimensionPixelSize(R.dimen.audition_flow_picker_subtitle_margin_bottom);
    }
}
