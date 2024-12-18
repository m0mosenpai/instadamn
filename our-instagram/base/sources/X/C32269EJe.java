package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.EJe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32269EJe extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "InterestPickerFragment";
    public int A00;
    public TextView A01;
    public E04 A02;
    public InterfaceC37264GbH A03;
    public boolean A05;
    public boolean A06;
    public C57112jm A07;
    public SpinnerImageView A08;
    public User A09;
    public boolean A0A;
    public String A04 = "";
    public final InterfaceC09390do A0D = C1XM.A00(new C57510Pfk(this, 6));
    public final HashMap A0B = AbstractC166987dD.A1G();
    public final HashMap A0C = AbstractC166987dD.A1G();
    public final boolean A0F = C14640oc.A0A();
    public final InterfaceC09390do A0E = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        if (this.A05) {
            interfaceC56362iU.EkF(false);
        } else {
            interfaceC56362iU.EkS(true);
            interfaceC56362iU.Efu(2131976275);
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView A0D = AbstractC31178DnM.A0D(view);
        ViewOnLayoutChangeListenerC35699FpZ.A00(A0D, 3, this);
        E04 e04 = this.A02;
        if (e04 == null) {
            C14360o3.A0F("interestAdapter");
            throw C00O.createAndThrow();
        }
        A0D.setAdapter(e04);
        AbstractC31174DnI.A15(getActivity(), A0D);
        if (!this.A0A) {
            InterfaceC09390do interfaceC09390do = this.A0E;
            C32539EUp.A00(this, C35107Fe9.A00(AbstractC166987dD.A0r(interfaceC09390do)), 32);
            C25621Ms A0M = AbstractC31177DnL.A0M(AbstractC25230BEn.A0k(interfaceC09390do, 0));
            A0M.A0B(MSV.A00(483));
            A0M.A0R(C32128EAb.class, FSX.class);
            A0M.A0H("caller", "INTEREST_NUX");
            C32539EUp.A00(this, A0M.A0N(), 30);
            this.A0A = true;
        }
    }

    public static final void A00(C32269EJe c32269EJe, long j, boolean z) {
        int i;
        UserSession A0r = AbstractC166987dD.A0r(c32269EJe.A0E);
        if (z) {
            C14360o3.A0B(A0r, 0);
            C25621Ms A0c = AbstractC167017dG.A0c(A0r);
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("interest_nux/");
            A1C.append("select");
            A1C.append('/');
            A1C.append(j);
            A1C.append('/');
            A0c.A0B(A1C.toString());
            c32269EJe.schedule(AbstractC31177DnL.A0Q(A0c));
            if (c32269EJe.A05) {
                i = c32269EJe.A00 + 1;
            } else {
                return;
            }
        } else {
            C14360o3.A0B(A0r, 0);
            C25621Ms A0c2 = AbstractC167017dG.A0c(A0r);
            StringBuilder A1C2 = AbstractC166987dD.A1C();
            A1C2.append("interest_nux/");
            A1C2.append("unselect");
            A1C2.append('/');
            A1C2.append(j);
            A1C2.append('/');
            A0c2.A0B(A1C2.toString());
            c32269EJe.schedule(AbstractC31177DnL.A0Q(A0c2));
            if (!c32269EJe.A05) {
                return;
            } else {
                i = c32269EJe.A00 - 1;
            }
        }
        c32269EJe.A00 = i;
    }

    public final void A02(boolean z) {
        SpinnerImageView spinnerImageView = this.A08;
        if (spinnerImageView == null) {
            C14360o3.A0F("loadingSpinner");
            throw C00O.createAndThrow();
        }
        spinnerImageView.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
    }

    @Override // X.AbstractC59962oe, X.AbstractC59972of
    public final void afterOnPause() {
        Integer num;
        EnumC127875qG enumC127875qG;
        if (this.A06) {
            User A0g = AbstractC31176DnK.A0g(C17060sy.A01, this.A0E);
            A0g.A03.EVO(AbstractC166997dE.A0b());
            E04 e04 = this.A02;
            String str = "interestAdapter";
            if (e04 != null) {
                List<InterfaceC37273GbQ> list = e04.A03;
                if (list != null) {
                    ArrayList<ExploreTopicCluster> A0i = AbstractC167007dF.A0i(list);
                    for (InterfaceC37273GbQ interfaceC37273GbQ : list) {
                        E04 e042 = this.A02;
                        if (e042 != null) {
                            List list2 = e042.A03;
                            if (list2 != null) {
                                ArrayList A1E = AbstractC166987dD.A1E();
                                for (Object obj : list2) {
                                    Boolean bool = (Boolean) e042.A02.get(AbstractC31177DnL.A0Z(((InterfaceC37273GbQ) obj).B6s()));
                                    if (bool != null && bool.booleanValue()) {
                                        A1E.add(obj);
                                    }
                                }
                                boolean contains = A1E.contains(interfaceC37273GbQ);
                                String B6s = interfaceC37273GbQ.B6s();
                                if (B6s == null) {
                                    B6s = "";
                                }
                                String name = interfaceC37273GbQ.getName();
                                if (name == null) {
                                    name = "";
                                }
                                String name2 = interfaceC37273GbQ.getName();
                                if (name2 == null) {
                                    name2 = "";
                                }
                                Integer num2 = C05F.A1F;
                                if (contains) {
                                    enumC127875qG = EnumC127875qG.A04;
                                } else {
                                    enumC127875qG = EnumC127875qG.A07;
                                }
                                A0i.add(new ExploreTopicCluster(enumC127875qG, num2, B6s, name, name2, null, null, null, null, 0, 0, false, false));
                            }
                        }
                    }
                    C31690Dvv c31690Dvv = (C31690Dvv) this.A0D.getValue();
                    ArrayList A0i2 = AbstractC167007dF.A0i(A0i);
                    for (ExploreTopicCluster exploreTopicCluster : A0i) {
                        C14360o3.A0B(exploreTopicCluster, 0);
                        String str2 = exploreTopicCluster.A06;
                        String str3 = exploreTopicCluster.A09;
                        if (exploreTopicCluster.A01 == EnumC127875qG.A07) {
                            num = C05F.A0N;
                        } else {
                            num = C05F.A0Y;
                        }
                        A0i2.add(new C31691Dvw(exploreTopicCluster, num, str2, str3));
                    }
                    C31690Dvv.A01(c31690Dvv, C05F.A01, A0i2);
                    C31690Dvv.A00(c31690Dvv);
                }
                str = "interestList";
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        super.afterOnPause();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        int i;
        if (this.A05) {
            i = 2582;
        } else {
            i = 4862;
        }
        return AbstractC111324zv.A00(i);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0E);
    }

    public final void A01(String str, String str2, String str3) {
        AbstractC167017dG.A1P(str2, str3);
        InterfaceC09390do interfaceC09390do = this.A0E;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31176DnK.A0M(this, interfaceC09390do), AbstractC111324zv.A00(2499));
        A0f.A9K("viewer_id", Long.valueOf(AbstractC31178DnM.A04(interfaceC09390do)));
        AbstractC31171DnF.A1D(A0f, getModuleName());
        A0f.AAP("action_type", str);
        A0f.AAP("topic_name", str2);
        AbstractC25232BEp.A1L(A0f, AbstractC111324zv.A00(2388), str3);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        int A02 = C0f9.A02(740055529);
        Bundle requireArguments = requireArguments();
        this.A07 = AbstractC31180DnO.A0N();
        Context requireContext = requireContext();
        C57112jm c57112jm = this.A07;
        if (c57112jm == null) {
            str = "viewpointManager";
        } else {
            this.A02 = new E04(requireContext, c57112jm, this);
            boolean z = requireArguments.getBoolean("IS_SIGN_UP_FLOW");
            this.A05 = z;
            E04 e04 = this.A02;
            str = "interestAdapter";
            if (e04 != null) {
                e04.A05 = z;
                e04.A06 = this.A0F;
                super.onCreate(bundle);
                C0f9.A09(-2050480513, A02);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0133, code lost:
    
        if (r0 == null) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0133  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r11, android.view.ViewGroup r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32269EJe.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
