package X;

import com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus;

/* renamed from: X.Wkv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70949Wkv implements InterfaceC190658cN {
    public final /* synthetic */ C6QR A00;

    public C70949Wkv(C6QR c6qr) {
        this.A00 = c6qr;
    }

    @Override // X.InterfaceC190658cN
    public final boolean onToggle(boolean z) {
        XFBTargetingAutomationAdvantageAudienceStatus xFBTargetingAutomationAdvantageAudienceStatus;
        C6QR c6qr = this.A00;
        C6QR.A00(c6qr).A0N(C6QR.A01(c6qr).A04(), z);
        UFT A01 = C6QR.A01(c6qr);
        if (z) {
            xFBTargetingAutomationAdvantageAudienceStatus = XFBTargetingAutomationAdvantageAudienceStatus.A05;
        } else {
            xFBTargetingAutomationAdvantageAudienceStatus = XFBTargetingAutomationAdvantageAudienceStatus.A04;
        }
        A01.A08(xFBTargetingAutomationAdvantageAudienceStatus);
        return true;
    }
}
