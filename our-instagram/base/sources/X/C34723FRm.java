package X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.request.DirectThreadApi;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.FRm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34723FRm {
    public Context A00;
    public UserSession A01;
    public InterfaceC37206GaH A02;
    public C35012Fbj A03;
    public C35151Fet A04;
    public List A05;
    public boolean A07;
    public final InterfaceC09390do A09 = C1XM.A00(new D87(this, 25));
    public Map A06 = AbstractC166987dD.A1I();
    public final InterfaceC09390do A0A = C1XM.A00(new D87(this, 26));
    public final C36463G6n A08 = new C36463G6n(this);

    public final List A01(List list) {
        String str;
        boolean z;
        int i;
        ArrayList<InterfaceC58223PrT> A12 = AbstractC166997dE.A12(list, 0);
        for (Object obj : list) {
            InterfaceC58223PrT interfaceC58223PrT = (InterfaceC58223PrT) obj;
            List list2 = this.A05;
            if (list2 == null) {
                list2 = C16930sl.A00;
            }
            if (!AbstractC31175DnJ.A1X(((E7i) interfaceC58223PrT).A00, list2)) {
                A12.add(obj);
            }
        }
        ArrayList A0q = AbstractC167017dG.A0q(A12);
        for (InterfaceC58223PrT interfaceC58223PrT2 : A12) {
            Map map = this.A06;
            E7i e7i = (E7i) interfaceC58223PrT2;
            User user = e7i.A00;
            boolean containsKey = map.containsKey(user.getUsername());
            if (!this.A07) {
                Context context = this.A00;
                if (context == null) {
                    C14360o3.A0F("context");
                    throw C00O.createAndThrow();
                }
                str = AbstractC167007dF.A0f(context, e7i.A02, 2131976531);
            } else {
                str = "";
            }
            C14360o3.A0A(str);
            boolean z2 = !this.A07;
            if (!containsKey) {
                List list3 = this.A05;
                if (list3 == null || (i = AbstractC31172DnG.A03(list3, 1)) < 0) {
                    i = 0;
                }
                if (i + this.A06.size() >= AbstractC167027dH.A01(this.A09)) {
                    z = false;
                    A0q.add(new C36203FyH(user, str, z2, containsKey, z));
                }
            }
            z = true;
            A0q.add(new C36203FyH(user, str, z2, containsKey, z));
        }
        return A0q;
    }

    public final void A06(Map map, boolean z) {
        String str;
        C14360o3.A0B(map, 0);
        this.A06 = map;
        C35151Fet c35151Fet = this.A04;
        if (c35151Fet == null) {
            str = "recipientsBarController";
        } else {
            Collection values = map.values();
            ArrayList A0q = AbstractC167017dG.A0q(values);
            Iterator it = values.iterator();
            while (it.hasNext()) {
                AbstractC31178DnM.A1V(A0q, it);
            }
            c35151Fet.A01(A0q, z);
            InterfaceC37206GaH interfaceC37206GaH = this.A02;
            if (interfaceC37206GaH == null) {
                str = "delegate";
            } else {
                interfaceC37206GaH.DdQ();
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final E91 A00(String str, int i) {
        if (str == null) {
            Context context = this.A00;
            if (context == null) {
                C14360o3.A0F("context");
                throw C00O.createAndThrow();
            }
            str = AbstractC166997dE.A0q(context.getResources(), 2131976186);
        }
        if (i > 0) {
            return new E91(ViewOnClickListenerC35679FpE.A00(this, 61), new BQO(str), BHS.A00(AbstractC25228BEl.A1Y(i), 2131957218));
        }
        return new E91(null, new BQO(str), null);
    }

    public final void A02() {
        C35151Fet c35151Fet = this.A04;
        if (c35151Fet == null) {
            C14360o3.A0F("recipientsBarController");
            throw C00O.createAndThrow();
        }
        if (c35151Fet.A00 == null) {
            ViewStub viewStub = null;
            viewStub.getClass();
            c35151Fet.A00 = (ViewGroup) viewStub.inflate();
            C35151Fet.A00(c35151Fet);
        }
        ViewGroup viewGroup = c35151Fet.A00;
        viewGroup.getClass();
        viewGroup.setVisibility(0);
        InterfaceC37232Gah interfaceC37232Gah = c35151Fet.A02;
        if (interfaceC37232Gah != null) {
            interfaceC37232Gah.E0x();
        }
    }

    public final void A03(DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        Context context = this.A00;
        if (context == null) {
            C14360o3.A0F("context");
            throw C00O.createAndThrow();
        }
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        A0I.A0A(2131960929);
        A0I.A09(2131957213);
        A0I.A0L(onClickListener, 2131960921);
        AbstractC31176DnK.A14(onClickListener2, A0I);
    }

    public final void A04(Fragment fragment, Boolean bool, Integer num, String str, String str2) {
        int seconds;
        String str3 = str2;
        if (str2 == null) {
            str3 = "";
        }
        if (num != null) {
            seconds = num.intValue();
        } else {
            seconds = (int) TimeUnit.DAYS.toSeconds(1L);
        }
        boolean A1a = AbstractC31177DnL.A1a(bool);
        Collection values = this.A06.values();
        ArrayList A0q = AbstractC167017dG.A0q(values);
        Iterator it = values.iterator();
        while (it.hasNext()) {
            AbstractC167017dG.A1V(A0q, it);
        }
        G1Y g1y = new G1Y(fragment, this, bool, num, str, A0q, seconds);
        UserSession userSession = this.A01;
        if (userSession != null) {
            List list = A0q;
            if (!C18U.A06(C06090Tz.A06, userSession, 36320274974777578L)) {
                UserSession userSession2 = this.A01;
                if (userSession2 != null) {
                    list = A0q;
                    if (C18U.A06(C06090Tz.A05, userSession2, 36320274974646504L)) {
                        list = C16930sl.A00;
                    }
                }
            }
            UserSession userSession3 = this.A01;
            if (userSession3 != null) {
                String A00 = AbstractC68470VSb.A00();
                C14360o3.A0B(list, 3);
                EE9.A00(DirectThreadApi.A02(userSession3, null, A00, str3, list, seconds, A1a), userSession3, g1y, 4);
                return;
            }
        }
        C14360o3.A0F("userSession");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A05(Fragment fragment, String str) {
        boolean A1a = AbstractC167017dG.A1a(fragment, str);
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            UserSession userSession = this.A01;
            if (userSession == null) {
                AbstractC31171DnF.A0y();
                throw C00O.createAndThrow();
            }
            C36881nl A01 = C36881nl.A01(activity, (InterfaceC11380iw) fragment, userSession, "creator_subscriber_chat_new_thread");
            AbstractC31179DnN.A1R(A01, str);
            A01.A0n = A1a;
            A01.A01 = fragment;
            A01.A0s = A1a;
            C36395G3w.A00(A01, activity, A1a ? 1 : 0);
            C36296Fzq A0b = AbstractC31172DnG.A0b(this.A0A);
            C36296Fzq.A02(EnumC33514Ern.A07, EnumC33512Erl.CREATE_SUBSCRIBER_CHAT, A0b, "thread_create_successful", "view", AbstractC167007dF.A0n(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str));
            A0b.A00 = null;
        }
    }
}
