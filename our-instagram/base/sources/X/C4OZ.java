package X;

import com.facebook.pando.Summary;

/* renamed from: X.4OZ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4OZ implements AnonymousClass436 {
    public final Summary A00;
    public final Object A01;

    @Override // X.AnonymousClass436
    public final Integer B8f() {
        return AbstractC173357nn.A00(this.A00);
    }

    @Override // X.AnonymousClass436
    public final Object Bos() {
        return this.A01;
    }

    @Override // X.AnonymousClass436
    public final Summary C3z() {
        return this.A00;
    }

    public C4OZ(Summary summary, Object obj) {
        this.A01 = obj;
        this.A00 = summary;
        if (!C14360o3.A0K(summary.source, "stale_cache")) {
            C14360o3.A0K(summary.source, "fresh_cache");
        }
    }
}
