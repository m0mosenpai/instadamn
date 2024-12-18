package X;

import android.app.Activity;
import android.os.Bundle;
import android.util.Pair;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.msys.mci.AuthData;
import com.instagram.comments.model.ChannelRepliesNotifData;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.thread.bottomsheet.activity.DirectThreadBottomSheetModalActivity;
import com.instagram.direct.model.launcher.AutoSendMessageData;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.model.direct.threadkey.impl.mixed.DirectMsysMixedThreadKey;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1nl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36881nl {
    public static C36871nk A13;
    public Fragment A00;
    public Fragment A01;
    public FragmentActivity A02;
    public C53S A03;
    public ChannelRepliesNotifData A04;
    public InterfaceC11380iw A05;
    public GXY A06;
    public AutoSendMessageData A07;
    public C189478aR A08;
    public InterfaceC1119353f A09;
    public InterfaceC59832oQ A0A;
    public InterfaceC83713oG A0B;
    public C7T3 A0C;
    public InterfaceC1119153d A0D;
    public Integer A0E;
    public Integer A0F;
    public Integer A0G;
    public Integer A0H;
    public Long A0I;
    public Long A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public String A0b;
    public String A0c;
    public String A0d;
    public String A0e;
    public String A0f;
    public String A0g;
    public String A0h;
    public ArrayList A0i;
    public List A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;
    public boolean A0u;
    public boolean A0v;
    public boolean A0w;
    public boolean A0x;
    public boolean A0y;
    public boolean A0z;
    public final Activity A10;
    public final UserSession A11;
    public final InterfaceC09390do A12;

    public static boolean A04(final C36881nl c36881nl, final InterfaceC83713oG interfaceC83713oG, AnonymousClass172 anonymousClass172) {
        if (anonymousClass172 != null) {
            C31594DuM c31594DuM = (C31594DuM) c36881nl.A12.getValue();
            Fragment fragment = c36881nl.A01;
            fragment.getClass();
            String str = c36881nl.A0Q;
            boolean z = c36881nl.A0x;
            return c31594DuM.A01(fragment, new InterfaceC37121GXg() { // from class: X.G74
                @Override // X.InterfaceC37121GXg
                public final void D7j() {
                    C36881nl.A03(C36881nl.this, interfaceC83713oG, 0);
                }
            }, anonymousClass172, str, "-1", 0, true, z, false, false, z);
        }
        return false;
    }

    public final C51C A05(FragmentActivity fragmentActivity, InterfaceC83713oG interfaceC83713oG) {
        Bundle A00 = A00(this, interfaceC83713oG, 0, false);
        UserSession userSession = this.A11;
        A00.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
        A00.putBoolean("bundle_extra_is_thread_launched_via_fragment", true);
        C51C c51c = (C51C) C6XL.A00(A00, fragmentActivity, userSession, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING);
        GXY gxy = this.A06;
        if (gxy != null) {
            gxy.Dsp();
        }
        return c51c;
    }

    public final void A07(FragmentActivity fragmentActivity, C31600DuS c31600DuS, InterfaceC83713oG interfaceC83713oG, int i, boolean z, boolean z2) {
        Bundle A00 = A00(this, interfaceC83713oG, 0, false);
        UserSession userSession = this.A11;
        A00.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
        A00.putBoolean("bundle_extra_omnipicker_is_chat_preview", z);
        A00.putBoolean("bundle_extra_omnipicker_creating_new_group", z2);
        C51C c51c = (C51C) C6XL.A00(A00, fragmentActivity, userSession, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING);
        if (c51c != null) {
            C14240no c14240no = new C14240no(fragmentActivity.mFragments.A00.A03);
            c14240no.A0A(c51c, i);
            c14240no.A0J(false);
            if (c31600DuS != null) {
                c51c.A01 = c31600DuS;
            }
        }
    }

    public final void A08(FragmentActivity fragmentActivity, InterfaceC83713oG interfaceC83713oG, float f) {
        Bundle A00 = A00(this, interfaceC83713oG, 0, true);
        UserSession userSession = this.A11;
        C51C c51c = (C51C) C6XL.A00(A00, fragmentActivity, userSession, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING);
        if (c51c != null) {
            C189448aO c189448aO = new C189448aO(userSession);
            c189448aO.A1I = true;
            c189448aO.A0T = c51c;
            if (f > 0.0f && f <= 1.0f) {
                c189448aO.A07 = 1;
                c189448aO.A03 = f;
                c189448aO.A0a = true;
            }
            c189448aO.A0U = this.A0D;
            c189448aO.A00().A02(fragmentActivity, c51c);
            GXY gxy = this.A06;
            if (gxy != null) {
                gxy.Dsp();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x02c1, code lost:
    
        if (r0 == 1013) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.os.Bundle A00(X.C36881nl r44, X.InterfaceC83713oG r45, int r46, boolean r47) {
        /*
            Method dump skipped, instructions count: 753
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36881nl.A00(X.1nl, X.3oG, int, boolean):android.os.Bundle");
    }

    public static C36881nl A01(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        boolean z = false;
        if (A13 != null) {
            z = true;
        }
        C18C.A0H(z, "Must call setInstanceSupplier first");
        C14360o3.A0B(activity, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(str, 2);
        C14360o3.A0B(interfaceC11380iw, 3);
        return new C36881nl(activity, interfaceC11380iw, userSession, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if ((!X.C18U.A06(X.C06090Tz.A06, r15, 36311560487764596L)) == false) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A03(X.C36881nl r16, X.InterfaceC83713oG r17, int r18) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36881nl.A03(X.1nl, X.3oG, int):void");
    }

    public final void A06() {
        int i;
        C23974Ak9 c23974Ak9;
        AnonymousClass172 anonymousClass172;
        boolean A04;
        C83693oE A00;
        AbstractC09800fd.A01("DirectThreadLauncherImpl.launch", -996110860);
        try {
            UserSession userSession = this.A11;
            if (C18U.A06(C06090Tz.A05, userSession, 36328942219313037L)) {
                AbstractC46760KmH.A00(AbstractC12290kX.A00, userSession);
            }
            final InterfaceC83713oG interfaceC83713oG = this.A0B;
            C18C.A07(interfaceC83713oG, "Missing ThreadTarget");
            if (this.A0t) {
                InterfaceC83703oF A02 = AbstractC140946Yw.A02(interfaceC83713oG);
                if (A02 != null && (A00 = AbstractC140956Yx.A00(A02)) != null) {
                    Activity activity = this.A10;
                    C12260kU.A0C(activity, AbstractC34770FTt.A01(activity, userSession.userId, A00.A00, this.A0X, this.A0Q, "ds", null));
                } else {
                    InterfaceC2056098k A042 = AbstractC140946Yw.A04(interfaceC83713oG);
                    if (A042 == null || !(A042 instanceof MsysThreadId) || ((MsysThreadId) A042) == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected DirectThreadId or MsysThreadId: ");
                        sb.append(interfaceC83713oG);
                        throw new IllegalStateException(sb.toString());
                    }
                    throw new IllegalStateException("Stub");
                }
            } else if (this.A0n) {
                C3o9 A06 = AbstractC140946Yw.A06(interfaceC83713oG);
                final InterfaceC2056098k A043 = AbstractC140946Yw.A04(interfaceC83713oG);
                i = 0;
                if (A06 != null && (A06 instanceof DirectThreadKey)) {
                    C31594DuM c31594DuM = (C31594DuM) this.A12.getValue();
                    Fragment fragment = this.A01;
                    fragment.getClass();
                    A04 = c31594DuM.A00(fragment, new InterfaceC37121GXg() { // from class: X.G75
                        @Override // X.InterfaceC37121GXg
                        public final void D7j() {
                            C36881nl.A03(C36881nl.this, interfaceC83713oG, 0);
                        }
                    }, JRE.A01(A06), this.A0Q);
                } else {
                    if (A043 != null) {
                        if ((A043 instanceof C23974Ak9) && (c23974Ak9 = (C23974Ak9) A043) != null) {
                            List list = c23974Ak9.A02;
                            if (list.size() == 1) {
                                anonymousClass172 = (AnonymousClass172) list.get(0);
                            } else {
                                anonymousClass172 = null;
                            }
                            A04 = A04(this, interfaceC83713oG, anonymousClass172);
                        } else {
                            MsysThreadId A044 = JRE.A04(A06);
                            if (A044 != null) {
                                C41761wQ.A00().A02(C137746Lw.A00(userSession, "DirectThreadLauncherImpl").A01.A01(A044).A0K(new C6D2() { // from class: X.Fyd
                                    @Override // X.C6D2
                                    public final Object apply(Object obj) {
                                        return Pair.create(AnonymousClass618.A00(C36881nl.this.A11), new C49205LpM((C45311K3o) obj));
                                    }
                                }).A0G(), new InterfaceC42241xE() { // from class: X.GJr
                                    @Override // X.InterfaceC42241xE
                                    public final void accept(Object obj) {
                                        C36881nl c36881nl = C36881nl.this;
                                        InterfaceC2056098k interfaceC2056098k = A043;
                                        Pair pair = (Pair) obj;
                                        AuthData authData = (AuthData) pair.first;
                                        InterfaceC37233Gai interfaceC37233Gai = (InterfaceC37233Gai) pair.second;
                                        if (interfaceC37233Gai.getCount() == 2) {
                                            for (int i2 = 0; i2 < interfaceC37233Gai.getCount(); i2++) {
                                                String BFh = interfaceC37233Gai.BFh(i2);
                                                UserSession userSession2 = c36881nl.A11;
                                                if (!userSession2.userId.equals(BFh) && !C36881nl.A04(c36881nl, interfaceC2056098k, FUZ.A00(authData, interfaceC37233Gai, AnonymousClass189.A00(userSession2), i2))) {
                                                    C36881nl.A03(c36881nl, interfaceC2056098k, 0);
                                                }
                                            }
                                            return;
                                        }
                                        C36881nl.A03(c36881nl, interfaceC2056098k, 0);
                                    }
                                });
                            } else {
                                throw new IllegalStateException("Expected DirectThreadId, DirectPendingRecipients, MsysThreadKey, or MsysPendingRecipients");
                            }
                        }
                    }
                    A03(this, interfaceC83713oG, i);
                }
                if (!A04) {
                    A03(this, interfaceC83713oG, i);
                }
            } else {
                String str = this.A0T;
                String str2 = this.A0R;
                if (str != null) {
                    InterfaceC83713oG interfaceC83713oG2 = this.A0B;
                    C18C.A07(interfaceC83713oG2, "Missing ThreadTarget");
                    C1ON A0B = AbstractC47995LLh.A0B(userSession, str, this.A0U, str2);
                    A0B.A00 = new C32534EUk(this, interfaceC83713oG2, str);
                    C1GJ.A03(A0B);
                } else {
                    i = 0;
                    A03(this, interfaceC83713oG, i);
                }
            }
            AbstractC09800fd.A00(1803113865);
        } catch (Throwable th) {
            AbstractC09800fd.A00(-728976260);
            throw th;
        }
    }

    @Deprecated
    public final void A09(C3o9 c3o9) {
        InterfaceC83713oG A04;
        if (c3o9 == null) {
            this.A0B = null;
            return;
        }
        DirectThreadKey A02 = JRE.A02(c3o9);
        if (A02 != null) {
            A04 = AbstractC83823oR.A00(A02);
            if (A04 == null) {
                C0w9.A03("DirectThreadLauncher_setThreadKey", "DirectThreadKey missing threadId");
                return;
            }
        } else {
            A04 = JRE.A04(c3o9);
            if (A04 == null) {
                if (c3o9 instanceof DirectMsysMixedThreadKey) {
                    DirectMsysMixedThreadKey directMsysMixedThreadKey = (DirectMsysMixedThreadKey) c3o9;
                    String str = directMsysMixedThreadKey.A00.A00;
                    str.getClass();
                    A04 = new C163787Us(new C83693oE(str), directMsysMixedThreadKey.A01);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expected DirectThreadKey, MsysThreadId or directMsysMixedThreadTarget: ");
                    sb.append(c3o9);
                    throw new IllegalStateException(sb.toString());
                }
            }
        }
        this.A0B = A04;
    }

    @Deprecated
    public final void A0A(String str) {
        C83693oE c83693oE;
        if (str == null) {
            c83693oE = null;
        } else {
            c83693oE = new C83693oE(str);
        }
        this.A0B = c83693oE;
    }

    @Deprecated
    public final void A0B(List list) {
        C122145g6 c122145g6;
        if (list == null) {
            c122145g6 = null;
        } else if (this.A0B != null) {
            return;
        } else {
            c122145g6 = new C122145g6(list);
        }
        this.A0B = c122145g6;
    }

    public C36881nl(final Activity activity, final InterfaceC11380iw interfaceC11380iw, final UserSession userSession, String str) {
        this.A0w = false;
        this.A0r = false;
        this.A0y = false;
        this.A08 = null;
        this.A0l = false;
        this.A0A = new C36537G9j(this);
        this.A0m = false;
        this.A0q = false;
        this.A0L = null;
        this.A0i = null;
        this.A0u = false;
        this.A0v = false;
        this.A0d = null;
        this.A0p = false;
        this.A10 = activity;
        this.A11 = userSession;
        this.A0Q = str;
        this.A12 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.M97
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return AbstractC31593DuL.A00(activity, interfaceC11380iw, userSession);
            }
        });
    }

    public static C6XJ A02(C36881nl c36881nl, InterfaceC83713oG interfaceC83713oG, float f, int i, boolean z) {
        Class cls;
        String str;
        Bundle A00 = A00(c36881nl, interfaceC83713oG, i, z);
        if (z && f > 0.0f && f <= 1.0f) {
            A00.putFloat("direct_thread_bottom_sheet_fragment_height_ratio", f);
        }
        A00.putString("direct_thread_bottom_sheet_fragment_fragment", "fragment_thread");
        UserSession userSession = c36881nl.A11;
        if (z) {
            cls = DirectThreadBottomSheetModalActivity.class;
            str = "direct_in_bottom_sheet";
        } else {
            cls = ModalActivity.class;
            str = RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING;
        }
        C6XJ c6xj = new C6XJ(c36881nl.A10, A00, userSession, cls, str);
        if (c36881nl.A0s && C2U7.A00) {
            c6xj.A08();
        } else {
            c6xj.A0J = ModalActivity.A08;
        }
        C53S c53s = c36881nl.A03;
        if (c53s != null) {
            c6xj.A01 = c53s;
        }
        if (!c36881nl.A0y) {
            c6xj.A05 = c36881nl.A0Q;
        }
        InterfaceC1119353f interfaceC1119353f = c36881nl.A09;
        if (interfaceC1119353f != null) {
            c6xj.A0E(interfaceC1119353f);
        }
        InterfaceC11380iw interfaceC11380iw = c36881nl.A05;
        if (interfaceC11380iw != null) {
            c6xj.A02 = interfaceC11380iw;
        }
        if (c36881nl.A0k) {
            c6xj.A08 = true;
        }
        c6xj.A0A = true;
        c6xj.A00 = 1;
        return c6xj;
    }

    public C36881nl() {
    }
}
