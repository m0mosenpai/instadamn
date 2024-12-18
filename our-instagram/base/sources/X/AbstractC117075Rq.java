package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.quickpromotion.intf.Trigger;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.5Rq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC117075Rq {
    public static C117045Rn parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C117045Rn c117045Rn = new C117045Rn();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                ArrayList arrayList = null;
                String str = null;
                String str2 = null;
                String str3 = null;
                Integer num = null;
                ArrayList arrayList2 = null;
                if ("promotion_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    C14360o3.A0B(str, 0);
                    c117045Rn.A05 = str;
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str2 = c16l.A1P();
                    }
                    c117045Rn.A03 = str2;
                } else if ("logging_data".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str3 = c16l.A1P();
                    }
                    c117045Rn.A04 = str3;
                } else if ("max_impressions".equals(A0q)) {
                    if (c16l.A11() == C16R.A0I) {
                        num = Integer.valueOf(c16l.A1D());
                    }
                    c117045Rn.A02 = num;
                } else if ("triggers".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            Trigger A00 = AbstractC55742hF.A00(c16l.A1Q());
                            if (A00 != null) {
                                arrayList2.add(A00);
                            }
                        }
                    }
                    c117045Rn.A07 = arrayList2;
                } else if ("is_uncancelable".equals(A0q)) {
                    c117045Rn.A0B = c16l.A0d();
                } else if ("creatives".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C4NM parseFromJson = C4NR.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c117045Rn.A06 = arrayList;
                } else if ("contextual_filters".equals(A0q)) {
                    c117045Rn.A00 = C4NY.parseFromJson(c16l);
                } else if ("template".equals(A0q)) {
                    C4NP parseFromJson2 = C4NW.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson2, 0);
                    c117045Rn.A01 = parseFromJson2;
                } else if ("is_server_force_pass".equals(A0q)) {
                    c117045Rn.A0A = c16l.A0d();
                } else if ("client_side_dry_run".equals(A0q)) {
                    c117045Rn.A08 = c16l.A0d();
                } else if ("disable_logging_to_qp_tables".equals(A0q)) {
                    c117045Rn.A09 = c16l.A0d();
                } else if ("bypass_surface_delay".equals(A0q)) {
                    c117045Rn.A0C = c16l.A0d();
                }
                c16l.A0z();
            }
            return c117045Rn;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
