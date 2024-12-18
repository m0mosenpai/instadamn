package X;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.messagethread.store.intf.MessageListLayoutManager;
import com.instagram.direct.model.DirectThreadThemeInfo;
import com.instagram.direct.perf.constants.ThreadFetchReason;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.User;
import com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger;
import com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLoggingController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.7Uw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163827Uw implements InterfaceC163837Ux, InterfaceC163857Uz, InterfaceC2056798r, C7V0, C7V1, C7V2 {
    public C9BQ A00;
    public InterfaceC41501vz A01;
    public InterfaceC41501vz A02;
    public C7K6 A03;
    public C163547Tr A04;
    public AnonymousClass988 A05;
    public C7VB A06;
    public C2EC A07;
    public C46882Dc A08;
    public String A09;
    public C7K7 A0A;
    public C7V4 A0B;
    public C7J0 A0C;
    public InterfaceC83703oF A0D;
    public boolean A0E;
    public final UserSession A0G;
    public final Capabilities A0H;
    public final C7O4 A0I;
    public final C7XE A0J;
    public final C7WE A0K;
    public final C7WD A0L;
    public final C164087Vx A0M;
    public final InterfaceC164017Vq A0N;
    public final C2DS A0O;
    public final C7VA A0W;
    public final C163807Uu A0X;
    public final C164097Vy A0Z;
    public final C98K A0a;
    public final C7VV A0b;
    public final C7VF A0c;
    public final String A0d;
    public final String A0e;
    public final boolean A0f;
    public final boolean A0g;
    public final boolean A0h;
    public final C7V3 A0Y = new C7V3(this);
    public final InterfaceC41501vz A0S = new InterfaceC41501vz() { // from class: X.7V5
        @Override // X.InterfaceC41501vz
        public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
            IGFOAMessagingLocalSendSpeedLogger iGFOAMessagingLocalSendSpeedLogger;
            int i;
            C162307Os c162307Os;
            C193328hC c193328hC;
            int i2;
            DialogInterface.OnClickListener dialogInterfaceOnClickListenerC35321Fhw;
            C2EC c2ec;
            Boolean bool;
            Boolean bool2;
            List list;
            int A03 = C0f9.A03(-550013436);
            C2Io c2Io = (C2Io) obj;
            int A032 = C0f9.A03(1568105931);
            Integer num = c2Io.A01;
            boolean z = true;
            if (num == C05F.A01 && (list = c2Io.A02) != null && list.size() == 1 && ((C83403nh) list.get(0)).A0g() != null) {
                iGFOAMessagingLocalSendSpeedLogger = C7R5.A00(C163827Uw.this.A0G, Integer.valueOf(((C83403nh) list.get(0)).A0g().hashCode()));
                if (iGFOAMessagingLocalSendSpeedLogger != null) {
                    iGFOAMessagingLocalSendSpeedLogger.onLogPostThreadUpdateEventEnd();
                }
            } else {
                iGFOAMessagingLocalSendSpeedLogger = null;
            }
            C163827Uw c163827Uw = C163827Uw.this;
            if (c163827Uw.C7I() != null && c163827Uw.C7I().equals(c2Io.A00.A00)) {
                C2DS c2ds = c163827Uw.A0O;
                String C7I = c163827Uw.C7I();
                C14360o3.A0B(C7I, 0);
                C81663kb A0N = ((C2DU) c2ds).A0N(C7I);
                C163827Uw.A02(c163827Uw.A0J, c163827Uw.A0K, c163827Uw, A0N);
                C163827Uw.A05(c163827Uw, A0N);
            }
            if (c163827Uw.A0L.A00.A0U.isResumed() && c163827Uw.A07 != null) {
                DirectThreadKey B90 = c163827Uw.B90();
                DirectThreadKey directThreadKey = c2Io.A00;
                if (B90.equals(directThreadKey)) {
                    String str = directThreadKey.A00;
                    if (str != null) {
                        if (iGFOAMessagingLocalSendSpeedLogger != null) {
                            iGFOAMessagingLocalSendSpeedLogger.onLogUpdateLocalThreadIdStart();
                        }
                        C81663kb A0N2 = ((C2DU) c163827Uw.A0O).A0N(str);
                        C7W4.A0A(c163827Uw.A0K.A00, directThreadKey);
                        if (A0N2 == null || A0N2.C7g() != 29) {
                            z = false;
                        }
                        if (!AbstractC50102Ry.A00(c163827Uw.A09, str) && !z) {
                            C163827Uw.A06(c163827Uw, str);
                            C77K c77k = (C77K) c163827Uw.A0J.A08.invoke();
                            if (c77k != null) {
                                c77k.A02();
                                c77k.A01();
                            }
                        }
                        if (iGFOAMessagingLocalSendSpeedLogger != null) {
                            iGFOAMessagingLocalSendSpeedLogger.onLogUpdateLocalThreadIdEnd();
                        }
                    }
                    if (!AbstractC50102Ry.A00(c163827Uw.C7I(), str)) {
                        i = 349629044;
                    } else {
                        C7K6 c7k6 = c163827Uw.A03;
                        c7k6.getClass();
                        c7k6.A00(c163827Uw.C7W(), num, c2Io.A02, c2Io.A00(), c2Io.A04);
                        C7XE c7xe = c163827Uw.A0J;
                        ((C164607Xz) c7xe.A0K.invoke()).A01();
                        C2EC c2ec2 = c163827Uw.A07;
                        UserSession userSession = c7xe.A02;
                        if ((AbstractC31272Dou.A01(userSession, c2ec2) || AbstractC31272Dou.A00(userSession, c2ec2)) && (c162307Os = (C162307Os) c7xe.A06.invoke()) != null) {
                            c162307Os.A05(false, null);
                        }
                        C2EC c2ec3 = c163827Uw.A07;
                        if (c2ec3 != null) {
                            AbstractC59962oe abstractC59962oe = c7xe.A00;
                            Context requireContext = abstractC59962oe.requireContext();
                            C163947Vi c163947Vi = c7xe.A04;
                            List list2 = c2Io.A03;
                            if (list2 != null && list2.size() == 1 && (bool2 = ((C9Q7) list2.get(0)).A01) != null && !bool2.booleanValue()) {
                                C23031Ai A00 = AbstractC23021Ah.A00(userSession);
                                C14360o3.A0B(A00, 1);
                                if (C18U.A06(C06090Tz.A05, userSession, 36311130989134268L)) {
                                    InterfaceC16530ry interfaceC16530ry = A00.A7z;
                                    C0YR[] c0yrArr = C23031Ai.A8c;
                                    if (((Boolean) interfaceC16530ry.CES(A00, c0yrArr[406])).booleanValue() && A00.A01.getInt("unsend_warning_banner_shown_count", 0) < 2) {
                                        C34927FaD c34927FaD = new C34927FaD(abstractC59962oe, userSession);
                                        final C36386G3m c36386G3m = new C36386G3m(abstractC59962oe, c163947Vi, c34927FaD, c2ec3);
                                        C193328hC c193328hC2 = new C193328hC(requireContext);
                                        c193328hC2.A0A(2131960796);
                                        c193328hC2.A09(2131960795);
                                        c193328hC2.A0J(new DialogInterface.OnClickListener() { // from class: X.Y7u
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                                YP2.this.DOg();
                                            }
                                        }, 2131960800);
                                        c193328hC2.A0I(new DialogInterface.OnClickListener() { // from class: X.Y7v
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                                YP2.this.DAt();
                                                if (dialogInterface != null) {
                                                    dialogInterface.dismiss();
                                                }
                                            }
                                        }, 2131968948);
                                        c193328hC2.A0s(true);
                                        c193328hC2.A0t(true);
                                        C0fJ.A00(c193328hC2.A02());
                                        C34927FaD.A00(c34927FaD, c2ec3, "show");
                                        C23031Ai A002 = AbstractC23021Ah.A00(userSession);
                                        InterfaceC19630xq interfaceC19630xq = A002.A01;
                                        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                                        ARD.E77("seen_direct_unseen_message_education_dialog", true);
                                        ARD.apply();
                                        int i3 = interfaceC19630xq.getInt("unsend_warning_banner_shown_count", 0) + 1;
                                        InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
                                        ARD2.E7D("unsend_warning_banner_shown_count", i3);
                                        ARD2.apply();
                                        A002.A7z.Egi(A002, false, c0yrArr[406]);
                                        AbstractC22715A0l.A00(userSession);
                                    }
                                }
                            }
                        }
                        List list3 = c2Io.A03;
                        if (list3 != null && list3.size() > 0 && (c2ec = c163827Uw.A07) != null) {
                            Context requireContext2 = c7xe.A00.requireContext();
                            C163947Vi c163947Vi2 = c7xe.A04;
                            C23031Ai A003 = AbstractC23021Ah.A00(userSession);
                            C14360o3.A0B(A003, 1);
                            if (list3.size() == 1 && (bool = ((C9Q7) list3.get(0)).A01) != null && bool.booleanValue() && c2ec.CbK()) {
                                InterfaceC19630xq interfaceC19630xq2 = A003.A01;
                                if (!interfaceC19630xq2.getBoolean("seen_direct_admin_remove_message_warning_dialog", false) && interfaceC19630xq2.getBoolean("show_direct_admin_remove_message_warning_dialog", false) && C18U.A06(C06090Tz.A05, userSession, 36315859748130448L)) {
                                    C36385G3l c36385G3l = new C36385G3l(c163947Vi2, c2ec);
                                    C193328hC c193328hC3 = new C193328hC(requireContext2);
                                    c193328hC3.A0A(2131960330);
                                    c193328hC3.A09(2131960329);
                                    c193328hC3.A0J(new DialogInterfaceOnClickListenerC73318Y7s(c36385G3l), 2131960800);
                                    c193328hC3.A0I(new Y7t(c36385G3l), 2131968948);
                                    c193328hC3.A0s(true);
                                    c193328hC3.A0t(true);
                                    C0fJ.A00(c193328hC3.A02());
                                    InterfaceC19610xo ARD3 = interfaceC19630xq2.ARD();
                                    ARD3.E77("seen_direct_admin_remove_message_warning_dialog", true);
                                    ARD3.apply();
                                    InterfaceC19610xo ARD4 = interfaceC19630xq2.ARD();
                                    ARD4.E77("show_direct_admin_remove_message_warning_dialog", false);
                                    ARD4.apply();
                                }
                            }
                        }
                        C2EC c2ec4 = c163827Uw.A07;
                        if (c2ec4 != null && c2ec4.C4i() == EnumC46982Dm.A04) {
                            boolean z2 = false;
                            if (c2ec4.BLX() == null) {
                                z2 = true;
                            }
                            AbstractC59962oe abstractC59962oe2 = c7xe.A00;
                            Context requireContext3 = abstractC59962oe2.requireContext();
                            FragmentActivity activity = abstractC59962oe2.getActivity();
                            if (C4A4.A01(userSession)) {
                                if (z2 && AbstractC43959Jc8.A00(userSession)) {
                                    c193328hC = new C193328hC(requireContext3);
                                    c193328hC.A0A(2131954138);
                                    c193328hC.A09(2131954137);
                                    c193328hC.A0k(requireContext3.getDrawable(R.drawable.ig_illustrations_illo_direct_refresh));
                                    c193328hC.A07();
                                } else {
                                    C23031Ai A004 = AbstractC23021Ah.A00(userSession);
                                    InterfaceC16530ry interfaceC16530ry2 = A004.A1m;
                                    C0YR[] c0yrArr2 = C23031Ai.A8c;
                                    if (!((Boolean) interfaceC16530ry2.CES(A004, c0yrArr2[134])).booleanValue()) {
                                        interfaceC16530ry2.Egi(A004, true, c0yrArr2[134]);
                                        boolean A04 = AbstractC63302u8.A00(userSession).A04(UserMonetizationProductType.A08);
                                        c193328hC = new C193328hC(requireContext3);
                                        c193328hC.A0A(2131957223);
                                        c193328hC.A09(2131957222);
                                        c193328hC.A0k(requireContext3.getDrawable(R.drawable.ig_illustrations_illo_direct_refresh));
                                        if (A04) {
                                            c193328hC.A07();
                                            i2 = 2131957224;
                                            dialogInterfaceOnClickListenerC35321Fhw = new DialogInterfaceOnClickListenerC35304Fhd(requireContext3);
                                        } else {
                                            c193328hC.A07();
                                            i2 = 2131968668;
                                            dialogInterfaceOnClickListenerC35321Fhw = new DialogInterfaceOnClickListenerC35321Fhw(activity, userSession);
                                        }
                                        c193328hC.A0I(dialogInterfaceOnClickListenerC35321Fhw, i2);
                                    }
                                }
                                C0fJ.A00(c193328hC.A02());
                            }
                        }
                        i = 2025742563;
                    }
                    C0f9.A0A(i, A032);
                    C0f9.A0A(-693805793, A03);
                }
            }
            i = 1442565079;
            C0f9.A0A(i, A032);
            C0f9.A0A(-693805793, A03);
        }
    };
    public final InterfaceC41501vz A0P = new InterfaceC41501vz() { // from class: X.7V7
        @Override // X.InterfaceC41501vz
        public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
            C162307Os c162307Os;
            int A03 = C0f9.A03(-2049680506);
            C7M9 c7m9 = (C7M9) obj;
            int A032 = C0f9.A03(-1092065323);
            C163827Uw c163827Uw = C163827Uw.this;
            if (c163827Uw.C7I() != null && c163827Uw.C7I().equals(c7m9.A00.A00) && (c162307Os = (C162307Os) c163827Uw.A0J.A06.invoke()) != null) {
                c162307Os.A05(true, null);
            }
            C0f9.A0A(-1406040182, A032);
            C0f9.A0A(1466665336, A03);
        }
    };
    public final InterfaceC41501vz A0Q = new InterfaceC41501vz() { // from class: X.7V8
        @Override // X.InterfaceC41501vz
        public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
            int A03 = C0f9.A03(1902857524);
            int A032 = C0f9.A03(882225351);
            C163827Uw c163827Uw = C163827Uw.this;
            C163547Tr c163547Tr = c163827Uw.A04;
            C160787Im A01 = c163547Tr.A0n.A01(((C7MA) obj).A01);
            if (A01 == null) {
                C0w9.A03("UpdateMessagePendingReactionEventListener", "DirectMessageRowData no longer exists for regenerateViewModelFromReactionStateChange");
            } else {
                c163827Uw.A04.A0X(c163827Uw.CDC(), null, null, null, null, Collections.singletonList(A01));
            }
            C0f9.A0A(476172276, A032);
            C0f9.A0A(-191436037, A03);
        }
    };
    public final InterfaceC41501vz A0R = new InterfaceC41501vz() { // from class: X.7V9
        @Override // X.InterfaceC41501vz
        public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
            int A03 = C0f9.A03(650008939);
            C7MB c7mb = (C7MB) obj;
            int A032 = C0f9.A03(1756322783);
            C163827Uw c163827Uw = C163827Uw.this;
            if (c163827Uw.C7I() != null) {
                C7XE c7xe = c163827Uw.A0J;
                List list = c7mb.A00;
                String C7I = c163827Uw.C7I();
                C14360o3.A0B(C7I, 1);
                C48257LXg c48257LXg = (C48257LXg) c7xe.A0H.invoke();
                if (c48257LXg != null) {
                    c48257LXg.A01(null, C7I, list);
                }
            }
            C0f9.A0A(1528894198, A032);
            C0f9.A0A(1572595027, A03);
        }
    };
    public final C42201xA A0T = AbstractC42021ws.A00();
    public final C42201xA A0U = AbstractC42021ws.A00();
    public final C41761wQ A0V = new C41761wQ(AbstractC142856cl.A01);
    public boolean A0F = false;

    public static void A05(C163827Uw c163827Uw, C2EC c2ec) {
        if (c2ec != null && c2ec.C7I() != null) {
            C7TT A00 = C7V4.A02.A00(c163827Uw.A0G, c163827Uw.A05, c2ec, new C83693oE(c2ec.C7I()), false);
            C42201xA c42201xA = c163827Uw.A0U;
            if (!AbstractC50102Ry.A00(A00, c42201xA.A0W())) {
                c42201xA.accept(A00);
            }
        }
    }

    private void A0A(boolean z) {
        C7J0 c7j0;
        C28811aJ A00 = C28811aJ.A00(this.A0G);
        boolean A0G = A0G(z);
        String str = this.A09;
        if (str != null) {
            C7O4 c7o4 = this.A0I;
            if (c7o4 != null && c7o4.A03()) {
                c7o4.A02();
                this.A06 = new C7VB(this.A06.A02, true, false, A0G);
            }
            c7j0 = A00.A08(ThreadFetchReason.INITIAL_SNAPSHOT, this, str, true);
        } else {
            C2EC c2ec = this.A07;
            if (c2ec == null || !c2ec.CRD() || C4GR.A07(Integer.valueOf(this.A07.C7g()))) {
                return;
            }
            List BSH = this.A07.BSH();
            ThreadFetchReason threadFetchReason = ThreadFetchReason.INITIAL_SNAPSHOT;
            ArrayList A002 = DirectThreadKey.A00(BSH);
            Collections.sort(A002);
            c7j0 = new C7J0(threadFetchReason, (InterfaceC2056798r) this, A00, (Boolean) false, (List) A002);
            c7j0.A03();
        }
        this.A0C = c7j0;
        this.A06 = new C7VB(this.A06.A02, true, false, A0G);
    }

    @Override // X.InterfaceC163837Ux
    public final Integer BAZ() {
        return 0;
    }

    @Override // X.InterfaceC163837Ux
    public final Capabilities BNg() {
        return null;
    }

    @Override // X.InterfaceC163837Ux
    public final C83693oE BNh() {
        return null;
    }

    @Override // X.InterfaceC163857Uz
    public final C47385Kwa ChY(L1N l1n, String str) {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
    
        if (r0.CLS() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        if (r1.A03 != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r22.A0G, 36331119766946980L) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x010b, code lost:
    
        if (r22.A0M.A0H != false) goto L31;
     */
    @Override // X.C7V2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DxD(X.C7TT r23, java.lang.Integer r24, java.util.List r25, java.util.List r26, java.util.List r27) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C163827Uw.DxD(X.7TT, java.lang.Integer, java.util.List, java.util.List, java.util.List):void");
    }

    @Override // X.InterfaceC163857Uz
    public final boolean Eip() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0093, code lost:
    
        if (X.AbstractC50102Ry.A00(r10.C7I(), r3) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        A06(r10, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0098, code lost:
    
        r0 = r11.BKb();
        r3 = r9.A00;
        X.C7W4.A0A(r3, r0);
        r2 = r3.A0i;
        r1 = ((X.C164667Yf) r2.A0O.getValue()).A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ad, code lost:
    
        if (r1 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00af, code lost:
    
        r1.A04(new X.KR9(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bd, code lost:
    
        if (r3.A0U.isResumed() == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bf, code lost:
    
        if (r5 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c1, code lost:
    
        ((X.C7Z7) r2.A0k.getValue()).A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cc, code lost:
    
        r0 = r3.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ce, code lost:
    
        if (r0 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d0, code lost:
    
        X.C14360o3.A0F("clientInfra");
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d9, code lost:
    
        throw X.C00O.createAndThrow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e1, code lost:
    
        r0.Avk().EK6(false);
        r1 = r3.A0j;
        r1.A0L.A00();
        r3.A0P();
        r1.A0C.A02(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f8, code lost:
    
        r2 = r10.A0X;
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fd, code lost:
    
        if (r2.A01 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ff, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0100, code lost:
    
        r2.A01 = r11;
        X.C163807Uu.A01(r2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0105, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00db, code lost:
    
        if (r1 != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(X.C7XE r8, X.C7WE r9, X.C163827Uw r10, X.C2EC r11) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C163827Uw.A02(X.7XE, X.7WE, X.7Uw, X.2EC):void");
    }

    public static void A03(C163827Uw c163827Uw) {
        UserSession userSession = c163827Uw.A0G;
        if (C18U.A06(C06090Tz.A05, userSession, 36330033140220549L) && c163827Uw.A01 != null) {
            AbstractC25651Mw.A00(userSession).A02(c163827Uw.A01, C2Im.class);
        }
    }

    public static void A04(C163827Uw c163827Uw) {
        UserSession userSession = c163827Uw.A0G;
        if (C18U.A06(C06090Tz.A05, userSession, 36330033140286086L) && c163827Uw.A02 != null) {
            AbstractC25651Mw.A00(userSession).A02(c163827Uw.A02, C4HA.class);
        }
    }

    public static void A06(C163827Uw c163827Uw, String str) {
        if (!AbstractC50102Ry.A00(c163827Uw.A09, str)) {
            c163827Uw.A09 = str;
            C2EC c2ec = c163827Uw.A07;
            if (c2ec != null) {
                C2DU.A00(c2ec, (C2DU) c163827Uw.A0O).A0D(str);
            }
        }
    }

    private void A09(String str, List list) {
        C81663kb BZR;
        if (this.A07 == null) {
            C2DS c2ds = this.A0O;
            String str2 = this.A0e;
            if (str != null) {
                BZR = ((C2DU) c2ds).A0N(str);
            } else if (list != null) {
                BZR = c2ds.BZR(null, null, str2, list);
            } else {
                throw new IllegalArgumentException("At least one of threadId or recipients must be non-null");
            }
            if (BZR != null) {
                A02(this.A0J, this.A0K, this, BZR);
                A05(this, BZR);
                UserSession userSession = this.A0G;
                C14360o3.A0B(userSession, 1);
                if (C18U.A06(C06090Tz.A05, userSession, 36317539080344931L)) {
                    Boolean BJZ = BZR.BJZ();
                    C14360o3.A07(BJZ);
                    boolean booleanValue = BJZ.booleanValue();
                    boolean z = false;
                    if (BZR.BLX() == null) {
                        z = true;
                    }
                    if (booleanValue && z && BZR.BSH().size() == 1) {
                        boolean z2 = false;
                        if (BZR.C7I() != null) {
                            z2 = true;
                        }
                        C2DS A00 = AbstractC28761aE.A00(userSession);
                        if (z2) {
                            String id = ((User) BZR.BSH().get(0)).getId();
                            C25621Ms c25621Ms = new C25621Ms(userSession, -2);
                            c25621Ms.A06();
                            c25621Ms.A0B("direct_v2/icebreakers/get_suggested_icebreakers/");
                            c25621Ms.A9s("professional_id", id);
                            c25621Ms.A0R(EAE.class, FSN.class);
                            C1ON A0N = c25621Ms.A0N();
                            A0N.A00 = new ESW(BZR, A00);
                            C1GJ.A01().schedule(A0N, A0N.getRunnableId(), 3, true, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            this.A0J.A0B.invoke();
        }
    }

    private boolean A0B() {
        int i;
        int i2 = this.A04.A0R().A01 - 1;
        MessageListLayoutManager messageListLayoutManager = this.A0L.A00.A0B;
        if (messageListLayoutManager != null) {
            i = messageListLayoutManager.A1b();
        } else {
            i = -1;
        }
        if (i2 - i <= C18U.A01(C06090Tz.A05, this.A0G, 36604447190684742L)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC163837Ux
    /* renamed from: A0C, reason: merged with bridge method [inline-methods] */
    public final DirectThreadKey B90() {
        C2EC c2ec = this.A07;
        if (c2ec != null) {
            return c2ec.BKb();
        }
        throw new IllegalStateException(AbstractC43591JPw.A00(1149));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r1 == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean A0D(java.lang.String r3) {
        /*
            r2 = this;
            X.2DS r1 = r2.A0O
            com.instagram.model.direct.DirectThreadKey r0 = r2.B90()
            X.3nh r0 = r1.BSh(r0, r3)
            if (r0 == 0) goto L13
            boolean r1 = r0.A1S()
            r0 = 1
            if (r1 != 0) goto L14
        L13:
            r0 = 0
        L14:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C163827Uw.A0D(java.lang.String):java.lang.Boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC2056798r
    /* renamed from: A0F, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dn9(X.C7J0 r6) {
        /*
            r5 = this;
            X.7J0 r0 = r5.A0C
            if (r0 != r6) goto La4
            r1 = 0
            r5.A0C = r1
            X.2EC r0 = r5.A07
            if (r0 != 0) goto L10
            java.lang.String r0 = r6.A02
            r5.A09(r0, r1)
        L10:
            X.2EC r0 = r5.A07
            if (r0 == 0) goto L1b
            X.7Vq r1 = r5.A0N
            java.lang.String r0 = "THREAD_FETCHED_FROM_NETWORK"
            r1.EpH(r0)
        L1b:
            X.7Tr r3 = r5.A04
            X.0ms r0 = r3.A0R()
            int r2 = r0.A01
        L23:
            int r2 = r2 + (-1)
            r0 = -1
            if (r0 >= r2) goto Lbd
            X.0ms r0 = r3.A0R()
            java.lang.Object r1 = r0.A04(r2)
            X.C14360o3.A07(r1)
            X.7VC r1 = (X.C7VC) r1
            boolean r0 = r1 instanceof X.C160787Im
            if (r0 == 0) goto L23
            X.7Im r1 = (X.C160787Im) r1
            long r0 = r1.A07
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
        L41:
            boolean r0 = r6.A04
            if (r0 == 0) goto La5
            X.5sU r1 = r6.A00
            r0 = 0
            if (r1 == 0) goto L4b
            r0 = 1
        L4b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            r5.A0F = r0
            X.7VA r3 = r5.A0W
            X.6CF r0 = r3.A01
            com.instagram.common.session.UserSession r2 = r0.A00
            r0 = 36315928476061494(0x81052500810f36, double:3.029677628543269E-306)
            boolean r0 = X.C6CB.A02(r2, r0)
            if (r0 == 0) goto L7f
            r3.A03()
            int r1 = r3.A00
        L6b:
            java.lang.String r0 = "NUMBER_OF_SCROLLS"
            r3.A06(r0, r1)
            if (r4 == 0) goto L7f
            long r0 = r4.longValue()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "OLDEST_MESSAGE_TIMESTAMP"
            r3.A07(r0, r1)
        L7f:
            X.7VB r0 = r5.A06
            boolean r3 = r0.A02
            r2 = 0
            boolean r0 = r6.A03
            r1 = r0 ^ 1
            X.7WD r0 = r5.A0L
            X.7W4 r0 = r0.A00
            X.7Wi r0 = r0.A0j
            X.7Wk r0 = r0.A0O
            boolean r0 = r0.CYr()
            boolean r0 = r5.A0G(r0)
            A08(r5, r3, r2, r1, r0)
            boolean r0 = r5.A0B()
            if (r0 == 0) goto La4
            r5.Chf()
        La4:
            return
        La5:
            X.7VA r3 = r5.A0W
            X.6CF r0 = r3.A01
            com.instagram.common.session.UserSession r2 = r0.A00
            r0 = 36315928476061494(0x81052500810f36, double:3.029677628543269E-306)
            boolean r0 = X.C6CB.A02(r2, r0)
            if (r0 == 0) goto L7f
            int r0 = r3.A00
            int r1 = r0 + 1
            r3.A00 = r1
            goto L6b
        Lbd:
            r4 = 0
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C163827Uw.Dn9(X.7J0):void");
    }

    public final boolean A0G(boolean z) {
        boolean z2;
        C2EC c2ec = this.A07;
        if (c2ec != null) {
            if (!z) {
                if (!c2ec.CLS()) {
                    return false;
                }
                return true;
            }
            C81663kb c81663kb = (C81663kb) c2ec;
            if (((Boolean) c81663kb.A05.getValue()).booleanValue()) {
                ReentrantReadWriteLock.ReadLock readLock = c81663kb.A03.readLock();
                readLock.lock();
                try {
                    z2 = c81663kb.A01.A2N;
                } finally {
                    readLock.unlock();
                }
            } else {
                C80693iy c80693iy = c81663kb.A01;
                synchronized (c80693iy) {
                    z2 = c80693iy.A2N;
                }
            }
            if (!z2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // X.InterfaceC163837Ux
    public final C160847Is AYU(Context context, C7IH c7ih, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        UserSession userSession = this.A0G;
        Capabilities capabilities = this.A0H;
        C2EC c2ec = this.A07;
        c2ec.getClass();
        boolean Eje = Eje();
        boolean z6 = this.A0g;
        C2EC c2ec2 = this.A07;
        boolean z7 = false;
        if (c2ec2 != null && !c2ec2.CVQ() && BSH().size() == 1 && ((User) BSH().get(0)).A2O()) {
            z7 = true;
        }
        return C160837Ir.A00(context, userSession, capabilities, c7ih, c2ec, this.A0d, i, Eje, z6, z, z7, this.A04.A0T, z2, this.A0f, this.A0h, z3, z4, z5);
    }

    @Override // X.InterfaceC163837Ux
    public final int AdZ() {
        C81543kP c81543kP;
        C2EC c2ec = this.A07;
        if (c2ec != null && (c81543kP = ((C81663kb) c2ec).A01.A0t) != null) {
            return c81543kP.A00;
        }
        return 0;
    }

    @Override // X.InterfaceC163837Ux
    public final C3AY Aej() {
        UserSession userSession = this.A0G;
        C2EC c2ec = this.A07;
        c2ec.getClass();
        return C4GQ.A00(userSession, c2ec);
    }

    @Override // X.InterfaceC163847Uy
    public final /* bridge */ /* synthetic */ C3o9 Afi() {
        C2EC c2ec = this.A07;
        if (c2ec != null) {
            return c2ec.BKb();
        }
        String str = this.A09;
        if (str != null) {
            return new DirectThreadKey(str, null);
        }
        return null;
    }

    @Override // X.InterfaceC163837Ux
    public final Capabilities AlV() {
        return this.A0H;
    }

    @Override // X.InterfaceC163837Ux
    public final List Axh() {
        C2EC c2ec = this.A07;
        if (c2ec == null) {
            return null;
        }
        return c2ec.Axh();
    }

    @Override // X.InterfaceC163837Ux
    public final C42221xC BJv() {
        return this.A0T.A0C();
    }

    @Override // X.InterfaceC163837Ux
    public final int BSB() {
        C2EC c2ec = this.A07;
        c2ec.getClass();
        if (c2ec.C7g() != 29) {
            return c2ec.BSH().size() + 1;
        }
        C81543kP c81543kP = ((C81663kb) this.A07).A01.A0t;
        c81543kP.getClass();
        return c81543kP.A02;
    }

    @Override // X.InterfaceC163837Ux
    public final List BSH() {
        C2EC c2ec = this.A07;
        c2ec.getClass();
        return c2ec.BSH();
    }

    @Override // X.InterfaceC163857Uz
    public final C160787Im BT7(String str) {
        C163547Tr c163547Tr = this.A04;
        if (c163547Tr == null) {
            return null;
        }
        return c163547Tr.A0n.A01(str);
    }

    @Override // X.InterfaceC163837Ux
    public final AnonymousClass172 BYs() {
        return C4GQ.A05(this.A07);
    }

    @Override // X.InterfaceC163837Ux
    public final String BYt() {
        return C4GQ.A09(this.A07);
    }

    @Override // X.InterfaceC163837Ux
    public final String Bj3() {
        C81543kP c81543kP;
        C2EC c2ec = this.A07;
        if (c2ec != null && (c81543kP = ((C81663kb) c2ec).A01.A0t) != null) {
            return c81543kP.A07;
        }
        return null;
    }

    @Override // X.InterfaceC163837Ux
    public final C81543kP Bj4() {
        C2EC c2ec = this.A07;
        if (c2ec != null) {
            return ((C81663kb) c2ec).A01.A0t;
        }
        return null;
    }

    @Override // X.InterfaceC163847Uy
    public final C80993jT BsB(boolean z) {
        UserSession userSession = this.A0G;
        C2EC c2ec = this.A07;
        c2ec.getClass();
        return C4GQ.A02(userSession, c2ec, z);
    }

    @Override // X.InterfaceC163837Ux
    public final EnumC46982Dm C4i() {
        C2EC c2ec = this.A07;
        if (c2ec != null) {
            return c2ec.C4i();
        }
        return null;
    }

    @Override // X.InterfaceC163837Ux
    public final int C7E(boolean z) {
        C2EC c2ec;
        if (z && (c2ec = this.A07) != null) {
            return c2ec.B7A();
        }
        return -1;
    }

    @Override // X.InterfaceC163837Ux
    public final String C7I() {
        C2EC c2ec = this.A07;
        if (c2ec == null) {
            return this.A09;
        }
        return c2ec.C7I();
    }

    @Override // X.InterfaceC163837Ux
    public final String C7M() {
        C2EC c2ec = this.A07;
        if (c2ec != null && c2ec.BJV() != null) {
            return this.A07.BJV().getId();
        }
        return null;
    }

    @Override // X.InterfaceC163837Ux
    public final String C7N() {
        C2EC c2ec = this.A07;
        c2ec.getClass();
        User BJV = c2ec.BJV();
        if (BJV != null) {
            return BJV.getUsername();
        }
        return null;
    }

    @Override // X.InterfaceC163837Ux
    public final List C7U() {
        C2EC c2ec = this.A07;
        c2ec.getClass();
        return c2ec.BSD();
    }

    @Override // X.InterfaceC163837Ux
    public final C7TT C7W() {
        return this.A0B.A00(this.A07, this.A09, Eje());
    }

    @Override // X.InterfaceC163837Ux
    public final C42221xC C7Y() {
        return this.A0U.A0C();
    }

    @Override // X.InterfaceC163837Ux
    public final DirectShareTarget C7f(Context context) {
        this.A07.getClass();
        UserSession userSession = this.A0G;
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 2);
        C2EC c2ec = this.A07;
        C14360o3.A0B(c2ec, 0);
        String A07 = C4GQ.A07(context, userSession, c2ec);
        C14360o3.A07(A07);
        ArrayList A01 = C4GO.A01(c2ec.BSH());
        return new DirectShareTarget(AbstractC31232DoF.A00(c2ec.C7I(), A01), A07, A01, c2ec.CRD());
    }

    @Override // X.InterfaceC163837Ux
    public final DirectThreadThemeInfo C7j() {
        C2EC c2ec = this.A07;
        if (c2ec == null) {
            return null;
        }
        return c2ec.C72();
    }

    @Override // X.InterfaceC163837Ux
    public final String C7l() {
        C2EC c2ec = this.A07;
        c2ec.getClass();
        return c2ec.C7l();
    }

    @Override // X.InterfaceC163837Ux
    public final Map C7o() {
        C2EC c2ec = this.A07;
        if (c2ec == null) {
            return null;
        }
        return c2ec.C7n();
    }

    @Override // X.InterfaceC163837Ux
    public final String C7q() {
        C2EC c2ec = this.A07;
        if (c2ec != null) {
            return c2ec.C7q();
        }
        return null;
    }

    @Override // X.InterfaceC163857Uz
    public final C161577Ls CDC() {
        AbstractC161567Lr abstractC161567Lr;
        C83403nh c83403nh;
        java.util.Set<C4H9> set;
        boolean z = false;
        if (this.A07 != null) {
            z = true;
        }
        if (z) {
            C7TT C7W = C7W();
            C2DS c2ds = this.A0O;
            DirectThreadKey B90 = B90();
            C2DU c2du = (C2DU) c2ds;
            synchronized (c2du) {
                C4GV A0P = c2du.A0P(B90);
                if (A0P != null) {
                    synchronized (A0P) {
                        List A04 = C4GV.A04(A0P);
                        InterfaceC28041Xi interfaceC28041Xi = A0P.A0D;
                        c83403nh = (C83403nh) AnonymousClass483.A01(interfaceC28041Xi, A04);
                        List<C83403nh> list = A0P.A0L;
                        C83403nh c83403nh2 = (C83403nh) AnonymousClass483.A01(interfaceC28041Xi, list);
                        if (c83403nh2 != null) {
                            for (C83403nh c83403nh3 : list) {
                                if (c83403nh3.C8i() > c83403nh2.C8i() && interfaceC28041Xi.apply(c83403nh3)) {
                                    c83403nh2 = c83403nh3;
                                }
                            }
                            if (c83403nh != null) {
                                Comparator comparator = C93394Gs.A05;
                                C14360o3.A0B(comparator, 2);
                                if (comparator.compare(c83403nh2, c83403nh) < 0) {
                                    c83403nh2 = c83403nh;
                                }
                                c83403nh = c83403nh2;
                            } else {
                                c83403nh = null;
                            }
                        }
                    }
                } else {
                    c83403nh = null;
                }
            }
            int i = C7W.A08;
            abstractC161567Lr = null;
            if (i != 29 && i != 62 && i != 61) {
                C2EC c2ec = this.A07;
                if (c2ec != null) {
                    ArrayList arrayList = new ArrayList();
                    C81663kb c81663kb = (C81663kb) c2ec;
                    if (((Boolean) c81663kb.A05.getValue()).booleanValue()) {
                        ReentrantReadWriteLock.ReadLock readLock = c81663kb.A03.readLock();
                        readLock.lock();
                        try {
                            set = c81663kb.A01.A2H;
                        } finally {
                            readLock.unlock();
                        }
                    } else {
                        C80693iy c80693iy = c81663kb.A01;
                        synchronized (c80693iy) {
                            set = c80693iy.A2H;
                        }
                    }
                    if (set != null) {
                        for (C4H9 c4h9 : set) {
                            long j = c4h9.A00;
                            UserSession userSession = this.A0G;
                            C2EC c2ec2 = this.A07;
                            java.util.Set<String> set2 = c4h9.A02;
                            HashSet hashSet = new HashSet();
                            HashMap CDu = c2ec2.CDu();
                            for (String str : set2) {
                                User CDl = c2ec2.CDl(str);
                                if (CDl == null) {
                                    CDl = AnonymousClass189.A00(userSession).A02(str);
                                }
                                AbstractC81003jU abstractC81003jU = (AbstractC81003jU) CDu.get(str);
                                if (CDl != null && abstractC81003jU != null) {
                                    hashSet.add(new C206419By(CDl.Bhu(), AbstractC101904i3.A08(CDl), abstractC81003jU.A00));
                                }
                            }
                            arrayList.add(new C1575475o(c4h9.A01, hashSet, j));
                        }
                        abstractC161567Lr = new C161557Lq(arrayList);
                    }
                }
            } else if (c83403nh != null && c83403nh.A0h() != null && (i != 29 || !C7W.A0s || !((Boolean) this.A05.A1J.getValue()).booleanValue())) {
                int i2 = C7W.A06;
                String A0h = c83403nh.A0h();
                long C8i = c83403nh.C8i();
                c83403nh.A0D();
                if (c83403nh.A1P != null) {
                    c83403nh.C8i();
                }
                abstractC161567Lr = new JW1(i2, A0h, C8i);
            }
        } else {
            abstractC161567Lr = null;
        }
        return new C161577Ls(abstractC161567Lr, null, false);
    }

    @Override // X.InterfaceC163837Ux
    public final boolean CM7(String str) {
        C2EC c2ec = this.A07;
        c2ec.getClass();
        if (c2ec.CDl(str) == null) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC163837Ux
    public final boolean CPb(String str) {
        C2EC c2ec = this.A07;
        c2ec.getClass();
        return c2ec.Aa2().contains(str);
    }

    @Override // X.InterfaceC163837Ux
    public final boolean CPl() {
        C2EC c2ec = this.A07;
        if (c2ec != null && c2ec.CPl()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC163837Ux
    public final boolean CRx() {
        C2EC c2ec = this.A07;
        if (c2ec != null && c2ec.CS1()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC163837Ux
    public final boolean CT8() {
        C2EC c2ec = this.A07;
        Capabilities capabilities = this.A0H;
        UserSession userSession = this.A0G;
        if (!AbstractC31236DoJ.A00(userSession, capabilities, c2ec)) {
            if (!C6X6.A0B(userSession, C7W(), C7i() instanceof InterfaceC83703oF)) {
                return false;
            }
        }
        C7O4 c7o4 = this.A0I;
        if (c7o4 != null && c7o4.A03()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC163837Ux
    public final boolean CTV() {
        C2EC c2ec = this.A07;
        if (AbstractC31236DoJ.A00(this.A0G, this.A0H, c2ec)) {
            C7O4 c7o4 = this.A0I;
            if (c7o4 != null && c7o4.A03()) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC163837Ux
    public final boolean CUy() {
        C2EC c2ec = this.A07;
        c2ec.getClass();
        if (c2ec.C7S() == 1) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC163837Ux
    public final boolean CVY() {
        C2EC c2ec = this.A07;
        if (c2ec != null && c2ec.CVQ()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC163837Ux
    public final boolean CWI() {
        if (this.A07 != null) {
            if (AbstractC31224Do7.A04(this.A07.BSH(), CaB(), this.A07.CVQ())) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC163837Ux
    public final boolean CWO() {
        C2EC c2ec;
        if (this.A0H.A00(EnumC2054697t.A15) && (c2ec = this.A07) != null && c2ec.CWO()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC163857Uz
    public final boolean CWY() {
        return this.A0F;
    }

    @Override // X.InterfaceC163837Ux
    public final boolean CX1() {
        C2EC c2ec = this.A07;
        c2ec.getClass();
        return c2ec.CX1();
    }

    @Override // X.InterfaceC163837Ux
    public final boolean CXl() {
        C2EC c2ec;
        if (this.A09 == null && (c2ec = this.A07) != null && c2ec.C7I() == null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC163837Ux
    public final boolean CXz() {
        C2EC c2ec = this.A07;
        if (c2ec != null && c2ec.CXz()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC163837Ux
    public final boolean CYt(String str) {
        C2EC c2ec = this.A07;
        c2ec.getClass();
        List BKN = c2ec.BKN();
        if (BKN != null && BKN.contains(str)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC163837Ux
    public final boolean CZc() {
        C2EC c2ec = this.A07;
        if (c2ec != null && AbstractC31225Do8.A00(c2ec)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC163837Ux
    public final boolean CaB() {
        C2EC c2ec = this.A07;
        if (c2ec != null && c2ec.isPending()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC163837Ux
    public final boolean CaC() {
        C81543kP c81543kP;
        C2EC c2ec = this.A07;
        if (c2ec != null && (c81543kP = ((C81663kb) c2ec).A01.A0t) != null) {
            return c81543kP.A0N;
        }
        return false;
    }

    @Override // X.InterfaceC163837Ux
    public final boolean CdS() {
        C2EC c2ec = this.A07;
        if (c2ec != null && c2ec.CdS()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC163837Ux
    public final boolean CeQ() {
        if (this.A07 == null) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC163837Ux
    public final boolean CeW() {
        this.A07.getClass();
        return AbstractC31224Do7.A03(this.A07.BSH(), CVY());
    }

    @Override // X.InterfaceC163837Ux
    public final boolean Cf6() {
        C2EC c2ec = this.A07;
        if (c2ec != null) {
            if (c2ec.CXz() || this.A07.CM5() || this.A07.CM2() || this.A07.CM3()) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
    
        if (r5.A0M.A0H != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0029, code lost:
    
        if (r4 == (-1)) goto L18;
     */
    @Override // X.InterfaceC163857Uz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Chf() {
        /*
            r5 = this;
            X.7WD r3 = r5.A0L
            X.7W4 r2 = r3.A00
            com.instagram.direct.messagethread.store.intf.MessageListLayoutManager r0 = r2.A0B
            if (r0 == 0) goto L57
            int r4 = r0.A1b()
        Lc:
            X.7VB r1 = r5.A06
            boolean r0 = r1.A03
            if (r0 != 0) goto L1e
            boolean r0 = r1.A02
            if (r0 != 0) goto L1e
            X.7K6 r0 = r5.A03
            if (r0 == 0) goto L4f
            int r0 = r0.A00
            if (r0 == 0) goto L4f
        L1e:
            r1 = 0
        L1f:
            X.2oe r0 = r2.A0U
            boolean r0 = r0.isResumed()
            if (r0 == 0) goto L2b
            r0 = -1
            r2 = 1
            if (r4 != r0) goto L2c
        L2b:
            r2 = 0
        L2c:
            if (r1 == 0) goto L4e
            X.7VB r1 = r5.A06
            boolean r0 = r1.A00
            if (r0 == 0) goto L4e
            boolean r0 = r1.A01
            if (r0 != 0) goto L4e
            X.7Tr r0 = r5.A04
            if (r0 == 0) goto L4e
            boolean r0 = r3.A00()
            if (r0 == 0) goto L4e
            if (r2 == 0) goto L4e
            X.7O4 r0 = r5.A0I
            if (r0 == 0) goto L59
            boolean r0 = r0.A03()
            if (r0 == 0) goto L59
        L4e:
            return
        L4f:
            X.7Vx r0 = r5.A0M
            boolean r0 = r0.A0H
            r1 = 1
            if (r0 == 0) goto L1f
            goto L1e
        L57:
            r4 = -1
            goto Lc
        L59:
            X.75c r0 = new X.75c
            r0.<init>()
            r5.A0E(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C163827Uw.Chf():void");
    }

    @Override // X.InterfaceC163837Ux
    public final C2EC Co6() {
        return this.A07;
    }

    @Override // X.InterfaceC163857Uz
    public final void D7z(InterfaceC83713oG interfaceC83713oG) {
        C122145g6 c122145g6;
        final List list;
        AbstractC09800fd.A01("DirectThreadViewDataLoader.onCreate", -1870939497);
        try {
            InterfaceC83703oF A01 = AbstractC140946Yw.A01(interfaceC83713oG);
            this.A0D = A01;
            DirectThreadKey A012 = AbstractC140956Yx.A01(A01);
            InterfaceC83703oF interfaceC83703oF = this.A0D;
            C14360o3.A0B(interfaceC83703oF, 0);
            if (interfaceC83703oF instanceof C122145g6) {
                c122145g6 = (C122145g6) interfaceC83703oF;
            } else {
                c122145g6 = null;
            }
            String str = A012.A00;
            if (c122145g6 != null) {
                list = c122145g6.A00;
            } else {
                list = null;
            }
            A06(this, str);
            C46882Dc c46882Dc = this.A08;
            C9BQ A00 = C46882Dc.A00(c46882Dc, C05F.A01);
            c46882Dc.A00.markerAnnotate(78266157, A00.A02, "request_data_type", "MESSAGE_LIST");
            this.A00 = A00;
            UserSession userSession = this.A0G;
            C06090Tz c06090Tz = C06090Tz.A05;
            boolean A06 = C18U.A06(c06090Tz, userSession, 36330033140220549L);
            if (A06) {
                this.A01 = new InterfaceC41501vz() { // from class: X.LYS
                    @Override // X.InterfaceC41501vz
                    public final void onEvent(Object obj) {
                        C163827Uw c163827Uw = C163827Uw.this;
                        C163827Uw.A07(c163827Uw, list);
                        C163827Uw.A03(c163827Uw);
                        C163827Uw.A04(c163827Uw);
                    }
                };
                AbstractC25651Mw.A00(userSession).A01(this.A01, C2Im.class);
            }
            if (C18U.A06(c06090Tz, userSession, 36330033140286086L)) {
                this.A02 = new InterfaceC41501vz() { // from class: X.LYR
                    @Override // X.InterfaceC41501vz
                    public final void onEvent(Object obj) {
                        C163827Uw c163827Uw = C163827Uw.this;
                        C163827Uw.A07(c163827Uw, list);
                        if (c163827Uw.CeQ()) {
                            C163827Uw.A03(c163827Uw);
                        }
                        C163827Uw.A04(c163827Uw);
                    }
                };
                AbstractC25651Mw.A00(userSession).A01(this.A02, C4HA.class);
            }
            C28741aC c28741aC = ((C2DU) this.A0O).A0H;
            if (!c28741aC.A0F && !c28741aC.A0G) {
                this.A0N.Eml("THREAD_STORE_NOT_LOADED");
                if (!A06) {
                    this.A01 = new InterfaceC41501vz() { // from class: X.LYS
                        @Override // X.InterfaceC41501vz
                        public final void onEvent(Object obj) {
                            C163827Uw c163827Uw = C163827Uw.this;
                            C163827Uw.A07(c163827Uw, list);
                            C163827Uw.A03(c163827Uw);
                            C163827Uw.A04(c163827Uw);
                        }
                    };
                    AbstractC25651Mw.A00(userSession).A01(this.A01, C2Im.class);
                }
            } else {
                A09(str, list);
                boolean z = false;
                if (this.A07 != null) {
                    z = true;
                }
                InterfaceC164017Vq interfaceC164017Vq = this.A0N;
                if (z) {
                    C165887bG c165887bG = (C165887bG) interfaceC164017Vq;
                    C69613Av c69613Av = c165887bG.A00.A08;
                    if (c69613Av != null) {
                        c69613Av.A02();
                    }
                    AnonymousClass980 anonymousClass980 = c165887bG.A01.A07;
                    C226418s c226418s = anonymousClass980.A00;
                    c226418s.A0N(c226418s.A02, anonymousClass980.A01, AnonymousClass001.A0R(anonymousClass980.A02, "_prefetched"));
                    c165887bG.A02.accept(true);
                } else {
                    interfaceC164017Vq.Eml("THREAD_STORE_CACHE_MISS");
                }
                A0A(this.A0L.A00.A0j.A0O.CYr());
                A03(this);
                A04(this);
            }
            AbstractC09800fd.A00(2122550012);
        } catch (Throwable th) {
            AbstractC09800fd.A00(-2014128583);
            throw th;
        }
    }

    @Override // X.InterfaceC163857Uz
    public final void D8Q() {
        InterfaceC19630xq interfaceC19630xq;
        int i;
        C164087Vx c164087Vx = this.A0M;
        c164087Vx.A02(this);
        C2EC c2ec = this.A07;
        if (c2ec != null && C4GR.A01(c2ec.C7g()) && this.A07.BI1() != 8 && (i = (interfaceC19630xq = AbstractC2056298m.A00(this.A0G).A00).getInt("discoverable_chats_open_count", 0)) < 2) {
            InterfaceC19610xo ARD = interfaceC19630xq.ARD();
            ARD.E7D("discoverable_chats_open_count", i + 1);
            ARD.apply();
        }
        UserSession userSession = this.A0G;
        this.A03 = new C7K6(userSession, this, this);
        C14360o3.A0B(userSession, 0);
        C7K7 c7k7 = (C7K7) userSession.A01(C7K7.class, new C50165MDs(userSession, 20));
        c7k7.A00 = this.A04;
        this.A0A = c7k7;
        if (this.A07 != null) {
            C7O4 c7o4 = this.A0I;
            if ((c7o4 != null && c7o4.A03()) || C18U.A06(C06090Tz.A05, userSession, 36318033004599123L)) {
                return;
            }
            c164087Vx.A03(C7W(), this.A07.BKb());
        }
    }

    @Override // X.InterfaceC163857Uz
    public final void D9u(C44150JfF c44150JfF, C3o9 c3o9) {
        RecyclerView recyclerView;
        C4GV A0P;
        C34583FLs c34583FLs;
        int i;
        int i2;
        if (c3o9 != null) {
            C2DS c2ds = this.A0O;
            DirectThreadKey directThreadKey = (DirectThreadKey) c3o9;
            C2DU c2du = (C2DU) c2ds;
            C14360o3.A0B(directThreadKey, 0);
            C4GV A0P2 = c2du.A0P(directThreadKey);
            if (A0P2 != null && A0P2.A0V()) {
                C2DU.A0F(c2du, A0P2);
            }
            if (C18U.A06(C06090Tz.A05, c2du.A0A, 2342168601358841020L) && (A0P = c2du.A0P(directThreadKey)) != null) {
                synchronized (A0P) {
                    C81663kb c81663kb = A0P.A0I;
                    c34583FLs = null;
                    if (c81663kb.CZe()) {
                        HashMap CDu = c81663kb.CDu();
                        String C7I = c81663kb.C7I();
                        if (CDu.size() >= 2 && C7I != null) {
                            List<C83403nh> list = A0P.A0K;
                            long currentTimeMillis = System.currentTimeMillis();
                            synchronized (C93394Gs.class) {
                                C14360o3.A0B(list, 1);
                                String A05 = C93394Gs.A05(CDu);
                                if (A05 != null) {
                                    ArrayList arrayList = new ArrayList();
                                    C83403nh c83403nh = null;
                                    FNP fnp = null;
                                    loop0: while (true) {
                                        i = 0;
                                        for (C83403nh c83403nh2 : list) {
                                            String A0h = c83403nh2.A0h();
                                            if (A0h != null) {
                                                if (A0h.compareTo(A05) > 0) {
                                                    break loop0;
                                                }
                                                Integer A0a = c83403nh2.A0a();
                                                if (A0a != C05F.A00 || fnp == null) {
                                                    if (A0a == C05F.A01 && c83403nh2.A0e() == null) {
                                                        if (c83403nh == null || !C14360o3.A0K(c83403nh.A1M, c83403nh2.A1M)) {
                                                            if (fnp != null) {
                                                                C93394Gs.A06(fnp, c83403nh, arrayList, i);
                                                                i = 0;
                                                            }
                                                            Long l = c83403nh2.A1M;
                                                            if (l != null) {
                                                                i2 = (int) l.longValue();
                                                            } else {
                                                                i2 = 0;
                                                            }
                                                            String str = c83403nh2.A1j;
                                                            if (str == null) {
                                                                str = "";
                                                            }
                                                            fnp = new FNP();
                                                            fnp.A00 = 0;
                                                            fnp.A02 = "";
                                                            fnp.A03 = "";
                                                            fnp.A01 = i2;
                                                            fnp.A04 = A0h;
                                                            fnp.A05 = str;
                                                        }
                                                        Long valueOf = Long.valueOf(currentTimeMillis);
                                                        synchronized (c83403nh2) {
                                                            C83403nh.A0C(c83403nh2, valueOf, c83403nh2.A1M);
                                                        }
                                                        i++;
                                                        c83403nh = c83403nh2;
                                                    }
                                                }
                                            }
                                        }
                                        C93394Gs.A06(fnp, c83403nh, arrayList, i);
                                        fnp = null;
                                    }
                                    if (fnp != null) {
                                        C93394Gs.A06(fnp, c83403nh, arrayList, i);
                                    }
                                    if (!arrayList.isEmpty()) {
                                        c34583FLs = new C34583FLs();
                                        c34583FLs.A01 = C7I;
                                        c34583FLs.A03 = arrayList;
                                        c34583FLs.A00 = currentTimeMillis;
                                    }
                                }
                            }
                        }
                    }
                }
                if (c34583FLs != null) {
                    C7U0 c7u0 = c44150JfF.A00.A08;
                    if (c7u0 == null) {
                        C14360o3.A0F("clientInfra");
                        throw C00O.createAndThrow();
                    }
                    c7u0.C78().Cmu(c34583FLs);
                    c2ds.F8e(directThreadKey);
                }
            }
            C4GV A0P3 = c2du.A0P(directThreadKey);
            if (A0P3 != null && A0P3.A0W()) {
                C2DU.A0F(c2du, A0P3);
            }
        }
        C7J0 c7j0 = this.A0C;
        if (c7j0 != null) {
            c7j0.A02();
            this.A0C = null;
        }
        if (this.A01 != null) {
            AbstractC25651Mw.A00(this.A0G).A02(this.A01, C2Im.class);
        }
        if (this.A02 != null) {
            A04(this);
        }
        C7K7 c7k7 = this.A0A;
        if (c7k7 != null) {
            c7k7.A00 = null;
        }
        this.A0A = null;
        this.A08.A02(this.A00, (short) 615);
        C7O4 c7o4 = this.A0I;
        if (c7o4 != null) {
            c7o4.A0D.clear();
            c7o4.A03 = null;
            C1I4 c1i4 = c7o4.A00;
            if (c1i4 != null && (recyclerView = c7o4.A01) != null) {
                recyclerView.A15(c1i4);
            }
            c7o4.A01 = null;
        }
        C7VA c7va = this.A0W;
        if (C6CB.A02(c7va.A01.A00, 36315928476061494L)) {
            c7va.A02();
        }
        this.A0V.A01();
    }

    @Override // X.C7V1
    public final void DTN(final List list) {
        C11T.A02(new Runnable() { // from class: X.7K3
            @Override // java.lang.Runnable
            public final void run() {
                C163827Uw c163827Uw = C163827Uw.this;
                c163827Uw.A04.A0Y(list);
            }
        });
    }

    @Override // X.InterfaceC163857Uz
    public final void E40() {
        throw new IllegalStateException("pendingSendInserted not implemented for DirectThreadViewDataLoader");
    }

    @Override // X.InterfaceC163857Uz
    public final void EJh() {
        this.A0M.A08.A01 = -1L;
    }

    @Override // X.InterfaceC163857Uz
    public final void EJv() {
        this.A0M.A04 = true;
    }

    @Override // X.InterfaceC163857Uz
    public final void EK6(boolean z) {
        if (z) {
            EJv();
        }
        C164087Vx c164087Vx = this.A0M;
        DirectThreadKey B90 = B90();
        C7TT C7W = C7W();
        C14360o3.A0B(C7W, 1);
        c164087Vx.A04(C7W, B90);
    }

    @Override // X.InterfaceC163837Ux
    public final boolean Eje() {
        if (!this.A0E) {
            C2EC c2ec = this.A07;
            if (c2ec != null) {
                boolean isPending = c2ec.isPending();
                boolean CVQ = this.A07.CVQ();
                if (AbstractC31224Do7.A02(this.A07.BSH(), this.A07.BT2(), isPending, CVQ)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // X.C7V0
    public final ArrayList EqQ(C7TT c7tt, List list) {
        UserSession userSession = this.A0G;
        C14360o3.A0B(userSession, 0);
        ((C159447Df) userSession.A01(C159447Df.class, new C50165MDs(userSession, 19))).A01(list);
        C164097Vy c164097Vy = this.A0Z;
        C2EC c2ec = this.A07;
        c2ec.getClass();
        C7VF c7vf = this.A0c;
        return c164097Vy.A00(this.A0a, this.A05, this.A0b, c7tt, c2ec, c7vf, list);
    }

    @Override // X.InterfaceC163857Uz
    public final void FBJ(boolean z) {
        C7VB c7vb = this.A06;
        A08(this, c7vb.A02, c7vb.A03, false, A0G(z));
    }

    @Override // X.InterfaceC163857Uz
    public final void onDestroyView() {
        C7K6 c7k6 = this.A03;
        c7k6.getClass();
        c7k6.A01 = true;
        C164087Vx c164087Vx = this.A0M;
        c164087Vx.A01 = null;
        c164087Vx.A02 = null;
        c164087Vx.A03 = null;
    }

    @Override // X.InterfaceC163857Uz
    public final void onPause() {
        C25671My A00 = AbstractC25651Mw.A00(this.A0G);
        A00.A02(this.A0S, C2Io.class);
        A00.A02(this.A0P, C7M9.class);
        A00.A02(this.A0Q, C7MA.class);
        A00.A02(this.A0R, C7MB.class);
    }

    @Override // X.InterfaceC163857Uz
    public final void onResume() {
        UserSession userSession = this.A0G;
        IGFOAMessagingLocalSendSpeedLoggingController A00 = C7N0.A00(userSession);
        A00.onResumeThreadView();
        if (this.A07 == null) {
            C7VB c7vb = this.A06;
            A08(this, false, c7vb.A03, c7vb.A01, c7vb.A00);
            if (A0B()) {
                Chf();
            }
        } else {
            C7O4 c7o4 = this.A0I;
            if (c7o4 == null || !c7o4.A03()) {
                A00.onLogSnapshotMessagesStart();
                this.A0U.accept(C7W());
                C2EC c2ec = this.A07;
                c2ec.getClass();
                DirectThreadKey BKb = c2ec.BKb();
                C164087Vx c164087Vx = this.A0M;
                C7TT C7W = C7W();
                C14360o3.A0B(C7W, 1);
                c164087Vx.A04(C7W, BKb);
                A00.onLogSnapshotMessagesEnd();
            }
        }
        C25671My A002 = AbstractC25651Mw.A00(userSession);
        A002.A01(this.A0S, C2Io.class);
        A002.A01(this.A0P, C7M9.class);
        A002.A01(this.A0Q, C7MA.class);
        A002.A01(this.A0R, C7MB.class);
    }

    public C163827Uw(UserSession userSession, Capabilities capabilities, C7O4 c7o4, C7XE c7xe, C7WE c7we, C7WD c7wd, C164087Vx c164087Vx, C163807Uu c163807Uu, C98K c98k, AnonymousClass988 anonymousClass988, C7VV c7vv, C7VF c7vf, InterfaceC164017Vq interfaceC164017Vq, C2DS c2ds, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A0G = userSession;
        this.A0H = capabilities;
        this.A0c = c7vf;
        this.A05 = anonymousClass988;
        this.A0M = c164087Vx;
        this.A0g = z;
        this.A0E = z2;
        this.A0d = str;
        this.A0O = c2ds;
        this.A0e = str2;
        this.A0f = z3;
        this.A0h = z4;
        this.A0I = c7o4;
        this.A0L = c7wd;
        this.A0b = c7vv;
        this.A0J = c7xe;
        this.A0K = c7we;
        this.A0N = interfaceC164017Vq;
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        this.A0W = new C7VA(c006802i, C6CE.A00(userSession), C0BQ.A00(userSession));
        this.A08 = AbstractC46872Db.A00(C006802i.A0p, userSession);
        this.A0X = c163807Uu;
        this.A06 = new C7VB(true, false, false, false);
        C7O4 c7o42 = this.A0I;
        if (c7o42 != null) {
            c7o42.A0D.add(new C7OW(this));
        }
        this.A0B = new C7V4(userSession, this.A05);
        this.A0Z = (C164097Vy) userSession.A01(C164097Vy.class, new C50252MHh(userSession, 15));
        this.A0a = c98k;
    }

    private C77R A00(boolean z) {
        String str;
        AbstractC72482Xek abstractC72482Xek = null;
        if (!CTV() || this.A07 == null) {
            return null;
        }
        if (z != CWO()) {
            if (!z) {
                abstractC72482Xek = XZT.A00;
            } else {
                abstractC72482Xek = XZU.A00;
            }
        }
        boolean CWO = CWO();
        if (CWO()) {
            C2EC c2ec = this.A07;
            c2ec.getClass();
            str = c2ec.BuX();
        } else {
            str = null;
        }
        return new C77R(abstractC72482Xek, BsB(false), str, CWO, z);
    }

    public static List A01(C2EC c2ec) {
        if (c2ec.C7g() == 29 && c2ec.BKN() != null) {
            return c2ec.BKN();
        }
        return Collections.emptyList();
    }

    public static void A07(C163827Uw c163827Uw, List list) {
        c163827Uw.A09(c163827Uw.C7I(), list);
        if (c163827Uw.A07 != null) {
            c163827Uw.A0N.EpH("THREAD_STORE_CACHE_HIT");
        }
        c163827Uw.A0A(c163827Uw.A0L.A00.A0j.A0O.CYr());
    }

    public static void A08(C163827Uw c163827Uw, boolean z, boolean z2, boolean z3, boolean z4) {
        C11T.A00();
        C7VB c7vb = new C7VB(z, z2, z3, z4);
        c163827Uw.A06 = c7vb;
        C163547Tr c163547Tr = c163827Uw.A04;
        AbstractC13660ms A0R = c163547Tr.A0R();
        C7VB c7vb2 = c163547Tr.A0B;
        if (c7vb2 == null) {
            C14360o3.A0F("previousLoadMoreViewModel");
            throw C00O.createAndThrow();
        }
        int A00 = AbstractC13660ms.A00(A0R, c7vb2, 4);
        if (A00 != -1) {
            c163547Tr.A0W(c7vb, A00);
        }
        c163547Tr.A0B = c7vb;
    }

    public final void A0E(final InterfaceC2056798r interfaceC2056798r) {
        String C7I = C7I();
        if (C7I == null) {
            C0w9.A03("DirectMessageLoaderImpl_loadMore", "Cannot paginate on an unconfirmed thread.");
        } else {
            if (this.A0C != null) {
                return;
            }
            this.A0C = C28811aJ.A00(this.A0G).A08(ThreadFetchReason.DIRECT_THREAD_VIEW_LOAD_MORE_FROM_NETWORK, new InterfaceC2056798r() { // from class: X.75d
                @Override // X.InterfaceC2056798r
                public final void Dn9(C7J1 c7j1) {
                    C163827Uw c163827Uw = C163827Uw.this;
                    InterfaceC2056798r interfaceC2056798r2 = interfaceC2056798r;
                    C7J0 c7j0 = (C7J0) c7j1;
                    c163827Uw.Dn9(c7j0);
                    interfaceC2056798r2.Dn9(c7j0);
                }
            }, C7I, false);
            C7VB c7vb = this.A06;
            A08(this, c7vb.A02, true, false, c7vb.A00);
        }
    }

    @Override // X.InterfaceC163837Ux
    public final InterfaceC83733oI B6k() {
        return CCa();
    }

    @Override // X.InterfaceC163837Ux
    public final C3o9 B6l() {
        return B90();
    }

    @Override // X.InterfaceC163837Ux
    public final Integer BuZ() {
        return C7W().A0S;
    }

    @Override // X.InterfaceC163837Ux
    public final InterfaceC83713oG C7i() {
        InterfaceC83733oI CCa = CCa();
        if (CCa == null) {
            InterfaceC83703oF interfaceC83703oF = this.A0D;
            interfaceC83703oF.getClass();
            return interfaceC83703oF;
        }
        return CCa;
    }

    @Override // X.InterfaceC163837Ux
    public final InterfaceC83733oI CCa() {
        String C7I = C7I();
        if (C7I != null) {
            return new C83693oE(C7I);
        }
        return null;
    }

    @Override // X.InterfaceC163837Ux
    public final boolean CXo() {
        if (C7W().A02 == 1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0226, code lost:
    
        if (r35.A0M.A0H == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x018c, code lost:
    
        if (r0.CLS() == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a4, code lost:
    
        if (r1.A03 != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01c3, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r4, 36331119766946980L) == false) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a0  */
    @Override // X.C7V1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DTO(X.C7TT r36, java.util.List r37, long r38) {
        /*
            Method dump skipped, instructions count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C163827Uw.DTO(X.7TT, java.util.List, long):void");
    }
}
