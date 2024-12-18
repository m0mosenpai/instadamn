package X;

import android.view.ViewGroup;

/* renamed from: X.Amd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24092Amd implements InterfaceC125355lh {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ boolean A01;

    public C24092Amd(ViewGroup viewGroup, boolean z) {
        this.A01 = z;
        this.A00 = viewGroup;
    }

    @Override // X.InterfaceC125355lh
    public final void onFinish() {
        if (!this.A01) {
            this.A00.setVisibility(8);
        }
    }
}
