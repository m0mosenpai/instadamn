package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.dictionary.data.DictionaryRepository;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.impl.HiddenWordsPostsDictionary;

/* loaded from: classes8.dex */
public final class KGR extends AbstractC61132qb {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final Integer A02;

    public KGR(InterfaceC11380iw interfaceC11380iw, UserSession userSession, Integer num) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A02 = num;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        InterfaceC125665mD interfaceC125665mD = null;
        C14090nZ CPG = C12L.A00.CPG(104699016, 3);
        Integer num = this.A02;
        Integer num2 = C05F.A01;
        UserSession userSession = this.A01;
        if (num == num2) {
            interfaceC125665mD = new HiddenWordsPostsDictionary(userSession);
        } else {
            MutedWordsFilterManager A00 = AbstractC2042992d.A00(userSession);
            if (A00 != null) {
                interfaceC125665mD = A00.A00;
            }
        }
        return new C44534Jme(new DictionaryRepository(interfaceC125665mD), new L8S(this.A00, userSession), CPG, AnonymousClass194.A02(CPG));
    }
}
