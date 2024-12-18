package X;

import android.text.TextUtils;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.direct.DirectSearchResult;
import com.instagram.model.direct.DirectShareTarget;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: X.DuS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31600DuS implements InterfaceC13000lm {
    public C2EC A00;
    public EnumC92794Ds A01;
    public C32872EdE A02;
    public C31641Dv7 A03;
    public Boolean A04;
    public Integer A05;
    public String A06;
    public String A07;
    public List A08;
    public List A09;
    public boolean A0A = false;
    public boolean A0B;
    public boolean A0C;
    public final C2DS A0D;
    public final boolean A0E;

    public final void A02() {
        this.A07 = null;
        this.A08 = null;
        this.A09 = null;
        this.A05 = null;
        this.A06 = null;
        this.A01 = null;
        this.A00 = null;
        this.A0C = false;
        this.A0B = false;
        this.A04 = false;
        C31641Dv7 c31641Dv7 = this.A03;
        if (c31641Dv7 != null) {
            this.A0A = false;
            c31641Dv7.A02 = null;
            c31641Dv7.A04 = false;
            c31641Dv7.A08();
        }
        C32872EdE c32872EdE = this.A02;
        if (c32872EdE != null) {
            c32872EdE.A00 = null;
            c32872EdE.A01 = null;
        }
    }

    public static C31600DuS A00(UserSession userSession, Boolean bool) {
        C31600DuS c31600DuS = (C31600DuS) C31651DvH.A00(userSession, C31600DuS.class, 11);
        c31600DuS.A04 = Boolean.valueOf(bool.booleanValue());
        if (C18U.A06(C06090Tz.A05, userSession, 36313458861475862L)) {
            C31641Dv7 c31641Dv7 = (C31641Dv7) userSession.A01(C31641Dv7.class, new C44070Jdv(2, c31600DuS, userSession));
            c31600DuS.A03 = c31641Dv7;
            C14360o3.A0B(c31641Dv7, 1);
            c31600DuS.A02 = (C32872EdE) userSession.A01(C32872EdE.class, new C50160MDn(c31641Dv7, 5));
        }
        return c31600DuS;
    }

    public static HashSet A01(C31600DuS c31600DuS) {
        if (c31600DuS.A04.booleanValue()) {
            List list = c31600DuS.A08;
            if (list != null) {
                return AbstractC31171DnF.A0k(list);
            }
        } else {
            List list2 = c31600DuS.A09;
            if (list2 != null) {
                HashSet A1H = AbstractC166987dD.A1H();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    A1H.add(AbstractC31172DnG.A0m(it).A09());
                }
                return A1H;
            }
        }
        return AbstractC166987dD.A1H();
    }

    public final void A04(int i) {
        if (this.A07 != null) {
            A02();
        }
        this.A07 = AbstractC166997dE.A0n();
        C31641Dv7 c31641Dv7 = this.A03;
        if (c31641Dv7 != null) {
            this.A0A = false;
            if (c31641Dv7.A02 != null) {
                c31641Dv7.A02 = null;
                c31641Dv7.A04 = false;
                c31641Dv7.A08();
            }
            String str = c31641Dv7.A02;
            if (str == null) {
                str = AbstractC166997dE.A0n();
                c31641Dv7.A02 = str;
            }
            c31641Dv7.A01 = null;
            if (str != null) {
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c31641Dv7.A05, "omnipicker_search_start");
                if (A0f.isSampled()) {
                    AbstractC31173DnH.A1K(A0f, str);
                    int i2 = 1;
                    if (i != 1) {
                        i2 = 4;
                    }
                    AbstractC166997dE.A1N(A0f, "entry_surface", i2);
                    AbstractC166997dE.A1N(A0f, "omnipicker_type", 2);
                    if (c31641Dv7.A09) {
                        AbstractC31175DnJ.A19(A0f, c31641Dv7.A08);
                    }
                    A0f.Cht();
                }
            }
        }
        C32872EdE c32872EdE = this.A02;
        if (c32872EdE != null) {
            c32872EdE.A00 = null;
            c32872EdE.A01 = null;
            c32872EdE.A01();
        }
    }

    public final void A05(int i) {
        String str;
        EnumC33495ErU enumC33495ErU;
        C31641Dv7 c31641Dv7 = this.A03;
        if (c31641Dv7 != null && c31641Dv7.A0A && (str = c31641Dv7.A02) != null) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c31641Dv7.A05, "omnipicker_search_error_state");
            if (A0f.isSampled()) {
                AbstractC31173DnH.A1K(A0f, str);
                A0f.AAP("query_string", c31641Dv7.A01);
                if (i != 1) {
                    if (i != 2) {
                        enumC33495ErU = EnumC33495ErU.GENERAL_ERROR;
                    } else {
                        enumC33495ErU = EnumC33495ErU.NO_INTERNET;
                    }
                } else {
                    enumC33495ErU = EnumC33495ErU.NO_RESULTS;
                }
                A0f.A8R(enumC33495ErU, "error_state");
                A0f.Cht();
            }
        }
    }

    public final void A06(InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, E9O e9o, String str, List list, boolean z) {
        if (this.A07 != null) {
            this.A0C = z;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, abstractC12990ll), AbstractC111324zv.A00(2251));
            if (A0f.isSampled()) {
                AbstractC31175DnJ.A0z(A0f, e9o.A01);
                A0f.A9K("relative_position", Long.valueOf(e9o.A02));
                AbstractC31171DnF.A1G(A0f, str);
                A0f.AAP("section_type", AbstractC34051F1e.A00(e9o.A00));
                String str2 = e9o.A06;
                String str3 = str2;
                if (str2 == null) {
                    str3 = "";
                }
                Pattern pattern = AbstractC13670mt.A01;
                AbstractC31175DnJ.A13(A0f, AbstractC167007dF.A0A(str3));
                A0f.AAP("search_string", str2);
                AbstractC31173DnH.A1K(A0f, this.A07);
                DirectSearchResult directSearchResult = e9o.A03;
                if (directSearchResult instanceof DirectShareTarget) {
                    A0f.A9K("recipient", AbstractC25228BEl.A13(((DirectShareTarget) directSearchResult).A09()));
                }
                AbstractC31176DnK.A1I(A0f);
            }
        }
        C31641Dv7 c31641Dv7 = this.A03;
        if (c31641Dv7 != null) {
            c31641Dv7.A0A(e9o, list);
        }
        C32872EdE c32872EdE = this.A02;
        if (c32872EdE != null) {
            c32872EdE.A03(e9o);
        }
    }

    public final void A07(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        if (this.A07 != null && !this.A0C) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "direct_exit_search");
            if (A0f.isSampled()) {
                AbstractC31173DnH.A1K(A0f, this.A07);
                Pattern pattern = AbstractC13670mt.A01;
                AbstractC31175DnJ.A13(A0f, AbstractC167007dF.A0A(str));
                A0f.Cht();
            }
            C32872EdE c32872EdE = this.A02;
            if (c32872EdE != null) {
                c32872EdE.A02();
            }
            C31641Dv7 c31641Dv7 = this.A03;
            if (c31641Dv7 != null && !this.A0A) {
                this.A0A = true;
                c31641Dv7.A09(null, null, C05F.A0j, null, null, null, null);
            }
            A02();
        }
    }

    public final void A08(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        long A0A;
        String str2;
        if (this.A07 != null) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "direct_compose_search");
            if (A0f.isSampled()) {
                boolean isEmpty = TextUtils.isEmpty(str);
                if (isEmpty) {
                    A0A = 0;
                } else {
                    Pattern pattern = AbstractC13670mt.A01;
                    A0A = AbstractC167007dF.A0A(str);
                }
                AbstractC31175DnJ.A13(A0f, A0A);
                if (isEmpty) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                A0f.AAP("search_string", str2);
                AbstractC31173DnH.A1K(A0f, this.A07);
                A0f.Cht();
            }
        }
        C31641Dv7 c31641Dv7 = this.A03;
        if (c31641Dv7 != null && !AbstractC13670mt.A0G(str, c31641Dv7.A01)) {
            c31641Dv7.A08();
            String str3 = c31641Dv7.A02;
            if (str3 != null) {
                if (c31641Dv7.A01 == null) {
                    c31641Dv7.A00 = AbstractC166997dE.A0n();
                }
                c31641Dv7.A01 = str;
                InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(c31641Dv7.A05, "omnipicker_search_query_changed");
                if (A0f2.isSampled()) {
                    AbstractC31173DnH.A1K(A0f2, str3);
                    A0f2.AAP("query_string", str);
                    AbstractC31175DnJ.A11(A0f2, AbstractC167007dF.A0A(c31641Dv7.A01));
                    if (C18U.A06(C06090Tz.A05, c31641Dv7.A06, 36328409642647034L)) {
                        A0f2.AAP("query_session_id", c31641Dv7.A00);
                    }
                    A0f2.Cht();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        if (r1.length() == 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A09(X.E9O r10, java.util.List r11) {
        /*
            r9 = this;
            X.Dv7 r0 = r9.A03
            if (r0 == 0) goto L87
            r3 = 1
            X.C14360o3.A0B(r11, r3)
            java.lang.String r6 = r0.A02
            if (r6 == 0) goto L87
            X.0wW r1 = r0.A05
            java.lang.String r0 = "omnipicker_search_result_unselected"
            X.0Ai r2 = X.AbstractC166987dD.A0f(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L87
            X.E4n r7 = new X.E4n
            r7.<init>()
            long r0 = r10.A01
            X.AbstractC31176DnK.A1N(r7, r0)
            java.lang.Integer r8 = r10.A04
            com.instagram.model.direct.DirectSearchResult r4 = r10.A03
            boolean r5 = r4 instanceof com.instagram.model.direct.DirectShareTarget
            r0 = 0
            if (r5 == 0) goto L34
            r1 = r4
            com.instagram.model.direct.DirectShareTarget r1 = (com.instagram.model.direct.DirectShareTarget) r1
            if (r1 == 0) goto L34
            java.lang.String r0 = r1.A0L
        L34:
            X.Eru r1 = X.C31641Dv7.A03(r8, r0)
            java.lang.String r0 = "result_type"
            r7.A01(r1, r0)
            java.lang.String r1 = r10.A06
            java.lang.String r0 = "query_string"
            r7.A06(r0, r1)
            java.lang.String r0 = "search_result"
            r2.AAQ(r7, r0)
            int r7 = X.C31641Dv7.A01(r10)
            if (r1 == 0) goto L56
            int r1 = r1.length()
            r0 = 0
            if (r1 != 0) goto L57
        L56:
            r0 = 1
        L57:
            int r1 = X.C31641Dv7.A00(r7, r0)
            java.lang.String r0 = "ui_section"
            X.AbstractC166997dE.A1N(r2, r0, r1)
            long r0 = r10.A02
            X.AbstractC31175DnJ.A12(r2, r0)
            X.AbstractC31173DnH.A1K(r2, r6)
            java.util.List r1 = X.C31641Dv7.A07(r11)
            java.lang.String r0 = "preselected_items"
            r2.AAk(r0, r1)
            if (r5 == 0) goto L84
            com.instagram.model.direct.DirectShareTarget r4 = (com.instagram.model.direct.DirectShareTarget) r4
            java.lang.Boolean r0 = r4.A0B
            boolean r0 = X.AbstractC166997dE.A1Z(r0, r3)
            if (r0 == 0) goto L84
            java.util.List r1 = r4.A0P
            java.lang.String r0 = "recipient_ids"
            r2.AAk(r0, r1)
        L84:
            r2.Cht()
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31600DuS.A09(X.E9O, java.util.List):void");
    }

    public final void A0A(InterfaceC83713oG interfaceC83713oG, boolean z) {
        String str;
        C31641Dv7 c31641Dv7 = this.A03;
        if (c31641Dv7 != null) {
            C2EC c2ec = this.A00;
            if (c2ec != null) {
                str = c2ec.C7I();
            } else {
                str = this.A06;
            }
            if (str == null && interfaceC83713oG != null) {
                if (interfaceC83713oG instanceof C83693oE) {
                    str = ((C83693oE) interfaceC83713oG).A00;
                } else if (interfaceC83713oG instanceof C122145g6) {
                    List list = ((C122145g6) interfaceC83713oG).A00;
                    if (this.A09 == null) {
                        this.A09 = AbstractC166987dD.A1E();
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        this.A09.add(new DirectShareTarget(interfaceC83713oG, AbstractC31172DnG.A0p(it)));
                    }
                    C81663kb B3W = this.A0D.B3W(list);
                    if (B3W != null) {
                        str = B3W.C7I();
                    }
                }
            }
            if (interfaceC83713oG instanceof InterfaceC83703oF) {
                this.A01 = EnumC92794Ds.A05;
            }
            C32872EdE c32872EdE = this.A02;
            if (c32872EdE != null) {
                c32872EdE.A02();
            }
            HashSet A01 = A01(this);
            c31641Dv7.A03 = c31641Dv7.A07.schedule(new C32672EZw(this.A01, c31641Dv7, Boolean.valueOf(this.A0B), this.A05, null, str, A01, z), 2L, TimeUnit.SECONDS);
        }
    }

    public final void A0B(Integer num, Integer num2) {
        C31641Dv7 c31641Dv7 = this.A03;
        if (this.A07 != null && c31641Dv7 != null) {
            c31641Dv7.A09(null, Boolean.valueOf(this.A0B), num, num2, null, null, A01(this));
        }
    }

    public final void A0C(boolean z, boolean z2) {
        Integer num;
        EnumC33509Eri enumC33509Eri;
        EnumC33484ErJ enumC33484ErJ;
        C31641Dv7 c31641Dv7 = this.A03;
        if (c31641Dv7 != null && !this.A0A) {
            this.A0A = true;
            c31641Dv7.A08();
            String str = c31641Dv7.A02;
            if (str != null) {
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c31641Dv7.A05, "omnipicker_search_end");
                if (A0f.isSampled()) {
                    AbstractC31173DnH.A1K(A0f, str);
                    if (!z2) {
                        num = C05F.A0j;
                    } else if (z) {
                        num = C05F.A15;
                    } else {
                        num = C05F.A0u;
                    }
                    switch (num.intValue()) {
                        case 5:
                            enumC33509Eri = EnumC33509Eri.ABANDON;
                            break;
                        case 6:
                            enumC33509Eri = EnumC33509Eri.CREATE_BROADCAST_FLOW_CHAT;
                            break;
                        default:
                            enumC33509Eri = EnumC33509Eri.CREATE_PUBLIC_FLOW_CHAT;
                            break;
                    }
                    A0f.A8R(enumC33509Eri, "end_action");
                    A0f.A8R(EnumC33521Eru.A06, "result_type");
                    int ordinal = EnumC92794Ds.A05.ordinal();
                    if (ordinal != 2) {
                        if (ordinal != 1) {
                            enumC33484ErJ = EnumC33484ErJ.IG_DJANGO;
                        } else {
                            enumC33484ErJ = EnumC33484ErJ.IG_MESSENGER_INFRA;
                        }
                    } else {
                        enumC33484ErJ = EnumC33484ErJ.IG_ADVANCED_CRYPTO_TRANSPORT;
                    }
                    A0f.A8R(enumC33484ErJ, TraceFieldType.TransportType);
                    int i = 1;
                    if (z) {
                        i = 2;
                    }
                    AbstractC166997dE.A1N(A0f, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, i);
                    A0f.Cht();
                }
                c31641Dv7.A02 = null;
            }
        }
        A02();
    }

    public C31600DuS(UserSession userSession) {
        this.A0D = C2JD.A00(userSession);
        this.A0E = C18U.A06(C06090Tz.A05, userSession, 36313458861672473L);
    }

    public final void A03() {
        String str;
        HashSet A01 = A01(this);
        C31641Dv7 c31641Dv7 = this.A03;
        if (c31641Dv7 != null && !this.A0A) {
            this.A0A = true;
            c31641Dv7.A08();
            Integer num = C05F.A0j;
            Integer num2 = this.A05;
            EnumC92794Ds enumC92794Ds = this.A01;
            Boolean valueOf = Boolean.valueOf(this.A0B);
            if (enumC92794Ds == EnumC92794Ds.A05) {
                str = this.A06;
            } else {
                str = null;
            }
            c31641Dv7.A09(enumC92794Ds, valueOf, num, num2, null, str, A01);
        }
        A02();
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        A02();
    }
}
