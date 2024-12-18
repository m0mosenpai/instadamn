package X;

import android.content.Context;
import android.graphics.Rect;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import java.util.List;

/* loaded from: classes4.dex */
public final class ALu {
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006a, code lost:
    
        r6.setAlpha(0);
        X.AbstractC166997dE.A1R(r6, new X.C8FC((X.C8D0) r10, (X.C8FD) null, (X.C89G) null, r13, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Object) null, (java.lang.String) null, (java.util.List) null, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, 0, true, false, false, true, false, false, false, false, false, false, false, true, false, false), r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List A01(android.content.Context r39, com.instagram.common.session.UserSession r40, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r41, java.util.List r42) {
        /*
            r3 = 0
            r5 = r40
            r4 = r41
            X.AbstractC167017dG.A1R(r5, r4)
            r11 = 0
            java.lang.Integer r13 = X.C05F.A00
            java.util.ArrayList r2 = X.AbstractC167017dG.A0q(r42)
            java.util.Iterator r8 = r42.iterator()
        L13:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Lb2
            java.lang.Object r6 = r8.next()
            com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeNotifyToUsers r6 = (com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeNotifyToUsers) r6
            r0 = r4
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r0 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r0
            int r1 = r0.A06
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r1, r3, r3, r3)
            X.9qQ r10 = new X.9qQ
            r10.<init>(r0)
            com.instagram.user.model.User r0 = r6.A00
            java.lang.String r17 = ""
            r18 = 0
            X.9kL r14 = new X.9kL
            r15 = r11
            r19 = r3
            r16 = r0
            r14.<init>(r15, r16, r17, r18, r19)
            r0 = r39
            X.8jg r0 = X.AbstractC202818xz.A03(r0, r5, r14)
            r0.A08()
            java.lang.Iterable r0 = r0.A05()
            java.util.Iterator r7 = r0.iterator()
        L4f:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto La7
            android.graphics.drawable.Drawable r6 = X.AbstractC166987dD.A0Z(r7)
            boolean r0 = r6 instanceof X.C202328xC
            if (r0 == 0) goto L4f
            r0 = r6
            X.8xC r0 = (X.C202328xC) r0
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "sticker_color_customizable_transparent_background"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L4f
            r6.setAlpha(r3)
            r25 = 1
            r19 = -1082130432(0xffffffffbf800000, float:-1.0)
            X.8FC r9 = new X.8FC
            r12 = r11
            r14 = r11
            r16 = r11
            r17 = r11
            r18 = r11
            r20 = r19
            r21 = r19
            r22 = r19
            r23 = r19
            r24 = r3
            r26 = r3
            r27 = r3
            r28 = r25
            r29 = r3
            r30 = r3
            r31 = r3
            r32 = r3
            r33 = r3
            r34 = r3
            r35 = r3
            r36 = r25
            r37 = r3
            r38 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            X.AbstractC166997dE.A1R(r6, r9, r2)
            goto L13
        La7:
            r0 = 1
            java.lang.String r1 = X.MSV.A00(r0)
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
        Lb2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ALu.A01(android.content.Context, com.instagram.common.session.UserSession, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, java.util.List):java.util.List");
    }

    public static final C194808jg A00(Context context, Rect rect, UserSession userSession, C38321qM c38321qM) {
        C194808jg A00 = AbstractC23122AKg.A00(context, null, userSession, null, c38321qM, c38321qM, null, MSV.A00(35), rect.right - rect.left, rect.bottom - rect.top, 0, 0, true, false);
        A00.setAlpha(0);
        return A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b7, code lost:
    
        r7.setAlpha(r5 ? 1 : 0);
        X.AbstractC166997dE.A1R(r7, new X.C8FC((X.C8D0) r12, (X.C8FD) null, (X.C89G) null, r15, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Object) null, (java.lang.String) null, (java.util.List) null, -1.0f, -1.0f, r3, -1.0f, r2, r5 ? 1 : 0, true, r5, r5, true, r5, r5, r5, r5, r5, r5, r5, true, r5, r5), r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List A02(android.content.Context r41, com.instagram.common.session.UserSession r42, java.util.List r43, float r44) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ALu.A02(android.content.Context, com.instagram.common.session.UserSession, java.util.List, float):java.util.List");
    }

    public final List A03(Context context, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, EnumC46183KcL enumC46183KcL) {
        C38321qM c38321qM;
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(targetViewSizeProvider, 2);
        int ordinal = enumC46183KcL.ordinal();
        if (ordinal != 5) {
            if (ordinal == 4 && (c38321qM = AbstractC224059uo.A01) != null) {
                NineSixteenLayoutConfigImpl nineSixteenLayoutConfigImpl = (NineSixteenLayoutConfigImpl) targetViewSizeProvider;
                float f = nineSixteenLayoutConfigImpl.A06;
                float f2 = nineSixteenLayoutConfigImpl.A04;
                Rect A0V = AbstractC166987dD.A0V((int) (f * 0.093f), (int) (f2 * 0.43f), (int) (f * 0.95f), (int) (f2 * 1.0f));
                return AbstractC166987dD.A1J(AbstractC166987dD.A1L(A00(context, A0V, userSession, c38321qM), new C8FC((C8D0) new C221619qQ(A0V), (C8FD) null, (C89G) null, C05F.A00, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, 0, true, false, false, true, false, false, false, false, false, false, false, true, false, false)));
            }
        } else {
            C38321qM c38321qM2 = AbstractC224059uo.A00;
            if (c38321qM2 != null) {
                NineSixteenLayoutConfigImpl nineSixteenLayoutConfigImpl2 = (NineSixteenLayoutConfigImpl) targetViewSizeProvider;
                float f3 = nineSixteenLayoutConfigImpl2.A06;
                float f4 = nineSixteenLayoutConfigImpl2.A04;
                Rect A0V2 = AbstractC166987dD.A0V((int) (f3 * 0.146f), (int) (f4 * 0.2297f), (int) (f3 * 0.846f), (int) (f4 * 0.766f));
                return AbstractC166987dD.A1J(AbstractC166987dD.A1L(A00(context, A0V2, userSession, c38321qM2), new C8FC((C8D0) new C221619qQ(A0V2), (C8FD) null, (C89G) null, C05F.A00, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, 0, true, false, false, true, false, false, false, false, false, false, false, true, false, false)));
            }
        }
        return C16930sl.A00;
    }
}
