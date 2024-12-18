package X;

import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.1ZW, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1ZW {
    public C006802i A00;
    public final C0f6 A01;
    public final UserSession A02;

    public C1ZW(C0f6 c0f6, UserSession userSession) {
        C14360o3.A0B(c0f6, 1);
        C14360o3.A0B(userSession, 2);
        this.A01 = c0f6;
        this.A02 = userSession;
    }

    public final C1ZX A00(Integer num, int i, int i2, boolean z) {
        return new C1ZX(this.A01, this.A02, num, i, i2, z);
    }

    public final C1ZX A01(Integer num, Integer num2, boolean z) {
        int i;
        C006802i c006802i = this.A00;
        if (c006802i == null) {
            c006802i = C006802i.A0p;
            this.A00 = c006802i;
        }
        switch (num.intValue()) {
            case 0:
                i = 969609158;
                break;
            case 1:
                i = 969614686;
                break;
            case 2:
                i = 969616480;
                break;
            case 3:
                i = 969617773;
                break;
            case 4:
                i = 969613184;
                break;
            case 5:
                i = 969609072;
                break;
            case 6:
                i = 969607521;
                break;
            case 7:
                i = 969618165;
                break;
            case 8:
                i = 969613572;
                break;
            case 9:
                i = 969610723;
                break;
            case 10:
                i = 969613907;
                break;
            case 11:
                i = 969617780;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                i = 969621014;
                break;
            default:
                i = 969619871;
                break;
        }
        String A00 = C1ZY.A00(num2);
        int hashCode = A00.hashCode() + ((int) System.currentTimeMillis());
        if (c006802i == null) {
            C14360o3.A0F("quickPerformanceLogger");
            throw C00O.createAndThrow();
        }
        c006802i.markerLinkPivot(i, hashCode, A00);
        return A00(num2, i, hashCode, z);
    }
}
