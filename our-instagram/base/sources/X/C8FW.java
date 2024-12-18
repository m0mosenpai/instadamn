package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.8FW, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8FW implements AnonymousClass895 {
    public final UserSession A00;
    public final String A01;
    public final Context A02;
    public final Drawable A03;
    public final C8FY A04;
    public final C8FV A05;
    public final boolean A06;

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x002e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0141  */
    @Override // X.AnonymousClass895
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ADx(final X.C88X r13, final X.C88N r14, final X.C177327uS r15, final int r16, int r17) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8FW.ADx(X.88X, X.88N, X.7uS, int, int):void");
    }

    public C8FW(Context context, UserSession userSession, C8FV c8fv, String str, boolean z) {
        Bitmap bitmap;
        this.A00 = userSession;
        this.A02 = context;
        this.A05 = c8fv;
        this.A01 = str;
        BitmapDrawable bitmapDrawable = (BitmapDrawable) context.getDrawable(R.drawable.effects_explore);
        Resources resources = context.getResources();
        if (bitmapDrawable != null) {
            bitmap = bitmapDrawable.getBitmap();
        } else {
            bitmap = null;
        }
        C8FY c8fy = new C8FY(resources, bitmap);
        this.A03 = c8fy;
        c8fy.A02(context.getResources().getDimension(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height) / 2.0f);
        this.A06 = z;
        BitmapDrawable bitmapDrawable2 = (BitmapDrawable) context.getDrawable(R.drawable.instagram_gen_ai_pano_outline_24);
        this.A04 = new C8FY(context.getResources(), bitmapDrawable2 != null ? bitmapDrawable2.getBitmap() : null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        if (r1 > 1.0f) goto L20;
     */
    @Override // X.C89B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DNk(android.view.View r5, float r6, int r7) {
        /*
            r4 = this;
            java.lang.Object r3 = r5.getTag()
            if (r3 == 0) goto L58
            X.7uS r3 = (X.C177327uS) r3
            X.88X r0 = r3.A01
            if (r0 == 0) goto L39
            X.88Z r1 = r0.A04
            X.88Z r0 = X.C88Z.A0G
            if (r1 != r0) goto L39
            java.lang.String r1 = r4.A01
            java.lang.String r0 = "pre_capture"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L47
            X.8FV r2 = r4.A05
            boolean r0 = r2.EiV()
            r1 = 0
            if (r0 == 0) goto L44
            if (r7 != 0) goto L3a
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L3a
        L2b:
            android.graphics.drawable.Drawable r2 = r2.B1L()
            r0 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r0
            int r0 = (int) r1
            r2.setAlpha(r0)
        L36:
            r3.A00()
        L39:
            return
        L3a:
            float r1 = java.lang.Math.abs(r6)
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L2b
        L44:
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L2b
        L47:
            java.lang.String r0 = "post_capture"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L36
            java.lang.String r0 = "clip_transition"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L39
            goto L36
        L58:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8FW.DNk(android.view.View, float, int):void");
    }
}
