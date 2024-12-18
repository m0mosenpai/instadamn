package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.location.platform.api.Location;
import java.io.IOException;

/* loaded from: classes11.dex */
public final class WgD implements C1EH {
    public static final WgD A00 = new WgD();

    /* JADX WARN: Type inference failed for: r2v0, types: [X.UPO, java.lang.Object] */
    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        String A0j = AbstractC167017dG.A0j();
        ?? obj = new Object();
        obj.A06 = "";
        obj.A00 = 0.0f;
        obj.A04 = 0;
        obj.A02 = 0;
        obj.A07 = false;
        obj.A03 = 0;
        obj.A01 = 1.0f;
        obj.A05 = A0j;
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for KaraokeTranscriptionToken should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                switch (A0s.hashCode()) {
                    case -1019779949:
                        if (A0s.equals("offset")) {
                            obj.A03 = c16l.A1D();
                            break;
                        }
                        break;
                    case -1012724312:
                        if (A0s.equals("profanity")) {
                            obj.A07 = c16l.A0d();
                            break;
                        }
                        break;
                    case -557632268:
                        if (A0s.equals("end_time_ms")) {
                            obj.A02 = c16l.A1D();
                            break;
                        }
                        break;
                    case 3355:
                        if (A0s.equals(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                obj.A05 = A1P;
                                break;
                            }
                        }
                        break;
                    case 109641799:
                        if (A0s.equals(Location.SPEED)) {
                            obj.A01 = (float) c16l.A0U();
                            break;
                        }
                        break;
                    case 829251210:
                        if (A0s.equals("confidence")) {
                            obj.A00 = (float) c16l.A0U();
                            break;
                        }
                        break;
                    case 1106770299:
                        if (A0s.equals("start_time_ms")) {
                            obj.A04 = c16l.A1D();
                            break;
                        }
                        break;
                    case 1603019031:
                        if (A0s.equals("written")) {
                            if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                                obj.A06 = A1P2;
                                break;
                            }
                        }
                        break;
                }
                C0K8.A0C("KaraokeTranscriptionTokenJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return obj;
    }
}
