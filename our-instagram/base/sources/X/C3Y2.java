package X;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.watchandbrowse.ui.WatchAndBrowseMainView;

/* renamed from: X.3Y2, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3Y2 implements C3Y3 {
    public final int A00;
    public final Context A01;
    public final UserSession A02;
    public final Activity A03;

    @Override // X.C3Y3
    public final IKE AiU(ViewGroup viewGroup, C80193i8 c80193i8, C39447HbZ c39447HbZ, WatchAndBrowseMainView watchAndBrowseMainView) {
        return new IKE(viewGroup, c80193i8, this, c39447HbZ, watchAndBrowseMainView);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0079, code lost:
    
        if (r8 != null) goto L14;
     */
    @Override // X.C3Y3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void COS(android.view.ViewGroup r5, X.C80193i8 r6, X.C39447HbZ r7, com.instagram.watchandbrowse.ui.WatchAndBrowseMainView r8) {
        /*
            r4 = this;
            if (r8 == 0) goto L29
            r1 = 0
            r8.setShadowViewVisibility(r1)
            int r0 = r4.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.A03 = r0
            r8.setGradientVisibility(r1)
            android.content.Context r3 = r4.A01
            r0 = 4604029899060858061(0x3fe4cccccccccccd, double:0.65)
            android.graphics.drawable.GradientDrawable$Orientation r2 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            android.graphics.drawable.GradientDrawable r2 = X.BOU.A00(r3, r2, r0)
            com.instagram.common.ui.base.IgFrameLayout r1 = r8.A00
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L29
            r1.setBackground(r2)
        L29:
            if (r7 == 0) goto L7c
            java.lang.String r1 = r7.A06
        L2d:
            java.lang.String r0 = "back_arrow"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L79
            if (r8 == 0) goto L63
            r0 = 2131237967(0x7f081c4f, float:1.80922E38)
            r3 = 2131099690(0x7f06002a, float:1.781174E38)
            android.content.Context r2 = r8.getContext()
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r0)
            if (r0 == 0) goto L57
            com.instagram.common.ui.base.IgSimpleImageView r1 = r8.A06
            r1.setImageDrawable(r0)
            int r0 = r2.getColor(r3)
            android.graphics.ColorFilter r0 = X.C3DY.A00(r0)
            r1.setColorFilter(r0)
        L57:
            com.instagram.common.ui.base.IgSimpleImageView r1 = r8.A06
            if (r1 == 0) goto L63
            X.IhL r0 = new X.IhL
            r0.<init>(r6)
            X.C0fQ.A00(r0, r1)
        L63:
            r1 = 1
            if (r7 == 0) goto L78
            boolean r0 = r7.A0F
            if (r0 != r1) goto L78
            if (r5 == 0) goto L78
            android.content.Context r1 = r4.A01
            r0 = 2131099938(0x7f060122, float:1.7812243E38)
            int r0 = r1.getColor(r0)
            r5.setBackgroundColor(r0)
        L78:
            return
        L79:
            if (r8 == 0) goto L63
            goto L57
        L7c:
            r1 = 0
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3Y2.COS(android.view.ViewGroup, X.3i8, X.HbZ, com.instagram.watchandbrowse.ui.WatchAndBrowseMainView):void");
    }

    @Override // X.C3Y3
    public final void CoW(C39447HbZ c39447HbZ, WatchAndBrowseMainView watchAndBrowseMainView) {
        Activity activity;
        UserSession userSession = this.A02;
        if (userSession != null && (activity = this.A03) != null) {
            boolean z = false;
            if (c39447HbZ != null && c39447HbZ.A0F) {
                z = true;
                Context A01 = AbstractC53172bz.A01(activity);
                AbstractC56402iY.A04(activity, null, A01.getColor(AbstractC53242c7.A0H(A01, R.attr.status_bar_background)), true);
            }
            if (C18U.A06(C06090Tz.A05, userSession, 36317534785639767L)) {
                if (watchAndBrowseMainView != null) {
                    C14360o3.A0B(activity, 0);
                    C57982lB.A0B.A04(activity, new C71107Wo4(watchAndBrowseMainView), true);
                }
                if (!z) {
                    Context context = this.A01;
                    AbstractC56402iY.A02(activity, context.getColor(AbstractC53242c7.A0D(context)));
                    AbstractC56402iY.A06(activity, true);
                }
            }
        }
    }

    @Override // X.C3Y3
    public final void EJy() {
        Activity activity = this.A03;
        Context context = this.A01;
        AbstractC56402iY.A02(activity, context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_background)));
        AbstractC56402iY.A06(activity, true);
    }

    public C3Y2(Activity activity, Context context, UserSession userSession) {
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = activity;
        this.A00 = AbstractC53242c7.A0G(context, R.attr.bottomSheetTopCornerRadius);
    }
}
