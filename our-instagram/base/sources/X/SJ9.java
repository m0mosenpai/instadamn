package X;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class SJ9 {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public List A07;

    public static Bundle A00(String str, String str2, String str3, String str4, String str5, String str6, List list) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("autofill_iab_session_id", str5);
        A0b.putString("ad_id", str);
        A0b.putString("current_url", str3);
        A0b.putString("origin_host", str6);
        A0b.putString("autofill_form_id", str4);
        A0b.putString("autofill_mobile_app_id", "5678");
        A0b.putString("autofill_type", str2);
        ArrayList<? extends Parcelable> A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SJZ sjz = (SJZ) it.next();
            Bundle A0b2 = AbstractC166987dD.A0b();
            A0b2.putString("InputAutocomplete", sjz.A04);
            A0b2.putString("PlaceHolder", sjz.A0A);
            A0b2.putString("DetectionResult", sjz.A03);
            A0b2.putString("Message", sjz.A09);
            A0b2.putString("InputType", sjz.A07);
            A0b2.putString("InputId", sjz.A05);
            A0b2.putString("InputName", sjz.A06);
            A0b2.putString("AutofillTag", sjz.A01);
            A0b2.putString("label", sjz.A08);
            A0b2.putString("detected_autofill_tag", sjz.A02);
            A0b2.putBoolean("is_valid_credit_card", sjz.A0D);
            A0b2.putBoolean("is_digit", sjz.A0B);
            A0b2.putBoolean("is_luhn_compliant", sjz.A0C);
            A0b2.putInt("text_length", sjz.A00);
            A1E.add(A0b2);
        }
        A0b.putParcelableArrayList("autofill_field_detection_bundle_data_list", A1E);
        return A0b;
    }
}
