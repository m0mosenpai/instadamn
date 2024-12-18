package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.WhA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70797WhA implements InterfaceC66482zP {
    public final float A00;
    public final int A01;
    public final long A02;
    public final C51745MtU A03;
    public final ImageUrl A04;
    public final User A05;
    public final EnumC223199sy A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return Long.valueOf(this.A02);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C70797WhA c70797WhA = (C70797WhA) obj;
        C14360o3.A0B(c70797WhA, 0);
        if (this.A02 == c70797WhA.A02 && C14360o3.A0K(this.A07, c70797WhA.A07) && C14360o3.A0K(this.A05, c70797WhA.A05) && this.A01 == c70797WhA.A01 && this.A0C == c70797WhA.A0C && this.A0B == c70797WhA.A0B && this.A06 == c70797WhA.A06 && C14360o3.A0K(this.A03, c70797WhA.A03)) {
            return true;
        }
        return false;
    }

    public C70797WhA(C51745MtU c51745MtU, ImageUrl imageUrl, User user, EnumC223199sy enumC223199sy, String str, float f, int i, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A02 = j;
        this.A07 = str;
        this.A04 = imageUrl;
        this.A05 = user;
        this.A01 = i;
        this.A00 = f;
        this.A08 = z;
        this.A0C = z2;
        this.A0B = z3;
        this.A09 = z4;
        this.A0A = z5;
        this.A06 = enumC223199sy;
        this.A03 = c51745MtU;
    }
}
