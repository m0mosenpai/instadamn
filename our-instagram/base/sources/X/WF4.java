package X;

import com.facebook.common.locale.Country;
import com.facebookpay.form.model.AddressFormFieldsConfig;
import com.facebookpay.form.model.CardFormFieldConfig;
import com.facebookpay.form.model.FormCountry;
import com.facebookpay.form.model.FormField;
import com.google.common.collect.ImmutableList;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class WF4 {
    public static final AddressFormFieldsConfig A00(UXS uxs) {
        C14360o3.A0B(uxs, 0);
        Country A00 = Country.A00(Country.A00(null, "US"), uxs.getOptionalStringField(0, "default_country"));
        C14360o3.A07(A00);
        ImmutableList requiredCompactedTreeListField = uxs.getRequiredCompactedTreeListField(1, "country_to_fields", UXR.class, -1715326638);
        ArrayList A10 = AbstractC31174DnI.A10(requiredCompactedTreeListField);
        Iterator<E> it = requiredCompactedTreeListField.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C2JS c2js = (C2JS) next;
            String optionalStringField = c2js.getOptionalStringField(0, "country_code");
            if (optionalStringField != null && optionalStringField.length() != 0 && !AbstractC002300n.A0e(c2js.getOptionalStringField(0, "country_code"), GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT)) {
                A10.add(next);
            }
        }
        ArrayList A0q = AbstractC167017dG.A0q(A10);
        Iterator it2 = A10.iterator();
        while (it2.hasNext()) {
            C2JS c2js2 = (C2JS) it2.next();
            Country A002 = Country.A00(Country.A00(null, "US"), c2js2.getOptionalStringField(0, "country_code"));
            C14360o3.A07(A002);
            ImmutableList requiredCompactedTreeListField2 = c2js2.getRequiredCompactedTreeListField(1, "form_fields", C58953QRp.class, 1073342581);
            ArrayList A102 = AbstractC31174DnI.A10(requiredCompactedTreeListField2);
            Iterator<E> it3 = requiredCompactedTreeListField2.iterator();
            while (it3.hasNext()) {
                C67524UnO c67524UnO = (C67524UnO) ((C2JS) it3.next()).reinterpretRequired(0, C67524UnO.class, 2121596196);
                C14360o3.A07(c67524UnO);
                if (c67524UnO.A0B("field_id") != null && c67524UnO.getOptionalStringField(0, "label") != null && c67524UnO.A08("placeholder") != null) {
                    String A0B = c67524UnO.A0B("field_id");
                    if (A0B != null) {
                        String optionalStringField2 = c67524UnO.getOptionalStringField(0, "label");
                        if (optionalStringField2 != null) {
                            String A08 = c67524UnO.A08("placeholder");
                            if (A08 != null) {
                                String A0A = c67524UnO.A0A("error_message");
                                boolean coercedBooleanField = c67524UnO.getCoercedBooleanField(6, "is_optional");
                                ImmutableList A0E = c67524UnO.A0E();
                                C14360o3.A07(A0E);
                                boolean coercedBooleanField2 = c67524UnO.getCoercedBooleanField(6, "is_optional");
                                String A0B2 = c67524UnO.A0B("field_id");
                                if (A0B2 != null) {
                                    A102.add(new FormField(A03((EnumC68168VEm) c67524UnO.getOptionalEnumField(8, "value_type", EnumC68168VEm.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)), A0B, optionalStringField2, A08, A0A, A04(A0B2, c67524UnO.A0A("error_message"), A0E, coercedBooleanField2, C14360o3.A0K(c2js2.getOptionalStringField(0, "country_code"), "US"), C14360o3.A0K(c67524UnO.A0B("field_id"), IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE)), coercedBooleanField));
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
            }
            A0q.add(new FormCountry(A002, A102));
        }
        return new AddressFormFieldsConfig(A00, A0q);
    }

    public static final CardFormFieldConfig A01(List list) {
        ArrayList A12 = AbstractC166997dE.A12(list, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C67524UnO c67524UnO = (C67524UnO) ((C2JS) it.next()).reinterpretRequired(0, C67524UnO.class, 2121596196);
            C14360o3.A07(c67524UnO);
            if (c67524UnO.A0B("field_id") != null && c67524UnO.getOptionalStringField(0, "label") != null && c67524UnO.A08("placeholder") != null) {
                String A0B = c67524UnO.A0B("field_id");
                if (A0B != null) {
                    String optionalStringField = c67524UnO.getOptionalStringField(0, "label");
                    if (optionalStringField != null) {
                        String A08 = c67524UnO.A08("placeholder");
                        if (A08 != null) {
                            String A0A = c67524UnO.A0A("error_message");
                            boolean coercedBooleanField = c67524UnO.getCoercedBooleanField(6, "is_optional");
                            ImmutableList A0E = c67524UnO.A0E();
                            C14360o3.A07(A0E);
                            boolean coercedBooleanField2 = c67524UnO.getCoercedBooleanField(6, "is_optional");
                            String A0B2 = c67524UnO.A0B("field_id");
                            if (A0B2 != null) {
                                A12.add(new FormField(A03((EnumC68168VEm) c67524UnO.getOptionalEnumField(8, "value_type", EnumC68168VEm.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)), A0B, optionalStringField, A08, A0A, A04(A0B2, c67524UnO.A0A("error_message"), A0E, coercedBooleanField2, false, C14360o3.A0K(c67524UnO.A0B("field_id"), IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE)), coercedBooleanField));
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
        }
        return new CardFormFieldConfig(A12);
    }

    public static final FormCountry A02(String str, List list) {
        Object obj;
        C14360o3.A0B(list, 1);
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (C14360o3.A0K(((FormCountry) obj).A00.A00.getCountry(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (FormCountry) obj;
    }

    public static final Integer A03(EnumC68168VEm enumC68168VEm) {
        if (enumC68168VEm != null) {
            switch (enumC68168VEm.ordinal()) {
                case 1:
                    return C05F.A00;
                case 2:
                    return C05F.A01;
                case 3:
                    return C05F.A0C;
                case 5:
                    return C05F.A0Y;
            }
        }
        return C05F.A0N;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0113, code lost:
    
        if (r0 == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x016e, code lost:
    
        if (r0 != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (r8.length() == 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList A04(java.lang.String r7, java.lang.String r8, java.util.List r9, boolean r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WF4.A04(java.lang.String, java.lang.String, java.util.List, boolean, boolean, boolean):java.util.ArrayList");
    }
}
