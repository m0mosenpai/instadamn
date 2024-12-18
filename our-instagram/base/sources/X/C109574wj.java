package X;

import android.content.res.AssetManager;
import com.facebook.hyperthrift.HyperThriftBase;
import com.facebook.hyperthrift.reflect.GeneratedHyperThriftClassLookup;

/* renamed from: X.4wj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109574wj {
    public final SL7 A00;
    public final GeneratedHyperThriftClassLookup A01;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.hyperthrift.reflect.GeneratedHyperThriftClassLookup, java.lang.Object] */
    public C109574wj(AssetManager assetManager) {
        SB8 sb8 = new SB8(assetManager);
        ?? obj = new Object();
        this.A00 = new SL7(sb8);
        this.A01 = obj;
    }

    public final HyperThriftBase A00(AbstractC95034Pm abstractC95034Pm, String str) {
        return Y3T.A00(new Y3T(this.A00, this.A01, abstractC95034Pm), str);
    }

    public final void A01(HyperThriftBase hyperThriftBase, AbstractC95034Pm abstractC95034Pm, String str) {
        Y3R.A00(hyperThriftBase, new Y3R(this.A00, abstractC95034Pm), str);
    }
}
