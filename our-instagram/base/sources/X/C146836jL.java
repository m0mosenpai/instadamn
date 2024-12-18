package X;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;

/* renamed from: X.6jL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C146836jL {
    public InterfaceC41501vz A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final DialogInterface.OnDismissListener A04;
    public final DialogInterface.OnDismissListener A05;
    public final CallerContext A06;
    public final UserSession A07;
    public final InterfaceC146936jV A08;
    public final InterfaceC146916jT A09;
    public final InterfaceC1118853a A0A;
    public final WeakReference A0B;
    public final InterfaceC09390do A0C;
    public final AbstractC018607g A0D;
    public final InterfaceC11380iw A0E;
    public final InterfaceC146876jP A0F;
    public final InterfaceC146856jN A0G;

    public C146836jL(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC1118853a interfaceC1118853a, WeakReference weakReference) {
        C14360o3.A0B(userSession, 1);
        this.A07 = userSession;
        this.A0B = weakReference;
        this.A0E = interfaceC11380iw;
        this.A0A = interfaceC1118853a;
        this.A06 = CallerContext.A01("ReelViewerFBShareManager");
        Object obj = weakReference.get();
        if (obj != null) {
            this.A0D = AbstractC018607g.A00((C07X) obj);
            this.A0C = AbstractC09440dt.A01(new C9E5(this, 22));
            this.A0G = new InterfaceC146856jN() { // from class: X.6jM
                @Override // X.InterfaceC146856jN
                public final void Dos() {
                }

                @Override // X.InterfaceC146856jN
                public final void Dp0() {
                }

                @Override // X.InterfaceC146856jN
                public final void CyQ(C82G c82g, C41181vS c41181vS) {
                    C146836jL c146836jL = C146836jL.this;
                    c146836jL.A03 = false;
                    C14360o3.A07(C0HM.A00().toString());
                    C146836jL.A00(c82g, EnumC201098ur.ACCEPT, c41181vS, c146836jL);
                    ((C195918ld) c146836jL.A0C.getValue()).A05(true, "ig_self_story");
                    if (c41181vS != null) {
                        C146836jL.A04(c41181vS, c146836jL);
                    }
                    ReelViewerFragment.A0I((ReelViewerFragment) c146836jL.A0A, false);
                }

                @Override // X.InterfaceC146856jN
                public final void D9P(C82G c82g, C41181vS c41181vS) {
                    C146836jL.A00(c82g, EnumC201098ur.DECLINE, c41181vS, C146836jL.this);
                }

                @Override // X.InterfaceC146856jN
                public final void DmS(C82G c82g, C41181vS c41181vS) {
                    C146836jL c146836jL = C146836jL.this;
                    c146836jL.A03 = false;
                    if (c41181vS != null) {
                        C146836jL.A04(c41181vS, c146836jL);
                    }
                    ReelViewerFragment.A0I((ReelViewerFragment) c146836jL.A0A, false);
                }
            };
            this.A0F = new InterfaceC146876jP() { // from class: X.6jO
                @Override // X.InterfaceC146876jP
                public final void DFP(EnumC76753cN enumC76753cN, C41181vS c41181vS) {
                    C146836jL c146836jL = C146836jL.this;
                    C38321qM c38321qM = c41181vS.A0b;
                    if (c38321qM != null) {
                        c38321qM.A4H(enumC76753cN);
                        c146836jL.A0A.ADf(false);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
            };
            this.A04 = new DialogInterface.OnDismissListener() { // from class: X.6jQ
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C146836jL c146836jL = C146836jL.this;
                    c146836jL.A02 = false;
                    c146836jL.A03 = false;
                    ReelViewerFragment.A0I((ReelViewerFragment) c146836jL.A0A, false);
                }
            };
            this.A05 = new DialogInterface.OnDismissListener() { // from class: X.6jR
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C146836jL c146836jL = C146836jL.this;
                    c146836jL.A03 = false;
                    ReelViewerFragment.A0I((ReelViewerFragment) c146836jL.A0A, false);
                }
            };
            this.A09 = new InterfaceC146916jT() { // from class: X.6jS
                @Override // X.InterfaceC146916jT
                public final void Dln(C41181vS c41181vS, C41551w4 c41551w4, Integer num, String str) {
                    C14360o3.A0B(num, 3);
                    C146836jL.this.A06(c41181vS, num);
                }

                @Override // X.InterfaceC146916jT
                public final void Dlh(C41181vS c41181vS, String str) {
                    C146836jL c146836jL = C146836jL.this;
                    c146836jL.A03 = false;
                    if (c41181vS != null) {
                        C146836jL.A04(c41181vS, c146836jL);
                    }
                }
            };
            this.A08 = new InterfaceC146936jV() { // from class: X.6jU
                @Override // X.InterfaceC146936jV
                public final void D6t() {
                    Fragment fragment;
                    Context context;
                    C146836jL c146836jL = C146836jL.this;
                    if (c146836jL.A01 && (fragment = (Fragment) c146836jL.A0B.get()) != null && (context = fragment.getContext()) != null) {
                        CallerContext callerContext = NVk.A02;
                        C55088Oal.A01(context, C05F.A0j, 0);
                    }
                }

                @Override // X.InterfaceC146936jV
                public final void onDismiss() {
                    Fragment fragment;
                    Context context;
                    C146836jL c146836jL = C146836jL.this;
                    if (c146836jL.A01 && (fragment = (Fragment) c146836jL.A0B.get()) != null && (context = fragment.getContext()) != null) {
                        CallerContext callerContext = NVk.A02;
                        C55088Oal.A01(context, C05F.A00, 0);
                    }
                }
            };
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.82I, X.0Zx] */
    public static final void A00(C82G c82g, EnumC201098ur enumC201098ur, C41181vS c41181vS, C146836jL c146836jL) {
        String str;
        C38321qM c38321qM;
        if (c82g != null) {
            UserSession userSession = c146836jL.A07;
            C82H c82h = C82H.A0d;
            ?? c0Zx = new C0Zx();
            c0Zx.A0A(Boolean.valueOf(c146836jL.A01));
            if (c41181vS != null && (c38321qM = c41181vS.A0b) != null) {
                str = c38321qM.getId();
            } else {
                str = null;
            }
            c0Zx.A06("ig_media_id", str);
            AbstractC201108us.A00(c82g, enumC201098ur, c82h, c0Zx, userSession);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r5.A13() == 19) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C82G r15, X.C41181vS r16, X.C146836jL r17) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146836jL.A01(X.82G, X.1vS, X.6jL):void");
    }

    public static final void A02(C82G c82g, C41181vS c41181vS, C146836jL c146836jL) {
        FragmentActivity activity;
        UserSession userSession = c146836jL.A07;
        int i = AbstractC23021Ah.A00(userSession).A01.getInt("self_story_sharing_option_dialog_show_times", 0);
        if (!C196008lp.A00(userSession)) {
            InterfaceC19610xo ARD = AbstractC23021Ah.A00(userSession).A01.ARD();
            ARD.E7D("self_story_sharing_option_dialog_show_times", i + 1);
            ARD.apply();
            Object obj = c146836jL.A0B.get();
            C14360o3.A0C(obj, AbstractC43591JPw.A00(0));
            new C55626OnB(c82g, (AbstractC59962oe) obj, userSession, c41181vS, c146836jL.A0G, C05F.A01, C196008lp.A00(userSession), ((C195918ld) c146836jL.A0C.getValue()).A06()).A01();
            A00(c82g, EnumC201098ur.VIEW, c41181vS, c146836jL);
            return;
        }
        Fragment fragment = (Fragment) c146836jL.A0B.get();
        if (fragment == null || (activity = fragment.getActivity()) == null) {
            return;
        }
        C55165OdT.A00(activity, c146836jL.A05, c82g, C82H.A02, userSession, c41181vS, c146836jL.A08, c146836jL.A09, c146836jL.A01);
    }

    public static final void A03(C41181vS c41181vS, C211849aB c211849aB, C146836jL c146836jL) {
        Integer num;
        Integer num2 = c211849aB.A00;
        if (num2 != null) {
            int intValue = num2.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue == 2) {
                        c146836jL.A05(C05F.A00);
                        return;
                    }
                    return;
                }
                num = C05F.A0j;
            } else {
                ((C195918ld) c146836jL.A0C.getValue()).A05(true, "ig_self_story");
                num = C05F.A0C;
            }
            c146836jL.A05(num);
            C14360o3.A07(C0HM.A00().toString());
            A04(c41181vS, c146836jL);
        }
    }

    private final void A05(Integer num) {
        Context context;
        if (this.A02) {
            this.A02 = false;
            ReelViewerFragment.A0I((ReelViewerFragment) this.A0A, false);
        }
        Fragment fragment = (Fragment) this.A0B.get();
        if (fragment != null && (context = fragment.getContext()) != null) {
            CallerContext callerContext = NVk.A02;
            C55088Oal.A01(context, num, 0);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0Zx, X.MnJ] */
    public final void A06(C41181vS c41181vS, Integer num) {
        C82G c82g;
        String str;
        EnumC72412Xd8 enumC72412Xd8;
        UserSession userSession = this.A07;
        if (!C196068lw.A03(C196068lw.A00(userSession).A00(this.A06)) && this.A00 == null) {
            C56031Ou3 c56031Ou3 = new C56031Ou3(c41181vS, this);
            this.A00 = c56031Ou3;
            AbstractC25651Mw.A00(userSession).A01(c56031Ou3, C211849aB.class);
        }
        if (num == C05F.A01) {
            c82g = C82G.A0i;
        } else if (this.A01) {
            c82g = C82G.A0g;
        } else {
            c82g = C82G.A0f;
        }
        MU0 mu0 = MU0.SHARE_CLICK;
        MU1 mu1 = MU1.STORY;
        ?? c0Zx = new C0Zx();
        C38321qM c38321qM = c41181vS.A0b;
        if (c38321qM != null) {
            str = c38321qM.getId();
        } else {
            str = null;
        }
        c0Zx.A06("media_id", str);
        AbstractC50568MTz.A00(mu0, mu1, c82g, c0Zx, userSession);
        if (c38321qM != null) {
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            long currentTimeMillis = System.currentTimeMillis();
            InterfaceC19610xo ARD = A00.A01.ARD();
            ARD.E7G("self_story_fb_button_last_action_time_stamp", currentTimeMillis);
            ARD.apply();
            if (!C180377zR.A07(userSession)) {
                A00(c82g, EnumC201098ur.ACCEPT, c41181vS, this);
                if (C18U.A06(C06090Tz.A05, userSession, 2342168103141520096L)) {
                    this.A02 = true;
                }
                Fragment fragment = (Fragment) this.A0B.get();
                this.A0A.EJE("dialog");
                C56727PFv c56727PFv = new C56727PFv(c82g, c41181vS, this);
                if (c82g == C82G.A0i) {
                    enumC72412Xd8 = EnumC72412Xd8.A0L;
                } else {
                    enumC72412Xd8 = EnumC72412Xd8.A0h;
                }
                EnumC53382NjX enumC53382NjX = EnumC53382NjX.A05;
                C14360o3.A0C(fragment, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
                enumC53382NjX.A06(fragment, userSession, c56727PFv, enumC72412Xd8);
                return;
            }
            A01(c82g, c41181vS, this);
        }
    }

    public static final void A04(C41181vS c41181vS, C146836jL c146836jL) {
        LinkedHashMap linkedHashMap;
        Context context;
        String obj = C0HM.A00().toString();
        C14360o3.A07(obj);
        UserSession userSession = c146836jL.A07;
        String str = ((C22F) AnonymousClass229.A01(userSession)).A04.A0L;
        PromptStickerModel A0K = c41181vS.A0K();
        if (A0K != null) {
            linkedHashMap = A0K.A06();
        } else {
            linkedHashMap = null;
        }
        AbstractC54107Nw5.A00(userSession, MSV.A00(116), "self_story", str, obj, linkedHashMap);
        if (!C180377zR.A03(userSession)) {
            C18920wW A01 = AbstractC12220kQ.A01(null, userSession);
            InterfaceC02590Ai A00 = A01.A00(A01.A00, "ig_business_story_to_fb_page");
            A00.AAP("logging_event_name", "story_cross_posted_from_biz_to_fb_without_page_linked");
            A00.Cht();
        }
        EnumC76753cN enumC76753cN = EnumC76753cN.A06;
        C38321qM c38321qM = c41181vS.A0b;
        if (c38321qM != null) {
            c38321qM.A4H(enumC76753cN);
            c146836jL.A0A.ADf(false);
            Fragment fragment = (Fragment) c146836jL.A0B.get();
            if (fragment != null && (context = fragment.getContext()) != null) {
                AbstractC018607g abstractC018607g = c146836jL.A0D;
                C1ON A002 = C55625OnA.A00(context, c146836jL.A0E, userSession, c41181vS, c146836jL.A0F, Boolean.valueOf(!c146836jL.A01), C05F.A0Y, obj, false);
                C14360o3.A07(A002);
                C1GJ.A00(context, abstractC018607g, A002);
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
