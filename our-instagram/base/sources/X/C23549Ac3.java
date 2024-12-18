package X;

import com.facebook.models.ModelAssetMetadata;
import com.facebook.models.ModelMetadata;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.Ac3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23549Ac3 implements C2JL {
    public final /* synthetic */ String A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ HashMap A02;
    public final /* synthetic */ CountDownLatch A03;

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
        C14360o3.A0B(th, 0);
        C0K8.A0F("BCModelDownloader", AnonymousClass001.A0R("Failed to download model ", this.A01), th);
        this.A03.countDown();
    }

    public C23549Ac3(String str, String str2, HashMap hashMap, CountDownLatch countDownLatch) {
        this.A00 = str;
        this.A01 = str2;
        this.A03 = countDownLatch;
        this.A02 = hashMap;
    }

    @Override // X.C2JL
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        ModelMetadata modelMetadata = (ModelMetadata) obj;
        if (modelMetadata != null) {
            ModelAssetMetadata assetMetadata = modelMetadata.getAssetMetadata(this.A00);
            if (assetMetadata != null && (str = assetMetadata.path) != null) {
                this.A02.put(this.A01, str);
            }
        } else {
            C0K8.A0C("BCModelDownloader", AnonymousClass001.A0R("Failed to download model ", this.A01));
        }
        this.A03.countDown();
    }
}
