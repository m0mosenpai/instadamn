package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.6k5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6k5 {
    public final InterfaceC43071ya A00;
    public final C57112jm A01;
    public final String A02;

    public C6k5(final UserSession userSession, C57112jm c57112jm, final InterfaceC60442pS interfaceC60442pS, String str) {
        C14360o3.A0B(c57112jm, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(str, 3);
        this.A01 = c57112jm;
        this.A02 = str;
        this.A00 = new AbstractC64162vb(userSession, interfaceC60442pS) { // from class: X.6k6
            public final UserSession A00;
            public final InterfaceC60442pS A01;

            @Override // X.AbstractC64162vb
            public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
                C38321qM c38321qM = (C38321qM) obj;
                List list = (List) obj2;
                C14360o3.A0B(c38321qM, 0);
                C14360o3.A0B(list, 1);
                A00(c38321qM, list, false);
            }

            @Override // X.AbstractC64162vb
            public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
                C38321qM c38321qM = (C38321qM) obj;
                List list = (List) obj2;
                C14360o3.A0B(c38321qM, 0);
                C14360o3.A0B(list, 1);
                A00(c38321qM, list, true);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            {
                /*
                    r1 = this;
                    X.2tB r0 = X.AbstractC62712tA.A00(r2)
                    X.2tC r0 = r0.A00
                    X.1BX r0 = r0.A00
                    X.C14360o3.A07(r0)
                    r1.<init>(r0)
                    r1.A00 = r2
                    r1.A01 = r3
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C6k6.<init>(com.instagram.common.session.UserSession, X.2pS):void");
            }

            private final void A00(C38321qM c38321qM, List list, boolean z) {
                C25531Mh A02;
                if (list.size() > 1) {
                    UserSession userSession2 = this.A00;
                    C0Zx c0Zx = new C0Zx();
                    c0Zx.A06("prior_module", (String) list.get(0));
                    c0Zx.A06("submodule", (String) list.get(1));
                    String str2 = (String) list.get(0);
                    String str3 = (String) list.get(1);
                    InterfaceC60442pS interfaceC60442pS2 = this.A01;
                    C14360o3.A0B(str2, 3);
                    C14360o3.A0B(str3, 4);
                    if (z) {
                        C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS2, userSession2);
                        A02 = new C25531Mh(A01.A00(A01.A00, "instagram_shopping_story_cta_bar_sub_impression"), 324);
                        if (((AbstractC02600Aj) A02).A00.isSampled()) {
                            String id = c38321qM.getId();
                            if (id != null) {
                                A02.A0l(id);
                                A02.A0N(c0Zx, "navigation_info");
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            return;
                        }
                    } else {
                        C18920wW A012 = AbstractC12220kQ.A01(interfaceC60442pS2, userSession2);
                        InterfaceC02590Ai A00 = A012.A00(A012.A00, "instagram_shopping_story_cta_bar_impression");
                        if (A00.isSampled()) {
                            String id2 = c38321qM.getId();
                            if (id2 != null) {
                                A00.AAP("m_pk", id2);
                                A00.AAQ(c0Zx, "navigation_info");
                                A00.AAP("cta_bar_type", "stories_view_shop");
                                A00.Cht();
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                        A02 = C25531Mh.A02(AbstractC12220kQ.A01(interfaceC60442pS2, userSession2));
                        if (!((AbstractC02600Aj) A02).A00.isSampled()) {
                            return;
                        }
                        A02.A0R("shopping_session_id", "");
                        A02.A0M(EnumC39651Hig.A07, "analytics_component");
                        A02.A0R("legacy_event_name", "instagram_shopping_story_cta_bar_impression");
                        A02.A0R("legacy_referral_surface", str2);
                        A02.A0R("legacy_ui_component", str3);
                        A02.A0l(c38321qM.getId());
                    }
                    A02.A0R("cta_bar_type", "stories_view_shop");
                    A02.Cht();
                }
            }
        };
    }
}
