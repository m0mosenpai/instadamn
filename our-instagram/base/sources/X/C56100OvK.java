package X;

import android.view.View;

/* renamed from: X.OvK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56100OvK implements InterfaceC66482zP {
    public final int A00;
    public final View.OnClickListener A01;
    public final String A02;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return Integer.valueOf(this.A00);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C56100OvK c56100OvK = (C56100OvK) obj;
        C14360o3.A0B(c56100OvK, 0);
        if (this.A00 == c56100OvK.A00 && C14360o3.A0K(this.A02, c56100OvK.A02)) {
            return true;
        }
        return false;
    }

    public C56100OvK(View.OnClickListener onClickListener, String str, int i) {
        this.A00 = i;
        this.A01 = onClickListener;
        this.A02 = str;
    }
}
