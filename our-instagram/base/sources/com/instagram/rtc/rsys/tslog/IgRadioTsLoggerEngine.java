package com.instagram.rtc.rsys.tslog;

import X.AbstractC15820qc;
import X.AbstractC167017dG;
import X.C06090Tz;
import X.C108364uN;
import X.C108404uR;
import X.C14360o3;
import X.C15670qN;
import X.C18150uz;
import X.C18U;
import X.C1CY;
import X.C1EQ;
import X.C1HW;
import X.C1HX;
import X.C23441Cg;
import X.C72817Xnh;
import X.InterfaceC15680qO;
import android.content.Context;
import android.net.NetworkInfo;
import com.facebook.rsys.tslog.gen.TslogStreamApi;
import com.instagram.common.session.UserSession;

/* loaded from: classes12.dex */
public final class IgRadioTsLoggerEngine implements C1HW, InterfaceC15680qO {
    public final Context appContext;
    public final C23441Cg cellInfoProvider;
    public final C72817Xnh counters;
    public final long kOffset;
    public final C108404uR wifiInfoProvider;

    @Override // X.C1HW
    public void onCellIdentityChanged(C1HX c1hx) {
    }

    @Override // X.C1HW
    public void onCellSignalStrengthChanged(C1EQ c1eq) {
        C14360o3.A0B(c1eq, 0);
        C72817Xnh c72817Xnh = this.counters;
        synchronized (c72817Xnh) {
            c72817Xnh.A01 = c1eq;
            c72817Xnh.A08.addSample(1);
        }
    }

    @Override // X.InterfaceC15680qO
    public void onConnectionChanged(NetworkInfo networkInfo) {
        C72817Xnh c72817Xnh = this.counters;
        synchronized (c72817Xnh) {
            c72817Xnh.A01 = null;
            c72817Xnh.A00 = AbstractC15820qc.A02(c72817Xnh.A0C.appContext);
        }
    }

    public final void start() {
        C23441Cg c23441Cg = this.cellInfoProvider;
        if (c23441Cg != null) {
            c23441Cg.A0d(this);
        }
        C18150uz.A0B.A03(this);
    }

    public final void stop() {
        C23441Cg c23441Cg = this.cellInfoProvider;
        if (c23441Cg != null) {
            c23441Cg.A0K.remove(this);
        }
        C15670qN.A00(this);
    }

    public IgRadioTsLoggerEngine(Context context, UserSession userSession, TslogStreamApi tslogStreamApi, boolean z, boolean z2) {
        C23441Cg c23441Cg;
        AbstractC167017dG.A1P(context, userSession);
        C14360o3.A0B(tslogStreamApi, 3);
        this.appContext = context;
        this.kOffset = C18U.A01(C06090Tz.A05, userSession, 36604760723428472L);
        if (z) {
            c23441Cg = C1CY.A00();
        } else {
            c23441Cg = null;
        }
        this.cellInfoProvider = c23441Cg;
        this.wifiInfoProvider = z2 ? C108364uN.A00(context) : null;
        this.counters = new C72817Xnh(tslogStreamApi, this);
    }

    public final C72817Xnh getCounters() {
        return this.counters;
    }
}
