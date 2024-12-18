package X;

import com.instagram.common.api.base.CacheBehaviorLogger;

/* renamed from: X.13z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C217313z {
    public boolean A00;
    public final InterfaceC02550Ad A01;

    public final void A00() {
        if (!this.A00) {
            C18920wW c18920wW = (C18920wW) this.A01;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "fbresources_not_available");
            if (A00.isSampled()) {
                A00.Cht();
                this.A00 = true;
            }
        }
    }

    public final void A01(String str, Throwable th, boolean z) {
        C18920wW c18920wW = (C18920wW) this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "fbresources_loading_failure");
        if (A00.isSampled()) {
            A00.AAP("locale", str);
            A00.AAP(CacheBehaviorLogger.SOURCE, "downloaded");
            A00.A7v("is_from_waiting_activity_screen", Boolean.valueOf(z));
            A00.AAP("error", th.toString());
            A00.Cht();
        }
    }

    public C217313z(InterfaceC02550Ad interfaceC02550Ad) {
        this.A01 = interfaceC02550Ad;
    }
}
