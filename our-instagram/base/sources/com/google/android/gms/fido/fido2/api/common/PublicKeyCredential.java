package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC58322PtE;
import X.AbstractC64537TIt;
import X.C00O;
import X.C63474SlF;
import X.C73287XzX;
import X.SSI;
import X.SSJ;
import X.T63;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes10.dex */
public class PublicKeyCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(73);
    public final AuthenticationExtensionsClientOutputs A00;
    public final AuthenticatorAssertionResponse A01;
    public final AuthenticatorAttestationResponse A02;
    public final AuthenticatorErrorResponse A03;
    public final AbstractC64537TIt A04;
    public final String A05;
    public final String A06;
    public final String A07;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x000d, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        if (r8 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0009, code lost:
    
        if (r6 == null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000b, code lost:
    
        if (r8 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0035, code lost:
    
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PublicKeyCredential(com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs r5, com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse r6, com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse r7, com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, byte[] r12) {
        /*
            r4 = this;
            if (r12 != 0) goto L37
            r3 = 0
        L3:
            r4.<init>()
            r2 = 1
            if (r7 == 0) goto L31
            if (r6 != 0) goto Ld
        Lb:
            if (r8 == 0) goto L35
        Ld:
            r1 = 0
        Le:
            java.lang.String r0 = "Must provide a response object."
            X.C3U5.A08(r1, r0)
            if (r8 != 0) goto L19
            if (r9 == 0) goto L2f
            if (r3 == 0) goto L2f
        L19:
            java.lang.String r0 = "Must provide id and rawId if not an error response."
            X.C3U5.A08(r2, r0)
            r4.A05 = r9
            r4.A06 = r10
            r4.A04 = r3
            r4.A02 = r7
            r4.A01 = r6
            r4.A03 = r8
            r4.A00 = r5
            r4.A07 = r11
            return
        L2f:
            r2 = 0
            goto L19
        L31:
            if (r6 != 0) goto Lb
            if (r8 == 0) goto Ld
        L35:
            r1 = 1
            goto Le
        L37:
            int r0 = r12.length
            X.RMJ r3 = X.AbstractC64537TIt.A01(r12, r0)
            goto L3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.PublicKeyCredential.<init>(com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs, com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse, com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse, com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse, java.lang.String, java.lang.String, java.lang.String, byte[]):void");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredential)) {
            return false;
        }
        PublicKeyCredential publicKeyCredential = (PublicKeyCredential) obj;
        if (!SSI.A01(this.A05, publicKeyCredential.A05) || !SSI.A01(this.A06, publicKeyCredential.A06) || !SSI.A01(this.A04, publicKeyCredential.A04) || !SSI.A01(this.A02, publicKeyCredential.A02) || !SSI.A01(this.A01, publicKeyCredential.A01) || !SSI.A01(this.A03, publicKeyCredential.A03) || !SSI.A01(this.A00, publicKeyCredential.A00)) {
            return false;
        }
        return SSI.A00(this.A07, publicKeyCredential.A07);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A05, this.A06, this.A04, this.A01, this.A02, this.A03, this.A00, this.A07});
    }

    public final String toString() {
        byte[] A1Z = AbstractC58322PtE.A1Z(this.A04);
        String str = this.A06;
        String str2 = this.A05;
        AuthenticatorAttestationResponse authenticatorAttestationResponse = this.A02;
        AuthenticatorAssertionResponse authenticatorAssertionResponse = this.A01;
        AuthenticatorErrorResponse authenticatorErrorResponse = this.A03;
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = this.A00;
        String str3 = this.A07;
        String A00 = SSJ.A00(A1Z);
        String valueOf = String.valueOf(authenticatorAttestationResponse);
        String valueOf2 = String.valueOf(authenticatorAssertionResponse);
        String valueOf3 = String.valueOf(authenticatorErrorResponse);
        String valueOf4 = String.valueOf(authenticationExtensionsClientOutputs);
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("PublicKeyCredential{\n id='");
        A1C.append(str2);
        A1C.append("', \n type='");
        A1C.append(str);
        A1C.append("', \n rawId=");
        A1C.append(A00);
        A1C.append(", \n registerResponse=");
        A1C.append(valueOf);
        A1C.append(", \n signResponse=");
        A1C.append(valueOf2);
        A1C.append(", \n errorResponse=");
        A1C.append(valueOf3);
        A1C.append(", \n extensionsClientOutputs=");
        A1C.append(valueOf4);
        A1C.append(", \n authenticatorAttachment='");
        A1C.append(str3);
        return AbstractC166997dE.A0x("'}", A1C);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        T63.A01.A00.FFc();
        C73287XzX.A0A.FFc();
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0260 A[Catch: JSONException -> 0x02e5, JSONException -> 0x0311, TRY_LEAVE, TryCatch #3 {JSONException -> 0x02e5, blocks: (B:47:0x0070, B:49:0x0078, B:50:0x007d, B:52:0x0081, B:53:0x0086, B:54:0x008b, B:56:0x0090, B:58:0x009e, B:60:0x00a9, B:61:0x00a4, B:64:0x00ac, B:66:0x00b6, B:70:0x00cc, B:71:0x00cf, B:73:0x00d7, B:75:0x00e8, B:76:0x00f4, B:78:0x00fe, B:79:0x0103, B:81:0x0112, B:83:0x0125, B:85:0x013e, B:87:0x014c, B:88:0x014e, B:90:0x0156, B:91:0x015b, B:95:0x0177, B:96:0x017a, B:97:0x0180, B:102:0x0194, B:108:0x0252, B:110:0x0260, B:112:0x01b2, B:114:0x01ba, B:119:0x01cc, B:122:0x01dc, B:124:0x01f2, B:126:0x01f8, B:127:0x0270, B:128:0x0274, B:129:0x020f, B:135:0x021e, B:137:0x0226, B:139:0x0234, B:140:0x0247, B:142:0x024c, B:144:0x026b, B:147:0x02b8, B:148:0x02bf, B:149:0x0277, B:156:0x027d, B:157:0x0280, B:161:0x016c, B:163:0x0282, B:165:0x028a, B:166:0x0290, B:168:0x0292, B:171:0x029a, B:172:0x02a0, B:174:0x02a2, B:181:0x02ab, B:182:0x02ae, B:186:0x02b0), top: B:46:0x0070, outer: #11 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A00() {
        /*
            Method dump skipped, instructions count: 793
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.PublicKeyCredential.A00():java.lang.String");
    }
}
