package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.AbstractCollection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9Fu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207419Fu extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final Object A01;
    public final String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207419Fu(String str, Object obj, int i) {
        super(2);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C47v c47v;
        C5JH A00;
        if (this.A00 != 0) {
            C203248yh c203248yh = (C203248yh) obj;
            List<C5NL> list = (List) obj2;
            C14360o3.A0B(c203248yh, 0);
            C14360o3.A0B(list, 1);
            UserSession userSession = (UserSession) this.A01;
            String str = this.A02;
            C14360o3.A0B(userSession, 0);
            C14360o3.A0B(str, 1);
            C120555d0 c120555d0 = new C120555d0(userSession.userId, str);
            C48k A002 = C48k.A00(userSession.deviceSession.A06());
            C14360o3.A07(A002);
            HashSet hashSet = new HashSet();
            for (C5NL c5nl : list) {
                if (c5nl != null) {
                    HashSet hashSet2 = new HashSet();
                    if (c5nl instanceof Wm3) {
                        hashSet2.add(((Wm3) c5nl).A05);
                    } else if (c5nl instanceof C217849kH) {
                        Iterator it = ((C217849kH) c5nl).A00().A0O.iterator();
                        while (it.hasNext()) {
                            ImmutableList A03 = ((C148286ly) it.next()).A03();
                            if (A03 != null && !A03.isEmpty()) {
                                hashSet2.addAll(A03);
                            }
                        }
                    }
                    hashSet.addAll(hashSet2);
                }
            }
            C8r2 c8r2 = c203248yh.A01;
            if (c8r2 != null && (c47v = c8r2.A07) != null && (A00 = c47v.A00(C5JI.A04)) != null) {
                hashSet.add(A00.A05);
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                A002.A02(c120555d0, (String) it2.next());
            }
        } else {
            C14360o3.A0B(obj, 0);
            C14360o3.A0B(obj2, 1);
            AbstractCollection abstractCollection = (AbstractCollection) ((C183328Bf) this.A01).A03.A09.get(this.A02);
            if (abstractCollection != null) {
                Iterator it3 = abstractCollection.iterator();
                while (it3.hasNext()) {
                    ((InterfaceC16620sF) it3.next()).invoke(obj, obj2);
                }
            }
        }
        return C0eB.A00;
    }
}
