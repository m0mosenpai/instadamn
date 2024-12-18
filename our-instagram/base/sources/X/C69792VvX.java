package X;

import com.instagram.business.promote.model.PromoteEnrollCouponInfo;
import com.instagram.common.session.UserSession;
import com.instagram.model.coupon.PromoteAdsCouponUseCase;
import com.instagram.model.coupon.PromoteCouponCurrencyAmount;
import com.instagram.model.coupon.PromoteCouponType;

/* renamed from: X.VvX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69792VvX {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public Integer A03;
    public final C69095Vhl A04;
    public final PromoteEnrollCouponInfo.PromoteEnrollCouponStatus A05;
    public final UserSession A06;
    public final PromoteAdsCouponUseCase A07;
    public final PromoteCouponCurrencyAmount A08;
    public final PromoteCouponCurrencyAmount A09;
    public final PromoteCouponCurrencyAmount A0A;
    public final PromoteCouponType A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;

    public C69792VvX(C69095Vhl c69095Vhl, PromoteEnrollCouponInfo.PromoteEnrollCouponStatus promoteEnrollCouponStatus, UserSession userSession, PromoteAdsCouponUseCase promoteAdsCouponUseCase, PromoteCouponCurrencyAmount promoteCouponCurrencyAmount, PromoteCouponCurrencyAmount promoteCouponCurrencyAmount2, PromoteCouponCurrencyAmount promoteCouponCurrencyAmount3, PromoteCouponType promoteCouponType, String str, String str2, String str3) {
        C14360o3.A0B(userSession, 1);
        this.A06 = userSession;
        this.A05 = promoteEnrollCouponStatus;
        this.A0B = promoteCouponType;
        this.A0D = str;
        this.A0C = str2;
        this.A0A = promoteCouponCurrencyAmount;
        this.A09 = promoteCouponCurrencyAmount2;
        this.A0E = str3;
        this.A08 = promoteCouponCurrencyAmount3;
        this.A07 = promoteAdsCouponUseCase;
        this.A04 = c69095Vhl;
    }

    public final double A00() {
        int i;
        int i2;
        PromoteCouponCurrencyAmount promoteCouponCurrencyAmount = this.A0A;
        if (promoteCouponCurrencyAmount != null) {
            i = promoteCouponCurrencyAmount.A00;
        } else {
            i = 0;
        }
        PromoteCouponCurrencyAmount promoteCouponCurrencyAmount2 = this.A09;
        if (promoteCouponCurrencyAmount2 != null) {
            i2 = promoteCouponCurrencyAmount2.A00;
        } else {
            i2 = 0;
        }
        return (i * 100.0d) / i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002a, code lost:
    
        if (r0.A00 > 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
    
        r5 = X.C05F.A0u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007a, code lost:
    
        if (r0.A00 > 0) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer A01() {
        /*
            r9 = this;
            java.lang.Integer r5 = r9.A03
            if (r5 != 0) goto L30
            com.instagram.model.coupon.PromoteCouponType r0 = r9.A0B
            if (r0 == 0) goto La9
            int r1 = r0.ordinal()
            r8 = 1
            if (r1 == r8) goto L41
            r0 = 0
            if (r1 != r0) goto La9
            com.instagram.business.promote.model.PromoteEnrollCouponInfo$PromoteEnrollCouponStatus r0 = r9.A05
            int r2 = r0.ordinal()
            r1 = 1
            r0 = 3
            if (r2 == r0) goto L3e
            if (r2 == r8) goto L3b
            r0 = 2
            if (r2 == r0) goto L31
            r0 = 7
            if (r2 != r0) goto La9
            com.instagram.model.coupon.PromoteCouponCurrencyAmount r0 = r9.A08
            if (r0 == 0) goto La9
            int r0 = r0.A00
            if (r0 <= 0) goto La9
        L2c:
            java.lang.Integer r5 = X.C05F.A0u
        L2e:
            r9.A03 = r5
        L30:
            return r5
        L31:
            com.instagram.model.coupon.PromoteCouponCurrencyAmount r0 = r9.A08
            if (r0 == 0) goto L36
            r1 = 0
        L36:
            r9.A02 = r1
            java.lang.Integer r5 = X.C05F.A0u
            goto L2e
        L3b:
            java.lang.Integer r5 = X.C05F.A01
            goto L2e
        L3e:
            java.lang.Integer r5 = X.C05F.A00
            goto L2e
        L41:
            java.lang.Integer r5 = X.C05F.A15
            double r6 = r9.A00()
            com.instagram.common.session.UserSession r0 = r9.A06
            X.1Ai r4 = X.AbstractC23021Ah.A00(r0)
            com.instagram.business.promote.model.PromoteEnrollCouponInfo$PromoteEnrollCouponStatus r0 = r9.A05
            int r1 = r0.ordinal()
            r0 = 3
            if (r1 == r0) goto La3
            if (r1 == r8) goto L9d
            r0 = 2
            if (r1 == r0) goto L7d
            r0 = 7
            if (r1 == r0) goto L62
            r4.A0K()
            goto L2e
        L62:
            X.0ry r3 = r4.A53
            X.0YR[] r2 = X.C23031Ai.A8c
            r1 = 261(0x105, float:3.66E-43)
            boolean r0 = X.AbstractC167017dG.A1b(r4, r3, r2, r1)
            if (r0 != 0) goto L74
            X.AbstractC167007dF.A1L(r4, r3, r2, r1, r8)
            java.lang.Integer r5 = X.C05F.A0j
            goto L2e
        L74:
            com.instagram.model.coupon.PromoteCouponCurrencyAmount r0 = r9.A08
            if (r0 == 0) goto L2e
            int r0 = r0.A00
            if (r0 <= 0) goto L2e
            goto L2c
        L7d:
            r4.A0K()
            double r3 = java.lang.Math.abs(r6)
            r1 = 2
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L8d
            java.lang.Integer r5 = X.C05F.A0C
            goto L2e
        L8d:
            r1 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L96
            java.lang.Integer r5 = X.C05F.A0N
            goto L2e
        L96:
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L2e
            java.lang.Integer r5 = X.C05F.A0Y
            goto L2e
        L9d:
            r4.A0K()
            java.lang.Integer r5 = X.C05F.A01
            goto L2e
        La3:
            r4.A0K()
            java.lang.Integer r5 = X.C05F.A00
            goto L2e
        La9:
            java.lang.Integer r5 = X.C05F.A15
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69792VvX.A01():java.lang.Integer");
    }

    public final String A02() {
        String str;
        if (this.A02 && (str = this.A0D) != null) {
            return str;
        }
        PromoteCouponCurrencyAmount promoteCouponCurrencyAmount = this.A08;
        if (promoteCouponCurrencyAmount != null) {
            return promoteCouponCurrencyAmount.A00();
        }
        return "";
    }

    public final String A03() {
        PromoteCouponCurrencyAmount promoteCouponCurrencyAmount = this.A09;
        if (promoteCouponCurrencyAmount != null) {
            return promoteCouponCurrencyAmount.A00();
        }
        return "";
    }
}
