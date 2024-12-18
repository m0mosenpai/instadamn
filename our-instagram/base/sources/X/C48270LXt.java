package X;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: X.LXt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48270LXt implements C1NJ {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C47698L4f A01;

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    public C48270LXt(Context context, C47698L4f c47698L4f) {
        this.A01 = c47698L4f;
        this.A00 = context;
    }

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        this.A01.A02.setBackgroundDrawable(new BitmapDrawable(this.A00.getResources(), c73033Pe.A01));
    }
}
