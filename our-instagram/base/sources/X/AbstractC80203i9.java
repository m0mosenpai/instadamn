package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.facebook.common.dextricks.StringTreeSet;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.3i9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC80203i9 {
    public static final void A00(Context context, C2YN c2yn, C79723hN c79723hN, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        try {
            c2yn.A00 = C00Q.A03("primary_tag_indicator", StringTreeSet.MAX_SYMBOL_COUNT);
            c2yn.A02(new C9FV(2, c79723hN, context, interfaceC16660sJ, z), new Object[]{Boolean.valueOf(z)});
        } finally {
            c2yn.A00 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r11 == X.EnumC74373Vt.A05) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C9BD r5, X.C38321qM r6, X.InterfaceC60442pS r7, X.C79743hP r8, X.C75113Zb r9, X.C65502xm r10, X.EnumC74373Vt r11) {
        /*
            r0 = 1
            X.C14360o3.A0B(r7, r0)
            r0 = 3
            X.C14360o3.A0B(r9, r0)
            r0 = 4
            X.C14360o3.A0B(r11, r0)
            r0 = 5
            X.C14360o3.A0B(r5, r0)
            r3 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r3)
            if (r0 == 0) goto L20
            r1 = -2143693505(0xffffffff8039d53f, float:-5.311122E-39)
            java.lang.String r0 = "setupVideoView"
            X.C0fO.A01(r0, r1)
        L20:
            boolean r2 = r10.A09     // Catch: java.lang.Throwable -> L5b
            X.3Vt r0 = X.EnumC74373Vt.A06     // Catch: java.lang.Throwable -> L5b
            if (r11 == r0) goto L2f
            X.3Vt r0 = X.EnumC74373Vt.A07     // Catch: java.lang.Throwable -> L5b
            if (r11 == r0) goto L2f
            X.3Vt r1 = X.EnumC74373Vt.A05     // Catch: java.lang.Throwable -> L5b
            r0 = 1
            if (r11 != r1) goto L30
        L2f:
            r0 = 0
        L30:
            if (r2 == 0) goto L34
            if (r0 == 0) goto L3f
        L34:
            com.instagram.ui.mediaactions.MediaActionsView r1 = r8.A08     // Catch: java.lang.Throwable -> L5b
            if (r1 == 0) goto L53
            com.instagram.feed.widget.IgProgressImageView r0 = r8.A00()     // Catch: java.lang.Throwable -> L5b
            X.AbstractC86483tL.A00(r5, r9, r0, r1, r11)     // Catch: java.lang.Throwable -> L5b
        L3f:
            com.instagram.ui.widget.framelayout.MediaFrameLayout r0 = r8.A01()     // Catch: java.lang.Throwable -> L5b
            r0.setVideoSource(r6, r7)     // Catch: java.lang.Throwable -> L5b
            boolean r0 = com.facebook.systrace.Systrace.A0E(r3)
            if (r0 == 0) goto L52
            r0 = 2028041536(0x78e17540, float:3.6582653E34)
            X.C0fO.A00(r0)
        L52:
            return
        L53:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L5b
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L5b
            throw r0     // Catch: java.lang.Throwable -> L5b
        L5b:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r3)
            if (r0 == 0) goto L68
            r0 = -905701728(0xffffffffca0416a0, float:-2164136.0)
            X.C0fO.A00(r0)
        L68:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC80203i9.A02(X.9BD, X.1qM, X.2pS, X.3hP, X.3Zb, X.2xm, X.3Vt):void");
    }

    public static final void A03(C9BR c9br, C2YN c2yn, C79723hN c79723hN, C86773tp c86773tp, EnumC79303gb enumC79303gb, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(enumC79303gb, 2);
        C14360o3.A0B(c86773tp, 3);
        C14360o3.A0B(c9br, 4);
        try {
            c2yn.A00 = C00Q.A03("video_play_button", StringTreeSet.MAX_SYMBOL_COUNT);
            c2yn.A02(new C207219Fa(14, c9br, c79723hN, interfaceC16660sJ, c86773tp), new Object[]{enumC79303gb});
        } finally {
            c2yn.A00 = null;
        }
    }

    public static final void A04(C2YN c2yn, UserSession userSession, C75113Zb c75113Zb, InterfaceC76053bA interfaceC76053bA, C86633tb c86633tb, String str, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        C14360o3.A0B(c75113Zb, 2);
        C14360o3.A0B(userSession, 4);
        C14360o3.A0B(str, 5);
        C14360o3.A0B(interfaceC76053bA, 6);
        try {
            c2yn.A00 = C00Q.A03("interactive_stickers", StringTreeSet.MAX_SYMBOL_COUNT);
            c2yn.A02(new C4HL(userSession, c75113Zb, interfaceC76053bA, c86633tb, str, interfaceC16660sJ, z), new Object[]{c86633tb, interfaceC76053bA});
        } finally {
            c2yn.A00 = null;
        }
    }

    public static final void A05(C2YN c2yn, InterfaceC80063hv interfaceC80063hv, C79723hN c79723hN, InterfaceC16660sJ interfaceC16660sJ, boolean z, boolean z2) {
        C14360o3.A0B(c79723hN, 1);
        C14360o3.A0B(interfaceC80063hv, 4);
        try {
            c2yn.A00 = C00Q.A03("subtitles", StringTreeSet.MAX_SYMBOL_COUNT);
            c2yn.A02(new BAQ(interfaceC80063hv, c79723hN, interfaceC16660sJ, z, z2), new Object[]{Boolean.valueOf(z)});
        } finally {
            c2yn.A00 = null;
        }
    }

    public static final void A06(C2YN c2yn, C79723hN c79723hN, C30E c30e, InterfaceC16660sJ interfaceC16660sJ) {
        EnumC92614Cv enumC92614Cv;
        C14360o3.A0B(c79723hN, 1);
        C14360o3.A0B(c30e, 2);
        try {
            c2yn.A00 = C00Q.A03("audioIcon", StringTreeSet.MAX_SYMBOL_COUNT);
            Boolean valueOf = Boolean.valueOf(c79723hN.A0O);
            C75113Zb c75113Zb = c79723hN.A0E;
            C4ZF c4zf = c75113Zb.A0s;
            if (c4zf != null) {
                enumC92614Cv = c4zf.A05;
                C14360o3.A0A(enumC92614Cv);
            } else {
                enumC92614Cv = EnumC92614Cv.STOPPED;
            }
            c2yn.A02(new C9FN(13, interfaceC16660sJ, c79723hN, c30e), new Object[]{valueOf, enumC92614Cv, Integer.valueOf(c75113Zb.A0O), c75113Zb.A0h});
        } finally {
            c2yn.A00 = null;
        }
    }

    public static final void A07(C2YN c2yn, C80193i8 c80193i8, C79933hi c79933hi, C75113Zb c75113Zb, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(c79933hi, 1);
        C14360o3.A0B(c75113Zb, 3);
        try {
            c2yn.A00 = C00Q.A03("watchAndBrowse", StringTreeSet.MAX_SYMBOL_COUNT);
            c2yn.A02(new C207219Fa(15, c80193i8, c75113Zb, interfaceC16660sJ, c79933hi), new Object[]{c80193i8});
        } finally {
            c2yn.A00 = null;
        }
    }

    public static final void A09(ImageUrl imageUrl, String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 2);
        if (imageUrl != null) {
            String url = imageUrl.getUrl();
            C14360o3.A07(url);
            if (!AbstractC001900j.A0T(url)) {
                C1OG A0J = C25821No.A00().A0J(imageUrl, str2);
                A0J.A0J = false;
                A0J.A08 = AnonymousClass001.A0R("main|", str);
                A0J.A01();
            }
        }
    }

    public static final void A0A(InterfaceC60442pS interfaceC60442pS, C80143i3 c80143i3, C79723hN c79723hN, InterfaceC79883hd interfaceC79883hd, IgProgressImageView igProgressImageView, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        C14360o3.A0B(interfaceC60442pS, 0);
        C14360o3.A0B(c79723hN, 1);
        C14360o3.A0B(c80143i3, 2);
        C14360o3.A0B(interfaceC79883hd, 5);
        C14360o3.A0B(interfaceC16820sZ, 6);
        C80623ir c80623ir = (C80623ir) interfaceC16820sZ.invoke();
        if (c80623ir == null) {
            AbstractC80643it.A02(c79723hN.A06, interfaceC60442pS, c80143i3, interfaceC79883hd, c79723hN.A0E, igProgressImageView, c79723hN.A0I, new C206969Eb(c79723hN, 0), new C206969Eb(c79723hN, 1), z);
            return;
        }
        igProgressImageView.setPostProcessor(c79723hN.A06);
        igProgressImageView.setTag(R.id.key_media_id, c79723hN.A0J);
        Bitmap bitmap = c80623ir.A01;
        ImageUrl imageUrl = c80623ir.A02;
        String str = c80623ir.A03;
        igProgressImageView.setTrackedBitmap(bitmap, imageUrl, str, c80623ir.A00, interfaceC60442pS);
        C79703hL c79703hL = c79723hN.A0A;
        InterfaceC16660sJ interfaceC16660sJ = c79703hL.A0M;
        String url = imageUrl.getUrl();
        C14360o3.A07(url);
        C14360o3.A0B(bitmap, 0);
        C14360o3.A0B(str, 2);
        interfaceC16660sJ.invoke(new C73083Pj(bitmap, url, str, bitmap.getWidth(), bitmap.getHeight()));
        c79703hL.A0N.invoke(igProgressImageView);
        if (!c79723hN.A0L) {
            return;
        }
        Context context = igProgressImageView.getContext();
        C14360o3.A07(context);
        if (!C86193sq.A00(context)) {
            return;
        }
        igProgressImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    public static final void A08(C2YN c2yn, CharSequence charSequence, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(charSequence, 1);
        try {
            c2yn.A00 = C00Q.A03("contentDescription", StringTreeSet.MAX_SYMBOL_COUNT);
            c2yn.A02(new C207169Ev(17, charSequence, interfaceC16660sJ), new Object[]{charSequence});
        } finally {
            c2yn.A00 = null;
        }
    }

    public static final void A01(Context context, C79723hN c79723hN, IgProgressImageView igProgressImageView, C3YD c3yd) {
        igProgressImageView.A06(R.id.listener_id_for_media_tag_indicator);
        C79703hL c79703hL = c79723hN.A0A;
        InterfaceC86283sz interfaceC86283sz = (InterfaceC86283sz) c79703hL.A0U.invoke(context, null);
        AbstractC86373tA.A00((View.OnClickListener) c79703hL.A0V.invoke(c3yd, true), (InterfaceC86303t2) c79703hL.A06.invoke(), (C3t9) c79703hL.A0a.invoke(context, null, true), interfaceC86283sz, c3yd);
    }
}
