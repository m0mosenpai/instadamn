package X;

import android.text.TextUtils;

/* renamed from: X.WoL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71124WoL implements InterfaceC72017XFf {
    public final /* synthetic */ C68251VJn A00;
    public final /* synthetic */ C1V4 A01;

    public C71124WoL(C68251VJn c68251VJn, C1V4 c1v4) {
        this.A01 = c1v4;
        this.A00 = c68251VJn;
    }

    @Override // X.InterfaceC72017XFf
    public final /* bridge */ /* synthetic */ boolean D2q(C69427VnC c69427VnC, Object obj) {
        C69026Vg2 c69026Vg2 = this.A00.A02;
        if ((c69026Vg2 != null && c69026Vg2.A00 != null) || (!TextUtils.isEmpty(r1.A07)) || (!TextUtils.isEmpty(r1.A06))) {
            return true;
        }
        return false;
    }
}
