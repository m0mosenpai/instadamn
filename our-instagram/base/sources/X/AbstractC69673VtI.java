package X;

import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.VtI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69673VtI {
    public final java.util.Set A00 = Collections.newSetFromMap(new ConcurrentHashMap());

    public final void A00(InterfaceC65338TiJ interfaceC65338TiJ) {
        if (this instanceof USB) {
            USB usb = (USB) this;
            usb.A00.BuS((InterfaceC65636Tpx) interfaceC65338TiJ, ((AbstractC66541ULw) usb).A00);
        } else {
            USA usa = (USA) this;
            usa.A00.AYs((WUC) interfaceC65338TiJ, ((AbstractC66541ULw) usa).A00);
        }
    }

    public void A01(InterfaceC65338TiJ interfaceC65338TiJ) {
        this.A00.remove(interfaceC65338TiJ);
    }
}
