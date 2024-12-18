package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.2kt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57802kt {
    public String A00 = UUID.randomUUID().toString();
    public java.util.Set A02 = new HashSet();
    public HashMap A01 = new HashMap();

    public final int A00() {
        int size = this.A02.size();
        Iterator it = this.A01.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += new HashSet(Arrays.asList(((String) ((Map.Entry) it.next()).getValue()).split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1))).size();
        }
        return size + i;
    }

    public final C1ON A01(UserSession userSession) {
        String str;
        String str2;
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A09(C05F.A01);
        c25621Ms.A0B("clips/write_seen_state/");
        java.util.Set set = this.A02;
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            A0A.A0c();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                A0A.A0u((String) it.next());
            }
            A0A.A0Z();
            A0A.close();
            str = stringWriter.toString();
        } catch (IOException unused) {
            str = "[]";
        }
        c25621Ms.A9s("impressions", str);
        HashMap hashMap = this.A01;
        try {
            StringWriter stringWriter2 = new StringWriter();
            C17z A0A2 = AbstractC221915u.A00.A0A(stringWriter2);
            A0A2.A0c();
            for (Map.Entry entry : hashMap.entrySet()) {
                A0A2.A0d();
                A0A2.A0S("blend_id", (String) entry.getKey());
                A0A2.A0M(AbstractC111324zv.A00(3055));
                for (String str3 : ((String) entry.getValue()).split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1)) {
                    A0A2.A0u(str3);
                }
                A0A2.A0Z();
                A0A2.A0a();
            }
            A0A2.A0Z();
            A0A2.close();
            str2 = stringWriter2.toString();
        } catch (IOException unused2) {
            str2 = "[]";
        }
        c25621Ms.A9s("blend_impressions", str2);
        c25621Ms.A0S(C40781ul.class, C55702hA.class);
        c25621Ms.A0R = true;
        return c25621Ms.A0N();
    }
}
