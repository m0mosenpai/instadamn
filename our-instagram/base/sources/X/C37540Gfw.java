package X;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.odin.model.OdinContext;
import com.instagram.api.schemas.ConfirmationStyle;
import com.instagram.api.schemas.MediaControlEventSourceEnum;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerDirectData;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.clips.model.ClipsReplyBarData;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;

@Deprecated(message = "This ViewModel is now deprecated. Please reference ClipsViewerViewModel.")
/* renamed from: X.Gfw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37540Gfw extends AbstractC37623GhI implements InterfaceC62852tO, InterfaceC43399JFo, InterfaceC25200BCy, C31R, InterfaceC60222p5, InterfaceC60232p6 {
    public static final java.util.Set A25 = AbstractC16830sb.A07(ClipsViewerSource.A0n, ClipsViewerSource.A0G, ClipsViewerSource.A0A);
    public int A00;
    public C37734Gj9 A01;
    public InterfaceC62852tO A02;
    public InterfaceC41501vz A03;
    public InterfaceC41501vz A04;
    public C3AE A05;
    public C37675GiC A06;
    public C59952od A07;
    public C42206Ims A08;
    public MVF A09;
    public C39466Hbs A0A;
    public C37851Gl5 A0B;
    public C37897Gls A0C;
    public C43756JWu A0D;
    public C37726Gj1 A0E;
    public C39467Hbt A0F;
    public C5J A0G;
    public AbstractC43757JWv A0H;
    public C37784Gjz A0I;
    public C37888Gli A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public final Context A0Q;
    public final FragmentActivity A0R;
    public final InterfaceC116925Qy A0S;
    public final C37531Gfn A0T;
    public final C153696ve A0U;
    public final C25514BQc A0V;
    public final ClipsViewerConfig A0W;
    public final C5R5 A0X;
    public final UserSession A0Y;
    public final C57112jm A0Z;
    public final C7KY A0a;
    public final InterfaceC675232r A0b;
    public final MVO A0c;
    public final C61582rL A0d;
    public final C5GV A0e;
    public final C64842wi A0f;
    public final C64742wY A0g;
    public final C3HZ A0h;
    public final C37502GfK A0i;
    public final C43754JWs A0j;
    public final C62832tM A0k;
    public final C37756GjV A0l;
    public final IE0 A0m;
    public final ILW A0n;
    public final BKU A0o;
    public final C37755GjU A0p;
    public final AbstractC39459Hbl A0q;
    public final C38219GrO A0r;
    public final C29561D0n A0s;
    public final C37705Gig A0t;
    public final C25371BKo A0u;
    public final C37625GhK A0v;
    public final C24186Ao9 A0w;
    public final BKZ A0x;
    public final C42283Io7 A0y;
    public final C37581Ggc A0z;
    public final C39465Hbr A10;
    public final C37661Ghu A11;
    public final C41113IIe A12;
    public final INA A13;
    public final C37716Gir A14;
    public final C37711Gim A15;
    public final C37866GlL A16;
    public final C26914BuH A17;
    public final C37662Ghv A18;
    public final C37522Gfe A19;
    public final C37586Ggh A1A;
    public final C37659Ghs A1B;
    public final C37660Ght A1C;
    public final C37604Ggz A1D;
    public final IG5 A1E;
    public final C37657Ghq A1F;
    public final C37880Gla A1G;
    public final C37671Gi4 A1H;
    public final IKR A1I;
    public final C37663Ghw A1J;
    public final C37560GgG A1K;
    public final C37624GhJ A1L;
    public final String A1M;
    public final String A1N;
    public final String A1O;
    public final List A1P;
    public final InterfaceC09390do A1Q;
    public final InterfaceC09390do A1R;
    public final InterfaceC09390do A1S;
    public final InterfaceC09390do A1T;
    public final InterfaceC09390do A1U;
    public final InterfaceC09390do A1V;
    public final InterfaceC09390do A1W;
    public final InterfaceC09390do A1X;
    public final InterfaceC09390do A1Y;
    public final InterfaceC09390do A1Z;
    public final InterfaceC09390do A1a;
    public final InterfaceC09390do A1b;
    public final InterfaceC09390do A1c;
    public final InterfaceC09390do A1d;
    public final InterfaceC09390do A1e;
    public final InterfaceC09390do A1f;
    public final InterfaceC09390do A1g;
    public final InterfaceC09390do A1h;
    public final InterfaceC09390do A1i;
    public final InterfaceC09390do A1j;
    public final InterfaceC09390do A1k;
    public final InterfaceC09390do A1l;
    public final InterfaceC09390do A1m;
    public final InterfaceC09390do A1n;
    public final InterfaceC09390do A1o;
    public final InterfaceC09390do A1p;
    public final InterfaceC09390do A1q;
    public final InterfaceC09390do A1r;
    public final InterfaceC09390do A1s;
    public final InterfaceC09390do A1t;
    public final InterfaceC09390do A1u;
    public final InterfaceC16820sZ A1v;
    public final InterfaceC16820sZ A1w;
    public final InterfaceC16820sZ A1x;
    public final InterfaceC16820sZ A1y;
    public final InterfaceC16820sZ A1z;
    public final InterfaceC16820sZ A20;
    public final boolean A21;
    public final boolean A22;
    public final C41098IHp A23;
    public final IG3 A24;

    private final boolean A06(boolean z) {
        ClipsViewerConfig clipsViewerConfig;
        String str;
        InterfaceC131055vt BfV;
        if (z) {
            return false;
        }
        C154806xV c154806xV = this.A1A.A06.A03;
        if (c154806xV.A07 != null || c154806xV.A03 == C05F.A0C) {
            return false;
        }
        UserSession userSession = this.A0Y;
        if (C18U.A06(C06090Tz.A05, userSession, 36325845548611014L) && ((str = (clipsViewerConfig = this.A0W).A1I) != null || clipsViewerConfig.A0E != null)) {
            Iterator A08 = AbstractC37552Gg8.A08(this.A0q);
            while (A08.hasNext()) {
                C120985dq c120985dq = (C120985dq) A08.next();
                if (!C14360o3.A0K(c120985dq.getId(), str)) {
                    List list = clipsViewerConfig.A0E;
                    if (list == null) {
                        list = C16930sl.A00;
                    }
                    if (!list.contains(c120985dq.getId())) {
                        continue;
                    }
                }
                C38321qM c38321qM = c120985dq.A02;
                if (c38321qM != null && (BfV = c38321qM.A0C.BfV()) != null && C14360o3.A0K(BfV.Bv3(), true)) {
                    return false;
                }
            }
        }
        if (!C1LE.A06(userSession) || C1LE.A02(userSession).contains(this.A0W.A0J.name())) {
            return false;
        }
        C37705Gig c37705Gig = this.A0t;
        return !c37705Gig.A01 && c37705Gig.A00;
    }

    public final void A0H(View view, C120985dq c120985dq) {
        Integer num;
        C14360o3.A0B(c120985dq, 0);
        C37671Gi4 c37671Gi4 = this.A1H;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            C110974z9 A00 = c37671Gi4.A01.A00(c38321qM);
            C50627MWo c50627MWo = c37671Gi4.A00;
            if (c50627MWo != null && (num = c37671Gi4.A02) != null) {
                C14360o3.A0B(c37671Gi4.A03, 0);
                long currentTimeMillis = System.currentTimeMillis();
                Number number = (Number) c50627MWo.A00;
                if (number != null) {
                    c50627MWo.A01 = Long.valueOf(currentTimeMillis - number.longValue());
                    int intValue = num.intValue();
                    if (intValue != 0) {
                        if (intValue != 1) {
                            if (intValue == 2) {
                                c50627MWo.A02(A00.A01);
                                A00.A01 = c50627MWo;
                            } else {
                                throw B4Z.A00();
                            }
                        } else {
                            c50627MWo.A02(A00.A00);
                            A00.A00 = c50627MWo;
                        }
                    } else {
                        c50627MWo.A02(A00.A02);
                        A00.A02 = c50627MWo;
                    }
                    c37671Gi4.A02 = null;
                    c37671Gi4.A00 = null;
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
        }
        C0k4 c0k4 = this.A0w.A00;
        if (c0k4 != null) {
            C226218q.A01(AbstractC12960li.A00);
            C226418s.A06(c0k4, "reels_tab_first_item_source", AbstractC37799GkE.A00(c120985dq.A03));
            BQP bqp = new BQP(c0k4, 16);
            if (view != null) {
                view.post(new J40(bqp));
            } else {
                bqp.invoke();
            }
        }
    }

    public final void A0J(C120985dq c120985dq, C37644Ghd c37644Ghd) {
        C14360o3.A0B(c37644Ghd, 1);
        C37675GiC c37675GiC = this.A06;
        if (c37675GiC != null) {
            C37607Gh2 c37607Gh2 = c37675GiC.A0Y;
            C38321qM c38321qM = c120985dq.A02;
            if (c38321qM != null) {
                C37608Gh3 c37608Gh3 = c37607Gh2.A0H;
                c37608Gh3.A00 = c120985dq;
                c37608Gh3.A02 = c38321qM;
                c37608Gh3.A01 = c37644Ghd;
                c37608Gh3.A03 = c37644Ghd.A0E;
                c37608Gh3.A0D(EnumC39627Hel.A1g);
            }
        }
    }

    public final void A0L(C120985dq c120985dq, Integer num, String str, String str2, String str3) {
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            ConfirmationStyle confirmationStyle = null;
            if (num == C05F.A0j) {
                this.A10.A0B(c120985dq, null, this, (C37546Gg2) this.A20.invoke());
            } else {
                if (c120985dq.CdW()) {
                    if (C18U.A06(C06090Tz.A05, this.A0Y, 36319360147463384L)) {
                        return;
                    }
                }
                InterfaceC84443pn AoG = c38321qM.A0C.AoG();
                if (AoG != null) {
                    confirmationStyle = AoG.AqJ();
                }
                if (confirmationStyle != ConfirmationStyle.A05) {
                    C37625GhK c37625GhK = this.A0v;
                    c37625GhK.A02.postDelayed(c37625GhK.A06, 3000L);
                }
            }
            long A06 = C37546Gg2.A03(this.A20).C09(c120985dq).A06();
            if (num != null) {
                UserSession userSession = this.A0Y;
                if (C18U.A06(C06090Tz.A05, userSession, 36312170372334528L)) {
                    FragmentActivity fragmentActivity = this.A0R;
                    C14360o3.A0B(userSession, 0);
                    C130175uN c130175uN = C130175uN.A00;
                    Long A00 = C130175uN.A00(c38321qM);
                    List A01 = c130175uN.A01(fragmentActivity, userSession, c38321qM);
                    C37522Gfe c37522Gfe = this.A19;
                    String B3P = c38321qM.A0C.B3P();
                    String str4 = this.A1D.A00;
                    C14360o3.A0B(c37522Gfe, 1);
                    C41771Ien.A08(c37522Gfe, userSession, null, c38321qM.BRp(), A00, "explore_see_less", c38321qM.getId(), AbstractC37303Gc4.A0T(userSession, c38321qM), "sfplt_in_menu", str4, B3P, AbstractC25226BEj.A1G(c38321qM), AbstractC37300Gc1.A0S(c38321qM), str, str2, c38321qM.A0C.Bl8(), str3, null, null, A01, (int) A06, true, false);
                }
            }
            this.A0q.Edn(c120985dq, EnumC39535Hd6.A02);
        }
    }

    public final void A0M(C120985dq c120985dq, String str, boolean z, boolean z2) {
        AbstractC39459Hbl abstractC39459Hbl = this.A0q;
        UserSession userSession = this.A0Y;
        AbstractC167017dG.A1P(abstractC39459Hbl, userSession);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            C3YS.A00(userSession).A02(c38321qM, z);
            if (!z) {
                abstractC39459Hbl.Ecj(c120985dq, EnumC75193Zm.A0F);
            }
        }
        C38321qM c38321qM2 = c120985dq.A02;
        if (c38321qM2 != null) {
            if (z) {
                C37891Glm A00 = AbstractC37876GlW.A00(userSession);
                if (A00.A01(c38321qM2)) {
                    A00.A00(c38321qM2, C05F.A0N);
                    AbstractC41705Idb.A02(MediaControlEventSourceEnum.A06, this.A19, userSession, c38321qM2, this.A1D.A00, true);
                }
                this.A1K.A0S(null, "hide", false, true);
                this.A1P.add(c120985dq);
            } else {
                this.A1K.A0H();
                C37625GhK c37625GhK = this.A0v;
                Handler handler = c37625GhK.A02;
                handler.removeCallbacks(c37625GhK.A06);
                handler.removeCallbacks(c37625GhK.A07);
                this.A1P.remove(c120985dq);
                abstractC39459Hbl.Edn(c120985dq, EnumC39535Hd6.A03);
            }
            InterfaceC16820sZ interfaceC16820sZ = this.A20;
            long A06 = C37546Gg2.A03(interfaceC16820sZ).C09(c120985dq).A06();
            interfaceC16820sZ.invoke();
            if (!z) {
                C37522Gfe c37522Gfe = this.A19;
                C37604Ggz c37604Ggz = this.A1D;
                String str2 = this.A1E.A00;
                AbstractC167007dF.A1F(c37522Gfe, 0, c37604Ggz);
                if (str2 != null && !C18U.A06(C06090Tz.A05, userSession, 36312170372334528L)) {
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(c37522Gfe, userSession), "instagram_clips_see_less_undo");
                    A0f.AAP("action_source", "clips_viewer_undo_button");
                    AbstractC25225BEi.A1O(A0f, c37522Gfe.getModuleName());
                    String id = c38321qM2.getId();
                    if (id != null) {
                        A0f.AAP("media_compound_key", id);
                        AbstractC25230BEn.A1C(A0f, A06);
                        AbstractC25225BEi.A1P(A0f, c37604Ggz.A01);
                        AbstractC37300Gc1.A0r(A0f, c37604Ggz.A00);
                        A0f.AAP("viewer_init_media_compound_key", str2);
                        AbstractC37302Gc3.A0y(A0f, c38321qM2);
                        AbstractC25233BEq.A17(A0f, "mezql_token", c38321qM2.A0C.getMezqlToken());
                        A0f.Cht();
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
            }
            if (!c120985dq.CdW()) {
                FragmentActivity fragmentActivity = this.A0R;
                AbstractC41705Idb.A03(this.A19, userSession, c38321qM2, C130175uN.A00(c38321qM2), this.A1D.A00, str, C130175uN.A00.A01(fragmentActivity, userSession, c38321qM2), A06, z, z2);
            }
        }
    }

    public final void A0O(List list) {
        C14360o3.A0B(list, 0);
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            C38321qM c38321qM = AbstractC37300Gc1.A0A(it).A02;
            if (c38321qM != null) {
                String A2u = c38321qM.A2u();
                String str = this.A1E.A00;
                if (str != null && C14360o3.A0K(A2u, C38801rC.A06(str)) && this.A0W.A08 == i) {
                    this.A00 = i;
                    return;
                }
            }
            i = i2;
        }
    }

    public final void A0Q(List list, java.util.Set set) {
        String str = this.A1O;
        if (str != null) {
            C62832tM c62832tM = this.A0k;
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : list) {
                if (!set.contains(obj)) {
                    A1E.add(obj);
                }
            }
            c62832tM.A08(str, A1E, false, true);
        }
    }

    @Override // X.InterfaceC43399JFo
    public final void Cx8(C120985dq c120985dq, Integer num, String str) {
        long j;
        EnumC120795dP enumC120795dP;
        Long A0j;
        C14360o3.A0B(num, 1);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            UserSession userSession = this.A0Y;
            C75113Zb c75113Zb = AbstractC37652Ghl.A01(c120985dq, userSession, C3YS.A00(userSession), null, null).A0E;
            if (c75113Zb != null) {
                C37522Gfe c37522Gfe = this.A19;
                C37604Ggz c37604Ggz = this.A1D;
                String A2u = c38321qM.A2u();
                String A0o = AbstractC25233BEq.A0o(c38321qM);
                String A1G = AbstractC25226BEj.A1G(c38321qM);
                int position = c75113Zb.getPosition();
                AbstractC25230BEn.A15(1, c37522Gfe, userSession);
                C14360o3.A0B(c37604Ggz, 2);
                InterfaceC02590Ai A0A = AbstractC37302Gc3.A0A(c37522Gfe, userSession);
                if (A0A.isSampled()) {
                    AbstractC25225BEi.A1O(A0A, c37522Gfe.getModuleName());
                    if (A2u != null && (A0j = AbstractC166997dE.A0j(A2u)) != null) {
                        j = A0j.longValue();
                    } else {
                        j = 0;
                    }
                    AbstractC37303Gc4.A0c(A0A, position, j);
                    AbstractC25225BEi.A1P(A0A, c37604Ggz.A01);
                    AbstractC37300Gc1.A0k(A0A, AbstractC25233BEq.A0n(A0o));
                    A0A.AAP("chaining_session_id", c37604Ggz.A00);
                    AbstractC37300Gc1.A0e(BQL.A0Y, A0A);
                    int intValue = num.intValue();
                    if (intValue != 4) {
                        if (intValue != 2) {
                            enumC120795dP = EnumC120795dP.A02;
                        } else {
                            enumC120795dP = EnumC120795dP.A0h;
                        }
                    } else {
                        enumC120795dP = EnumC120795dP.A0G;
                    }
                    AbstractC25225BEi.A1M(enumC120795dP, A0A);
                    A0A.AAP("chaining_session_id", c37604Ggz.A00);
                    A0A.AAP("ranking_info_token", A1G);
                    A0A.Cht();
                }
                C28221Yb A00 = C27S.A00();
                C59952od c59952od = this.A07;
                if (c59952od != null) {
                    C37555GgB c37555GgB = c59952od.A0F;
                    if (c37555GgB == null) {
                        C14360o3.A0F("clipsViewerAppreciationGiftController");
                        throw C00O.createAndThrow();
                    }
                    ((C47719L5g) A00.A00.getValue()).A00(this.A0R, c37555GgB, c37522Gfe, userSession, c38321qM, num, str);
                    return;
                }
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.InterfaceC62852tO
    public final void D5C(C120985dq c120985dq, Integer num, int i) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
    
        if (r8 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0079, code lost:
    
        r8 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
    
        if (r2 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:
    
        r0 = r7.A0I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0087, code lost:
    
        if (r0 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0089, code lost:
    
        r2 = r0.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008b, code lost:
    
        if (r2 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008d, code lost:
    
        if (r1 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008f, code lost:
    
        r0 = X.AbstractC166987dD.A1J(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0093, code lost:
    
        r4.A03.add(0, new X.C9CG(r9, r8, r2, r0));
        r4.A00++;
        r2 = r13.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a5, code lost:
    
        if (r2 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a7, code lost:
    
        r1 = r15.indexOf(r5) + 1;
        r0 = r2.A0N;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00af, code lost:
    
        if (r0 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b1, code lost:
    
        r0.A0F(r1, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x012e, code lost:
    
        r0 = "clipsViewerViewPager";
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b4, code lost:
    
        r0 = r13.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b6, code lost:
    
        if (r0 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b8, code lost:
    
        r0 = r0.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ba, code lost:
    
        if (r0 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00bc, code lost:
    
        r0.A0A.A0c(r5, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012b, code lost:
    
        r0 = "viewerAdapter";
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c1, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c6, code lost:
    
        r0 = X.C16930sl.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e1, code lost:
    
        throw X.AbstractC166987dD.A14("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x007d, code lost:
    
        r2 = r2.A0C.Ant();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0083, code lost:
    
        if (r2 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00c9, code lost:
    
        if (r2 != null) goto L30;
     */
    @Override // X.InterfaceC62852tO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D5D(X.InterfaceC111084zP r14, java.util.List r15, boolean r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37540Gfw.D5D(X.4zP, java.util.List, boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r9.BUt() != true) goto L8;
     */
    @Override // X.InterfaceC62852tO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D5I(X.InterfaceC111084zP r9, java.util.List r10, boolean r11, boolean r12) {
        /*
            r8 = this;
            r5 = 0
            r2 = r10
            X.C14360o3.A0B(r10, r5)
            X.2od r1 = r8.A07
            if (r1 == 0) goto L27
            r3 = 1
            if (r9 == 0) goto L13
            boolean r0 = r9.BUt()
            r6 = 1
            if (r0 == r3) goto L14
        L13:
            r6 = 0
        L14:
            X.Gg2 r1 = r1.A0C
            if (r1 != 0) goto L22
            java.lang.String r0 = "viewerAdapter"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L22:
            r4 = r3
            r7 = r3
            r1.A0E(r2, r3, r4, r5, r6, r7)
        L27:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37540Gfw.D5I(X.4zP, java.util.List, boolean, boolean):void");
    }

    private final String A00() {
        UserSession userSession = this.A0Y;
        if (!C1LE.A06(userSession) || C1LE.A02(userSession).contains(this.A0W.A0J.name()) || !this.A0t.A00) {
            return null;
        }
        return "one_reel_chaining_cache_key";
    }

    private final void A01() {
        UserSession userSession = this.A0Y;
        if (C18U.A06(C06090Tz.A05, userSession, 36326674475792415L)) {
            Context context = this.A0Q;
            AbstractC167017dG.A1N(userSession, context);
            ((C3SD) ((C54713OEq) userSession.A01(C54713OEq.class, new C57254Pbc(20, context, userSession))).A03.getValue()).E59(null, OdinContext.A05);
        }
    }

    public static final void A02(C120985dq c120985dq, C37540Gfw c37540Gfw) {
        InterfaceC16820sZ interfaceC16820sZ = c37540Gfw.A20;
        C37546Gg2.A03(interfaceC16820sZ).A0U(c120985dq, true);
        java.util.Set singleton = Collections.singleton(c120985dq);
        C14360o3.A07(singleton);
        C37546Gg2 c37546Gg2 = (C37546Gg2) interfaceC16820sZ.invoke();
        List A1Q = AbstractC16960so.A1Q(EnumC129395t1.A0G, EnumC129395t1.A02);
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = A1Q.iterator();
        while (it.hasNext()) {
            AnonymousClass016.A16(c37546Gg2.A0A.A0L((EnumC129395t1) it.next()), A1E);
        }
        c37540Gfw.A0Q(A1E, singleton);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        if (X.AbstractC167007dF.A1Z(r6.A1u) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004f, code lost:
    
        if (r8 <= 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r8 <= 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.C37840Gku r5, X.C37540Gfw r6, X.AbstractC43757JWv r7, int r8, boolean r9) {
        /*
            com.instagram.common.session.UserSession r0 = r6.A0Y
            X.JWs r0 = X.AbstractC37837Gkr.A00(r0)
            X.C14360o3.A07(r0)
            X.9CG r1 = r0.A01(r8)
            X.0do r0 = r6.A1p
            boolean r0 = X.AbstractC167007dF.A1Z(r0)
            r2 = 1
            if (r0 == 0) goto L19
            r4 = 1
            if (r8 > 0) goto L1a
        L19:
            r4 = 0
        L1a:
            if (r1 != 0) goto L35
            X.0do r0 = r6.A1m
            boolean r0 = X.AbstractC167007dF.A1Z(r0)
            if (r0 == 0) goto L35
            X.0do r0 = r6.A1t
            boolean r0 = X.AbstractC167007dF.A1Z(r0)
            if (r0 == 0) goto L35
            X.0do r0 = r6.A1u
            boolean r0 = X.AbstractC167007dF.A1Z(r0)
            r3 = 1
            if (r0 == 0) goto L36
        L35:
            r3 = 0
        L36:
            X.0do r0 = r6.A1m
            boolean r0 = X.AbstractC167007dF.A1Z(r0)
            if (r0 == 0) goto L46
            X.0do r0 = r6.A1u
            boolean r0 = X.AbstractC167007dF.A1Z(r0)
            if (r0 != 0) goto L51
        L46:
            X.0do r0 = r6.A1r
            boolean r0 = X.AbstractC167007dF.A1Z(r0)
            if (r0 == 0) goto L51
            r1 = 1
            if (r8 > 0) goto L52
        L51:
            r1 = 0
        L52:
            if (r9 != 0) goto L5e
            com.instagram.clips.intf.ClipsViewerConfig r0 = r6.A0W
            com.instagram.clips.intf.ClipsViewerDirectData r0 = r0.A0I
            if (r0 == 0) goto L7c
            boolean r0 = r0.A03
            if (r0 != r2) goto L7c
        L5e:
            r0 = 0
        L5f:
            if (r5 == 0) goto L7b
            if (r0 == 0) goto L77
            if (r3 != 0) goto L69
            if (r4 != 0) goto L69
            if (r1 == 0) goto L77
        L69:
            if (r7 == 0) goto L78
            boolean r0 = r7.A0I()
            if (r0 == r2) goto L77
            boolean r0 = r7.A0H()
            if (r0 != r2) goto L78
        L77:
            r2 = 0
        L78:
            r5.A03(r2)
        L7b:
            return
        L7c:
            r0 = 1
            goto L5f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37540Gfw.A03(X.Gku, X.Gfw, X.JWv, int, boolean):void");
    }

    public static final void A04(C37540Gfw c37540Gfw) {
        if (c37540Gfw.A22) {
            C37866GlL c37866GlL = c37540Gfw.A16;
            if (c37866GlL != null) {
                c37866GlL.A0C(C43067J2h.A00);
                return;
            }
            return;
        }
        AbstractC153666vb.A00(c37540Gfw.A1A, null, null, C16930sl.A00, false, false, false, false);
    }

    public static final void A05(C37540Gfw c37540Gfw, List list, boolean z, boolean z2) {
        C37866GlL c37866GlL;
        InterfaceC31098Dlg mw6;
        if (c37540Gfw.A22) {
            if (z) {
                c37866GlL = c37540Gfw.A16;
                if (c37866GlL != null) {
                    mw6 = C43066J2g.A00;
                } else {
                    return;
                }
            } else {
                c37540Gfw.A01();
                c37866GlL = c37540Gfw.A16;
                if (c37866GlL == null) {
                    return;
                }
                ClipsViewerSource clipsViewerSource = c37540Gfw.A0W.A0J;
                if (clipsViewerSource == ClipsViewerSource.A1n) {
                    mw6 = C43065J2f.A00;
                } else {
                    boolean A06 = c37540Gfw.A06(z2);
                    String A00 = c37540Gfw.A00();
                    long millis = TimeUnit.MINUTES.toMillis(C1LE.A01(c37540Gfw.A0Y));
                    boolean A1X = AbstractC167007dF.A1X(clipsViewerSource, ClipsViewerSource.A0N);
                    mw6 = new MW6(Boolean.valueOf(A1X), Long.valueOf(millis), A00, list, A06);
                }
            }
            c37866GlL.A0C(mw6);
            return;
        }
        if (z) {
            AbstractC153666vb.A00(c37540Gfw.A1A, null, null, C16930sl.A00, false, true, true, false);
            return;
        }
        c37540Gfw.A01();
        C37586Ggh c37586Ggh = c37540Gfw.A1A;
        boolean A062 = c37540Gfw.A06(z2);
        c37586Ggh.A04(Long.valueOf(TimeUnit.MINUTES.toMillis(C1LE.A01(c37540Gfw.A0Y))), c37540Gfw.A00(), list, A062);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x002b, code lost:
    
        if (r0.A05 == true) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
    
        if (r1.A03 == X.C05F.A0C) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A0B() {
        /*
            r6 = this;
            X.Ggh r0 = r6.A1A
            X.6xU r0 = r0.A06
            X.6xV r1 = r0.A03
            java.lang.Integer r0 = r1.A02
            if (r0 == 0) goto L11
            int r2 = r0.intValue()
            if (r2 <= 0) goto L11
            return r2
        L11:
            X.IG3 r5 = r6.A24
            X.GlL r2 = r6.A16
            if (r2 == 0) goto L79
            boolean r0 = r2.A0I
            if (r0 == 0) goto L24
            X.GlY r0 = r2.A00
            r1 = 1
            if (r0 == 0) goto L84
            boolean r0 = r0.A04
            if (r0 != r1) goto L84
        L24:
            X.GlY r0 = r2.A00
            r4 = 1
            if (r0 == 0) goto L84
            boolean r0 = r0.A05
            if (r0 != r4) goto L84
        L2d:
            boolean r0 = r5.A01
            if (r0 != 0) goto L4b
            com.instagram.common.session.UserSession r3 = r5.A00
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36316680087605864(0x8105d4000b1268, double:3.030152950710425E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L4b
            r0 = 36598155064577161(0x8205d4000f0c89, double:3.2081588595558317E-306)
        L45:
            long r0 = X.C18U.A01(r2, r3, r0)
            int r2 = (int) r0
            return r2
        L4b:
            com.instagram.common.session.UserSession r3 = r5.A00
            X.0Tz r2 = X.C06090Tz.A05
            if (r4 == 0) goto L62
            r0 = 36316680087278182(0x8105d400061266, double:3.030152950503198E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L73
            r0 = 36598155064183942(0x8205d400090c86, double:3.2081588593071584E-306)
            goto L45
        L62:
            r0 = 36316680087409255(0x8105d400081267, double:3.030152950586089E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L73
            r0 = 36598155064052869(0x8205d400070c85, double:3.208158859224267E-306)
            goto L45
        L73:
            r0 = 36598155063856260(0x8205d400040c84, double:3.208158859099931E-306)
            goto L45
        L79:
            java.lang.String r0 = r1.A07
            if (r0 != 0) goto L84
            java.lang.Integer r1 = r1.A03
            java.lang.Integer r0 = X.C05F.A0C
            r4 = 1
            if (r1 != r0) goto L2d
        L84:
            r4 = 0
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37540Gfw.A0B():int");
    }

    public final C37851Gl5 A0C() {
        ClipsViewerConfig clipsViewerConfig = this.A0W;
        String str = clipsViewerConfig.A1G;
        Boolean bool = clipsViewerConfig.A0V;
        C22P c22p = clipsViewerConfig.A0A;
        SearchContext searchContext = clipsViewerConfig.A0S;
        C37546Gg2 c37546Gg2 = (C37546Gg2) this.A20.invoke();
        C37522Gfe c37522Gfe = this.A19;
        UserSession userSession = this.A0Y;
        C37604Ggz c37604Ggz = this.A1D;
        IG5 ig5 = this.A1E;
        String str2 = this.A1M;
        String str3 = this.A1N;
        ClipsViewerSource clipsViewerSource = clipsViewerConfig.A0J;
        C37851Gl5 c37851Gl5 = new C37851Gl5(this.A0R, c22p, clipsViewerSource, c37522Gfe, userSession, searchContext, c37604Ggz, c37546Gg2, ig5, bool, clipsViewerConfig.A0Y, str, str2, str3, this.A0P, AbstractC167007dF.A1Z(this.A1q));
        this.A0z.A00(c37851Gl5);
        this.A0B = c37851Gl5;
        return c37851Gl5;
    }

    public final void A0D() {
        C37866GlL c37866GlL;
        InterfaceC31098Dlg interfaceC31098Dlg;
        C37755GjU c37755GjU = this.A0p;
        c37755GjU.A03.A02();
        ClipsViewerConfig clipsViewerConfig = c37755GjU.A01;
        if (clipsViewerConfig.A1q && !clipsViewerConfig.A1r) {
            ClipsViewerSource clipsViewerSource = clipsViewerConfig.A0J;
            if (clipsViewerSource == ClipsViewerSource.A0s || clipsViewerSource == ClipsViewerSource.A0t) {
                if (C18U.A06(C06090Tz.A05, c37755GjU.A02, 36318604232366420L)) {
                    if (c37755GjU.A06) {
                        c37866GlL = c37755GjU.A04;
                        if (c37866GlL != null) {
                            interfaceC31098Dlg = C43067J2h.A00;
                            c37866GlL.A0C(interfaceC31098Dlg);
                            return;
                        }
                        return;
                    }
                    AbstractC153666vb.A00(c37755GjU.A05, null, null, C16930sl.A00, false, false, false, false);
                    return;
                }
            }
            if (c37755GjU.A06) {
                c37866GlL = c37755GjU.A04;
                if (c37866GlL == null) {
                    return;
                }
                interfaceC31098Dlg = C43068J2i.A00;
                c37866GlL.A0C(interfaceC31098Dlg);
                return;
            }
            c37755GjU.A05.A01();
        }
    }

    public final void A0E() {
        ClipsReplyBarData clipsReplyBarData = this.A0W.A0L;
        UserSession userSession = this.A0Y;
        C43756JWu c43756JWu = new C43756JWu(this.A0R, clipsReplyBarData, this.A19, userSession);
        this.A0z.A00(c43756JWu);
        this.A0D = c43756JWu;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0F() {
        /*
            r6 = this;
            X.2od r3 = r6.A07
            if (r3 == 0) goto L4c
            X.Gg2 r1 = r3.A0C
            java.lang.String r5 = "viewerAdapter"
            r0 = 0
            if (r1 == 0) goto L61
            r1.A0B(r0)
            X.GhJ r0 = r3.A0O()
            int r4 = r0.A01()
            com.instagram.clips.intf.ClipsViewerConfig r0 = X.C59952od.A00(r3)
            com.instagram.clips.intf.ClipsViewerSource r1 = r0.A0J
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.A1o
            java.lang.String r2 = "clipsViewerViewPager"
            if (r1 == r0) goto L2c
            com.instagram.clips.intf.ClipsViewerConfig r0 = X.C59952od.A00(r3)
            com.instagram.clips.intf.ClipsViewerSource r1 = r0.A0J
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.A1m
            if (r1 != r0) goto L4d
        L2c:
            X.Gg2 r0 = r3.A0C
            if (r0 == 0) goto L61
            int r0 = X.C37546Gg2.A00(r0)
            if (r0 <= 0) goto L4d
            X.Gg2 r1 = r3.A0C
            if (r1 == 0) goto L61
            int r0 = X.C37546Gg2.A00(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0C(r0)
        L45:
            X.GgC r0 = r3.A0N
            if (r0 == 0) goto L65
            r0.A0B()
        L4c:
            return
        L4d:
            X.Gg2 r1 = r3.A0C
            if (r1 == 0) goto L61
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r1.A0C(r0)
            X.GgC r1 = r3.A0N
            if (r1 == 0) goto L65
            r0 = 1
            r1.A0F(r4, r0)
            goto L45
        L61:
            X.C14360o3.A0F(r5)
            goto L68
        L65:
            X.C14360o3.A0F(r2)
        L68:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37540Gfw.A0F():void");
    }

    public final void A0G() {
        C37624GhJ c37624GhJ;
        C120985dq A02;
        C120985dq A022;
        if (C18U.A06(C06090Tz.A05, this.A0Y, 36316920605250264L) && (A02 = (c37624GhJ = this.A1L).A02()) != null && A02.CdW() && (A022 = c37624GhJ.A02()) != null && A022.A06().A06()) {
            C11T.A03(new RunnableC43104J3t(this));
        } else {
            this.A1K.A0H();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x013a, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r23.A0Y, 36323908517113528L) != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d2, code lost:
    
        if (r11.isEmpty() != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0185, code lost:
    
        if (r10 == null) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0I(X.C120985dq r24) {
        /*
            Method dump skipped, instructions count: 661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37540Gfw.A0I(X.5dq):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x02a6, code lost:
    
        if (r0 == null) goto L159;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0N(java.util.List r15) {
        /*
            Method dump skipped, instructions count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37540Gfw.A0N(java.util.List):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        if (X.AbstractC37301Gc2.A1U(r6, r7) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0093, code lost:
    
        if (r12.BUt() != true) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e4, code lost:
    
        if (X.AbstractC37301Gc2.A1U(r11, r13) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f3, code lost:
    
        if (r3.A0E == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f7, code lost:
    
        if (r21.A00 != 0) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0R(X.InterfaceC16820sZ r22) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37540Gfw.A0R(X.0sZ):void");
    }

    public final void A0S(boolean z) {
        if (this.A0E != null && z) {
            C37723Giy c37723Giy = C37723Giy.A00;
            ClipsViewerConfig clipsViewerConfig = this.A0W;
            String str = clipsViewerConfig.A1I;
            UserSession userSession = this.A0Y;
            if (c37723Giy.A00(clipsViewerConfig.A0J, userSession, str, this.A0t.A0C()) && !C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 36317835433481849L)) {
                C37726Gj1 c37726Gj1 = this.A0E;
                if (c37726Gj1 != null) {
                    c37726Gj1.A0B(null, new J8W(this, 21), false);
                    return;
                }
                return;
            }
        }
        A05(this, C16930sl.A00, false, false);
    }

    public final boolean A0T() {
        return AbstractC167007dF.A1Z(this.A1m);
    }

    public final boolean A0U() {
        boolean z;
        UserSession userSession = this.A0Y;
        ClipsViewerConfig clipsViewerConfig = this.A0W;
        ClipsViewerSource clipsViewerSource = clipsViewerConfig.A0J;
        boolean z2 = true;
        boolean A1W = AbstractC167007dF.A1W(clipsViewerConfig.A0L);
        ClipsViewerDirectData clipsViewerDirectData = clipsViewerConfig.A0I;
        if (clipsViewerDirectData != null) {
            z = clipsViewerDirectData.A09;
        } else {
            z = false;
        }
        if (clipsViewerConfig.A0Y == null) {
            z2 = false;
        }
        return AbstractC37541Gfx.A01(clipsViewerSource, userSession, A1W, z, z2);
    }

    public final boolean A0V() {
        boolean z;
        if (!this.A0N) {
            if (AbstractC167007dF.A1Z(this.A1m) || AbstractC167007dF.A1Z(this.A1q)) {
                UserSession userSession = this.A0Y;
                ClipsViewerConfig clipsViewerConfig = this.A0W;
                ClipsViewerSource clipsViewerSource = clipsViewerConfig.A0J;
                boolean A1W = AbstractC167007dF.A1W(clipsViewerConfig.A0L);
                ClipsViewerDirectData clipsViewerDirectData = clipsViewerConfig.A0I;
                if (clipsViewerDirectData != null) {
                    z = clipsViewerDirectData.A09;
                } else {
                    z = false;
                }
                if (AbstractC37541Gfx.A00(clipsViewerSource, userSession, A1W, z)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC60222p5
    public final String BD9() {
        EnumC129395t1 enumC129395t1;
        AbstractC37552Gg8 A03 = C37546Gg2.A03(this.A20);
        if (A03.A0B() > 0) {
            enumC129395t1 = A03.A0F(0).A01;
        } else {
            enumC129395t1 = null;
        }
        return AbstractC37719Giu.A00(enumC129395t1);
    }

    @Override // X.InterfaceC60232p6
    public final boolean CXH() {
        return AbstractC167007dF.A1X(this.A18.A00, C05F.A01);
    }

    @Override // X.InterfaceC25200BCy
    public final void Dci() {
        this.A1K.A0W("resume", false);
        C56352iT.A0t.A03(this.A0R).A0P.setVisibility(0);
    }

    @Override // X.InterfaceC25200BCy
    public final void Dcj() {
        this.A1K.A0S(null, "dialog", false, true);
        C56352iT.A0t.A03(this.A0R).A0P.setVisibility(8);
    }

    @Override // X.C31R
    public final void F7s(boolean z) {
        if (z) {
            this.A1K.A0W("resume", false);
        } else {
            this.A1K.A0S(null, "debug_pause", true, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (r0.A5H() != true) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0041, code lost:
    
        if (r2 != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0K(X.C120985dq r12, X.C147066ji r13) {
        /*
            r11 = this;
            A02(r12, r11)
            r3 = 0
            X.1qM r0 = r12.A02
            if (r0 == 0) goto L7c
            java.lang.String r10 = r0.A2u()
        Lc:
            java.lang.String r1 = "Required value was null."
            if (r10 == 0) goto L83
            X.1qM r0 = r12.A02
            if (r0 == 0) goto L7e
            X.1tc r8 = r0.BRp()
            com.instagram.clips.intf.ClipsViewerConfig r0 = r11.A0W
            X.5Gh r1 = r0.A0T
            if (r1 == 0) goto L68
            java.lang.Integer r4 = X.C05F.A01
            com.instagram.common.session.UserSession r2 = r11.A0Y
            X.Gfe r0 = r11.A19
            X.IT8.A00(r0, r2, r1, r4, r10)
        L27:
            r4 = 1
            X.1qM r0 = r12.A02
            if (r0 == 0) goto L33
            boolean r0 = r0.A5H()
            r2 = 1
            if (r0 == r4) goto L34
        L33:
            r2 = 0
        L34:
            X.0sZ r0 = r11.A20
            int r0 = X.C37546Gg2.A01(r0)
            if (r0 != 0) goto L40
            androidx.fragment.app.FragmentActivity r0 = r11.A0R
            if (r0 != 0) goto L43
        L40:
            r4 = 0
            if (r2 == 0) goto L60
        L43:
            r4 = 1
            if (r1 == 0) goto L52
            android.content.Intent r2 = X.AbstractC37304Gc5.A03(r12)
            androidx.fragment.app.FragmentActivity r1 = r11.A0R
            if (r1 == 0) goto L52
            r0 = -1
            r1.setResult(r0, r2)
        L52:
            if (r13 == 0) goto L60
            boolean r0 = r13.A01()
            if (r0 != 0) goto L60
            androidx.fragment.app.FragmentActivity r0 = r11.A0R
            r0.onBackPressed()
        L5f:
            return
        L60:
            r11.A0K = r4
            if (r13 == 0) goto L5f
            r13.A00(r3, r4)
            return
        L68:
            X.1tc r0 = X.EnumC40111tc.A0a
            if (r8 != r0) goto L27
            X.1o5 r4 = X.C37091o7.A00()
            com.instagram.common.session.UserSession r7 = r11.A0Y
            androidx.fragment.app.FragmentActivity r5 = r11.A0R
            X.Gfe r6 = r11.A19
            X.Hdz r9 = X.EnumC39589Hdz.A0H
            r4.API(r5, r6, r7, r8, r9, r10)
            goto L27
        L7c:
            r10 = r3
            goto Lc
        L7e:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r1)
            throw r0
        L83:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37540Gfw.A0K(X.5dq, X.6ji):void");
    }

    public final void A0P(List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            C38321qM c38321qM = ((C120985dq) it.next()).A02;
            if (c38321qM != null) {
                String A2u = c38321qM.A2u();
                String str = this.A1E.A00;
                if (str != null && C14360o3.A0K(A2u, C38801rC.A06(str))) {
                    this.A00 = i;
                    return;
                }
            }
            i = i2;
        }
    }

    @Override // X.AbstractC37623GhI, X.InterfaceC60602pj
    public final void onDestroyView() {
        super.onDestroyView();
        C37675GiC c37675GiC = this.A06;
        if (c37675GiC != null) {
            c37675GiC.A00 = null;
            c37675GiC.A02 = null;
            C37607Gh2 c37607Gh2 = c37675GiC.A0Y;
            InterfaceC50122Sb interfaceC50122Sb = c37607Gh2.A02;
            if (interfaceC50122Sb != null) {
                interfaceC50122Sb.AGH(null);
            }
            c37607Gh2.A02 = null;
            InterfaceC50122Sb interfaceC50122Sb2 = c37607Gh2.A00;
            if (interfaceC50122Sb2 != null) {
                interfaceC50122Sb2.AGH(null);
            }
            c37607Gh2.A00 = null;
            InterfaceC50122Sb interfaceC50122Sb3 = c37607Gh2.A03;
            if (interfaceC50122Sb3 != null) {
                interfaceC50122Sb3.AGH(null);
            }
            c37607Gh2.A03 = null;
            InterfaceC50122Sb interfaceC50122Sb4 = c37607Gh2.A01;
            if (interfaceC50122Sb4 != null) {
                interfaceC50122Sb4.AGH(null);
            }
            c37607Gh2.A01 = null;
            C38X c38x = c37675GiC.A0F;
            C51622Yk c51622Yk = c38x.A00;
            if (c51622Yk != null) {
                c51622Yk.A03 = null;
                c51622Yk.A03(false);
                c38x.A00 = null;
            }
        }
    }

    public C37540Gfw(Context context, FragmentActivity fragmentActivity, InterfaceC116925Qy interfaceC116925Qy, C37531Gfn c37531Gfn, C153696ve c153696ve, C25514BQc c25514BQc, ClipsViewerConfig clipsViewerConfig, C5R5 c5r5, UserSession userSession, C57112jm c57112jm, C41098IHp c41098IHp, C7KY c7ky, InterfaceC675232r interfaceC675232r, MVO mvo, C61582rL c61582rL, C5GV c5gv, C64842wi c64842wi, C64742wY c64742wY, C3HZ c3hz, C37502GfK c37502GfK, C43754JWs c43754JWs, C62832tM c62832tM, C37756GjV c37756GjV, ILW ilw, BKU bku, C37755GjU c37755GjU, AbstractC39459Hbl abstractC39459Hbl, C38219GrO c38219GrO, C29561D0n c29561D0n, C37705Gig c37705Gig, C25371BKo c25371BKo, C37625GhK c37625GhK, C24186Ao9 c24186Ao9, BKZ bkz, C37581Ggc c37581Ggc, C39465Hbr c39465Hbr, C37661Ghu c37661Ghu, C41113IIe c41113IIe, INA ina, C37716Gir c37716Gir, C37711Gim c37711Gim, C37866GlL c37866GlL, C26914BuH c26914BuH, C37662Ghv c37662Ghv, C37522Gfe c37522Gfe, IG3 ig3, C37586Ggh c37586Ggh, C37659Ghs c37659Ghs, C37660Ght c37660Ght, C37604Ggz c37604Ggz, IG5 ig5, C37657Ghq c37657Ghq, C37880Gla c37880Gla, C37671Gi4 c37671Gi4, IKR ikr, C37663Ghw c37663Ghw, C37560GgG c37560GgG, C37624GhJ c37624GhJ, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16820sZ interfaceC16820sZ5, InterfaceC16820sZ interfaceC16820sZ6, boolean z) {
        C14360o3.A0B(c37604Ggz, 10);
        C14360o3.A0B(c37671Gi4, 11);
        C14360o3.A0B(c5r5, 27);
        C14360o3.A0B(c3hz, 31);
        C14360o3.A0B(mvo, 43);
        C14360o3.A0B(c64842wi, 62);
        this.A0Q = context;
        this.A0R = fragmentActivity;
        this.A0Y = userSession;
        this.A0W = clipsViewerConfig;
        this.A0j = c43754JWs;
        this.A1y = interfaceC16820sZ;
        this.A1x = interfaceC16820sZ2;
        this.A1z = interfaceC16820sZ3;
        this.A1w = interfaceC16820sZ4;
        this.A1D = c37604Ggz;
        this.A1H = c37671Gi4;
        this.A1E = ig5;
        this.A0T = c37531Gfn;
        this.A19 = c37522Gfe;
        this.A0S = interfaceC116925Qy;
        this.A0Z = c57112jm;
        this.A1L = c37624GhJ;
        this.A0w = c24186Ao9;
        this.A1B = c37659Ghs;
        this.A0d = c61582rL;
        this.A0k = c62832tM;
        this.A0e = c5gv;
        this.A0U = c153696ve;
        this.A0V = c25514BQc;
        this.A0g = c64742wY;
        this.A0q = abstractC39459Hbl;
        this.A0X = c5r5;
        this.A1A = c37586Ggh;
        this.A0z = c37581Ggc;
        this.A23 = c41098IHp;
        this.A0h = c3hz;
        this.A0b = interfaceC675232r;
        this.A1C = c37660Ght;
        this.A13 = ina;
        this.A0o = bku;
        this.A0x = bkz;
        this.A0i = c37502GfK;
        this.A20 = interfaceC16820sZ5;
        this.A1v = interfaceC16820sZ6;
        this.A18 = c37662Ghv;
        this.A0v = c37625GhK;
        this.A0s = c29561D0n;
        this.A0c = mvo;
        this.A1K = c37560GgG;
        this.A10 = c39465Hbr;
        this.A1J = c37663Ghw;
        this.A22 = z;
        this.A16 = c37866GlL;
        this.A1G = c37880Gla;
        this.A0r = c38219GrO;
        this.A0p = c37755GjU;
        this.A24 = ig3;
        this.A0l = c37756GjV;
        this.A0a = c7ky;
        this.A14 = c37716Gir;
        this.A15 = c37711Gim;
        this.A11 = c37661Ghu;
        this.A0n = ilw;
        this.A12 = c41113IIe;
        this.A0u = c25371BKo;
        this.A0t = c37705Gig;
        this.A0f = c64842wi;
        this.A17 = c26914BuH;
        this.A1I = ikr;
        this.A1F = c37657Ghq;
        this.A1k = J8W.A00(this, 22);
        this.A1l = J8W.A00(this, 23);
        this.A1P = AbstractC166987dD.A1E();
        this.A1b = J8W.A00(this, 11);
        this.A1m = J8W.A00(this, 24);
        this.A1q = J8W.A00(this, 28);
        this.A1r = J8W.A00(this, 29);
        this.A1s = J8W.A00(this, 30);
        this.A1u = J8W.A00(this, 32);
        this.A1p = J8W.A00(this, 27);
        this.A1j = J8W.A00(this, 20);
        this.A1t = J8W.A00(this, 31);
        this.A1n = J8W.A00(this, 25);
        this.A1o = J8W.A00(this, 26);
        this.A1M = clipsViewerConfig.A17;
        this.A1O = clipsViewerConfig.A1K;
        this.A21 = A25.contains(clipsViewerConfig.A0J);
        this.A1N = clipsViewerConfig.A18;
        this.A1Q = J8W.A00(this, 0);
        this.A1a = C1XM.A00(new J8W(this, 10));
        this.A1f = J8W.A00(this, 15);
        this.A1e = J8W.A00(this, 14);
        this.A1g = J8W.A00(this, 16);
        this.A1R = J8W.A00(this, 1);
        this.A1S = J8W.A00(this, 2);
        this.A1X = J8W.A00(this, 7);
        this.A1U = J8W.A00(this, 4);
        this.A1Y = J8W.A00(this, 8);
        this.A1Z = J8W.A00(this, 9);
        this.A1T = J8W.A00(this, 3);
        this.A1V = J8W.A00(this, 5);
        this.A1W = J8W.A00(this, 6);
        this.A1d = J8W.A00(this, 13);
        this.A1h = J8W.A00(this, 17);
        this.A1i = J8W.A00(this, 18);
        this.A0m = new IE0(this);
        C42283Io7 c42283Io7 = new C42283Io7(fragmentActivity, userSession, c37522Gfe.getModuleName(), interfaceC16820sZ6, interfaceC16820sZ5);
        this.A0y = c42283Io7;
        this.A1c = J8W.A00(this, 12);
        if (c37880Gla != null) {
            c37880Gla.A02.add(new C41003IDy(this));
            c37880Gla.A00.add(this);
        }
        if (C1LE.A06(userSession)) {
            c37586Ggh.A03(c37705Gig.A04);
        }
        C218914p.A03(EnumC220415e.A04, c42283Io7);
        if (c26914BuH != null) {
            c26914BuH.A00 = new C41004IDz(this);
        }
    }
}
