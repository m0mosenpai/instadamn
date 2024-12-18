package X;

import android.content.Context;
import android.view.View;

/* loaded from: classes10.dex */
public final class TGG implements InterfaceC58152PqH {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C62240S3l A01;
    public final /* synthetic */ AbstractC12990ll A02;

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public TGG(Context context, C62240S3l c62240S3l, AbstractC12990ll abstractC12990ll) {
        this.A01 = c62240S3l;
        this.A00 = context;
        this.A02 = abstractC12990ll;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        AbstractC61813Ru7.A00(this.A02).A00(this.A00, null, "ig_acv_consent_debut_reconsider_2", "acv_deeplink_handler", null);
    }
}
