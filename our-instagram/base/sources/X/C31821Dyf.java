package X;

import com.instagram.hallpass.model.HallPassViewModel;
import com.instagram.hallpass.repository.HallPassRepository;
import java.util.ArrayList;

/* renamed from: X.Dyf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31821Dyf extends AbstractC52922bZ {
    public final C2GT A00;
    public final HallPassRepository A01;

    public final void A00(String str) {
        C14360o3.A0B(str, 0);
        C05A c05a = this.A01.A00;
        Iterable<HallPassViewModel> A0w = AbstractC31172DnG.A0w(c05a);
        ArrayList A0q = AbstractC167017dG.A0q(A0w);
        for (HallPassViewModel hallPassViewModel : A0w) {
            String str2 = hallPassViewModel.A04;
            A0q.add(new HallPassViewModel(str2, hallPassViewModel.A05, hallPassViewModel.A03, hallPassViewModel.A06, hallPassViewModel.A01, hallPassViewModel.A02, C14360o3.A0K(str2, str)));
        }
        c05a.Egh(A0q);
    }

    public C31821Dyf(HallPassRepository hallPassRepository) {
        this.A01 = hallPassRepository;
        this.A00 = AbstractC31172DnG.A0E(C10Q.A03(new C57182PaB(27, null), hallPassRepository.A02, hallPassRepository.A01));
    }
}
