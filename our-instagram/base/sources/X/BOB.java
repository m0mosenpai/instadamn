package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class BOB {
    public static final BOB A00 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        if (r3.A05.get(r64.A0G) == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007d, code lost:
    
        if (r75 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0061, code lost:
    
        if (X.C14360o3.A0K(r0.getId(), r63.userId) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0063, code lost:
    
        r34 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01ae, code lost:
    
        if (X.C18U.A06(r4, r63, 36321069544383615L) != false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence A03(android.content.Context r62, com.instagram.common.session.UserSession r63, X.C84923qg r64, X.C75113Zb r65, X.AnonymousClass341 r66, X.C3AG r67, com.instagram.search.common.analytics.SearchContext r68, java.lang.Boolean r69, java.lang.String r70, int r71, boolean r72, boolean r73, boolean r74, boolean r75) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BOB.A03(android.content.Context, com.instagram.common.session.UserSession, X.3qg, X.3Zb, X.341, X.3AG, com.instagram.search.common.analytics.SearchContext, java.lang.Boolean, java.lang.String, int, boolean, boolean, boolean, boolean):java.lang.CharSequence");
    }

    public static final int A00(Resources resources, int i, int i2) {
        int i3;
        int i4 = resources.getDisplayMetrics().widthPixels;
        if (AbstractC52812bN.A01(resources.getConfiguration().screenWidthDp)) {
            i3 = resources.getDimensionPixelSize(R.dimen.abc_list_item_height_material);
        } else {
            i3 = 0;
        }
        return (((i4 - i3) - i) - i) - i2;
    }

    public static final TextPaint A01(Context context) {
        int color = context.getColor(R.color.design_dark_default_color_on_background);
        int color2 = context.getColor(R.color.debug_overlay_white_70_transparent);
        Resources resources = context.getResources();
        TextPaint textPaint = new TextPaint(1);
        textPaint.linkColor = color2;
        textPaint.setTextSize(resources.getDimension(R.dimen.abc_text_size_menu_header_material));
        textPaint.setColor(color);
        return textPaint;
    }

    public static final void A02(UserSession userSession, C38321qM c38321qM, AnonymousClass341 anonymousClass341, C3AG c3ag, SearchContext searchContext, HashMap hashMap, boolean z) {
        InterfaceC41141vN c72233Lw;
        AbstractC167017dG.A1N(userSession, c38321qM);
        C14360o3.A0B(searchContext, 4);
        C25671My A002 = AbstractC25651Mw.A00(userSession);
        if (z) {
            c72233Lw = new C72243Lx(c38321qM, anonymousClass341, c3ag);
        } else {
            c72233Lw = new C72233Lw(c38321qM, anonymousClass341, c3ag, searchContext, hashMap);
        }
        A002.E4s(c72233Lw);
    }
}
