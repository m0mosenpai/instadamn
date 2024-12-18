package X;

import android.content.Context;
import android.util.SparseArray;
import com.facebook.common.locale.Country;
import com.facebook.common.locale.LocaleMember;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebookpay.cardptt.CardPttPayload;
import com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.facebookpay.otc.models.OtcInput;
import com.google.common.collect.ImmutableList;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.List;

/* renamed from: X.Sgm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63287Sgm {
    /* JADX WARN: Type inference failed for: r18v1, types: [java.util.Map, java.lang.String] */
    public final C62748SOx A03(Context context, SparseArray sparseArray, OtcInput otcInput, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String A00;
        C2JO c2jo;
        String A01;
        C16920sk A0E;
        C63346Si2 A002;
        C63152Se0 c63152Se0;
        CardPttPayload cardPttPayload;
        java.util.Set set;
        String str8;
        String str9;
        String str10;
        java.util.Set set2;
        C63152Se0 c63152Se02;
        String str11;
        String str12;
        String A003 = AbstractC62187S1i.A00(sparseArray, 12);
        if (A003.length() != 0 && otcInput == null) {
            str2 = "UPDATE";
        } else {
            str2 = "CREATE";
        }
        String A02 = A02(sparseArray);
        Object obj = sparseArray.get(39);
        BaseCheckoutItem baseCheckoutItem = null;
        Object obj2 = null;
        if (obj instanceof EnumC61219RhJ) {
            obj2 = obj;
        }
        Object obj3 = sparseArray.get(15);
        if (obj3 instanceof String) {
            str3 = (String) obj3;
        } else {
            str3 = null;
        }
        if (str3 == null) {
            str3 = "";
        }
        if (obj2 == EnumC61219RhJ.A0B) {
            str4 = "••••";
        } else {
            str4 = "•••";
        }
        if (str3.equals(str4)) {
            str3 = "";
        }
        int A0A = AbstractC167007dF.A0A(A02);
        if (A0A < 6) {
            str5 = "";
        } else {
            str5 = AbstractC25227BEk.A0w(A02, 0, 6);
        }
        if (A0A < 4) {
            str6 = "";
        } else {
            str6 = AbstractC43592JPx.A0z(A02, A0A - 4);
        }
        Object obj4 = sparseArray.get(14);
        if ((obj4 instanceof String) && (str7 = (String) obj4) != null) {
            String A0H = AbstractC001900j.A0H(AbstractC25227BEk.A0w(str7, 0, 2), 2);
            String A0R = AnonymousClass001.A0R("20", AbstractC001900j.A0H(AbstractC43592JPx.A0z(str7, 2), 2));
            Object obj5 = sparseArray.get(33);
            if (obj5 instanceof BaseCheckoutItem) {
                baseCheckoutItem = (BaseCheckoutItem) obj5;
            }
            boolean z = baseCheckoutItem instanceof SelectionShippingAddressItem;
            if (z) {
                A00 = ((SelectionShippingAddressItem) baseCheckoutItem).A03;
                if (A00 == null) {
                    A00 = "";
                }
            } else {
                A00 = AbstractC62187S1i.A00(sparseArray, 2);
            }
            if (z) {
                c2jo = new C2JO();
                SelectionShippingAddressItem selectionShippingAddressItem = (SelectionShippingAddressItem) baseCheckoutItem;
                c2jo.A09(selectionShippingAddressItem.A0E, "street1");
                c2jo.A09(selectionShippingAddressItem.A0F, "street2");
                c2jo.A09(selectionShippingAddressItem.A07, ServerW3CShippingAddressConstants.CITY);
                c2jo.A09(selectionShippingAddressItem.A0D, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
                c2jo.A09(selectionShippingAddressItem.A0C, ServerW3CShippingAddressConstants.POSTAL_CODE);
                A01 = selectionShippingAddressItem.A08;
            } else {
                c2jo = new C2JO();
                c2jo.A09(AbstractC62187S1i.A00(sparseArray, 5), "street1");
                c2jo.A09(AbstractC62187S1i.A00(sparseArray, 6), "street2");
                c2jo.A09(AbstractC62187S1i.A00(sparseArray, 7), ServerW3CShippingAddressConstants.CITY);
                c2jo.A09(AbstractC62187S1i.A00(sparseArray, 8), IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
                c2jo.A09(AbstractC62187S1i.A00(sparseArray, 9), ServerW3CShippingAddressConstants.POSTAL_CODE);
                A01 = A01(sparseArray);
            }
            c2jo.A09(A01, "country_code");
            C2JO c2jo2 = new C2JO();
            C04060Jx c04060Jx = GraphQlCallInput.A02;
            String str13 = "$e2ee";
            AbstractC31173DnH.A1M(AbstractC25227BEk.A0T(c04060Jx, "$e2ee", "sensitive_string_value"), c2jo2, "credit_card_number");
            if (str3 == "") {
                str13 = str3;
            }
            AbstractC31173DnH.A1M(AbstractC25227BEk.A0T(c04060Jx, str13, "sensitive_string_value"), c2jo2, "csc");
            AbstractC31173DnH.A1M(AbstractC25227BEk.A0T(c04060Jx, str5, "sensitive_string_value"), c2jo2, "credit_card_first_6");
            AbstractC31173DnH.A1M(AbstractC25227BEk.A0T(c04060Jx, str6, "sensitive_string_value"), c2jo2, "credit_card_last_4");
            c2jo2.A09(A0H, "expiry_month");
            c2jo2.A09(A0R, "expiry_year");
            c2jo2.A09(A00, "cardholder_name");
            c2jo2.A06(c2jo, "billing_address");
            c2jo2.A09("", "risk_features");
            if (str2.equals("CREATE")) {
                A0E = AbstractC06930Yk.A0E();
                C14360o3.A0B(A0H, 5);
                C14360o3.A0B(A0R, 6);
                C14360o3.A0B(A0E, 9);
                List A1Q = AbstractC16960so.A1Q("CHARGE", "SEND_MONEY", "CREATE_CONTAINER");
                try {
                    c63152Se02 = C63174SeZ.A00().A06("PAN", A1Q);
                    c63152Se0 = c63152Se02;
                } catch (Exception e) {
                    C0K8.A0F("DefaultAuthTicketManager", "create AT Safe", e);
                    c63152Se02 = null;
                    c63152Se0 = null;
                }
                SYL syl = new SYL(context, MSW.A0Q(context));
                C14360o3.A07(syl);
                A002 = C63174SeZ.A00();
                String A012 = syl.A01();
                String packageName = context.getPackageName();
                C14360o3.A07(packageName);
                if (c63152Se02 != null) {
                    str11 = c63152Se02.A07;
                    str12 = c63152Se02.A03;
                } else {
                    str11 = null;
                    str12 = null;
                }
                String str14 = A00;
                cardPttPayload = new CardPttPayload(A012, packageName, str14, null, str14, str3, A0H, A0R, str11, null, str12, A1Q);
                if (c63152Se02 != null) {
                    set = AbstractC58322PtE.A0x(c63152Se02);
                    if (otcInput != null) {
                        str8 = otcInput.A00;
                        str9 = otcInput.A01;
                    } else {
                        str8 = null;
                        str9 = null;
                    }
                    str10 = "ADD_CARD";
                } else {
                    throw AbstractC166997dE.A0g();
                }
            } else if (str2.equals("UPDATE")) {
                A0E = AbstractC06930Yk.A0E();
                AbstractC167007dF.A1H(A0H, 6, A0R);
                C14360o3.A0B(A0E, 10);
                A002 = C63174SeZ.A00();
                String A004 = SYL.A00(context);
                String packageName2 = context.getPackageName();
                C14360o3.A07(packageName2);
                c63152Se0 = null;
                String str15 = A00;
                cardPttPayload = new CardPttPayload(A004, packageName2, str15, null, str15, str3, A0H, A0R, null, A003, null, null);
                set = C16910sj.A00;
                if (otcInput != null) {
                    str8 = otcInput.A00;
                    str9 = otcInput.A01;
                } else {
                    str8 = null;
                    str9 = null;
                }
                str10 = "EDIT_CARD";
            } else {
                throw AbstractC167007dF.A0c("MutationType is not yet supported + ", str2);
            }
            C64192T3b c64192T3b = new C64192T3b(A002, 1);
            if (set == null) {
                set2 = C16910sj.A00;
            } else {
                set2 = set;
            }
            T3Z A005 = AbstractC63063Sbk.A00(c64192T3b, set2);
            if (set == null) {
                set = C16910sj.A00;
            }
            ?? r18 = A0E;
            SXG sxg = new SXG(A005, cardPttPayload, str10, r18, str8, str9, str, r18, r18, set);
            C14360o3.A0B(sxg, 2);
            return new C62748SOx(c2jo2, c63152Se0, sxg);
        }
        throw AbstractC166997dE.A0g();
    }

    public static final String A01(SparseArray sparseArray) {
        boolean z = sparseArray.get(10) instanceof Country;
        Object obj = sparseArray.get(10);
        if (z) {
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.facebook.common.locale.Country");
            String country = ((LocaleMember) obj).A00.getCountry();
            C14360o3.A0A(country);
            return country;
        }
        AbstractC25225BEi.A1S(obj);
        return (String) obj;
    }

    public static final String A02(SparseArray sparseArray) {
        String obj = sparseArray.get(13).toString();
        if (obj != null) {
            return AbstractC002300n.A0d(obj, "\\s+", "", false);
        }
        throw AbstractC166997dE.A0g();
    }

    public static final QSA A00(R0L r0l) {
        R0H A0E;
        R1N A0E2;
        R0N A0E3;
        QRL A0E4;
        ImmutableList requiredCompactedTreeListField;
        C2JS c2js;
        R1X A0E5 = r0l.A0E();
        if (A0E5 != null && (A0E = A0E5.A0E()) != null && (A0E2 = A0E.A0E()) != null && (A0E3 = A0E2.A0E()) != null && (A0E4 = A0E3.A0E()) != null && (requiredCompactedTreeListField = A0E4.getRequiredCompactedTreeListField(16, "authentication_tickets_with_ptt_kid_filtering", QRI.class, -1717013832)) != null && (c2js = (C2JS) AbstractC001800i.A0J(requiredCompactedTreeListField)) != null) {
            return (QSA) c2js.A01(QSA.class, -1563793709);
        }
        return null;
    }
}
