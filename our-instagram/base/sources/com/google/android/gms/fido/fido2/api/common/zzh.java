package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC128825rw;
import X.AbstractC31171DnF;
import X.AbstractC37301Gc2;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.AbstractC64537TIt;
import X.AnonymousClass001;
import X.C63474SlF;
import X.SSI;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(93);
    public final AbstractC64537TIt A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzhVar = (zzh) obj;
        if (this.A01 != zzhVar.A01) {
            return false;
        }
        return SSI.A00(this.A00, zzhVar.A00);
    }

    public final int hashCode() {
        return AbstractC37301Gc2.A02(Boolean.valueOf(this.A01), this.A00);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.A01;
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A09(parcel, 1, z);
        AbstractC128825rw.A0F(parcel, AbstractC58322PtE.A1Z(this.A00), 2, false);
        AbstractC128825rw.A06(parcel, A04);
    }

    public zzh(AbstractC64537TIt abstractC64537TIt, boolean z) {
        this.A01 = z;
        this.A00 = abstractC64537TIt;
    }

    public final JSONObject A00() {
        byte[] A03;
        try {
            JSONObject A0q = AbstractC31171DnF.A0q();
            if (this.A01) {
                A0q.put("enabled", true);
            }
            AbstractC64537TIt abstractC64537TIt = this.A00;
            if (abstractC64537TIt != null) {
                A03 = abstractC64537TIt.A03();
            } else {
                A03 = null;
            }
            if (A03 != null) {
                JSONObject A0q2 = AbstractC31171DnF.A0q();
                A0q2.put("first", Base64.encodeToString(Arrays.copyOf(A03, 32), 11));
                if (A03.length == 64) {
                    A0q2.put("second", Base64.encodeToString(Arrays.copyOfRange(A03, 32, 64), 11));
                }
                A0q.put("results", A0q2);
            }
            return A0q;
        } catch (JSONException e) {
            throw AbstractC58318PtA.A0e("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e);
        }
    }

    public final String toString() {
        return AnonymousClass001.A0g("AuthenticationExtensionsPrfOutputs{", A00().toString(), "}");
    }
}
