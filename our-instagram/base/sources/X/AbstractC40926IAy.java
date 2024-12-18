package X;

import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;

/* renamed from: X.IAy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40926IAy {
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public static final float A00(C38321qM c38321qM, EnumC39627Hel enumC39627Hel) {
        switch (enumC39627Hel.ordinal()) {
            case 47:
            case 52:
            case 53:
                return 0.5f;
            case 48:
            case 49:
            case 51:
                AbstractC53534Nm0 A00 = AbstractC50573MUe.A00(c38321qM);
                EnumC31334Dpz A01 = C79923hh.A01(c38321qM);
                if ((A00 instanceof NVh) || A01.A00()) {
                    return 0.5f;
                }
                break;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
            default:
                return 1.0f;
        }
    }
}
