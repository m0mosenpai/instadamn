package X;

/* renamed from: X.JzM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45180JzM extends C0T6 implements InterfaceC66482zP {
    public final AbstractC46386Kg8 A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C45180JzM) && C14360o3.A0K(this.A00, ((C45180JzM) obj).A00));
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
        AbstractC46386Kg8 abstractC46386Kg8;
        C45180JzM c45180JzM = (C45180JzM) obj;
        AbstractC46386Kg8 abstractC46386Kg82 = this.A00;
        if (c45180JzM != null) {
            abstractC46386Kg8 = c45180JzM.A00;
        } else {
            abstractC46386Kg8 = null;
        }
        return C14360o3.A0K(abstractC46386Kg82, abstractC46386Kg8);
    }

    public C45180JzM(AbstractC46386Kg8 abstractC46386Kg8) {
        this.A00 = abstractC46386Kg8;
    }
}
