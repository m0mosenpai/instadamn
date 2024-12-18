package X;

/* loaded from: classes11.dex */
public final class URY extends C0T6 implements InterfaceC66482zP {
    public final UPK A00;

    public URY(UPK upk) {
        C14360o3.A0B(upk, 1);
        this.A00 = upk;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof URY) && C14360o3.A0K(this.A00, ((URY) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.toString();
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        UPK upk;
        URY ury = (URY) obj;
        UPK upk2 = this.A00;
        if (ury != null) {
            upk = ury.A00;
        } else {
            upk = null;
        }
        return C14360o3.A0K(upk2, upk);
    }
}
