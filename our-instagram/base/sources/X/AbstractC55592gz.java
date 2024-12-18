package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.2gz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC55592gz {
    public static C55602h0 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C55602h0 c55602h0 = new C55602h0();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                ArrayList arrayList = null;
                if ("surfaces".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C55632h3 parseFromJson = AbstractC55622h2.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c55602h0.A04 = arrayList;
                } else if ("slots".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C55652h5 parseFromJson2 = AbstractC55642h4.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c55602h0.A03 = arrayList;
                } else if ("global".equals(A0q)) {
                    c55602h0.A01 = c16l.A0y();
                } else if (GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT.equals(A0q)) {
                    c55602h0.A00 = c16l.A0y();
                } else if ("ttl".equals(A0q)) {
                    c55602h0.A02 = Long.valueOf(c16l.A0y());
                } else {
                    C55702hA.A01(c16l, c55602h0, A0q);
                }
                c16l.A0z();
            }
            return c55602h0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
