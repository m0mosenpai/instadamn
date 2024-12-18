package X;

import android.view.View;

/* renamed from: X.Ame, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24093Ame implements InterfaceC125355lh {
    public final /* synthetic */ View A00;
    public final /* synthetic */ InterfaceC125355lh A01;

    public C24093Ame(View view, InterfaceC125355lh interfaceC125355lh) {
        this.A00 = view;
        this.A01 = interfaceC125355lh;
    }

    @Override // X.InterfaceC125355lh
    public final void onFinish() {
        this.A00.setVisibility(8);
        this.A01.onFinish();
    }
}
