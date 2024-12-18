package X;

import com.instagram.friendmap.data.FriendMapRepository;

/* renamed from: X.KXi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45994KXi extends JQC {
    public final FriendMapRepository A00;
    public final C45999KXn A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45994KXi(FriendMapRepository friendMapRepository, C45999KXn c45999KXn) {
        super(new C26218Bii(c45999KXn.A0P(), null, "", C16930sl.A00, AbstractC133095zb.A04(C6V.A02, C6V.A04, C6V.A03), 250.0f, false, true, true));
        AbstractC167007dF.A1D(friendMapRepository, 1, c45999KXn);
        this.A00 = friendMapRepository;
        this.A01 = c45999KXn;
        AbstractC25232BEp.A1J(this, new MC4(this, null, 37), friendMapRepository.A0N);
    }

    public final void A0P(C45044JwZ c45044JwZ) {
        MNV c49419Lst;
        A0O(ML5.A00);
        if (c45044JwZ == null && (c45044JwZ = ((C26218Bii) A0L()).A01) == null) {
            c49419Lst = C49420Lsu.A00;
        } else {
            c49419Lst = new C49419Lst(c45044JwZ.A04, new ME1(45, c45044JwZ, this), new MHN(this, 42));
        }
        A0M(c49419Lst);
    }
}
