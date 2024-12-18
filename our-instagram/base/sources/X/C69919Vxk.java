package X;

import com.instagram.business.promote.model.PromoteEnrollCouponInfo;
import com.instagram.model.coupon.PromoteAdsCouponUseCase;
import com.instagram.model.coupon.PromoteCouponType;
import java.io.IOException;

/* renamed from: X.Vxk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69919Vxk {
    /* JADX WARN: Type inference failed for: r0v2, types: [com.instagram.business.promote.model.PromoteEnrollCouponInfo, X.1um, X.1ul] */
    public static PromoteEnrollCouponInfo parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("coupon_offer_id".equals(A0s)) {
                    c40791um.A06 = AbstractC167017dG.A0m(c16l);
                } else if ("coupon_status".equals(A0s)) {
                    PromoteEnrollCouponInfo.PromoteEnrollCouponStatus valueOf = PromoteEnrollCouponInfo.PromoteEnrollCouponStatus.valueOf(c16l.A1Q());
                    C14360o3.A0B(valueOf, 0);
                    c40791um.A00 = valueOf;
                } else if ("formatted_value".equals(A0s)) {
                    c40791um.A0A = AbstractC167017dG.A0m(c16l);
                } else if ("expiry_date".equals(A0s)) {
                    c40791um.A09 = AbstractC167017dG.A0m(c16l);
                } else if ("product".equals(A0s)) {
                    c40791um.A0B = AbstractC167017dG.A0m(c16l);
                } else if ("enroll_error_reason".equals(A0s)) {
                    c40791um.A08 = AbstractC167017dG.A0m(c16l);
                } else if ("display_error_reason".equals(A0s)) {
                    c40791um.A07 = AbstractC167017dG.A0m(c16l);
                } else if ("sxgy_spend_since_enroll".equals(A0s)) {
                    c40791um.A04 = VVW.parseFromJson(c16l);
                } else if ("sxgy_spend_requirement".equals(A0s)) {
                    c40791um.A03 = VVW.parseFromJson(c16l);
                } else if ("promotion_type".equals(A0s)) {
                    c40791um.A05 = PromoteCouponType.valueOf(c16l.A1Q());
                } else if ("coupon_balance".equals(A0s)) {
                    c40791um.A02 = VVW.parseFromJson(c16l);
                } else if ("coupon_use_case".equals(A0s)) {
                    c40791um.A01 = PromoteAdsCouponUseCase.valueOf(c16l.A1Q());
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
