package X;

import java.util.List;

/* renamed from: X.MuX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51767MuX extends C0T6 implements InterfaceC58104PpT {
    public final MVC A00;
    public final C51600Mqs A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final boolean A06;
    public final boolean A07;
    public final Integer A09 = C05F.A0C;
    public final boolean A08 = true;

    public C51767MuX(MVC mvc, C51600Mqs c51600Mqs, String str, String str2, String str3, List list, boolean z, boolean z2) {
        this.A02 = str;
        this.A01 = c51600Mqs;
        this.A00 = mvc;
        this.A04 = str2;
        this.A03 = str3;
        this.A06 = z;
        this.A07 = z2;
        this.A05 = list;
    }

    @Override // X.InterfaceC58104PpT
    public final String Ar1() {
        return this.A02;
    }

    @Override // X.InterfaceC58104PpT
    public final Integer Ar7() {
        return this.A09;
    }

    @Override // X.InterfaceC58104PpT
    public final boolean Cff() {
        return this.A08;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C51767MuX) && C14360o3.A0K(((C51767MuX) obj).A02, this.A02)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A02.hashCode();
    }
}
