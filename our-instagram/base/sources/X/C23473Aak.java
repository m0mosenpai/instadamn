package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.Aak, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23473Aak implements InterfaceC94594Nm {
    public final MUD A00;
    public final InterfaceC09390do A01;

    public C23473Aak(MUD mud) {
        C14360o3.A0B(mud, 1);
        this.A00 = mud;
        this.A01 = AbstractC09440dt.A01(new C57519Pft(this, 4));
    }

    @Override // X.InterfaceC94594Nm
    public final ImmutableList E6L() {
        return (ImmutableList) AbstractC166987dD.A17(this.A01);
    }
}
