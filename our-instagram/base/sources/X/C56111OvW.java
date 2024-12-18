package X;

import android.view.View;

/* renamed from: X.OvW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56111OvW implements InterfaceC66482zP {
    public final int A00;
    public final View.OnClickListener A01;
    public final CharSequence A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return AnonymousClass001.A0R("postlive_to_facebook", this.A04);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C56111OvW c56111OvW = (C56111OvW) obj;
        C14360o3.A0B(c56111OvW, 0);
        if (AbstractC50102Ry.A00(this.A04, c56111OvW.A04) && AbstractC50102Ry.A00(this.A03, c56111OvW.A03) && AbstractC50102Ry.A00(this.A02, c56111OvW.A02) && AbstractC50102Ry.A00(this.A01, c56111OvW.A01) && AbstractC50102Ry.A00(Boolean.valueOf(this.A05), Boolean.valueOf(c56111OvW.A05)) && AbstractC50102Ry.A00(Integer.valueOf(this.A00), Integer.valueOf(c56111OvW.A00))) {
            return true;
        }
        return false;
    }

    public C56111OvW(View.OnClickListener onClickListener, CharSequence charSequence, String str, String str2, int i, boolean z) {
        this.A04 = str;
        this.A03 = str2;
        this.A02 = charSequence;
        this.A01 = onClickListener;
        this.A05 = z;
        this.A00 = i;
    }
}
