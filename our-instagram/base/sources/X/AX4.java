package X;

import java.util.List;

/* loaded from: classes4.dex */
public final class AX4 implements InterfaceC150406pp {
    public final /* synthetic */ C24213Aof A00;

    public AX4(C24213Aof c24213Aof) {
        this.A00 = c24213Aof;
    }

    @Override // X.InterfaceC150406pp
    public final void DDw(C22908A8d c22908A8d, InterfaceC203868zv interfaceC203868zv) {
        C24213Aof c24213Aof = this.A00;
        c24213Aof.A00 = interfaceC203868zv;
        List list = c24213Aof.A09;
        C09530e4 A0X = AbstractC167027dH.A0X();
        C09530e4 A0Y = AbstractC167027dH.A0Y(C05F.A1F);
        String str = c22908A8d.A02;
        C09530e4 A1L = AbstractC166987dD.A1L("text", str);
        C09530e4 A1L2 = AbstractC166987dD.A1L("userEdited", Boolean.valueOf(c22908A8d.A03));
        C09530e4 A1L3 = AbstractC166987dD.A1L("inputTypeHint", c22908A8d.A01);
        int length = str.length();
        int i = c22908A8d.A00;
        if (i < 0 || i > length) {
            i = length;
        }
        list.add(AbstractC61636Rr0.A00(A0X, A0Y, A1L, A1L2, A1L3, AbstractC166987dD.A1L("cursorStartIndex", Integer.valueOf(i))));
    }
}
