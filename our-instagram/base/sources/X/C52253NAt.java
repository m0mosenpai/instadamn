package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.NAt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52253NAt extends AbstractC60592pi implements InterfaceC60602pj {
    public C5SW A00;
    public String A01;
    public final UserSession A02;

    public final void A00(Activity activity, View view, View view2, Integer num) {
        AbstractC167027dH.A12(view, view2, num);
        view.post(new RunnableC57068PTh(activity, view, view2, this, num));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A01(java.lang.Integer r10) {
        /*
            r9 = this;
            r2 = 0
            int r0 = X.AbstractC43592JPx.A03(r10, r2)
            r3 = 3
            r8 = 0
            com.instagram.common.session.UserSession r7 = r9.A02
            switch(r0) {
                case 0: goto L33;
                case 1: goto L45;
                case 2: goto L51;
                case 3: goto L5d;
                case 4: goto L69;
                default: goto Lc;
            }
        Lc:
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36595822896351499(0x8203b50000090b, double:3.2066839869790353E-306)
            long r5 = X.C18U.A01(r3, r7, r0)
            r3 = -1
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L31
            X.C14360o3.A0B(r7, r2)
            X.Iek r0 = X.C41768Iek.A00
            X.0xq r1 = X.C41768Iek.A02(r7, r0)
            java.lang.String r0 = "tag_products_products_tab_tooltip_seen_count"
            int r0 = r1.getInt(r0, r2)
            long r1 = (long) r0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 >= 0) goto L32
        L31:
            r8 = 1
        L32:
            return r8
        L33:
            X.C14360o3.A0B(r7, r2)
            X.Iek r0 = X.C41768Iek.A00
            X.0xq r1 = X.C41768Iek.A02(r7, r0)
            java.lang.String r0 = "tag_products_tooltip_seen_count"
            int r0 = r1.getInt(r0, r2)
            r3 = 10
            goto L78
        L45:
            X.C14360o3.A0B(r7, r2)
            X.Iek r0 = X.C41768Iek.A00
            X.0xq r1 = X.C41768Iek.A02(r7, r0)
            java.lang.String r0 = "tag_products_affiliate_post_tooltip_seen_count"
            goto L74
        L51:
            X.C14360o3.A0B(r7, r2)
            X.Iek r0 = X.C41768Iek.A00
            X.0xq r1 = X.C41768Iek.A02(r7, r0)
            java.lang.String r0 = "tag_products_collections_promotions_tooltip_seen_count"
            goto L74
        L5d:
            X.C14360o3.A0B(r7, r2)
            X.Iek r0 = X.C41768Iek.A00
            X.0xq r1 = X.C41768Iek.A02(r7, r0)
            java.lang.String r0 = "stories_font_selection_tooltip_seen_count"
            goto L74
        L69:
            X.C14360o3.A0B(r7, r2)
            X.Iek r0 = X.C41768Iek.A00
            X.0xq r1 = X.C41768Iek.A02(r7, r0)
            java.lang.String r0 = "tag_products_affiliate_story_tooltip_seen_count"
        L74:
            int r0 = r1.getInt(r0, r2)
        L78:
            if (r0 >= r3) goto L32
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52253NAt.A01(java.lang.Integer):boolean");
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        this.A00 = null;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        C5SW c5sw = this.A00;
        if (c5sw != null && c5sw.A09()) {
            c5sw.A08(false);
            this.A00 = null;
        }
    }

    public C52253NAt(UserSession userSession) {
        this.A02 = userSession;
    }
}
