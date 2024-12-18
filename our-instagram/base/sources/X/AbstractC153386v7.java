package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.imagebutton.IgImageButton;
import com.instagram.user.model.User;
import java.util.Arrays;

/* renamed from: X.6v7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC153386v7 {
    public static final int A00(UserSession userSession, C38321qM c38321qM) {
        Boolean bool;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c38321qM, 1);
        User A2E = c38321qM.A2E(userSession);
        String id = c38321qM.getId();
        EnumC40111tc BRp = c38321qM.BRp();
        Integer Bdm = c38321qM.A0C.Bdm();
        if (A2E != null) {
            bool = Boolean.valueOf(c38321qM.A6o(A2E.getId()));
        } else {
            bool = null;
        }
        return Arrays.hashCode(new Object[]{id, BRp, Bdm, bool, c38321qM.A20()});
    }

    public static final void A03(View.OnClickListener onClickListener, View.OnTouchListener onTouchListener, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, IgImageButton igImageButton, float f, int i, int i2, boolean z, boolean z2) {
        A02(onClickListener, onTouchListener, interfaceC11380iw, userSession, c38321qM, null, null, igImageButton, null, null, f, i, i2, 0, z, z2, false, false, false);
    }

    public static final void A04(IgImageButton igImageButton) {
        C14360o3.A0B(igImageButton, 0);
        igImageButton.setVisibility(4);
        igImageButton.setContentDescription(null);
        igImageButton.setOnClickListener(null);
        igImageButton.setOnTouchListener(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00ac A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:34:0x000e, B:3:0x0011, B:6:0x003b, B:8:0x0049, B:10:0x004f, B:11:0x0055, B:13:0x0065, B:15:0x006d, B:18:0x0098, B:20:0x00ac, B:24:0x00b6, B:26:0x00a6, B:28:0x0074, B:30:0x0080, B:32:0x008a), top: B:33:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(android.view.View.OnClickListener r11, android.view.View.OnTouchListener r12, X.InterfaceC11380iw r13, com.instagram.common.session.UserSession r14, final com.instagram.common.ui.widget.imageview.IgImageView r15, X.C38321qM r16, final X.C53Q r17, X.InterfaceC152866uG r18, float r19, final int r20, final int r21, int r22, boolean r23, boolean r24, final boolean r25) {
        /*
            r5 = r16
            r10 = 0
            java.lang.String r0 = "MediaGridItemViewBinder.bindMediaView"
            X.0lu r2 = X.AbstractC13090lv.A00(r0)
            r4 = r15
            r0 = r18
            if (r18 == 0) goto L11
            r0.EDr(r15, r5)     // Catch: java.lang.Throwable -> Lc1
        L11:
            r7 = r20
            r8 = r21
            X.AbstractC79753hQ.A05(r15, r14, r5, r7, r8)     // Catch: java.lang.Throwable -> Lc1
            X.6vE r3 = new X.6vE     // Catch: java.lang.Throwable -> Lc1
            r6 = r17
            r9 = r25
            r3.<init>()     // Catch: java.lang.Throwable -> Lc1
            r15.A0E = r3     // Catch: java.lang.Throwable -> Lc1
            r0 = 0
            r15.setColorFilter(r0)     // Catch: java.lang.Throwable -> Lc1
            r15.A0I = r0     // Catch: java.lang.Throwable -> Lc1
            r1 = 0
            r15.setVisibility(r10)     // Catch: java.lang.Throwable -> Lc1
            r0 = 255(0xff, float:3.57E-43)
            r15.setImageAlpha(r0)     // Catch: java.lang.Throwable -> Lc1
            r15.setOnTouchListener(r12)     // Catch: java.lang.Throwable -> Lc1
            X.C0fQ.A00(r11, r15)     // Catch: java.lang.Throwable -> Lc1
            if (r11 == 0) goto L3b
            r1 = 1
        L3b:
            r15.setClickable(r1)     // Catch: java.lang.Throwable -> Lc1
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch: java.lang.Throwable -> Lc1
            r15.setScaleType(r0)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r0 = r5.BU6()     // Catch: java.lang.Throwable -> Lc1
            if (r0 == 0) goto L55
            int r0 = r0.length()     // Catch: java.lang.Throwable -> Lc1
            if (r0 == 0) goto L55
            java.lang.String r0 = r5.BU6()     // Catch: java.lang.Throwable -> Lc1
            r15.A0K = r0     // Catch: java.lang.Throwable -> Lc1
        L55:
            r0 = r19
            r15.A00 = r0     // Catch: java.lang.Throwable -> Lc1
            X.1rF r0 = r5.A0C     // Catch: java.lang.Throwable -> Lc1
            X.DmI r1 = r0.BfC()     // Catch: java.lang.Throwable -> Lc1
            boolean r0 = r5.A5M()     // Catch: java.lang.Throwable -> Lc1
            if (r0 == 0) goto L72
            r3 = r22
            X.1qM r0 = r5.A1e(r3)     // Catch: java.lang.Throwable -> Lc1
            if (r0 == 0) goto L72
            X.1qM r5 = r5.A1e(r3)     // Catch: java.lang.Throwable -> Lc1
            goto L94
        L72:
            if (r1 == 0) goto L94
            java.util.List r0 = r1.Bfu()     // Catch: java.lang.Throwable -> Lc1
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> Lc1
            r0 = r0 ^ 1
            if (r0 == 0) goto L94
            java.util.List r0 = r1.Bfu()     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object r0 = r0.get(r10)     // Catch: java.lang.Throwable -> Lc1
            if (r0 == 0) goto L94
            java.util.List r0 = r1.Bfu()     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object r5 = r0.get(r10)     // Catch: java.lang.Throwable -> Lc1
            X.1qM r5 = (X.C38321qM) r5     // Catch: java.lang.Throwable -> Lc1
        L94:
            if (r24 == 0) goto La4
            if (r5 == 0) goto Lb6
            android.content.Context r0 = r15.getContext()     // Catch: java.lang.Throwable -> Lc1
            X.C14360o3.A07(r0)     // Catch: java.lang.Throwable -> Lc1
            com.instagram.model.mediasize.ExtendedImageUrl r8 = r5.A1q(r0)     // Catch: java.lang.Throwable -> Lc1
            goto Laa
        La4:
            if (r5 == 0) goto Lb6
            com.instagram.common.typedurl.ImageUrl r8 = r5.A1S()     // Catch: java.lang.Throwable -> Lc1
        Laa:
            if (r8 == 0) goto Lb6
            X.1WW r12 = X.C1WW.A03     // Catch: java.lang.Throwable -> Lc1
            r9 = r13
            r11 = r23
            r7 = r15
            r7.setUrl(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> Lc1
            goto Lbd
        Lb6:
            java.lang.String r1 = "MediaGridItemViewBinder"
            java.lang.String r0 = "tried to bind a media grid item with a null image url"
            X.C0w9.A03(r1, r0)     // Catch: java.lang.Throwable -> Lc1
        Lbd:
            r2.close()
            return
        Lc1:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> Lc3
        Lc3:
            r0 = move-exception
            X.C20I.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC153386v7.A01(android.view.View$OnClickListener, android.view.View$OnTouchListener, X.0iw, com.instagram.common.session.UserSession, com.instagram.common.ui.widget.imageview.IgImageView, X.1qM, X.53Q, X.6uG, float, int, int, int, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(android.view.View.OnClickListener r16, android.view.View.OnTouchListener r17, X.InterfaceC11380iw r18, com.instagram.common.session.UserSession r19, X.C38321qM r20, X.C53Q r21, X.InterfaceC152866uG r22, com.instagram.igds.components.imagebutton.IgImageButton r23, java.lang.String r24, java.lang.String r25, float r26, int r27, int r28, int r29, boolean r30, boolean r31, boolean r32, boolean r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC153386v7.A02(android.view.View$OnClickListener, android.view.View$OnTouchListener, X.0iw, com.instagram.common.session.UserSession, X.1qM, X.53Q, X.6uG, com.instagram.igds.components.imagebutton.IgImageButton, java.lang.String, java.lang.String, float, int, int, int, boolean, boolean, boolean, boolean, boolean):void");
    }
}
