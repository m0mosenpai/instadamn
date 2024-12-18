package X;

import java.util.List;

/* renamed from: X.Lh0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48732Lh0 implements InterfaceC50475MQd {
    public final /* synthetic */ KD6 A00;

    public C48732Lh0(KD6 kd6) {
        this.A00 = kd6;
    }

    @Override // X.InterfaceC50475MQd
    public final void DFh(AbstractC115105If abstractC115105If, String str) {
        String str2;
        KD6 kd6 = this.A00;
        LAG lag = kd6.A0D;
        if (lag == null) {
            str2 = "stickerItemController";
        } else {
            boolean A05 = lag.A05();
            LAG lag2 = kd6.A0C;
            if (lag2 == null) {
                str2 = "gifItemController";
            } else {
                KD6.A01(kd6, A05, lag2.A05());
                return;
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC50475MQd
    public final void Dnu(String str) {
        LAG lag = this.A00.A0D;
        if (lag == null) {
            C14360o3.A0F("stickerItemController");
            throw C00O.createAndThrow();
        }
        lag.A00();
    }

    @Override // X.InterfaceC50475MQd
    public final void DqH(List list, List list2, String str) {
        String str2;
        KD6 kd6 = this.A00;
        LAG lag = kd6.A0D;
        if (lag == null) {
            str2 = "stickerItemController";
        } else {
            lag.A03(list);
            boolean isEmpty = list.isEmpty();
            LAG lag2 = kd6.A0C;
            if (lag2 == null) {
                str2 = "gifItemController";
            } else {
                KD6.A01(kd6, isEmpty, lag2.A05());
                return;
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }
}
