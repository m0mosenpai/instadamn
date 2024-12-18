package com.google.android.gms.auth.api.accounttransfer;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.C20030yX;
import X.C63470SlB;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.internal.auth.zzbz;
import java.util.List;

/* loaded from: classes10.dex */
public final class zzs extends zzbz {
    public static final C20030yX A06;
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(89);
    public List A00;
    public List A01;
    public List A02;
    public List A03;
    public List A04;
    public final int A05;

    static {
        C20030yX A0A = AbstractC58319PtB.A0A();
        A06 = A0A;
        A0A.put("registered", FastJsonResponse$Field.A00("registered", 2));
        A0A.put("in_progress", FastJsonResponse$Field.A00("in_progress", 3));
        A0A.put("success", FastJsonResponse$Field.A00("success", 4));
        A0A.put("failed", FastJsonResponse$Field.A00("failed", 5));
        A0A.put("escrowed", FastJsonResponse$Field.A00("escrowed", 6));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A062 = AbstractC58322PtE.A06(parcel, this.A05);
        AbstractC128825rw.A0D(parcel, this.A00, 2);
        AbstractC128825rw.A0D(parcel, this.A01, 3);
        AbstractC128825rw.A0D(parcel, this.A02, 4);
        AbstractC128825rw.A0D(parcel, this.A03, 5);
        AbstractC128825rw.A0D(parcel, this.A04, 6);
        AbstractC128825rw.A06(parcel, A062);
    }

    public zzs(List list, List list2, List list3, List list4, List list5, int i) {
        this.A05 = i;
        this.A00 = list;
        this.A01 = list2;
        this.A02 = list3;
        this.A03 = list4;
        this.A04 = list5;
    }

    public zzs() {
        this.A05 = 1;
    }
}
