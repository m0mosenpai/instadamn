package X;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: X.T0e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64138T0e implements InterfaceC65362Tit {
    public final Callback A00;
    public final ReadableMap A01;
    public final /* synthetic */ SZN A02;

    public C64138T0e(Callback callback, ReadableMap readableMap, SZN szn) {
        this.A02 = szn;
        this.A01 = readableMap;
        this.A00 = callback;
    }

    @Override // X.InterfaceC65362Tit
    public final void ATI() {
        C63309ShF c63309ShF = this.A02.A0L;
        ReadableMap readableMap = this.A01;
        Callback callback = this.A00;
        synchronized (c63309ShF) {
            SZp sZp = c63309ShF.A08;
            if (readableMap == null) {
                sZp.A01();
            } else {
                int i = 0;
                sZp.A02 = false;
                if (readableMap.hasKey("duration")) {
                    i = readableMap.getInt("duration");
                }
                if (readableMap.hasKey("create")) {
                    sZp.A04.A01(i, readableMap.getMap("create"));
                    sZp.A02 = true;
                }
                if (readableMap.hasKey("update")) {
                    sZp.A06.A01(i, readableMap.getMap("update"));
                    sZp.A02 = true;
                }
                if (readableMap.hasKey("delete")) {
                    sZp.A05.A01(i, readableMap.getMap("delete"));
                    sZp.A02 = true;
                }
                if (sZp.A02 && callback != null) {
                    sZp.A01 = new RunnableC64637TNt(callback, sZp);
                }
            }
        }
    }
}
