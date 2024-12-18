package com.google.android.gms.auth.api.accounttransfer;

import X.AbstractC128825rw;
import X.AbstractC166987dD;
import X.AbstractC58319PtB;
import X.C63470SlB;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes10.dex */
public final class zzo extends zzbz {
    public static final HashMap A05;
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(88);
    public zzs A00;
    public ArrayList A01;
    public int A02;
    public final int A03;
    public final Set A04;

    static {
        HashMap A1G = AbstractC166987dD.A1G();
        A05 = A1G;
        A1G.put(PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_DATA, new FastJsonResponse$Field(zzu.class, PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_DATA, 11, 11, 2, true, true));
        A1G.put(ReactProgressBarViewManager.PROP_PROGRESS, new FastJsonResponse$Field(zzs.class, ReactProgressBarViewManager.PROP_PROGRESS, 11, 11, 4, false, false));
    }

    public zzo() {
        this.A04 = new HashSet(1);
        this.A03 = 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        Set set = this.A04;
        if (AbstractC58319PtB.A1W(set, 1)) {
            AbstractC128825rw.A07(parcel, 1, this.A03);
        }
        if (AbstractC58319PtB.A1W(set, 2)) {
            AbstractC128825rw.A0E(parcel, this.A01, 2, true);
        }
        if (AbstractC58319PtB.A1W(set, 3)) {
            AbstractC128825rw.A07(parcel, 3, this.A02);
        }
        if (AbstractC58319PtB.A1W(set, 4)) {
            AbstractC128825rw.A0A(parcel, this.A00, 4, i, true);
        }
        AbstractC128825rw.A06(parcel, A04);
    }

    public zzo(zzs zzsVar, ArrayList arrayList, Set set, int i, int i2) {
        this.A04 = set;
        this.A03 = i;
        this.A01 = arrayList;
        this.A02 = i2;
        this.A00 = zzsVar;
    }
}
