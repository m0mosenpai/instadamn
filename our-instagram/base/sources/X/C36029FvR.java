package X;

import android.content.Context;

/* renamed from: X.FvR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36029FvR implements XCT {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C36029FvR(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.XCT
    public final void onFailure(Throwable th) {
        Context context;
        String str;
        switch (this.A00) {
            case 0:
                AbstractC166987dD.A1Y(this.A01);
                return;
            case 1:
                AbstractC31171DnF.A1N(this.A02);
                context = (Context) this.A01;
                str = "family_center_bloks_action_failed";
                C9GR.A0F(context, str, 2131961896);
                return;
            default:
                AbstractC31171DnF.A1N(this.A02);
                context = (Context) this.A01;
                str = "supervision_bloks_action_failed";
                C9GR.A0F(context, str, 2131961896);
                return;
        }
    }

    @Override // X.XCT
    public final void onSuccess() {
        if (this.A00 != 0) {
            AbstractC31171DnF.A1N(this.A02);
        } else {
            AbstractC166987dD.A1Y(this.A02);
        }
    }
}
