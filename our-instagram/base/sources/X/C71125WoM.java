package X;

import android.text.TextUtils;

/* renamed from: X.WoM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71125WoM implements InterfaceC72017XFf {
    public final /* synthetic */ C68251VJn A00;
    public final /* synthetic */ C1V4 A01;

    public C71125WoM(C68251VJn c68251VJn, C1V4 c1v4) {
        this.A01 = c1v4;
        this.A00 = c68251VJn;
    }

    @Override // X.InterfaceC72017XFf
    public final /* bridge */ /* synthetic */ boolean D2q(C69427VnC c69427VnC, Object obj) {
        C68251VJn c68251VJn = this.A00;
        if (!(!TextUtils.isEmpty(c68251VJn.A07)) && !(!TextUtils.isEmpty(c68251VJn.A06))) {
            return false;
        }
        return true;
    }
}
