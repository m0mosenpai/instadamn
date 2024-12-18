package X;

import com.facebook.R;

/* renamed from: X.E8k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32086E8k extends C0T6 implements InterfaceC66482zP {
    public final int A00 = R.drawable.instagram_user_following_pano_outline_24;
    public final C34436FGa A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32086E8k) {
                C32086E8k c32086E8k = (C32086E8k) obj;
                if (this.A00 != c32086E8k.A00 || !C14360o3.A0K(this.A03, c32086E8k.A03) || !C14360o3.A0K(this.A02, c32086E8k.A02) || !C14360o3.A0K(this.A01, c32086E8k.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0K(this.A03, this.A00 * 31))) + AbstractC53644Nnp.A00();
    }

    public C32086E8k(C34436FGa c34436FGa, String str, String str2) {
        this.A03 = str;
        this.A02 = str2;
        this.A01 = c34436FGa;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return AbstractC166997dE.A0u(this);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return AbstractC31180DnO.A1X(obj, this);
    }
}
