package X;

import android.content.Context;

/* renamed from: X.ESx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32497ESx extends C1P1 {
    public final /* synthetic */ C34625FNi A00;

    public C32497ESx(C34625FNi c34625FNi) {
        this.A00 = c34625FNi;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-1674276592);
        Context context = this.A00.A00;
        C9GR.A03(context, context.getString(2131970001), "product_rejected_dialog_remove_tag_failed", 0);
        C0f9.A0A(-877920432, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1881655482);
        int A032 = C0f9.A03(-663817789);
        C34625FNi c34625FNi = this.A00;
        InterfaceC146006hx interfaceC146006hx = c34625FNi.A04;
        if (interfaceC146006hx != null) {
            interfaceC146006hx.Df8(c34625FNi.A05);
        }
        C0f9.A0A(1919933919, A032);
        C0f9.A0A(-35378170, A03);
    }
}
