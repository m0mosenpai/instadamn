package X;

import androidx.paging.AsyncPagingDataDiffer$differBase$1;
import java.util.List;

/* renamed from: X.Pbu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57272Pbu extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AsyncPagingDataDiffer$differBase$1 A02;
    public final /* synthetic */ InterfaceC57894Ply A03;
    public final /* synthetic */ OX8 A04;
    public final /* synthetic */ OX8 A05;
    public final /* synthetic */ C55581OmJ A06;
    public final /* synthetic */ List A07;
    public final /* synthetic */ C14510oO A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57272Pbu(AsyncPagingDataDiffer$differBase$1 asyncPagingDataDiffer$differBase$1, InterfaceC57894Ply interfaceC57894Ply, OX8 ox8, OX8 ox82, C55581OmJ c55581OmJ, List list, C14510oO c14510oO, int i, int i2) {
        super(0);
        this.A02 = asyncPagingDataDiffer$differBase$1;
        this.A06 = c55581OmJ;
        this.A08 = c14510oO;
        this.A03 = interfaceC57894Ply;
        this.A04 = ox8;
        this.A07 = list;
        this.A01 = i;
        this.A00 = i2;
        this.A05 = ox82;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        Object obj;
        AsyncPagingDataDiffer$differBase$1 asyncPagingDataDiffer$differBase$1 = this.A02;
        asyncPagingDataDiffer$differBase$1.A01 = this.A06;
        this.A08.A00 = true;
        InterfaceC57894Ply interfaceC57894Ply = this.A03;
        asyncPagingDataDiffer$differBase$1.A00 = interfaceC57894Ply;
        OX8 ox8 = this.A04;
        List list = this.A07;
        int i = this.A01;
        int i2 = this.A00;
        OX8 ox82 = this.A05;
        if (AbstractC53592Nmz.A00 != null && MSW.A1a(3)) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("Presenting data:\n                            |   first item: ");
            C55090Oaw c55090Oaw = (C55090Oaw) AbstractC001800i.A0J(list);
            Object obj2 = null;
            if (c55090Oaw != null) {
                obj = AbstractC001800i.A0J(c55090Oaw.A01);
            } else {
                obj = null;
            }
            A1C.append(obj);
            A1C.append("\n                            |   last item: ");
            C55090Oaw c55090Oaw2 = (C55090Oaw) AbstractC001800i.A0L(list);
            if (c55090Oaw2 != null) {
                obj2 = AbstractC001800i.A0L(c55090Oaw2.A01);
            }
            A1C.append(obj2);
            A1C.append("\n                            |   placeholdersBefore: ");
            A1C.append(i);
            A1C.append("\n                            |   placeholdersAfter: ");
            A1C.append(i2);
            A1C.append("\n                            |   hintReceiver: ");
            A1C.append(interfaceC57894Ply);
            A1C.append("\n                            |   sourceLoadStates: ");
            A1C.append(ox82);
            AbstractC16490ru.A0q(AnonymousClass001.A0R(AbstractC50522MSa.A0l(ox8, "\n                        ", A1C), "|)"), "|");
        }
        return C0eB.A00;
    }
}
