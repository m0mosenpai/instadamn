package X;

import java.util.HashMap;

/* renamed from: X.KLz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45722KLz extends AbstractRunnableC14200nk {
    public final /* synthetic */ C28741aC A00;
    public final /* synthetic */ HashMap A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45722KLz(C28741aC c28741aC, Boolean bool, HashMap hashMap, int i) {
        super(1431669316, i, AbstractC31172DnG.A1b(bool), false);
        this.A00 = c28741aC;
        this.A01 = hashMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C28741aC c28741aC = this.A00;
        C28741aC.A0E(c28741aC, this.A01, C28741aC.A04(c28741aC));
        C28741aC.A0C(c28741aC);
        C28741aC.A0D(c28741aC);
    }
}
