package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class W5E {
    public final Context A00;
    public final AbstractC018607g A01;
    public final UserSession A02;
    public final InterfaceC71955XCh A03;
    public final XDP A04;
    public final InterfaceC71979XDo A05;
    public final InterfaceC71956XCi A06;
    public final String A07;
    public final Map A08;
    public final boolean A09;

    public static C69413Vmx A00(W5E w5e, Object obj) {
        Object obj2 = w5e.A08.get(obj);
        obj2.getClass();
        return (C69413Vmx) obj2;
    }

    public W5E(Context context, AbstractC018607g abstractC018607g, UserSession userSession, InterfaceC71955XCh interfaceC71955XCh, XDP xdp, InterfaceC71979XDo interfaceC71979XDo, InterfaceC71956XCi interfaceC71956XCi, String str, Map map, boolean z) {
        this.A00 = context;
        this.A01 = abstractC018607g;
        this.A02 = userSession;
        this.A07 = str;
        this.A08 = map;
        this.A05 = interfaceC71979XDo;
        this.A03 = interfaceC71955XCh;
        this.A04 = xdp;
        this.A06 = interfaceC71956XCi;
        this.A09 = z;
    }

    public final void A01(EnumC68206VFy enumC68206VFy, boolean z, boolean z2) {
        String str;
        C25621Ms A0M;
        String str2;
        C18C.A0F(C11T.A08());
        C69413Vmx A00 = A00(this, enumC68206VFy);
        C69137ViS c69137ViS = new C69137ViS(enumC68206VFy, this, z);
        EnumC68206VFy enumC68206VFy2 = A00.A03;
        int ordinal = enumC68206VFy2.ordinal();
        if (ordinal != 1) {
            if (ordinal != 3) {
                if (ordinal != 4) {
                    if (ordinal != 6) {
                        if (ordinal != 0) {
                            str = null;
                        } else {
                            throw AbstractC31175DnJ.A0V("Location page no URL for tab type: ", enumC68206VFy2.toString());
                        }
                    } else {
                        str = "account";
                    }
                } else {
                    str = "clips";
                }
            } else {
                str = "recent";
            }
        } else {
            str = "ranked";
        }
        EnumC68206VFy enumC68206VFy3 = EnumC68206VFy.A04;
        UserSession userSession = A00.A02;
        if (enumC68206VFy2 == enumC68206VFy3) {
            A0M = AbstractC31173DnH.A0N(userSession);
            A0M.A0S(C67847UzS.class, C69961Vyc.class);
            A0M.A0B("business/account/get_profile_media/");
            str = A00.A05;
            str2 = CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID;
        } else {
            String str3 = A00.A06;
            A0M = AbstractC31173DnH.A0M(userSession);
            A0M.A0S(C67847UzS.class, C69961Vyc.class);
            A0M.A0L("locations/%s/sections/", str3);
            str2 = "tab";
        }
        A0M.A9s(str2, str);
        if (A00.A07) {
            A0M.A9s("exclude_bloks_widgets", "true");
        }
        C69138ViT c69138ViT = A00.A00;
        if (!z && c69138ViT != null) {
            A0M.A9s("page", c69138ViT.A00);
            List list = c69138ViT.A01;
            list.getClass();
            A0M.A9s("next_media_ids", list.toString());
            AbstractC2044893h.A06(A0M, A00.A04.A03.A07);
        }
        if (z2) {
            A00.A01 = AbstractC166997dE.A0n();
        }
        A0M.A9s(AbstractC31182DnR.A04(), A00.A01);
        A00.A04.A03(A0M.A0N(), new V7v(A00, c69137ViS));
    }

    public final boolean A02(EnumC68206VFy enumC68206VFy) {
        C69138ViT c69138ViT = A00(this, enumC68206VFy).A00;
        if (c69138ViT != null && c69138ViT.A02) {
            return true;
        }
        return false;
    }
}
