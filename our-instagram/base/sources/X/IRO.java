package X;

import com.instagram.common.session.UserSession;
import com.instagram.monetization.onboarding.repository.OnboardingRepository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class IRO {
    public static final OnboardingRepository A00(UserSession userSession, HashMap hashMap) {
        C14360o3.A0B(userSession, 0);
        return (OnboardingRepository) userSession.A01(OnboardingRepository.class, new C57531Pg5(2, hashMap, userSession));
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.instagram.monetization.onboarding.model.ProductOnboardingNextStepInfo, java.lang.Object] */
    public static final List A01(List list) {
        C14360o3.A0B(list, 0);
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            H4J h4j = (H4J) ((InterfaceC43473JIl) it.next());
            int i = h4j.A00;
            String str = h4j.A01.A00;
            ?? obj = new Object();
            obj.A00 = i;
            obj.A02 = str;
            obj.A01 = "incomplete";
            A0q.add(obj);
        }
        return A0q;
    }
}
