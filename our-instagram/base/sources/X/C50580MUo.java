package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.MUo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50580MUo {
    public final AbstractC12990ll A01;
    public final C19270xB A00 = AbstractC31171DnF.A0D("newsfeed_you");
    public final AtomicReference A02 = new AtomicReference(null);
    public final AtomicReference A03 = new AtomicReference(null);

    public final void A00() {
        AtomicReference atomicReference = this.A02;
        String str = (String) atomicReference.get();
        if (str != null) {
            AtomicReference atomicReference2 = this.A03;
            String str2 = (String) atomicReference2.get();
            if (str2 != null) {
                atomicReference.set(null);
                atomicReference2.set(null);
                AbstractC50522MSa.A1O(AbstractC12220kQ.A01(this.A00, this.A01), "notification_feed_exit", str, str2);
            }
        }
    }

    public C50580MUo(AbstractC12990ll abstractC12990ll) {
        this.A01 = abstractC12990ll;
    }
}
