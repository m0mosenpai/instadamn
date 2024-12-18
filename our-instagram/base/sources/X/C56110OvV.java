package X;

import android.view.View;

/* renamed from: X.OvV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56110OvV implements InterfaceC66482zP {
    public final View.OnClickListener A00;
    public final EnumC53261Ngz A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return Integer.valueOf(this.A01.A00);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C56110OvV c56110OvV = (C56110OvV) obj;
        C14360o3.A0B(c56110OvV, 0);
        if (this.A01.A00 == c56110OvV.A01.A00 && C14360o3.A0K(this.A02, c56110OvV.A02) && this.A04 == c56110OvV.A04 && this.A03 == c56110OvV.A03) {
            return true;
        }
        return false;
    }

    public C56110OvV(View.OnClickListener onClickListener, EnumC53261Ngz enumC53261Ngz, String str, boolean z, boolean z2) {
        this.A01 = enumC53261Ngz;
        this.A02 = str;
        this.A04 = z;
        this.A03 = z2;
        this.A00 = onClickListener;
    }
}
