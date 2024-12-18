package com.instagram.showreelnative.ui.common;

import X.AbstractC115825Lw;
import X.C138956Rc;
import X.C14360o3;
import X.C64X;
import X.C64Z;
import X.C6PT;
import X.C9C9;
import X.InterfaceC139376Ss;
import X.InterfaceC58682mR;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.instagram.common.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class ShowreelNativeMediaView extends AbstractC115825Lw {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShowreelNativeMediaView(Context context) {
        this(context, null, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 62, 0 == true ? 1 : 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShowreelNativeMediaView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 60, 0 == true ? 1 : 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShowreelNativeMediaView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 56, 0 == true ? 1 : 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShowreelNativeMediaView(Context context, AttributeSet attributeSet, int i, C9C9 c9c9, C64Z c64z) {
        this(context, attributeSet, i, c9c9, c64z, null);
        C14360o3.A0B(context, 1);
        C14360o3.A0B(c9c9, 4);
    }

    public static /* synthetic */ void setShowreelAnimation$default(ShowreelNativeMediaView showreelNativeMediaView, C6PT c6pt, UserSession userSession, String str, C138956Rc c138956Rc, boolean z, int i, Object obj) {
        boolean z2 = z;
        if ((i & 16) != 0) {
            z2 = false;
        }
        showreelNativeMediaView.A07(c6pt, userSession, c138956Rc, str, z2);
    }

    public final void A06(InterfaceC139376Ss interfaceC139376Ss, C6PT c6pt, UserSession userSession, String str, boolean z) {
        C14360o3.A0B(c6pt, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(str, 2);
        C14360o3.A0B(interfaceC139376Ss, 3);
        A07(c6pt, userSession, new C138956Rc(interfaceC139376Ss, 0, 0, 1, 0), str, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r13, 36313222638733133L) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A07(X.C6PT r12, com.instagram.common.session.UserSession r13, X.C138956Rc r14, java.lang.String r15, boolean r16) {
        /*
            r11 = this;
            r0 = 0
            r3 = r12
            X.C14360o3.A0B(r12, r0)
            r0 = 1
            X.C14360o3.A0B(r13, r0)
            r0 = 2
            r5 = r15
            X.C14360o3.A0B(r15, r0)
            r0 = 3
            r4 = r14
            X.C14360o3.A0B(r14, r0)
            if (r16 == 0) goto L23
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36313222638733133(0x8102af0008074d, double:3.027966446121281E-306)
            boolean r0 = X.C18U.A06(r2, r13, r0)
            r1 = 1
            if (r0 != 0) goto L24
        L23:
            r1 = 0
        L24:
            X.1vD r0 = X.C41051vD.A01
            r0.A00 = r13
            X.0sl r6 = X.C16930sl.A00
            r7 = 0
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r1)
            r2 = r11
            r9 = r7
            r10 = r7
            r2.setShowreelAnimation(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.showreelnative.ui.common.ShowreelNativeMediaView.A07(X.6PT, com.instagram.common.session.UserSession, X.6Rc, java.lang.String, boolean):void");
    }

    public final void setScaleType(ImageView.ScaleType scaleType) {
        C14360o3.A0B(scaleType, 0);
        this.A0J.setScaleType(scaleType);
    }

    public final void setShowreelAnimation(C6PT c6pt, UserSession userSession, String str, InterfaceC139376Ss interfaceC139376Ss) {
        C14360o3.A0B(c6pt, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(str, 2);
        C14360o3.A0B(interfaceC139376Ss, 3);
        A06(interfaceC139376Ss, c6pt, userSession, str, false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShowreelNativeMediaView(Context context, C9C9 c9c9, C64Z c64z, C64X c64x) {
        this(context, null, 0, c9c9, c64z, c64x);
        C14360o3.A0B(context, 1);
        C14360o3.A0B(c9c9, 2);
    }

    public static /* synthetic */ void setShowreelAnimation$default(ShowreelNativeMediaView showreelNativeMediaView, C6PT c6pt, UserSession userSession, String str, InterfaceC139376Ss interfaceC139376Ss, boolean z, int i, Object obj) {
        boolean z2 = z;
        if ((i & 16) != 0) {
            z2 = false;
        }
        showreelNativeMediaView.A06(interfaceC139376Ss, c6pt, userSession, str, z2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShowreelNativeMediaView(Context context, AttributeSet attributeSet, int i, C9C9 c9c9) {
        this(context, attributeSet, i, c9c9, null, null);
        C14360o3.A0B(context, 1);
        C14360o3.A0B(c9c9, 4);
    }

    public /* synthetic */ ShowreelNativeMediaView(Context context, AttributeSet attributeSet, int i, C9C9 c9c9, C64Z c64z, C64X c64x, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? new C9C9("sn_integration_feed", "IG_FEED", 0) : c9c9, (i2 & 16) != 0 ? null : c64z, (i2 & 32) == 0 ? c64x : null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShowreelNativeMediaView(Context context, AttributeSet attributeSet, int i, C9C9 c9c9, C64Z c64z, C64X c64x) {
        super(context, attributeSet, c9c9, c64x, c64z, context.getMainExecutor(), i);
        C14360o3.A0B(context, 1);
        C14360o3.A0B(c9c9, 4);
        ((AbstractC115825Lw) this).A00 = Integer.MAX_VALUE;
        InterfaceC58682mR keyframesAnimatable = this.A0J.getKeyframesAnimatable();
        if (keyframesAnimatable != null) {
            keyframesAnimatable.EH0(Integer.MAX_VALUE);
        }
    }
}
