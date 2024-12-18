package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.base.activity.IgFragmentActivity;

/* loaded from: classes6.dex */
public final class G9V implements InterfaceC65576TnA {
    @Override // X.InterfaceC65576TnA
    public final void CKO(String str) {
    }

    @Override // X.InterfaceC65576TnA
    public final void Cq0() {
    }

    @Override // X.InterfaceC65576TnA
    public final void Csz() {
    }

    @Override // X.InterfaceC65576TnA
    public final void CKN(Fragment fragment, InterfaceC60602pj interfaceC60602pj, C07270a1 c07270a1, InterfaceC37129GXq interfaceC37129GXq, EnumC31713DwI enumC31713DwI) {
        FragmentActivity activity;
        InterfaceC37174GZl BFY;
        String password;
        String str;
        IgFragmentActivity igFragmentActivity;
        AbstractC167017dG.A1R(c07270a1, interfaceC60602pj);
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            if ((activity instanceof BaseFragmentActivity) && (igFragmentActivity = (IgFragmentActivity) activity) != null) {
                igFragmentActivity.unregisterOnActivityResultListener(interfaceC60602pj);
            }
            if (interfaceC37129GXq != null && (BFY = interfaceC37129GXq.BFY()) != null && BFY.getUsername() != null && (password = BFY.getPassword()) != null && (fragment instanceof AbstractC59962oe)) {
                AbstractC59962oe abstractC59962oe = (AbstractC59962oe) fragment;
                String username = BFY.getUsername();
                C14360o3.A07(username);
                if (enumC31713DwI != null) {
                    str = enumC31713DwI.A01;
                } else {
                    str = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(c07270a1), "ig_android_smart_lock_login_attempt");
                AbstractC31179DnN.A15(A0f);
                AbstractC31178DnM.A15(A0f, currentTimeMillis, C1Q9.A00());
                AbstractC31176DnK.A1J(A0f, AbstractC31171DnF.A00());
                AbstractC31171DnF.A1A(A0f, str);
                C16030qx c16030qx = C16030qx.A02;
                A0f.AAP("guid", c16030qx.A04(AbstractC12290kX.A00));
                A0f.Cht();
                Context context = abstractC59962oe.getContext();
                if (context != null) {
                    String A00 = C16030qx.A00(context);
                    Context context2 = abstractC59962oe.getContext();
                    if (context2 != null) {
                        C1ON A0E = AbstractC35276FhB.A0E(c07270a1, null, A00, null, null, c16030qx.A05(context2), password, null, username, null, 0);
                        Context context3 = abstractC59962oe.getContext();
                        if (context3 != null) {
                            FragmentActivity activity2 = abstractC59962oe.getActivity();
                            if (activity2 != null) {
                                A0E.A00 = new C32978Efk(abstractC59962oe, abstractC59962oe, c07270a1, new C32981Efn(context3, activity2, abstractC59962oe, c07270a1, enumC31713DwI), enumC31713DwI, username);
                                C1GJ.A03(A0E);
                                return;
                            }
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
    }

    @Override // X.InterfaceC65576TnA
    public final void CK3(Fragment fragment, InterfaceC60602pj interfaceC60602pj, C07270a1 c07270a1, InterfaceC37129GXq interfaceC37129GXq, EnumC31713DwI enumC31713DwI) {
        AbstractC167017dG.A1R(c07270a1, interfaceC60602pj);
        CKN(fragment, interfaceC60602pj, c07270a1, interfaceC37129GXq, enumC31713DwI);
    }
}
