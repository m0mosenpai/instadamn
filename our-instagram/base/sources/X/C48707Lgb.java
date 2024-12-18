package X;

import android.view.View;
import com.instagram.model.direct.stickerstore.DirectStoreSticker;

/* renamed from: X.Lgb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48707Lgb implements InterfaceC50458MPm {
    public final /* synthetic */ L3M A00;

    @Override // X.InterfaceC50458MPm
    public final void Dp8(View view, DirectStoreSticker directStoreSticker) {
    }

    public C48707Lgb(L3M l3m) {
        this.A00 = l3m;
    }

    @Override // X.InterfaceC50458MPm
    public final void DpA(C45058Jwn c45058Jwn, DirectStoreSticker directStoreSticker) {
        C47346Kvv c47346Kvv = this.A00.A03.A00;
        if (c47346Kvv != null) {
            c47346Kvv.A00.accept(directStoreSticker);
        }
    }
}
