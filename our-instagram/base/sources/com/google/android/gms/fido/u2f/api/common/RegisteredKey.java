package com.google.android.gms.fido.u2f.api.common;

import X.AbstractC128825rw;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.C3U5;
import X.C63471SlC;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes10.dex */
public class RegisteredKey extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(16);
    public String A00;
    public final KeyHandle A01;
    public final String A02;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
    
        if (r0 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L33
            boolean r0 = r5 instanceof com.google.android.gms.fido.u2f.api.common.RegisteredKey
            r2 = 0
            if (r0 == 0) goto L24
            com.google.android.gms.fido.u2f.api.common.RegisteredKey r5 = (com.google.android.gms.fido.u2f.api.common.RegisteredKey) r5
            java.lang.String r1 = r4.A00
            java.lang.String r0 = r5.A00
            if (r1 != 0) goto L25
            if (r0 != 0) goto L24
        L12:
            com.google.android.gms.fido.u2f.api.common.KeyHandle r1 = r4.A01
            com.google.android.gms.fido.u2f.api.common.KeyHandle r0 = r5.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L24
            java.lang.String r1 = r4.A02
            java.lang.String r0 = r5.A02
            if (r1 != 0) goto L2c
            if (r0 == 0) goto L33
        L24:
            return r2
        L25:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L12
            return r2
        L2c:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L33
            return r2
        L33:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.u2f.api.common.RegisteredKey.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int A0I = AbstractC166987dD.A0I(this.A01, (AbstractC167017dG.A0O(this.A00) + 31) * 31);
        return (A0I * 31) + AbstractC25227BEk.A07(this.A02);
    }

    public RegisteredKey(KeyHandle keyHandle, String str, String str2) {
        C3U5.A02(keyHandle);
        this.A01 = keyHandle;
        this.A00 = str;
        this.A02 = str2;
    }

    public final String toString() {
        try {
            JSONObject A0q = AbstractC31171DnF.A0q();
            KeyHandle keyHandle = this.A01;
            A0q.put("keyHandle", AbstractC58319PtB.A0x(keyHandle.A03));
            ProtocolVersion protocolVersion = keyHandle.A01;
            if (protocolVersion != ProtocolVersion.UNKNOWN) {
                A0q.put("version", protocolVersion.toString());
            }
            List list = keyHandle.A02;
            if (list != null) {
                A0q.put(PublicKeyCredentialControllerUtility.JSON_KEY_TRANSPORTS, list.toString());
            }
            String str = this.A00;
            if (str != null) {
                A0q.put(PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE, str);
            }
            String str2 = this.A02;
            if (str2 != null) {
                A0q.put("appId", str2);
            }
            return A0q.toString();
        } catch (JSONException e) {
            throw AbstractC58318PtA.A0f(e);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        boolean A1U = AbstractC58322PtE.A1U(parcel, this.A01, i);
        AbstractC128825rw.A0C(parcel, this.A00, 3, A1U);
        AbstractC58322PtE.A1F(parcel, this.A02, A04, A1U);
    }
}
