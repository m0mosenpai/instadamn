package X;

/* renamed from: X.MvJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51815MvJ extends C0T6 implements InterfaceC66482zP {
    public int A00 = -1;
    public final int A01;
    public final C38321qM A02;

    public C51815MvJ(C38321qM c38321qM, int i) {
        this.A02 = c38321qM;
        this.A01 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51815MvJ) {
                C51815MvJ c51815MvJ = (C51815MvJ) obj;
                if (!C14360o3.A0K(this.A02, c51815MvJ.A02) || this.A01 != c51815MvJ.A01 || this.A00 != c51815MvJ.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        String id = this.A02.getId();
        if (id != null) {
            return id;
        }
        throw AbstractC166997dE.A0g();
    }

    public final int hashCode() {
        return ((AbstractC166987dD.A0G(this.A02) + this.A01) * 31) + this.A00;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C51815MvJ c51815MvJ = (C51815MvJ) obj;
        C14360o3.A0B(c51815MvJ, 0);
        if (C14360o3.A0K(this.A02.getId(), c51815MvJ.A02.getId()) && this.A01 == c51815MvJ.A01 && this.A00 == c51815MvJ.A00) {
            return true;
        }
        return false;
    }
}
