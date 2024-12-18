package X;

import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.1rV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38961rV {
    public static final java.util.Set A0G = AbstractC38971rW.A00(new Object[]{"falco_data_quality_stream"});
    public static final java.util.Set A0H = AbstractC38971rW.A00(new Object[]{"falco_data_quality_batch"});
    public final int A00;
    public final C38141q1 A01;
    public final C38081ps A02;
    public final C38131px A03;
    public final C38071pr A04;
    public final C38951rU A05;
    public final UserSession A06;
    public final String A07;
    public final java.util.Set A08;
    public final java.util.Set A09;
    public final java.util.Set A0A;
    public final InterfaceC09390do A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public volatile boolean A0F = false;

    public static HashSet A00(String str, String str2) {
        HashSet hashSet = new HashSet();
        if (!str.equals("")) {
            try {
                str = AbstractC38511qf.A00(str);
                HashSet hashSet2 = new HashSet();
                if (str.length() != 0) {
                    JSONArray jSONArray = new JSONArray(str);
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        Object obj = jSONArray.get(i);
                        if (obj instanceof String) {
                            hashSet2.add(obj);
                        } else {
                            throw new JSONException("Expecting array of strings.");
                        }
                    }
                }
                return hashSet2;
            } catch (JSONException e) {
                C0K8.A0M("IgStreamingLoggerProviderLazy", "Exception when de-serializing %s config: %s", e, str2, str);
            }
        }
        return hashSet;
    }

    public C38961rV(C38141q1 c38141q1, C37571ou c37571ou, C38081ps c38081ps, C38131px c38131px, C38071pr c38071pr, C38951rU c38951rU, UserSession userSession, String str) {
        this.A0E = c37571ou.A1N;
        this.A0C = c37571ou.A0y.booleanValue();
        this.A0D = c37571ou.A10.booleanValue();
        this.A00 = c37571ou.A03;
        HashSet A00 = A00(c37571ou.A1A, "streamable events compressed");
        A00.addAll(A0G);
        this.A0A = A00;
        HashSet A002 = A00(c37571ou.A19, "non-streamable events");
        A002.addAll(A0H);
        this.A08 = A002;
        this.A09 = A00(c37571ou.A1D, "stateful events");
        this.A07 = str;
        this.A06 = userSession;
        this.A04 = c38071pr;
        this.A02 = c38081ps;
        this.A03 = c38131px;
        this.A01 = c38141q1;
        this.A05 = c38951rU;
        this.A0B = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.1rg
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                C38961rV c38961rV = C38961rV.this;
                C92624Cw c92624Cw = new C92624Cw(c38961rV);
                String str2 = "";
                String string = AbstractC11400iy.A00().A00.getString("logging_host", "");
                if (string != null) {
                    str2 = string;
                }
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = C14250np.A00().A00;
                C38071pr c38071pr2 = c38961rV.A04;
                C38081ps c38081ps2 = c38961rV.A02;
                C38131px c38131px2 = c38961rV.A03;
                java.util.Set set = c38961rV.A09;
                return new C4Cx(c38961rV.A01, c38081ps2, c38131px2, c38071pr2, c38961rV.A05, c92624Cw, c38961rV.A07, str2, set, scheduledThreadPoolExecutor, c38961rV.A00, c38961rV.A0C);
            }
        });
    }
}
