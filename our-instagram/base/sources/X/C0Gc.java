package X;

import com.instagram.appinitializer.reliability.MessageQueueTimelineInitializer;

/* renamed from: X.0Gc, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0Gc extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C211211o A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Gc(C211211o c211211o) {
        super(0);
        this.A00 = c211211o;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        return new MessageQueueTimelineInitializer(this.A00);
    }
}
