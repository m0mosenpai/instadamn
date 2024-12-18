package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.TyJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66021TyJ implements C2JL {
    public final /* synthetic */ X93 A00;
    public final /* synthetic */ C149996ot A01;
    public final /* synthetic */ List A02;

    public C66021TyJ(X93 x93, C149996ot c149996ot, List list) {
        this.A01 = c149996ot;
        this.A00 = x93;
        this.A02 = list;
    }

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
        this.A00.D6c((Exception) th, this.A02, null);
    }

    @Override // X.C2JL
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        this.A00.D6c(null, this.A02, (Map) obj);
    }
}
