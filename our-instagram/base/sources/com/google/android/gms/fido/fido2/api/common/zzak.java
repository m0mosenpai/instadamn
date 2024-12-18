package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC128825rw;
import X.AbstractC166987dD;
import X.AbstractC31171DnF;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.AbstractC58323PtF;
import X.AbstractC62205S2a;
import X.AnonymousClass001;
import X.C63474SlF;
import X.SSJ;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class zzak extends AbstractSafeParcelable {
    public final byte[][] A00;
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(71);
    public static final byte[] A01 = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);

    public static zzak A00(JSONObject jSONObject, boolean z) {
        byte[] decode;
        byte[] A03;
        byte[] A032;
        ArrayList A1E = AbstractC166987dD.A1E();
        try {
            if (jSONObject.has("eval")) {
                A1E.add(null);
                if (z) {
                    A032 = A02(jSONObject.getJSONObject("eval"));
                } else {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("eval");
                    A032 = A03(AbstractC58323PtF.A1a("first", jSONObject2));
                    if (jSONObject2.has("second")) {
                        A032 = AbstractC62205S2a.A00(A032, A03(AbstractC58323PtF.A1a("second", jSONObject2)));
                    }
                }
                A1E.add(A032);
            }
            if (jSONObject.has("evalByCredential")) {
                JSONObject jSONObject3 = jSONObject.getJSONObject("evalByCredential");
                Iterator<String> keys = jSONObject3.keys();
                while (keys.hasNext()) {
                    String A1B = AbstractC166987dD.A1B(keys);
                    if (A1B == null) {
                        decode = null;
                    } else {
                        decode = Base64.decode(A1B, 11);
                    }
                    A1E.add(decode);
                    if (z) {
                        A03 = A02(jSONObject3.getJSONObject(A1B));
                    } else {
                        JSONObject jSONObject4 = jSONObject3.getJSONObject(A1B);
                        A03 = A03(AbstractC58323PtF.A1a("first", jSONObject4));
                        if (jSONObject4.has("second")) {
                            A03 = AbstractC62205S2a.A00(A03, A03(AbstractC58323PtF.A1a("second", jSONObject4)));
                        }
                    }
                    A1E.add(A03);
                }
            }
            return new zzak((byte[][]) A1E.toArray(new byte[0]));
        } catch (IllegalArgumentException unused) {
            throw new JSONException("invalid base64url value");
        }
    }

    public static byte[] A02(JSONObject jSONObject) {
        byte[] A1a = AbstractC58323PtF.A1a("first", jSONObject);
        if (A1a.length == 32) {
            if (jSONObject.has("second")) {
                byte[] A1a2 = AbstractC58323PtF.A1a("second", jSONObject);
                if (A1a2.length == 32) {
                    return AbstractC62205S2a.A00(A1a, A1a2);
                }
                throw new JSONException("hashed PRF value with wrong length");
            }
            return A1a;
        }
        throw new JSONException("hashed PRF value with wrong length");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] A03(byte[] r8) {
        /*
            X.Tgn r2 = X.S7F.A00
            X.T65 r2 = (X.T65) r2
            boolean r0 = r2.A02
            if (r0 == 0) goto L18
            java.security.MessageDigest r0 = r2.A01     // Catch: java.lang.CloneNotSupportedException -> L18
            java.lang.Object r1 = r0.clone()     // Catch: java.lang.CloneNotSupportedException -> L18
            java.security.MessageDigest r1 = (java.security.MessageDigest) r1     // Catch: java.lang.CloneNotSupportedException -> L18
            int r0 = r2.A00     // Catch: java.lang.CloneNotSupportedException -> L18
            X.RMD r7 = new X.RMD     // Catch: java.lang.CloneNotSupportedException -> L18
            r7.<init>(r1, r0)     // Catch: java.lang.CloneNotSupportedException -> L18
            goto L29
        L18:
            java.security.MessageDigest r0 = r2.A01
            java.lang.String r0 = r0.getAlgorithm()
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L85
            int r0 = r2.A00
            X.RMD r7 = new X.RMD
            r7.<init>(r1, r0)
        L29:
            byte[] r6 = com.google.android.gms.fido.fido2.api.common.zzak.A01
            r6.getClass()
            int r5 = r6.length
            boolean r0 = r7.A00
            r1 = r0 ^ 1
            r0 = 1527(0x5f7, float:2.14E-42)
            java.lang.String r4 = X.AbstractC111324zv.A00(r0)
            if (r1 == 0) goto L80
            java.security.MessageDigest r3 = r7.A02
            r2 = 0
            r3.update(r6, r2, r5)
            r8.getClass()
            int r1 = r8.length
            boolean r0 = r7.A00
            r0 = r0 ^ 1
            if (r0 == 0) goto L7b
            r3.update(r8, r2, r1)
            boolean r0 = r7.A00
            r0 = r0 ^ 1
            if (r0 == 0) goto L76
            r0 = 1
            r7.A00 = r0
            int r1 = r7.A01
            int r0 = r3.getDigestLength()
            if (r1 != r0) goto L6d
            byte[] r1 = r3.digest()
        L63:
            X.RME r0 = new X.RME
            r0.<init>(r1)
            byte[] r0 = r0.A00()
            return r0
        L6d:
            byte[] r0 = r3.digest()
            byte[] r1 = java.util.Arrays.copyOf(r0, r1)
            goto L63
        L76:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r4)
            throw r0
        L7b:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r4)
            throw r0
        L80:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r4)
            throw r0
        L85:
            r0 = move-exception
            java.lang.AssertionError r0 = X.AbstractC58318PtA.A0W(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.zzak.A03(byte[]):byte[]");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzak)) {
            return false;
        }
        return Arrays.deepEquals(this.A00, ((zzak) obj).A00);
    }

    public final int hashCode() {
        int i = 0;
        for (byte[] bArr : this.A00) {
            if (bArr != null) {
                i ^= AbstractC58322PtE.A08(bArr);
            }
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[][] bArr = this.A00;
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A0I(parcel, bArr, 1);
        AbstractC128825rw.A06(parcel, A04);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r6[r3] != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzak(byte[][] r6) {
        /*
            r5 = this;
            r5.<init>()
            r2 = 1
            boolean r0 = X.AbstractC167007dF.A1W(r6)
            X.C3U5.A07(r0)
            int r4 = r6.length
            r0 = r4 & 1
            r1 = r0 ^ 1
            r0 = 1
            if (r2 == r1) goto L14
            r0 = 0
        L14:
            X.C3U5.A07(r0)
            r3 = 0
        L18:
            if (r3 >= r4) goto L43
            if (r3 == 0) goto L21
            r1 = r6[r3]
            r0 = 0
            if (r1 == 0) goto L22
        L21:
            r0 = 1
        L22:
            X.C3U5.A07(r0)
            int r1 = r3 + 1
            r0 = r6[r1]
            boolean r0 = X.AbstractC167007dF.A1W(r0)
            X.C3U5.A07(r0)
            r0 = r6[r1]
            int r2 = r0.length
            r0 = 32
            if (r2 == r0) goto L3c
            r1 = 64
            r0 = 0
            if (r2 != r1) goto L3d
        L3c:
            r0 = 1
        L3d:
            X.C3U5.A07(r0)
            int r3 = r3 + 2
            goto L18
        L43:
            r5.A00 = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.zzak.<init>(byte[][]):void");
    }

    public static JSONObject A01(byte[] bArr) {
        JSONObject A0q = AbstractC31171DnF.A0q();
        if (bArr.length == 32) {
            A0q.put("first", AbstractC58319PtB.A0x(bArr));
            return A0q;
        }
        A0q.put("first", Base64.encodeToString(bArr, 0, 32, 11));
        A0q.put("second", Base64.encodeToString(bArr, 32, 32, 11));
        return A0q;
    }

    public final String toString() {
        try {
            JSONObject A0q = AbstractC31171DnF.A0q();
            int i = 0;
            JSONObject jSONObject = null;
            while (true) {
                byte[][] bArr = this.A00;
                if (i < bArr.length) {
                    if (bArr[i] == null) {
                        A0q.put("eval", A01(bArr[i + 1]));
                    } else {
                        if (jSONObject == null) {
                            jSONObject = AbstractC31171DnF.A0q();
                            A0q.put("evalByCredential", jSONObject);
                        }
                        jSONObject.put(SSJ.A00(bArr[i]), A01(bArr[i + 1]));
                    }
                    i += 2;
                } else {
                    return AnonymousClass001.A0g("PrfExtension{", A0q.toString(), "}");
                }
            }
        } catch (JSONException e) {
            return AnonymousClass001.A0g("PrfExtension{Exception:", e.getMessage(), "}");
        }
    }
}
