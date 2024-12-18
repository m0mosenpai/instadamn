package X;

import android.app.job.JobParameters;
import com.facebook.voltron.download.scheduledinstaller.OxygenScheduledInstallerJobService;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Pvw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58471Pvw implements InterfaceC65376Tj9 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C58471Pvw(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.InterfaceC65376Tj9
    public final void D6g(C58428Pv7 c58428Pv7) {
        switch (this.A00) {
            case 0:
                C58422Pv0 c58422Pv0 = (C58422Pv0) this.A01;
                Iterator it = c58422Pv0.A05.iterator();
                while (it.hasNext()) {
                    ((C2MN) it.next()).A08((C58424Pv2) this.A02, (C124725kd) c58428Pv7.A04(), c58422Pv0.A00);
                }
                return;
            case 1:
                boolean A07 = c58428Pv7.A07();
                if (A07) {
                    ArrayList A1E = AbstractC166987dD.A1E();
                    C58422Pv0 c58422Pv02 = (C58422Pv0) this.A01;
                    java.util.Set set = c58422Pv02.A06;
                    A1E.add(new C58425Pv3(C05F.A0N, set));
                    Iterator it2 = c58422Pv02.A05.iterator();
                    while (it2.hasNext()) {
                        ((C2MN) it2.next()).A04(new C58424Pv2(C05F.A1F, A1E, set, set), "AUTO_UNINSTALL".equals(null), A07);
                    }
                }
                ((C58427Pv6) this.A02).A01(new C124725kd(null, -1, A07, false));
                return;
            default:
                OxygenScheduledInstallerJobService oxygenScheduledInstallerJobService = (OxygenScheduledInstallerJobService) this.A02;
                JobParameters jobParameters = (JobParameters) this.A01;
                C1UI c1ui = oxygenScheduledInstallerJobService.A01;
                if (c1ui == null) {
                    C14360o3.A0F("lightSharedPreferencesFactory");
                    throw C00O.createAndThrow();
                }
                boolean isEmpty = oxygenScheduledInstallerJobService.A00(c1ui).isEmpty();
                boolean z = true;
                if (isEmpty) {
                    z = false;
                }
                C0fN.A02(jobParameters, oxygenScheduledInstallerJobService, z);
                return;
        }
    }
}
