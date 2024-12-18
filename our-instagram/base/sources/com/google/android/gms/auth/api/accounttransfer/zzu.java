package com.google.android.gms.auth.api.accounttransfer;

import X.AbstractC128825rw;
import X.AbstractC166987dD;
import X.AbstractC58319PtB;
import X.C63470SlB;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes10.dex */
public final class zzu extends zzbz {
    public static final HashMap A06;
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(90);
    public zzw A00;
    public String A01;
    public String A02;
    public String A03;
    public final int A04;
    public final Set A05;

    static {
        HashMap A1G = AbstractC166987dD.A1G();
        A06 = A1G;
        A1G.put("authenticatorInfo", new FastJsonResponse$Field(zzw.class, "authenticatorInfo", 11, 11, 2, false, false));
        A1G.put(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE, new FastJsonResponse$Field(null, PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE, 7, 7, 3, false, false));
        A1G.put("package", new FastJsonResponse$Field(null, "package", 7, 7, 4, false, false));
    }

    public zzu(zzw zzwVar, String str, String str2, String str3, Set set, int i) {
        this.A05 = set;
        this.A04 = i;
        this.A00 = zzwVar;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        Set set = this.A05;
        if (AbstractC58319PtB.A1W(set, 1)) {
            AbstractC128825rw.A07(parcel, 1, this.A04);
        }
        if (AbstractC58319PtB.A1W(set, 2)) {
            AbstractC128825rw.A0A(parcel, this.A00, 2, i, true);
        }
        if (AbstractC58319PtB.A1W(set, 3)) {
            AbstractC128825rw.A0C(parcel, this.A01, 3, true);
        }
        if (AbstractC58319PtB.A1W(set, 4)) {
            AbstractC128825rw.A0C(parcel, this.A02, 4, true);
        }
        if (AbstractC58319PtB.A1W(set, 5)) {
            AbstractC128825rw.A0C(parcel, this.A03, 5, true);
        }
        AbstractC128825rw.A06(parcel, A04);
    }

    public zzu() {
        this.A05 = new HashSet(3);
        this.A04 = 1;
    }
}
