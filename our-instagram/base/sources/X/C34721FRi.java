package X;

import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* renamed from: X.FRi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34721FRi {
    public long A00;
    public C2EC A01;
    public EnumC50680MYy A02;
    public InterfaceC83713oG A03;
    public Integer A04;
    public Long A05;
    public String A06;
    public String A07;
    public String A08;
    public ScheduledFuture A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final C18920wW A0E;
    public final UserSession A0F;
    public final ScheduledExecutorService A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;

    public C34721FRi(C18920wW c18920wW, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A0F = userSession;
        this.A0E = c18920wW;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A0I = C18U.A06(c06090Tz, userSession, 36313458861541399L);
        this.A0K = C18U.A06(c06090Tz, userSession, 36320382349746599L);
        this.A0H = C18U.A06(c06090Tz, userSession, 36314790302059320L);
        this.A0J = C18U.A06(c06090Tz, userSession, 36323461840252183L);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = C14250np.A00().A00;
        C14360o3.A07(scheduledThreadPoolExecutor);
        this.A0G = scheduledThreadPoolExecutor;
    }

    public final void A00() {
        ScheduledFuture scheduledFuture = this.A09;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.A07 = null;
        this.A09 = null;
        this.A06 = null;
        this.A01 = null;
        this.A04 = null;
        this.A03 = null;
        this.A0B = false;
        this.A0D = false;
        this.A05 = null;
        this.A0A = false;
        this.A02 = null;
        this.A08 = null;
    }

    public final void A01(int i) {
        String str;
        EnumC33495ErU enumC33495ErU;
        if (this.A0K && (str = this.A07) != null) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A0E, "universal_search_error_state");
            if (A0f.isSampled()) {
                AbstractC31173DnH.A1L(A0f, str);
                A0f.AAP("query_string", this.A06);
                if (i != 1) {
                    if (i != 2) {
                        if (i != 4) {
                            if (i != 5) {
                                if (i != 6) {
                                    enumC33495ErU = EnumC33495ErU.GENERAL_ERROR;
                                } else {
                                    enumC33495ErU = EnumC33495ErU.NEEDS_MORE_INFO_WITH_SNIPPET;
                                }
                            } else {
                                enumC33495ErU = EnumC33495ErU.REFUSAL_WITH_SNIPPET;
                            }
                        } else {
                            enumC33495ErU = EnumC33495ErU.ERROR_WITH_SNIPPET;
                        }
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v50, types: [long] */
    public final void A02(EnumC33509Eri enumC33509Eri, Long l, String str, boolean z) {
        EnumC92794Ds enumC92794Ds;
        List list;
        long j;
        EnumC33474Er9 enumC33474Er9;
        EnumC92794Ds enumC92794Ds2;
        C2EC c2ec;
        Boolean bool;
        if (!this.A0B) {
            String str2 = this.A07;
            if (str2 != null) {
                this.A0B = true;
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A0E, "universal_search_end");
                if (A0f.isSampled()) {
                    AbstractC31173DnH.A1L(A0f, str2);
                    A0f.A8R(enumC33509Eri, "end_action");
                    if (z) {
                        A0f.AAk("data_sources", AbstractC166987dD.A1J(EnumC33482ErH.SERVER_ENTITIES_NAMED_DSQ1));
                        A0f.AAP("bot_response_id", str);
                    }
                    Integer num = this.A04;
                    boolean z2 = false;
                    boolean A1X = AbstractC167007dF.A1X(num, C05F.A0D);
                    String str3 = null;
                    if (num != null) {
                        A0f.A8R(AbstractC35248Fgh.A01(num), "result_type");
                    }
                    if (this.A0I || !this.A0D) {
                        InterfaceC83713oG interfaceC83713oG = this.A03;
                        if (interfaceC83713oG != null) {
                            enumC92794Ds = AbstractC140946Yw.A00(interfaceC83713oG);
                        } else {
                            enumC92794Ds = null;
                        }
                        A0f.A8R(AbstractC35248Fgh.A02(enumC92794Ds), TraceFieldType.TransportType);
                    }
                    C2EC c2ec2 = this.A01;
                    if (c2ec2 != null) {
                        list = c2ec2.BSD();
                    } else if (this.A02 != null) {
                        list = AbstractC166987dD.A1J(C18U.A04(C06090Tz.A05, this.A0F, 36882318691992000L));
                    } else {
                        list = C16930sl.A00;
                    }
                    String str4 = this.A0F.userId;
                    C14360o3.A0B(str4, 1);
                    ImmutableList.Builder builder = new ImmutableList.Builder();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        long A1B = AbstractC166987dD.A1B(it);
                        C14360o3.A0B(A1B, 0);
                        try {
                            A1B = Long.parseLong(A1B);
                        } catch (NumberFormatException e) {
                            C0K8.A0N("DirectInboxSearchUnifiedLoggingUtil", "Unable to convert item's id[%s] to long", e, A1B);
                            A1B = 0;
                        }
                        builder.add((Object) Long.valueOf(A1B));
                    }
                    builder.add((Object) AbstractC25228BEl.A13(str4));
                    A0f.AAk("recipient_ids", AbstractC31172DnG.A0K(builder));
                    if (!A1X) {
                        C2EC c2ec3 = this.A01;
                        if (c2ec3 != null) {
                            bool = Boolean.valueOf(c2ec3.CX1());
                        } else {
                            bool = null;
                        }
                        A0f.A7v("is_interop_thread", bool);
                        A0f.A7v("with_story_ring", Boolean.valueOf(this.A0A));
                    }
                    String str5 = this.A06;
                    if (str5 != null) {
                        Pattern pattern = AbstractC13670mt.A01;
                        j = str5.length();
                    } else {
                        j = 0;
                    }
                    AbstractC31175DnJ.A13(A0f, j);
                    Long l2 = this.A05;
                    if (l2 != null) {
                        l = l2;
                    }
                    A0f.A9K("ui_section_rank_index", l);
                    if (this.A0J) {
                        InterfaceC83713oG interfaceC83713oG2 = this.A03;
                        if (interfaceC83713oG2 != null) {
                            enumC92794Ds2 = AbstractC140946Yw.A00(interfaceC83713oG2);
                        } else {
                            enumC92794Ds2 = null;
                        }
                        if (enumC92794Ds2 == EnumC92794Ds.A05 && (c2ec = this.A01) != null) {
                            str3 = c2ec.C7I();
                        }
                        AbstractC31171DnF.A1F(A0f, str3);
                    }
                    if (this.A0H) {
                        if (!A1X && (this.A0C || this.A0D)) {
                            z2 = true;
                        }
                        AbstractC31175DnJ.A19(A0f, z2);
                    }
                    EnumC50680MYy enumC50680MYy = this.A02;
                    if (enumC50680MYy != null) {
                        if (enumC50680MYy.ordinal() == 0) {
                            enumC33474Er9 = EnumC33474Er9.IMAGE;
                        } else {
                            enumC33474Er9 = EnumC33474Er9.TEXT;
                        }
                        A0f.A8R(enumC33474Er9, "suggested_prompt_type");
                    }
                    String str6 = this.A08;
                    if (str6 != null) {
                        A0f.AAP("suggested_prompt_id", str6);
                    }
                    A0f.Cht();
                }
            }
            A00();
        }
    }

    public final void A03(Integer num, int i, long j) {
        String str = this.A07;
        if (str != null) {
            this.A04 = num;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A0E, "universal_search_button_click");
            AbstractC31173DnH.A1L(A0f, str);
            A0f.A8R(AbstractC35248Fgh.A00(i), "button_name");
            AbstractC31175DnJ.A11(A0f, j);
            A0f.Cht();
        }
    }

    public final void A04(String str) {
        if (this.A07 != null && !AbstractC13670mt.A0G(this.A06, str)) {
            this.A06 = str;
            this.A00 = System.currentTimeMillis();
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A0E, "universal_search_query_changed");
            if (A0f.isSampled()) {
                String str2 = this.A07;
                if (str2 != null) {
                    AbstractC31173DnH.A1L(A0f, str2);
                    String str3 = this.A06;
                    if (str3 == null || str3.length() == 0) {
                        str3 = null;
                    }
                    A0f.AAP("query_string", str3);
                    AbstractC31175DnJ.A11(A0f, AbstractC167007dF.A0A(this.A06));
                    A0f.Cht();
                    return;
                }
                throw AbstractC166987dD.A14("inSession() means session id is not null");
            }
        }
    }
}
