package com.google.android.gms.common.moduleinstall;

import X.AbstractC128825rw;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.C63474SlF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public class ModuleInstallStatusUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(48);
    public final int A00;
    public final int A01;
    public final int A02;
    public final Long A03;
    public final Long A04;

    public ModuleInstallStatusUpdate(Long l, Long l2, int i, int i2, int i3) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = l;
        this.A04 = l2;
        this.A02 = i3;
        if (l != null && l2 != null) {
            l2.longValue();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A05(parcel, this.A00);
        AbstractC128825rw.A07(parcel, 2, this.A01);
        Long l = this.A03;
        if (l != null) {
            parcel.writeInt(524291);
            AbstractC58318PtA.A1G(parcel, l);
        }
        Long l2 = this.A04;
        if (l2 != null) {
            parcel.writeInt(524292);
            AbstractC58318PtA.A1G(parcel, l2);
        }
        AbstractC128825rw.A07(parcel, 5, this.A02);
        AbstractC128825rw.A06(parcel, A04);
    }
}
