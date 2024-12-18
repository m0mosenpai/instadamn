package X;

import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;
import java.text.NumberFormat;
import java.util.Currency;

/* renamed from: X.Nqx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53807Nqx {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A03 = c6fw.A03(1);
        C14360o3.A0C(A03, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C102884kP c102884kP = (C102884kP) A03;
        String A0G = c102884kP.A0G();
        if (A0G != null) {
            String A0E = c102884kP.A0E();
            if (A0E != null) {
                int A032 = c102884kP.A03(38, Integer.MIN_VALUE);
                if (A032 != Integer.MIN_VALUE) {
                    String A0F = c102884kP.A0F();
                    if (A0F != null) {
                        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
                        C14360o3.A07(currencyInstance);
                        currencyInstance.setMaximumFractionDigits(0);
                        currencyInstance.setCurrency(Currency.getInstance(A0F));
                        String format = currencyInstance.format(Integer.valueOf(A032));
                        C14360o3.A07(format);
                        ExistingStandaloneFundraiserForFeedModel existingStandaloneFundraiserForFeedModel = new ExistingStandaloneFundraiserForFeedModel(A0G, A0E, format, null);
                        OBJ obj = new OBJ(C6BQ.A04(c6fq), AbstractC31172DnG.A0W(c6fq));
                        EnumC33447EqK enumC33447EqK = EnumC33447EqK.A0Y;
                        C69963Cf A00 = AbstractC69933Cc.A00(obj.A00, obj.A01, (InterfaceC69913Ca) obj.A02.getValue());
                        EnumC69983Ch enumC69983Ch = EnumC69983Ch.A02;
                        C43846JaA c43846JaA = new C43846JaA(enumC69983Ch);
                        c43846JaA.A07 = true;
                        c43846JaA.A0A = false;
                        A00.Emz(enumC33447EqK, new MediaCaptureConfig(c43846JaA), enumC69983Ch);
                        C6WI.A01().A0A = existingStandaloneFundraiserForFeedModel;
                        return null;
                    }
                    throw AbstractC166987dD.A12("Requires goal currency");
                }
                throw AbstractC166987dD.A12("Requires goal amount");
            }
            throw AbstractC166987dD.A12("Requires beneficiary short name");
        }
        throw AbstractC166987dD.A12("Requires fundraiser id");
    }
}
