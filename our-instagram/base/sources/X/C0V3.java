package X;

/* renamed from: X.0V3, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0V3 extends AbstractC02970Bv {
    public C0VK A00 = new C0VK(true);

    @Override // X.AbstractC02970Bv
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A03() {
        return new C0VK(true);
    }

    @Override // X.AbstractC02970Bv
    public final /* bridge */ /* synthetic */ boolean A04(AbstractC02960Bu abstractC02960Bu) {
        C0VK c0vk = (C0VK) abstractC02960Bu;
        synchronized (this) {
            c0vk.A04(this.A00);
        }
        return true;
    }
}
