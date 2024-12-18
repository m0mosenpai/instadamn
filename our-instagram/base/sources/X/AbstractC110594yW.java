package X;

import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.text.TitleTextView;
import com.instagram.ui.widget.textview.ImageWithTitleTextView;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.follow.FollowButtonBase;

/* renamed from: X.4yW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC110594yW {
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (X.AbstractC100604fP.A02(r3) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C110974z9 r1, X.C19260xA r2, com.instagram.common.session.UserSession r3, X.C38321qM r4, com.instagram.search.common.analytics.SearchContext r5, X.EnumC77553df r6, X.InterfaceC77503da r7, X.InterfaceC77483dY r8, X.InterfaceC77543de r9, X.InterfaceC77523dc r10, X.EnumC77563dg r11, X.ViewOnAttachStateChangeListenerC110564yT r12, java.lang.Long r13, java.lang.String r14, java.lang.String r15, boolean r16, boolean r17, boolean r18, boolean r19) {
        /*
            r12.A0H = r14
            r12.A0C = r11
            r12.A04 = r4
            r12.A03 = r2
            r12.A07 = r5
            r12.A08(r8)
            r12.A08 = r7
            r12.A0B = r10
            r12.A0A = r9
            r12.A02 = r1
            r2 = 1
            if (r16 == 0) goto L1f
            boolean r1 = X.AbstractC100604fP.A02(r3)
            r0 = 1
            if (r1 != 0) goto L20
        L1f:
            r0 = 0
        L20:
            r12.A0P = r0
            r0 = r17
            r12.A0M = r0
            r0 = r18
            r12.A0O = r0
            r0 = r19
            r12.A0N = r0
            X.3df r0 = X.EnumC77553df.A09
            if (r6 != r0) goto L3f
            boolean r0 = X.AbstractC100604fP.A02(r3)
            if (r0 == 0) goto L3f
        L38:
            r12.A0Q = r2
            r12.A0F = r13
            r12.A0G = r15
            return
        L3f:
            r2 = 0
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC110594yW.A00(X.4z9, X.0xA, com.instagram.common.session.UserSession, X.1qM, com.instagram.search.common.analytics.SearchContext, X.3df, X.3da, X.3dY, X.3de, X.3dc, X.3dg, X.4yT, java.lang.Long, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean):void");
    }

    public static final void A01(UserSession userSession, EnumC77553df enumC77553df, FollowButton followButton, Integer num, float f, float f2, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        EnumC77553df enumC77553df2;
        int i3;
        if (z5) {
            C14360o3.A0B(followButton, 0);
            followButton.setTextAppearance(R.style.igds_emphasized_body_1);
        }
        ((FollowButtonBase) followButton).A05 = z6;
        followButton.A0C = z3;
        if (enumC77553df == null) {
            enumC77553df2 = EnumC77553df.A0C;
        } else {
            enumC77553df2 = enumC77553df;
        }
        followButton.setBaseStyle(enumC77553df2);
        followButton.setTransformationMethod(null);
        followButton.setDisableImmersivePadding(z2);
        if (enumC77553df == EnumC77553df.A09 && AbstractC100604fP.A02(userSession)) {
            ((ImageWithTitleTextView) followButton).A02 = true;
            followButton.A00 = true;
        }
        followButton.setId(R.id.inline_follow_button);
        if (z4) {
            followButton.A04(AbstractC53242c7.A0H(followButton.getContext(), R.attr.igds_color_stroke), false);
        } else if (z) {
            followButton.A02();
        } else if (((FollowButtonBase) followButton).A02 != null && !followButton.A07()) {
            ((FollowButtonBase) followButton).A02 = null;
        }
        if (num != null) {
            i3 = num.intValue();
        } else {
            i3 = R.color.design_dark_default_color_on_background;
        }
        followButton.setCustomForegroundColor(i3);
        ((TitleTextView) followButton).A00 = f;
        ((TitleTextView) followButton).A02 = i;
        ((TitleTextView) followButton).A01 = f2;
        ((TitleTextView) followButton).A03 = i2;
    }
}
