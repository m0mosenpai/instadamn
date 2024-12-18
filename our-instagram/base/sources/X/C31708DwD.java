package X;

import androidx.fragment.app.Fragment;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.login.smartlock.impl.SmartLockPluginImpl;

/* renamed from: X.DwD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31708DwD {
    public static final C31708DwD A00 = new Object();

    /* JADX WARN: Type inference failed for: r3v0, types: [X.3oK, java.lang.Object] */
    public final Object A00(C6FQ c6fq, C6FW c6fw) {
        InterfaceC103384lE A0I = AbstractC31175DnJ.A0I(c6fw, 0);
        Fragment A01 = C6BQ.A01(c6fq);
        C07270a1 c07270a1 = (C07270a1) C6BQ.A0B(c6fq);
        ?? obj = new Object();
        C31712DwH c31712DwH = C31712DwH.A00;
        if (!c31712DwH.A01(c07270a1) && !c31712DwH.A00(c07270a1)) {
            C6FX A0s = AbstractC25225BEi.A0s();
            A0s.A03(OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE, 0);
            A0s.A03(null, 1);
            A0s.A03(null, 2);
            A0s.A03(null, 3);
            A0s.A03(null, 4);
            A0s.A03(null, 5);
            AbstractC25227BEk.A1M(c6fq, A0s, A0I);
        } else if (c07270a1 != null) {
            AbstractC27461Uz abstractC27461Uz = AbstractC27461Uz.getInstance();
            if (abstractC27461Uz != null) {
                ((SmartLockPluginImpl) abstractC27461Uz).A00 = true;
            }
            AbstractC31710DwF.A00(A01, c07270a1, new C31709DwE(obj, c6fq, A0I, c07270a1), EnumC31713DwI.A0z, true);
            return null;
        }
        return null;
    }
}
