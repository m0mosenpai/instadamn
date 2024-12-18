package X;

import com.facebook.hyperthrift.HyperThriftBase;
import com.facebook.logginginfra.falco.AppScopedIdentity;

/* loaded from: classes12.dex */
public final class XSD extends HyperThriftBase.Builder {
    public XSD() {
        super(4);
    }

    public final void A01(Long l) {
        Object[] objArr = this.A01;
        Object obj = l;
        if (l == null) {
            obj = HyperThriftBase.A02;
        }
        objArr[0] = obj;
    }

    public final void A02(String str) {
        Object[] objArr = this.A01;
        Object obj = str;
        if (str == null) {
            obj = HyperThriftBase.A02;
        }
        objArr[2] = obj;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.logginginfra.falco.AppScopedIdentity, com.facebook.hyperthrift.HyperThriftBase, java.lang.Object] */
    public final AppScopedIdentity A00() {
        Object[] A01 = HyperThriftBase.Builder.A01(this.A01);
        HyperThriftBase.Builder.A00(A01, 1);
        ?? obj = new Object();
        obj.A02("com.facebook.logginginfra.falco.AppScopedIdentity", A01);
        return obj;
    }
}
