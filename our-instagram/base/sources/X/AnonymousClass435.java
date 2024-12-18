package X;

import com.facebook.pando.Summary;

/* renamed from: X.435, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass435 extends C40791um implements AnonymousClass436, InterfaceC55612h1 {
    public final Summary A00;
    public final Object A01;
    public final long A02;

    @Override // X.InterfaceC55612h1
    public final /* synthetic */ void EQh(String str) {
    }

    public AnonymousClass435(Summary summary, Object obj) {
        this(summary, obj, 200);
    }

    @Override // X.AnonymousClass436
    public final Integer B8f() {
        if (this.A01 == null) {
            return C05F.A0N;
        }
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

    @Override // X.InterfaceC55612h1
    public final boolean CR4() {
        Summary summary = this.A00;
        if (!C14360o3.A0K(summary.source, "stale_cache") && !C14360o3.A0K(summary.source, "fresh_cache")) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC55612h1
    public final void EQg(long j) {
        throw new UnsupportedOperationException("setCacheReadLatency not supported for IGGraphQLResult");
    }

    @Override // X.InterfaceC55612h1
    public final void EQi(long j) {
        throw new UnsupportedOperationException("setCachedResponseTimeStamp not supported for IGGraphQLResult");
    }

    @Override // X.InterfaceC55612h1
    public final long AjZ() {
        if (!CR4()) {
            return -1L;
        }
        Summary summary = this.A00;
        return summary.cacheEndTime - summary.cacheStartTime;
    }

    @Override // X.InterfaceC55612h1
    public final long Ajf() {
        if (!CR4()) {
            return -1L;
        }
        return this.A02 - this.A00.cacheAge;
    }

    public AnonymousClass435(Summary summary, Object obj, int i) {
        this.A01 = obj;
        this.A00 = summary;
        this.A02 = System.currentTimeMillis();
        String str = summary.source;
        if (C14360o3.A0K(str, "stale_cache") || C14360o3.A0K(str, "fresh_cache")) {
            this.mFromDiskCache = true;
        }
        this.mStatusCode = i;
    }
}
