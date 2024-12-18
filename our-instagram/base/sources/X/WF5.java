package X;

import com.facebookpay.expresscheckout.models.PromoCodeList;
import com.facebookpay.incentives.model.ECPIncentive;
import com.facebookpay.incentives.model.ECPOffsiteOffer;
import com.facebookpay.incentives.model.ECPOnsiteOffer;
import com.facebookpay.incentives.model.IncentiveCredentialList;
import com.facebookpay.incentives.model.IncentiveList;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class WF5 {
    public static final List A01(C2GT c2gt) {
        C2JS c2js;
        C2JS optionalTreeField;
        ImmutableList requiredCompactedTreeListField;
        C14360o3.A0B(c2gt, 0);
        C63406Sjd c63406Sjd = (C63406Sjd) c2gt.A02();
        if (c63406Sjd != null && (c2js = (C2JS) c63406Sjd.A01) != null && (optionalTreeField = c2js.getOptionalTreeField(0, "all_eligible_incentives", C66696UYg.class, -2132818263)) != null && (requiredCompactedTreeListField = optionalTreeField.getRequiredCompactedTreeListField(0, "incentives", C67525UnP.class, 935491380)) != null) {
            return requiredCompactedTreeListField;
        }
        return C16930sl.A00;
    }

    public static final List A02(C2GT c2gt) {
        IncentiveList incentiveList;
        C14360o3.A0B(c2gt, 0);
        C63406Sjd c63406Sjd = (C63406Sjd) c2gt.A02();
        if (c63406Sjd != null && (incentiveList = (IncentiveList) c63406Sjd.A01) != null) {
            return incentiveList.A00;
        }
        return C16930sl.A00;
    }

    public static final List A03(C2GS c2gs) {
        C69074VhP c69074VhP;
        IncentiveCredentialList incentiveCredentialList;
        C14360o3.A0B(c2gs, 0);
        C63406Sjd c63406Sjd = (C63406Sjd) c2gs.A02();
        if (c63406Sjd != null && (c69074VhP = (C69074VhP) c63406Sjd.A01) != null && (incentiveCredentialList = (IncentiveCredentialList) c69074VhP.A01) != null) {
            return incentiveCredentialList.A00;
        }
        return null;
    }

    public static final List A04(C2GS c2gs) {
        C69074VhP c69074VhP;
        PromoCodeList promoCodeList;
        C14360o3.A0B(c2gs, 0);
        C63406Sjd c63406Sjd = (C63406Sjd) c2gs.A02();
        if (c63406Sjd != null && (c69074VhP = (C69074VhP) c63406Sjd.A01) != null && (promoCodeList = (PromoCodeList) c69074VhP.A01) != null) {
            return promoCodeList.A00;
        }
        return null;
    }

    public static final XCD A00(ECPIncentive eCPIncentive) {
        XCD xcd;
        if (eCPIncentive instanceof ECPOnsiteOffer) {
            xcd = Wam.A00;
        } else if (eCPIncentive instanceof ECPOffsiteOffer) {
            xcd = Wal.A00;
        } else {
            throw new IllegalArgumentException("Processor not implemented yet for this incentive type");
        }
        return xcd;
    }
}
