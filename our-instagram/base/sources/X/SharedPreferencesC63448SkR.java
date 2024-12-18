package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.react.modules.toast.ToastModule;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.SkR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class SharedPreferencesC63448SkR implements SharedPreferences {
    public final SharedPreferences A00;
    public final InterfaceC65518Tln A01;
    public final InterfaceC65519Tlo A02;
    public final String A03;
    public final CopyOnWriteArrayList A04;

    /* JADX WARN: Multi-variable type inference failed */
    public static PxS A01(Context context, InterfaceC65518Tln interfaceC65518Tln, C58561Pxd c58561Pxd, String str) {
        PxS pxS = new PxS((C58553PxR) ((PxQ) PxJ.DEFAULT_INSTANCE.A0F(C05F.A0Y)));
        pxS.A03(c58561Pxd);
        pxS.A02(((C58566Pxi) SU0.A00(pxS.A01().A01).keyInfo_.get(0)).keyId_);
        SU1.A00(interfaceC65518Tln, pxS.A01(), new PxU(context, str));
        return pxS;
    }

    public SharedPreferencesC63448SkR(SharedPreferences sharedPreferences, InterfaceC65518Tln interfaceC65518Tln, InterfaceC65519Tlo interfaceC65519Tlo) {
        int A03 = C0f9.A03(-1851921766);
        this.A03 = "hpke_key_storage";
        this.A00 = sharedPreferences;
        this.A01 = interfaceC65518Tln;
        this.A02 = interfaceC65519Tlo;
        this.A04 = new CopyOnWriteArrayList();
        C0f9.A0A(830691318, A03);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a5 A[Catch: all -> 0x017b, TRY_ENTER, TRY_LEAVE, TryCatch #14 {, blocks: (B:9:0x0023, B:10:0x0025, B:24:0x008f, B:27:0x00a5, B:41:0x010c, B:104:0x017a), top: B:8:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014f  */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.Pxg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [X.Pxg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v45, types: [X.PxA] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12, types: [X.Pxg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [X.Pxg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.ByteArrayInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r3v10, types: [X.PxS] */
    /* JADX WARN: Type inference failed for: r3v11, types: [X.PxS] */
    /* JADX WARN: Type inference failed for: r3v15, types: [X.PxS] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v5, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r7v1, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r7v6, types: [X.PxS] */
    /* JADX WARN: Type inference failed for: r7v7, types: [X.PxS] */
    /* JADX WARN: Type inference failed for: r7v9, types: [X.PxS] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.SharedPreferencesC63448SkR A00(android.content.Context r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SharedPreferencesC63448SkR.A00(android.content.Context, java.lang.String):X.SkR");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x006f. Please report as an issue. */
    private Object A02(String str) {
        Integer num;
        SecurityException securityException;
        int i;
        int i2;
        Comparable comparable;
        String str2;
        int A03 = C0f9.A03(-1744176116);
        if (!A04(str)) {
            if (str == null) {
                str = "__NULL__";
            }
            try {
                String A032 = A03(str);
                String string = this.A00.getString(A032, null);
                if (string == null) {
                    C0f9.A0A(520924972, A03);
                    return null;
                }
                boolean z = false;
                byte[] A01 = AbstractC63099Sd0.A01(string);
                InterfaceC65518Tln interfaceC65518Tln = this.A01;
                Charset charset = StandardCharsets.UTF_8;
                ByteBuffer wrap = ByteBuffer.wrap(interfaceC65518Tln.AOR(A01, A032.getBytes(charset)));
                wrap.position(0);
                int i3 = wrap.getInt();
                if (i3 == 0) {
                    num = C05F.A00;
                } else if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                if (i3 != 5) {
                                    num = null;
                                } else {
                                    num = C05F.A0j;
                                }
                            } else {
                                num = C05F.A0Y;
                            }
                        } else {
                            num = C05F.A0N;
                        }
                    } else {
                        num = C05F.A0C;
                    }
                } else {
                    num = C05F.A01;
                }
                if (num != null) {
                    int intValue = num.intValue();
                    switch (intValue) {
                        case 0:
                            int i4 = wrap.getInt();
                            ByteBuffer slice = wrap.slice();
                            wrap.limit(i4);
                            String obj = charset.decode(slice).toString();
                            boolean equals = obj.equals("__NULL__");
                            i2 = -1383811102;
                            comparable = obj;
                            if (equals) {
                                C0f9.A0A(983975180, A03);
                                return null;
                            }
                            C0f9.A0A(i2, A03);
                            return comparable;
                        case 1:
                            C012504o c012504o = new C012504o(0);
                            while (wrap.hasRemaining()) {
                                int i5 = wrap.getInt();
                                ByteBuffer slice2 = wrap.slice();
                                slice2.limit(i5);
                                AbstractC58319PtB.A1L(wrap, i5);
                                c012504o.add(charset.decode(slice2).toString());
                            }
                            if (c012504o.size() == 1 && "__NULL__".equals(c012504o.A02[0])) {
                                C0f9.A0A(207521966, A03);
                                return null;
                            }
                            C0f9.A0A(-5803314, A03);
                            return c012504o;
                        case 2:
                            i2 = -1608400748;
                            comparable = Integer.valueOf(wrap.getInt());
                            C0f9.A0A(i2, A03);
                            return comparable;
                        case 3:
                            i2 = 1548779686;
                            comparable = Long.valueOf(wrap.getLong());
                            C0f9.A0A(i2, A03);
                            return comparable;
                        case 4:
                            i2 = 1857738525;
                            comparable = Float.valueOf(wrap.getFloat());
                            C0f9.A0A(i2, A03);
                            return comparable;
                        case 5:
                            if (wrap.get() != 0) {
                                z = true;
                            }
                            i2 = 599770136;
                            comparable = Boolean.valueOf(z);
                            C0f9.A0A(i2, A03);
                            return comparable;
                        default:
                            switch (intValue) {
                                case 1:
                                    str2 = "STRING_SET";
                                    break;
                                case 2:
                                    str2 = "INT";
                                    break;
                                case 3:
                                    str2 = ToastModule.DURATION_LONG_KEY;
                                    break;
                                case 4:
                                    str2 = "FLOAT";
                                    break;
                                case 5:
                                    str2 = "BOOLEAN";
                                    break;
                                default:
                                    str2 = "STRING";
                                    break;
                            }
                            securityException = AbstractC58319PtB.A0o("Unhandled type for encrypted pref value: ", str2);
                            i = 2072270220;
                            break;
                    }
                } else {
                    securityException = new SecurityException(AnonymousClass001.A0O("Unknown type ID for encrypted pref value: ", i3));
                    i = 97817828;
                }
                C0f9.A0A(i, A03);
                throw securityException;
            } catch (GeneralSecurityException e) {
                SecurityException securityException2 = new SecurityException(AbstractC166997dE.A0y("Could not decrypt value. ", e), e);
                C0f9.A0A(-907744402, A03);
                throw securityException2;
            }
        }
        SecurityException A0o = AbstractC58319PtB.A0o(str, " is a reserved key for the encryption keyset.");
        C0f9.A0A(118500844, A03);
        throw A0o;
    }

    public final String A03(String str) {
        int A03 = C0f9.A03(-984523322);
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String A00 = AbstractC63099Sd0.A00(this.A02.ASN(str.getBytes(StandardCharsets.UTF_8), "hpke_key_storage".getBytes()));
            C0f9.A0A(1559495530, A03);
            return A00;
        } catch (GeneralSecurityException e) {
            SecurityException securityException = new SecurityException(AbstractC166997dE.A0y("Could not encrypt key. ", e), e);
            C0f9.A0A(2022963795, A03);
            throw securityException;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if ("__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(r5) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A04(java.lang.String r5) {
        /*
            r4 = this;
            r0 = -971340364(0xffffffffc61a85b4, float:-9889.426)
            int r3 = X.C0f9.A03(r0)
            java.lang.String r0 = "__androidx_security_crypto_encrypted_prefs_key_keyset__"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L1b
            java.lang.String r0 = "__androidx_security_crypto_encrypted_prefs_value_keyset__"
            boolean r2 = r0.equals(r5)
            r1 = 0
            r0 = -2103993837(0xffffffff82979a13, float:-2.227589E-37)
            if (r2 == 0) goto L1f
        L1b:
            r1 = 1
            r0 = 1609493432(0x5feeebb8, float:3.4432113E19)
        L1f:
            X.C0f9.A0A(r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SharedPreferencesC63448SkR.A04(java.lang.String):boolean");
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        int A03 = C0f9.A03(72556438);
        if (!A04(str)) {
            boolean contains = this.A00.contains(A03(str));
            C0f9.A0A(767669160, A03);
            return contains;
        }
        SecurityException A0o = AbstractC58319PtB.A0o(str, " is a reserved key for the encryption keyset.");
        C0f9.A0A(812006849, A03);
        throw A0o;
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        int A03 = C0f9.A03(1167497124);
        SharedPreferencesEditorC63447SkQ sharedPreferencesEditorC63447SkQ = new SharedPreferencesEditorC63447SkQ(this.A00.edit(), this);
        C0f9.A0A(-320757219, A03);
        return sharedPreferencesEditorC63447SkQ;
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        int A03 = C0f9.A03(6185780);
        HashMap A1G = AbstractC166987dD.A1G();
        Iterator A15 = AbstractC166997dE.A15(this.A00.getAll());
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            if (!A04(AbstractC31172DnG.A17(A1K))) {
                String A17 = AbstractC31172DnG.A17(A1K);
                int A032 = C0f9.A03(-389898978);
                try {
                    String A0m = AbstractC58318PtA.A0m(StandardCharsets.UTF_8, this.A02.AOS(AbstractC63099Sd0.A01(A17), "hpke_key_storage".getBytes()));
                    if (A0m.equals("__NULL__")) {
                        A0m = null;
                    }
                    C0f9.A0A(2069282356, A032);
                    A1G.put(A0m, A02(A0m));
                } catch (GeneralSecurityException e) {
                    SecurityException securityException = new SecurityException(AbstractC166997dE.A0y("Could not decrypt key. ", e), e);
                    C0f9.A0A(2095253197, A032);
                    throw securityException;
                }
            }
        }
        C0f9.A0A(969624289, A03);
        return A1G;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        int A03 = C0f9.A03(-1421452866);
        Object A02 = A02(str);
        if (A02 != null && (A02 instanceof Boolean)) {
            z = AbstractC166987dD.A1a(A02);
        }
        C0f9.A0A(-1092058375, A03);
        return z;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        int A03 = C0f9.A03(1603459862);
        Object A02 = A02(str);
        if (A02 != null && (A02 instanceof Float)) {
            f = AbstractC166987dD.A09(A02);
        }
        C0f9.A0A(1347861230, A03);
        return f;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        int A03 = C0f9.A03(-2117106430);
        Object A02 = A02(str);
        if (A02 != null && (A02 instanceof Integer)) {
            i = AbstractC166987dD.A0H(A02);
        }
        C0f9.A0A(-2063711409, A03);
        return i;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        int A03 = C0f9.A03(1574676678);
        Object A02 = A02(str);
        if (A02 != null && (A02 instanceof Long)) {
            j = AbstractC166987dD.A0N(A02);
        }
        C0f9.A0A(-369074245, A03);
        return j;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        int A03 = C0f9.A03(-363136516);
        Object A02 = A02(str);
        if (A02 != null && (A02 instanceof String)) {
            str2 = (String) A02;
        }
        C0f9.A0A(-1648736764, A03);
        return str2;
    }

    @Override // android.content.SharedPreferences
    public final java.util.Set getStringSet(String str, java.util.Set set) {
        java.util.Set c012504o;
        int A03 = C0f9.A03(-1786496857);
        Object A02 = A02(str);
        if (A02 instanceof java.util.Set) {
            c012504o = (java.util.Set) A02;
        } else {
            c012504o = new C012504o(0);
        }
        if (c012504o.size() > 0) {
            set = c012504o;
        }
        C0f9.A0A(-1979043509, A03);
        return set;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        int A03 = C0f9.A03(-1369072202);
        this.A04.add(onSharedPreferenceChangeListener);
        C0f9.A0A(-1464660628, A03);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        int A03 = C0f9.A03(1418184939);
        this.A04.remove(onSharedPreferenceChangeListener);
        C0f9.A0A(1053738293, A03);
    }
}
