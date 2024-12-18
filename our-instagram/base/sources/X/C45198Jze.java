package X;

import java.util.List;

/* renamed from: X.Jze, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45198Jze extends C0T6 implements InterfaceC66482zP {
    public final String A00;
    public final String A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45198Jze) {
                C45198Jze c45198Jze = (C45198Jze) obj;
                if (!C14360o3.A0K(this.A01, c45198Jze.A01) || !C14360o3.A0K(this.A00, c45198Jze.A00) || !C14360o3.A0K(this.A02, c45198Jze.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return AbstractC43593JPy.A0r(this.A01);
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A00, AbstractC166987dD.A0J(this.A01)) + AbstractC167017dG.A0M(this.A02);
    }

    public C45198Jze(String str, String str2, List list) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = list;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return AbstractC31180DnO.A1X(obj, this);
    }
}
