package X;

import com.instagram.common.session.UserSession;
import com.instagram.opal.impl.data.OpalProfileData;
import com.instagram.opal.impl.data.OpalRepository;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Mgd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51030Mgd extends AbstractC52922bZ {
    public String A00;
    public final UserSession A01;
    public final OpalRepository A02;
    public final MV3 A03;
    public final User A04;
    public final C05A A05;
    public final C0UO A06;

    public final void A02(OpalProfileData opalProfileData) {
        Object value;
        Object value2;
        C38688GzT A00;
        C05A c05a = this.A05;
        do {
            value = c05a.getValue();
        } while (!c05a.AIi(value, C26073Bg2.A00(null, opalProfileData, opalProfileData, null, (C26073Bg2) value, null, 0, 2044, false, false)));
        C05A c05a2 = this.A02.A08;
        do {
            value2 = c05a2.getValue();
            A00 = C38688GzT.A00((C38688GzT) value2, null, null, null, opalProfileData, 14);
        } while (!c05a2.AIi(value2, A00));
    }

    public final void A03(String str) {
        Object value;
        C26073Bg2 A00;
        C05A c05a = this.A05;
        do {
            value = c05a.getValue();
            C26073Bg2 c26073Bg2 = (C26073Bg2) value;
            A00 = C26073Bg2.A00(null, OpalProfileData.A00(c26073Bg2.A05, null, null, null, null, str, null, null, 0, 8095, false, false), null, null, c26073Bg2, null, 0, 2046, false, false);
        } while (!c05a.AIi(value, A00));
    }

    public /* synthetic */ C51030Mgd(UserSession userSession, OpalRepository opalRepository) {
        Object value;
        MV3 mv3 = new MV3(userSession);
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = opalRepository;
        this.A03 = mv3;
        C74 c74 = C74.A07;
        C16930sl c16930sl = C16930sl.A00;
        OpalProfileData opalProfileData = new OpalProfileData(c74, "", "", "", "", null, "", c16930sl, 0, false, false, false, false);
        OpalProfileData opalProfileData2 = new OpalProfileData(c74, "", "", "", "", null, "", c16930sl, 0, false, false, false, false);
        C008002u A1H = AbstractC25225BEi.A1H(new C26073Bg2(null, new C51751Mta((C74) null, (String) null, (List) null, (DefaultConstructorMarker) null, 15, 4, false), new C51751Mta((C74) null, (String) null, (List) null, (DefaultConstructorMarker) null, 15, 4, false), opalProfileData, opalProfileData2, c74, C05F.A0C, C5HZ.A01, 0, false, false));
        this.A05 = A1H;
        this.A06 = A1H;
        this.A04 = AbstractC166997dE.A0Y(userSession);
        ArrayList A00 = AbstractC43876Jag.A00(this.A01);
        C05A c05a = this.A05;
        do {
            value = c05a.getValue();
        } while (!c05a.AIi(value, C26073Bg2.A00(null, null, null, null, (C26073Bg2) value, null, 0, 1535, false, AbstractC25226BEj.A1b(A00))));
        PZG.A01(this, AbstractC141776au.A00(this), 22);
    }

    public static final void A00(C51030Mgd c51030Mgd) {
        Object value;
        C26073Bg2 A00;
        UserSession userSession = c51030Mgd.A01;
        if (C18U.A06(C06090Tz.A05, userSession, 36321043774645345L) && AbstractC166987dD.A0x(userSession).getInt("opal_profile_tease_animation_count", 0) < 5) {
            C05A c05a = c51030Mgd.A05;
            do {
                value = c05a.getValue();
                A00 = C26073Bg2.A00(null, null, null, null, (C26073Bg2) value, C05F.A00, 0, 1791, false, false);
            } while (!c05a.AIi(value, A00));
        }
    }

    public final void A01() {
        String str = this.A00;
        if (str != null) {
            PZ1.A01(this, str, AbstractC141776au.A00(this), 10);
        }
    }

    public final void A04(boolean z) {
        Object value;
        C05A c05a = this.A05;
        do {
            value = c05a.getValue();
        } while (!c05a.AIi(value, C26073Bg2.A00(null, null, null, null, (C26073Bg2) value, null, 0, 1919, z, false)));
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        OpalRepository opalRepository = this.A02;
        opalRepository.A05.A07(opalRepository.A06);
        opalRepository.A07.clear();
        AbstractC25651Mw.A00(opalRepository.A03).A02(opalRepository.A00, C57452kK.class);
    }
}
