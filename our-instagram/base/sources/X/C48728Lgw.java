package X;

import java.util.List;

/* renamed from: X.Lgw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48728Lgw implements InterfaceC50473MQb {
    public final /* synthetic */ KD6 A00;

    public C48728Lgw(KD6 kd6) {
        this.A00 = kd6;
    }

    @Override // X.InterfaceC50473MQb
    public final void DqG(List list, String str) {
        String str2;
        KD6 kd6 = this.A00;
        LAG lag = kd6.A0C;
        if (lag == null) {
            str2 = "gifItemController";
        } else {
            lag.A03(list);
            LAG lag2 = kd6.A0D;
            if (lag2 == null) {
                str2 = "stickerItemController";
            } else {
                KD6.A01(kd6, lag2.A05(), list.isEmpty());
                return;
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC50473MQb
    public final void onFail(AbstractC115105If abstractC115105If) {
        String str;
        KD6 kd6 = this.A00;
        LAG lag = kd6.A0D;
        if (lag == null) {
            str = "stickerItemController";
        } else {
            boolean A05 = lag.A05();
            LAG lag2 = kd6.A0C;
            if (lag2 == null) {
                str = "gifItemController";
            } else {
                KD6.A01(kd6, A05, lag2.A05());
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC50473MQb
    public final void onStart() {
        LAG lag = this.A00.A0C;
        if (lag == null) {
            C14360o3.A0F("gifItemController");
            throw C00O.createAndThrow();
        }
        lag.A00();
    }
}
