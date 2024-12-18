package X;

import com.facebook.models.ModelAssetMetadata;
import com.facebook.models.ModelMetadata;
import com.facebook.models.interfaces.ModelLoaderBase;

/* renamed from: X.94h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2047394h {
    public final C73673Rt A00;
    public final C2047294g A01;
    public final C4QF A02;
    public final C2047194f A03;

    public final C3SN A00(C3RU c3ru, String str) {
        ModelMetadata modelMetadata;
        C14360o3.A0B(c3ru, 0);
        C14360o3.A0B(str, 1);
        C2047194f c2047194f = this.A03;
        String BUR = c3ru.BUR();
        long BUS = c3ru.BUS();
        C14360o3.A0B(BUR, 1);
        ModelLoaderBase modelLoaderBase = c2047194f.A00;
        if (modelLoaderBase == null) {
            return new C3SN("", "model loader is null", false);
        }
        try {
            if (BUS == -1) {
                modelMetadata = (ModelMetadata) modelLoaderBase.load(BUR).get();
            } else {
                modelMetadata = (ModelMetadata) modelLoaderBase.load(BUR, BUS).get();
            }
            ModelAssetMetadata assetMetadata = modelMetadata.getAssetMetadata(str);
            if (assetMetadata == null) {
                return new C3SN("", "no asset", false);
            }
            return new C3SN(assetMetadata.path, null, true);
        } catch (Exception e) {
            return new C3SN("", e.getMessage(), false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x013f  */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.concurrent.Future, java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C3SN A01(java.util.List r13) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2047394h.A01(java.util.List):X.3SN");
    }

    public C2047394h(C73673Rt c73673Rt, C2047194f c2047194f, C2047294g c2047294g, C4QF c4qf) {
        this.A03 = c2047194f;
        this.A01 = c2047294g;
        this.A02 = c4qf;
        this.A00 = c73673Rt;
    }
}
