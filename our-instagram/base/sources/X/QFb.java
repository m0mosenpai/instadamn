package X;

import android.os.Bundle;
import com.facebook.common.errorreporting.memory.service.jobschedulercompat.igsvc.DumperUploadService;

/* loaded from: classes10.dex */
public final class QFb extends AbstractC121025du {
    public final /* synthetic */ DumperUploadService A00;

    @Override // X.AbstractC121025du
    public final boolean A00(int i) {
        return true;
    }

    @Override // X.AbstractC121025du
    public final boolean A01(Bundle bundle, InterfaceC121045dw interfaceC121045dw, int i) {
        return false;
    }

    public QFb(DumperUploadService dumperUploadService) {
        this.A00 = dumperUploadService;
    }
}
