package X;

import com.instagram.archive.data.ArchiveStoryRecycleBinRepository;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.MgK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51013MgK extends AbstractC52922bZ {
    public final ArchiveStoryRecycleBinRepository A00;
    public final UserSession A01;
    public final C05A A02;
    public final C0UO A03;
    public final C0UO A04;

    public /* synthetic */ C51013MgK(UserSession userSession, String str) {
        ArchiveStoryRecycleBinRepository archiveStoryRecycleBinRepository = new ArchiveStoryRecycleBinRepository(userSession);
        AbstractC167017dG.A1P(userSession, str);
        this.A01 = userSession;
        this.A00 = archiveStoryRecycleBinRepository;
        C008002u A1H = AbstractC25225BEi.A1H(new C50627MWo((Integer) null, (Map) null, (DefaultConstructorMarker) null, 3, 21));
        this.A02 = A1H;
        this.A03 = AbstractC208910l.A02(A1H);
        MWG mwg = new MWG(9, this, archiveStoryRecycleBinRepository.A07);
        this.A04 = AbstractC208910l.A01(new C51757Mtg((Integer) null, (List) null, 7), AbstractC141776au.A00(this), mwg, C10I.A01);
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        this.A00.onUserSessionWillEnd(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v3, types: [X.0sl] */
    public static final List A00(UserSession userSession, Map map) {
        ?? A0i;
        Collection<C3AY> values = map.values();
        ArrayList A1E = AbstractC166987dD.A1E();
        for (C3AY c3ay : values) {
            C51665Mrw c51665Mrw = (C51665Mrw) c3ay.A00;
            Reel reel = (Reel) c3ay.A01;
            if (reel.A14(userSession)) {
                A0i = C16930sl.A00;
            } else {
                int i = 0;
                if (!reel.A15(userSession)) {
                    List A0O = reel.A0O(userSession);
                    C14360o3.A07(A0O);
                    ArrayList A0i2 = AbstractC167007dF.A0i(A0O);
                    int i2 = 0;
                    for (Object obj : A0O) {
                        i++;
                        if (i2 < 0) {
                            AbstractC16960so.A1U();
                            throw C00O.createAndThrow();
                        }
                        C41181vS c41181vS = (C41181vS) obj;
                        C14360o3.A0A(c41181vS);
                        long j = c51665Mrw.A01;
                        C14360o3.A0B(c41181vS, 1);
                        A0i2.add(new OJ8(reel, c41181vS, i2, j));
                        i2 = i;
                    }
                    A0i = AbstractC001800i.A0U(A0i2);
                    java.util.Set set = reel.A1A;
                    C14360o3.A07(set);
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        A0i.add(new C52100N3a(reel, MSX.A05((Number) it.next()), c51665Mrw.A01));
                    }
                } else {
                    C17u A0C = C17s.A0C(0, c51665Mrw.A00);
                    A0i = AbstractC167007dF.A0i(A0C);
                    Iterator it2 = A0C.iterator();
                    while (it2.hasNext()) {
                        A0i.add(new N3Z(reel, ((AbstractC16880sg) it2).A00(), c51665Mrw.A01));
                    }
                }
            }
            AnonymousClass016.A16(A0i, A1E);
        }
        return A1E;
    }
}
