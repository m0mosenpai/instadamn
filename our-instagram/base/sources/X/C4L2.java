package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4L2, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4L2 implements C4L3 {
    public final UserSession A00;
    public final C2DS A01;

    public C4L2(UserSession userSession, C2DS c2ds) {
        C14360o3.A0B(c2ds, 2);
        this.A00 = userSession;
        this.A01 = c2ds;
    }

    @Override // X.C4L3
    public final AbstractC1333760g E6D(C5lP c5lP, C125205lR c125205lR, List list, Map map, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, boolean z) {
        String str;
        long j;
        C81663kb A0N;
        C83403nh BM0;
        Long C7O;
        String str2;
        C14360o3.A0B(map, 0);
        C14360o3.A0B(c5lP, 1);
        C14360o3.A0B(c125205lR, 2);
        C14360o3.A0B(interfaceC16620sF, 5);
        C14360o3.A0B(interfaceC16620sF2, 6);
        String str3 = (String) map.get(RealtimeProtocol.THREAD_ID);
        if (str3 != null && (str = c125205lR.A00) != null) {
            int hashCode = str.hashCode();
            if (hashCode != -934610812) {
                if (hashCode != 96417) {
                    if (hashCode == 1094496948) {
                        str2 = "replace";
                    }
                } else {
                    str2 = "add";
                }
                if (str.equals(str2)) {
                    if (interfaceC16620sF.invoke(str3, c5lP) == null) {
                        return XZZ.A00;
                    }
                    try {
                        C07880b8 c07880b8 = C07950bF.A04;
                        UserSession userSession = this.A00;
                        String str4 = c125205lR.A02;
                        C14360o3.A06(str4);
                        C126455ng parseFromJson = AbstractC126445nf.parseFromJson(c07880b8.A01(userSession, str4));
                        C14360o3.A07(parseFromJson);
                        ((C2DU) this.A01).A0M(parseFromJson, z);
                        return C1333660e.A00;
                    } catch (IOException e) {
                        C0w9.A05("invalid_thread_metadata_format", "Invalid DirectThreadMetadataResult format", 1, e);
                        return new C1334060j(e, "invalid_thread_metadata_format", "Invalid DirectThreadMetadataResult format");
                    }
                }
            } else if (str.equals("remove")) {
                if (((Boolean) interfaceC16620sF2.invoke(str3, c5lP)).booleanValue()) {
                    return XZY.A00;
                }
                DirectThreadKey directThreadKey = new DirectThreadKey(str3, null);
                String str5 = c125205lR.A02;
                if (str5 != null) {
                    try {
                        j = new JSONObject(str5).getLong("deletion_watermark_ms");
                    } catch (JSONException unused) {
                    }
                    if (Long.valueOf(j) != null) {
                        long micros = TimeUnit.MILLISECONDS.toMicros(j);
                        C2DS c2ds = this.A01;
                        C2DU c2du = (C2DU) c2ds;
                        A0N = c2du.A0N(str3);
                        if (A0N != null || ((C7O = A0N.C7O()) != null && C7O.longValue() == -1)) {
                            C0K8.A0C("NewThreadDeltaProcessor", AnonymousClass001.A0g("cannot find threadJid: ", str3, " for deletion"));
                        } else {
                            InterfaceC14020nS A00 = C14120nc.A00();
                            C14360o3.A07(A00);
                            A00.ATO(new KMG(A0N, this, j));
                        }
                        BM0 = c2ds.BM0(directThreadKey);
                        if (BM0 == null && BM0.C8i() > micros) {
                            C4GV A0P = c2du.A0P(directThreadKey);
                            if (A0P != null) {
                                synchronized (A0P) {
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it = A0P.A0K.iterator();
                                    while (it.hasNext()) {
                                        C83403nh c83403nh = (C83403nh) it.next();
                                        if (c83403nh.C8i() > micros) {
                                            break;
                                        }
                                        arrayList.add(c83403nh);
                                        it.remove();
                                    }
                                    if (!arrayList.isEmpty()) {
                                        A0P.A0T();
                                        C4GV.A0C(A0P, arrayList);
                                    }
                                }
                            }
                        } else {
                            c2ds.EGR(directThreadKey, z, false);
                        }
                        return C1333660e.A00;
                    }
                }
                j = System.currentTimeMillis();
                long micros2 = TimeUnit.MILLISECONDS.toMicros(j);
                C2DS c2ds2 = this.A01;
                C2DU c2du2 = (C2DU) c2ds2;
                A0N = c2du2.A0N(str3);
                if (A0N != null) {
                }
                C0K8.A0C("NewThreadDeltaProcessor", AnonymousClass001.A0g("cannot find threadJid: ", str3, " for deletion"));
                BM0 = c2ds2.BM0(directThreadKey);
                if (BM0 == null) {
                }
                c2ds2.EGR(directThreadKey, z, false);
                return C1333660e.A00;
            }
        }
        return C1333860h.A00;
    }
}
