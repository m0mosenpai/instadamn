package X;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.Rih, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC61221Rih implements InterfaceC65497TlL {
    PublishAcknowledgementMs(0),
    StackSendingLatencyMs(1),
    /* JADX INFO: Fake field, exist only in values array */
    StackReceivingLatencyMs(2);

    public final Class A00 = AtomicLong.class;
    public final String A01;

    EnumC61221Rih(int i) {
        this.A01 = r3;
    }

    @Override // X.InterfaceC65497TlL
    public final String BKd() {
        return this.A01;
    }

    @Override // X.InterfaceC65497TlL
    public final Class CEb() {
        return this.A00;
    }
}
