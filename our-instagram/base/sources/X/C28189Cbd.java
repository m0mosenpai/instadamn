package X;

import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Cbd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28189Cbd {
    public final Context A00;
    public final Resources A01;
    public final FragmentActivity A02;
    public final AbstractC018607g A03;
    public final InterfaceC11380iw A04;
    public final C18920wW A05;
    public final UserSession A06;
    public final GZU A07;
    public final FR7 A08;
    public final User A09;
    public final InterfaceC37219GaU A0A;
    public final MRA A0B;

    public C28189Cbd(Context context, Fragment fragment, FragmentActivity fragmentActivity, AbstractC018607g abstractC018607g, InterfaceC11380iw interfaceC11380iw, C18920wW c18920wW, UserSession userSession, User user) {
        AbstractC167007dF.A1G(userSession, 2, c18920wW);
        C14360o3.A0B(abstractC018607g, 7);
        this.A00 = context;
        this.A06 = userSession;
        this.A02 = fragmentActivity;
        this.A05 = c18920wW;
        this.A04 = interfaceC11380iw;
        this.A03 = abstractC018607g;
        this.A09 = user;
        Resources A0N = AbstractC166997dE.A0N(fragment);
        C14360o3.A07(A0N);
        this.A01 = A0N;
        this.A08 = new FR7(fragment, userSession);
        this.A07 = new C29400CxX();
        this.A0B = new C39452Hbe(this, 1);
        this.A0A = new C36765GIo(this, 3);
    }

    public static final void A00(C28189Cbd c28189Cbd, boolean z) {
        String str;
        UserSession userSession = c28189Cbd.A06;
        WEz A01 = AbstractC69993VzD.A01(c28189Cbd.A02, c28189Cbd.A04, userSession, EnumC65855TvH.A0y, VG2.A0o, c28189Cbd.A09.getId());
        A01.A08(c28189Cbd.A0B);
        if (z) {
            str = "school_block";
        } else {
            str = "";
        }
        A01.A09(AbstractC111324zv.A00(2770), str);
        WEz.A00(null, A01);
    }
}
