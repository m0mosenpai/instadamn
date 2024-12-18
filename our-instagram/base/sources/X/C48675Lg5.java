package X;

import android.content.Context;
import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;

/* renamed from: X.Lg5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48675Lg5 implements InterfaceC31037Dkb {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C47553KzO A01;
    public final /* synthetic */ KPL A02;

    public C48675Lg5(Context context, C47553KzO c47553KzO, KPL kpl) {
        this.A02 = kpl;
        this.A01 = c47553KzO;
        this.A00 = context;
    }

    @Override // X.InterfaceC31037Dkb
    public final void DVx() {
        this.A02.A0C(MessageAvailabilityResponseId$Companion.NOT_SUPPORTED);
    }

    @Override // X.InterfaceC31037Dkb
    public final void onFailure() {
        AbstractC43592JPx.A1R(this.A02, "IMPLICIT_BACKUP_RETRY_RESULT", "FAILURE");
    }

    @Override // X.InterfaceC31037Dkb
    public final void onSuccess() {
        KPL kpl = this.A02;
        kpl.A07("IMPLICIT_BACKUP_RETRY_RESULT", "SUCCESS");
        kpl.A02();
        AbstractC46743Km0.A00(this.A01.A01, this.A00, "Created Block Store with Health Validator");
    }
}
