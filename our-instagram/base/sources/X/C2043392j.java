package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.92j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2043392j implements InterfaceC2043492k {
    public final UserSession A00;
    public final EnumC2043192h A01;
    public final ConcurrentHashMap A02;
    public final /* synthetic */ MutedWordsFilterManager A03;

    public C2043392j(UserSession userSession, EnumC2043192h enumC2043192h, MutedWordsFilterManager mutedWordsFilterManager) {
        C14360o3.A0B(userSession, 2);
        this.A03 = mutedWordsFilterManager;
        this.A00 = userSession;
        this.A01 = enumC2043192h;
        this.A02 = new ConcurrentHashMap();
    }

    @Override // X.InterfaceC2043492k
    public final void DAC(ContentFilterDictionaryImpl contentFilterDictionaryImpl) {
        C14360o3.A0B(contentFilterDictionaryImpl, 0);
        this.A03.A0D.remove(contentFilterDictionaryImpl);
        A00();
    }

    @Override // X.InterfaceC2043492k
    public final void DAE(ContentFilterDictionaryImpl contentFilterDictionaryImpl) {
        C14360o3.A0B(contentFilterDictionaryImpl, 0);
        MutedWordsFilterManager mutedWordsFilterManager = this.A03;
        mutedWordsFilterManager.A0D.add(contentFilterDictionaryImpl);
        A00();
        ConcurrentHashMap concurrentHashMap = this.A02;
        concurrentHashMap.remove(contentFilterDictionaryImpl.A0A);
        if (concurrentHashMap.isEmpty() && !mutedWordsFilterManager.A0F.getAndSet(true)) {
            C18U.A06(C06090Tz.A05, this.A00, 36311912674886455L);
            Iterator it = mutedWordsFilterManager.A0C.iterator();
            while (it.hasNext()) {
                ((C209869Px) it.next()).A00.A01(true);
            }
        }
    }

    private final void A00() {
        Iterator it = this.A03.A0C.iterator();
        while (it.hasNext()) {
            ((C209869Px) it.next()).A00.A07.compareAndSet(false, true);
        }
    }

    @Override // X.InterfaceC2043492k
    public final EnumC2043192h Anx() {
        return this.A01;
    }

    @Override // X.InterfaceC2043492k
    public final UserSession CE4() {
        return this.A00;
    }

    @Override // X.InterfaceC2043492k
    public final void DAF(List list) {
        MutedWordsFilterManager mutedWordsFilterManager = this.A03;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ContentFilterDictionaryImpl contentFilterDictionaryImpl = (ContentFilterDictionaryImpl) it.next();
            if (mutedWordsFilterManager.A0B.A00(contentFilterDictionaryImpl.A09)) {
                this.A02.put(contentFilterDictionaryImpl.A0A, C0eB.A00);
            }
        }
        C19L c19l = mutedWordsFilterManager.A0G;
        C9D4 c9d4 = new C9D4(list, mutedWordsFilterManager, (InterfaceC23621Ds) null, 8);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9d4, c19l);
    }

    @Override // X.InterfaceC2043492k
    public final void DAG(ContentFilterDictionaryImpl contentFilterDictionaryImpl, List list, List list2) {
        A00();
    }
}
