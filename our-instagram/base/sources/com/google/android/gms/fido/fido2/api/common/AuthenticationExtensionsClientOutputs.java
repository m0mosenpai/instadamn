package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC128825rw;
import X.AbstractC31171DnF;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.AnonymousClass001;
import X.C63474SlF;
import X.SSI;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class AuthenticationExtensionsClientOutputs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(89);
    public final AuthenticationExtensionsCredPropsOutputs A00;
    public final UvmEntries A01;
    public final zzf A02;
    public final zzh A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensionsClientOutputs)) {
            return false;
        }
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) obj;
        if (!SSI.A01(this.A01, authenticationExtensionsClientOutputs.A01) || !SSI.A01(this.A02, authenticationExtensionsClientOutputs.A02) || !SSI.A01(this.A00, authenticationExtensionsClientOutputs.A00) || !SSI.A01(this.A03, authenticationExtensionsClientOutputs.A03)) {
            return false;
        }
        return SSI.A00(this.A04, authenticationExtensionsClientOutputs.A04);
    }

    public final int hashCode() {
        return AbstractC58322PtE.A09(this.A01, this.A02, this.A00, this.A03, this.A04);
    }

    public AuthenticationExtensionsClientOutputs(AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs, UvmEntries uvmEntries, zzf zzfVar, zzh zzhVar, String str) {
        this.A01 = uvmEntries;
        this.A02 = zzfVar;
        this.A00 = authenticationExtensionsCredPropsOutputs;
        this.A03 = zzhVar;
        this.A04 = str;
    }

    public final JSONObject A00() {
        try {
            JSONObject A0q = AbstractC31171DnF.A0q();
            AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = this.A00;
            if (authenticationExtensionsCredPropsOutputs != null) {
                try {
                    JSONObject A0q2 = AbstractC31171DnF.A0q();
                    A0q2.put(PublicKeyCredentialControllerUtility.JSON_KEY_RK, authenticationExtensionsCredPropsOutputs.A00);
                    A0q.put(PublicKeyCredentialControllerUtility.JSON_KEY_CRED_PROPS, A0q2);
                } catch (JSONException e) {
                    throw AbstractC58318PtA.A0e("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e);
                }
            }
            UvmEntries uvmEntries = this.A01;
            if (uvmEntries != null) {
                try {
                    JSONArray A0p = AbstractC31171DnF.A0p();
                    List list = uvmEntries.A00;
                    if (list != null) {
                        for (int i = 0; i < list.size(); i++) {
                            UvmEntry uvmEntry = (UvmEntry) list.get(i);
                            JSONArray A0p2 = AbstractC31171DnF.A0p();
                            A0p2.put((int) uvmEntry.A02);
                            A0p2.put((int) uvmEntry.A01);
                            A0p2.put((int) uvmEntry.A02);
                            A0p.put(i, A0p2);
                        }
                    }
                    A0q.put("uvm", A0p);
                } catch (JSONException e2) {
                    throw AbstractC58318PtA.A0e("Error encoding UvmEntries to JSON object", e2);
                }
            }
            zzh zzhVar = this.A03;
            if (zzhVar != null) {
                A0q.put("prf", zzhVar.A00());
            }
            Object obj = this.A04;
            if (obj != null) {
                A0q.put("txAuthSimple", obj);
            }
            return A0q;
        } catch (JSONException e3) {
            throw AbstractC58318PtA.A0e("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e3);
        }
    }

    public final String toString() {
        return AnonymousClass001.A0g("AuthenticationExtensionsClientOutputs{", A00().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A0A(parcel, this.A01, 1, i, false);
        AbstractC128825rw.A0A(parcel, this.A02, 2, i, false);
        AbstractC128825rw.A0A(parcel, this.A00, 3, i, false);
        AbstractC128825rw.A0A(parcel, this.A03, 4, i, false);
        AbstractC128825rw.A0C(parcel, this.A04, 5, false);
        AbstractC128825rw.A06(parcel, A04);
    }
}
