package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.session.UserSession;

/* renamed from: X.LnE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49088LnE implements InterfaceC165517ae {
    public final Activity A00;
    public final C143266dR A01;
    public final AvatarStore A02;
    public final AbstractC59962oe A03;
    public final InterfaceC11380iw A04;
    public final UserSession A05;
    public final L68 A06;
    public final C47548KzI A07;
    public final C163867Va A08;
    public final C7XS A09;
    public final InterfaceC163877Vb A0A;
    public final InterfaceC08830cm A0B;

    @Override // X.InterfaceC165517ae
    public final void EkP(C7P3 c7p3, String str, boolean z) {
        Boolean bool;
        Object obj;
        Fragment A00;
        C3DO c3do;
        Activity activity;
        AbstractC439921h abstractC439921h = this.A02.A01.A00;
        if (C14360o3.A0K(abstractC439921h, C125535lz.A00)) {
            bool = AbstractC166997dE.A0b();
        } else if (C14360o3.A0K(abstractC439921h, C125525ly.A00)) {
            bool = false;
        } else if (C14360o3.A0K(abstractC439921h, C439821g.A00)) {
            bool = null;
        } else {
            throw B4Z.A00();
        }
        C47548KzI c47548KzI = this.A07;
        Boolean valueOf = Boolean.valueOf(z);
        InterfaceC08830cm interfaceC08830cm = this.A0B;
        boolean A1a = AbstractC166987dD.A1a(AbstractC31172DnG.A0y(interfaceC08830cm));
        boolean A09 = LLT.A09(str);
        if (c7p3 == C7P3.A06) {
            obj = KOL.A00;
        } else {
            UserSession userSession = c47548KzI.A01.A00;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (!C18U.A06(c06090Tz, userSession, 36319828297981636L)) {
                Boolean A0b = AbstractC166997dE.A0b();
                if ((C14360o3.A0K(bool, A0b) && !A1a && C18U.A06(c06090Tz, userSession, 36319184052821021L)) || (C14360o3.A0K(bool, A0b) && A1a && C18U.A06(c06090Tz, userSession, 36319184052886558L))) {
                    obj = KOK.A00;
                } else if ((!C14360o3.A0K(bool, A0b) || !A09) && valueOf != null && bool != null) {
                    obj = new KOI(bool.booleanValue());
                }
            }
            obj = KOJ.A00;
        }
        if (obj instanceof KOI) {
            A00 = C28531Zo.A04.A02.A00(this.A04, this.A05, str, z, ((KOI) obj).A00, false, AbstractC166987dD.A1a(AbstractC31172DnG.A0y(interfaceC08830cm)));
            this.A0A.CMc();
            c3do = C3DN.A00;
            activity = this.A00;
            C3DN A002 = c3do.A00(activity);
            if (A002 != null) {
                ((C3DP) A002).A0H = new C56770PHn(2, this, bool);
            }
        } else {
            if (obj instanceof KOK) {
                this.A08.A00();
                return;
            }
            if (C14360o3.A0K(obj, KOL.A00)) {
                A00 = AbstractC33782Ew8.A00("ig_direct_thread", "ig_direct_thread_moustache_nux");
                this.A0A.CMc();
                c3do = C3DN.A00;
                activity = this.A00;
            } else if (C14360o3.A0K(obj, KOJ.A00)) {
                return;
            } else {
                throw B4Z.A00();
            }
        }
        C3DN A003 = c3do.A00(activity);
        if (A003 != null) {
            C14360o3.A0A(A00);
            A003.A0K(A00);
        }
        this.A09.D0E();
    }

    public /* synthetic */ C49088LnE(Activity activity, C143266dR c143266dR, AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C163867Va c163867Va, C7XS c7xs, InterfaceC163877Vb interfaceC163877Vb, InterfaceC08830cm interfaceC08830cm) {
        C47548KzI c47548KzI = new C47548KzI(userSession);
        AvatarStore A00 = C20Y.A00(userSession);
        L68 l68 = new L68(userSession);
        AbstractC25234BEr.A0k(4, interfaceC11380iw, c7xs, interfaceC163877Vb, c163867Va);
        C14360o3.A0B(interfaceC08830cm, 8);
        AbstractC25229BEm.A1L(A00, 10, c143266dR);
        this.A05 = userSession;
        this.A00 = activity;
        this.A03 = abstractC59962oe;
        this.A04 = interfaceC11380iw;
        this.A09 = c7xs;
        this.A0A = interfaceC163877Vb;
        this.A08 = c163867Va;
        this.A0B = interfaceC08830cm;
        this.A07 = c47548KzI;
        this.A02 = A00;
        this.A06 = l68;
        this.A01 = c143266dR;
    }
}
