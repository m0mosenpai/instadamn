package com.instagram.debug.devoptions.section.xme;

import X.AbstractC018607g;
import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC16960so;
import X.AbstractC23021Ah;
import X.AbstractC25225BEi;
import X.AbstractC59962oe;
import X.C0YY;
import X.C0f9;
import X.C140966Yy;
import X.C16930sl;
import X.C195448kk;
import X.C195468km;
import X.C9GR;
import X.GHY;
import X.InterfaceC16820sZ;
import X.InterfaceC19610xo;
import X.InterfaceC19630xq;
import X.N55;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.List;

/* loaded from: classes5.dex */
public final class XMEOptions implements DeveloperOptionsSection {
    public static final XMEOptions INSTANCE = new Object();

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public List getItems(final UserSession userSession, final FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, AbstractC018607g abstractC018607g) {
        AbstractC167017dG.A1N(userSession, fragmentActivity);
        return AbstractC16960so.A1Q(new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.xme.XMEOptions$getItems$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(2098286570);
                InterfaceC19610xo A0w = AbstractC166987dD.A0w(AbstractC23021Ah.A00(UserSession.this));
                A0w.E7D(AbstractC111324zv.A00(2723), 0);
                A0w.apply();
                FragmentActivity fragmentActivity2 = fragmentActivity;
                C9GR.A09(fragmentActivity2, fragmentActivity2.getString(2131958501));
                C0f9.A0C(730769693, A05);
            }
        }, 2131958500), new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.xme.XMEOptions$getItems$2

            /* renamed from: com.instagram.debug.devoptions.section.xme.XMEOptions$getItems$2$1, reason: invalid class name */
            /* loaded from: classes4.dex */
            public final class AnonymousClass1 extends C0YY implements InterfaceC16820sZ {
                public final /* synthetic */ UserSession $userSession;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(UserSession userSession) {
                    super(0);
                    this.$userSession = userSession;
                }

                @Override // X.InterfaceC16820sZ
                public /* bridge */ /* synthetic */ Object invoke() {
                    return new C195448kk(this.$userSession);
                }

                @Override // X.InterfaceC16820sZ
                public final C195448kk invoke() {
                    return new C195448kk(this.$userSession);
                }
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(657644683);
                C195468km.A00(UserSession.this, C16930sl.A00);
                UserSession userSession2 = UserSession.this;
                C195448kk c195448kk = (C195448kk) userSession2.A01(C195448kk.class, new AnonymousClass1(userSession2));
                c195448kk.A04.Egh(C195448kk.A00(c195448kk));
                FragmentActivity fragmentActivity2 = fragmentActivity;
                C9GR.A09(fragmentActivity2, fragmentActivity2.getString(2131958497));
                C0f9.A0C(-1791129496, A05);
            }
        }, 2131958496), new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.xme.XMEOptions$getItems$3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-148374145);
                InterfaceC19610xo A0w = AbstractC166987dD.A0w(AbstractC23021Ah.A00(UserSession.this));
                A0w.E7D("meta_gallery_recents_nux_impression_count", 0);
                A0w.apply();
                FragmentActivity fragmentActivity2 = fragmentActivity;
                C9GR.A09(fragmentActivity2, fragmentActivity2.getString(2131958498));
                C0f9.A0C(-1894194202, A05);
            }
        }, 2131958499), new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.xme.XMEOptions$getItems$4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(614273533);
                InterfaceC19610xo A0w = AbstractC166987dD.A0w(AbstractC23021Ah.A00(UserSession.this));
                A0w.E7D(AbstractC111324zv.A00(1281), 0);
                A0w.apply();
                FragmentActivity fragmentActivity2 = fragmentActivity;
                C9GR.A09(fragmentActivity2, fragmentActivity2.getString(2131958503));
                C0f9.A0C(1169213798, A05);
            }
        }, 2131958502), new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.xme.XMEOptions$getItems$5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-1094279645);
                C140966Yy c140966Yy = new C140966Yy(FragmentActivity.this, userSession);
                c140966Yy.A0D(new WearableMediaDownloadToolFragment());
                c140966Yy.A04();
                C0f9.A0C(-1651791453, A05);
            }
        }, 2131958506), new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.xme.XMEOptions$getItems$6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-1423124600);
                C140966Yy A0r = AbstractC25225BEi.A0r(FragmentActivity.this, userSession);
                A0r.A0D(new N55());
                A0r.A04();
                C0f9.A0C(1771420638, A05);
            }
        }, 2131958494), new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.xme.XMEOptions$getItems$7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-979406356);
                C140966Yy A0r = AbstractC25225BEi.A0r(FragmentActivity.this, userSession);
                A0r.A0D(new Xme3dViewerFragment());
                A0r.A04();
                C0f9.A0C(358335288, A05);
            }
        }, 2131958493), new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.xme.XMEOptions$getItems$8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-1648273068);
                InterfaceC19630xq interfaceC19630xq = AbstractC23021Ah.A00(UserSession.this).A01;
                InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                ARD.E7G("world_pages_tooltip_last_seen_timestamp_ms", 0L);
                ARD.apply();
                InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
                ARD2.E7D("world_pages_tooltip_impression_count", 0);
                ARD2.apply();
                FragmentActivity fragmentActivity2 = fragmentActivity;
                C9GR.A09(fragmentActivity2, fragmentActivity2.getString(2131958505));
                C0f9.A0C(1218519875, A05);
            }
        }, 2131958504));
    }

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public int getTitleRes() {
        return 2131958495;
    }
}
