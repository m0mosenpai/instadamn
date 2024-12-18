package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.List;

/* renamed from: X.CCl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27515CCl {
    public static final C26083BgC A00(C45126Jxv c45126Jxv, C84 c84, C59836Qoy c59836Qoy, String str, String str2, List list, List list2, List list3, List list4, boolean z, boolean z2) {
        String str3;
        C26069Bfx c26069Bfx;
        List list5 = list3;
        C14360o3.A0B(str, 1);
        String optionalStringField = c59836Qoy.getOptionalStringField(0, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        String str4 = "";
        if (optionalStringField == null) {
            optionalStringField = "";
        }
        String optionalStringField2 = c59836Qoy.getOptionalStringField(1, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        if (optionalStringField2 == null) {
            optionalStringField2 = "";
        }
        String A09 = c59836Qoy.A09(DevServerEntity.COLUMN_DESCRIPTION);
        if (A09 == null) {
            A09 = "";
        }
        String optionalStringField3 = c59836Qoy.getOptionalStringField(7, "image_prompt");
        if (optionalStringField3 == null) {
            optionalStringField3 = "";
        }
        String A0A = c59836Qoy.A0A("profile_image_url");
        SimpleImageUrl simpleImageUrl = null;
        if (A0A != null) {
            simpleImageUrl = AbstractC25225BEi.A0t(A0A);
        }
        ImmutableList requiredCompactedEnumListField = c59836Qoy.getRequiredCompactedEnumListField(8, AbstractC58317Pt9.A00(873), EnumC27414C7r.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        C14360o3.A07(requiredCompactedEnumListField);
        Object A0J = AbstractC001800i.A0J(requiredCompactedEnumListField);
        if (A0J == null || (str3 = A0J.toString()) == null) {
            str3 = "";
        }
        String A0C = c59836Qoy.A0C("tagline");
        if (A0C == null) {
            A0C = "";
        }
        String optionalStringField4 = c59836Qoy.getOptionalStringField(6, "welcome_message");
        if (optionalStringField4 != null) {
            str4 = optionalStringField4;
        }
        ImmutableList requiredCompactedStringListField = c59836Qoy.getRequiredCompactedStringListField(9, "facts");
        C14360o3.A07(requiredCompactedStringListField);
        C01L A1I = C0eM.A1I();
        String optionalStringField5 = c59836Qoy.getOptionalStringField(10, AbstractC58317Pt9.A00(270));
        if (optionalStringField5 != null) {
            A1I.add(new C50679MYx(optionalStringField5, c59836Qoy.getOptionalStringField(13, AbstractC58317Pt9.A00(267)), 6));
        }
        String optionalStringField6 = c59836Qoy.getOptionalStringField(11, AbstractC58317Pt9.A00(271));
        if (optionalStringField6 != null) {
            A1I.add(new C50679MYx(optionalStringField6, c59836Qoy.getOptionalStringField(14, AbstractC58317Pt9.A00(268)), 6));
        }
        String optionalStringField7 = c59836Qoy.getOptionalStringField(12, AbstractC58317Pt9.A00(272));
        if (optionalStringField7 != null) {
            A1I.add(new C50679MYx(optionalStringField7, c59836Qoy.getOptionalStringField(15, AbstractC58317Pt9.A00(269)), 6));
        }
        C01L A1J = C0eM.A1J(A1I);
        if (list3 == null) {
            list5 = C16930sl.A00;
        }
        C2JS optionalTreeField = c59836Qoy.getOptionalTreeField(17, AbstractC58317Pt9.A00(1000), C59835Qox.class, 1463689552);
        if (optionalTreeField == null) {
            c26069Bfx = null;
        } else {
            C1LC it = optionalTreeField.getRequiredCompactedTreeListField(0, AbstractC58317Pt9.A00(1001), C67132Uh2.class, 1092303242).iterator();
            C14360o3.A07(it);
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            while (it.hasNext()) {
                C2JS A0l = AbstractC25225BEi.A0l(it);
                EnumC27413C7q enumC27413C7q = (EnumC27413C7q) A0l.getOptionalEnumField(1, AbstractC111324zv.A00(3912), EnumC27413C7q.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                if (enumC27413C7q != null) {
                    int ordinal = enumC27413C7q.ordinal();
                    if (ordinal != 3) {
                        if (ordinal == 1) {
                            str6 = A0l.getOptionalStringField(0, "thread_theme_id");
                            str8 = A0l.A09(AbstractC111324zv.A00(747));
                        }
                    } else {
                        str5 = A0l.getOptionalStringField(0, "thread_theme_id");
                        str7 = A0l.A09(AbstractC111324zv.A00(747));
                    }
                }
            }
            if (str5 != null && str6 != null && str7 != null && str8 != null) {
                c26069Bfx = new C26069Bfx(str5, str7, str6, str8, 3);
            } else {
                c26069Bfx = null;
            }
        }
        return new C26083BgC(c45126Jxv, c26069Bfx, simpleImageUrl, c84, str, optionalStringField, optionalStringField2, A09, optionalStringField3, null, str3, A0C, str4, str2, A1J, requiredCompactedStringListField, C16930sl.A00, list, list2, list5, list4, false, z, z2);
    }
}
