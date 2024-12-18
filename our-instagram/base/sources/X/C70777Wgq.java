package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Wgq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70777Wgq implements C1EH {
    public static final C70777Wgq A00 = new C70777Wgq();

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.UPb] */
    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        ?? obj = new Object();
        obj.A0M = false;
        obj.A04 = null;
        obj.A05 = null;
        obj.A06 = null;
        obj.A07 = null;
        obj.A08 = null;
        obj.A09 = null;
        obj.A0A = null;
        obj.A0B = null;
        obj.A03 = null;
        obj.A0C = null;
        obj.A00 = null;
        obj.A0L = null;
        obj.A0D = "";
        obj.A0E = null;
        obj.A01 = null;
        obj.A02 = null;
        obj.A0N = false;
        obj.A0F = null;
        obj.A0G = null;
        obj.A0H = null;
        obj.A0I = null;
        obj.A0J = null;
        obj.A0K = null;
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for TrackData should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                switch (A0s.hashCode()) {
                    case -2061768941:
                        if (A0s.equals("audio_asset_id")) {
                            obj.A05 = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -2060497896:
                        if (A0s.equals("subtitle")) {
                            obj.A0I = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -1755167329:
                        if (A0s.equals("highlight_start_times_in_ms")) {
                            ArrayList arrayList = new ArrayList();
                            if (c16l.A11() == C16R.A0C) {
                                while (c16l.A1J() != C16R.A08) {
                                    AbstractC166997dE.A1W(arrayList, c16l.A1D());
                                }
                            }
                            obj.A0L = arrayList;
                            break;
                        }
                        break;
                    case -512645821:
                        if (A0s.equals("is_eligible_for_vinyl_sticker")) {
                            obj.A02 = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case -310659645:
                        if (A0s.equals("web_30s_preview_download_url")) {
                            obj.A0K = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -220872642:
                        if (A0s.equals("dark_message")) {
                            obj.A09 = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -45086183:
                        if (A0s.equals("cover_artwork_uri")) {
                            obj.A08 = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -22609914:
                        if (A0s.equals("cover_artwork_thumbnail_uri")) {
                            obj.A07 = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 3355:
                        if (A0s.equals(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                obj.A0D = A1P;
                                break;
                            }
                        }
                        break;
                    case 55068821:
                        if (A0s.equals("duration_in_ms")) {
                            obj.A03 = AbstractC166997dE.A0h(c16l);
                            break;
                        }
                        break;
                    case 110371416:
                        if (A0s.equals(DialogModule.KEY_TITLE)) {
                            obj.A0J = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 527639047:
                        if (A0s.equals("reactive_audio_download_url")) {
                            obj.A0G = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 574519571:
                        if (A0s.equals("artist_id")) {
                            obj.A04 = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 682262252:
                        if (A0s.equals("fast_start_progressive_download_url")) {
                            obj.A0C = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 932670004:
                        if (A0s.equals("sanitized_title")) {
                            obj.A0H = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 1025801609:
                        if (A0s.equals("audio_cluster_id")) {
                            obj.A06 = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 1128191036:
                        if (A0s.equals("dash_manifest")) {
                            obj.A0A = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 1258734948:
                        if (A0s.equals("display_artist")) {
                            obj.A0B = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 1357418199:
                        if (A0s.equals("ig_username")) {
                            obj.A0E = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 1436807532:
                        if (A0s.equals("progressive_download_url")) {
                            obj.A0F = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 1470663792:
                        if (A0s.equals("is_eligible_for_audio_effects")) {
                            obj.A01 = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case 1545396879:
                        if (A0s.equals("allows_saving")) {
                            obj.A0M = c16l.A0d();
                            break;
                        }
                        break;
                    case 1630845353:
                        if (A0s.equals("is_explicit")) {
                            obj.A0N = c16l.A0d();
                            break;
                        }
                        break;
                    case 1988432185:
                        if (A0s.equals("has_lyrics")) {
                            obj.A00 = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                }
                C0K8.A0C("TrackDataJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return obj;
    }
}
