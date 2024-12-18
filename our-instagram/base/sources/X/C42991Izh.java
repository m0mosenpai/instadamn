package X;

/* renamed from: X.Izh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42991Izh implements InterfaceC64212vg {
    public final /* synthetic */ InterfaceC60442pS A00;
    public final /* synthetic */ C1M1 A01;

    @Override // X.InterfaceC64212vg
    public final /* bridge */ /* synthetic */ C9CQ AUX(Object obj, Object obj2) {
        return new C9CQ(2);
    }

    public C42991Izh(InterfaceC60442pS interfaceC60442pS, C1M1 c1m1) {
        this.A01 = c1m1;
        this.A00 = interfaceC60442pS;
    }

    @Override // X.InterfaceC64212vg
    public final /* bridge */ /* synthetic */ C82573mL AUY(EnumC64262vl enumC64262vl, Object obj, Object obj2, float f, long j, long j2) {
        C47K c47k = (C47K) obj;
        InterfaceC75123Zc interfaceC75123Zc = (InterfaceC75123Zc) obj2;
        AbstractC167027dH.A12(c47k, interfaceC75123Zc, enumC64262vl);
        String id = c47k.getId();
        String sessionId = this.A01.getSessionId();
        String id2 = c47k.getId();
        String moduleName = this.A00.getModuleName();
        String A06 = AbstractC82563mK.A06("media_or_ad");
        int i = -1;
        if (interfaceC75123Zc.getPosition() != -1 && interfaceC75123Zc.BLI() != -1) {
            i = (interfaceC75123Zc.getPosition() - interfaceC75123Zc.BLI()) - 1;
        }
        int i2 = -1;
        if (interfaceC75123Zc.getPosition() != -1 && interfaceC75123Zc.BLj() != -1) {
            i2 = (interfaceC75123Zc.getPosition() - interfaceC75123Zc.BLj()) - 1;
        }
        return new C82573mL(enumC64262vl, id, sessionId, id2, moduleName, A06, "", f, 0, i, i2, interfaceC75123Zc.getPosition(), -1, -1, -1, -1, j, j2);
    }
}
