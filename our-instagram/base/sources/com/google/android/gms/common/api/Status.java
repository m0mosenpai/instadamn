package com.google.android.gms.common.api;

import X.AbstractC128825rw;
import X.C206149Aw;
import X.C61j;
import X.C62715SNe;
import X.S2M;
import X.SSI;
import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class Status extends AbstractSafeParcelable implements C61j, ReflectedParcelable {
    public final int A00;
    public final PendingIntent A01;
    public final ConnectionResult A02;
    public final String A03;
    public static final Status A09 = new Status(-1, null);
    public static final Status A08 = new Status(0, null);
    public static final Status A07 = new Status(14, null);
    public static final Status A06 = new Status(8, null);
    public static final Status A0A = new Status(15, null);
    public static final Status A04 = new Status(16, null);
    public static final Status A0B = new Status(17, null);
    public static final Status A05 = new Status(18, null);
    public static final Parcelable.Creator CREATOR = new C206149Aw(30);

    public Status(int i, String str) {
        this(null, null, str, i);
    }

    @Override // X.C61j
    public final Status C0F() {
        return this;
    }

    public final void A00(Activity activity, int i) {
        PendingIntent pendingIntent = this.A01;
        if (pendingIntent != null) {
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, null, 0, 0, 0);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.A00 != status.A00 || !SSI.A01(this.A03, status.A03) || !SSI.A01(this.A01, status.A01) || !SSI.A01(this.A02, status.A02)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), this.A03, this.A01, this.A02});
    }

    public final String toString() {
        C62715SNe c62715SNe = new C62715SNe(this);
        String str = this.A03;
        if (str == null) {
            str = S2M.A00(this.A00);
        }
        c62715SNe.A00(str, "statusCode");
        c62715SNe.A00(this.A01, "resolution");
        return c62715SNe.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A01 = AbstractC128825rw.A01(parcel, 20293);
        AbstractC128825rw.A05(parcel, this.A00);
        AbstractC128825rw.A0B(parcel, this.A03);
        AbstractC128825rw.A0A(parcel, this.A01, 3, i, false);
        AbstractC128825rw.A0A(parcel, this.A02, 4, i, false);
        AbstractC128825rw.A06(parcel, A01);
    }

    public Status(PendingIntent pendingIntent, ConnectionResult connectionResult, String str, int i) {
        this.A00 = i;
        this.A03 = str;
        this.A01 = pendingIntent;
        this.A02 = connectionResult;
    }
}
