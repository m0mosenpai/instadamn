package X;

/* renamed from: X.E8b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32077E8b extends C0T6 implements InterfaceC66482zP {
    public final C51758Mth A00;
    public final boolean A01;

    public C32077E8b(C51758Mth c51758Mth, boolean z) {
        C14360o3.A0B(c51758Mth, 1);
        this.A00 = c51758Mth;
        this.A01 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32077E8b) {
                C32077E8b c32077E8b = (C32077E8b) obj;
                if (!C14360o3.A0K(this.A00, c32077E8b.A00) || this.A01 != c32077E8b.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        String name = ((InterfaceC37273GbQ) this.A00.A00).getName();
        if (name == null) {
            return "";
        }
        return name;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C51758Mth c51758Mth;
        C51758Mth c51758Mth2;
        InterfaceC37273GbQ interfaceC37273GbQ;
        C32077E8b c32077E8b = (C32077E8b) obj;
        C51758Mth c51758Mth3 = this.A00;
        String name = ((InterfaceC37273GbQ) c51758Mth3.A00).getName();
        if (c32077E8b != null && (c51758Mth2 = c32077E8b.A00) != null && (interfaceC37273GbQ = (InterfaceC37273GbQ) c51758Mth2.A00) != null) {
            str = interfaceC37273GbQ.getName();
        } else {
            str = null;
        }
        if (C14360o3.A0K(name, str) && c32077E8b != null && (c51758Mth = c32077E8b.A00) != null && c51758Mth3.A01 == c51758Mth.A01 && this.A01 == c32077E8b.A01) {
            return true;
        }
        return false;
    }
}
