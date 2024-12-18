package X;

import android.app.Activity;
import android.os.Parcelable;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashSet;

/* renamed from: X.80s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1809080s implements C82M {
    public C5SW A00;
    public boolean A01;
    public final Activity A02;
    public final UserSession A03;
    public final java.util.Set A04;

    public C1809080s(Activity activity, UserSession userSession) {
        C14360o3.A0B(activity, 1);
        C14360o3.A0B(userSession, 2);
        this.A02 = activity;
        this.A03 = userSession;
        this.A04 = new LinkedHashSet();
    }

    public final boolean A01(View view, View view2, EnumC199188rL enumC199188rL) {
        C14360o3.A0B(view, 0);
        C14360o3.A0B(view2, 1);
        return A03(view, view2, enumC199188rL, false);
    }

    public final boolean A03(View view, View view2, EnumC199188rL enumC199188rL, boolean z) {
        C14360o3.A0B(view, 0);
        C14360o3.A0B(enumC199188rL, 2);
        return A02(view, view2, enumC199188rL, null, null, 0, z);
    }

    @Override // X.C82M
    public final /* synthetic */ void A7T(Parcelable parcelable) {
    }

    public final void A00() {
        C5SW c5sw = this.A00;
        if (c5sw != null) {
            c5sw.A08(true);
            this.A00 = null;
            this.A01 = false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0283, code lost:
    
        if (((java.lang.Boolean) r15.A30.CES(r15, X.C23031Ai.A8c[324(0x144, float:4.54E-43)])).booleanValue() == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0298, code lost:
    
        if (r1.getInt("preference_roll_call_direct_camera_nux_impression_count", 0) < 3) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0370, code lost:
    
        if (r15.A01.getInt("channel_sticker_clips_tooltip_impression_count", 0) < 2) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0389, code lost:
    
        if (r3.getInt("story_last_server_xposting_turn_on_time_in_second", -1) < r3.getInt("xpost_to_facebook_story_server_mtime_in_second", 0)) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x03da, code lost:
    
        if (r0 == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:
    
        if (X.C18U.A06(r4, r3, 36321761033529144L) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008f, code lost:
    
        if (r15.A01.getInt("AR_EFFECT_ICON_NUX_IMPRESSION_COUNT", 0) >= ((int) X.C18U.A01(r4, r3, 36603236010103715L))) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x03c4, code lost:
    
        if (r1.getInt(r0, 0) >= 3) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0253, code lost:
    
        if (r0 != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0335, code lost:
    
        if (r0 != false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01e3, code lost:
    
        if (r15.A01.getInt("ads_mode_story_tooltip_impression_count", 0) < X.C18U.A01(r6, r3, 36603047031608186L)) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0205, code lost:
    
        if (r15.A01.getInt("story_composer_my_story_fb_share_nux_tooltip_count", 0) < 1) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0230, code lost:
    
        if (r1.getInt("template_sticker_tooltip_impression_count", 0) < 3) goto L143;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A02(final android.view.View r19, final android.view.View r20, X.EnumC199188rL r21, final X.C21C r22, final java.lang.String r23, final int r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 1144
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1809080s.A02(android.view.View, android.view.View, X.8rL, X.21C, java.lang.String, int, boolean):boolean");
    }

    @Override // X.C82M
    public final /* synthetic */ Parcelable ANh() {
        return null;
    }
}
