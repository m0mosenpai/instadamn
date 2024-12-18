package com.google.android.gms.common;

import X.AbstractC128825rw;
import X.AbstractC58317Pt9;
import X.AnonymousClass001;
import X.C206149Aw;
import X.C62715SNe;
import X.MSV;
import X.SSI;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.react.modules.dialog.DialogModule;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ConnectionResult extends AbstractSafeParcelable {
    public static final ConnectionResult A04 = new ConnectionResult(0);
    public static final Parcelable.Creator CREATOR = new C206149Aw(35);
    public final int A00;
    public final int A01;
    public final PendingIntent A02;
    public final String A03;

    public ConnectionResult(int i) {
        this(null, null, 1, i);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ConnectionResult) {
                ConnectionResult connectionResult = (ConnectionResult) obj;
                if (this.A01 != connectionResult.A01 || !SSI.A01(this.A02, connectionResult.A02) || !SSI.A01(this.A03, connectionResult.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public static String A00(int i) {
        if (i != 99) {
            if (i != 1500) {
                switch (i) {
                    case -1:
                        return "UNKNOWN";
                    case 0:
                        return "SUCCESS";
                    case 1:
                        return "SERVICE_MISSING";
                    case 2:
                        return "SERVICE_VERSION_UPDATE_REQUIRED";
                    case 3:
                        return AbstractC58317Pt9.A00(618);
                    case 4:
                        return "SIGN_IN_REQUIRED";
                    case 5:
                        return "INVALID_ACCOUNT";
                    case 6:
                        return "RESOLUTION_REQUIRED";
                    case 7:
                        return "NETWORK_ERROR";
                    case 8:
                        return MSV.A00(784);
                    case 9:
                        return "SERVICE_INVALID";
                    case 10:
                        return AbstractC58317Pt9.A00(545);
                    case 11:
                        return "LICENSE_CHECK_FAILED";
                    default:
                        switch (i) {
                            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                                return "CANCELED";
                            case 14:
                                return "TIMEOUT";
                            case Process.SIGTERM /* 15 */:
                                return MSV.A00(346);
                            case 16:
                                return "API_UNAVAILABLE";
                            case 17:
                                return "SIGN_IN_FAILED";
                            case 18:
                                return "SERVICE_UPDATING";
                            case Process.SIGSTOP /* 19 */:
                                return "SERVICE_MISSING_PERMISSION";
                            case 20:
                                return "RESTRICTED_PROFILE";
                            case 21:
                                return "API_VERSION_UPDATE_REQUIRED";
                            case 22:
                                return "RESOLUTION_ACTIVITY_NOT_FOUND";
                            case 23:
                                return "API_DISABLED";
                            case 24:
                                return "API_DISABLED_FOR_CONNECTION";
                            default:
                                return AnonymousClass001.A0c("UNKNOWN_ERROR_CODE(", ")", i);
                        }
                }
            }
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        return "UNFINISHED";
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A01), this.A02, this.A03});
    }

    public final String toString() {
        C62715SNe c62715SNe = new C62715SNe(this);
        c62715SNe.A00(A00(this.A01), "statusCode");
        c62715SNe.A00(this.A02, "resolution");
        c62715SNe.A00(this.A03, DialogModule.KEY_MESSAGE);
        return c62715SNe.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.A00;
        int A01 = AbstractC128825rw.A01(parcel, 20293);
        AbstractC128825rw.A05(parcel, i2);
        AbstractC128825rw.A07(parcel, 2, this.A01);
        AbstractC128825rw.A0A(parcel, this.A02, 3, i, false);
        AbstractC128825rw.A0C(parcel, this.A03, 4, false);
        AbstractC128825rw.A06(parcel, A01);
    }

    public ConnectionResult(PendingIntent pendingIntent, String str, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = pendingIntent;
        this.A03 = str;
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(pendingIntent, null, 1, i);
    }
}
