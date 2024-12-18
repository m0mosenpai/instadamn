package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.5zd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C133115zd extends Drawable implements C5RR, InterfaceC133125ze, InterfaceC133135zf {
    public static final InterfaceC08100bW A0g = new C1QF("IgSecureUriParser").A00;
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public LinearGradient A09;
    public LinearGradient A0A;
    public String A0B;
    public int[] A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final Context A0J;
    public final Resources A0K;
    public final Bitmap A0L;
    public final Bitmap A0M;
    public final Canvas A0N;
    public final Paint A0O;
    public final Rect A0P;
    public final Rect A0Q;
    public final RectF A0R;
    public final Typeface A0S;
    public final UserSession A0T;
    public final C6RN A0U;
    public final Boolean A0V;
    public final String A0W;
    public final String A0X;
    public final String A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final String[] A0c;
    public final String[] A0d;
    public final int A0e;
    public final Map A0f;

    public final void A02(Integer num, Integer num2) {
        if (num2 != null) {
            A00(num2.intValue(), false);
        }
        if (num != null) {
            this.A02 = num.intValue();
        }
        invalidateSelf();
    }

    @Override // X.InterfaceC133135zf
    public final void AGx(EnumC222529rt enumC222529rt, int i) {
        C14360o3.A0B(enumC222529rt, 0);
        A00(enumC222529rt.A01(i), true);
        this.A02 = enumC222529rt.A00(i);
        invalidateSelf();
    }

    @Override // X.InterfaceC133135zf
    public final Drawable AKx(String str) {
        C14360o3.A0B(str, 0);
        return new C133115zd(this.A0J, this.A0T, this.A0U, false, null, null, str, null, null, this.A0e, false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0140  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r14) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133115zd.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A09 = new LinearGradient(getBounds().centerX() - (this.A08 / 2), 0.0f, getBounds().centerX() + (this.A08 / 2), 0.0f, this.A0C, (float[]) null, Shader.TileMode.REPEAT);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    private final boolean A01(UserSession userSession) {
        if (!this.A0a && AbstractC172687md.A01(userSession)) {
            return true;
        }
        return false;
    }

    @Override // X.C5RR
    public final C5NL C0T() {
        return this.A0U;
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return this.A0Y;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A04;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A08;
    }

    private final void A00(int i, boolean z) {
        this.A0C = new int[]{i, i};
        this.A09 = new LinearGradient(getBounds().centerX() - (this.A08 / 2), 0.0f, getBounds().centerX() + (this.A08 / 2), 0.0f, this.A0C, (float[]) null, Shader.TileMode.REPEAT);
        if (z) {
            invalidateSelf();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0379, code lost:
    
        if (r50.equals("link_sticker_redesign_default") == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x012d, code lost:
    
        if (r55 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x014c, code lost:
    
        if (X.AbstractC009903n.A0O(r43.A0Y, r43.A0d) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x05bf, code lost:
    
        if (r2 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x05d5, code lost:
    
        r1 = com.facebook.R.dimen.clips_template_landing_page_template_preview_clip_index_text_size;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x05d1, code lost:
    
        if (X.AbstractC009903n.A0O(r50, r3) != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01df, code lost:
    
        if (r5 != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0101, code lost:
    
        if (r55 != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0205, code lost:
    
        if (r2 != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0103, code lost:
    
        r1 = com.facebook.R.dimen.avatar_search_sticker_tray_text_size;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x021f, code lost:
    
        if (r1 != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x011b, code lost:
    
        if (r14 >= 13) goto L10;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:100:0x0349. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:101:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x031c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C133115zd(android.content.Context r44, com.instagram.common.session.UserSession r45, X.C6RN r46, java.lang.Boolean r47, java.lang.Integer r48, java.lang.Integer r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, int r53, boolean r54, boolean r55, boolean r56) {
        /*
            Method dump skipped, instructions count: 1574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133115zd.<init>(android.content.Context, com.instagram.common.session.UserSession, X.6RN, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, int, boolean, boolean, boolean):void");
    }
}
