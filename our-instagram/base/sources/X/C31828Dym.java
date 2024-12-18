package X;

import com.instagram.hallpass.repository.HallPassMemberListRepository;
import java.util.ArrayList;

/* renamed from: X.Dym, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31828Dym extends AbstractC52922bZ {
    public final C2GT A00;
    public final HallPassMemberListRepository A01;

    public final void A01(String str) {
        C14360o3.A0B(str, 0);
        C05A c05a = this.A01.A00;
        Iterable A0w = AbstractC31172DnG.A0w(c05a);
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : A0w) {
            AbstractC25232BEp.A1Q(AbstractC31171DnF.A0g(obj), str, obj, A1E);
        }
        c05a.Egh(A1E);
    }

    public C31828Dym(HallPassMemberListRepository hallPassMemberListRepository) {
        this.A01 = hallPassMemberListRepository;
        this.A00 = AbstractC31172DnG.A0E(C10Q.A01(new MCV(1, null), hallPassMemberListRepository.A04, hallPassMemberListRepository.A03, hallPassMemberListRepository.A02, hallPassMemberListRepository.A05));
    }

    public final void A00(String str) {
        AbstractC166987dD.A1Z(new PYc(this, str, null, 49), AbstractC141776au.A00(this));
    }
}
