package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import com.instagram.ui.widget.fixedtabbar.FixedTabBar;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class J1C implements MPJ {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public FixedTabBar A04;
    public final Context A05;
    public final List A06;
    public final InterfaceC11380iw A07;
    public final UserSession A08;
    public final JGA A09;

    public J1C(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, JGA jga) {
        C14360o3.A0B(userSession, 3);
        this.A09 = jga;
        this.A05 = context;
        this.A08 = userSession;
        this.A07 = interfaceC11380iw;
        this.A06 = AbstractC166987dD.A1E();
    }

    public final void A01(List list) {
        C14360o3.A0B(list, 0);
        List list2 = this.A06;
        list2.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            IKO iko = (IKO) it.next();
            ReelStore A04 = C1OU.A04(this.A08);
            C37771pE c37771pE = iko.A07;
            if (c37771pE != null) {
                list2.add(A04.A0I(c37771pE, false));
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
    }

    @Override // X.MPJ
    public final void setMode(int i) {
    }

    public final void A00() {
        String str;
        FixedTabBar fixedTabBar = this.A04;
        if (fixedTabBar == null) {
            str = "fixedTabBar";
        } else {
            Iterator it = fixedTabBar.A07.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setSelected(false);
            }
            View view = this.A00;
            if (view == null) {
                str = "hintView";
            } else {
                Object tag = view.getTag();
                if (tag != null) {
                    C39683HjF c39683HjF = (C39683HjF) tag;
                    C14360o3.A0B(c39683HjF, 0);
                    TextView textView = c39683HjF.A00;
                    AbstractC31173DnH.A19(AbstractC25228BEl.A0M(textView), textView, 2131969911);
                    UserSession userSession = this.A08;
                    InterfaceC11380iw interfaceC11380iw = this.A07;
                    View view2 = this.A01;
                    if (view2 == null) {
                        str = "reelPreviewLeft";
                    } else {
                        Object tag2 = view2.getTag();
                        if (tag2 != null) {
                            List list = this.A06;
                            Reel reel = (Reel) list.get(0);
                            JGA jga = this.A09;
                            AbstractC40659I0r.A00(interfaceC11380iw, userSession, jga, (C42800Iwc) tag2, reel, list, true);
                            View view3 = this.A02;
                            if (view3 == null) {
                                str = "reelPreviewRight";
                            } else {
                                Object tag3 = view3.getTag();
                                if (tag3 != null) {
                                    AbstractC40659I0r.A00(interfaceC11380iw, userSession, jga, (C42800Iwc) tag3, (Reel) list.get(1), list, true);
                                    return;
                                }
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
