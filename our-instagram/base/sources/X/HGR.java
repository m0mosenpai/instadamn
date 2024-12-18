package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import instagram.features.feed.fragment.ContextualFeedFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HGR extends C1P1 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;

    public HGR(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.A00 = i;
        this.A03 = obj3;
        this.A04 = z;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N;
        int i;
        switch (this.A00) {
            case 1:
                A0N = AbstractC167017dG.A0N(abstractC115105If, -2036248146);
                AbstractC35254Fgn.A02((Context) this.A01, abstractC115105If);
                i = 1893411611;
                break;
            case 2:
                A0N = C0f9.A03(1733517140);
                C1P1 c1p1 = (C1P1) this.A01;
                if (c1p1 != null) {
                    c1p1.onFail(abstractC115105If);
                }
                Object A00 = abstractC115105If.A00();
                if (A00 != null) {
                    C9GR.A03((Context) this.A02, ((C40781ul) A00).getErrorMessage(), "update_content_notes_mute_state_failure", 0);
                }
                i = -386387433;
                break;
            default:
                super.onFail(abstractC115105If);
                return;
        }
        C0f9.A0A(i, A0N);
    }

    @Override // X.C1P1
    public final void onFailInBackground(AbstractC115105If abstractC115105If) {
        if (1 - this.A00 != 0) {
            super.onFailInBackground(abstractC115105If);
            return;
        }
        int A03 = C0f9.A03(196241077);
        ((User) this.A02).A0w(this.A04);
        C0f9.A0A(1772538940, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        ArrayList A1E;
        int i;
        String str;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(751512330);
                C38855H9d c38855H9d = (C38855H9d) obj;
                int A032 = C0f9.A03(299297518);
                C14360o3.A0B(c38855H9d, 0);
                C42342Ip4 c42342Ip4 = (C42342Ip4) this.A03;
                C38609GyC F7f = c38855H9d.F7f();
                boolean z = this.A04;
                C154796xU c154796xU = (C154796xU) this.A02;
                C38333GtS c38333GtS = (C38333GtS) this.A01;
                c42342Ip4.A00 = F7f.A00;
                List list = F7f.A01;
                if (list != null && !list.isEmpty()) {
                    ArrayList A0q = AbstractC167017dG.A0q(list);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        String A2u = AbstractC31172DnG.A0i(it).A2u();
                        if (A2u != null) {
                            A0q.add(A2u);
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    }
                    ArrayList A1F = AbstractC166987dD.A1F(A0q);
                    if (AbstractC25226BEj.A1b(A1F)) {
                        C38290GsZ.A00(AbstractC2044893h.A01(c42342Ip4.A02, A1F, false, false), c154796xU, c38333GtS, 1, z);
                    }
                } else {
                    c38333GtS.A07(new L09(C16930sl.A00, z));
                }
                C0f9.A0A(-101705272, A032);
                i = -1993924042;
                break;
            case 1:
            default:
                super.onSuccess(obj);
                return;
            case 2:
                A03 = C0f9.A03(852395539);
                int A033 = C0f9.A03(-778948774);
                C1P1 c1p1 = (C1P1) this.A01;
                if (c1p1 != null) {
                    c1p1.onSuccess(obj);
                }
                C0f9.A0A(-2053641772, A033);
                i = 609669923;
                break;
            case 3:
                A03 = C0f9.A03(-635064578);
                C168027ex c168027ex = (C168027ex) obj;
                int A034 = C0f9.A03(-965885811);
                C14360o3.A0B(c168027ex, 0);
                User user = (User) this.A02;
                user.A0t(c168027ex.getItems());
                ContextualFeedFragment contextualFeedFragment = (ContextualFeedFragment) this.A03;
                UserSession A00 = ContextualFeedFragment.A00(contextualFeedFragment);
                C14360o3.A0B(A00, 0);
                List Amr = user.A03.Amr();
                if (Amr != null) {
                    A1E = C152576tk.A00(A00, Amr);
                } else {
                    A1E = AbstractC166987dD.A1E();
                }
                C36274FzR A002 = FCM.A00(ContextualFeedFragment.A00(contextualFeedFragment));
                A002.A00.put(user.getId(), A1E);
                if (this.A04) {
                    UserSession A003 = ContextualFeedFragment.A00(contextualFeedFragment);
                    boolean A06 = C18U.A06(AbstractC25225BEi.A0j(A003, 0), A003, 36312475314029698L);
                    C75113Zb c75113Zb = (C75113Zb) this.A01;
                    if (A06) {
                        c75113Zb.A3G = true;
                    } else {
                        c75113Zb.A3F = true;
                    }
                    C3FQ scrollingViewProxy = contextualFeedFragment.getScrollingViewProxy();
                    int B6q = scrollingViewProxy.B6q();
                    if (A06) {
                        HY4 hy4 = contextualFeedFragment.A0N;
                        str = "adapter";
                        if (hy4 != null) {
                            Object item = hy4.getItem(B6q);
                            while (true) {
                                HY4 hy42 = contextualFeedFragment.A0N;
                                if (hy42 != null) {
                                    if (hy42.getItem(B6q) == item) {
                                        B6q++;
                                    }
                                }
                            }
                        }
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    scrollingViewProxy.EmE(B6q, 1);
                } else {
                    ((C75113Zb) this.A01).A2v = true;
                }
                HY4 hy43 = contextualFeedFragment.A0N;
                if (hy43 == null) {
                    str = "adapter";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                hy43.FAg();
                C0f9.A0A(-211059700, A034);
                i = 630294552;
                break;
            case 4:
                A03 = C0f9.A03(-1598548027);
                int A035 = C0f9.A03(1236785330);
                ((AbstractC57542kT) this.A02).A0F(((FLC) this.A01).A01);
                Context context = ((Fragment) this.A03).getContext();
                int i2 = 2131956863;
                if (this.A04) {
                    i2 = 2131956864;
                }
                C9GR.A07(context, i2);
                C0f9.A0A(-1870222440, A035);
                i = 371763188;
                break;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03;
        int i;
        switch (this.A00) {
            case 1:
                A03 = C0f9.A03(2113541538);
                EDR edr = (EDR) obj;
                int A0N = AbstractC167017dG.A0N(edr, 1030482948);
                AbstractC129875tr.A00(((FR7) this.A03).A01).A0C(edr.A00(), (User) this.A02, null);
                C0f9.A0A(1333711117, A0N);
                i = -1963549042;
                break;
            case 2:
                A03 = C0f9.A03(1573893363);
                int A032 = C0f9.A03(-1180585118);
                ((User) this.A03).A11(this.A04);
                C0f9.A0A(1157301023, A032);
                i = -507233318;
                break;
            default:
                super.onSuccessInBackground(obj);
                return;
        }
        C0f9.A0A(i, A03);
    }
}
