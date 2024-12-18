package com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation.igsandbox;

import X.AbstractC167017dG;
import X.C00O;
import X.C0f9;
import X.C14360o3;
import X.C83U;
import X.EnumC150616qF;
import X.InterfaceC150566q9;
import android.os.BaseBundle;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.facebook.xanalytics.XAnalyticsHolder;
import com.meta.arfx.engine.interfaces.IARAnalyticsLoggerHost;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class IgCameraARAnalyticsLoggerHost extends Binder implements InterfaceC150566q9, IARAnalyticsLoggerHost {
    public final InterfaceC150566q9 A00;

    @Override // X.InterfaceC150566q9
    public final void EW7(EnumC150616qF enumC150616qF, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        int A03 = C0f9.A03(1723037001);
        AbstractC167017dG.A1P(str2, str3);
        this.A00.EW7(enumC150616qF, str, str2, str3, str4, str5, str6, false);
        C0f9.A0A(158273572, A03);
    }

    public IgCameraARAnalyticsLoggerHost(InterfaceC150566q9 interfaceC150566q9) {
        this();
        int A03 = C0f9.A03(-526800626);
        this.A00 = interfaceC150566q9;
        C0f9.A0A(876168881, A03);
    }

    @Override // X.InterfaceC150566q9
    public final String BhE() {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC150566q9
    public final XAnalyticsHolder CI2() {
        int A03 = C0f9.A03(-1176735431);
        XAnalyticsHolder CI2 = this.A00.CI2();
        C0f9.A0A(-1470151917, A03);
        return CI2;
    }

    @Override // com.meta.arfx.engine.interfaces.IARAnalyticsLoggerHost
    public final void CjE(List list) {
        int A03 = C0f9.A03(-1397799910);
        C14360o3.A0B(list, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BaseBundle baseBundle = (BaseBundle) it.next();
            if (baseBundle.containsKey("eventType")) {
                int i = baseBundle.getInt("eventType");
                if (i == 0) {
                    if (baseBundle.containsKey("eventName") && baseBundle.containsKey("extra") && baseBundle.containsKey("eventExtraKeys") && baseBundle.containsKey("isHiPri") && baseBundle.containsKey("ts")) {
                        String string = baseBundle.getString("eventName", "");
                        String string2 = baseBundle.getString("extra", "");
                        String string3 = baseBundle.getString("eventExtraKeys", "");
                        boolean z = baseBundle.getBoolean("isHiPri");
                        XAnalyticsHolder CI2 = this.A00.CI2();
                        if (z) {
                            if (CI2 != null) {
                                CI2.logRealtimeEvent(string, string2, string3);
                            }
                        } else if (CI2 != null) {
                            CI2.logEvent(string, string2, string3);
                        }
                    }
                } else if (i == 1) {
                    if (baseBundle.containsKey("isStart")) {
                        DQN(baseBundle.getBoolean("isStart"));
                    }
                } else if (i == 2 && baseBundle.containsKey("eventName")) {
                    String string4 = baseBundle.getString("eventName", "");
                    String string5 = baseBundle.getString("jsonExtras");
                    C14360o3.A0A(string4);
                    DQM(string4, string5);
                }
            }
        }
        C0f9.A0A(257186647, A03);
    }

    @Override // X.InterfaceC150566q9
    public final void DQM(String str, String str2) {
        int A0N = AbstractC167017dG.A0N(str, -208522335);
        this.A00.DQM(str, str2);
        C0f9.A0A(815755601, A0N);
    }

    @Override // X.InterfaceC150566q9
    public final void DQN(boolean z) {
        int A03 = C0f9.A03(1362161123);
        this.A00.DQN(z);
        C0f9.A0A(874355584, A03);
    }

    @Override // X.InterfaceC150566q9
    public final void Edm(C83U c83u) {
        int A03 = C0f9.A03(2038617319);
        this.A00.Edm(c83u);
        C0f9.A0A(-525630496, A03);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        C0f9.A0A(2121290174, C0f9.A03(566252647));
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int A03 = C0f9.A03(1832208514);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.meta.arfx.engine.interfaces.IARAnalyticsLoggerHost");
                if (i == 1) {
                    CjE(parcel.createTypedArrayList(Bundle.CREATOR));
                    parcel2.writeNoException();
                    i3 = -2015173938;
                    C0f9.A0A(i3, A03);
                    return true;
                }
            } else if (i == 1598968902) {
                parcel2.writeString("com.meta.arfx.engine.interfaces.IARAnalyticsLoggerHost");
                i3 = 1470816833;
                C0f9.A0A(i3, A03);
                return true;
            }
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        C0f9.A0A(-743748201, A03);
        return onTransact;
    }

    public IgCameraARAnalyticsLoggerHost() {
        int A03 = C0f9.A03(-1954302624);
        attachInterface(this, "com.meta.arfx.engine.interfaces.IARAnalyticsLoggerHost");
        C0f9.A0A(-1580598361, A03);
    }
}
