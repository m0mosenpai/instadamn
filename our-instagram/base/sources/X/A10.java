package X;

import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.tigon.tigonhuc.HucClient;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class A10 {
    public static List A00(InterfaceC37481ol interfaceC37481ol, List list) {
        if (list.isEmpty()) {
            List emptyList = Collections.emptyList();
            C14360o3.A07(emptyList);
            return emptyList;
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        try {
            StringBuilder sb = new StringBuilder("id IN (");
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append("?");
                if (i < list.size() - 1) {
                    sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                }
            }
            sb.append(")");
            String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_ID, "scanner_versions", "feature_name", "locality", "sub_admin_area", "admin_area", "country_name", "ocn_score", "ocv_score", "person_score", "food_score", "pet_score", "nature_score", "landmark_score", "aesthetic_score", "blur_score", "plant_score", "sports_score", "vehicle_score", "water_score", "outdoors_score", "event_score", "document_score"};
            String obj = sb.toString();
            Object[] array = list.toArray(new String[0]);
            StringBuilder sb2 = new StringBuilder(HucClient.BODY_UPLOAD_TIMEOUT_SECONDS);
            sb2.append("SELECT ");
            int i2 = 0;
            do {
                String str = strArr[i2];
                if (i2 > 0) {
                    sb2.append(", ");
                }
                sb2.append(str);
                i2++;
            } while (i2 < 23);
            sb2.append(' ');
            sb2.append("FROM ");
            sb2.append("gallery_media_metadata");
            if (obj != null && obj.length() != 0) {
                sb2.append(" WHERE ");
                sb2.append(obj);
            }
            Cursor E7N = interfaceC37481ol.E7N(new C37491om(AbstractC166987dD.A19(sb2), array));
            while (E7N.moveToNext()) {
                try {
                    A1E.add(AbstractC189318a8.A00(E7N));
                } finally {
                }
            }
            E7N.close();
            return A1E;
        } catch (RuntimeException e) {
            C0w9.A07("GalleryMediaMetadataDatabaseAccessHelper#fetchAll", e);
            return A1E;
        }
    }
}
