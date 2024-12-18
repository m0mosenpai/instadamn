package X;

/* renamed from: X.6sU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C151846sU implements InterfaceC58362lv {
    public final /* synthetic */ InterfaceC58362lv A00;

    public C151846sU(InterfaceC58362lv interfaceC58362lv) {
        this.A00 = interfaceC58362lv;
    }

    @Override // X.InterfaceC58362lv
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        C8A8 c8a8 = (C8A8) obj;
        if (c8a8 != null && !c8a8.A00) {
            c8a8.A00 = true;
            Object obj2 = c8a8.A01;
            if (obj2 != null) {
                this.A00.onChanged(obj2);
            }
        }
    }
}
