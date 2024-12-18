package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.Iv2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42707Iv2 implements InterfaceC63842v5 {
    public final InterfaceC11380iw A00;
    public final C63832v4 A01;
    public final C63702ur A02;
    public final Integer A03;

    @Override // X.InterfaceC63842v5
    public final void DMg(C1XV c1xv, C47K c47k) {
        this.A01.DMg(c1xv, c47k);
    }

    @Override // X.InterfaceC63842v5
    public final void DMh(FOC foc, String str, String str2, String str3, int i, int i2) {
        this.A01.DMh(foc, str, "preview", str3, i, i2);
    }

    @Override // X.InterfaceC63842v5
    public final void DMi(FOC foc, String str, String str2, String str3, int i, int i2) {
        this.A01.DMi(foc, str, "preview", str3, i, i2);
    }

    @Override // X.InterfaceC63842v5
    public final void DMj(FOC foc, String str, String str2, String str3, int i, int i2) {
        this.A01.DMj(foc, str, "preview", str3, i, i2);
    }

    @Override // X.InterfaceC63842v5
    public final void DMk(FOC foc, String str, String str2, String str3, int i, int i2, long j) {
        AbstractC167007dF.A1E(foc, 0, str);
        this.A01.DMk(foc, str, "preview", str3, i, i2, j);
    }

    @Override // X.InterfaceC63842v5
    public final void DMl(FOC foc, int i, int i2, int i3) {
        this.A01.DMl(foc, i, i2, i3);
    }

    @Override // X.InterfaceC63842v5
    public final void DMm(FOC foc, String str, String str2, String str3, int i, int i2, long j) {
        AbstractC167007dF.A1E(foc, 0, str);
        this.A01.DMm(foc, str, "topic_card", str3, i, i2, j);
    }

    @Override // X.InterfaceC63842v5
    public final void DMn(C1XV c1xv) {
        this.A01.DMn(c1xv);
    }

    @Override // X.InterfaceC63842v5
    public final void DMo(FOC foc, String str, String str2, String str3, int i, int i2) {
        this.A01.DMo(foc, str, "preview", str3, i, i2);
    }

    @Override // X.InterfaceC63842v5
    public final void DMp(FOC foc, String str, String str2, String str3, int i, int i2, int i3) {
        String str4;
        User user = foc.A02;
        if (user != null) {
            FollowStatus B7L = user.B7L();
            Integer A00 = AbstractC37441GeL.A00(B7L);
            String A002 = AbstractC125245lV.A00(this.A03);
            String id = user.getId();
            String moduleName = this.A00.getModuleName();
            C14360o3.A0B(moduleName, 3);
            String A003 = AbstractC37442GeM.A00(A00);
            String str5 = foc.A03;
            EnumC33402EpZ A02 = AbstractC123565iV.A02(B7L);
            if (A02 != null) {
                str4 = A02.A00;
            } else {
                str4 = null;
            }
            C63702ur.A06(this.A02, "", moduleName, str5, "preview", A003, "", str, str3, null, str4, null, id, A002, i, i2);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC63842v5
    public final void DMq(FOC foc, String str, String str2, String str3, int i, int i2, int i3) {
        this.A01.DMq(foc, str, "preview", str3, i, i2, i3);
    }

    @Override // X.InterfaceC63842v5
    public final void DMr(FOC foc, String str, String str2, String str3, int i, int i2, int i3, long j) {
        AbstractC167007dF.A1F(foc, 0, str);
        this.A01.DMr(foc, str, "preview", str3, i, i2, 0, j);
    }

    public C42707Iv2(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C63822v3 c63822v3, Integer num) {
        this.A01 = new C63832v4(fragmentActivity, interfaceC11380iw, userSession, null, c63822v3, num);
        this.A03 = num;
        this.A00 = interfaceC11380iw;
        this.A02 = new C63702ur(interfaceC11380iw, userSession);
    }

    @Override // X.InterfaceC63392uM
    public final void A9W(InterfaceC73233Pz interfaceC73233Pz, InterfaceC75123Zc interfaceC75123Zc) {
        AbstractC167017dG.A1N(interfaceC73233Pz, interfaceC75123Zc);
        this.A01.A9W(interfaceC73233Pz, interfaceC75123Zc);
    }

    @Override // X.InterfaceC63392uM
    public final void EDV(View view, InterfaceC73233Pz interfaceC73233Pz) {
        AbstractC167017dG.A1N(interfaceC73233Pz, view);
        this.A01.EDV(view, interfaceC73233Pz);
    }
}
