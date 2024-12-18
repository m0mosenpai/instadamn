package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* loaded from: classes4.dex */
public final class ALs {
    public int A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final Context A08;
    public final UserSession A09;
    public final TargetViewSizeProvider A0A;
    public final String A0B;

    public static final int A00(ALs aLs, float f) {
        return AbstractC166987dD.A0B(-1.0f, (aLs.A01 + (aLs.A02 / 2)) - (f / 2.0f));
    }

    public static final C8FC A01(float f, int i, int i2) {
        C23108AGw c23108AGw = new C23108AGw();
        c23108AGw.A04 = f;
        c23108AGw.A06 = new C221639qS(17, i, i2);
        return new C8FC(c23108AGw);
    }

    public ALs(Context context, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, String str) {
        this.A08 = context;
        this.A09 = userSession;
        this.A0A = targetViewSizeProvider;
        this.A0B = str;
        this.A02 = AbstractC167017dG.A03(context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.challenge_sticker_width);
        this.A05 = dimensionPixelSize;
        this.A07 = context.getResources().getDimensionPixelSize(R.dimen.browser_error_screen_description_width);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.challenge_winners_sticker_1_winner_column_height);
        this.A06 = dimensionPixelSize2;
        this.A03 = AbstractC167017dG.A08(context);
        this.A04 = AbstractC167017dG.A06(context);
        this.A00 = dimensionPixelSize2;
        this.A01 = dimensionPixelSize;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0114, code lost:
    
        if (r8 != 2) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.LinkedHashMap A02(X.C45116Jxl r15, X.ALs r16, com.instagram.reels.channelchallenge.model.ChannelChallengeStickerWinnerModel r17, java.lang.Integer r18, int r19) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ALs.A02(X.Jxl, X.ALs, com.instagram.reels.channelchallenge.model.ChannelChallengeStickerWinnerModel, java.lang.Integer, int):java.util.LinkedHashMap");
    }
}
