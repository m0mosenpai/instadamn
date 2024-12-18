package X;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.direct.wellbeing.unknowncontact.messagerequests.pendingthreads.rows.header.PendingThreadsMessageSettingsView;
import com.instagram.ui.emptystaterow.EmptyStateView;
import java.security.InvalidParameterException;
import kotlin.Deprecated;

/* loaded from: classes8.dex */
public final class KCO extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60092or, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "DirectPendingInboxFragment";
    public ViewStub A00;
    public RecyclerView A01;
    public LLk A02;
    public C3FR A03;
    public EmptyStateView A04;
    public boolean A05;
    public boolean A06;
    public UserSession A07;
    public IgFrameLayout A08;
    public PendingThreadsMessageSettingsView A09;
    public L4L A0A;
    public boolean A0B;
    public final InterfaceC62612t0 A0D = new JY9(this, 13);
    public final L8U A0C = new L8U(this);
    public final C47439KxU A0E = new C47439KxU(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        int i;
        C14360o3.A0B(interfaceC56362iU, 0);
        if (A06().A0M) {
            interfaceC56362iU.Efu(2131960064);
            interfaceC56362iU.EkT(ViewOnClickListenerC48074LPz.A00(this, 38), true);
        } else if (!A06().A0H) {
            if (A06().A0P) {
                interfaceC56362iU.Efu(2131960096);
                interfaceC56362iU.EkT(ViewOnClickListenerC48074LPz.A00(this, 39), true);
            } else {
                LLk A06 = A06();
                if (A06.A0O && AbstractC1337462f.A02(A06.A0h)) {
                    i = 2131960089;
                } else {
                    i = 2131959912;
                    if (A06().A0N) {
                        i = 2131960070;
                    }
                }
                interfaceC56362iU.Efu(i);
                interfaceC56362iU.EkS(true);
            }
            if (A06().A0S) {
                C3LO c3lo = new C3LO();
                c3lo.A02(C05F.A0A);
                AbstractC31176DnK.A1B(ViewOnClickListenerC48074LPz.A00(this, 43), c3lo, interfaceC56362iU);
            }
        } else {
            interfaceC56362iU.setTitle(AbstractC166997dE.A0N(this).getQuantityString(R.plurals.multi_select_count, A06().A0b().size(), AbstractC25228BEl.A1Y(A06().A0b().size())));
            C3LO c3lo2 = new C3LO();
            c3lo2.A02(C05F.A09);
            AbstractC31176DnK.A1B(ViewOnClickListenerC48074LPz.A00(this, 41), c3lo2, interfaceC56362iU);
            interfaceC56362iU.EkS(true);
        }
        interfaceC56362iU.Ehq(this);
        interfaceC56362iU.Ehg(new C114795Gm(null, null, null, null, null, ViewOnClickListenerC48074LPz.A00(this, 40), C05F.A00, -2, -2, -2, -2, -2, -2, -2, true));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "pending_inbox";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        PendingThreadsMessageSettingsView pendingThreadsMessageSettingsView;
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = AbstractC31173DnH.A0G(view, R.id.thread_list_stub);
        L4L l4l = this.A0A;
        if (l4l == null) {
            str = "buttonsController";
        } else {
            l4l.A00 = AbstractC31173DnH.A0F(view, R.id.permissions_choice_buttons_container);
            LLk A06 = A06();
            KWM kwm = A06.A04;
            C69613Av c69613Av = ((C98O) kwm).A06;
            if (c69613Av != null) {
                c69613Av.A04();
            }
            A06.A0d();
            UserSession userSession = A06.A0h;
            C46493Khs A00 = AbstractC46782Kmd.A00(userSession);
            if (AbstractC1337462f.A0C(userSession, true)) {
                AbstractC47860LCg.A01(C125575m3.A00, A00.A00.A02);
            }
            C45527KDs c45527KDs = A06.A06;
            if (c45527KDs != null) {
                A06.A03.A03(A06.A0i.Bsj(), "INITIAL_LOAD", (java.util.Set) c45527KDs.A04.getValue());
            }
            if (LLk.A0U(A06) && A06.A0I) {
                ((C98O) kwm).A08.A00();
                C69613Av c69613Av2 = kwm.A00;
                if (c69613Av2 != null) {
                    c69613Av2.A04();
                }
            } else {
                A06.A0m(false, false);
            }
            if (A06.A0O) {
                LAH lah = A06.A0p;
                lah.A05(A06.A02.A01);
                lah.A03(A06.A02, null, A06.A0N);
                lah.A00();
            }
            A06.A0j();
            if (c69613Av != null) {
                c69613Av.A05();
            }
            if (AbstractC1337462f.A08(userSession)) {
                C41761wQ c41761wQ = A06.A0g;
                C46922Dg c46922Dg = A06.A0j;
                C49795Lz2.A00(c46922Dg.A07.A0O((C5Fn) c46922Dg.A0H.getValue()), c41761wQ, A06, 3);
            }
            Context requireContext = requireContext();
            C49372Ls5 A0Y = A06().A0Y();
            C14360o3.A07(A0Y);
            C49513LuS c49513LuS = new C49513LuS(requireContext, A0Y);
            UserSession session = getSession();
            Integer num = C05F.A01;
            InterfaceC62612t0 interfaceC62612t0 = this.A0D;
            boolean z = !this.A06;
            C65784Tu2 A002 = AbstractC65908TwF.A00(session, interfaceC62612t0, c49513LuS, Boolean.valueOf(z), num, 5, z);
            ViewStub viewStub = this.A00;
            if (viewStub != null) {
                viewStub.setLayoutResource(R.layout.inbox_refreshable_thread_list_recyclerview_legacy);
            }
            C3FR c3fr = null;
            ViewStub viewStub2 = this.A00;
            if (viewStub2 != null) {
                View inflate = viewStub2.inflate();
                C14360o3.A07(inflate);
                RecyclerView A0G = AbstractC31172DnG.A0G(inflate, R.id.inbox_refreshable_thread_list_recyclerview);
                this.A01 = A0G;
                if (A0G != null) {
                    C3FQ A003 = C3FN.A00(A0G);
                    C14360o3.A0C(A003, "null cannot be cast to non-null type com.instagram.migration.scrollingviewproxy.RefreshableScrollingViewProxy<@[FlexibleNullability] @[RawType] com.instagram.migration.scrollingviewproxy.ScrollingViewAdapterProxy<@[FlexibleNullability] kotlin.Any?>?>");
                    c3fr = (C3FR) A003;
                    c3fr.Ehc(new RunnableC49895M1o(this));
                    AbstractC31177DnL.A17(this, A0G);
                    c3fr.AAJ(A002);
                    c3fr.EPJ(c49513LuS);
                }
            }
            this.A03 = c3fr;
            UserSession session2 = getSession();
            if (C2E7.A01(AbstractC166987dD.A10(session2)) && C18U.A06(C06090Tz.A05, session2, 36317139648516916L)) {
                View inflate2 = AbstractC167007dF.A0M(view, R.id.message_requests_settings_footer).inflate();
                C14360o3.A0C(inflate2, "null cannot be cast to non-null type com.instagram.direct.wellbeing.unknowncontact.messagerequests.pendingthreads.rows.header.PendingThreadsMessageSettingsView");
                pendingThreadsMessageSettingsView = (PendingThreadsMessageSettingsView) inflate2;
                pendingThreadsMessageSettingsView.setTitleText(AbstractC166997dE.A0q(AbstractC166997dE.A0N(this), 2131960066));
                TextView textView = pendingThreadsMessageSettingsView.A00;
                if (textView == null) {
                    str = "titleTextView";
                } else {
                    Context context = pendingThreadsMessageSettingsView.getContext();
                    textView.setPadding(context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap), AbstractC166997dE.A04(context, R.dimen.account_discovery_bottom_gap), AbstractC166997dE.A04(context, R.dimen.account_discovery_bottom_gap), 0);
                    pendingThreadsMessageSettingsView.setLinkToSettingsText(AbstractC166997dE.A0q(AbstractC166997dE.A0N(this), 2131960067));
                    pendingThreadsMessageSettingsView.setLinkToSettingsVisibility(0);
                    pendingThreadsMessageSettingsView.setLinkToSettingsClickListener(ViewOnClickListenerC48074LPz.A00(this, 42));
                    pendingThreadsMessageSettingsView.setDividerVisibility(8);
                }
            } else {
                pendingThreadsMessageSettingsView = null;
            }
            this.A09 = pendingThreadsMessageSettingsView;
            return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A00(EnumC31648DvE enumC31648DvE, KCO kco) {
        String str;
        KBM kbm = new KBM();
        Bundle A0B = AbstractC31177DnL.A0B(kco);
        A0B.putString("IgSessionManager.SESSION_TOKEN_KEY", kco.getSession().userId);
        A0B.putSerializable("thread_folder_name", enumC31648DvE);
        kbm.setArguments(A0B);
        kbm.A03 = kco.A06();
        if (enumC31648DvE == EnumC31648DvE.A09) {
            kbm.A04 = kco.A0D;
        }
        int ordinal = enumC31648DvE.ordinal();
        if (ordinal != 3) {
            if (ordinal != 8) {
                if (ordinal == 9) {
                    str = "hidden_words_folder";
                } else {
                    throw new InvalidParameterException();
                }
            } else {
                str = "story_replies_folder";
            }
        } else {
            str = "spam_folder";
        }
        C14240no A0F = AbstractC43593JPy.A0F(kco);
        A0F.A0I(str);
        A0F.A07(R.anim.right_in, R.anim.left_out, R.anim.left_in, R.anim.right_out);
        A0F.A0D(kbm, str, R.id.thread_list_container);
        A0F.A00();
    }

    @Override // X.AbstractC59962oe
    /* renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final UserSession getSession() {
        UserSession userSession = this.A07;
        if (userSession != null) {
            return userSession;
        }
        C14360o3.A0F("session");
        throw C00O.createAndThrow();
    }

    public final LLk A06() {
        LLk lLk = this.A02;
        if (lLk != null) {
            return lLk;
        }
        C14360o3.A0F("directPendingInboxController");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60092or
    public final void EMT() {
        C3FR c3fr = this.A03;
        if (c3fr != null) {
            c3fr.EMU(this);
        }
    }

    public static final void A01(KCO kco) {
        kco.getChildFragmentManager().A0b();
        LLk A06 = kco.A06();
        boolean z = kco.A05;
        A06.A0M = false;
        A06.A0p.A01(A06.A0a);
        C49372Ls5 A0Y = A06.A0Y();
        C49795Lz2.A00(A0Y.A0E, A0Y.A02, A0Y, 4);
        A06.A0l(false);
        A06.A0r.A01();
        if (z) {
            A06.A15.remove(EnumC46220Kcw.A0E);
            A06.A0m(false, false);
            LLk.A0J(A06);
        }
        kco.A06().A0j();
        A03(kco);
        kco.A05 = false;
    }

    public static final void A02(KCO kco) {
        kco.getChildFragmentManager().A0b();
        LLk A06 = kco.A06();
        A06.A0o.A04("open_pending", null);
        A06.A0P = false;
        A06.A0i();
        A06.A0l(false);
        C49371Ls4 c49371Ls4 = A06.A08;
        if (c49371Ls4 != null) {
            c49371Ls4.A00 = null;
        }
        LLk.A0F(A06);
        A06.A0r.A01();
        A06.A15.clear();
        LLk.A0D(EnumC46220Kcw.A08, A06);
        kco.A06().A0j();
        A03(kco);
    }

    public static final void A03(KCO kco) {
        int i;
        RecyclerView recyclerView;
        LLk A06 = kco.A06();
        if ((A06.A0O && AbstractC1337462f.A02(A06.A0h)) || kco.A06().A0M) {
            IgFrameLayout igFrameLayout = kco.A08;
            if (igFrameLayout != null) {
                igFrameLayout.setImportantForAccessibility(2);
            }
            recyclerView = kco.A01;
            if (recyclerView != null) {
                i = 4;
            } else {
                return;
            }
        } else {
            IgFrameLayout igFrameLayout2 = kco.A08;
            i = 1;
            if (igFrameLayout2 != null) {
                igFrameLayout2.setImportantForAccessibility(1);
            }
            IgFrameLayout igFrameLayout3 = kco.A08;
            if (igFrameLayout3 != null) {
                igFrameLayout3.setFocusable(true);
            }
            IgFrameLayout igFrameLayout4 = kco.A08;
            if (igFrameLayout4 != null) {
                igFrameLayout4.sendAccessibilityEvent(8);
            }
            recyclerView = kco.A01;
            if (recyclerView == null) {
                return;
            }
        }
        recyclerView.setImportantForAccessibility(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r3, 2342160148862079794L) == false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(X.KCO r12) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KCO.A04(X.KCO):void");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    @Deprecated(message = "Overrides deprecated method in Fragment")
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            LLk A06 = A06();
            if (i2 == 2) {
                FVD.A01(A06.A0b, A06.A0h, C05F.A0C);
                return;
            }
            return;
        }
        if (i != 512340) {
            if (i != 512342) {
                return;
            }
            LLk A062 = A06();
            if (i2 != 512341) {
                return;
            }
            C37091o7.A00().Coi(A062.A0b.requireContext(), AbstractC31171DnF.A0D("direct_message"), A062.A0h, EnumC39589Hdz.A0G);
            return;
        }
        LLk A063 = A06();
        if (i2 != 512341) {
            return;
        }
        A063.A0d.markerStart(190449529);
        UserSession userSession = A063.A0h;
        AbstractC47180KtF.A00(A063.A0b, userSession, C05F.A01, A063.A0O, false);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C44180Jfj c44180Jfj = A06().A0n;
        AbstractC44190Jft.A00(c44180Jfj, new ME3("back_out", c44180Jfj, 49));
        if (A06().A0M) {
            A01(this);
            return true;
        }
        LLk A06 = A06();
        if (A06.A0O && AbstractC1337462f.A02(A06.A0h) && !this.A0B) {
            getChildFragmentManager().A0b();
            LLk A062 = A06();
            A062.A0o.A04("open_pending", null);
            A062.A0O = false;
            A062.A0i();
            A062.A0l(false);
            A062.A0Z().A00 = null;
            LLk.A0F(A062);
            A062.A0r.A01();
        } else {
            if (A06().A0P) {
                A02(this);
                return true;
            }
            if (A06().A0N) {
                getChildFragmentManager().A0b();
                LLk A063 = A06();
                A063.A0o.A04("open_pending", null);
                A063.A0p.A00();
                A063.A0N = false;
                A063.A0O = true;
                C45527KDs c45527KDs = A063.A06;
                if (c45527KDs != null) {
                    A063.A02 = AbstractC47860LCg.A01(C2057398y.A00, (C4I3) c45527KDs.A06.getValue());
                }
                A063.A0i();
                A063.A0l(false);
                A063.A0X().A00 = null;
                LLk.A0F(A063);
                A063.A0r.A01();
                A063.A15.clear();
            } else {
                LLk A064 = A06();
                if (A064.A0T) {
                    A064.A0T = false;
                    UserSession userSession = A064.A0h;
                    IntentFilter intentFilter = C2057098u.A0J;
                    AbstractC2057198v.A00(userSession).A03();
                }
                KXD kxd = A064.A0o;
                kxd.A02 = false;
                AbstractC44190Jft.A00(kxd, new ME3("back_out", kxd, 49));
                if (A064.A0A.longValue() != 0) {
                    C23031Ai A00 = AbstractC23021Ah.A00(A064.A0h);
                    long longValue = A064.A0A.longValue();
                    InterfaceC19610xo A0w = AbstractC166987dD.A0w(A00);
                    A0w.E7G("last_pending_inbox_filtering_cache_update_timestamp", longValue);
                    A0w.apply();
                }
                if (A064.A0R) {
                    Intent intent = new Intent();
                    intent.putExtra("DirectInboxFragment.DIRECT_MESSAGE_REQUEST_RESULT_REFRESH_INBOX", true);
                    A064.A0b.requireActivity().setResult(-1, intent);
                }
                if (LLk.A0U(A064)) {
                    Intent intent2 = new Intent();
                    intent2.putExtra("DirectInboxFragment.DIRECT_MESSAGE_REQUEST_INBOX_INITIAL_LOAD_COMPLETE_KEY", A064.A0I);
                    A064.A0b.requireActivity().setResult(-1, intent2);
                    return false;
                }
                return false;
            }
        }
        A06().A0j();
        A03(this);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Integer num;
        boolean z;
        int A02 = C0f9.A02(145412452);
        super.onCreate(bundle);
        this.A07 = AbstractC31177DnL.A0R(this);
        this.A02 = new LLk(this, this, getSession(), this.A0C);
        LLk A06 = A06();
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            A06.A0I = bundle2.getBoolean("DirectInboxFragment.DIRECT_MESSAGE_REQUEST_INBOX_INITIAL_LOAD_COMPLETE_KEY", false);
        }
        C69613Av c69613Av = ((C98O) A06.A04).A02;
        c69613Av.A04();
        KXD kxd = A06.A0o;
        if (kxd.A02) {
            kxd.A02 = false;
            num = C05F.A01;
        } else {
            num = C05F.A00;
        }
        KXD.A02(kxd, num);
        kxd.A04("open_pending", null);
        c69613Av.A05();
        if (C18U.A04(C06090Tz.A05, A06.A0h, 36879402407297292L).equals("longer_delete_title")) {
            A06.A0f.A02(C42221xC.A07(new C43645JSd(A06, 12), AbstractC142856cl.A00), new PKD(A06, 1));
        }
        this.A06 = AbstractC1337462f.A02(getSession());
        this.A0A = new L4L(requireActivity(), getSession(), this.A0E);
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            z = bundle3.getBoolean("DirectInboxFragment.DIRECT_MESSAGE_REQUEST_INBOX_LAUNCH_HIDDEN_FOLDER_KEY");
        } else {
            z = false;
        }
        this.A0B = z;
        C0f9.A09(-1143807705, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A02 = C0f9.A02(-1537339085);
        C14360o3.A0B(layoutInflater, 0);
        C69613Av c69613Av = ((C98O) A06().A04).A03;
        c69613Av.A04();
        c69613Av.A05();
        View inflate = layoutInflater.inflate(R.layout.fragment_direct_permissions_inbox, viewGroup, false);
        this.A04 = (EmptyStateView) inflate.requireViewById(R.id.direct_empty_view);
        IgFrameLayout igFrameLayout = (IgFrameLayout) inflate.requireViewById(R.id.thread_list_container);
        this.A08 = igFrameLayout;
        if (igFrameLayout != null) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                str = activity.getString(2131959912);
            } else {
                str = null;
            }
            igFrameLayout.setContentDescription(str);
        }
        C0f9.A09(468492356, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-2031747403);
        super.onDestroy();
        LLk A06 = A06();
        AbstractC47180KtF.A00 = false;
        A06.A0f.A01();
        A06.A0h.A03(LEW.class);
        A06.A15.clear();
        A06.A0g.A01();
        C0f9.A09(836526998, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(41198590);
        super.onDestroyView();
        this.A01 = null;
        this.A08 = null;
        this.A09 = null;
        this.A04 = null;
        this.A00 = null;
        A06().A0e();
        C0f9.A09(1216245927, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-593338328);
        super.onPause();
        if (requireActivity().getParent() != null) {
            ComponentCallbacks2 parent = requireActivity().getParent();
            C14360o3.A0C(parent, AbstractC111324zv.A00(36));
            ((InterfaceC53712dA) parent).EfL(0);
        }
        A06().A0f();
        C0f9.A09(-882513134, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1739990216);
        super.onResume();
        C56352iT.A0t.A03(getActivity()).A0X(this);
        if (requireActivity().getParent() != null) {
            ComponentCallbacks2 parent = requireActivity().getParent();
            C14360o3.A0C(parent, AbstractC111324zv.A00(36));
            ((InterfaceC53712dA) parent).EfL(8);
        }
        A06().A0g();
        A03(this);
        if (this.A0B) {
            A06().A0h();
        }
        C0f9.A09(-787456258, A02);
    }
}
