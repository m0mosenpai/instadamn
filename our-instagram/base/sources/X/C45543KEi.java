package X;

import android.content.Context;
import android.view.View;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.reels.Reel;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.KEi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45543KEi extends C1P1 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C45543KEi(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(387835945);
                i = -1266719154;
                break;
            case 1:
                A03 = C0f9.A03(-415596245);
                ((InterfaceC16660sJ) this.A02).invoke(null);
                i = -1762923287;
                break;
            case 2:
                A03 = C0f9.A03(-1739471477);
                C14360o3.A0B(abstractC115105If, 0);
                super.onFail(abstractC115105If);
                JT7 jt7 = ((C47289Kv0) this.A01).A00;
                SpinnerImageView spinnerImageView = jt7.A04;
                if (spinnerImageView != null) {
                    spinnerImageView.setLoadingStatus(C3T1.FAILED);
                }
                jt7.A0G.A02 = false;
                i = 974930647;
                break;
            case 3:
            case 4:
            case 10:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            default:
                super.onFail(abstractC115105If);
                return;
            case 5:
                A03 = C0f9.A03(956239626);
                i = 2009457393;
                break;
            case 6:
                A03 = C0f9.A03(-1707660222);
                LIE.A00((LIE) this.A02);
                i = 1607722145;
                break;
            case 7:
                A03 = C0f9.A03(1558518905);
                C14360o3.A0B(abstractC115105If, 0);
                super.onFail(abstractC115105If);
                KC1 kc1 = (KC1) this.A02;
                Context context = kc1.getContext();
                if (context != null) {
                    C9GR.A01(context, "direct_poll_message_voting_error", 2131960151, 0);
                    AbstractC167007dF.A0x(kc1.A00);
                    View view = kc1.A01;
                    if (view != null) {
                        view.setVisibility(0);
                    }
                }
                C47359Kw8 c47359Kw8 = kc1.A05;
                if (c47359Kw8 == null) {
                    str2 = "logger";
                } else {
                    C3o9 c3o9 = (C3o9) this.A01;
                    LJc lJc = kc1.A04;
                    if (lJc == null) {
                        str2 = "controller";
                    } else {
                        String str3 = lJc.A0A;
                        Throwable A01 = abstractC115105If.A01();
                        if (A01 == null || (str = A01.getMessage()) == null) {
                            str = "";
                        }
                        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c47359Kw8.A00, "existing_poll_submit_error");
                        C0Zx c0Zx = new C0Zx();
                        String A07 = JRE.A07(c3o9);
                        if (A07 != null) {
                            c0Zx.A06(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, A07);
                            c0Zx.A06("question_id", str3);
                            c0Zx.A06("exception_message", str);
                            AbstractC43592JPx.A1L(A0f, c0Zx);
                            i = -1445876476;
                            break;
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    }
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 8:
                A03 = C0f9.A03(-1097852771);
                i = 517428363;
                break;
            case 9:
                A03 = AbstractC167017dG.A0N(abstractC115105If, -1619976600);
                super.onFail(abstractC115105If);
                ((C48757LhP) this.A02).A05.ElJ();
                i = 1216141572;
                break;
            case 11:
                A03 = C0f9.A03(-657045220);
                i = 847209380;
                break;
            case 14:
                A03 = C0f9.A03(216619821);
                AbstractC166987dD.A1Y(this.A01);
                i = -320072974;
                break;
            case Process.SIGTERM /* 15 */:
                A03 = C0f9.A03(1119749851);
                AbstractC166987dD.A1Y(this.A01);
                i = -1000825812;
                break;
        }
        C0f9.A0A(i, A03);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v121, types: [java.lang.Object, X.1vN] */
    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        int i;
        Reel reel;
        String str;
        long j;
        View view;
        String str2;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(1919363508);
                int A032 = C0f9.A03(-1098062257);
                ((C2n2) this.A02).apply(((EC1) obj).A00);
                C0f9.A0A(-1398626638, A032);
                i = 312542076;
                break;
            case 1:
                A03 = C0f9.A03(-1053234203);
                AnonymousClass435 anonymousClass435 = (AnonymousClass435) obj;
                int A0N = AbstractC167017dG.A0N(anonymousClass435, 1498044445);
                C44954Jv6 c44954Jv6 = (C44954Jv6) anonymousClass435.A01;
                if (c44954Jv6 != null) {
                    reel = AbstractC46661Kke.A00(((L6i) this.A01).A01, c44954Jv6, "direct_effect_preview_video", 4);
                } else {
                    reel = null;
                }
                AbstractC25225BEi.A1U(this.A02, reel);
                C0f9.A0A(-1979068652, A0N);
                i = -2037221651;
                break;
            case 2:
                int A033 = C0f9.A03(575103667);
                K8L k8l = (K8L) obj;
                int A034 = C0f9.A03(-1676933839);
                C14360o3.A0B(k8l, 0);
                super.onSuccess(k8l);
                C47289Kv0 c47289Kv0 = (C47289Kv0) this.A01;
                String str3 = k8l.A01;
                Boolean bool = k8l.A00;
                if (str3 != null) {
                    c47289Kv0.A00.A0G.A00 = str3;
                }
                if (bool != null) {
                    c47289Kv0.A00.A0G.A01 = bool.booleanValue();
                }
                JT7 jt7 = c47289Kv0.A00;
                SpinnerImageView spinnerImageView = jt7.A04;
                if (spinnerImageView != null) {
                    AbstractC43592JPx.A1S(spinnerImageView);
                }
                jt7.A0G.A02 = false;
                if (jt7.A0F == EnumC46156Kbu.A03 && ((Map) jt7.A0H.A07.getValue()).isEmpty() && str3 == null && !AbstractC31177DnL.A1b(bool) && (view = jt7.A01) != null) {
                    view.setVisibility(0);
                }
                C05A c05a = ((C75B) this.A02).A05;
                Map A15 = AbstractC43592JPx.A15(c05a);
                LinkedHashMap A13 = AbstractC43593JPy.A13(c05a);
                List list = k8l.A02;
                ArrayList A0q = AbstractC167017dG.A0q(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C148286ly A0Y = AbstractC43592JPx.A0Y(it);
                    C148276lx c148276lx = C148276lx.A1d;
                    String str4 = A0Y.A0S;
                    C14360o3.A07(str4);
                    C148276lx c148276lx2 = new C148276lx(null, str4, AbstractC166987dD.A1J(A0Y));
                    if (A0Y.A04() == C05F.A00) {
                        j = LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
                    } else {
                        j = A0Y.A03 * 1000.0f;
                    }
                    c148276lx2.A0G = Long.valueOf(j);
                    A0q.add(c148276lx2);
                }
                Iterator it2 = A0q.iterator();
                while (it2.hasNext()) {
                    C148276lx c148276lx3 = (C148276lx) it2.next();
                    String str5 = c148276lx3.A0Z;
                    C206409Bx c206409Bx = (C206409Bx) A15.get(str5);
                    if (c206409Bx != null) {
                        str = c206409Bx.A01;
                    } else {
                        str = null;
                    }
                    A13.put(str5, new C206409Bx(c148276lx3, str));
                }
                c05a.Egh(A13);
                C0f9.A0A(-1661218199, A034);
                C0f9.A0A(-1907951526, A033);
                return;
            case 3:
                A03 = C0f9.A03(-1878384520);
                C38071Gp0 c38071Gp0 = (C38071Gp0) obj;
                int A0N2 = AbstractC167017dG.A0N(c38071Gp0, 1036702879);
                C51129MiY c51129MiY = ((C47760L7g) this.A02).A03;
                List list2 = c51129MiY.A00;
                list2.clear();
                int min = Math.min(c38071Gp0.A05.size(), 5);
                for (int i2 = 0; i2 < min; i2++) {
                    list2.add(c38071Gp0.A05.get(i2));
                }
                c51129MiY.notifyDataSetChanged();
                AbstractC166987dD.A1Y(this.A01);
                C0f9.A0A(-3441813, A0N2);
                i = -69687148;
                break;
            case 4:
                A03 = C0f9.A03(864744153);
                int A035 = C0f9.A03(-267973453);
                JT7 jt72 = ((C45493KCi) this.A02).A00;
                if (jt72 != null) {
                    Object obj2 = this.A01;
                    JT6 jt6 = jt72.A0G;
                    ArrayList arrayList = jt6.A05;
                    arrayList.remove(obj2);
                    jt6.clear();
                    JT6.A00(jt6, arrayList);
                    JT6 jt62 = jt72.A0G;
                    jt62.A01 = true;
                    jt62.A02 = false;
                    jt62.A00 = null;
                    jt62.A05.clear();
                    jt72.AD4();
                }
                C0f9.A0A(-1244280363, A035);
                i = 391792099;
                break;
            case 5:
                A03 = C0f9.A03(1857310);
                int A036 = C0f9.A03(-519349877);
                ((C44164JfT) ((LIE) this.A02).A0E.getValue()).A00((C45026JwH) this.A01);
                C0f9.A0A(-808769581, A036);
                i = 1334307546;
                break;
            case 6:
                A03 = C0f9.A03(-1336864342);
                int A037 = C0f9.A03(-475093044);
                LIE lie = (LIE) this.A02;
                ((C44164JfT) lie.A0E.getValue()).A01((C45026JwH) this.A01);
                LIE.A00(lie);
                C0f9.A0A(1857694676, A037);
                i = -1920961981;
                break;
            case 7:
                A03 = C0f9.A03(748760432);
                int A0N3 = AbstractC167017dG.A0N(obj, 899942519);
                super.onSuccess(obj);
                KC1 kc1 = (KC1) this.A02;
                Context context = kc1.getContext();
                if (context != null) {
                    AbstractC31176DnK.A12(context, C3DN.A00);
                }
                C47359Kw8 c47359Kw8 = kc1.A05;
                if (c47359Kw8 == null) {
                    str2 = "logger";
                } else {
                    C3o9 c3o9 = (C3o9) this.A01;
                    LJc lJc = kc1.A04;
                    if (lJc == null) {
                        str2 = "controller";
                    } else {
                        String str6 = lJc.A0A;
                        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c47359Kw8.A00, "existing_poll_submit_success");
                        C0Zx c0Zx = new C0Zx();
                        String A07 = JRE.A07(c3o9);
                        if (A07 != null) {
                            c0Zx.A06(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, A07);
                            c0Zx.A06("question_id", str6);
                            AbstractC43592JPx.A1L(A0f, c0Zx);
                            C0f9.A0A(1344432243, A0N3);
                            i = -1728516755;
                            break;
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    }
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 8:
                A03 = C0f9.A03(1430104233);
                int A038 = C0f9.A03(-1234336647);
                AbstractC44152JfH.A00((UserSession) this.A02).A01((C45026JwH) this.A01);
                C0f9.A0A(1799660973, A038);
                i = 815732043;
                break;
            case 9:
                A03 = C0f9.A03(-2125951818);
                int A0N4 = AbstractC167017dG.A0N(obj, -1114102279);
                super.onSuccess(obj);
                ((C48757LhP) this.A02).A05.Dxz(AbstractC31171DnF.A0g(this.A01));
                C0f9.A0A(-2130326417, A0N4);
                i = 39708743;
                break;
            case 10:
                A03 = C0f9.A03(-1995980789);
                int A039 = C0f9.A03(544107406);
                C44534Jme c44534Jme = (C44534Jme) this.A02;
                MBp.A01(c44534Jme, c44534Jme.A07, 0);
                C25671My A00 = AbstractC25651Mw.A00((AbstractC12990ll) this.A01);
                C44534Jme.A00(c44534Jme).size();
                A00.E4s(new Object());
                C0f9.A0A(2126560771, A039);
                i = -1793819567;
                break;
            case 11:
                A03 = C0f9.A03(-1370475092);
                int A0310 = C0f9.A03(471583387);
                Context context2 = (Context) this.A01;
                C146106i8 A0K = AbstractC31171DnF.A0K();
                AbstractC25226BEj.A1N(context2, A0K, 2131975817);
                A0K.A06();
                AbstractC31178DnM.A1S(A0K);
                C0f9.A0A(2128441214, A0310);
                i = -262920923;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A03 = C0f9.A03(-2074344977);
                EC0 ec0 = (EC0) obj;
                int A0311 = C0f9.A03(-1244030644);
                C14360o3.A0B(ec0, 0);
                ((Object[]) this.A02)[0] = ec0.A00;
                AbstractC25235BEs.A1R((Object[]) this.A01, 7062, 0);
                C0f9.A0A(1753321800, A0311);
                i = -1083911107;
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A03 = C0f9.A03(-1532775760);
                C74293Vk c74293Vk = (C74293Vk) obj;
                int A0312 = C0f9.A03(-800964665);
                C14360o3.A0B(c74293Vk, 0);
                super.onSuccess(c74293Vk);
                List list3 = c74293Vk.A06;
                C14360o3.A07(list3);
                C38321qM c38321qM = (C38321qM) AbstractC001800i.A0O(list3, 0);
                if (c38321qM != null) {
                    UserSession userSession = (UserSession) this.A02;
                    InterfaceC24741Ir interfaceC24741Ir = (InterfaceC24741Ir) this.A01;
                    C1DW.A00(userSession).A03(c38321qM);
                    interfaceC24741Ir.F8s(c38321qM);
                }
                C0f9.A0A(671935402, A0312);
                i = 1237547972;
                break;
            case 14:
                A03 = C0f9.A03(1108777229);
                int A0313 = C0f9.A03(2122994248);
                AbstractC166987dD.A1Y(this.A02);
                C0f9.A0A(1887071899, A0313);
                i = 140912863;
                break;
            case Process.SIGTERM /* 15 */:
                A03 = C0f9.A03(502103049);
                int A0314 = C0f9.A03(-1801535524);
                AbstractC166987dD.A1Y(this.A02);
                C0f9.A0A(960177352, A0314);
                i = 1934905840;
                break;
            default:
                super.onSuccess(obj);
                return;
        }
        C0f9.A0A(i, A03);
    }
}
