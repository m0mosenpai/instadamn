package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.odin.model.Example;
import com.facebook.odin.model.ExampleContext;
import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.Type;
import com.facebook.react.modules.intent.IntentModule;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.94E, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C94E {
    public final C94D A00;

    /* JADX WARN: Multi-variable type inference failed */
    public final C3SN A00(C45123Jxs c45123Jxs) {
        Integer num;
        C213919dq c213919dq;
        C212859c8 A0E;
        try {
            C94D c94d = this.A00;
            String str = c45123Jxs.A03;
            String str2 = c45123Jxs.A05;
            String str3 = c45123Jxs.A04;
            Integer num2 = (Integer) c45123Jxs.A01;
            int intValue = num2.intValue();
            if (intValue != 1) {
                if (intValue != 3) {
                    String A0R = AnonymousClass001.A0R("unsupported flow ", AbstractC225209wj.A00(num2));
                    C14360o3.A0B(A0R, 1);
                    throw new Exception(A0R);
                }
                num = C05F.A01;
            } else {
                num = C05F.A00;
            }
            AnonymousClass436 A00 = c94d.A00(num, str, str2, str3, c45123Jxs.A02, (List) c45123Jxs.A00);
            if (A00 != null && (c213919dq = (C213919dq) A00.Bos()) != null && (A0E = c213919dq.A0E()) != null) {
                if (A0E.getOptionalStringField(0, "usecase") != null && A0E.getOptionalStringField(1, "version") != null && A0E.hasFieldValue("time_stamp")) {
                    if (!A0E.getRequiredCompactedTreeListField(2, "features", C212849c7.class, 605516421).isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        ImmutableList requiredCompactedTreeListField = A0E.getRequiredCompactedTreeListField(2, "features", C212849c7.class, 605516421);
                        C14360o3.A07(requiredCompactedTreeListField);
                        C1LC it = requiredCompactedTreeListField.iterator();
                        C14360o3.A07(it);
                        while (it.hasNext()) {
                            C2JS c2js = (C2JS) it.next();
                            String optionalStringField = c2js.getOptionalStringField(0, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                            if (optionalStringField == null) {
                                return new C3SN(C16930sl.A00, "Example ID missing in server feature response", false);
                            }
                            C2JS optionalTreeField = c2js.getOptionalTreeField(1, "context", C212809c3.class, 1302468840);
                            ExampleContext exampleContext = new ExampleContext(null, 0 == true ? 1 : 0, 31);
                            if (optionalTreeField != null) {
                                C1LC it2 = optionalTreeField.getRequiredCompactedTreeListField(0, "int_features", C212789c1.class, 1385380849).iterator();
                                C14360o3.A07(it2);
                                while (it2.hasNext()) {
                                    C2JS c2js2 = (C2JS) it2.next();
                                    if (c2js2.hasFieldValue(PublicKeyCredentialControllerUtility.JSON_KEY_ID) && c2js2.hasFieldValue(IntentModule.EXTRA_MAP_KEY_FOR_VALUE)) {
                                        exampleContext.A03.put(String.valueOf(c2js2.getCoercedIntField(0, PublicKeyCredentialControllerUtility.JSON_KEY_ID)), Long.valueOf(c2js2.getCoercedIntField(1, IntentModule.EXTRA_MAP_KEY_FOR_VALUE)));
                                    }
                                }
                                C1LC it3 = optionalTreeField.getRequiredCompactedTreeListField(1, "float_features", C212779c0.class, -1592771456).iterator();
                                C14360o3.A07(it3);
                                while (it3.hasNext()) {
                                    C2JS c2js3 = (C2JS) it3.next();
                                    if (c2js3.hasFieldValue(PublicKeyCredentialControllerUtility.JSON_KEY_ID) && c2js3.hasFieldValue(IntentModule.EXTRA_MAP_KEY_FOR_VALUE)) {
                                        exampleContext.A02.put(String.valueOf(c2js3.getCoercedIntField(0, PublicKeyCredentialControllerUtility.JSON_KEY_ID)), Double.valueOf(c2js3.getCoercedDoubleField(1, IntentModule.EXTRA_MAP_KEY_FOR_VALUE)));
                                    }
                                }
                                C1LC it4 = optionalTreeField.getRequiredCompactedTreeListField(2, "string_features", C212799c2.class, -2019814762).iterator();
                                C14360o3.A07(it4);
                                while (it4.hasNext()) {
                                    C2JS c2js4 = (C2JS) it4.next();
                                    String optionalStringField2 = c2js4.getOptionalStringField(1, IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                                    if (c2js4.hasFieldValue(PublicKeyCredentialControllerUtility.JSON_KEY_ID) && optionalStringField2 != null) {
                                        exampleContext.A04.put(String.valueOf(c2js4.getCoercedIntField(0, PublicKeyCredentialControllerUtility.JSON_KEY_ID)), optionalStringField2);
                                    }
                                }
                            }
                            HashMap hashMap = new HashMap();
                            C1LC it5 = c2js.getRequiredCompactedTreeListField(2, "int_features", C212829c5.class, 1634003159).iterator();
                            C14360o3.A07(it5);
                            while (it5.hasNext()) {
                                C2JS c2js5 = (C2JS) it5.next();
                                if (c2js5.hasFieldValue(PublicKeyCredentialControllerUtility.JSON_KEY_ID) && c2js5.hasFieldValue(IntentModule.EXTRA_MAP_KEY_FOR_VALUE)) {
                                    String valueOf = String.valueOf(c2js5.getCoercedIntField(0, PublicKeyCredentialControllerUtility.JSON_KEY_ID));
                                    C3R9[] c3r9Arr = FeatureData.A0E;
                                    hashMap.put(valueOf, new FeatureData(Type.A09, String.valueOf(c2js5.getCoercedIntField(0, PublicKeyCredentialControllerUtility.JSON_KEY_ID)), null, null, 0.0d, 16376, c2js5.getCoercedIntField(1, IntentModule.EXTRA_MAP_KEY_FOR_VALUE)));
                                }
                            }
                            C1LC it6 = c2js.getRequiredCompactedTreeListField(3, "float_features", C212819c4.class, 176701209).iterator();
                            C14360o3.A07(it6);
                            while (it6.hasNext()) {
                                C2JS c2js6 = (C2JS) it6.next();
                                if (c2js6.hasFieldValue(PublicKeyCredentialControllerUtility.JSON_KEY_ID) && c2js6.hasFieldValue(IntentModule.EXTRA_MAP_KEY_FOR_VALUE)) {
                                    String valueOf2 = String.valueOf(c2js6.getCoercedIntField(0, PublicKeyCredentialControllerUtility.JSON_KEY_ID));
                                    C3R9[] c3r9Arr2 = FeatureData.A0E;
                                    hashMap.put(valueOf2, new FeatureData(Type.A06, String.valueOf(c2js6.getCoercedIntField(0, PublicKeyCredentialControllerUtility.JSON_KEY_ID)), null, null, c2js6.getCoercedDoubleField(1, IntentModule.EXTRA_MAP_KEY_FOR_VALUE), 16372, 0L));
                                }
                            }
                            C1LC it7 = c2js.getRequiredCompactedTreeListField(4, "string_features", C212839c6.class, -2110747301).iterator();
                            C14360o3.A07(it7);
                            while (it7.hasNext()) {
                                C2JS c2js7 = (C2JS) it7.next();
                                if (c2js7.hasFieldValue(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) {
                                    String valueOf3 = String.valueOf(c2js7.getCoercedIntField(0, PublicKeyCredentialControllerUtility.JSON_KEY_ID));
                                    C3R9[] c3r9Arr3 = FeatureData.A0E;
                                    hashMap.put(valueOf3, new FeatureData(Type.A0D, String.valueOf(c2js7.getCoercedIntField(0, PublicKeyCredentialControllerUtility.JSON_KEY_ID)), c2js7.getOptionalStringField(1, IntentModule.EXTRA_MAP_KEY_FOR_VALUE), null, 0.0d, 16364, 0L));
                                }
                            }
                            arrayList.add(new Example(exampleContext, optionalStringField, hashMap));
                        }
                        return new C3SN(arrayList, null, true);
                    }
                    throw new Exception("Got empty server features response from network");
                }
                throw new Exception("Got invalid server features response from network");
            }
            throw new Exception("Got null server features response from network");
        } catch (AbstractC223499tg e) {
            C16930sl c16930sl = C16930sl.A00;
            String message = e.getMessage();
            if (message == null) {
                message = "Server features fetch failed due to unknown reason";
            }
            return new C3SN(c16930sl, message, false);
        }
    }

    public C94E(C94D c94d) {
        this.A00 = c94d;
    }
}
