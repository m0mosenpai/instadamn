package X;

import android.os.BaseBundle;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Rsn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61732Rsn {
    /* JADX WARN: Type inference failed for: r10v0, types: [X.SJZ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [X.SJ9, java.lang.Object] */
    public static final SJ9 A00(Bundle bundle) {
        ArrayList parcelableArrayList;
        String string = bundle.getString("autofill_iab_session_id");
        String string2 = bundle.getString("ad_id");
        String string3 = bundle.getString("current_url");
        String string4 = bundle.getString("origin_host");
        String string5 = bundle.getString("autofill_form_id");
        String string6 = bundle.getString("autofill_mobile_app_id");
        String string7 = bundle.getString("autofill_type");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableArrayList = bundle.getParcelableArrayList("autofill_field_detection_bundle_data_list", Bundle.class);
        } else {
            parcelableArrayList = bundle.getParcelableArrayList("autofill_field_detection_bundle_data_list");
        }
        if (string == null || parcelableArrayList == null) {
            return null;
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator A13 = AbstractC166997dE.A13(parcelableArrayList);
        while (A13.hasNext()) {
            BaseBundle baseBundle = (BaseBundle) AbstractC166997dE.A0l(A13);
            ?? obj = new Object();
            C14360o3.A0B(baseBundle, 0);
            obj.A04 = baseBundle.getString("InputAutocomplete");
            obj.A0A = baseBundle.getString("PlaceHolder");
            obj.A03 = baseBundle.getString("DetectionResult");
            obj.A09 = baseBundle.getString("Message");
            obj.A07 = baseBundle.getString("InputType");
            obj.A05 = baseBundle.getString("InputId");
            obj.A06 = baseBundle.getString("InputName");
            obj.A01 = baseBundle.getString("AutofillTag");
            obj.A08 = baseBundle.getString("label");
            obj.A02 = baseBundle.getString("detected_autofill_tag");
            obj.A0D = baseBundle.getBoolean("is_valid_credit_card");
            obj.A0B = baseBundle.getBoolean("is_digit");
            obj.A0C = baseBundle.getBoolean("is_luhn_compliant");
            obj.A00 = baseBundle.getInt("text_length");
            A1E.add(obj);
        }
        if (A1E.isEmpty()) {
            return null;
        }
        ?? obj2 = new Object();
        obj2.A04 = string;
        obj2.A00 = string2;
        obj2.A02 = string3;
        obj2.A06 = string4;
        obj2.A03 = string5;
        obj2.A05 = string6;
        obj2.A01 = string7;
        obj2.A07 = A1E;
        return obj2;
    }
}
