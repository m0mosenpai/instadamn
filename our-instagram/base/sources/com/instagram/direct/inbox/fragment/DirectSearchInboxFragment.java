package com.instagram.direct.inbox.fragment;

import X.AbstractC018607g;
import X.AbstractC09440dt;
import X.AbstractC111324zv;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC18680vv;
import X.AbstractC25225BEi;
import X.AbstractC25226BEj;
import X.AbstractC25230BEn;
import X.AbstractC25231BEo;
import X.AbstractC31171DnF;
import X.AbstractC31173DnH;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.AbstractC31178DnM;
import X.AbstractC31179DnN;
import X.AbstractC31282Dp4;
import X.AbstractC35257Fgr;
import X.AbstractC43591JPw;
import X.AbstractC53242c7;
import X.AbstractC54912fq;
import X.AbstractC59962oe;
import X.AbstractC60492pY;
import X.C00O;
import X.C05F;
import X.C06090Tz;
import X.C08790ch;
import X.C0B1;
import X.C0f9;
import X.C114795Gm;
import X.C14360o3;
import X.C18920wW;
import X.C18U;
import X.C1VN;
import X.C22P;
import X.C25805BbM;
import X.C27961Xa;
import X.C31226Do9;
import X.C31349DqE;
import X.C31446Drq;
import X.C31451Drv;
import X.C31650DvG;
import X.C31789Dy8;
import X.C32820EcO;
import X.C32873EdF;
import X.C34721FRi;
import X.C36010Fv8;
import X.C36065Fw1;
import X.C36303Fzy;
import X.C36305G0a;
import X.C36443G5s;
import X.C36444G5t;
import X.C36684GFe;
import X.C37013GSs;
import X.C3G2;
import X.C50170MDx;
import X.C50246MHb;
import X.C54922fr;
import X.C54P;
import X.C57112jm;
import X.C64842wi;
import X.C6XJ;
import X.C7NH;
import X.EnumC09460dv;
import X.EnumC33509Eri;
import X.EnumC33510Erj;
import X.FPJ;
import X.FUO;
import X.G1P;
import X.GCP;
import X.InterfaceC02590Ai;
import X.InterfaceC09390do;
import X.InterfaceC1119353f;
import X.InterfaceC132405yL;
import X.InterfaceC169517hR;
import X.InterfaceC41501vz;
import X.InterfaceC56362iU;
import X.InterfaceC59992oh;
import X.InterfaceC60122ou;
import X.InterfaceC72513My;
import X.LKW;
import X.ViewOnClickListenerC35666Fp0;
import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.DirectSearchResult;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.model.reels.Reel;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.List;

/* loaded from: classes6.dex */
public class DirectSearchInboxFragment extends AbstractC59962oe implements InterfaceC132405yL, InterfaceC1119353f, InterfaceC60122ou, InterfaceC72513My {
    public int A00;
    public RectF A01;
    public View A02;
    public C18920wW A03;
    public C32873EdF A05;
    public C36303Fzy A06;
    public C36010Fv8 A07;
    public C7NH A08;
    public C31349DqE A09;
    public DirectShareTarget A0A;
    public DirectThreadKey A0B;
    public String A0C;
    public String A0D;
    public boolean A0E;
    public C31226Do9 A0F;
    public C36305G0a A0G;
    public C64842wi A0H;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final InterfaceC09390do A0O;
    public final InterfaceC09390do A0P;
    public final InterfaceC41501vz A0R;
    public final String A0S;
    public TouchInterceptorFrameLayout localTouchInterceptorFrameLayout;
    public final InterfaceC09390do A0Q = AbstractC60492pY.A02(this);
    public C57112jm A04 = C57112jm.A00();
    public String A0I = "";
    public final FPJ A0N = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, X.AbstractC25230BEn.A0k(r6.A0Q, 0), 36320403824583112L) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int A00(int r7) {
        /*
            r6 = this;
            r5 = 0
            r0 = 40
            if (r7 != r0) goto L19
            X.0do r0 = r6.A0Q
            X.0ll r3 = X.AbstractC25230BEn.A0k(r0, r5)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36320403824583112(0x810937001021c8, double:3.032507856969122E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L19
        L18:
            return r5
        L19:
            boolean r0 = r6.A0K
            if (r0 == 0) goto L18
            X.Fv8 r0 = r6.A02()
            if (r0 == 0) goto L18
            int r0 = r0.A02()
            if (r0 != 0) goto L18
            X.7NH r4 = r6.A08
            if (r4 == 0) goto L18
            r3 = 3
            X.7NK r1 = r4.A01
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r1.A01
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            X.7NL r2 = r1.A00
            X.7NM r1 = r4.A00     // Catch: java.lang.Throwable -> L60
            X.7NK r0 = r1.A03     // Catch: java.lang.Throwable -> L60
            r0.A00()     // Catch: java.lang.Throwable -> L60
            java.util.List r1 = r1.A00     // Catch: java.lang.Throwable -> L60
            int r0 = r1.size()     // Catch: java.lang.Throwable -> L60
            int r0 = java.lang.Math.min(r3, r0)     // Catch: java.lang.Throwable -> L60
            java.util.List r0 = r1.subList(r5, r0)     // Catch: java.lang.Throwable -> L60
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf(r0)     // Catch: java.lang.Throwable -> L60
            if (r2 == 0) goto L59
            r2.close()
        L59:
            if (r0 == 0) goto L18
            int r5 = r0.size()
            return r5
        L60:
            r1 = move-exception
            if (r2 == 0) goto L6b
            r2.close()     // Catch: java.lang.Throwable -> L67
            throw r1
        L67:
            r0 = move-exception
            X.AbstractC61625Rqp.A00(r1, r0)
        L6b:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.inbox.fragment.DirectSearchInboxFragment.A00(int):int");
    }

    public final C36010Fv8 A02() {
        Context requireContext;
        UserSession A0r;
        C08790ch A00;
        int i;
        C57112jm c57112jm;
        boolean z;
        boolean z2;
        C36010Fv8 c36010Fv8 = this.A07;
        if (c36010Fv8 == null) {
            boolean z3 = this instanceof C32820EcO;
            C36303Fzy c36303Fzy = this.A06;
            if (z3) {
                if (c36303Fzy != null) {
                    requireContext = requireContext();
                    A0r = AbstractC166987dD.A0r(this.A0Q);
                    A00 = AbstractC018607g.A00(this);
                    i = this.A00;
                    c57112jm = this.A04;
                    z = this.A0E;
                    z2 = true;
                    c36010Fv8 = new C36010Fv8(requireContext, A00, this, A0r, c57112jm, c36303Fzy, this, this, this, i, z, z2);
                }
                c36010Fv8 = null;
            } else {
                if (c36303Fzy != null) {
                    requireContext = requireContext();
                    A0r = AbstractC166987dD.A0r(this.A0Q);
                    A00 = AbstractC018607g.A00(this);
                    i = this.A00;
                    c57112jm = this.A04;
                    z = this.A0E;
                    z2 = false;
                    c36010Fv8 = new C36010Fv8(requireContext, A00, this, A0r, c57112jm, c36303Fzy, this, this, this, i, z, z2);
                }
                c36010Fv8 = null;
            }
            this.A07 = c36010Fv8;
        }
        return c36010Fv8;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    public final void A04(Bundle bundle, Integer num) {
        AbstractC12990ll A0o;
        Class<ModalActivity> cls;
        FragmentActivity requireActivity;
        int i;
        C6XJ A0L;
        int i2;
        C14360o3.A0B(num, 0);
        switch (num.intValue()) {
            case 0:
                bundle.putString(AbstractC111324zv.A00(147), this.A0D);
                A0o = AbstractC166987dD.A0o(this.A0Q);
                cls = ModalActivity.class;
                requireActivity = requireActivity();
                i = 4292;
                A0L = AbstractC31171DnF.A0L(requireActivity, bundle, A0o, cls, AbstractC111324zv.A00(i));
                A0L.A0E(this);
                A0L.A0J = ModalActivity.A08;
                i2 = 289;
                A0L.A0D(this, i2);
                return;
            case 1:
            case 2:
                A0L = AbstractC31171DnF.A0L(requireActivity(), bundle, AbstractC166987dD.A0o(this.A0Q), ModalActivity.class, AbstractC111324zv.A00(4294));
                A0L.A0E(this);
                A0L.A0J = ModalActivity.A08;
                i2 = 3704;
                A0L.A0D(this, i2);
                return;
            case 5:
            case 6:
            case 7:
            case 9:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 27:
                bundle.putString(AbstractC111324zv.A00(147), this.A0D);
                bundle.putParcelable(AbstractC43591JPw.A00(111), C0B1.A00(this.A0B));
                bundle.putParcelable(AbstractC43591JPw.A00(25), C0B1.A00(this.A01));
                bundle.putBoolean(AbstractC43591JPw.A00(109), this.A0E);
                A0o = AbstractC166987dD.A0o(this.A0Q);
                cls = ModalActivity.class;
                requireActivity = requireActivity();
                i = 2269;
                A0L = AbstractC31171DnF.A0L(requireActivity, bundle, A0o, cls, AbstractC111324zv.A00(i));
                A0L.A0E(this);
                A0L.A0J = ModalActivity.A08;
                i2 = 289;
                A0L.A0D(this, i2);
                return;
            case 14:
                A0L = AbstractC31171DnF.A0L(requireActivity(), bundle, AbstractC166987dD.A0o(this.A0Q), ModalActivity.class, AbstractC111324zv.A00(4293));
                A0L.A0E(this);
                A0L.A0J = ModalActivity.A08;
                i2 = 3703;
                A0L.A0D(this, i2);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC1119353f
    public final InterfaceC59992oh B8R() {
        return this;
    }

    @Override // X.InterfaceC132405yL
    public final void CkK(DirectSearchResult directSearchResult, int i, int i2, int i3, int i4, int i5) {
        C14360o3.A0B(directSearchResult, 0);
        C36443G5s A01 = A01(directSearchResult, i, i2, i3, i5, false);
        C36303Fzy c36303Fzy = this.A06;
        if (c36303Fzy != null) {
            c36303Fzy.A08(A01, directSearchResult, i, i2, i3, i4);
        }
        C36303Fzy c36303Fzy2 = this.A06;
        if (c36303Fzy2 != null) {
            c36303Fzy2.A07(EnumC33509Eri.INVITE_CONTACT);
        }
    }

    @Override // X.InterfaceC132405yL
    public final void CkL(View view, DirectSearchResult directSearchResult, int i, int i2, int i3, int i4) {
        C36443G5s A01;
        int A06 = AbstractC167007dF.A06(0, directSearchResult, view);
        if (C18U.A06(C06090Tz.A05, AbstractC25230BEn.A0k(this.A0Q, 0), 36326438253049726L) && this.A05 != null && (A01 = A01(directSearchResult, i, i2, i3, i4, false)) != null) {
            C36305G0a c36305G0a = this.A0G;
            if (c36305G0a == null) {
                c36305G0a = new C36305G0a(new C36444G5t(this, A06));
                this.A0G = c36305G0a;
            }
            this.A04.A05(view, C36443G5s.A00(c36305G0a, A01));
        }
    }

    @Override // X.InterfaceC132405yL
    public final void D9q(DirectShareTarget directShareTarget) {
        InterfaceC169517hR interfaceC169517hR;
        C14360o3.A0B(directShareTarget, 0);
        C7NH c7nh = this.A08;
        if (c7nh != null) {
            c7nh.A03(directShareTarget);
        }
        C36010Fv8 A02 = A02();
        if (A02 != null && (interfaceC169517hR = A02.A04) != null) {
            A02.A02.DcI(interfaceC169517hR);
        }
    }

    @Override // X.InterfaceC132405yL
    public final /* synthetic */ void DAs(DirectShareTarget directShareTarget) {
    }

    @Override // X.InterfaceC132405yL
    public final void Dle(RectF rectF, View view, C31446Drq c31446Drq, DirectShareTarget directShareTarget, String str, List list, boolean z, boolean z2) {
    }

    @Override // X.InterfaceC132405yL
    public final void Dqk(View view, C31446Drq c31446Drq, DirectSearchResult directSearchResult, String str, int i, int i2, int i3, int i4, boolean z) {
        C36443G5s A01;
        AbstractC167017dG.A1N(directSearchResult, str);
        C14360o3.A0B(view, 6);
        if (this.A05 != null && (A01 = A01(directSearchResult, i, i2, i3, i4, z)) != null) {
            C36305G0a c36305G0a = this.A0G;
            if (c36305G0a == null) {
                c36305G0a = new C36305G0a(new C36444G5t(this, 3));
                this.A0G = c36305G0a;
            }
            this.A04.A05(view, C36443G5s.A00(c36305G0a, A01));
        }
    }

    @Override // X.InterfaceC132405yL
    public final void Dql(RectF rectF, C22P c22p, DirectShareTarget directShareTarget) {
        AbstractC167027dH.A12(directShareTarget, rectF, c22p);
        Context requireContext = requireContext();
        boolean isResumed = isResumed();
        InterfaceC09390do interfaceC09390do = this.A0Q;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        FragmentActivity requireActivity = requireActivity();
        DirectCameraViewModel A04 = LKW.A04(AbstractC166987dD.A0r(interfaceC09390do), directShareTarget);
        FUO.A00(requireActivity, requireContext, rectF, this.A01, c22p, A0r, this, this.A0B, A04, this.A0D, isResumed);
        AbstractC25226BEj.A1Q(this);
    }

    @Override // X.InterfaceC1119353f
    public final void EK1() {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        String str;
        C14360o3.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        C36010Fv8 A02 = A02();
        if (A02 != null) {
            str = A02.A03();
        } else {
            str = null;
        }
        bundle.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_QUERY", str);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A02 = view;
        InterfaceC09390do interfaceC09390do = this.A0Q;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C36303Fzy c36303Fzy = this.A06;
        if (c36303Fzy != null) {
            C32873EdF A00 = C32873EdF.A00(A0r, c36303Fzy);
            this.A05 = A00;
            if (A00 != null) {
                A00.A00 = null;
                A00.A01 = null;
                A00.A01();
            }
            if (bundle != null && (string = bundle.getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_QUERY")) != null) {
                this.A0I = string;
            }
            if (getContext() != null) {
                AbstractC12990ll A0k = AbstractC25230BEn.A0k(interfaceC09390do, 0);
                C06090Tz c06090Tz = C06090Tz.A05;
                if (!C18U.A06(c06090Tz, A0k, 36320403825893848L) && C18U.A06(c06090Tz, A0k, 36320403825238479L)) {
                    AbstractC35257Fgr.A05(requireContext(), AbstractC166987dD.A0r(interfaceC09390do), new G1P(this));
                    return;
                }
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (r13 != null) goto L19;
     */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.instagram.model.direct.DirectShareTargetLoggingInfo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.instagram.model.direct.DirectShareTargetLoggingInfo, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.C36443G5s A01(com.instagram.model.direct.DirectSearchResult r52, int r53, int r54, int r55, int r56, boolean r57) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.inbox.fragment.DirectSearchInboxFragment.A01(com.instagram.model.direct.DirectSearchResult, int, int, int, int, boolean):X.G5s");
    }

    @Override // X.InterfaceC1119353f
    public final TouchInterceptorFrameLayout CA1() {
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.localTouchInterceptorFrameLayout;
        if (touchInterceptorFrameLayout != null) {
            return touchInterceptorFrameLayout;
        }
        C14360o3.A0F("localTouchInterceptorFrameLayout");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ca, code lost:
    
        if (r0.length() != 0) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // X.InterfaceC132405yL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dld(X.C31446Drq r36, com.instagram.model.direct.DirectSearchResult r37, java.lang.String r38, int r39, int r40, int r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.inbox.fragment.DirectSearchInboxFragment.Dld(X.Drq, com.instagram.model.direct.DirectSearchResult, java.lang.String, int, int, int, int, int):void");
    }

    @Override // X.InterfaceC132405yL
    public final void DpP(C31446Drq c31446Drq, DirectSearchResult directSearchResult, Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView, int i, int i2, int i3, int i4, int i5) {
        String str;
        boolean A1a = AbstractC167017dG.A1a(reel, gradientSpinnerAvatarView);
        C14360o3.A0B(directSearchResult, 6);
        C36010Fv8 A02 = A02();
        if (A02 == null || (str = A02.A03()) == null) {
            str = "";
        }
        this.A0I = str;
        C31226Do9 c31226Do9 = this.A0F;
        if (c31226Do9 != null) {
            c31226Do9.A02(reel, C3G2.A0d, gradientSpinnerAvatarView);
        }
        C36443G5s A01 = A01(directSearchResult, i5, i, i2, i4, A1a);
        C36303Fzy c36303Fzy = this.A06;
        if (c36303Fzy != null) {
            c36303Fzy.A08(A01, directSearchResult, i5, i, i2, i3);
        }
        C36303Fzy c36303Fzy2 = this.A06;
        if (c36303Fzy2 != null) {
            c36303Fzy2.A09(directSearchResult);
        }
        C32873EdF c32873EdF = this.A05;
        if (c32873EdF != null && A01 != null) {
            c32873EdF.A03(A01);
            c32873EdF.A02();
        }
        this.A0M = A1a;
    }

    @Override // X.InterfaceC132405yL
    public final void Dqm(View view) {
        if (view != null) {
            this.A04.A04(view);
        }
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C114795Gm c114795Gm;
        if (this instanceof C32820EcO) {
            C14360o3.A0B(interfaceC56362iU, 0);
            interfaceC56362iU.EkF(true);
            interfaceC56362iU.setTitle(requireContext().getString(2131960411));
            interfaceC56362iU.EkS(true);
            c114795Gm = new C114795Gm(null, null, null, null, null, new ViewOnClickListenerC35666Fp0(this, 2), C05F.A00, -2, -2, -2, -2, -2, -2, -2, true);
        } else {
            AbstractC31175DnJ.A1H(interfaceC56362iU);
            c114795Gm = new C114795Gm(null, null, null, null, null, null, C05F.A00, -2, AbstractC53242c7.A0F(requireContext(), R.attr.statusBarBackgroundColor), -2, -2, -2, -2, -2, true);
        }
        interfaceC56362iU.Ehg(c114795Gm);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0Q);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.FPJ, java.lang.Object] */
    public DirectSearchInboxFragment() {
        C37013GSs c37013GSs = new C37013GSs(this, 46);
        C37013GSs c37013GSs2 = new C37013GSs(this, 48);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new C37013GSs(c37013GSs2, 49));
        this.A0O = AbstractC25225BEi.A0a(new C50246MHb(A00, 0), c37013GSs, new C50170MDx(27, null, A00), AbstractC25225BEi.A1D(C25805BbM.class));
        C37013GSs c37013GSs3 = new C37013GSs(this, 47);
        InterfaceC09390do A002 = AbstractC09440dt.A00(enumC09460dv, new C50246MHb(new C50246MHb(this, 1), 2));
        this.A0P = AbstractC25225BEi.A0a(new C50246MHb(A002, 3), c37013GSs3, new C50170MDx(28, null, A002), AbstractC25225BEi.A1D(C31789Dy8.class));
        this.A0R = C31650DvG.A00(this, 36);
        this.A0S = "DIRECT_SEARCH_INBOX_FRAGMENT";
    }

    public final void A03() {
        if (getActivity() != null) {
            if (C1VN.A00 != null) {
                AbstractC31282Dp4.A00().A01(requireActivity(), AbstractC166987dD.A0r(this.A0Q), "800290354365306", null);
            }
            AbstractC25231BEo.A16(this);
        }
        C32873EdF c32873EdF = this.A05;
        if (c32873EdF != null) {
            c32873EdF.A02();
        }
    }

    @Override // X.AbstractC59962oe, X.AbstractC59972of
    public void afterOnResume() {
        super.afterOnResume();
        C64842wi c64842wi = this.A0H;
        if (c64842wi != null) {
            c64842wi.DiZ();
        }
        if (this.A0L) {
            C36010Fv8 A02 = A02();
            if (A02 != null) {
                A02.A05.A02(false, 0.0f);
            }
            this.A0L = false;
        }
        AbstractC31179DnN.A0t(this);
        C36010Fv8 c36010Fv8 = this.A07;
        if (c36010Fv8 != null) {
            String A03 = c36010Fv8.A03();
            this.A0I = A03;
            c36010Fv8.A04(A03);
            String str = this.A0I;
            c36010Fv8.DjS(str, str);
            if (this.A0M) {
                C36684GFe c36684GFe = c36010Fv8.A02;
                if (c36684GFe.A0j) {
                    c36684GFe.A0P.notifyDataSetChanged();
                }
                this.A0M = false;
            }
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0S;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (((i == 289 || i == 3703 || i == 3704) && i2 == -1) || i == 3702) {
            A03();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(445880360);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        InterfaceC09390do interfaceC09390do = this.A0Q;
        this.A03 = AbstractC31176DnK.A0M(this, interfaceC09390do);
        this.A06 = C36303Fzy.A00(AbstractC166987dD.A0r(interfaceC09390do));
        Parcelable parcelable = requireArguments.getParcelable(AbstractC43591JPw.A00(25));
        Parcelable.Creator creator = RectF.CREATOR;
        C14360o3.A08(creator);
        this.A01 = (RectF) C0B1.A01(creator, parcelable, RectF.class);
        this.A0D = requireArguments.getString(AbstractC111324zv.A00(147), null);
        Parcelable parcelable2 = requireArguments.getParcelable(AbstractC43591JPw.A00(111));
        Parcelable.Creator creator2 = DirectThreadKey.CREATOR;
        C14360o3.A08(creator2);
        this.A0B = (DirectThreadKey) C0B1.A01(creator2, parcelable2, DirectThreadKey.class);
        this.A00 = requireArguments.getInt(AbstractC43591JPw.A00(63));
        this.A0E = requireArguments.getBoolean(AbstractC43591JPw.A00(109));
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A0J = C18U.A06(c06090Tz, A0o, 36313931308075333L);
        this.A0K = C18U.A06(c06090Tz, AbstractC166987dD.A0o(interfaceC09390do), 36315937057607498L);
        this.A08 = C7NH.A00(AbstractC166987dD.A0r(interfaceC09390do));
        if (C54P.A01(requireContext(), AbstractC166987dD.A0r(interfaceC09390do))) {
            if (C18U.A06(C06090Tz.A06, AbstractC31178DnM.A0M(interfaceC09390do), 36326438252853116L)) {
                ((C25805BbM) this.A0O.getValue()).A0E(EnumC33510Erj.DIRECT_MESSAGE_SEARCH);
            }
        }
        C36303Fzy c36303Fzy = this.A06;
        if (c36303Fzy != null) {
            if (c36303Fzy.A06 != null) {
                c36303Fzy.A06(0L);
            }
            c36303Fzy.A06 = AbstractC166997dE.A0n();
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c36303Fzy.A0C, "direct_inbox_search_start");
            if (A0f.isSampled()) {
                AbstractC31173DnH.A1L(A0f, c36303Fzy.A06);
                A0f.Cht();
            }
            C34721FRi c34721FRi = c36303Fzy.A01;
            if (c34721FRi != null) {
                boolean z = c36303Fzy.A0A;
                c34721FRi.A0C = z;
                if (c34721FRi.A07 != null) {
                    boolean z2 = c34721FRi.A0D;
                    if (!c34721FRi.A0B) {
                        c34721FRi.A0D = z2;
                        c34721FRi.A02(EnumC33509Eri.ABANDON, null, null, false);
                    }
                    c34721FRi.A00();
                }
                c34721FRi.A0B = false;
                String A0n = AbstractC166997dE.A0n();
                c34721FRi.A07 = A0n;
                if (A0n != null) {
                    InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(c34721FRi.A0E, "universal_search_start");
                    if (A0f2.isSampled()) {
                        AbstractC31173DnH.A1L(A0f2, A0n);
                        if (c34721FRi.A0H) {
                            AbstractC31175DnJ.A19(A0f2, z);
                        }
                        A0f2.Cht();
                    }
                }
            }
        }
        this.A0F = new C31226Do9(this, AbstractC166987dD.A0r(interfaceC09390do), null);
        C27961Xa A00 = AbstractC54912fq.A00();
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0K;
        C54922fr A0S = AbstractC31175DnJ.A0S();
        A0S.A04 = new GCP(this, 2);
        A0S.A08 = new C31451Drv(this, 2);
        this.A0H = AbstractC31175DnJ.A0T(this, A0r, A0S, A00, quickPromotionSlot);
        AbstractC31176DnK.A0Q(interfaceC09390do).A01(this.A0R, C36065Fw1.class);
        C0f9.A09(1947264495, A02);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // androidx.fragment.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater r43, android.view.ViewGroup r44, android.os.Bundle r45) {
        /*
            Method dump skipped, instructions count: 1161
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.inbox.fragment.DirectSearchInboxFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(268699104);
        super.onDestroy();
        this.A0C = null;
        this.A0A = null;
        this.A0M = false;
        AbstractC31176DnK.A0Q(this.A0Q).A02(this.A0R, C36065Fw1.class);
        C0f9.A09(1553653846, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(93204761);
        super.onDestroyView();
        this.localTouchInterceptorFrameLayout = null;
        C36010Fv8 c36010Fv8 = this.A07;
        if (c36010Fv8 != null) {
            InterfaceC169517hR interfaceC169517hR = c36010Fv8.A04;
            if (interfaceC169517hR != null) {
                interfaceC169517hR.DEw();
            }
            FragmentActivity activity = c36010Fv8.A0A.getActivity();
            if (activity instanceof IgFragmentActivity) {
                ((IgFragmentActivity) activity).unregisterOnActivityResultListener(c36010Fv8.A0C);
            }
            c36010Fv8.A03 = null;
            this.A07 = null;
        }
        C0f9.A09(833059175, A02);
    }
}
