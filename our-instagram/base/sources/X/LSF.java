package X;

import com.encryptedbackups.statemanager.model.WrongRecoveryCodeException;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* loaded from: classes8.dex */
public final class LSF implements InterfaceC50417MNt {
    public final /* synthetic */ C47952LGm A00;
    public final /* synthetic */ C47473Ky2 A01;
    public final /* synthetic */ LK0 A02;
    public final /* synthetic */ String A03;

    public LSF(C47952LGm c47952LGm, C47473Ky2 c47473Ky2, LK0 lk0, String str) {
        this.A00 = c47952LGm;
        this.A01 = c47473Ky2;
        this.A02 = lk0;
        this.A03 = str;
    }

    @Override // X.InterfaceC50417MNt
    public final /* bridge */ /* synthetic */ void run(Object obj) {
        C47473Ky2 c47473Ky2;
        EnumC46211Kcn enumC46211Kcn;
        AbstractC46542Kih abstractC46542Kih = (AbstractC46542Kih) obj;
        Boolean A0a = AbstractC166997dE.A0a();
        if (abstractC46542Kih == null) {
            C47952LGm c47952LGm = this.A00;
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = c47952LGm.A01;
            int i = c47952LGm.A00;
            lightweightQuickPerformanceLogger.markerPoint(1021649468, i, "add_device_failure");
            JQ0.A1D(lightweightQuickPerformanceLogger, "add_device_error", "Missing addDevice result", 1021649468, i);
            c47473Ky2 = this.A01;
            c47473Ky2.A01 = A0a;
            enumC46211Kcn = EnumC46211Kcn.A07;
        } else if (abstractC46542Kih instanceof C44827Jt1) {
            Exception exc = ((C44827Jt1) abstractC46542Kih).A00;
            C0K8.A0F("VestaLoginClient", AnonymousClass001.A0g("Failed to add device ", this.A03, " to backup"), exc);
            C47952LGm c47952LGm2 = this.A00;
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger2 = c47952LGm2.A01;
            int i2 = c47952LGm2.A00;
            lightweightQuickPerformanceLogger2.markerPoint(1021649468, i2, "add_device_failure");
            JQ0.A1D(lightweightQuickPerformanceLogger2, "add_device_error", "Add device failure", 1021649468, i2);
            if (exc instanceof WrongRecoveryCodeException) {
                lightweightQuickPerformanceLogger2.markerPoint(1021649468, i2, "recovery_code_invalid");
                JQ0.A1D(lightweightQuickPerformanceLogger2, "add_device_error", "recovery_code_invalid", 1021649468, i2);
            }
            c47473Ky2 = this.A01;
            c47473Ky2.A01 = A0a;
            enumC46211Kcn = EnumC46211Kcn.A0D;
        } else if (abstractC46542Kih instanceof C44826Jt0) {
            C47952LGm c47952LGm3 = this.A00;
            c47952LGm3.A01.markerPoint(1021649468, c47952LGm3.A00, "add_device_success");
            c47473Ky2 = this.A01;
            c47473Ky2.A01 = AbstractC166997dE.A0b();
            enumC46211Kcn = EnumC46211Kcn.A0A;
        } else {
            throw B4Z.A00();
        }
        c47473Ky2.A00 = enumC46211Kcn;
        this.A02.A05(new LGV(c47473Ky2));
    }
}
