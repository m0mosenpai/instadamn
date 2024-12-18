package X;

import android.content.Context;

/* renamed from: X.WhE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70798WhE implements InterfaceC66482zP, InterfaceC71928XAm {
    public int A00;
    public final C68974VfC A01;
    public final EnumC68206VFy A02;

    @Override // X.InterfaceC71928XAm
    public final int CFo(Context context) {
        int i = this.A00;
        if (i == -1) {
            int A03 = AbstractC43594JPz.A03(context);
            this.A00 = A03;
            return A03;
        }
        return i;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01.A00;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C70798WhE c70798WhE = (C70798WhE) obj;
        C14360o3.A0B(c70798WhE, 0);
        if (this.A02 == c70798WhE.A02 && C14360o3.A0K(this.A01.A01, c70798WhE.A01.A01)) {
            return true;
        }
        return false;
    }

    public C70798WhE(C68974VfC c68974VfC, EnumC68206VFy enumC68206VFy) {
        AbstractC167017dG.A1P(c68974VfC, enumC68206VFy);
        this.A01 = c68974VfC;
        this.A02 = enumC68206VFy;
        this.A00 = -1;
    }
}
