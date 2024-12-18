package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import java.io.IOException;

/* renamed from: X.WgQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70751WgQ implements C1EH {
    public static final C70751WgQ A00 = new C70751WgQ();

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.UPa] */
    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        ?? obj = new Object();
        obj.A0E = null;
        obj.A0F = null;
        obj.A0G = null;
        obj.A04 = null;
        obj.A05 = null;
        obj.A06 = null;
        obj.A0A = null;
        obj.A0H = null;
        obj.A0I = null;
        obj.A0B = null;
        obj.A0C = null;
        obj.A0J = null;
        obj.A00 = null;
        obj.A01 = null;
        obj.A02 = null;
        obj.A03 = null;
        obj.A07 = null;
        obj.A0K = null;
        obj.A0D = null;
        obj.A0L = null;
        obj.A0M = null;
        obj.A08 = null;
        obj.A09 = null;
        obj.A0N = null;
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for MediaLocation should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                switch (A0s.hashCode()) {
                    case -2076227591:
                        if (A0s.equals("timezone")) {
                            obj.A0N = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -1650699556:
                        if (A0s.equals("time_granularity")) {
                            obj.A09 = AbstractC166997dE.A0h(c16l);
                            break;
                        }
                        break;
                    case -1573145462:
                        if (A0s.equals(TraceFieldType.StartTime)) {
                            obj.A08 = AbstractC166997dE.A0h(c16l);
                            break;
                        }
                        break;
                    case -1376148536:
                        if (A0s.equals("facebook_events_id")) {
                            obj.A0B = AbstractC31173DnH.A0h(c16l);
                            break;
                        }
                        break;
                    case -1153075697:
                        if (A0s.equals("external_id")) {
                            obj.A0A = AbstractC31173DnH.A0h(c16l);
                            break;
                        }
                        break;
                    case -1147692044:
                        if (A0s.equals("address")) {
                            obj.A0E = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -971305057:
                        if (A0s.equals("has_viewer_saved")) {
                            obj.A00 = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case -907032317:
                        if (A0s.equals("event_category")) {
                            obj.A06 = AbstractC166997dE.A0h(c16l);
                            break;
                        }
                        break;
                    case 3579:
                        if (A0s.equals("pk")) {
                            obj.A0D = AbstractC31173DnH.A0h(c16l);
                            break;
                        }
                        break;
                    case 106911:
                        if (A0s.equals("lat")) {
                            obj.A02 = AbstractC167007dF.A0b(c16l);
                            break;
                        }
                        break;
                    case 107301:
                        if (A0s.equals("lng")) {
                            obj.A03 = AbstractC167007dF.A0b(c16l);
                            break;
                        }
                        break;
                    case 3053931:
                        if (A0s.equals(ServerW3CShippingAddressConstants.CITY)) {
                            obj.A0G = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 3373707:
                        if (A0s.equals(PublicKeyCredentialControllerUtility.JSON_KEY_NAME)) {
                            obj.A0K = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 50511102:
                        if (A0s.equals("category")) {
                            obj.A0F = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 302331970:
                        if (A0s.equals("foursquare_v2_id")) {
                            obj.A0J = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 384633781:
                        if (A0s.equals("facebook_places_id")) {
                            obj.A0C = AbstractC31173DnH.A0h(c16l);
                            break;
                        }
                        break;
                    case 575682319:
                        if (A0s.equals("external_source")) {
                            obj.A0I = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 669651456:
                        if (A0s.equals("is_eligible_for_guides")) {
                            obj.A01 = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case 1008566606:
                        if (A0s.equals("minimum_age")) {
                            obj.A07 = AbstractC166997dE.A0h(c16l);
                            break;
                        }
                        break;
                    case 1241239627:
                        if (A0s.equals("external_id_source")) {
                            obj.A0H = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 1369680106:
                        if (A0s.equals("created_at")) {
                            obj.A04 = AbstractC166997dE.A0h(c16l);
                            break;
                        }
                        break;
                    case 1565793390:
                        if (A0s.equals("short_name")) {
                            obj.A0M = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 1725551537:
                        if (A0s.equals("end_time")) {
                            obj.A05 = AbstractC166997dE.A0h(c16l);
                            break;
                        }
                        break;
                    case 1782139044:
                        if (A0s.equals("profile_pic_url")) {
                            obj.A0L = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                }
                C0K8.A0C("MediaLocationJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return obj;
    }
}
