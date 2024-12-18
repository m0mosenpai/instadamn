package X;

import com.instagram.closefriends.audiencelists.model.AudienceListViewModel;
import com.instagram.closefriends.audiencelists.repository.AudienceListsListRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Dye, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31820Dye extends AbstractC52922bZ {
    public final C2GT A00;
    public final AudienceListsListRepository A01;

    public final void A00(AudienceListViewModel audienceListViewModel, boolean z) {
        C05A c05a = this.A01.A01;
        List<AudienceListViewModel> list = (List) c05a.getValue();
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((AudienceListViewModel) it.next()).A01;
            String str2 = audienceListViewModel.A01;
            if (C14360o3.A0K(str, str2)) {
                ArrayList A0q = AbstractC167017dG.A0q(list);
                for (AudienceListViewModel audienceListViewModel2 : list) {
                    if (C14360o3.A0K(audienceListViewModel2.A01, str2)) {
                        if (z) {
                            audienceListViewModel2 = audienceListViewModel;
                        } else {
                            audienceListViewModel2 = new AudienceListViewModel(str2, audienceListViewModel.A02, audienceListViewModel.A03, audienceListViewModel.A00, audienceListViewModel.A05, audienceListViewModel.A06, audienceListViewModel2.A04);
                        }
                    }
                    A0q.add(audienceListViewModel2);
                }
                c05a.Egh(A0q);
                return;
            }
        }
    }

    public C31820Dye(AudienceListsListRepository audienceListsListRepository) {
        this.A01 = audienceListsListRepository;
        this.A00 = AbstractC31172DnG.A0E(C10Q.A03(new C57182PaB(6, null), audienceListsListRepository.A02, audienceListsListRepository.A03));
    }
}
