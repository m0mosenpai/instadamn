package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.Iterator;

/* renamed from: X.Odc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55173Odc {
    public C6WQ A00;
    public final Activity A01;
    public final Context A02;
    public final Fragment A03;
    public final InterfaceC11380iw A04;
    public final UserSession A05;
    public final Reel A06;
    public final User A07;
    public final String A08;
    public final boolean A09;

    public C55173Odc(Activity activity, Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Reel reel) {
        AbstractC167027dH.A0a(1, userSession, activity, fragment, interfaceC11380iw);
        this.A05 = userSession;
        this.A01 = activity;
        this.A03 = fragment;
        this.A04 = interfaceC11380iw;
        this.A06 = reel;
        this.A09 = reel.A1a;
        this.A02 = fragment.requireContext();
        C1NB c1nb = reel.A0W;
        if (c1nb != null) {
            User CDj = c1nb.CDj();
            if (CDj != null) {
                this.A07 = CDj;
                this.A08 = AbstractC166997dE.A0q(activity.getResources(), 2131973727);
                return;
            }
            throw AbstractC166987dD.A14("user is null");
        }
        throw AbstractC166987dD.A14("owner is null");
    }

    public final void A05(EnumC53243Ngg enumC53243Ngg) {
        Reel reel = this.A06;
        UserSession userSession = this.A05;
        if (reel.A0z(userSession)) {
            A00(this, enumC53243Ngg);
            return;
        }
        Activity activity = this.A01;
        C6WQ A0i = AbstractC31174DnI.A0i(activity);
        this.A00 = A0i;
        A0i.A00(activity.getResources().getString(2131963583));
        C0fJ.A00(A0i);
        C1OU c1ou = C1OU.$redex_init_class;
        C82013lN A00 = AbstractC82003lM.A00(userSession);
        A00.A02(C3G5.A0I, reel.getId(), this.A04.getModuleName(), null);
        A00.A05(new P8K(this, enumC53243Ngg), reel.getId(), null, false);
    }

    public static void A01(C55173Odc c55173Odc, C50674MYs c50674MYs, String str, int i) {
        c50674MYs.A0B(str, new ViewOnClickListenerC55467OkM(c55173Odc, i));
    }

    public static final void A02(C55173Odc c55173Odc, Reel reel) {
        C28501Zl c28501Zl = C28531Zo.A04.A02;
        UserSession userSession = c55173Odc.A05;
        C2EY c2ey = C2EY.A1g;
        InterfaceC11380iw interfaceC11380iw = c55173Odc.A04;
        C34726FRp A07 = c28501Zl.A07(interfaceC11380iw, userSession, c2ey);
        C38321qM c38321qM = reel.A0A(userSession, 0).A0b;
        if (c38321qM != null) {
            String id = c38321qM.getId();
            if (id != null) {
                A07.A06(id);
                InterfaceC08430c6 interfaceC08430c6 = c55173Odc.A03;
                C14360o3.A0C(interfaceC08430c6, AbstractC111324zv.A00(7));
                A07.A04((InterfaceC60442pS) interfaceC08430c6);
                Bundle bundle = A07.A07;
                bundle.putInt(AbstractC111324zv.A00(42), 0);
                bundle.putString("DirectShareSheetFragment.reel_id", AbstractC37301Gc2.A0i(reel));
                bundle.putString(AbstractC111324zv.A00(1592), AbstractC31180DnO.A0k(reel.A0P));
                String moduleName = interfaceC11380iw.getModuleName();
                C14360o3.A0B(moduleName, 0);
                bundle.putString(AbstractC111324zv.A00(622), moduleName);
                DirectShareSheetFragment A00 = A07.A00();
                C3DN A002 = C3DN.A00.A00(c55173Odc.A01);
                if (A002 != null) {
                    A002.A0K(A00);
                    return;
                }
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    private final void A03(C50674MYs c50674MYs, boolean z) {
        Reel reel = this.A06;
        UserSession userSession = this.A05;
        if (reel.A1a) {
            Iterator it = reel.A0O(userSession).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C41181vS) it.next()).A1h()) {
                        break;
                    }
                } else if (!z) {
                    return;
                }
            }
        }
        A01(this, c50674MYs, AbstractC166997dE.A0p(c50674MYs.A00, 2131973297), 31);
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0219, code lost:
    
        if (r13.A06.A0l() != false) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(X.InterfaceC58277PsV r14, java.lang.Integer r15) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55173Odc.A04(X.PsV, java.lang.Integer):void");
    }

    public static final void A00(C55173Odc c55173Odc, EnumC53243Ngg enumC53243Ngg) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("edit_highlights_reel_id", c55173Odc.A06.getId());
        A0b.putBoolean("archive_multi_select_mode", true);
        A0b.putSerializable("highlight_management_source", enumC53243Ngg);
        UserSession userSession = c55173Odc.A05;
        Activity activity = c55173Odc.A01;
        AbstractC31171DnF.A0L(activity, A0b, userSession, ModalActivity.class, "manage_highlights").A0A(activity, 201);
    }
}
