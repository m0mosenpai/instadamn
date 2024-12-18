package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;

/* loaded from: classes11.dex */
public abstract class VXE {
    public static final void A00(AnonymousClass182 anonymousClass182, C66613UPa c66613UPa) {
        C14360o3.A0B(c66613UPa, 1);
        anonymousClass182.A0d();
        String str = c66613UPa.A0E;
        if (str != null) {
            anonymousClass182.A0S("address", str);
        }
        String str2 = c66613UPa.A0F;
        if (str2 != null) {
            anonymousClass182.A0S("category", str2);
        }
        String str3 = c66613UPa.A0G;
        if (str3 != null) {
            anonymousClass182.A0S(ServerW3CShippingAddressConstants.CITY, str3);
        }
        Integer num = c66613UPa.A04;
        if (num != null) {
            anonymousClass182.A0Q("created_at", num.intValue());
        }
        Integer num2 = c66613UPa.A05;
        if (num2 != null) {
            anonymousClass182.A0Q("end_time", num2.intValue());
        }
        Integer num3 = c66613UPa.A06;
        if (num3 != null) {
            anonymousClass182.A0Q("event_category", num3.intValue());
        }
        Long l = c66613UPa.A0A;
        if (l != null) {
            anonymousClass182.A0R("external_id", l.longValue());
        }
        String str4 = c66613UPa.A0H;
        if (str4 != null) {
            anonymousClass182.A0S("external_id_source", str4);
        }
        String str5 = c66613UPa.A0I;
        if (str5 != null) {
            anonymousClass182.A0S("external_source", str5);
        }
        Long l2 = c66613UPa.A0B;
        if (l2 != null) {
            anonymousClass182.A0R("facebook_events_id", l2.longValue());
        }
        Long l3 = c66613UPa.A0C;
        if (l3 != null) {
            anonymousClass182.A0R("facebook_places_id", l3.longValue());
        }
        String str6 = c66613UPa.A0J;
        if (str6 != null) {
            anonymousClass182.A0S("foursquare_v2_id", str6);
        }
        Boolean bool = c66613UPa.A00;
        if (bool != null) {
            anonymousClass182.A0T("has_viewer_saved", bool.booleanValue());
        }
        Boolean bool2 = c66613UPa.A01;
        if (bool2 != null) {
            anonymousClass182.A0T("is_eligible_for_guides", bool2.booleanValue());
        }
        Float f = c66613UPa.A02;
        if (f != null) {
            anonymousClass182.A0P("lat", f.floatValue());
        }
        Float f2 = c66613UPa.A03;
        if (f2 != null) {
            anonymousClass182.A0P("lng", f2.floatValue());
        }
        Integer num4 = c66613UPa.A07;
        if (num4 != null) {
            anonymousClass182.A0Q("minimum_age", num4.intValue());
        }
        String str7 = c66613UPa.A0K;
        if (str7 != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str7);
        }
        Long l4 = c66613UPa.A0D;
        if (l4 != null) {
            anonymousClass182.A0R("pk", l4.longValue());
        }
        String str8 = c66613UPa.A0L;
        if (str8 != null) {
            anonymousClass182.A0S("profile_pic_url", str8);
        }
        String str9 = c66613UPa.A0M;
        if (str9 != null) {
            anonymousClass182.A0S("short_name", str9);
        }
        Integer num5 = c66613UPa.A08;
        if (num5 != null) {
            anonymousClass182.A0Q(TraceFieldType.StartTime, num5.intValue());
        }
        Integer num6 = c66613UPa.A09;
        if (num6 != null) {
            anonymousClass182.A0Q("time_granularity", num6.intValue());
        }
        String str10 = c66613UPa.A0N;
        if (str10 != null) {
            anonymousClass182.A0S("timezone", str10);
        }
        anonymousClass182.A0a();
    }
}
