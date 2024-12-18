package X;

import android.content.Context;
import android.util.Base64;
import com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem;
import com.facebookpay.paymentmethod.model.APMCredential;
import com.facebookpay.paymentmethod.model.CreditCard;
import com.facebookpay.paymentmethod.model.PayPalCredential;
import com.facebookpay.paymentmethod.model.PaymentMethod;
import com.facebookpay.paymentmethod.model.TokenizedCard;
import com.google.common.collect.ImmutableList;
import java.security.KeyPair;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;

/* renamed from: X.Sft, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63239Sft {
    public static final void A02(Context context, UFM ufm, UFS ufs) {
        String str;
        KeyPair keyPair;
        Cipher cipher;
        if (ufs.A0B() && (str = (String) ufs.A07.A00("OTC_CREDIT_CARD_NUMBER")) != null && str.length() != 0) {
            C63264SgO.A01(context);
            if (C63264SgO.A01 != null && (keyPair = C63264SgO.A00) != null && (cipher = C63264SgO.A02) != null) {
                cipher.init(2, keyPair.getPrivate());
                byte[] decode = Base64.decode(str, 0);
                Cipher cipher2 = C63264SgO.A02;
                if (cipher2 == null) {
                    C14360o3.A0F("cipher");
                    throw C00O.createAndThrow();
                }
                byte[] doFinal = cipher2.doFinal(decode);
                C14360o3.A0A(doFinal);
                str = AbstractC58318PtA.A0m(C15W.A05, doFinal);
            } else {
                C0K8.A0C("CryptographyUtil", "isCryptographyInitialized is false");
            }
            AbstractC129435t5 A01 = ufm.A01(13);
            if (A01 instanceof UvO) {
                AbstractC129435t5 A0I = ((AbstractC129455t8) A01).A0I(13);
                if (A0I instanceof UvY) {
                    ((UvM) A0I).A0M(str);
                }
            }
        }
    }

    public static final SelectionPaymentMethodItem A00(PaymentMethod paymentMethod, Integer num, boolean z, boolean z2) {
        VG3 vg3;
        VG3 vg32;
        String str;
        PaymentMethod paymentMethod2 = paymentMethod;
        if (paymentMethod2 instanceof CreditCard) {
            if (z) {
                vg32 = VG3.A07;
            } else {
                vg32 = VG3.A0h;
            }
            PaymentMethod paymentMethod3 = paymentMethod2;
            CreditCard creditCard = (CreditCard) paymentMethod3;
            String AtA = creditCard.AtA();
            String title = creditCard.getTitle();
            String subtitle = creditCard.getSubtitle();
            EnumC61212RhC A00 = creditCard.A00();
            String A0C = creditCard.A02.A0C("last_four_digits");
            if (A0C == null) {
                A0C = "";
            }
            String A02 = creditCard.A02();
            XJm xJm = creditCard.A00;
            EnumC61219RhJ A01 = creditCard.A01();
            String str2 = creditCard.A03;
            UWg uWg = creditCard.A01;
            EnumC72407Xcu AtB = creditCard.AtB();
            String BEy = creditCard.BEy();
            boolean A03 = creditCard.A03();
            boolean z3 = creditCard instanceof TokenizedCard;
            String str3 = null;
            if (!z3) {
                paymentMethod3 = null;
            }
            CreditCard creditCard2 = (CreditCard) paymentMethod3;
            if (creditCard2 != null) {
                str = ((TokenizedCard) creditCard2).A02;
            } else {
                str = null;
            }
            if (!z3) {
                paymentMethod2 = null;
            }
            CreditCard creditCard3 = (CreditCard) paymentMethod2;
            if (creditCard3 != null) {
                str3 = ((TokenizedCard) creditCard3).A03;
            }
            return new SelectionPaymentMethodItem(uWg, vg32, xJm, AtB, A00, A01, C05F.A0N, num, 3, AtA, title, subtitle, A0C, A02, str2, BEy, str, str3, true, A03, false, z2, false);
        }
        if (paymentMethod2 instanceof PayPalCredential) {
            if (z) {
                vg3 = VG3.A07;
            } else {
                vg3 = VG3.A0h;
            }
            PayPalCredential payPalCredential = (PayPalCredential) paymentMethod2;
            return new SelectionPaymentMethodItem(null, vg3, null, EnumC72407Xcu.A08, null, null, C05F.A0N, null, 7, payPalCredential.AtA(), payPalCredential.getTitle(), payPalCredential.getSubtitle(), null, null, null, payPalCredential.BEy(), null, null, true, false, false, z2, false);
        }
        if (paymentMethod2 instanceof APMCredential) {
            APMCredential aPMCredential = (APMCredential) paymentMethod2;
            return new SelectionPaymentMethodItem(null, VG3.A07, null, aPMCredential.A00, null, null, C05F.A0N, null, 3, aPMCredential.AtA(), aPMCredential.getTitle(), aPMCredential.getSubtitle(), null, null, null, aPMCredential.BEy(), null, null, true, false, false, z2, false);
        }
        throw AbstractC58318PtA.A0Y();
    }

    public static final ImmutableList A01(List list) {
        ImmutableList.Builder builder = ImmutableList.builder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            QVX A0E = ((R1R) it.next()).A0E();
            if (A0E != null) {
                C1LC A0I = AbstractC43592JPx.A0I(A0E.getRequiredCompactedTreeListField(2, "available_card_types_v2", QVW.class, 2089560051));
                while (A0I.hasNext()) {
                    builder.add((Object) C63156Se5.A01(String.valueOf(AbstractC25225BEi.A0l(A0I).A01(C58929QQr.class, -992342626).getOptionalEnumField(4, "card_type", EnumC39598He8.UNSET_OR_UNRECOGNIZED_ENUM_VALUE))));
                }
            }
        }
        ImmutableList build = builder.build();
        C14360o3.A07(build);
        return build;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r7.length() == 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(android.content.Context r8, X.UFM r9, X.UFS r10) {
        /*
            boolean r0 = r10.A0B()
            if (r0 == 0) goto L43
            r1 = 13
            X.5t5 r0 = r9.A01(r1)
            if (r0 == 0) goto L43
            android.util.SparseArray r0 = r0.A09()
            if (r0 == 0) goto L43
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r7 = r0.toString()
            if (r7 == 0) goto L25
            int r1 = r7.length()
            r0 = 0
            if (r1 != 0) goto L26
        L25:
            r0 = 1
        L26:
            java.lang.String r6 = "OTC_CREDIT_CARD_NUMBER"
            if (r0 == 0) goto L44
            X.6tQ r2 = r10.A07
            java.util.Map r0 = r2.A03
            r0.remove(r6)
            java.util.Map r0 = r2.A02
            java.lang.Object r1 = r0.remove(r6)
            X.Me3 r1 = (X.C50872Me3) r1
            if (r1 == 0) goto L3e
            r0 = 0
            r1.A00 = r0
        L3e:
            java.util.Map r0 = r2.A01
            r0.remove(r6)
        L43:
            return
        L44:
            X.6tQ r5 = r10.A07
            r4 = 0
            r3 = 1
            X.C14360o3.A0B(r7, r3)
            X.C63264SgO.A01(r8)
            java.security.KeyStore r0 = X.C63264SgO.A01
            if (r0 == 0) goto L6f
            java.security.KeyPair r0 = X.C63264SgO.A00
            if (r0 == 0) goto L6f
            javax.crypto.Cipher r1 = X.C63264SgO.A02
            if (r1 == 0) goto L6f
            java.lang.String r2 = "cipher"
            java.security.PublicKey r0 = r0.getPublic()
            r1.init(r3, r0)
            javax.crypto.Cipher r1 = X.C63264SgO.A02
            if (r1 != 0) goto L77
            X.C14360o3.A0F(r2)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L6f:
            java.lang.String r1 = "CryptographyUtil"
            java.lang.String r0 = "isCryptographyInitialized is false"
            X.C0K8.A0C(r1, r0)
            goto L86
        L77:
            byte[] r0 = X.MSY.A1a(r7)
            byte[] r0 = r1.doFinal(r0)
            java.lang.String r7 = android.util.Base64.encodeToString(r0, r4)
            X.C14360o3.A07(r7)
        L86:
            r5.A01(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63239Sft.A03(android.content.Context, X.UFM, X.UFS):void");
    }
}
