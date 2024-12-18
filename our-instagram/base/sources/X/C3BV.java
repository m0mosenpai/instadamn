package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.actionbar.ActionBarTitleViewSwitcher;
import com.instagram.common.session.UserSession;
import com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3BV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3BV implements InterfaceC60602pj, C2KV {
    public static Boolean A0P;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public View A05;
    public View A06;
    public InterfaceC56362iU A07;
    public ActionBarTitleViewSwitcher A08;
    public C65911TwI A09;
    public boolean A0A;
    public final FragmentActivity A0B;
    public final AbstractC60672pq A0C;
    public final ViewOnTouchListenerC60632pm A0D;
    public final UserSession A0E;
    public final InterfaceC60442pS A0F;
    public final C3BY A0G;
    public final C3BZ A0H;
    public final C63322uF A0I;
    public final InterfaceC09390do A0J;
    public final InterfaceC09390do A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final InterfaceC41501vz A0N;
    public final InterfaceC41501vz A0O;

    public C3BV(FragmentActivity fragmentActivity, AbstractC60672pq abstractC60672pq, ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C63322uF c63322uF, boolean z) {
        C3BY c3by;
        boolean z2;
        this.A0E = userSession;
        this.A0B = fragmentActivity;
        this.A0C = abstractC60672pq;
        this.A0F = interfaceC60442pS;
        this.A0L = z;
        this.A0D = viewOnTouchListenerC60632pm;
        this.A0I = c63322uF;
        EnumC09460dv enumC09460dv = EnumC09460dv.A04;
        this.A0K = AbstractC09440dt.A00(enumC09460dv, new C9EX(this, 25));
        this.A0N = new InterfaceC41501vz() { // from class: X.3BW
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(73146705);
                int A032 = C0f9.A03(-60111467);
                C56342iS c56342iS = C56352iT.A0t;
                FragmentActivity fragmentActivity2 = C3BV.this.A0B;
                C56352iT A033 = c56342iS.A03(fragmentActivity2);
                C14360o3.A0C(fragmentActivity2, AbstractC43591JPw.A00(6));
                C56352iT.A0L(A033, true);
                C0f9.A0A(1766007045, A032);
                C0f9.A0A(-1762370205, A03);
            }
        };
        this.A0O = new InterfaceC41501vz() { // from class: X.3BX
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(341426965);
                C71883Kl c71883Kl = (C71883Kl) obj;
                int A032 = C0f9.A03(-1893186382);
                C14360o3.A0B(c71883Kl, 0);
                C3BV c3bv = C3BV.this;
                int i = c71883Kl.A00;
                c3bv.A03 = i;
                View view = c3bv.A06;
                if (view != null) {
                    Map map = C54212eX.A0V;
                    view.setActivated(AbstractC34240F8m.A00(c3bv.A0E, i));
                }
                C0f9.A0A(-1283231172, A032);
                C0f9.A0A(1109677280, A03);
            }
        };
        this.A0J = AbstractC09440dt.A00(enumC09460dv, new C9EX(this, 24));
        if (AbstractC54792fc.A02(userSession)) {
            c3by = new C3BY(fragmentActivity, userSession, interfaceC60442pS);
        } else {
            c3by = null;
        }
        this.A0G = c3by;
        this.A0H = new C3BZ(fragmentActivity, userSession, interfaceC60442pS);
        if (AbstractC54792fc.A03(userSession)) {
            this.A0A = true;
        }
        if (AbstractC54782fb.A00(userSession).booleanValue()) {
            z2 = AbstractC54792fc.A09(userSession, "profile");
        } else {
            z2 = true;
        }
        this.A0M = !z2;
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.C2KV
    public final void Cz5(C4JH c4jh) {
        short s;
        C0Zx c0Zx;
        View view = this.A05;
        if (view != null) {
            int i = c4jh.A00;
            if (i != this.A02) {
                AbstractC72033Lb.A00((ImageView) view, i);
                this.A02 = i;
            }
            UserSession userSession = this.A0E;
            C18920wW A02 = AbstractC12220kQ.A02(userSession);
            InterfaceC02590Ai A00 = A02.A00(A02.A00, "instagram_android_badge");
            if (A00.isSampled()) {
                C71943Kr c71943Kr = c4jh.A01;
                C71933Kq c71933Kq = c71943Kr.A00;
                HashMap hashMap = new HashMap();
                int i2 = c71933Kq.A01;
                if (i2 != -1) {
                    hashMap.put(C4JT.E2EE, Long.valueOf(i2));
                }
                int i3 = c71933Kq.A00;
                if (i3 != -1) {
                    hashMap.put(C4JT.OPEN_MESSAGE, Long.valueOf(i3));
                }
                A00.A8R(EnumC93504Hp.INBOX_BADGE, "badge_type");
                A00.A8R(EnumC93514Hq.COUNT_UPDATED, "badge_event");
                int i4 = c71933Kq.A02;
                Long valueOf = Long.valueOf(i4);
                A00.A9K("badge_value_set", valueOf);
                A00.A9M("badge_value_set_map", hashMap);
                boolean z = false;
                if (i4 > 0) {
                    z = true;
                }
                A00.A7v("was_badge_showing", Boolean.valueOf(z));
                A00.A9K("current_badge_value_showing", valueOf);
                A00.A7v("excludes_muted", Boolean.valueOf(C18U.A06(C06090Tz.A06, userSession, 36320803255559072L)));
                List<C54J> list = c71943Kr.A01;
                ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
                for (C54J c54j : list) {
                    if (c54j instanceof C5NQ) {
                        c0Zx = new C0Zx();
                        C9ZG c9zg = ((C5NQ) c54j).A00;
                        MsysThreadId msysThreadId = c9zg.A02;
                        c0Zx.A06(PublicKeyCredentialControllerUtility.JSON_KEY_ID, String.valueOf(msysThreadId.A00));
                        c0Zx.A06("v2_id", null);
                        c0Zx.A03(TraceFieldType.IsSecure, true);
                        c0Zx.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, msysThreadId.A01.A00);
                        c0Zx.A01(AbstractC46626Kk3.A00(c9zg.A01.A00), "thread_sub_type");
                    } else {
                        C3o9 c3o9 = c54j.A00;
                        C14360o3.A0C(c3o9, "null cannot be cast to non-null type com.instagram.model.direct.DirectThreadKey");
                        DirectThreadKey directThreadKey = (DirectThreadKey) c3o9;
                        c0Zx = new C0Zx();
                        c0Zx.A06(PublicKeyCredentialControllerUtility.JSON_KEY_ID, directThreadKey.A00);
                        c0Zx.A06("v2_id", directThreadKey.A01);
                        c0Zx.A03(TraceFieldType.IsSecure, Boolean.valueOf(c54j.A08));
                        c0Zx.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, EnumC92794Ds.A05.A00);
                    }
                    c0Zx.A03("is_muted", Boolean.valueOf(c54j.A0A));
                    arrayList.add(c0Zx);
                }
                A00.A9K("unread_threads_count", Long.valueOf(arrayList.size()));
                A00.AAk("unread_threads", arrayList);
                A00.Cht();
            }
            C2KZ A002 = C2KX.A00(userSession);
            C006802i c006802i = A002.A02;
            if (c006802i.isMarkerOn(20133815, 0) && C14360o3.A0K(c4jh.A02, "fetch_inbox_from_disk")) {
                if (!C14360o3.A0K(C1CC.A02, "normal")) {
                    C2KZ.A01(A002);
                } else {
                    if (!A002.A00) {
                        c006802i.markerAnnotate(20133815, "cancel_reason", "direct inbox icon not displayed");
                        s = 4;
                    } else {
                        c006802i.markerPoint(20133815, "direct_inbox_icon_badge_count_updated", String.valueOf(i));
                        C2KZ.A00(c4jh.A01.A00, A002);
                        s = 2;
                    }
                    c006802i.markerEnd(20133815, s);
                }
            }
            A04(this);
        }
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroy() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        C2KW.A01(this.A0E, this);
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public static final void A00(View.OnClickListener onClickListener, InterfaceC56362iU interfaceC56362iU, C3BV c3bv, ArrayList arrayList) {
        UserSession userSession = c3bv.A0E;
        if (AbstractC54782fb.A00(userSession).booleanValue()) {
            if (!AbstractC54792fc.A08(userSession, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING)) {
                return;
            }
        } else if (AbstractC54792fc.A04(userSession)) {
            return;
        }
        FragmentActivity fragmentActivity = c3bv.A0B;
        boolean A00 = AbstractC47372Fk.A00(userSession);
        int i = R.drawable.instagram_direct_pano_outline_24;
        if (A00) {
            i = R.drawable.instagram_app_messenger_pano_outline_24;
        }
        C3LO c3lo = new C3LO();
        c3lo.A0F = new C3LP(fragmentActivity, i);
        c3lo.A05 = 2131966348;
        c3lo.A0G = onClickListener;
        c3lo.A0H = null;
        c3lo.A0N = true;
        View AA9 = interfaceC56362iU.AA9(new C3LY(c3lo));
        C14360o3.A0C(AA9, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) AA9;
        c3bv.A05 = imageView;
        C71943Kr A002 = C2KW.A00(userSession);
        C14360o3.A07(A002);
        C71933Kq c71933Kq = A002.A00;
        int i2 = c71933Kq.A02;
        AbstractC72033Lb.A00(imageView, i2);
        c3bv.A02 = i2;
        imageView.setId(R.id.action_bar_inbox_button);
        arrayList.add("main_direct");
        c3bv.A01++;
        C54432ex c54432ex = new C54432ex(EnumC54222eY.A0I, null, i2, i2);
        EnumC58162lY enumC58162lY = EnumC58162lY.A0F;
        EnumC58122lU enumC58122lU = EnumC58122lU.A05;
        AbstractC54332en.A00(userSession).A00().A02(enumC58122lU, enumC58162lY, c54432ex);
        C54412ev A01 = AbstractC54332en.A00(userSession).A01();
        C14360o3.A0B(enumC58162lY, 0);
        A01.A02(new C72053Ld(enumC58122lU, enumC58162lY, null, null), c54432ex);
        C3Ks.A01.A06(userSession, C05F.A00);
        C2KZ A003 = C2KX.A00(userSession);
        C006802i c006802i = A003.A02;
        if (c006802i.isMarkerOn(20133815, 0)) {
            if (!C14360o3.A0K(C1CC.A02, "normal")) {
                C2KZ.A01(A003);
                return;
            }
            A003.A00 = true;
            c006802i.markerPoint(20133815, "direct_inbox_icon_displayed", String.valueOf(i2));
            C2KZ.A00(c71933Kq, A003);
            if (C1CC.A09 != C1CA.A05) {
                return;
            }
            c006802i.markerEnd(20133815, (short) 2);
        }
    }

    public static final void A01(View.OnClickListener onClickListener, InterfaceC56362iU interfaceC56362iU, C3BV c3bv, ArrayList arrayList) {
        if (c3bv.A0A) {
            C3LO c3lo = new C3LO();
            c3lo.A05 = 2131956993;
            c3lo.A04 = R.id.action_bar_left_button;
            c3lo.A0G = onClickListener;
            c3lo.A0N = true;
            c3lo.A06 = R.drawable.instagram_new_post_pano_outline_24;
            boolean A06 = C18U.A06(C06090Tz.A05, c3bv.A0E, 36311285609071083L);
            C3LY c3ly = new C3LY(c3lo);
            if (A06) {
                interfaceC56362iU.AA9(c3ly);
                c3bv.A01++;
            } else {
                interfaceC56362iU.A8u(c3ly);
                c3bv.A00++;
            }
            arrayList.add("main_story_creation");
        }
    }

    public static final void A02(InterfaceC56362iU interfaceC56362iU, C3BV c3bv, ArrayList arrayList) {
        final C3BZ c3bz = c3bv.A0H;
        final UserSession userSession = c3bv.A0E;
        UserSession userSession2 = c3bz.A02;
        if (!AbstractC54792fc.A05(userSession2) && !AbstractC54782fb.A00(userSession2).booleanValue()) {
            C58602mJ A00 = AbstractC58592mI.A00(userSession2);
            if (A00.A02) {
                Integer num = A00.A00;
                if (num != C05F.A0C && num != C05F.A01) {
                    return;
                }
            } else {
                return;
            }
        } else if (!AbstractC54782fb.A00(userSession2).booleanValue() || !AbstractC54792fc.A08(userSession2, "explore")) {
            return;
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: X.53y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i;
                int A05 = C0f9.A05(453043571);
                C2ZI.A00.A0D("explore_popular", "mainFeedExploreActionBarClick", true);
                UserSession userSession3 = UserSession.this;
                C3BZ c3bz2 = c3bz;
                AE4.A01(userSession3, c3bz2.A03, "main_search");
                FragmentActivity fragmentActivity = c3bz2.A01;
                if (!C06P.A01(fragmentActivity.getSupportFragmentManager())) {
                    i = -445773961;
                } else {
                    C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession3);
                    c140966Yy.A0F = true;
                    c140966Yy.A0B(null, ((C41181IKu) AbstractC77423dS.A00().A01.getValue()).A00(1));
                    c140966Yy.A04();
                    i = -376651591;
                }
                C0f9.A0C(i, A05);
            }
        };
        View.OnLongClickListener onLongClickListener = new View.OnLongClickListener() { // from class: X.53z
            /* JADX WARN: Type inference failed for: r0v6, types: [X.U29, java.lang.Object] */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                if (C37011ny.A00 != null) {
                    FragmentActivity fragmentActivity = c3bz.A01;
                    if (C06P.A01(fragmentActivity.getSupportFragmentManager())) {
                        UserSession userSession3 = userSession;
                        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession3);
                        U04.A00();
                        c140966Yy.A0D(new Object().A02(userSession3));
                        c140966Yy.A0A = "composite_search_back_stack";
                        c140966Yy.A04();
                        return true;
                    }
                    return false;
                }
                return false;
            }
        };
        C3LO c3lo = new C3LO();
        c3lo.A05 = 2131962005;
        c3lo.A0G = onClickListener;
        c3lo.A0H = onLongClickListener;
        c3lo.A0P = true;
        c3lo.A0N = true;
        c3lo.A06 = R.drawable.instagram_search_pano_outline_24;
        c3bz.A00 = interfaceC56362iU.AA9(new C3LY(c3lo));
        arrayList.add("main_search");
        c3bv.A01++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006d, code lost:
    
        if (java.lang.Boolean.valueOf(r1) == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0088, code lost:
    
        if (java.lang.Boolean.valueOf(r1) == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.InterfaceC56362iU r14, X.C3BV r15, java.util.ArrayList r16) {
        /*
            X.3BY r2 = r15.A0G
            if (r2 == 0) goto Led
            com.instagram.common.session.UserSession r6 = r2.A03
            androidx.fragment.app.FragmentActivity r11 = r2.A02
            X.3Le r4 = new X.3Le
            r4.<init>()
            X.3Lf r10 = new X.3Lf
            r10.<init>()
            r12 = 0
            r3 = 1
            X.0Tz r5 = X.C06090Tz.A05
            r0 = 36315537626434933(0x8104ca000d0d75, double:3.0294304536656065E-306)
            boolean r13 = X.C18U.A06(r5, r6, r0)
            r0 = 2131238424(0x7f081e18, float:1.8093126E38)
            if (r13 == 0) goto L27
            r0 = 2131237916(0x7f081c1c, float:1.8092096E38)
        L27:
            X.3LP r9 = new X.3LP
            r9.<init>(r11, r0)
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r11)
            r1 = 2131624216(0x7f0e0118, float:1.8875605E38)
            r0 = 0
            android.view.View r8 = r7.inflate(r1, r0, r12)
            X.C14360o3.A07(r8)
            r7 = r8
            com.instagram.notifications.badging.ui.component.ToastingBadge r7 = (com.instagram.notifications.badging.ui.component.ToastingBadge) r7
            if (r13 == 0) goto L43
            r7.A0A(r3, r12)
        L43:
            X.2eY r0 = X.EnumC54222eY.A09
            r7.setUseCase(r0)
            r7.setLifecycleOwner(r11)
            r7.A07 = r10
            r0 = 2342160543999202646(0x2081069b00021556, double:4.063495587467031E-152)
            boolean r0 = X.C18U.A06(r5, r6, r0)
            r7.A0A = r0
            X.0od r0 = X.C14650od.A03
            if (r0 == 0) goto L6f
            com.instagram.common.session.UserSession r6 = X.C14650od.A00(r0)
            r0 = 36320296452104536(0x81091e002a2158, double:3.0324399541813163E-306)
            boolean r1 = X.C18U.A06(r5, r6, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 != 0) goto L70
        L6f:
            r1 = 1
        L70:
            r7.setPrismLedBadgeEnabled(r1)
            X.0od r0 = X.C14650od.A03
            if (r0 == 0) goto L8a
            com.instagram.common.session.UserSession r6 = X.C14650od.A00(r0)
            r0 = 36320296450793805(0x81091e0016214d, double:3.032439953352405E-306)
            boolean r1 = X.C18U.A06(r5, r6, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 != 0) goto L8b
        L8a:
            r1 = 0
        L8b:
            r7.A0B = r1
            r6 = 2131442480(0x7f0b3b30, float:1.8507001E38)
            android.view.View r0 = r8.requireViewById(r6)
            X.C14360o3.A07(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setImageDrawable(r9)
            X.3LO r5 = new X.3LO
            r5.<init>()
            r5.A0I = r8
            r0 = 2131437015(0x7f0b25d7, float:1.8495917E38)
            r5.A04 = r0
            boolean r1 = r7.A0B()
            r0 = 2131968850(0x7f134352, float:1.9574606E38)
            if (r1 == 0) goto Lb4
            r0 = 2131976187(0x7f135ffb, float:1.9589487E38)
        Lb4:
            r5.A05 = r0
            r5.A0G = r4
            r5.A0N = r3
            X.3LY r0 = new X.3LY
            r0.<init>(r5)
            X.2iT r14 = (X.C56352iT) r14
            android.view.View r1 = r0.A0I
            if (r1 == 0) goto Lee
            X.C56352iT.A0E(r1, r0, r14)
            X.C56352iT.A0D(r1, r0, r14)
            r0 = 2131444140(0x7f0b41ac, float:1.8510368E38)
            android.view.View r0 = r1.requireViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r14.A05 = r0
            android.view.View r0 = r1.requireViewById(r6)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r14.A07 = r0
            r2.A00 = r1
            java.lang.String r0 = "main_activity"
            r1 = r16
            r1.add(r0)
            int r0 = r15.A01
            int r0 = r0 + 1
            r15.A01 = r0
        Led:
            return
        Lee:
            java.lang.String r1 = "Must have set custom view in config"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3BV.A03(X.2iU, X.3BV, java.util.ArrayList):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r5.A0E, 36317534785377621L) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(X.C3BV r5) {
        /*
            java.lang.Boolean r1 = X.C3BV.A0P
            r4 = 0
            if (r1 != 0) goto L29
            android.content.Context r0 = X.AbstractC12290kX.A00
            X.C14360o3.A07(r0)
            int r1 = X.AbstractC13880nE.A09(r0)
            r0 = 320(0x140, float:4.48E-43)
            if (r1 <= r0) goto L22
            com.instagram.common.session.UserSession r3 = r5.A0E
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36317534785377621(0x81069b00001555, double:3.030693465022876E-306)
            boolean r1 = X.C18U.A06(r2, r3, r0)
            r0 = 0
            if (r1 == 0) goto L23
        L22:
            r0 = 1
        L23:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            X.C3BV.A0P = r1
        L29:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            boolean r2 = X.C14360o3.A0K(r1, r0)
            if (r2 == 0) goto L48
            X.2pm r1 = r5.A0D
            r0 = 1
            X.ViewOnTouchListenerC60632pm.A01(r1, r0)
            X.2pq r0 = r5.A0C
            X.3FQ r0 = r0.getScrollingViewProxy()
            android.view.ViewGroup r0 = r0.CFj()
            if (r0 == 0) goto L48
            r0.requestLayout()
        L48:
            X.2pm r1 = r5.A0D
            r0 = r2 ^ 1
            r1.A0B = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3BV.A04(X.3BV):void");
    }

    public static final void A05(C3BV c3bv, DirectShareTarget directShareTarget) {
        String str = C1QM.A00.A02.A00;
        if (str == null) {
            str = "";
        }
        new AiAgentThreadLauncher(c3bv.A0E).A0B(c3bv.A0B, null, c3bv.A0F, new C36393G3u(c3bv, str, TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())), directShareTarget, null, "ig_home_action_bar_meta_ai_icon", null, true, false, false, false, false);
    }

    public final void A06() {
        ActionBarTitleViewSwitcher actionBarTitleViewSwitcher;
        String str;
        String str2;
        UserSession userSession = this.A0E;
        if (!C18U.A06(C06090Tz.A05, userSession, 36318969304980279L) && (actionBarTitleViewSwitcher = this.A08) != null) {
            C63322uF c63322uF = this.A0I;
            boolean z = c63322uF.A00;
            ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = this.A0D;
            FragmentActivity fragmentActivity = this.A0B;
            if (!actionBarTitleViewSwitcher.A0C) {
                str = c63322uF.A02.getString(C3Z6.A00(c63322uF.A04.A01));
                C14360o3.A07(str);
            } else {
                str = null;
            }
            String A04 = C18U.A04(C06090Tz.A06, userSession, 36876825428492409L);
            Integer num = C05F.A00;
            Integer[] A00 = C05F.A00(2);
            int length = A00.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Integer num2 = A00[i];
                if (1 - num2.intValue() != 0) {
                    str2 = "feed_title_with_chevron";
                } else {
                    str2 = "logo_with_chevron";
                }
                if (str2.equals(A04)) {
                    num = num2;
                    break;
                }
                i++;
            }
            boolean z2 = false;
            if (num == C05F.A01 || (num == c63322uF.A04.A01 && !z)) {
                z2 = true;
            }
            boolean z3 = false;
            if (actionBarTitleViewSwitcher.getDisplayedChild() == 0) {
                z3 = true;
            }
            if (z2) {
                actionBarTitleViewSwitcher.A03(null, str, z3, z);
            } else {
                actionBarTitleViewSwitcher.A04(!z3, true, str);
            }
            if (z) {
                AbstractC123315i6.A00(fragmentActivity, actionBarTitleViewSwitcher, viewOnTouchListenerC60632pm, userSession);
            }
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroyView() {
        C2KW.A02(this.A0E, this);
        this.A05 = null;
        this.A02 = 0;
        this.A03 = 0;
    }

    @Override // X.InterfaceC60602pj
    public final void onPause() {
        C25671My A00 = AbstractC25651Mw.A00(this.A0E);
        A00.A02(this.A0N, C2IP.class);
        if (this.A0M) {
            A00.A02(this.A0O, C71883Kl.class);
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onResume() {
        C25671My A00 = AbstractC25651Mw.A00(this.A0E);
        A00.A01(this.A0N, C2IP.class);
        if (this.A0M) {
            A00.A01(this.A0O, C71883Kl.class);
            View view = this.A06;
            C3BY c3by = this.A0G;
            if (c3by != null && view != null && !c3by.A01 && AbstractC84643qD.A00.A01()) {
                c3by.A01 = true;
                FragmentActivity fragmentActivity = c3by.A02;
                EfO efO = new EfO(c3by);
                C5SU c5su = new C5SU(fragmentActivity, new C149686oL(2131965786));
                c5su.A03(view);
                c5su.A01();
                c5su.A0F = true;
                c5su.A0A = true;
                c5su.A0B = false;
                c5su.A04 = efO;
                view.postDelayed(new RunnableC24696Awc(fragmentActivity, c5su.A00()), 1000L);
            }
        }
    }
}
