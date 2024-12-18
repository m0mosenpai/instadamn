package X;

import com.instagram.common.session.UserSession;
import com.instagram.profile.interest.ProfileInterestPickerViewModel$viewState$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class Dz6 extends AbstractC52922bZ {
    public static final C19270xB A0E = AbstractC31171DnF.A0D("profile_interest_picker_viewModel");
    public boolean A00;
    public boolean A01;
    public final UserSession A02;
    public final FO0 A03;
    public final C32315ELe A04;
    public final List A05;
    public final InterfaceC24731Iq A06;
    public final InterfaceC19390xP A07;
    public final InterfaceC19390xP A08;
    public final C05A A09;
    public final C05A A0A;
    public final C0UO A0B;
    public final String A0C;
    public final C0UO A0D;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public Dz6(UserSession userSession, FO0 fo0, C32315ELe c32315ELe, String str) {
        Object obj;
        C51758Mth c51758Mth;
        AbstractC167007dF.A1E(userSession, 1, c32315ELe);
        this.A02 = userSession;
        this.A03 = fo0;
        this.A04 = c32315ELe;
        this.A0C = str;
        List<InterfaceC37273GbQ> A0R = AbstractC166997dE.A0Y(userSession).A0R();
        this.A05 = A0R;
        if (A0R != null) {
            obj = AbstractC167017dG.A0q(A0R);
            for (InterfaceC37273GbQ interfaceC37273GbQ : A0R) {
                if (interfaceC37273GbQ != null && interfaceC37273GbQ.B6s() != null) {
                    c51758Mth = new C51758Mth(interfaceC37273GbQ, true);
                } else {
                    c51758Mth = null;
                }
                obj.add(c51758Mth);
            }
        } else {
            obj = C16930sl.A00;
        }
        C008002u A00 = C10E.A00(obj);
        this.A0A = A00;
        AnonymousClass059 A02 = AbstractC208910l.A02(A00);
        this.A0B = A02;
        C008002u A1A = AbstractC25235BEs.A1A(false);
        this.A09 = A1A;
        AnonymousClass059 A022 = AbstractC208910l.A02(A1A);
        this.A0D = A022;
        C24721Ip c24721Ip = new C24721Ip(0);
        this.A06 = c24721Ip;
        this.A07 = AbstractC07080Za.A03(c24721Ip);
        FO0 fo02 = this.A03;
        this.A08 = C10Q.A02(new ProfileInterestPickerViewModel$viewState$1(this, null), fo02.A04, fo02.A06, A02, fo02.A05, A022);
        if (!this.A01) {
            A02(null, "surface_entry", null);
        }
        AbstractC31176DnK.A1Z(this, AbstractC141776au.A00(this), 21);
    }

    public static final int A00(String str, List list) {
        String str2;
        InterfaceC37273GbQ interfaceC37273GbQ;
        int i = -1;
        if (str != null) {
            int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                C51758Mth c51758Mth = (C51758Mth) obj;
                if (c51758Mth != null && (interfaceC37273GbQ = (InterfaceC37273GbQ) c51758Mth.A00) != null) {
                    str2 = interfaceC37273GbQ.B6s();
                } else {
                    str2 = null;
                }
                if (C14360o3.A0K(str2, str)) {
                    i = i2;
                }
                i2 = i3;
            }
        }
        return i;
    }

    public final void A02(Boolean bool, String str, List list) {
        String A14 = AbstractC25225BEi.A14();
        if (A14 != null) {
            UserSession userSession = this.A02;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(A0E, userSession), "ig_bio_interests_picker");
            A0f.A9K("viewer_id", AbstractC25228BEl.A13(userSession.userId));
            AbstractC31171DnF.A1D(A0f, "bio_interests_picker");
            A0f.AAP("action_type", str);
            A0f.AAP("nav_chain", A14);
            A0f.AAP("topic_name", null);
            A0f.AAk("bio_interest_ids", list);
            A0f.A7v("has_unsaved_changes", bool);
            A0f.AAP("entrypoint", this.A0C);
            A0f.Cht();
        }
    }

    public static final List A01(List list) {
        String str;
        InterfaceC37273GbQ interfaceC37273GbQ;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C51758Mth c51758Mth = (C51758Mth) it.next();
            if (c51758Mth != null && (interfaceC37273GbQ = (InterfaceC37273GbQ) c51758Mth.A00) != null) {
                str = interfaceC37273GbQ.B6s();
            } else {
                str = null;
            }
            A0q.add(str);
        }
        return A0q;
    }
}
