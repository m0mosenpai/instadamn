package X;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.W4h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70110W4h {
    public ImageView A00;
    public InterfaceC56362iU A01;
    public C63822v3 A02;
    public Hashtag A03;
    public final Activity A04;
    public final Context A05;
    public final AbstractC018607g A06;
    public final InterfaceC11380iw A07;
    public final UserSession A08;
    public final InterfaceC63862v7 A09;
    public final String A0A;

    public C70110W4h(Activity activity, Context context, AbstractC018607g abstractC018607g, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 5);
        this.A03 = AbstractC1120253r.A00(C00Q.A02(str, 1));
        this.A05 = context;
        this.A04 = activity;
        this.A07 = interfaceC11380iw;
        this.A08 = userSession;
        this.A0A = str;
        this.A06 = abstractC018607g;
        this.A09 = new C70926WkV(context, this);
    }

    public static final void A00(C70110W4h c70110W4h, boolean z) {
        ImageView imageView = c70110W4h.A00;
        if (imageView == null) {
            C14360o3.A0F("followButton");
            throw C00O.createAndThrow();
        }
        Context context = c70110W4h.A05;
        int i = R.drawable.instagram_circle_add_pano_outline_24;
        if (z) {
            i = R.drawable.instagram_circle_check_pano_outline_24;
        }
        AbstractC166997dE.A19(context, imageView, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
    
        if (r0 != 1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.InterfaceC56362iU r8) {
        /*
            r7 = this;
            r7.A01 = r8
            com.instagram.common.session.UserSession r5 = r7.A08
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36323169782475830(0x810bbb00002c36, double:3.0342570598780954E-306)
            boolean r0 = X.C18U.A06(r2, r5, r0)
            if (r0 == 0) goto Lec
            java.lang.String r0 = r7.A0A
            boolean r0 = X.AbstractC85443rZ.A02(r0)
            if (r0 == 0) goto Lec
            com.instagram.model.hashtag.Hashtag r0 = r7.A03
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto Lec
            X.3LO r1 = new X.3LO
            r1.<init>()
            r0 = 2131238628(0x7f081ee4, float:1.809354E38)
            r1.A06 = r0
            r0 = 2131973323(0x7f1354cb, float:1.9583679E38)
            r1.A05 = r0
            r4 = 0
            X.WNS r0 = new X.WNS
            r0.<init>(r7, r4)
            X.AbstractC31176DnK.A1B(r0, r1, r8)
            com.instagram.model.hashtag.Hashtag r0 = r7.A03
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto Lec
            r0 = 36329938650939981(0x8111e30000424d, double:3.03853771955087E-306)
            boolean r0 = X.C18U.A06(r2, r5, r0)
            if (r0 != 0) goto Lec
            com.instagram.model.hashtag.Hashtag r0 = r7.A03
            java.lang.Boolean r0 = r0.AbF()
            r1 = 1
            boolean r0 = X.AbstractC166997dE.A1Z(r0, r1)
            if (r0 != 0) goto L67
            com.instagram.model.hashtag.Hashtag r0 = r7.A03
            java.lang.Integer r0 = r0.B7W()
            if (r0 == 0) goto L67
            int r0 = r0.intValue()
            if (r0 == r4) goto Lec
        L67:
            X.3LO r3 = new X.3LO
            r3.<init>()
            com.instagram.model.hashtag.Hashtag r0 = r7.A03
            java.lang.Integer r0 = r0.B7W()
            if (r0 == 0) goto L7d
            int r0 = r0.intValue()
            r2 = 2131238165(0x7f081d15, float:1.80926E38)
            if (r0 == r1) goto L80
        L7d:
            r2 = 2131238156(0x7f081d0c, float:1.8092583E38)
        L80:
            r3.A06 = r2
            r2 = 2131962735(0x7f132b6f, float:1.9562204E38)
            r3.A05 = r2
            X.WNS r0 = new X.WNS
            r0.<init>(r7, r1)
            android.view.View r6 = X.AbstractC31177DnL.A0F(r0, r3, r8)
            r0 = 34
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            X.C14360o3.A0C(r6, r0)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r7.A00 = r6
            if (r6 != 0) goto La9
            java.lang.String r0 = "followButton"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        La9:
            com.instagram.model.hashtag.Hashtag r0 = r7.A03
            java.lang.Integer r0 = r0.B7W()
            if (r0 == 0) goto Lb7
            int r0 = r0.intValue()
            if (r0 == r1) goto Lec
        Lb7:
            X.1Ai r0 = X.AbstractC23021Ah.A00(r5)
            X.0xq r0 = r0.A01
            java.lang.String r3 = "hashtag_serp_follow_tooltip_shown_count"
            int r0 = r0.getInt(r3, r4)
            if (r0 >= r1) goto Lec
            android.app.Activity r0 = r7.A04
            X.5SU r0 = X.AbstractC167007dF.A0U(r0, r2)
            r0.A03(r6)
            r0.A01()
            r0.A0A = r1
            r0.A0B = r1
            X.5SW r0 = r0.A00()
            X.WvO r2 = new X.WvO
            r2.<init>(r0, r7)
            r0 = 500(0x1f4, double:2.47E-321)
            r6.postDelayed(r2, r0)
            X.1Ai r0 = X.AbstractC23021Ah.A00(r5)
            X.0xq r0 = r0.A01
            X.AbstractC50522MSa.A1T(r0, r3, r4)
        Lec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70110W4h.A01(X.2iU):void");
    }
}
