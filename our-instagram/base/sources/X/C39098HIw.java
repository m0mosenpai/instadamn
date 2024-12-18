package X;

import android.content.Context;

/* renamed from: X.HIw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39098HIw extends C4F4 implements InterfaceC71928XAm {
    public final C1571273r A00;
    public final EnumC153216up A01;

    @Override // X.InterfaceC71928XAm
    public final int CFo(Context context) {
        return -1;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C39098HIw c39098HIw = (C39098HIw) obj;
        if (this.A01 == c39098HIw.A01 && this.A00.equals(c39098HIw.A00)) {
            return true;
        }
        return false;
    }

    public C39098HIw(C1571273r c1571273r, EnumC153216up enumC153216up) {
        this.A00 = c1571273r;
        this.A01 = enumC153216up;
    }
}
