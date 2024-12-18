package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.incentives.model.ECPIncentive;
import com.facebookpay.incentives.model.ECPOffsiteOffer;
import com.facebookpay.incentives.model.ECPOnsiteOffer;

/* loaded from: classes11.dex */
public abstract class VNK {
    public static final ECPIncentive A00(C66695UYf c66695UYf) {
        int ordinal;
        C2JS A01;
        String A07;
        C2JS A012;
        String A08;
        ECPIncentive eCPOnsiteOffer;
        C2JS A013;
        VFP vfp = VFP.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
        VFP vfp2 = (VFP) c66695UYf.getOptionalEnumField(1, "incentive_type", vfp);
        if (vfp2 == null) {
            ordinal = -1;
        } else {
            ordinal = vfp2.ordinal();
        }
        CurrencyAmount currencyAmount = null;
        if (ordinal != 4 && ordinal != 7) {
            if (ordinal != 3 && ordinal != 6) {
                return null;
            }
            String A0D = c66695UYf.A0D("promo_code");
            if (A0D != null) {
                String A0B = c66695UYf.A0B(DialogModule.KEY_TITLE);
                if (A0B != null) {
                    String A072 = c66695UYf.A07("incentive_id");
                    String A0C = c66695UYf.A0C("subtitle");
                    VFP vfp3 = (VFP) c66695UYf.getOptionalEnumField(1, "incentive_type", vfp);
                    if (vfp3 != null) {
                        boolean coercedBooleanField = c66695UYf.getCoercedBooleanField(3, "is_best_offer");
                        String optionalStringField = c66695UYf.getOptionalStringField(6, "expiration_date_text");
                        C2JS optionalTreeField = c66695UYf.getOptionalTreeField(7, "discount_amount", C66694UYe.class, -748553028);
                        if (optionalTreeField != null && (A013 = optionalTreeField.A01(UX0.class, 98567921)) != null) {
                            String A073 = A013.A07("currency");
                            if (A073 != null) {
                                String A082 = A013.A08("amount");
                                if (A082 != null) {
                                    currencyAmount = new CurrencyAmount(A073, A082);
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                        eCPOnsiteOffer = new ECPOffsiteOffer(currencyAmount, vfp3, A0D, A0B, A072, A0C, optionalStringField, coercedBooleanField);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            String A074 = c66695UYf.A07("incentive_id");
            if (A074 != null) {
                String A0B2 = c66695UYf.A0B(DialogModule.KEY_TITLE);
                if (A0B2 != null) {
                    String A0C2 = c66695UYf.A0C("subtitle");
                    VFP vfp4 = (VFP) c66695UYf.getOptionalEnumField(1, "incentive_type", vfp);
                    if (vfp4 != null) {
                        boolean coercedBooleanField2 = c66695UYf.getCoercedBooleanField(3, "is_best_offer");
                        String A09 = c66695UYf.A09("incentive_credential_id");
                        if (A09 != null) {
                            String optionalStringField2 = c66695UYf.getOptionalStringField(6, "expiration_date_text");
                            if (optionalStringField2 != null) {
                                C2JS optionalTreeField2 = c66695UYf.getOptionalTreeField(7, "discount_amount", C66694UYe.class, -748553028);
                                if (optionalTreeField2 != null && (A01 = optionalTreeField2.A01(UX0.class, 98567921)) != null && (A07 = A01.A07("currency")) != null) {
                                    C2JS optionalTreeField3 = c66695UYf.getOptionalTreeField(7, "discount_amount", C66694UYe.class, -748553028);
                                    if (optionalTreeField3 != null && (A012 = optionalTreeField3.A01(UX0.class, 98567921)) != null && (A08 = A012.A08("amount")) != null) {
                                        eCPOnsiteOffer = new ECPOnsiteOffer(new CurrencyAmount(A07, A08), vfp4, A074, A0B2, A0C2, A09, optionalStringField2, coercedBooleanField2);
                                    } else {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return eCPOnsiteOffer;
    }
}
