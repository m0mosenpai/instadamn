package X;

import com.facebook.traffic.nts.providers.httpinterceptor.HttpRequestInterface;

/* loaded from: classes10.dex */
public final class T29 implements HttpRequestInterface {
    public final C1QW A00;

    @Override // com.facebook.traffic.nts.providers.httpinterceptor.HttpRequestInterface
    public final String getUrlOrThrow() {
        return AbstractC166987dD.A19(this.A00.A09);
    }

    public T29(C1QW c1qw) {
        this.A00 = c1qw;
    }

    @Override // com.facebook.traffic.nts.providers.httpinterceptor.HttpRequestInterface
    public final void setHeader(String str, String str2) {
        AbstractC167017dG.A1N(str, str2);
        this.A00.A01(str, str2);
    }
}
