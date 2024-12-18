package X;

import android.util.LruCache;

/* renamed from: X.3yJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89173yJ {
    public static C89173yJ A02;
    public final LruCache A01 = new LruCache(25);
    public InterfaceC02550Ad A00 = null;

    public final void A01(C70113W4l c70113W4l) {
        synchronized (this) {
            InterfaceC02550Ad interfaceC02550Ad = this.A00;
            if (interfaceC02550Ad == null) {
                this.A01.put(Integer.valueOf(c70113W4l.hashCode()), c70113W4l);
            } else {
                A00(interfaceC02550Ad, c70113W4l);
            }
        }
    }

    public static void A00(InterfaceC02550Ad interfaceC02550Ad, C70113W4l c70113W4l) {
        C18920wW c18920wW = (C18920wW) interfaceC02550Ad;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "stash_keystats_event");
        if (A00.isSampled()) {
            A00.AAP("event_uuid", C0HM.A00().toString());
            A00.AAP("cache_name", c70113W4l.A0E);
            A00.A9M("process_values", c70113W4l.A01());
            A00.A9M("metadata", c70113W4l.A0G);
            A00.AAP("cache_key", null);
            A00.A9M("actions", null);
            A00.Cht();
        }
    }
}
