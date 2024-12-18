package X;

/* renamed from: X.Lxa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49705Lxa implements InterfaceC42241xE {
    public final /* synthetic */ MQ7 A00;
    public final /* synthetic */ C5zZ A01;

    public C49705Lxa(MQ7 mq7, C5zZ c5zZ) {
        this.A00 = mq7;
        this.A01 = c5zZ;
    }

    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool != null && bool.booleanValue()) {
            C23031Ai c23031Ai = this.A01.A03;
            long currentTimeMillis = System.currentTimeMillis();
            InterfaceC19610xo A0w = AbstractC166987dD.A0w(c23031Ai);
            A0w.E7G(AbstractC111324zv.A00(5013), currentTimeMillis);
            A0w.apply();
            this.A00.onSuccess();
            return;
        }
        this.A00.onFailure();
    }
}
