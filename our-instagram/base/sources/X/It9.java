package X;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes7.dex */
public final class It9 implements InterfaceC63682up {
    public final InterfaceC11380iw A00;
    public final C65682y4 A01;
    public final C63672uo A02;
    public final C63702ur A03;
    public final Integer A04;

    @Override // X.InterfaceC63682up
    public final void Clx(C47K c47k) {
    }

    @Override // X.InterfaceC63682up
    public final void Cly(C47K c47k) {
    }

    @Override // X.InterfaceC63682up
    public final void Clz(C47K c47k) {
    }

    @Override // X.InterfaceC63692uq
    public final void Dqo(Activity activity, View view, UserSession userSession, C47P c47p, Integer num, String str, String str2, String str3, String str4, String str5, List list, int i, int i2, int i3) {
        C14360o3.A0B(userSession, 0);
        this.A02.Dqo(activity, view, userSession, c47p, num, str, str2, str3, str4, str5, list, i, i2, i3);
    }

    @Override // X.InterfaceC63682up
    public final void Dqx(C123545iT c123545iT, User user, int i) {
    }

    @Override // X.InterfaceC63682up
    public final InterfaceC11380iw Abd() {
        return this.A00;
    }

    @Override // X.InterfaceC63682up
    public final void Dqn(C1XV c1xv, C47R c47r, Integer num, String str, String str2, String str3, List list) {
        this.A02.Dqn(c1xv, c47r, num, str, str2, str3, list);
    }

    @Override // X.InterfaceC63692uq
    public final void Dqq(C1XV c1xv, C47P c47p, String str, String str2, String str3, String str4, int i, int i2) {
        this.A02.Dqq(c1xv, c47p, str, str2, str3, str4, i, i2);
    }

    @Override // X.InterfaceC63692uq
    public final void Dqs(C47P c47p, Long l, String str, String str2, String str3, String str4, int i, int i2, int i3) {
        this.A02.Dqs(c47p, l, str, "profile", str3, str4, i, i2, i3);
    }

    @Override // X.InterfaceC63682up
    public final void Dqv(C1XV c1xv, Integer num, String str, String str2, String str3, String str4, int i) {
        this.A02.Dqv(c1xv, num, str, str2, str3, str4, i);
    }

    @Override // X.InterfaceC63682up
    public final void Dqw() {
        this.A02.Dqw();
        this.A01.A00 = true;
    }

    public It9(Fragment fragment, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C65682y4 c65682y4, Integer num) {
        this.A02 = new C63672uo(fragment, fragmentActivity, interfaceC11380iw, userSession, null, null, null, num);
        this.A00 = interfaceC11380iw;
        this.A04 = num;
        this.A01 = c65682y4;
        this.A03 = new C63702ur(interfaceC11380iw, userSession);
    }

    @Override // X.InterfaceC63392uM
    public final void A9W(InterfaceC73233Pz interfaceC73233Pz, InterfaceC75123Zc interfaceC75123Zc) {
        AbstractC167017dG.A1N(interfaceC73233Pz, interfaceC75123Zc);
        this.A02.A9W(interfaceC73233Pz, interfaceC75123Zc);
    }

    @Override // X.InterfaceC63692uq
    public final void Dqr(C47P c47p, String str, String str2, String str3, String str4, int i, int i2) {
        EnumC33402EpZ enumC33402EpZ;
        String str5;
        User CDj = c47p.CDj();
        String str6 = null;
        if (CDj != null) {
            FollowStatus B7L = CDj.B7L();
            str6 = AbstractC37442GeM.A00(AbstractC37441GeL.A00(B7L));
            enumC33402EpZ = AbstractC123565iV.A02(B7L);
        } else {
            enumC33402EpZ = null;
        }
        String A00 = AbstractC125245lV.A00(this.A04);
        String id = c47p.getId();
        String moduleName = this.A00.getModuleName();
        AbstractC167017dG.A1R(id, moduleName);
        String str7 = "";
        String algorithm = c47p.getAlgorithm();
        String CEI = c47p.CEI();
        if (CEI != null) {
            str7 = CEI;
        }
        String ByJ = c47p.ByJ();
        if (enumC33402EpZ == null || (str5 = enumC33402EpZ.A00) == null) {
            str5 = "";
        }
        C63702ur.A06(this.A03, algorithm, moduleName, null, null, str6, str7, null, str3, str4, str5, ByJ, id, A00, i2, i);
    }

    @Override // X.InterfaceC63392uM
    public final void EDV(View view, InterfaceC73233Pz interfaceC73233Pz) {
        AbstractC167017dG.A1N(interfaceC73233Pz, view);
        this.A02.EDV(view, interfaceC73233Pz);
    }
}
