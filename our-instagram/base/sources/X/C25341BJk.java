package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.BJk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25341BJk {
    public static final InterfaceC11380iw A02 = new C19270xB("ig_feed_item_media_notice");
    public final UserSession A00;
    public final Context A01;

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(X.C26070Bfy r12, X.C27889CRa r13, X.CSW r14, java.lang.String r15) {
        /*
            r11 = this;
            r5 = 0
            r7 = r12
            boolean r10 = X.AbstractC167007dF.A1R(r5, r14, r12)
            r4 = 2
            r6 = r13
            X.C14360o3.A0B(r13, r4)
            android.widget.TextView r1 = r14.A04
            java.lang.String r0 = r12.A06
            r1.setText(r0)
            java.lang.String r2 = r12.A05
            r3 = 0
            r1 = 8
            android.widget.TextView r0 = r14.A03
            if (r2 == 0) goto L78
            r0.setText(r2)
            r0.setVisibility(r5)
        L21:
            java.lang.Object r0 = r12.A01
            com.instagram.api.schemas.MediaNoticeIcon r0 = (com.instagram.api.schemas.MediaNoticeIcon) r0
            r8 = r11
            if (r0 == 0) goto L72
            android.widget.ImageView r2 = r14.A02
            r2.setVisibility(r5)
            int r0 = r0.ordinal()
            if (r0 == r10) goto L66
            if (r0 != r4) goto L72
            r0 = 2131238781(0x7f081f7d, float:1.809385E38)
            r2.setImageResource(r0)
            android.content.Context r1 = r11.A01
            r0 = 2130970217(0x7f040669, float:1.7549138E38)
        L40:
            int r0 = X.AbstractC167007dF.A09(r1, r0)
            r2.setColorFilter(r0)
        L47:
            android.widget.ImageView r1 = r14.A01
            java.lang.String r0 = r12.A07
            if (r0 != 0) goto L4f
            r3 = 8
        L4f:
            r1.setVisibility(r3)
            android.view.View r1 = r14.A00
            X.Cl0 r5 = new X.Cl0
            r9 = r15
            r5.<init>(r6, r7, r8, r9, r10)
            X.C0fQ.A00(r5, r1)
            X.CjY r0 = new X.CjY
            r0.<init>(r11, r15)
            r1.addOnAttachStateChangeListener(r0)
            return
        L66:
            r0 = 2131237874(0x7f081bf2, float:1.809201E38)
            r2.setImageResource(r0)
            android.content.Context r1 = r11.A01
            r0 = 2130970309(0x7f0406c5, float:1.7549324E38)
            goto L40
        L72:
            android.widget.ImageView r0 = r14.A02
            r0.setVisibility(r1)
            goto L47
        L78:
            r0.setVisibility(r1)
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25341BJk.A00(X.Bfy, X.CRa, X.CSW, java.lang.String):void");
    }

    public C25341BJk(Context context, UserSession userSession) {
        AbstractC167017dG.A1P(context, userSession);
        this.A01 = context;
        this.A00 = userSession;
    }
}
