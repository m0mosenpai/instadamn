package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.R;
import com.instagram.model.coupon.PromoteAdsCouponUseCase;
import com.instagram.model.coupon.PromoteCouponCurrencyAmount;
import com.instagram.model.coupon.PromoteCouponType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public abstract class BJG {
    public static final /* synthetic */ BJG[] A00;
    public static final BJG A01;
    public static final BJG A02;

    static {
        BJH bjh = new BJH();
        A01 = bjh;
        BJG bjg = new BJG() { // from class: X.BJI
        };
        A02 = bjg;
        A00 = new BJG[]{bjh, bjg};
    }

    public static BJG[] values() {
        return (BJG[]) A00.clone();
    }

    public final String A00(Context context, InterfaceC31038Dkc interfaceC31038Dkc) {
        int i;
        Resources resources;
        int i2;
        String str;
        int i3;
        if (this instanceof BJH) {
            C25290BHi c25290BHi = (C25290BHi) interfaceC31038Dkc;
            C45126Jxv c45126Jxv = c25290BHi.A02;
            if (c45126Jxv != null) {
                return c45126Jxv.A01;
            }
            C26086BgF c26086BgF = c25290BHi.A01;
            if (c26086BgF != null && c26086BgF.A03 != null && (str = c26086BgF.A04) != null) {
                Object obj = c26086BgF.A01;
                if (obj == PromoteCouponType.A04) {
                    PromoteCouponCurrencyAmount promoteCouponCurrencyAmount = (PromoteCouponCurrencyAmount) c26086BgF.A02;
                    promoteCouponCurrencyAmount.getClass();
                    return context.getString(2131970289, str, promoteCouponCurrencyAmount.A00());
                }
                PromoteCouponType promoteCouponType = PromoteCouponType.A03;
                if (obj == promoteCouponType && c26086BgF.A00 == PromoteAdsCouponUseCase.A02) {
                    i3 = 2131970470;
                } else if (obj == promoteCouponType && c26086BgF.A00 == PromoteAdsCouponUseCase.A06) {
                    i3 = 2131970467;
                }
                return AbstractC167007dF.A0f(context, str, i3);
            }
            Integer num = c25290BHi.A03;
            if (num != null && (i = num.intValue()) > 0) {
                resources = context.getResources();
                i2 = R.plurals.new_leads_count;
            } else {
                i = c25290BHi.A00;
                if (i == 0) {
                    return context.getString(2131971018);
                }
                resources = context.getResources();
                i2 = R.plurals.pending_promoted_posts;
            }
            return AbstractC167017dG.A0k(resources, i, i2);
        }
        return context.getString(2131969348);
    }

    public final String A01(Context context, InterfaceC31038Dkc interfaceC31038Dkc) {
        Resources resources;
        int i;
        C45126Jxv c45126Jxv;
        if (this instanceof BJH) {
            C25290BHi c25290BHi = (C25290BHi) interfaceC31038Dkc;
            if (c25290BHi != null && (c45126Jxv = c25290BHi.A02) != null) {
                return c45126Jxv.A02;
            }
            resources = context.getResources();
            i = 2131952482;
        } else {
            resources = context.getResources();
            i = 2131966860;
        }
        return resources.getString(i);
    }

    public BJG(String str, int i) {
    }
}
