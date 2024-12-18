package X;

/* renamed from: X.MvG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51812MvG extends C0T6 implements InterfaceC66482zP {
    public final C38321qM A00;

    public C51812MvG(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 1);
        this.A00 = c38321qM;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C51812MvG) && C14360o3.A0K(this.A00, ((C51812MvG) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        String id = this.A00.getId();
        if (id == null) {
            return "";
        }
        return id;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C51812MvG c51812MvG = (C51812MvG) obj;
        C14360o3.A0B(c51812MvG, 0);
        String id = this.A00.getId();
        if (id == null) {
            id = "";
        }
        String id2 = c51812MvG.A00.getId();
        if (id2 == null) {
            id2 = "";
        }
        return id.equals(id2);
    }
}
