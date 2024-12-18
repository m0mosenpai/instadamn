package X;

import com.facebook.rsys.reactions.gen.ReactionsApi;
import com.facebook.rsys.reactions.gen.ReactionsProxy;

/* renamed from: X.Mzo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52025Mzo extends ReactionsProxy {
    public ReactionsApi A00;

    @Override // com.facebook.rsys.reactions.gen.ReactionsProxy
    public final void setApi(ReactionsApi reactionsApi) {
        C14360o3.A0B(reactionsApi, 0);
        this.A00 = reactionsApi;
    }

    @Override // com.facebook.rsys.reactions.gen.ReactionsProxy
    public final ReactionsApi getApi() {
        ReactionsApi reactionsApi = this.A00;
        if (reactionsApi == null) {
            C14360o3.A0F("reactionsApi");
            throw C00O.createAndThrow();
        }
        return reactionsApi;
    }
}
