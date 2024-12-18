package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.3MP, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3MP extends C3MQ {
    public final AbstractC59962oe A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;
    public final C3CD A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3MP(AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C3CD c3cd) {
        super(userSession, c3cd, interfaceC60442pS, null);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(interfaceC60442pS, 3);
        this.A00 = abstractC59962oe;
        this.A01 = userSession;
        this.A02 = interfaceC60442pS;
        this.A03 = c3cd;
    }

    @Override // X.C3MQ, X.C3MR
    public final void Dih(long j) {
        C38321qM BQN;
        AbstractC59962oe abstractC59962oe;
        FragmentActivity activity;
        User A2E;
        String str;
        super.Dih(j);
        UserSession userSession = this.A01;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        C06090Tz c06090Tz = C06090Tz.A05;
        A00.A0u(C18U.A04(c06090Tz, userSession, 36877787501756559L));
        boolean A06 = C18U.A06(c06090Tz, userSession, 36314837547092821L);
        C3CD c3cd = this.A03;
        if (A06) {
            C38321qM BQN2 = c3cd.BQN();
            if (BQN2 != null && (A2E = BQN2.A2E(userSession)) != null) {
                ImageUrl A1S = BQN2.A1S();
                if (A1S != null) {
                    AbstractC59962oe abstractC59962oe2 = this.A00;
                    Context requireContext = abstractC59962oe2.requireContext();
                    if (IAK.A00(userSession, BQN2, true)) {
                        AbstractC10360h2 supportFragmentManager = abstractC59962oe2.requireActivity().getSupportFragmentManager();
                        C14360o3.A07(supportFragmentManager);
                        List A04 = supportFragmentManager.A0U.A04();
                        C14360o3.A07(A04);
                        Fragment fragment = (Fragment) AbstractC001800i.A0K(A04);
                        if (fragment != null && (str = fragment.mTag) != null && str.equals(abstractC59962oe2.mTag)) {
                            int i = 2131972977;
                            if (BQN2.A5P()) {
                                i = 2131972978;
                            }
                            String string = requireContext.getString(i, A2E.getUsername());
                            C14360o3.A0A(string);
                            C146106i8 c146106i8 = new C146106i8();
                            c146106i8.A01 = 5000;
                            c146106i8.A0C(EnumC141996bI.A02);
                            c146106i8.A0D = string;
                            c146106i8.A01();
                            String string2 = requireContext.getString(2131971062);
                            C14360o3.A07(string2);
                            c146106i8.A0G = string2;
                            c146106i8.A0A(new C42694Iup(BQN2, A2E, this));
                            c146106i8.A02 = abstractC59962oe2.requireView().getHeight();
                            c146106i8.A03();
                            c146106i8.A09 = A1S;
                            C41451vu.A01.E4s(new C3KD(c146106i8.A00()));
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            return;
        }
        if (!c3cd.CcS() || (BQN = c3cd.BQN()) == null || (activity = (abstractC59962oe = this.A00).getActivity()) == null) {
            return;
        }
        AbstractC10360h2 parentFragmentManager = abstractC59962oe.getParentFragmentManager();
        InterfaceC60442pS interfaceC60442pS = this.A02;
        C08790ch A002 = AbstractC018607g.A00(abstractC59962oe);
        C33101Ej5 c33101Ej5 = new C33101Ej5(activity, activity, parentFragmentManager, parentFragmentManager, userSession, BQN, interfaceC60442pS);
        C1ON A003 = AbstractC35242Fgb.A00(userSession, BQN, null, C05F.A00, interfaceC60442pS.getModuleName());
        A003.A00 = c33101Ej5;
        C1GJ.A00(activity, A002, A003);
    }
}
