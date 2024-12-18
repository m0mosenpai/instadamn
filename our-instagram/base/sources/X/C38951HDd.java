package X;

import com.instagram.api.schemas.IntentAwareAdsInfoIntf;

/* renamed from: X.HDd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38951HDd extends C4SZ {
    public IntentAwareAdsInfoIntf A00;
    public Integer A01;

    @Override // X.C4SZ, X.C30P
    public final void A0A(C19280xC c19280xC, C4SW c4sw) {
        C95714Sf c95714Sf;
        C14360o3.A0B(c19280xC, 0);
        super.A0A(c19280xC, c4sw);
        if (c4sw != null && (c95714Sf = c4sw.A07) != null) {
            c95714Sf.A00 = this.A00;
            c95714Sf.A0I = this.A01;
        }
    }

    @Override // X.C4SZ
    public final C4SH A0C(C120985dq c120985dq) {
        C14360o3.A0B(c120985dq, 0);
        this.A00 = c120985dq.A00();
        this.A01 = c120985dq.A0B();
        return super.A0C(c120985dq);
    }
}
