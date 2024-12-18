package X;

import android.content.Context;
import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3E3, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3E3 implements InterfaceC40181tm {
    @Override // X.InterfaceC40181tm
    public final /* synthetic */ void DEN(InterfaceC40821up interfaceC40821up, UserSession userSession, C47Z c47z) {
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [X.O3e, java.lang.Object] */
    @Override // X.InterfaceC40181tm
    public final /* bridge */ /* synthetic */ C26461Qb AEa(Context context, C22P c22p, MediaUploadMetadata mediaUploadMetadata, UserSession userSession, ShareType shareType, Object obj, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        EnumC53323Ni0 enumC53323Ni0;
        C27874CQl c27874CQl = (C27874CQl) obj;
        if (z4) {
            enumC53323Ni0 = EnumC53323Ni0.A0O;
        } else {
            enumC53323Ni0 = EnumC53323Ni0.A0N;
        }
        C25621Ms A01 = C55230Of1.A01(c22p, mediaUploadMetadata, userSession, enumC53323Ni0, str, str4, C16030qx.A00(context), str6, str7, list, z, z2, z3, z5);
        C47Z c47z = c27874CQl.A00;
        C55230Of1.A0J(A01, userSession, AbstractC54080Nve.A00(c47z), j, z);
        AbstractC55161OdP.A02(A01, shareType);
        long j2 = c47z.A0e;
        C14360o3.A0B(userSession, 1);
        AbstractC55161OdP.A01(A01, userSession, AbstractC55161OdP.A00(c47z, true), j2, z);
        EnumC76383bi enumC76383bi = c47z.A1F;
        if (enumC76383bi != EnumC76383bi.A06) {
            A01.A9s("audience", enumC76383bi.A00);
        }
        FanClubInfoDict B4O = C08730cb.A00(userSession).A00().A03.B4O();
        if (enumC76383bi == EnumC76383bi.A07 && B4O != null) {
            A01.A9s("fan_club_id", String.valueOf(B4O.getFanClubId()));
        }
        AE9.A01(A01, userSession, AE9.A00(c47z, null), str3, str5);
        C188538Ws c188538Ws = c47z.A1Y;
        if (c188538Ws != null) {
            A01.AA6(AbstractC111324zv.A00(3847), AbstractC35082Fct.A02(c188538Ws));
        }
        if (C18U.A06(C06090Tz.A05, userSession, 36310873291096413L) && AbstractC23021Ah.A00(userSession).A25("reel")) {
            java.util.Set A0I = AbstractC23021Ah.A00(userSession).A0I("reel");
            ?? obj2 = new Object();
            obj2.A00 = A0I;
            C55230Of1.A0K(A01, obj2);
        }
        return A01.A0O();
    }

    @Override // X.InterfaceC40181tm
    public final /* bridge */ /* synthetic */ Object AEm(C47Z c47z) {
        return new C27874CQl(c47z, this);
    }

    @Override // X.InterfaceC40181tm
    public final N3A E3U(C3JY c3jy, UserSession userSession) {
        return (N3A) new C56150OwG(new C07510aQ(userSession), new C55918OsA()).A00(c3jy);
    }

    @Override // X.InterfaceC40181tm
    public final void E4y(UserSession userSession, C47Z c47z, C54783OIx c54783OIx) {
        c54783OIx.A00(c47z.A1C, c47z, false);
        AbstractC25651Mw.A00(userSession).E4s(new C70083Cs(c47z));
    }

    @Override // X.InterfaceC40181tm
    public final C38321qM DqT(Context context, InterfaceC40821up interfaceC40821up, UserSession userSession, C47Z c47z) {
        interfaceC40821up.getClass();
        C38321qM c38321qM = ((N3A) interfaceC40821up).A00;
        c38321qM.getClass();
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(context, 1);
        C35126FeT A00 = C35126FeT.A00(userSession);
        synchronized (A00) {
            A00.A01 = c38321qM;
            List list = A00.A03;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C35126FeT.A02(A00, (C188538Ws) it.next());
            }
            list.clear();
            List list2 = A00.A02;
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                C35126FeT.A01(context, A00, (C188538Ws) it2.next());
            }
            list2.clear();
        }
        List A002 = AbstractC186788Pv.A00(userSession).A00(c47z.A3t);
        List<User> A3g = c38321qM.A3g();
        C28531Zo.A04.A0G(userSession, "STORY", A3g, A002);
        for (User user : A3g) {
            if (AbstractC186788Pv.A01(userSession) || (A002 != null && A002.contains(user.getId()))) {
                C28531Zo c28531Zo = C28531Zo.A04;
                C14360o3.A0K(c38321qM.A0C.BSN(), false);
                c28531Zo.A0C(userSession, c38321qM, user);
            }
        }
        C23653Adm c23653Adm = (C23653Adm) userSession.A01(C23653Adm.class, new C43205J8c(userSession, 17));
        String str = c47z.A35;
        String A01 = C70343Ds.A01(c47z);
        C14360o3.A0B(str, 0);
        C14360o3.A0B(A01, 2);
        c23653Adm.A01 = str;
        c23653Adm.A00 = c38321qM;
        c23653Adm.A02 = A01;
        return c38321qM;
    }
}
