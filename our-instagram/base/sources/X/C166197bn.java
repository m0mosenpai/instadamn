package X;

import java.util.Iterator;

/* renamed from: X.7bn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166197bn implements InterfaceC13000lm {
    public C47Z A00;
    public C47Z A01;
    public final C40121td A02;

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        A00();
        this.A00 = null;
        this.A01 = null;
    }

    public final void A00() {
        C47Z c47z = this.A00;
        if (c47z != null) {
            if (c47z.A0t()) {
                Iterator it = c47z.A0K().iterator();
                while (it.hasNext()) {
                    this.A02.A0K(((C47Z) it.next()).A35, "cancel_upload", false, true, true);
                }
            } else {
                this.A02.A0K(c47z.A35, "cancel_upload", false, true, true);
            }
        }
        this.A00 = null;
    }

    public C166197bn(C40121td c40121td) {
        this.A02 = c40121td;
    }
}
