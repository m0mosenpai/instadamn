package X;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LWP implements C2JL {
    public final int A00;
    public final Object A01;

    public LWP(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
        switch (this.A00) {
            case 1:
                C14360o3.A0B(th, 0);
                XP9 xp9 = (XP9) this.A01;
                Integer num = C05F.A00;
                ImmutableMap immutableMap = RegularImmutableMap.A02;
                C14360o3.A07(immutableMap);
                xp9.DnK(immutableMap, num, "Document model fetch error");
                xp9.DBB(new Exception("Showreel Native Animation Resource API call failed", th));
                return;
            case 2:
            case 3:
                ((InterfaceC23621Ds) this.A01).resumeWith(AbstractC166997dE.A0a());
                return;
            default:
                return;
        }
    }

    @Override // X.C2JL
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C66192U3h c66192U3h;
        XP9 xp9;
        String str;
        switch (this.A00) {
            case 0:
                c66192U3h = (C66192U3h) obj;
                xp9 = (XP9) this.A01;
                str = "cache";
                break;
            case 1:
                c66192U3h = (C66192U3h) obj;
                xp9 = (XP9) this.A01;
                str = "network";
                break;
            case 2:
            case 3:
            default:
                ((InterfaceC23621Ds) this.A01).resumeWith(AbstractC166997dE.A0b());
                return;
            case 4:
                C92104Aq A00 = C92104Aq.A00();
                if (A00 != null) {
                    A00.A01();
                }
                MVS mvs = (MVS) this.A01;
                UserSession userSession = mvs.A03;
                C38321qM c38321qM = mvs.A00;
                if (c38321qM != null) {
                    C1ON A04 = AbstractC37797GkC.A04(userSession, c38321qM.A38(), null, null);
                    A04.A00 = new C39030HGg(mvs, 32);
                    C1GJ.A06(A04, 1368380687, 2, true, false);
                    return;
                }
                C14360o3.A0F("media");
                throw C00O.createAndThrow();
        }
        xp9.DBD(str, AbstractC66188U3d.A00(c66192U3h));
    }
}
