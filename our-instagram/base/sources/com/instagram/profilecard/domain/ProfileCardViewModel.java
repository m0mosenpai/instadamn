package com.instagram.profilecard.domain;

import X.AbstractC001900j;
import X.AbstractC06930Yk;
import X.AbstractC111324zv;
import X.AbstractC13890nF;
import X.AbstractC141776au;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC208910l;
import X.AbstractC23641Du;
import X.AbstractC25225BEi;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31364DqT;
import X.AbstractC52922bZ;
import X.AnonymousClass001;
import X.AnonymousClass191;
import X.C008002u;
import X.C05A;
import X.C05F;
import X.C0UO;
import X.C140966Yy;
import X.C14360o3;
import X.C16920sk;
import X.C16930sl;
import X.C189448aO;
import X.C189478aR;
import X.C214919fT;
import X.C23652Adl;
import X.C24128AnD;
import X.C26081BgA;
import X.C28208Cc5;
import X.C2U7;
import X.C31349DqE;
import X.C3DN;
import X.C3DP;
import X.C44Q;
import X.C52158N6k;
import X.C54971OTd;
import X.C56245Oxs;
import X.C56246Oxt;
import X.C56486P6b;
import X.C70803WhJ;
import X.EnumC222416a;
import X.EnumC53163NfI;
import X.InterfaceC11380iw;
import X.InterfaceC41501vz;
import X.InterfaceC43571JMf;
import X.InterfaceC678133v;
import X.InterfaceC81183jn;
import X.InterfaceC81733ki;
import X.InterfaceC81873l7;
import X.MV0;
import X.MWW;
import X.N9J;
import X.O40;
import X.P3R;
import X.PZI;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.profilecard.data.ProfileCardRepository;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes9.dex */
public final class ProfileCardViewModel extends AbstractC52922bZ implements InterfaceC11380iw {
    public C54971OTd A00;
    public C31349DqE A01;
    public MWW A02;
    public InterfaceC678133v A03;
    public P3R A04;
    public User A05;
    public boolean A06;
    public boolean A07;
    public final Application A08;
    public final C56486P6b A09;
    public final MV0 A0A;
    public final MV0 A0B;
    public final MV0 A0C;
    public final N9J A0D;
    public final InterfaceC41501vz A0E;
    public final UserSession A0F;
    public final ProfileCardRepository A0G;
    public final O40 A0H;
    public final C70803WhJ A0I;
    public final C23652Adl A0J;
    public final C05A A0K;
    public final C0UO A0L;
    public final boolean A0M;

    public ProfileCardViewModel(Application application, UserSession userSession, ProfileCardRepository profileCardRepository, C70803WhJ c70803WhJ, C23652Adl c23652Adl, boolean z) {
        C14360o3.A0B(c23652Adl, 4);
        C14360o3.A0B(c70803WhJ, 5);
        this.A0F = userSession;
        this.A08 = application;
        this.A0G = profileCardRepository;
        this.A0J = c23652Adl;
        this.A0I = c70803WhJ;
        this.A0M = z;
        Integer num = C05F.A00;
        SimpleImageUrl A0t = AbstractC25225BEi.A0t("");
        C16920sk A0E = AbstractC06930Yk.A0E();
        boolean z2 = !C2U7.A00;
        C008002u A1H = AbstractC25225BEi.A1H(new C26081BgA(A0t, null, new C28208Cc5(C16930sl.A00, -1, -1), num, "", "", "", "", "", A0E, 0.0f, 1.0f, 200.0f, false, true, false, z2, z2, false, false, false, false, false));
        this.A0K = A1H;
        this.A0L = AbstractC208910l.A02(A1H);
        this.A09 = new C56486P6b(this, 0);
        this.A0H = new O40(this);
        this.A0D = new N9J(this, 3);
        this.A0E = new MV0(this, 2);
        this.A0A = new MV0(this, 3);
        this.A0B = new MV0(this, 4);
        this.A0C = new MV0(this, 5);
        AbstractC23641Du.A03(num, AnonymousClass191.A00, new PZI(this, null, 2), AbstractC141776au.A00(this));
    }

    public final void A08(Activity activity) {
        C14360o3.A0B(activity, 0);
        if (activity instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) activity;
            Window window = fragmentActivity.getWindow();
            if (window != null) {
                window.clearFlags(512);
            }
            C140966Yy A0P = AbstractC31173DnH.A0P(fragmentActivity, this.A0F);
            A0P.A0D(AbstractC31364DqT.A02().A04("profile"));
            A0P.A04();
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return C52158N6k.__redex_internal_original_name;
    }

    public static C26081BgA A00(ProfileCardViewModel profileCardViewModel) {
        return (C26081BgA) profileCardViewModel.A0L.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.instagram.profilecard.domain.ProfileCardViewModel r31, X.InterfaceC23621Ds r32) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.profilecard.domain.ProfileCardViewModel.A01(com.instagram.profilecard.domain.ProfileCardViewModel, X.1Ds):java.lang.Object");
    }

    public static final void A04(ProfileCardViewModel profileCardViewModel) {
        Object value;
        C05A c05a = profileCardViewModel.A0K;
        do {
            value = c05a.getValue();
        } while (!c05a.AIi(value, C26081BgA.A00(null, null, null, (C26081BgA) value, null, null, null, null, null, null, null, 0.0f, 1.0f, 0.0f, 8382463, false, true, false, false, false, false, false, false, false, false)));
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        this.A0F.A03(C23652Adl.class);
    }

    public static final ArrayList A02(List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InterfaceC81873l7 interfaceC81873l7 = (InterfaceC81873l7) it.next();
                if (interfaceC81873l7.getUrl().length() > 0) {
                    A1E.add(interfaceC81873l7.getUrl());
                }
            }
        }
        return A1E;
    }

    public static final void A03(Activity activity, ProfileCardViewModel profileCardViewModel) {
        profileCardViewModel.A06();
        C189448aO A0y = AbstractC25225BEi.A0y(profileCardViewModel.A0F);
        AbstractC25225BEi.A1Q(A0y, true);
        A0y.A0k = true;
        A0y.A1O = true;
        A0y.A03 = 0.9f;
        C189478aR A00 = A0y.A00();
        int A01 = AbstractC13890nF.A01(profileCardViewModel.A08);
        C56245Oxs c56245Oxs = new C56245Oxs(activity, profileCardViewModel);
        C56246Oxt c56246Oxt = new C56246Oxt();
        C214919fT c214919fT = new C214919fT();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putInt(AbstractC111324zv.A00(840), A01);
        c214919fT.setArguments(A0b);
        c214919fT.A00 = c56245Oxs;
        c214919fT.A01 = c56246Oxt;
        C3DN A0r = AbstractC31172DnG.A0r(activity);
        if (A0r != null) {
            C3DP c3dp = (C3DP) A0r;
            if (c3dp.A0h) {
                c3dp.A0H = new C24128AnD(2, activity, A00, c214919fT);
                A0r.A0B();
                return;
            }
        }
        A00.A02(activity, c214919fT);
    }

    public final void A05() {
        Object value;
        C26081BgA A00;
        if (A09()) {
            float f = A00(this).A00;
            C05A c05a = this.A0K;
            do {
                value = c05a.getValue();
                A00 = C26081BgA.A00(null, null, null, (C26081BgA) value, null, null, null, null, null, null, null, 0.0f + (((int) (f / 360.0f)) * 360.0f), 0.0f, 0.0f, 8387583, false, false, false, false, false, false, false, false, false, false);
            } while (!c05a.AIi(value, A00));
        }
    }

    public final void A06() {
        Object value;
        C26081BgA A00;
        if (!A09()) {
            float f = A00(this).A00;
            C05A c05a = this.A0K;
            do {
                value = c05a.getValue();
                A00 = C26081BgA.A00(null, null, null, (C26081BgA) value, null, null, null, null, null, null, null, 180.0f + (((int) (f / 360.0f)) * 360.0f), 0.0f, 0.0f, 8387583, false, false, false, false, false, false, false, false, false, false);
            } while (!c05a.AIi(value, A00));
        }
    }

    public final void A07() {
        Object value;
        C26081BgA A00;
        List BdF;
        String category;
        MusicAssetModel musicAssetModel;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        User user = this.A05;
        if (user != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            MWW mww = this.A02;
            List list = null;
            if (mww != null && (musicAssetModel = mww.A02) != null) {
                String str = musicAssetModel.A0I;
                String str2 = musicAssetModel.A0D;
                if (str != null && str.length() != 0 && (str2 == null || str2.length() == 0 || (str = AnonymousClass001.A0g(str, " · ", str2)) != null)) {
                    A1E.add(str);
                }
            }
            A1I.put(EnumC53163NfI.A06, A1E);
            String AY1 = user.A03.AY1();
            boolean A1T = AbstractC167007dF.A1T(user.A03.BvV());
            if (AY1 != null && !AbstractC001900j.A0T(AY1) && ((user.A0I() == EnumC222416a.A05 || user.A0I() == EnumC222416a.A06) && A1T && (category = user.A03.getCategory()) != null)) {
                A1I.put(EnumC53163NfI.A03, AbstractC166987dD.A1J(category));
            }
            A1I.put(EnumC53163NfI.A04, A02(user.A03.Ag2()));
            InterfaceC81183jn BdE = user.A03.BdE();
            ArrayList A1E2 = AbstractC166987dD.A1E();
            if (BdE != null && (BdF = BdE.BdF()) != null) {
                Iterator it = BdF.iterator();
                while (it.hasNext()) {
                    String title = ((C44Q) it.next()).getTitle();
                    if (title.length() > 0) {
                        A1E2.add(title);
                    }
                }
            }
            A1I.put(EnumC53163NfI.A02, A1E2);
            InterfaceC81733ki AYu = user.A03.AYu();
            if (AYu != null) {
                list = AYu.B9F();
            }
            ArrayList A1E3 = AbstractC166987dD.A1E();
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    String fundraiserTitle = ((InterfaceC43571JMf) it2.next()).getFundraiserTitle();
                    if (fundraiserTitle.length() > 0) {
                        A1E3.add(fundraiserTitle);
                    }
                }
            }
            A1I.put(EnumC53163NfI.A05, A1E3);
        }
        C05A c05a = this.A0K;
        do {
            value = c05a.getValue();
            A00 = C26081BgA.A00(null, null, null, (C26081BgA) value, null, null, null, null, null, null, A1I, 0.0f, 0.0f, 0.0f, 8388591, false, false, false, false, false, false, false, false, false, false);
        } while (!c05a.AIi(value, A00));
    }

    public final boolean A09() {
        float abs = Math.abs(A00(this).A00 % 360.0f);
        if (90.0f > abs || abs > 270.0f) {
            return false;
        }
        return true;
    }
}
