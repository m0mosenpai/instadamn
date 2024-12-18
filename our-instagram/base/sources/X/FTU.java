package X;

import android.content.Context;
import android.telephony.PhoneNumberUtils;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.model.business.Address;
import com.instagram.model.business.BusinessInfo;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class FTU {
    /* JADX WARN: Type inference failed for: r0v15, types: [com.instagram.model.business.PublicPhoneContact, java.lang.Object] */
    public static final BusinessInfo A00(Context context, FOW fow) {
        C35130FeX c35130FeX = new C35130FeX();
        c35130FeX.A09 = fow.A02;
        c35130FeX.A0B = fow.A09;
        c35130FeX.A0J = fow.A04;
        c35130FeX.A0O = true;
        c35130FeX.A0A = fow.A03;
        c35130FeX.A02 = fow.A00;
        c35130FeX.A03 = fow.A01;
        String str = fow.A0A;
        if (str.length() != 0) {
            String str2 = fow.A0B;
            if (str2.length() != 0) {
                String stripSeparators = PhoneNumberUtils.stripSeparators(AnonymousClass001.A0T(str, str2, ' '));
                String str3 = fow.A0A;
                String str4 = fow.A0B;
                ?? obj = new Object();
                obj.A01 = str3;
                obj.A02 = str4;
                obj.A03 = stripSeparators;
                obj.A00 = "";
                c35130FeX.A01 = obj;
            }
        }
        if (fow.A05.length() != 0) {
            String str5 = fow.A06;
            if (str5.length() != 0) {
                String A05 = AbstractC1567472a.A05(context, fow.A08, fow.A07, str5);
                C14360o3.A07(A05);
                c35130FeX.A00 = new Address(fow.A08, fow.A06, fow.A05, fow.A07, A05);
            }
        }
        return new BusinessInfo(c35130FeX);
    }

    public static final Map A01(FOW fow) {
        String str;
        String str2;
        HashMap A1G = AbstractC166987dD.A1G();
        if (fow != null) {
            A1G.put("category_id", fow.A02);
            A1G.put("category_name", fow.A03);
            EnumC222416a enumC222416a = fow.A00;
            String str3 = "";
            if (enumC222416a == null || (str = enumC222416a.A01) == null) {
                str = "";
            }
            A1G.put("category_account_type", str);
            EnumC222416a enumC222416a2 = fow.A01;
            if (enumC222416a2 != null && (str2 = enumC222416a2.A01) != null) {
                str3 = str2;
            }
            A1G.put("previous_account_type", str3);
            A1G.put("address_city_id", fow.A05);
            A1G.put("address_city_name", fow.A06);
            A1G.put("address_postal_code", fow.A07);
            A1G.put("address_street", fow.A08);
            A1G.put("email", fow.A09);
            A1G.put("is_page_convertable", String.valueOf(fow.A0D));
            A1G.put("page_id", fow.A04);
            A1G.put("phone_country_code", fow.A0A);
            A1G.put("phone_national_number", fow.A0B);
            A1G.put(CacheBehaviorLogger.SOURCE, fow.A0C);
        }
        return AbstractC06930Yk.A0B(A1G);
    }
}
