package X;

import java.util.List;

/* renamed from: X.IvH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42722IvH implements InterfaceC82433m7 {
    public final List A00;

    @Override // X.InterfaceC82433m7
    public final void AUC(List list) {
        list.addAll(this.A00);
    }

    @Override // X.InterfaceC82433m7
    public final C82713mZ BH8() {
        return (C82713mZ) AbstractC166987dD.A16(this.A00);
    }

    @Override // X.InterfaceC82443m8
    public final /* synthetic */ EnumC39552HdO Epo() {
        return EnumC39552HdO.A03;
    }

    public C42722IvH(List list) {
        this.A00 = list;
    }
}
