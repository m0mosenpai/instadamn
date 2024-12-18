package X;

import android.util.Base64;
import android.util.JsonWriter;
import com.instagram.common.session.UserSession;
import com.instagram.direct.msys.encryptedbackup.EncryptedBackupCrypto;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.6CC, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6CC {
    public static final C6CD A03 = new Object();
    public static final byte[] A04;
    public C45319K3w A00;
    public boolean A01;
    public final UserSession A02;

    public static final void A03(C6CC c6cc, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16600sD interfaceC16600sD) {
        C45319K3w c45319K3w;
        long j;
        synchronized (c6cc) {
            c45319K3w = c6cc.A00;
        }
        if (c45319K3w != null && c45319K3w.mResultSet.getCount() > 0) {
            byte[] blob = c45319K3w.mResultSet.getBlob(0, 3);
            C14360o3.A07(blob);
            byte[] blob2 = c45319K3w.mResultSet.getBlob(0, 4);
            C14360o3.A07(blob2);
            String valueOf = String.valueOf(c45319K3w.mResultSet.getLong(0, 1));
            Long nullableLong = c45319K3w.mResultSet.getNullableLong(0, 0);
            if (nullableLong != null) {
                j = nullableLong.longValue();
            } else {
                j = 0;
            }
            interfaceC16600sD.invoke(blob, blob2, valueOf, Long.valueOf(j));
            return;
        }
        C0K8.A0C("IgMailboxEncryptedBackups", "Failed to load MEBReadClientState");
        interfaceC16820sZ.invoke();
    }

    public static final void A04(InterfaceC16660sJ interfaceC16660sJ, UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (!C6E9.A00(userSession, AbstractC20100yh.A00(36325892793251311L), true) && !C99Y.A00.A02(userSession, true)) {
            C131225wA.A01.A02(new C207189Ex(11, userSession, interfaceC16660sJ), userSession);
            return;
        }
        if (userSession.isStopped()) {
            C0K8.A0C("IgMailboxEncryptedBackups", "UserSession is stopped, cannot run async callback");
        } else if (C18U.A06(C06090Tz.A05, userSession, 36318861939972836L)) {
            AbstractC136086Dq.A00(userSession).A00(new C50169MDw(29, userSession, interfaceC16660sJ), 5);
        } else {
            AbstractC47168Kt3.A00.A01(userSession, EnumC132075xi.A0U, new C50370MLx(20, interfaceC16660sJ, userSession));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.6CD] */
    static {
        byte[] decode = Base64.decode("kPxziUnMc4MUpeaqUkHj8S1MKoxDyFEukbvxsEB/fwE=", 2);
        C14360o3.A07(decode);
        A04 = decode;
    }

    public static final String A00(String str, String str2, byte[] bArr) {
        Charset charset = C15W.A05;
        byte[] bytes = str2.getBytes(charset);
        C14360o3.A07(bytes);
        byte[] bytes2 = str.getBytes(charset);
        C14360o3.A07(bytes2);
        byte[] createHmac = EncryptedBackupCrypto.createHmac(bytes, bytes2);
        C14360o3.A07(createHmac);
        byte[] ocmfClientMap = EncryptedBackupCrypto.ocmfClientMap(bArr, createHmac);
        C14360o3.A07(ocmfClientMap);
        String encodeToString = Base64.encodeToString(ocmfClientMap, 2);
        C14360o3.A07(encodeToString);
        return encodeToString;
    }

    public static final String A01(List list) {
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.beginArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jsonWriter.value((String) it.next());
            }
            jsonWriter.endArray();
            jsonWriter.close();
            return stringWriter.toString();
        } catch (IOException unused) {
            C0K8.A0C("IgMailboxEncryptedBackups", "Failed to generate restore request json");
            return "";
        }
    }

    public C6CC(UserSession userSession) {
        this.A02 = userSession;
    }

    public static final void A02(JsonWriter jsonWriter, C6CC c6cc, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            jsonWriter.name((String) entry.getKey());
            if (entry.getValue() instanceof Number) {
                Object value = entry.getValue();
                C14360o3.A0C(value, "null cannot be cast to non-null type kotlin.Number");
                jsonWriter.value((Number) value);
            } else if (entry.getValue() instanceof Boolean) {
                Object value2 = entry.getValue();
                C14360o3.A0C(value2, "null cannot be cast to non-null type kotlin.Boolean");
                jsonWriter.value(((Boolean) value2).booleanValue());
            } else if (entry.getValue() instanceof Map) {
                jsonWriter.beginObject();
                Object value3 = entry.getValue();
                C14360o3.A0C(value3, AbstractC58317Pt9.A00(1));
                A02(jsonWriter, c6cc, (Map) value3);
                jsonWriter.endObject();
            } else {
                jsonWriter.value(entry.getValue().toString());
            }
        }
    }
}
