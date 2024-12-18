package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.3tJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC86463tJ {
    public final UserSession A00;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005e, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r7, 36320244913873107L) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d2, code lost:
    
        if (((int) X.C18U.A01(r7, r8, 36601719888417101L)) == 1) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C206199Bc A01(android.content.Context r25, X.C38321qM r26, X.C38321qM r27, X.InterfaceC60442pS r28, X.C75113Zb r29) {
        /*
            r24 = this;
            r4 = 0
            r15 = r25
            X.C14360o3.A0B(r15, r4)
            r0 = 1
            r11 = r26
            X.C14360o3.A0B(r11, r0)
            r5 = 2
            r2 = r27
            X.C14360o3.A0B(r2, r5)
            r0 = 3
            r10 = r29
            X.C14360o3.A0B(r10, r0)
            r0 = 4
            r13 = r28
            X.C14360o3.A0B(r13, r0)
            X.2qK r19 = X.AbstractC60952qJ.A00(r13)
            r9 = r24
            r7 = r9
            boolean r3 = r9 instanceof X.C86453tI
            if (r3 == 0) goto L99
            X.3tI r7 = (X.C86453tI) r7
            boolean r0 = r2.A5u()
            r22 = 1
            if (r0 == 0) goto Ld5
            X.1rF r0 = r2.A0C
            com.instagram.user.model.User r0 = r0.CDj()
            if (r0 == 0) goto Ld5
            java.lang.String r1 = X.AbstractC76433bn.A00(r0)
            if (r1 == 0) goto Ld5
            X.0cb r0 = X.C17060sy.A01
            com.instagram.common.session.UserSession r7 = r7.A00
            com.instagram.user.model.User r0 = r0.A01(r7)
            java.lang.String r0 = r0.getId()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto Ld5
            X.0Tz r6 = X.C06090Tz.A05
            r0 = 36320244913873107(0x810912003f20d3, double:3.032407361196233E-306)
            boolean r0 = X.C18U.A06(r6, r7, r0)
            if (r0 == 0) goto Ld5
        L60:
            com.instagram.common.session.UserSession r1 = r9.A00
            X.2kS r0 = X.C57532kS.A00(r1)
            boolean r23 = r0.A0N(r2)
            X.3go r14 = X.C79413go.A00
            if (r3 == 0) goto L96
            X.3YE r21 = X.C3YE.A0B
        L70:
            r20 = r10
            r18 = r2
            r17 = r11
            r16 = r1
            X.3t9 r20 = r14.A00(r15, r16, r17, r18, r19, r20, r21)
            X.9FX r6 = new X.9FX
            r8 = r15
            r10 = r13
            r11 = r2
            r7 = r5
            r6.<init>(r7, r8, r9, r10, r11)
            r1 = 13
            X.9BH r0 = new X.9BH
            r0.<init>(r6, r1)
            X.9Bc r18 = new X.9Bc
            r21 = r4
            r19 = r0
            r18.<init>(r19, r20, r21, r22, r23)
            return r18
        L96:
            X.3YE r21 = X.C3YE.A0D
            goto L70
        L99:
            X.424 r7 = (X.AnonymousClass424) r7
            r6 = 1
            boolean r0 = r11.A6P()
            r22 = 1
            if (r0 == 0) goto Ld5
            boolean r0 = r2.A5u()
            if (r0 != 0) goto Ld5
            java.lang.String r1 = r2.getId()
            if (r1 == 0) goto Ld5
            java.lang.String r0 = "open_carousel_prompt"
            boolean r0 = X.AbstractC002300n.A0f(r1, r0, r4)
            if (r0 != 0) goto Ld5
            com.instagram.common.session.UserSession r8 = r7.A00
            X.0Tz r7 = X.C06090Tz.A05
            r0 = 36601719890383190(0x820912003c1156, double:3.210413269749966E-306)
            long r0 = X.C18U.A01(r7, r8, r0)
            int r12 = (int) r0
            if (r12 == 0) goto Ld5
            r0 = 36601719888417101(0x820912001e114d, double:3.210413268506603E-306)
            long r0 = X.C18U.A01(r7, r8, r0)
            int r7 = (int) r0
            if (r7 != r6) goto Ld5
            goto L60
        Ld5:
            r22 = 0
            goto L60
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC86463tJ.A01(android.content.Context, X.1qM, X.1qM, X.2pS, X.3Zb):X.9Bc");
    }

    public static final void A00(Context context, AbstractC86463tJ abstractC86463tJ, C38321qM c38321qM, C3YD c3yd) {
        C3YE c3ye;
        int i;
        String str;
        Integer num;
        if (abstractC86463tJ instanceof C86453tI) {
            c3ye = C3YE.A0B;
        } else {
            c3ye = C3YE.A0D;
        }
        boolean z = false;
        boolean z2 = false;
        if (c3ye == C3YE.A0B) {
            z2 = true;
        }
        UserSession userSession = abstractC86463tJ.A00;
        boolean A0N = C57532kS.A00(userSession).A0N(c38321qM);
        if (c38321qM.A0w() == 0 || (c38321qM.A0w() == 1 && A0N)) {
            z = true;
        }
        if (!z2 && z) {
            if (!A0N) {
                num = C05F.A01;
            } else {
                num = C05F.A0C;
            }
            c3yd.A0G(num);
        }
        C14360o3.A0B(context, 1);
        if (A0N) {
            i = AbstractC53242c7.A0H(context, R.attr.feedLikeActiveColor);
        } else {
            i = R.color.igds_icon_on_color;
        }
        int color = context.getColor(i);
        C3YD.A07(c3yd);
        C80593io c80593io = c3yd.A06;
        if (c80593io != null) {
            c80593io.A02.setColorFilter(color);
        }
        boolean A0N2 = C57532kS.A00(userSession).A0N(c38321qM);
        int i2 = R.drawable.instagram_heart_pano_outline_24;
        if (A0N2) {
            i2 = R.drawable.instagram_heart_pano_filled_24;
        }
        Drawable drawable = context.getDrawable(i2);
        if (drawable != null) {
            c3yd.A0F(drawable);
        }
        if (!z2 && c38321qM.A0w() > 0) {
            str = String.valueOf(c38321qM.A0w());
        } else {
            str = "";
        }
        c3yd.A0H(str);
    }

    public AbstractC86463tJ(UserSession userSession) {
        this.A00 = userSession;
    }
}
