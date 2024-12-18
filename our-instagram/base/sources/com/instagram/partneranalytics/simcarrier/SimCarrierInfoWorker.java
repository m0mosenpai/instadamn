package com.instagram.partneranalytics.simcarrier;

import X.AbstractC06950Ym;
import X.AbstractC1114350h;
import X.AbstractC12220kQ;
import X.AbstractC12290kX;
import X.C023409i;
import X.C06090Tz;
import X.C0K8;
import X.C0Zx;
import X.C105024oI;
import X.C1114250g;
import X.C14360o3;
import X.C18920wW;
import X.C18U;
import X.C2L1;
import X.C51A;
import X.C87743vi;
import X.EnumC105014oH;
import X.InterfaceC02590Ai;
import android.content.Context;
import android.os.Build;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class SimCarrierInfoWorker extends Worker {
    public static final Object A00 = new Object();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimCarrierInfoWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C14360o3.A0B(context, 1);
        C14360o3.A0B(workerParameters, 2);
    }

    @Override // androidx.work.Worker
    public final AbstractC1114350h doWork() {
        try {
            UserSession A08 = C023409i.A0A.A08(this);
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, A08, 36321108198302873L) && C18U.A06(c06090Tz, A08, 2342164117411865752L)) {
                C18920wW A02 = AbstractC12220kQ.A02(A08);
                ArrayList A022 = new C87743vi(AbstractC12290kX.A00).A02();
                if (A022 != null && !A022.isEmpty()) {
                    InterfaceC02590Ai A002 = A02.A00(A02.A00, "sim_carrier_info");
                    if (A002.isSampled()) {
                        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A022, 10));
                        Iterator it = A022.iterator();
                        while (it.hasNext()) {
                            C105024oI c105024oI = (C105024oI) it.next();
                            C0Zx c0Zx = new C0Zx() { // from class: X.4oJ
                            };
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = c105024oI.A09.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(((EnumC105014oH) it2.next()).toString());
                            }
                            c0Zx.A07("service_types", arrayList2);
                            c0Zx.A06("sim_country_iso", c105024oI.A06);
                            c0Zx.A06("sim_operator_mcc_mnc", c105024oI.A07);
                            c0Zx.A06("sim_operator_name", c105024oI.A08);
                            c0Zx.A05("sim_carrier_id", Long.valueOf(c105024oI.A00));
                            c0Zx.A06("sim_carrier_id_name", c105024oI.A05);
                            c0Zx.A06("network_country_iso", c105024oI.A02);
                            c0Zx.A06("network_operator_mcc_mnc", c105024oI.A03);
                            c0Zx.A06("network_operator_name", c105024oI.A04);
                            c0Zx.A03("is_network_roaming", Boolean.valueOf(c105024oI.A0A));
                            Boolean bool = c105024oI.A01;
                            if (bool != null) {
                                c0Zx.A03("is_esim", bool);
                            }
                            arrayList.add(c0Zx);
                        }
                        A002.AAk("carrier_info", arrayList);
                        A002.AAP("device_model", Build.MODEL);
                        A002.AAP("os_version", Build.VERSION.RELEASE);
                        A002.Cht();
                    }
                }
                return new C51A();
            }
            synchronized (A00) {
                C2L1.A00(AbstractC12290kX.A00).A05("sim_carrier_info_logging_background_work");
            }
            return new C51A();
        } catch (Exception e) {
            C0K8.A0F("SimCarrierInfoWorker", "Exception upon do work", e);
            return new C1114250g();
        }
    }
}
