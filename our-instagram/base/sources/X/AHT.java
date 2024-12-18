package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AHT {
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0029, code lost:
    
        if (r8 == X.EnumC120795dP.A03) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(androidx.fragment.app.FragmentActivity r7, X.EnumC120795dP r8, com.instagram.common.session.UserSession r9, java.lang.String r10, java.lang.String r11, int r12) {
        /*
            r3 = 0
            X.C14360o3.A0B(r9, r3)
            r5 = 1
            X.AbstractC167007dF.A1D(r7, r5, r10)
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.A26
            X.5Qr r2 = new X.5Qr
            r2.<init>(r0, r9)
            r2.A1D = r11
            r2.A05 = r12
            r2.A0q = r10
            r2.A07 = r8
            r0 = 513(0x201, float:7.19E-43)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            boolean r4 = r10.equals(r0)
            X.5dP r0 = X.EnumC120795dP.A0p
            r6 = 0
            if (r8 == r0) goto L2b
            X.5dP r1 = X.EnumC120795dP.A03
            r0 = 0
            if (r8 != r1) goto L2c
        L2b:
            r0 = 1
        L2c:
            if (r4 == 0) goto L3e
            if (r0 == 0) goto L3e
            X.0Tz r4 = X.C06090Tz.A05
            r0 = 36318170440734710(0x81072f000317f6, double:3.031095456030278E-306)
            boolean r0 = X.C18U.A06(r4, r9, r0)
            if (r0 == 0) goto L3e
            r6 = 1
        L3e:
            r2.A1i = r6
            X.0Tz r4 = X.C06090Tz.A05
            r0 = 36319510470335969(0x81086700001de1, double:3.03194289614598E-306)
            boolean r0 = X.C18U.A06(r4, r9, r0)
            if (r0 == 0) goto L5a
            r2.A1d = r3
            r2.A1h = r5
            r0 = 2131955928(0x7f1310d8, float:1.9548397E38)
            java.lang.String r0 = r7.getString(r0)
            r2.A0o = r0
        L5a:
            r0 = 36319510470467043(0x81086700021de3, double:3.031942896228872E-306)
            boolean r0 = X.C18U.A06(r4, r9, r0)
            if (r0 == 0) goto L67
            r2.A1m = r3
        L67:
            r0 = 36319510470532580(0x81086700031de4, double:3.0319428962703176E-306)
            boolean r0 = X.C18U.A06(r4, r9, r0)
            if (r0 == 0) goto L74
            r2.A1d = r3
        L74:
            com.instagram.clips.intf.ClipsViewerConfig r0 = r2.A00()
            X.AbstractC86593tX.A0X(r7, r0, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AHT.A00(androidx.fragment.app.FragmentActivity, X.5dP, com.instagram.common.session.UserSession, java.lang.String, java.lang.String, int):void");
    }

    public static final void A01(UserSession userSession, C1830289x c1830289x, InteractiveDrawableContainer interactiveDrawableContainer) {
        boolean A1R = AbstractC167007dF.A1R(0, interactiveDrawableContainer, c1830289x);
        Integer num = C05F.A01;
        Rect rect = new Rect(0, 0, 0, 0);
        Iterator it = interactiveDrawableContainer.getAllDrawables().iterator();
        while (it.hasNext()) {
            Drawable A0Z = AbstractC166987dD.A0Z(it);
            if (A0Z instanceof C202638xh) {
                rect = A0Z.copyBounds();
            }
        }
        C8FC c8fc = new C8FC((C8D0) new C221619qQ(rect), (C8FD) null, (C89G) null, num, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 0, false, false, false, false, false, false, false, A1R, A1R, A1R, A1R, A1R, false, false);
        C148286ly A00 = C148286ly.A00(new SimpleImageUrl("https://static.xx.fbcdn.net/assets/?set=ig_reels_celebrations&name=sparkle-gif&density=1"), "gif_sticker_celebration_sparkle", "gif_sticker_celebration_sparkle", -1.0f, -1.0f, 1.0f);
        C148276lx c148276lx = C148276lx.A0a;
        C148276lx A05 = AbstractC148296lz.A05(A00, "gif_sticker_celebration_sparkle");
        Context context = interactiveDrawableContainer.getContext();
        if (userSession != null) {
            C194808jg A01 = C194808jg.A01(context, userSession, A05);
            c1830289x.A01(new C23780Afr(A01, interactiveDrawableContainer, 5));
            interactiveDrawableContainer.A0J(A01, c8fc, false, false, false);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A02(UserSession userSession, InteractiveDrawableContainer interactiveDrawableContainer, String str) {
        AbstractC167007dF.A1D(interactiveDrawableContainer, 0, userSession);
        if (str != null) {
            C8FC c8fc = new C8FC((C8D0) new C183748Cz(0.5f, 0.11f), (C8FD) null, (C89G) null, C05F.A01, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 0, false, false, true, true, false, false, false, true, true, true, true, true, false, false);
            Spannable spannable = C6RB.A0d;
            Context A0L = AbstractC166997dE.A0L(interactiveDrawableContainer);
            C9PX c9px = new C9PX(A0L, userSession, 960);
            c9px.A0M(str);
            c9px.A0A(96.0f);
            AbstractC167017dG.A0z(A0L, c9px);
            interactiveDrawableContainer.A0J(c9px, c8fc, false, false, false);
        }
    }
}
