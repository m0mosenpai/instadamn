package X;

import android.util.Base64;
import com.facebook.cryptopub.CryptoPubNative;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes11.dex */
public final class W2D {
    public static int A02 = 2;
    public C123435iI A00;
    public Integer A01;
    public static final C123445iJ A04 = new C123445iJ();
    public static final CryptoPubNative A03 = new Object();
    public static final AtomicBoolean A05 = AbstractC166997dE.A17();

    public static C69258VkR A00(String str, String str2) {
        try {
            return new C69258VkR("", Base64.encodeToString(A03.encrypt(41, AbstractC111324zv.A00(1469), str, str2), 2), new VIB("Default key used.", C05F.A00), 0);
        } catch (Exception e) {
            return new C69258VkR("", str, new VIB(e, C05F.A01), 0);
        }
    }
}
