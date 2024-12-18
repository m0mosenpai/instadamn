package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.google.common.collect.ImmutableList;
import com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class VVH {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.Vfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v72, types: [com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHour, java.lang.Object, X.1um] */
    /* JADX WARN: Type inference failed for: r11v2, types: [com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [X.UzJ, X.1um] */
    /* JADX WARN: Type inference failed for: r13v3, types: [X.UzJ, X.1um] */
    public static final C67845UzJ A00(AnonymousClass436 anonymousClass436, String str) {
        C2JS optionalTreeField;
        LocationPageInfoPageOperationHourResponse locationPageInfoPageOperationHourResponse;
        C2JS c2js;
        boolean A1R = AbstractC167007dF.A1R(0, anonymousClass436, str);
        C2JS c2js2 = (C2JS) anonymousClass436.Bos();
        if (c2js2 != null && (optionalTreeField = c2js2.getOptionalTreeField(0, "xfb_one_link_logged_out_page_info_monoschema(input:$input)", C67032UfJ.class, 1476144464)) != null) {
            C2JS c2js3 = null;
            C2JS optionalTreeField2 = optionalTreeField.getOptionalTreeField(10, "hours", C67029UfG.class, 866919609);
            if (optionalTreeField2 != null) {
                c2js3 = optionalTreeField2.A04(C67028UfF.class, "schedule", 266670642);
            }
            ArrayList arrayList = new ArrayList();
            if (c2js3 != null) {
                int size = c2js3.getRequiredCompactedStringListField(0, "days_in_a_week").size();
                for (int i = 0; i < size; i++) {
                    E e = c2js3.getRequiredCompactedStringListField(0, "days_in_a_week").get(i);
                    C14360o3.A07(e);
                    ImmutableList requiredCompactedStringListField = c2js3.getRequiredCompactedStringListField(A1R ? 1 : 0, "hours_in_a_day");
                    ?? c40791um = new C40791um();
                    c40791um.A00 = (String) e;
                    c40791um.A01 = requiredCompactedStringListField;
                    arrayList.add(c40791um);
                }
            }
            if (optionalTreeField2 != null) {
                String A0B = optionalTreeField2.A0B(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS);
                if (A0B == null) {
                    A0B = "";
                }
                String optionalStringField = optionalTreeField2.getOptionalStringField(0, "current_status");
                if (optionalStringField == null) {
                    optionalStringField = "";
                }
                String optionalStringField2 = optionalTreeField2.getOptionalStringField(A1R ? 1 : 0, "hours_today");
                if (optionalStringField2 == null) {
                    optionalStringField2 = "";
                }
                Boolean A0o = AbstractC31174DnI.A0o(optionalTreeField2, "is_open", 3);
                ?? obj = new Object();
                obj.A03 = A0B;
                obj.A04 = arrayList;
                obj.A01 = optionalStringField;
                obj.A02 = optionalStringField2;
                obj.A00 = A0o;
                locationPageInfoPageOperationHourResponse = obj;
            } else {
                locationPageInfoPageOperationHourResponse = new Object();
            }
            C2JS optionalTreeField3 = optionalTreeField.getOptionalTreeField(16, "ig_business", C67030UfH.class, 923728526);
            if (optionalTreeField3 != null) {
                c2js = optionalTreeField3.getOptionalTreeField(0, "profile", QmD.class, 731783318);
            } else {
                c2js = null;
            }
            Parcelable.Creator creator = User.CREATOR;
            User user = new User(str, optionalTreeField.A0C("location_id"));
            if (c2js != null) {
                user = new User(c2js.getOptionalStringField(0, "pk"), c2js.getOptionalStringField(A1R ? 1 : 0, AbstractC31182DnR.A01()));
                user.A0q(c2js.A09("full_name"));
                user.A0r(c2js.A0B("profile_pic_url"));
                user.A1C(c2js.getCoercedBooleanField(5, "is_verified"));
                user.A03.EVF(AbstractC31174DnI.A0o(c2js, AbstractC58317Pt9.A00(796), 6));
                String optionalStringField3 = c2js.getOptionalStringField(7, AbstractC58317Pt9.A00(668));
                if (optionalStringField3 != null) {
                    user.A03.EPM(optionalStringField3);
                }
                String optionalStringField4 = c2js.getOptionalStringField(9, "category");
                if (optionalStringField4 != null) {
                    user.A03.ERH(optionalStringField4);
                }
                String optionalStringField5 = c2js.getOptionalStringField(11, "city_name");
                if (optionalStringField5 != null) {
                    user.A03.ERP(optionalStringField5);
                }
                user.A03.EQj(Boolean.valueOf(c2js.getCoercedBooleanField(13, AbstractC58317Pt9.A00(297))));
                String optionalStringField6 = c2js.getOptionalStringField(15, AbstractC58317Pt9.A00(932));
                if (optionalStringField6 != null) {
                    user.A03.Ebs(optionalStringField6);
                }
                String optionalStringField7 = c2js.getOptionalStringField(16, AbstractC58317Pt9.A00(347));
                if (optionalStringField7 != null) {
                    user.A03.Ebt(optionalStringField7);
                }
                String optionalStringField8 = c2js.getOptionalStringField(17, AbstractC58317Pt9.A00(348));
                if (optionalStringField8 != null) {
                    user.A03.Ebu(optionalStringField8);
                }
                String optionalStringField9 = c2js.getOptionalStringField(18, ServerW3CShippingAddressConstants.POSTAL_CODE);
                if (optionalStringField9 != null) {
                    user.A03.EhU(optionalStringField9);
                }
                user.A03.EQf(AbstractC31174DnI.A0o(c2js, AbstractC111324zv.A00(453), 19));
                user.A0l(EnumC222416a.A05);
                user.A03.Ee4(Boolean.valueOf(c2js.getCoercedBooleanField(22, AbstractC58317Pt9.A00(976))));
                user.A03.EeC(Boolean.valueOf(c2js.getCoercedBooleanField(23, AbstractC58317Pt9.A00(367))));
            }
            String optionalStringField10 = optionalTreeField.getOptionalStringField(0, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            if (optionalStringField10 == null) {
                optionalStringField10 = "";
            }
            String optionalStringField11 = optionalTreeField.getOptionalStringField(A1R ? 1 : 0, "phone");
            String A09 = optionalTreeField.A09("website");
            String A0A = optionalTreeField.A0A("category");
            String optionalStringField12 = optionalTreeField.getOptionalStringField(6, "location_address");
            if (optionalStringField12 == null) {
                optionalStringField12 = "";
            }
            String optionalStringField13 = optionalTreeField.getOptionalStringField(7, "location_city");
            Integer A0Z = AbstractC37304Gc5.A0Z(optionalTreeField, "location_region", 8);
            String optionalStringField14 = optionalTreeField.getOptionalStringField(9, "location_zip");
            if (optionalStringField14 == null) {
                optionalStringField14 = "";
            }
            boolean hasFieldValue = optionalTreeField.hasFieldValue("has_menu");
            optionalTreeField.getOptionalStringField(5, "location_id");
            Integer A0Z2 = AbstractC37304Gc5.A0Z(optionalTreeField, "num_guides", 13);
            ?? c40791um2 = new C40791um();
            c40791um2.A08 = optionalStringField10;
            c40791um2.A09 = optionalStringField11;
            c40791um2.A0A = A09;
            c40791um2.A06 = A0A;
            c40791um2.A05 = optionalStringField12;
            c40791um2.A07 = optionalStringField13;
            c40791um2.A04 = A0Z;
            c40791um2.A0B = optionalStringField14;
            ?? obj2 = new Object();
            c40791um2.A00 = obj2;
            obj2.A01 = user;
            c40791um2.A01 = locationPageInfoPageOperationHourResponse;
            c40791um2.A0C = hasFieldValue;
            c40791um2.A02 = A0Z2;
            return c40791um2;
        }
        return new C40791um();
    }
}
