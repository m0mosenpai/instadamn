package com.instagram.debug.devoptions.section.localinjection;

import X.AbstractC10360h2;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC31173DnH;
import X.AbstractC44098JeN;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class InjectMediaToolFragmentAdapter extends AbstractC44098JeN {
    public final List injectionGroups;
    public final UserSession userSession;

    @Override // X.AbstractC44098JeN
    public Fragment createItem(int i) {
        InjectMediaFragment injectMediaFragment = new InjectMediaFragment();
        Bundle A0b = AbstractC166987dD.A0b();
        AbstractC31173DnH.A1C(A0b, this.userSession);
        List list = ((LocalMediaInjectionConstants.InjectionGroup) this.injectionGroups.get(i)).options;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(((LocalMediaInjectionConstants.InjectionContentType) it.next()).getValue());
        }
        A0b.putStringArrayList(LocalMediaInjectionConstants.CONTENT_TYPE_KEY, AbstractC166987dD.A1F(A0q));
        injectMediaFragment.setArguments(A0b);
        return injectMediaFragment;
    }

    @Override // X.AbstractC021208i
    public int getCount() {
        return this.injectionGroups.size();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InjectMediaToolFragmentAdapter(AbstractC10360h2 abstractC10360h2, UserSession userSession, List list) {
        super(abstractC10360h2);
        AbstractC167027dH.A13(abstractC10360h2, userSession, list);
        this.userSession = userSession;
        this.injectionGroups = list;
    }
}
