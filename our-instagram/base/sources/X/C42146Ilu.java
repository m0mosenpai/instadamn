package X;

import android.os.Bundle;

/* renamed from: X.Ilu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42146Ilu implements InterfaceC43590JPv {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    @Override // X.InterfaceC43590JPv
    public final boolean CZd() {
        return true;
    }

    public C42146Ilu(String str, String str2, String str3, String str4, boolean z) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = z;
        this.A00 = str4;
    }

    @Override // X.InterfaceC43590JPv
    public final InterfaceC43433JGx ALJ(InterfaceC11380iw interfaceC11380iw) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("IgSessionManager.SESSION_TOKEN_KEY", this.A03);
        return new C42143Ilr(interfaceC11380iw, C023409i.A0A.A06(A0b), this.A01, this.A02, this.A00, this.A04);
    }
}
