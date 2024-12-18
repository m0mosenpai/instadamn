package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.instagram.model.venue.LocationDictIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.TtD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract /* synthetic */ class AbstractC65738TtD {
    public static Map A00(LocationDictIntf locationDictIntf) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (locationDictIntf.getAddress() != null) {
            linkedHashMap.put("address", locationDictIntf.getAddress());
        }
        if (locationDictIntf.getCategory() != null) {
            linkedHashMap.put("category", locationDictIntf.getCategory());
        }
        if (locationDictIntf.getCity() != null) {
            linkedHashMap.put(ServerW3CShippingAddressConstants.CITY, locationDictIntf.getCity());
        }
        if (locationDictIntf.AsZ() != null) {
            linkedHashMap.put("created_at", locationDictIntf.AsZ());
        }
        if (locationDictIntf.B23() != null) {
            linkedHashMap.put("end_time", locationDictIntf.B23());
        }
        if (locationDictIntf.B2h() != null) {
            linkedHashMap.put("event_category", locationDictIntf.B2h());
        }
        if (locationDictIntf.B3a() != null) {
            linkedHashMap.put("external_id", locationDictIntf.B3a());
        }
        if (locationDictIntf.B3b() != null) {
            linkedHashMap.put("external_id_source", locationDictIntf.B3b());
        }
        if (locationDictIntf.getExternalSource() != null) {
            linkedHashMap.put("external_source", locationDictIntf.getExternalSource());
        }
        if (locationDictIntf.B40() != null) {
            linkedHashMap.put("facebook_events_id", locationDictIntf.B40());
        }
        if (locationDictIntf.B41() != null) {
            linkedHashMap.put("facebook_places_id", locationDictIntf.B41());
        }
        if (locationDictIntf.B8K() != null) {
            linkedHashMap.put("foursquare_v2_id", locationDictIntf.B8K());
        }
        if (locationDictIntf.BCz() != null) {
            linkedHashMap.put("has_viewer_saved", locationDictIntf.BCz());
        }
        if (locationDictIntf.CTA() != null) {
            linkedHashMap.put("is_eligible_for_guides", locationDictIntf.CTA());
        }
        if (locationDictIntf.BM8() != null) {
            linkedHashMap.put("lat", AbstractC166997dE.A0f(locationDictIntf.BM8()));
        }
        if (locationDictIntf.BO9() != null) {
            linkedHashMap.put("lng", AbstractC166997dE.A0f(locationDictIntf.BO9()));
        }
        if (locationDictIntf.BU7() != null) {
            linkedHashMap.put("minimum_age", locationDictIntf.BU7());
        }
        if (locationDictIntf.getName() != null) {
            linkedHashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, locationDictIntf.getName());
        }
        if (locationDictIntf.BdZ() != null) {
            linkedHashMap.put("pk", locationDictIntf.BdZ());
        }
        if (locationDictIntf.getProfilePicUrl() != null) {
            linkedHashMap.put("profile_pic_url", locationDictIntf.getProfilePicUrl());
        }
        if (locationDictIntf.getShortName() != null) {
            linkedHashMap.put("short_name", locationDictIntf.getShortName());
        }
        if (locationDictIntf.Bzj() != null) {
            linkedHashMap.put(TraceFieldType.StartTime, locationDictIntf.Bzj());
        }
        if (locationDictIntf.C8R() != null) {
            linkedHashMap.put("time_granularity", locationDictIntf.C8R());
        }
        if (locationDictIntf.C8j() != null) {
            linkedHashMap.put("timezone", locationDictIntf.C8j());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
