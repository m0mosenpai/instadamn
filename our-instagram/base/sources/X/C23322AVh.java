package X;

/* renamed from: X.AVh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23322AVh implements BCR {
    public final /* synthetic */ InterfaceC16820sZ A00;
    public final /* synthetic */ InterfaceC16820sZ A01;

    public C23322AVh(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        this.A01 = interfaceC16820sZ;
        this.A00 = interfaceC16820sZ2;
    }

    @Override // X.BCR
    public final void CuB(String str, Throwable th) {
        C0w9.A03("IgRtcArEffectsHelper", AnonymousClass001.A0g("Failed to load effect. effectId={", str, "} "));
        this.A00.invoke();
    }

    @Override // X.BCR
    public final void CuC(String str) {
        this.A01.invoke();
    }
}
