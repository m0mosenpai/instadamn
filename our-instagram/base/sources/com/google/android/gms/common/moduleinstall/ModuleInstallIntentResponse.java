package com.google.android.gms.common.moduleinstall;

import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.C63474SlF;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public class ModuleInstallIntentResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(46);
    public final PendingIntent A00;

    public ModuleInstallIntentResponse(PendingIntent pendingIntent) {
        this.A00 = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC58320PtC.A1G(parcel, this.A00, i, AbstractC58319PtB.A04(parcel));
    }
}
