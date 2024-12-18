package X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.Lpm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49231Lpm implements InterfaceC37116GXb {
    public final /* synthetic */ C83403nh A00;
    public final /* synthetic */ C7TG A01;
    public final /* synthetic */ DirectThreadKey A02;

    public C49231Lpm(C83403nh c83403nh, C7TG c7tg, DirectThreadKey directThreadKey) {
        this.A01 = c7tg;
        this.A02 = directThreadKey;
        this.A00 = c83403nh;
    }

    @Override // X.InterfaceC37116GXb
    public final void D6Y(boolean z) {
        if (!z) {
            C7TG.A06(this.A00, this.A01, AbstractC47177KtC.A00, this.A02, "DirectSendMessageManager_retry_mutation_not_found");
        }
    }
}
