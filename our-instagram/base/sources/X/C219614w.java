package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.14w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C219614w {
    public static final C15B A06;
    public static final InterfaceC219914z A07 = C219714x.A00;
    public static final C15A A08 = new C15A() { // from class: X.159
        @Override // X.C15A
        public final InterfaceC219914z ALj(C15C c15c, C15P c15p) {
            return null;
        }

        @Override // X.C15A
        public final int Bdj() {
            return 0;
        }

        @Override // X.C15A
        public final int Bdk() {
            return 0;
        }

        public final String toString() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, NetInfoModule.CONNECTION_TYPE_NONE);
                jSONObject.put("framework", "");
                jSONObject.put("extra", "");
                return jSONObject.toString();
            } catch (Exception unused) {
                return "";
            }
        }
    };
    public volatile boolean A05 = false;
    public C15A A01 = A08;
    public C15C A00 = A06;
    public boolean A02 = false;
    public final C15E A03 = new C15E() { // from class: X.15D
        @Override // X.C15E
        public final int A00() {
            return 1;
        }

        @Override // X.C15E
        public final InterfaceC219914z A01(C15P c15p, int i) {
            if (c15p != null) {
                C219614w c219614w = C219614w.this;
                InterfaceC219914z interfaceC219914z = C219614w.A07;
                if (c219614w.A02) {
                    InterfaceC219914z ALj = c219614w.A01.ALj(c219614w.A00, c15p);
                    if (ALj == null) {
                        super.A00 = AnonymousClass001.A0O("failed_to_create_booster_", c219614w.A01.Bdj());
                    } else {
                        return ALj;
                    }
                }
            }
            return C219614w.A07;
        }

        @Override // X.C15E
        public final Map A03() {
            String str;
            HashMap hashMap = new HashMap();
            C219614w c219614w = C219614w.this;
            InterfaceC219914z interfaceC219914z = C219614w.A07;
            if (c219614w.A05) {
                hashMap.put("is_supported", String.valueOf(c219614w.A02));
                hashMap.put("platform", c219614w.A01.toString());
                str = c219614w.A00.toString();
            } else {
                hashMap.put("is_supported", "false");
                str = "uninitialized";
                hashMap.put("platform", "uninitialized");
            }
            hashMap.put("model", str);
            return hashMap;
        }

        @Override // X.C15E
        public final void A04(Context context) {
            C219614w c219614w = C219614w.this;
            C219614w.A00(context, c219614w);
            if (!c219614w.A02) {
                super.A00 = C219614w.A06.A00;
            }
        }

        @Override // X.C15E
        public final C15P A02(JSONObject jSONObject, int i) {
            int optInt = jSONObject.optInt(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT);
            int optInt2 = jSONObject.optInt("frequency");
            C15P c15p = new C15P();
            c15p.A02 = optInt2;
            c15p.A00 = optInt;
            return c15p;
        }
    };
    public final C15E A04 = new C15E() { // from class: X.15F
        @Override // X.C15E
        public final int A00() {
            return 2;
        }

        @Override // X.C15E
        public final InterfaceC219914z A01(C15P c15p, int i) {
            InterfaceC219914z ALj;
            if (c15p != null) {
                C219614w c219614w = C219614w.this;
                InterfaceC219914z interfaceC219914z = C219614w.A07;
                if (c219614w.A02 && (ALj = c219614w.A01.ALj(c219614w.A00, c15p)) != null) {
                    return ALj;
                }
            }
            return C219614w.A07;
        }

        @Override // X.C15E
        public final void A04(Context context) {
            C219614w.A00(context, C219614w.this);
        }

        @Override // X.C15E
        public final C15P A02(JSONObject jSONObject, int i) {
            int optInt = jSONObject.optInt(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT);
            int optInt2 = jSONObject.optInt("frequency");
            C15P c15p = new C15P();
            c15p.A02 = optInt2;
            c15p.A00 = optInt;
            return c15p;
        }
    };

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0194, code lost:
    
        r2 = X.C219614w.A06;
        r2.A00 = X.AnonymousClass001.A0R("no_suitable_model_for_", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01a3, code lost:
    
        if (r14.A01 == X.C219614w.A08) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01a7, code lost:
    
        if (r14.A00 == r2) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x00d4, code lost:
    
        if (r1 == 8) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01bd, code lost:
    
        if (r14.A00 != r2) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018f A[Catch: all -> 0x01da, TryCatch #2 {, blocks: (B:3:0x0001, B:10:0x0014, B:12:0x001a, B:16:0x01c0, B:24:0x007b, B:26:0x0081, B:57:0x018b, B:59:0x018f, B:106:0x019f, B:108:0x01a5, B:131:0x01b5, B:133:0x01bb, B:138:0x0060, B:140:0x0066, B:144:0x01c6, B:146:0x01cc, B:149:0x01d3, B:150:0x01d7, B:7:0x0007, B:9:0x000d, B:17:0x0020, B:19:0x0031, B:21:0x006c, B:23:0x0070, B:29:0x0087, B:31:0x008d, B:33:0x0093, B:35:0x00a1, B:36:0x00a6, B:42:0x00b5, B:43:0x00b9, B:45:0x00c1, B:49:0x00dc, B:50:0x00e2, B:52:0x00e8, B:64:0x00ff, B:66:0x010d, B:68:0x011b, B:70:0x012a, B:73:0x012d, B:76:0x0137, B:56:0x00f9, B:77:0x015c, B:80:0x0134, B:84:0x013d, B:86:0x014b, B:88:0x0159, B:92:0x0162, B:93:0x0166, B:95:0x016e, B:98:0x0172, B:99:0x0177, B:112:0x017f, B:101:0x0186, B:105:0x0194, B:55:0x00f4, B:38:0x00af, B:126:0x00cc, B:129:0x00d6, B:130:0x01aa, B:135:0x003a, B:137:0x0042), top: B:2:0x0001, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void A00(android.content.Context r13, X.C219614w r14) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C219614w.A00(android.content.Context, X.14w):void");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.15B, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.A00 = "uninitialized";
        A06 = obj;
    }
}
