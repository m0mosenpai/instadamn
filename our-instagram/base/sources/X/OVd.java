package X;

import com.instagram.common.session.UserSession;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class OVd {
    public final UserSession A00;
    public final Map A01;

    public OVd(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        Map synchronizedMap = Collections.synchronizedMap(AbstractC166987dD.A1G());
        C14360o3.A07(synchronizedMap);
        this.A01 = synchronizedMap;
    }

    public static WVG A00(UserSession userSession) {
        return new WVG(new OVd(userSession));
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [X.NoV, java.lang.Object] */
    public final C53680NoV A01(AbstractC53638Nnj abstractC53638Nnj, C54509O6m c54509O6m, Integer num, java.net.URI uri, Map map) {
        C26371Ps A0U;
        BufferedReader bufferedReader;
        UserSession userSession = this.A00;
        String A00 = C1QV.A00(C1QS.A00(userSession).getOngoingFlows());
        if (A00 != null && A00.length() > 0) {
            map.put("X-IG-SALT-IDS", A00);
        }
        if (num.intValue() != 0) {
            A0U = new C26371Ps(new C1JO(userSession));
            A0U.A01(C05F.A01);
            A0U.A05 = false;
            A0U.A02 = AbstractC166987dD.A19(uri);
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                A1E.add(new C23781El(AbstractC31172DnG.A17(A1K), (String) A1K.getValue()));
            }
            List list = A0U.A06;
            list.clear();
            list.addAll(A1E);
            if (c54509O6m != null) {
                C55191Odx c55191Odx = c54509O6m.A01;
                File file = c55191Odx.A01;
                if (file != null && file.exists()) {
                    long j = c54509O6m.A00;
                    int i = (int) j;
                    int i2 = (int) (c55191Odx.A00 - j);
                    if (i2 < 0 && AbstractC001900j.A0a(AbstractC166987dD.A19(uri), "phase=transfer", false)) {
                        StringBuilder A1C = AbstractC166987dD.A1C();
                        A1C.append("content_length ");
                        A1C.append(c55191Odx.A00);
                        A1C.append(" content_offset ");
                        A1C.append(0L);
                        A1C.append(" mime ");
                        A1C.append(c55191Odx.A04);
                        A1C.append(" filekey ");
                        A1C.append(c55191Odx.A03);
                        A1C.append(" body_offset ");
                        A1C.append(j);
                        C0w9.A03("content_length_will_drop", A1C.toString());
                    }
                    A0U.A00 = new TFS(new C55940OsY(abstractC53638Nnj), file, i, i2);
                } else {
                    try {
                        InputStream inputStream = c55191Odx.A02;
                        if (inputStream != null) {
                            Reader inputStreamReader = new InputStreamReader(inputStream, C15W.A05);
                            if (inputStreamReader instanceof BufferedReader) {
                                bufferedReader = (BufferedReader) inputStreamReader;
                            } else {
                                bufferedReader = new BufferedReader(inputStreamReader, 8192);
                            }
                            try {
                                String A002 = AbstractC38581qm.A00(bufferedReader);
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                                A0U.A00 = new TFP(A002, c55191Odx.A04);
                                A0U.A03("X-Entity-Length", String.valueOf(r0.A00.length));
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    C20I.A00(bufferedReader, th);
                                    throw th2;
                                }
                            }
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    } catch (Exception e) {
                        C0K8.A0G("IgHttpRequestFactory", "body conversion error", e);
                        C0w9.A07("ml_body_error", e);
                    }
                }
            }
        } else {
            A0U = AbstractC50522MSa.A0U(userSession);
            A0U.A02 = AbstractC166987dD.A19(uri);
            ArrayList A1E2 = AbstractC166987dD.A1E();
            Iterator A152 = AbstractC166997dE.A15(map);
            while (A152.hasNext()) {
                Map.Entry A1K2 = AbstractC166987dD.A1K(A152);
                A1E2.add(new C23781El(AbstractC31172DnG.A17(A1K2), (String) A1K2.getValue()));
            }
            List list2 = A0U.A06;
            list2.clear();
            list2.addAll(A1E2);
        }
        C1QW A003 = A0U.A00();
        C1QX c1qx = new C1QX();
        c1qx.A04 = EnumC23341Bw.MediaUpload;
        C1QY A004 = c1qx.A00();
        ?? obj = new Object();
        InterfaceC27191Tt A02 = C1C6.A00().A02(new C55934OsQ(obj, abstractC53638Nnj, AbstractC25225BEi.A16(this)), A003, A004);
        C14360o3.A07(A02);
        this.A01.put(obj, A02);
        return obj;
    }
}
