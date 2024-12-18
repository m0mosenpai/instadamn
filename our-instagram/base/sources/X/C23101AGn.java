package X;

import android.os.Bundle;
import java.util.Map;

/* renamed from: X.AGn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23101AGn {
    public final Map A00;
    public final java.util.Set A01;
    public final java.util.Set A02;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0bW, java.lang.Object] */
    public final void A00(String str) {
        java.util.Set set = this.A02;
        synchronized (set) {
            android.net.Uri A01 = AbstractC08820cl.A01(new Object(), str);
            if (A01 != null && A01.getHost() != null) {
                set.add(A01.getHost());
            }
        }
    }

    public C23101AGn(Bundle bundle) {
        this.A00 = (Map) bundle.getSerializable("resource_counts");
        this.A02 = (java.util.Set) bundle.getSerializable("resource_domains");
        this.A01 = (java.util.Set) bundle.getSerializable("images_url");
    }

    public C23101AGn() {
        this.A00 = AbstractC166987dD.A1G();
        this.A02 = AbstractC166987dD.A1H();
        this.A01 = AbstractC166987dD.A1H();
    }
}
