package X;

import android.text.TextUtils;
import com.instagram.discovery.mediamap.model.LocationPageInformation;
import com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse;
import com.instagram.user.model.User;

/* renamed from: X.UzJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67845UzJ extends C40781ul {
    public C69015Vfr A00;
    public LocationPageInfoPageOperationHourResponse A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public boolean A0C;

    public static boolean A00(C67845UzJ c67845UzJ) {
        if (!(!TextUtils.isEmpty(c67845UzJ.A09)) && !(!TextUtils.isEmpty(c67845UzJ.A0A))) {
            Integer num = c67845UzJ.A03;
            if (num != null && num.intValue() > 0) {
                return false;
            }
            LocationPageInfoPageOperationHourResponse locationPageInfoPageOperationHourResponse = c67845UzJ.A01;
            if (locationPageInfoPageOperationHourResponse != null && !TextUtils.isEmpty(locationPageInfoPageOperationHourResponse.A01)) {
                return false;
            }
            C69015Vfr c69015Vfr = c67845UzJ.A00;
            if (c69015Vfr != null && c69015Vfr.A01 != null) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.instagram.discovery.mediamap.model.LocationPageInformation, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v2, types: [X.Vba, java.lang.Object] */
    public final LocationPageInformation A01() {
        C68757Vba c68757Vba;
        User user;
        C69015Vfr c69015Vfr = this.A00;
        if (c69015Vfr != null && (user = c69015Vfr.A01) != null) {
            ?? obj = new Object();
            obj.A00 = user;
            c68757Vba = obj;
        } else {
            c68757Vba = null;
        }
        String str = this.A08;
        String str2 = this.A09;
        String str3 = this.A0A;
        String str4 = this.A06;
        Integer num = this.A03;
        String str5 = this.A05;
        String str6 = this.A07;
        Integer num2 = this.A04;
        String str7 = this.A0B;
        LocationPageInfoPageOperationHourResponse locationPageInfoPageOperationHourResponse = this.A01;
        boolean z = this.A0C;
        Integer num3 = this.A02;
        ?? obj2 = new Object();
        obj2.A08 = str;
        obj2.A09 = str2;
        obj2.A0A = str3;
        obj2.A06 = str4;
        obj2.A03 = num;
        obj2.A05 = str5;
        obj2.A07 = str6;
        obj2.A04 = num2;
        obj2.A0B = str7;
        obj2.A01 = locationPageInfoPageOperationHourResponse;
        obj2.A00 = c68757Vba;
        obj2.A0C = z;
        obj2.A02 = num3;
        return obj2;
    }

    @Override // X.C40781ul, X.InterfaceC40821up
    public final String getCategory() {
        return this.A06;
    }
}
