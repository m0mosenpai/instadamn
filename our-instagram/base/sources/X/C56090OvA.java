package X;

import android.view.View;

/* renamed from: X.OvA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56090OvA implements InterfaceC66482zP {
    public final int A00;
    public final View.OnClickListener A01;

    public C56090OvA(View.OnClickListener onClickListener, int i) {
        C14360o3.A0B(onClickListener, 4);
        this.A00 = i;
        this.A01 = onClickListener;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return Integer.valueOf(this.A00);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C56090OvA c56090OvA = (C56090OvA) obj;
        C14360o3.A0B(c56090OvA, 0);
        return AbstractC167007dF.A1P(this.A00, c56090OvA.A00);
    }
}
