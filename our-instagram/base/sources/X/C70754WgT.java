package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.location.platform.api.Location;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.WgT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70754WgT implements C1EH {
    public static final C70754WgT A00 = new C70754WgT();

    /* JADX WARN: Type inference failed for: r1v0, types: [X.UQM, java.lang.Object] */
    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        ?? obj = new Object();
        obj.A05 = 0;
        obj.A08 = 0;
        obj.A0X = "";
        UQM.A01(obj);
        obj.A0E = null;
        UQM.A00(obj);
        obj.A0e = null;
        UQM.A02(obj);
        obj.A0F = null;
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for MediaMedium should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                switch (A0s.hashCode()) {
                    case -2133328134:
                        if (A0s.equals(AbstractC111324zv.A00(134))) {
                            obj.A0Y = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -2015477765:
                        if (A0s.equals(MSV.A00(175))) {
                            obj.A0L = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -1997591781:
                        if (A0s.equals("max_sample_size")) {
                            obj.A06 = c16l.A1D();
                            break;
                        }
                        break;
                    case -1720921762:
                        if (A0s.equals("is_motion_photo")) {
                            obj.A0F = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case -1648385670:
                        if (A0s.equals("video_highlight_start_time_in_ms")) {
                            obj.A0A = c16l.A1D();
                            break;
                        }
                        break;
                    case -1519424279:
                        if (A0s.equals("attribution_content_url")) {
                            obj.A0N = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -1477316012:
                        if (A0s.equals("upload_media_source")) {
                            obj.A0b = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -1439978388:
                        if (A0s.equals(Location.LATITUDE)) {
                            obj.A00 = c16l.A0U();
                            break;
                        }
                        break;
                    case -1221029593:
                        if (A0s.equals(IgReactMediaPickerNativeModule.HEIGHT)) {
                            obj.A04 = c16l.A1D();
                            break;
                        }
                        break;
                    case -1024402354:
                        if (A0s.equals(AbstractC111324zv.A00(176))) {
                            obj.A0E = (C51737MtK) C16V.A01(c16l, C70739WgB.A00);
                            break;
                        }
                        break;
                    case -846372261:
                        if (A0s.equals("album_name")) {
                            obj.A0H = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -732008740:
                        if (A0s.equals("sub_admin_area")) {
                            obj.A0Z = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -722729565:
                        if (A0s.equals("original_media_uri")) {
                            obj.A0W = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -508615000:
                        if (A0s.equals("friendly_duration")) {
                            obj.A0U = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -207337714:
                        if (A0s.equals("should_fetch_audio_preview")) {
                            obj.A0i = c16l.A0d();
                            break;
                        }
                        break;
                    case -77151997:
                        if (A0s.equals(AbstractC111324zv.A00(778))) {
                            obj.A0P = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -40300674:
                        if (A0s.equals("rotation")) {
                            obj.A07 = c16l.A1D();
                            break;
                        }
                        break;
                    case 3355:
                        if (A0s.equals(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) {
                            obj.A05 = c16l.A1D();
                            break;
                        }
                        break;
                    case 116076:
                        if (A0s.equals("uri")) {
                            obj.A0c = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 3433509:
                        if (A0s.equals("path")) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                obj.A0X = A1P;
                                break;
                            }
                        }
                        break;
                    case 3575610:
                        if (A0s.equals(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE)) {
                            obj.A08 = c16l.A1D();
                            break;
                        }
                        break;
                    case 55068821:
                        if (A0s.equals("duration_in_ms")) {
                            obj.A03 = c16l.A1D();
                            break;
                        }
                        break;
                    case 97187254:
                        if (A0s.equals("faces")) {
                            ArrayList arrayList = new ArrayList();
                            if (c16l.A11() == C16R.A0C) {
                                while (c16l.A1J() != C16R.A08) {
                                    arrayList.add(C16V.A01(c16l, C70738WgA.A00));
                                }
                            }
                            obj.A0e = arrayList;
                            break;
                        }
                        break;
                    case 113126854:
                        if (A0s.equals(IgReactMediaPickerNativeModule.WIDTH)) {
                            obj.A0B = c16l.A1D();
                            break;
                        }
                        break;
                    case 137365935:
                        if (A0s.equals("longitude")) {
                            obj.A01 = c16l.A0U();
                            break;
                        }
                        break;
                    case 283610048:
                        if (A0s.equals("bucket_name")) {
                            obj.A0O = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 315759889:
                        if (A0s.equals("is_favorite")) {
                            obj.A0g = c16l.A0d();
                            break;
                        }
                        break;
                    case 350554534:
                        if (A0s.equals("app_attribution_raw_namespace")) {
                            obj.A0K = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 467635131:
                        if (A0s.equals("wearables_media_id")) {
                            obj.A0d = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 486246909:
                        if (A0s.equals("app_attribution_namespace")) {
                            obj.A0J = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 687554429:
                        if (A0s.equals("admin_area")) {
                            obj.A0G = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 759857048:
                        if (A0s.equals("thumbnail_path")) {
                            obj.A0a = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 767106195:
                        if (A0s.equals("capture_type")) {
                            obj.A0Q = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 826313696:
                        if (A0s.equals("has_lat_lng")) {
                            obj.A0f = c16l.A0d();
                            break;
                        }
                        break;
                    case 857618735:
                        if (A0s.equals("date_added")) {
                            obj.A0C = c16l.A0y();
                            break;
                        }
                        break;
                    case 875082998:
                        if (A0s.equals("date_taken")) {
                            obj.A0D = c16l.A0y();
                            break;
                        }
                        break;
                    case 959377421:
                        if (A0s.equals("is_meta_gallery")) {
                            obj.A0h = c16l.A0d();
                            break;
                        }
                        break;
                    case 1209016884:
                        if (A0s.equals("feature_name")) {
                            obj.A0T = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 1338308189:
                        if (A0s.equals(MSV.A00(180))) {
                            obj.A0M = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 1461081577:
                        if (A0s.equals(MSV.A00(198))) {
                            obj.A0S = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 1481386388:
                        if (A0s.equals("country_name")) {
                            obj.A0R = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 1488689860:
                        if (A0s.equals("video_highlight_duration_in_ms")) {
                            obj.A09 = c16l.A1D();
                            break;
                        }
                        break;
                    case 1621027513:
                        if (A0s.equals("app_attribution_id")) {
                            obj.A0I = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 1837164432:
                        if (A0s.equals("bucket_id")) {
                            obj.A02 = c16l.A1D();
                            break;
                        }
                        break;
                    case 1900805475:
                        if (A0s.equals("locality")) {
                            obj.A0V = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                }
                C0K8.A0C("MediaMediumJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return obj;
    }
}
