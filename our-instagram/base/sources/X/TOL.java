package X;

import android.text.TextUtils;
import com.facebook.react.modules.dialog.DialogModule;
import com.fbpay.ptt.impl.javacpp.PttImpl;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class TOL implements Runnable {
    public final /* synthetic */ C63624SqW A00;
    public final /* synthetic */ C63406Sjd A01;

    public TOL(C63624SqW c63624SqW, C63406Sjd c63406Sjd) {
        this.A00 = c63624SqW;
        this.A01 = c63406Sjd;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, com.fbpay.ptt.impl.javacpp.PttImpl] */
    @Override // java.lang.Runnable
    public final void run() {
        C63624SqW c63624SqW = this.A00;
        SZ5 sz5 = (SZ5) c63624SqW.A01;
        Object obj = c63624SqW.A02;
        String str = (String) C63406Sjd.A08(this.A01);
        String str2 = c63624SqW.A07;
        java.util.Set set = (java.util.Set) c63624SqW.A06;
        InterfaceC65388TjL interfaceC65388TjL = (InterfaceC65388TjL) c63624SqW.A05;
        Executor executor = (Executor) c63624SqW.A03;
        try {
            C3AY createPayloads = AbstractC63244Sfy.createPayloads(obj);
            byte[] bytes = str.getBytes(Charset.defaultCharset());
            byte[] bArr = (byte[]) createPayloads.A00;
            byte[] bArr2 = (byte[]) createPayloads.A01;
            C14360o3.A0B(bytes, 0);
            ?? obj2 = new Object();
            obj2.mAtFingerprints = set;
            obj2.mHybridData = PttImpl.initHybrid(bytes, bArr, bArr2, (String[]) set.toArray(new String[0]), str2);
            String encryptionError = obj2.getEncryptionError();
            if (!TextUtils.isEmpty(encryptionError)) {
                try {
                    if (!TextUtils.isEmpty(encryptionError)) {
                        JSONObject A17 = AbstractC58318PtA.A17(encryptionError);
                        A17.getInt(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
                        encryptionError = A17.getString(DialogModule.KEY_MESSAGE);
                    }
                } catch (JSONException unused) {
                }
                executor.execute(new TR4(interfaceC65388TjL, sz5, null, null, new RuntimeException(encryptionError)));
                return;
            }
            if (set.isEmpty()) {
                SZ5.A00(interfaceC65388TjL, sz5, obj2, Collections.emptyMap(), executor);
                return;
            }
            sz5.A00.Elw(new SMG(interfaceC65388TjL, sz5, obj2, executor), obj2.getSigningPayloads());
        } catch (IllegalAccessException | IllegalArgumentException e) {
            executor.execute(new TR4(interfaceC65388TjL, sz5, null, null, e));
        }
    }
}
