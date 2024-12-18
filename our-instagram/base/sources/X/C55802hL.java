package X;

import com.instagram.common.api.base.CacheBehaviorLogger;

/* renamed from: X.2hL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C55802hL {
    public final C2LR A00;

    public C55802hL(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 1);
        this.A00 = (C2LR) abstractC12990ll.A00(C2LR.class);
    }

    public final void A00(InterfaceC11380iw interfaceC11380iw, String str, int i) {
        C006802i c006802i = C006802i.A0p;
        if (c006802i.isMarkerOn(34420479)) {
            c006802i.markerDrop(34420479);
        }
        c006802i.markerStart(34420479);
        c006802i.markerAnnotate(34420479, "asl_session_id", C0L6.A01());
        c006802i.markerAnnotate(34420479, CacheBehaviorLogger.SOURCE, interfaceC11380iw.getModuleName());
        c006802i.markerAnnotate(34420479, "navigation_depth", i);
        if (str != null) {
            c006802i.markerAnnotate(34420479, "click_point", str);
        }
        C2LR c2lr = this.A00;
        int i2 = 0;
        if (c2lr != null && c2lr.A02 && c2lr.A01) {
            i2 = c2lr.A00;
        }
        c006802i.markerAnnotate(34420479, "user_sample_rate", i2);
    }
}
