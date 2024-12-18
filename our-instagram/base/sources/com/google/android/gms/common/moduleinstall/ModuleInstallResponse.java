package com.google.android.gms.common.moduleinstall;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.C63474SlF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public class ModuleInstallResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(47);
    public final int A00;
    public final boolean A01;

    public ModuleInstallResponse(int i, boolean z) {
        this.A00 = i;
        this.A01 = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A05(parcel, this.A00);
        AbstractC128825rw.A09(parcel, 2, this.A01);
        AbstractC128825rw.A06(parcel, A04);
    }
}
