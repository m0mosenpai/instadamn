package X;

import com.instagram.creator.agent.settings.content.sources.fetch.IGCreatorAIContentCategoriesRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.BuB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26908BuB extends AbstractC61152qd {
    public final IGCreatorAIContentCategoriesRepository A00;
    public final Map A01;
    public final C05A A02;
    public final C0UO A03;

    public static final void A00(C26908BuB c26908BuB, EnumC27417C7u enumC27417C7u, boolean z) {
        Object value;
        C6R c6r;
        List<C26079Bg8> list = (List) ((C50627MWo) c26908BuB.A03.getValue()).A00;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        for (C26079Bg8 c26079Bg8 : list) {
            EnumC27417C7u enumC27417C7u2 = (EnumC27417C7u) c26079Bg8.A02;
            if (enumC27417C7u2 == enumC27417C7u) {
                String str = c26079Bg8.A04;
                String str2 = c26079Bg8.A03;
                Integer num = (Integer) c26079Bg8.A01;
                AbstractC167027dH.A12(enumC27417C7u2, str, str2);
                c26079Bg8 = new C26079Bg8(enumC27417C7u2, num, str, str2, z);
            }
            A0q.add(c26079Bg8);
        }
        C05A c05a = c26908BuB.A02;
        do {
            value = c05a.getValue();
            c6r = (C6R) ((C50627MWo) value).A01;
            C14360o3.A0B(c6r, 1);
        } while (!c05a.AIi(value, new C50627MWo(c6r, A0q, 48)));
    }

    public C26908BuB(IGCreatorAIContentCategoriesRepository iGCreatorAIContentCategoriesRepository) {
        this.A00 = iGCreatorAIContentCategoriesRepository;
        C008002u A1H = AbstractC25225BEi.A1H(new C50627MWo(C6R.A03, C16930sl.A00, 48));
        this.A02 = A1H;
        this.A03 = A1H;
        this.A01 = AbstractC166987dD.A1I();
    }
}
