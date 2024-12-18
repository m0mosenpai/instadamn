package com.google.android.gms.common.internal;

import X.C0f9;
import X.C125735mL;
import X.C125745mM;
import X.C125755mO;
import X.C3U5;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.common.zzb;

/* loaded from: classes3.dex */
public final class zzd extends zzb implements IGmsCallbacks {
    public BaseGmsClient A00;
    public final int A01;

    public zzd(BaseGmsClient baseGmsClient, int i) {
        this();
        int A03 = C0f9.A03(1789541247);
        this.A00 = baseGmsClient;
        this.A01 = i;
        C0f9.A0A(986536137, A03);
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean A02(int i, Parcel parcel, Parcel parcel2, int i2) {
        Parcelable parcelable;
        int A03;
        int i3;
        Parcelable parcelable2;
        RootTelemetryConfiguration rootTelemetryConfiguration;
        int A032 = C0f9.A03(-2012596348);
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    C0f9.A0A(979806786, A032);
                    return false;
                }
                int readInt = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                Parcelable.Creator creator = zzk.CREATOR;
                if (parcel.readInt() == 0) {
                    parcelable2 = null;
                } else {
                    parcelable2 = (Parcelable) creator.createFromParcel(parcel);
                }
                zzk zzkVar = (zzk) parcelable2;
                C125735mL.A00(parcel);
                A03 = C0f9.A03(-282690142);
                BaseGmsClient baseGmsClient = this.A00;
                C3U5.A03(baseGmsClient, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                C3U5.A02(zzkVar);
                baseGmsClient.A0Q = zzkVar;
                if (baseGmsClient.A09()) {
                    ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzkVar.A02;
                    C125745mM A00 = C125745mM.A00();
                    if (connectionTelemetryConfiguration == null) {
                        rootTelemetryConfiguration = null;
                    } else {
                        rootTelemetryConfiguration = connectionTelemetryConfiguration.A01;
                    }
                    synchronized (A00) {
                        if (rootTelemetryConfiguration != null) {
                            RootTelemetryConfiguration rootTelemetryConfiguration2 = A00.A00;
                            if (rootTelemetryConfiguration2 != null) {
                                if (rootTelemetryConfiguration2.A00 < rootTelemetryConfiguration.A00) {
                                }
                            }
                        } else {
                            rootTelemetryConfiguration = C125745mM.A02;
                        }
                        A00.A00 = rootTelemetryConfiguration;
                    }
                }
                A03(zzkVar.A01, readStrongBinder, readInt);
                i3 = -1455341776;
            } else {
                parcel.readInt();
                Parcelable.Creator creator2 = Bundle.CREATOR;
                if (parcel.readInt() != 0) {
                    creator2.createFromParcel(parcel);
                }
                C125735mL.A00(parcel);
                A03 = C0f9.A03(1205045639);
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
                i3 = 1081273689;
            }
            C0f9.A0A(i3, A03);
        } else {
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            Parcelable.Creator creator3 = Bundle.CREATOR;
            if (parcel.readInt() == 0) {
                parcelable = null;
            } else {
                parcelable = (Parcelable) creator3.createFromParcel(parcel);
            }
            C125735mL.A00(parcel);
            A03((Bundle) parcelable, readStrongBinder2, readInt2);
        }
        parcel2.writeNoException();
        C0f9.A0A(-1834004981, A032);
        return true;
    }

    public final void A03(Bundle bundle, IBinder iBinder, int i) {
        int A03 = C0f9.A03(-2065250662);
        C3U5.A03(this.A00, "onPostInitComplete can be called only once per call to getRemoteService");
        BaseGmsClient baseGmsClient = this.A00;
        int i2 = this.A01;
        C125755mO c125755mO = new C125755mO(bundle, iBinder, baseGmsClient, i);
        Handler handler = baseGmsClient.A0G;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, c125755mO));
        this.A00 = null;
        C0f9.A0A(1797520623, A03);
    }

    public zzd() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        C0f9.A0A(-2092427052, C0f9.A03(-1315334273));
    }
}
