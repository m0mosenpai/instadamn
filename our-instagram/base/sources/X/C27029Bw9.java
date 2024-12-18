package X;

import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.settings.facts.repository.FactsRepository;
import com.instagram.creator.agent.settings.facts.viewmodel.AddFactUseCase;
import com.instagram.creator.agent.settings.facts.viewmodel.LinkPreviewUseCaseImpl;
import com.instagram.creator.agent.settings.facts.viewmodel.QuestionAnswerFactPreviewUseCaseImpl;
import com.instagram.creator.agent.settings.facts.viewmodel.SingularFactPreviewUseCaseImpl;

/* renamed from: X.Bw9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27029Bw9 extends AbstractC61132qb {
    public final UserSession A00;
    public final EnumC27380C6j A01;
    public final String A02;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        C26064Bfs c26064Bfs;
        C26045BfY c26045BfY;
        AbstractC26895Btw singularFactPreviewUseCaseImpl;
        EnumC27380C6j enumC27380C6j = this.A01;
        UserSession userSession = this.A00;
        String str = this.A02;
        boolean A1R = AbstractC167007dF.A1R(0, enumC27380C6j, userSession);
        C14360o3.A0B(str, 2);
        FactsRepository factsRepository = new FactsRepository(enumC27380C6j, AbstractC40691uc.A01(userSession), str, C4A8.A01(245403032, 3));
        int ordinal = enumC27380C6j.ordinal();
        if (ordinal != 0) {
            if (ordinal != A1R) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        c26064Bfs = C26899Bu0.A07;
                    } else {
                        throw B4Z.A00();
                    }
                } else {
                    c26064Bfs = C26899Bu0.A08;
                }
            } else {
                c26064Bfs = C26899Bu0.A09;
            }
        } else {
            c26064Bfs = C26899Bu0.A0A;
        }
        C26899Bu0 c26899Bu0 = new C26899Bu0(c26064Bfs, factsRepository);
        if (ordinal != 0) {
            if (ordinal != A1R) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        c26045BfY = AddFactUseCase.A07;
                    } else {
                        throw B4Z.A00();
                    }
                } else {
                    c26045BfY = AddFactUseCase.A08;
                }
            } else {
                c26045BfY = AddFactUseCase.A09;
            }
        } else {
            c26045BfY = AddFactUseCase.A0A;
        }
        AddFactUseCase addFactUseCase = new AddFactUseCase(factsRepository, c26045BfY);
        if (ordinal != 3 && ordinal != 0) {
            if (ordinal != A1R) {
                singularFactPreviewUseCaseImpl = new LinkPreviewUseCaseImpl(factsRepository);
            } else {
                singularFactPreviewUseCaseImpl = new QuestionAnswerFactPreviewUseCaseImpl(factsRepository);
            }
        } else {
            singularFactPreviewUseCaseImpl = new SingularFactPreviewUseCaseImpl(factsRepository);
        }
        return new C26901Bu4(factsRepository, addFactUseCase, c26899Bu0, singularFactPreviewUseCaseImpl);
    }

    public C27029Bw9(UserSession userSession, EnumC27380C6j enumC27380C6j, String str) {
        AbstractC167027dH.A13(userSession, enumC27380C6j, str);
        this.A00 = userSession;
        this.A01 = enumC27380C6j;
        this.A02 = str;
    }
}
