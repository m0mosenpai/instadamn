package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.REPETITION_UI_TYPE;
import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import com.instagram.comments.mvvm.data.MediaCommentListRepository$updateCommentActionMenu$1;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.mainfeed.afi.ui.AfiSecondaryLinkButton;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.flowlayout.HorizontalFlowLayout;
import com.instagram.user.model.User;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9Fh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207289Fh extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207289Fh(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A04 = obj2;
        this.A05 = obj3;
        this.A02 = obj4;
        this.A03 = obj5;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C38321qM c38321qM;
        switch (this.A00) {
            case 0:
                final C76223bS c76223bS = (C76223bS) this.A04;
                Context A00 = AbstractC77363dM.A00(c76223bS);
                final C170327il c170327il = (C170327il) this.A05;
                final C131325wL c131325wL = (C131325wL) this.A02;
                final C77123cy c77123cy = (C77123cy) this.A01;
                final C77123cy c77123cy2 = (C77123cy) this.A03;
                return new C2Y0(A00, new GestureDetector.SimpleOnGestureListener() { // from class: X.9TJ
                    public boolean A00 = true;

                    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                    public final boolean onDown(MotionEvent motionEvent) {
                        return true;
                    }

                    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
                    public final boolean onDoubleTap(MotionEvent motionEvent) {
                        C166047bW c166047bW;
                        boolean z;
                        C170327il c170327il2 = c170327il;
                        C167297di c167297di = c170327il2.A00;
                        if (!c167297di.A0S && (c166047bW = c170327il2.A01) != null && ((!(z = c166047bW.A0d) || (z && new C149766oT(c170327il2.A03).A00())) && c167297di.A0H == C05F.A00 && c167297di.A05 == EnumC168507fk.A04)) {
                            C2UY.A01.A06();
                            c131325wL.A02(false, false, false);
                            c170327il2.A02.A0i(c167297di.A0K, c167297di.A0N, false);
                            this.A00 = false;
                        }
                        return true;
                    }

                    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                    public final void onLongPress(MotionEvent motionEvent) {
                        C170327il c170327il2 = c170327il;
                        if (!c170327il2.A04) {
                            if (c170327il2.A05) {
                                if (AbstractC166997dE.A0c(C06090Tz.A05, c170327il2.A03, 36322967919667996L).booleanValue()) {
                                    return;
                                }
                            }
                            if (this.A00) {
                                if (AbstractC166997dE.A0c(C06090Tz.A05, c170327il2.A03, 36322967919667996L).booleanValue()) {
                                    C2UY.A01.A06();
                                    C25814BbV c25814BbV = c170327il2.A02;
                                    C167297di c167297di = c170327il2.A00;
                                    String str = c167297di.A0K;
                                    String str2 = c167297di.A0N;
                                    C77123cy c77123cy3 = c77123cy2;
                                    C2XV.A00();
                                    float A09 = AbstractC166987dD.A09(c77123cy3.A00);
                                    MediaCommentListRepository mediaCommentListRepository = c25814BbV.A0A;
                                    C167297di A01 = AbstractC166327c1.A01((C166137bh) mediaCommentListRepository.A0L.getValue(), str, str2);
                                    if (A01 == null) {
                                        return;
                                    }
                                    C28238Cci c28238Cci = C28238Cci.A00;
                                    UserSession userSession = c25814BbV.A0E;
                                    boolean A0A = C25814BbV.A0A(c25814BbV);
                                    Integer num = C05F.A01;
                                    c28238Cci.A02(userSession, num, num, num, A0A);
                                    C006802i c006802i = C006802i.A0p;
                                    C14360o3.A07(c006802i);
                                    c006802i.markerPoint(309476254, AnonymousClass001.A0O(AbstractC111324zv.A00(3058), 1));
                                    List A03 = C25814BbV.A03((C166047bW) c25814BbV.A0B.A03.getValue(), c25814BbV, str, str2);
                                    if (A03 == null || A03.isEmpty()) {
                                        return;
                                    }
                                    C23031Ai A002 = AbstractC23021Ah.A00(userSession);
                                    AbstractC167007dF.A1L(A002, A002.A1x, C23031Ai.A8c, 86, true);
                                    AbstractC166987dD.A1Z(new MediaCommentListRepository$updateCommentActionMenu$1(mediaCommentListRepository, str, str2, A03, null, true), ((C4A7) mediaCommentListRepository).A01);
                                    c25814BbV.A0N.Egh(new C167147dT(A01, A03, A09));
                                    return;
                                }
                                C25814BbV c25814BbV2 = c170327il2.A02;
                                C167297di c167297di2 = c170327il2.A00;
                                c25814BbV2.A0h(c167297di2.A0K, c167297di2.A0N, true);
                                return;
                            }
                            this.A00 = true;
                        }
                    }

                    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
                    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                        C170327il c170327il2 = c170327il;
                        if (!c170327il2.A04) {
                            if (!c170327il2.A05) {
                                UserSession userSession = c170327il2.A03;
                                C06090Tz c06090Tz = C06090Tz.A05;
                                if (C18U.A06(c06090Tz, userSession, 36322967919471386L)) {
                                    C77123cy c77123cy3 = c77123cy;
                                    C2XV.A00();
                                    View view = (View) c77123cy3.A00;
                                    if (view == null) {
                                        return false;
                                    }
                                    Context A002 = AbstractC77363dM.A00(c76223bS);
                                    C14360o3.A0B(userSession, 2);
                                    C23031Ai A003 = AbstractC23021Ah.A00(userSession);
                                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                    long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                                    InterfaceC19630xq interfaceC19630xq = A003.A01;
                                    boolean A1O = AbstractC167007dF.A1O(((seconds - interfaceC19630xq.getLong("seen_longpress_comment_for_more_options_nux_time", 0L)) > SandboxRepository.CACHE_TTL ? 1 : ((seconds - interfaceC19630xq.getLong("seen_longpress_comment_for_more_options_nux_time", 0L)) == SandboxRepository.CACHE_TTL ? 0 : -1)));
                                    boolean A1Q = AbstractC167007dF.A1Q(interfaceC19630xq.getInt("seen_longpress_comment_for_more_options_nux_count", 0), 3);
                                    boolean A1b = AbstractC167017dG.A1b(A003, A003.A1x, C23031Ai.A8c, 86);
                                    if (!C18U.A06(c06090Tz, userSession, 36322967920192290L) ? !(!A1O || !A1Q) : !(!A1O || A1b)) {
                                        InterfaceC19630xq A0x = AbstractC166987dD.A0x(userSession);
                                        AbstractC167017dG.A0g(A0x, "seen_longpress_comment_for_more_options_nux_count").apply();
                                        InterfaceC19610xo ARD = A0x.ARD();
                                        ARD.E7G("seen_longpress_comment_for_more_options_nux_time", timeUnit.toSeconds(System.currentTimeMillis()));
                                        ARD.apply();
                                        C5SU A0U = AbstractC167007dF.A0U(AbstractC13330mJ.A00(A002), 2131965788);
                                        A0U.A03(view);
                                        A0U.A02();
                                        A0U.A0A = true;
                                        AbstractC166997dE.A1P(A0U);
                                        return true;
                                    }
                                }
                                if (C18U.A06(c06090Tz, userSession, 36322967919471386L)) {
                                    return false;
                                }
                            }
                            C25814BbV c25814BbV = c170327il2.A02;
                            C167297di c167297di = c170327il2.A00;
                            c25814BbV.A0h(c167297di.A0K, c167297di.A0N, false);
                        }
                        return true;
                    }
                });
            case 1:
                C1339162z c1339162z = C1339162z.A00;
                boolean isTracing = C1LN.A01.isTracing();
                if (isTracing) {
                    try {
                        try {
                            C1LN.A01("WarmupSignals:render");
                        } catch (Exception e) {
                            AbstractC25241Le.A00((C6FG) this.A01, AbstractC111324zv.A00(1863), "Failed to begin warmup signals render", e);
                        }
                    } catch (Throwable th) {
                        if (isTracing) {
                            C1LN.A00();
                        }
                        throw th;
                    }
                }
                C102884kP c102884kP = (C102884kP) this.A04;
                C6FG c6fg = (C6FG) this.A01;
                C135266Ab A02 = C135266Ab.A04.A02(c6fg.A00, null, C6VY.A00((C136336Fm) this.A02, c6fg, (AnonymousClass632) this.A03, c102884kP, null, C16930sl.A00), c6fg, AbstractC135256Aa.A00(c6fg), -1, C78443fA.A00.A00(100, 100, 100, 100));
                C6TE.A00.post(new RunnableC66256U6a(A02, c6fg, (AnonymousClass630) this.A05, c1339162z, (C140076Vl) A02.A02, isTracing));
                if (isTracing) {
                    C1LN.A00();
                }
                return C0eB.A00;
            case 2:
                AnonymousClass982 anonymousClass982 = (AnonymousClass982) this.A05;
                AbstractC59962oe abstractC59962oe = anonymousClass982.A00;
                C50249MHe c50249MHe = new C50249MHe(anonymousClass982, 40);
                InterfaceC09390do A002 = AbstractC09440dt.A00(EnumC09460dv.A02, new C50249MHe(new C50249MHe(abstractC59962oe, 41), 42));
                C60842q8 c60842q8 = new C60842q8(new C50249MHe(A002, 43), c50249MHe, new C37018GSz(20, A002, null), new C0YZ(C143266dR.class));
                UserSession userSession = anonymousClass982.A01;
                FragmentActivity requireActivity = abstractC59962oe.requireActivity();
                InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A01;
                C7XR c7xr = (C7XR) this.A02;
                C163867Va c163867Va = (C163867Va) this.A04;
                return new C49088LnE(requireActivity, (C143266dR) c60842q8.getValue(), abstractC59962oe, interfaceC11380iw, userSession, c163867Va, c7xr, c163867Va, (InterfaceC08830cm) this.A03);
            case 3:
                return new C49076Ln2((AbstractC59962oe) this.A03, ((AnonymousClass982) this.A05).A01, (C163867Va) this.A04, (C7XR) this.A01, new C50249MHe(this.A02, 44));
            case 4:
                AnonymousClass982 anonymousClass9822 = (AnonymousClass982) this.A05;
                return new G4E(anonymousClass9822.A00.requireActivity(), anonymousClass9822.A01, (InterfaceC164877Za) ((InterfaceC09390do) this.A04).getValue(), (InterfaceC164927Zh) ((InterfaceC09390do) this.A03).getValue(), (InterfaceC165187a7) ((InterfaceC09390do) this.A01).getValue(), (InterfaceC08830cm) this.A02);
            case 5:
                AnonymousClass982 anonymousClass9823 = (AnonymousClass982) this.A05;
                UserSession userSession2 = anonymousClass9823.A01;
                FragmentActivity requireActivity2 = anonymousClass9823.A00.requireActivity();
                return new C49073Lmz((Fragment) this.A03, requireActivity2, userSession2, (LEK) ((InterfaceC09390do) this.A02).getValue(), (InterfaceC1119353f) this.A04, new C50249MHe(this.A01, 48));
            case 6:
                InterfaceC08830cm interfaceC08830cm = (InterfaceC08830cm) this.A01;
                AnonymousClass982 anonymousClass9824 = (AnonymousClass982) this.A05;
                UserSession userSession3 = anonymousClass9824.A01;
                FragmentActivity requireActivity3 = anonymousClass9824.A00.requireActivity();
                InterfaceC09390do interfaceC09390do = (InterfaceC09390do) this.A02;
                LEK lek = (LEK) interfaceC09390do.getValue();
                C163867Va c163867Va2 = (C163867Va) this.A04;
                return new C49047LmZ(AbstractC16960so.A1Q(new G4G(requireActivity3, userSession3, lek, c163867Va2, interfaceC08830cm), new C49048Lma((AbstractC59962oe) this.A03, userSession3, (LEK) interfaceC09390do.getValue(), c163867Va2, interfaceC08830cm)));
            case 7:
                return new A9V((Fragment) this.A03, ((AnonymousClass982) this.A05).A01, (C163867Va) this.A04, (C7XR) this.A01, (InterfaceC08830cm) this.A02);
            case 8:
                AnonymousClass982 anonymousClass9825 = (AnonymousClass982) this.A05;
                final FragmentActivity requireActivity4 = anonymousClass9825.A00.requireActivity();
                final UserSession userSession4 = anonymousClass9825.A01;
                final Capabilities capabilities = anonymousClass9825.A02;
                final InterfaceC08830cm interfaceC08830cm2 = (InterfaceC08830cm) this.A02;
                final InterfaceC164947Zj interfaceC164947Zj = (InterfaceC164947Zj) ((InterfaceC09390do) this.A04).getValue();
                final C1577876m c1577876m = new C1577876m((InterfaceC16820sZ) this.A03);
                final InterfaceC11380iw interfaceC11380iw2 = (InterfaceC11380iw) this.A01;
                return new InterfaceC165847bC(requireActivity4, interfaceC11380iw2, userSession4, capabilities, interfaceC164947Zj, interfaceC08830cm2, c1577876m) { // from class: X.76n
                    public final InterfaceC11380iw A00;
                    public final UserSession A01;
                    public final Capabilities A02;
                    public final InterfaceC164947Zj A03;
                    public final WeakReference A04;
                    public final InterfaceC08830cm A05;
                    public final InterfaceC08830cm A06;

                    {
                        C14360o3.A0B(interfaceC08830cm2, 4);
                        C14360o3.A0B(interfaceC164947Zj, 5);
                        C14360o3.A0B(interfaceC11380iw2, 7);
                        this.A01 = userSession4;
                        this.A02 = capabilities;
                        this.A05 = interfaceC08830cm2;
                        this.A03 = interfaceC164947Zj;
                        this.A06 = c1577876m;
                        this.A00 = interfaceC11380iw2;
                        this.A04 = new WeakReference(requireActivity4);
                    }

                    @Override // X.InterfaceC165847bC
                    public final InterfaceC37162GYz BXW(C206269Bj c206269Bj) {
                        boolean z;
                        FragmentActivity fragmentActivity = (FragmentActivity) this.A04.get();
                        if (fragmentActivity != null) {
                            UserSession userSession5 = this.A01;
                            Capabilities capabilities2 = this.A02;
                            Object obj = this.A05.get();
                            C14360o3.A07(obj);
                            C7U0 c7u0 = (C7U0) obj;
                            InterfaceC164947Zj interfaceC164947Zj2 = this.A03;
                            Object obj2 = this.A06.get();
                            C14360o3.A07(obj2);
                            boolean booleanValue = ((Boolean) obj2).booleanValue();
                            InterfaceC11380iw interfaceC11380iw3 = this.A00;
                            C14360o3.A0B(c7u0, 3);
                            InterfaceC83733oI CCa = c7u0.C7r().CCa();
                            if (CCa != null) {
                                z = CCa instanceof MsysThreadId;
                                if (z) {
                                    return null;
                                }
                            } else {
                                z = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(new G57(fragmentActivity, c206269Bj, interfaceC11380iw3, userSession5, capabilities2, c7u0, interfaceC164947Zj2, booleanValue, z));
                            arrayList.add(new G55(fragmentActivity, c206269Bj, interfaceC11380iw3, userSession5, c7u0, interfaceC164947Zj2));
                            arrayList.add(new G54(fragmentActivity, userSession5, c7u0, interfaceC164947Zj2));
                            arrayList.add(new G56(fragmentActivity, c206269Bj, interfaceC11380iw3, userSession5, capabilities2, c7u0, interfaceC164947Zj2));
                            arrayList.add(new G53(fragmentActivity, interfaceC11380iw3, userSession5, c7u0));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                InterfaceC37162GYz interfaceC37162GYz = (InterfaceC37162GYz) it.next();
                                if (interfaceC37162GYz.isEnabled()) {
                                    return interfaceC37162GYz;
                                }
                            }
                            return null;
                        }
                        return null;
                    }
                };
            case 9:
                AnonymousClass398 anonymousClass398 = (AnonymousClass398) this.A05;
                C07X c07x = anonymousClass398.A00;
                InterfaceC60442pS interfaceC60442pS = anonymousClass398.A04;
                C62862tP c62862tP = anonymousClass398.A01;
                C4FY c4fy = (C4FY) anonymousClass398.A0U.getValue();
                return new C2Y((Context) this.A01, (FragmentActivity) this.A03, c07x, c62862tP, (UserSession) this.A04, ((AnonymousClass372) this.A02).Ar3(), c4fy, interfaceC60442pS);
            case 10:
                AbstractC86463tJ abstractC86463tJ = (AbstractC86463tJ) ((C79293ga) this.A05).A08.getValue();
                Context context = (Context) this.A01;
                C38321qM c38321qM2 = (C38321qM) this.A03;
                return abstractC86463tJ.A01(context, c38321qM2, c38321qM2, (InterfaceC60442pS) this.A02, (C75113Zb) this.A04);
            case 11:
                final Context context2 = (Context) this.A01;
                C65122xA c65122xA = (C65122xA) this.A05;
                final UserSession userSession5 = c65122xA.A00;
                final C1M1 c1m1 = (C1M1) this.A04;
                final InterfaceC60442pS interfaceC60442pS2 = c65122xA.A01;
                final C64372vw c64372vw = (C64372vw) this.A03;
                final C64452w4 c64452w4 = (C64452w4) this.A02;
                return new AbstractC65632xz(context2, interfaceC60442pS2, userSession5, c64372vw, c1m1, c64452w4) { // from class: X.2zh
                    public final Context A00;
                    public final InterfaceC11380iw A01;
                    public final UserSession A02;
                    public final C64372vw A03;
                    public final C1M1 A04;
                    public final C64452w4 A05;

                    {
                        C14360o3.A0B(context2, 1);
                        C14360o3.A0B(c1m1, 3);
                        C14360o3.A0B(c64372vw, 5);
                        C14360o3.A0B(c64452w4, 6);
                        this.A00 = context2;
                        this.A02 = userSession5;
                        this.A04 = c1m1;
                        this.A01 = interfaceC60442pS2;
                        this.A03 = c64372vw;
                        this.A05 = c64452w4;
                    }

                    @Override // X.InterfaceC65642y0
                    public final int getViewTypeCount() {
                        return 1;
                    }

                    @Override // X.InterfaceC65642y0
                    public final void bindView(int i, View view, Object obj, Object obj2) {
                        Integer BY1;
                        int i2;
                        int i3;
                        int A03 = C0f9.A03(750234066);
                        C14360o3.A0B(view, 1);
                        C14360o3.A0B(obj, 2);
                        C14360o3.A0B(obj2, 3);
                        C42708Iv3 c42708Iv3 = (C42708Iv3) obj;
                        C42659IuG c42659IuG = (C42659IuG) obj2;
                        UserSession userSession6 = this.A02;
                        C42123IlX c42123IlX = new C42123IlX(this.A01, userSession6, c42708Iv3, this.A04.getSessionId());
                        Object tag = view.getTag();
                        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.mainfeed.afi.ui.AfiInterestsPickerViewBinder.Holder");
                        IKH ikh = (IKH) tag;
                        C64372vw c64372vw2 = this.A03;
                        C64432w2 c64432w2 = c64372vw2.A03;
                        c64432w2.A00 = c42123IlX;
                        C64442w3 c64442w3 = c64372vw2.A04;
                        c64442w3.A00 = c42123IlX;
                        View view2 = ikh.A01;
                        C41016IEl c41016IEl = new C41016IEl(c42708Iv3, ikh);
                        C14360o3.A0B(c42708Iv3, 1);
                        String A003 = C64372vw.A00(c42708Iv3);
                        C59062n7 c59062n7 = C59062n7.A07;
                        C59072n8 c59072n8 = new C59072n8(c42708Iv3, c41016IEl, A003);
                        c59072n8.A00(c64432w2);
                        c59072n8.A00(c64442w3);
                        c64372vw2.A00.A05(view2, c59072n8.A01());
                        Context context3 = this.A00;
                        C64452w4 c64452w42 = this.A05;
                        C14360o3.A0B(context3, 0);
                        C14360o3.A0B(userSession6, 1);
                        C14360o3.A0B(c42659IuG, 4);
                        C14360o3.A0B(c64452w42, 5);
                        C5FT c5ft = c42708Iv3.A00;
                        List<JMH> BJ1 = c5ft.BJ1();
                        if (BJ1 != null) {
                            JK7 Bf6 = c5ft.Bf6();
                            String title = c5ft.getTitle();
                            if (title == null) {
                                title = context3.getString(2131964601);
                                C14360o3.A07(title);
                            }
                            ikh.A04.setText(title);
                            String subtitle = c5ft.getSubtitle();
                            if (subtitle != null && subtitle.length() != 0) {
                                IgTextView igTextView = ikh.A03;
                                igTextView.setVisibility(0);
                                igTextView.setText(subtitle);
                            } else {
                                ikh.A03.setVisibility(8);
                            }
                            String id = c42708Iv3.getId();
                            C0fQ.A00(new ViewOnClickListenerC41935IiS(c42123IlX, c64452w42, id), ikh.A05);
                            Integer num = c42659IuG.A01;
                            Integer num2 = C05F.A01;
                            if (num == num2) {
                                BY1 = c5ft.B33();
                                if (BY1 == null) {
                                    i2 = 5;
                                }
                                i2 = BY1.intValue();
                            } else {
                                BY1 = c5ft.BY1();
                                if (BY1 == null) {
                                    i2 = 3;
                                }
                                i2 = BY1.intValue();
                            }
                            C38321qM c38321qM3 = c42708Iv3.A01;
                            boolean A06 = C18U.A06(C06090Tz.A05, userSession6, 36323457545547030L);
                            HorizontalFlowLayout horizontalFlowLayout = ikh.A07;
                            horizontalFlowLayout.removeAllViews();
                            horizontalFlowLayout.A00 = i2;
                            int i4 = 0;
                            for (JMH jmh : BJ1) {
                                int i5 = i4 + 1;
                                Map map = c42659IuG.A03;
                                Object obj3 = map.get(Integer.valueOf(i4));
                                Hd2 hd2 = Hd2.A02;
                                boolean z = false;
                                if (obj3 == hd2) {
                                    z = true;
                                }
                                if (jmh.getName() != null && jmh.getDisplayName() != null) {
                                    NFZ nfz = new NFZ(context3, jmh, z, A06);
                                    C0fQ.A00(new ViewOnClickListenerC42019Ijo(context3, c42123IlX, jmh, Bf6, c38321qM3, c42659IuG, nfz, ikh, c64452w42, BJ1, i4), nfz);
                                    boolean isSelected = nfz.A01.isSelected();
                                    Integer valueOf = Integer.valueOf(i4);
                                    if (!isSelected) {
                                        hd2 = Hd2.A03;
                                    }
                                    map.put(valueOf, hd2);
                                    horizontalFlowLayout.addView(nfz);
                                }
                                i4 = i5;
                            }
                            if (Bf6 != null) {
                                if (c42659IuG.A00 == num2) {
                                    C41714Idk.A01(context3, Bf6, c38321qM3, c42659IuG, ikh, c64452w42, BJ1);
                                }
                            } else {
                                String B30 = c5ft.B30();
                                Integer B33 = c5ft.B33();
                                if (c42659IuG.A01 != num2 && B30 != null && B30.length() != 0) {
                                    AfiSecondaryLinkButton afiSecondaryLinkButton = ikh.A06;
                                    afiSecondaryLinkButton.setText(B30);
                                    Integer A05 = AbstractC65877Tvg.A05("chevron_down_pano_outline_12");
                                    if (A05 != null) {
                                        i3 = A05.intValue();
                                    } else {
                                        i3 = 0;
                                    }
                                    afiSecondaryLinkButton.A02(EnumC99774dy.A02, i3);
                                    afiSecondaryLinkButton.setIconPadding(context3.getResources().getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material));
                                    C0fQ.A00(new ViewOnClickListenerC41986IjH(c42123IlX, c42659IuG, ikh, afiSecondaryLinkButton, B33), afiSecondaryLinkButton);
                                    afiSecondaryLinkButton.setVisibility(0);
                                }
                            }
                            C0f9.A0A(-1521640555, A03);
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }

                    @Override // X.InterfaceC65642y0
                    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
                        if (anonymousClass306 != null) {
                            anonymousClass306.A7a(0);
                        }
                    }

                    @Override // X.InterfaceC65642y0
                    public final View createView(int i, ViewGroup viewGroup) {
                        int A03 = C0f9.A03(1517615373);
                        C14360o3.A0B(viewGroup, 1);
                        Context context3 = viewGroup.getContext();
                        boolean A07 = C14640oc.A07();
                        int i2 = R.layout.afi_interests_picker_view;
                        if (A07) {
                            i2 = R.layout.afi_interests_picker_view_prism;
                        }
                        View inflate = LayoutInflater.from(context3).inflate(i2, viewGroup, false);
                        C14360o3.A0A(inflate);
                        inflate.setTag(new IKH(inflate));
                        C0f9.A0A(371075738, A03);
                        return inflate;
                    }
                };
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                final C64452w4 c64452w42 = (C64452w4) this.A02;
                final C64372vw c64372vw2 = (C64372vw) this.A03;
                C65122xA c65122xA2 = (C65122xA) this.A05;
                final InterfaceC60442pS interfaceC60442pS3 = c65122xA2.A01;
                final Context context3 = (Context) this.A01;
                final C1M1 c1m12 = (C1M1) this.A04;
                final UserSession userSession6 = c65122xA2.A00;
                return new AbstractC65632xz(context3, interfaceC60442pS3, userSession6, c64372vw2, c1m12, c64452w42) { // from class: X.2zi
                    public final Context A00;
                    public final InterfaceC11380iw A01;
                    public final UserSession A02;
                    public final C64372vw A03;
                    public final C1M1 A04;
                    public final C64452w4 A05;

                    {
                        C14360o3.A0B(c64452w42, 1);
                        C14360o3.A0B(c64372vw2, 2);
                        C14360o3.A0B(context3, 4);
                        C14360o3.A0B(c1m12, 5);
                        this.A05 = c64452w42;
                        this.A03 = c64372vw2;
                        this.A01 = interfaceC60442pS3;
                        this.A00 = context3;
                        this.A04 = c1m12;
                        this.A02 = userSession6;
                    }

                    @Override // X.InterfaceC65642y0
                    public final int getViewTypeCount() {
                        return 2;
                    }

                    @Override // X.InterfaceC65642y0
                    public final void bindView(int i, View view, Object obj, Object obj2) {
                        InterfaceC106374qr interfaceC106374qr;
                        Drawable A022;
                        IgImageView igImageView;
                        int A03 = C0f9.A03(71695949);
                        C14360o3.A0B(view, 1);
                        C14360o3.A0B(obj, 2);
                        C42709Iv4 c42709Iv4 = (C42709Iv4) obj;
                        Object tag = view.getTag();
                        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.mainfeed.afi.ui.AfiRepetitionViewBinder.Holder");
                        C41158IJx c41158IJx = (C41158IJx) tag;
                        H8M h8m = new H8M(this.A01, this.A02, c42709Iv4, this.A04.getSessionId());
                        C64372vw c64372vw3 = this.A03;
                        C64392vy c64392vy = c64372vw3.A02;
                        c64392vy.A00 = h8m;
                        C64402vz c64402vz = c64372vw3.A05;
                        c64402vz.A00 = h8m;
                        View view2 = c41158IJx.A00;
                        C14360o3.A0B(c42709Iv4, 1);
                        Object obj3 = new Object();
                        String A003 = C64372vw.A00(c42709Iv4);
                        C59062n7 c59062n7 = C59062n7.A07;
                        C59072n8 c59072n8 = new C59072n8(c42709Iv4, obj3, A003);
                        c59072n8.A00(c64392vy);
                        c59072n8.A00(c64402vz);
                        c64372vw3.A00.A05(view2, c59072n8.A01());
                        Context context4 = this.A00;
                        C64452w4 c64452w43 = this.A05;
                        C14360o3.A0B(context4, 0);
                        C14360o3.A0B(c64452w43, 3);
                        C5FS c5fs = c42709Iv4.A01;
                        List Bjh = c5fs.Bjh();
                        if (Bjh != null) {
                            interfaceC106374qr = (InterfaceC106374qr) AbstractC001800i.A0J(Bjh);
                        } else {
                            interfaceC106374qr = null;
                        }
                        String AyP = c5fs.AyP();
                        InterfaceC106354qp CCS = c5fs.CCS();
                        if (interfaceC106374qr != null && AyP != null && CCS != null && interfaceC106374qr.Ac6().size() == 2 && interfaceC106374qr.getText().length() > 0 && ((InterfaceC106354qp) interfaceC106374qr.Ac6().get(0)).getText().length() > 0 && ((InterfaceC106354qp) interfaceC106374qr.Ac6().get(1)).getText().length() > 0 && AyP.length() > 0) {
                            IgImageView igImageView2 = c41158IJx.A03;
                            ConstraintLayout constraintLayout = c41158IJx.A01;
                            if (!C14640oc.A07()) {
                                igImageView2.setImageTintList(ColorStateList.valueOf(context4.getColor(AbstractC53242c7.A0H(context4, R.attr.igds_color_elevated_highlight_background))));
                                Drawable drawable = context4.getDrawable(R.drawable.rounded_afi_background);
                                RectF rectF = AbstractC13880nE.A01;
                                C14360o3.A0B(constraintLayout, 0);
                                constraintLayout.setBackground(drawable);
                            }
                            c41158IJx.A02.setText(interfaceC106374qr.getText());
                            String id = c42709Iv4.getId();
                            if (C41687IdG.A00 != REPETITION_UI_TYPE.A04 && (A022 = AbstractC65877Tvg.A02(context4, AyP)) != null && (igImageView = c41158IJx.A04) != null) {
                                igImageView.setImageDrawable(A022);
                                C0fQ.A00(new ViewOnClickListenerC41936IiT(h8m, c64452w43, id), igImageView);
                            }
                            C41687IdG.A00(context4, h8m, (InterfaceC106354qp) interfaceC106374qr.Ac6().get(0), CCS, c41158IJx.A05, c64452w43, c42709Iv4.getId(), AbstractC111324zv.A00(3054));
                            C41687IdG.A00(context4, h8m, (InterfaceC106354qp) interfaceC106374qr.Ac6().get(1), CCS, c41158IJx.A06, c64452w43, c42709Iv4.getId(), "see_more");
                        }
                        C0f9.A0A(221549087, A03);
                    }

                    @Override // X.InterfaceC65642y0
                    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
                        C42709Iv4 c42709Iv4 = (C42709Iv4) obj;
                        C14360o3.A0B(c42709Iv4, 1);
                        REPETITION_UI_TYPE Bme = c42709Iv4.A01.Bme();
                        if (Bme != null && Bme.ordinal() == 1) {
                            if (anonymousClass306 != null) {
                                anonymousClass306.A7a(1);
                            }
                        } else {
                            if (anonymousClass306 == null) {
                                return;
                            }
                            anonymousClass306.A7a(0);
                        }
                    }

                    @Override // X.InterfaceC65642y0
                    public final View createView(int i, ViewGroup viewGroup) {
                        REPETITION_UI_TYPE repetition_ui_type;
                        int A03 = C0f9.A03(1751299823);
                        C14360o3.A0B(viewGroup, 1);
                        if (i == 1) {
                            repetition_ui_type = REPETITION_UI_TYPE.A04;
                        } else {
                            repetition_ui_type = REPETITION_UI_TYPE.A05;
                        }
                        Context context4 = viewGroup.getContext();
                        C41687IdG.A00 = repetition_ui_type;
                        REPETITION_UI_TYPE repetition_ui_type2 = REPETITION_UI_TYPE.A04;
                        int i2 = R.layout.afi_repetition_medium_view;
                        if (repetition_ui_type == repetition_ui_type2) {
                            i2 = R.layout.afi_repetition_lightweight_view;
                        }
                        View inflate = LayoutInflater.from(context4).inflate(i2, viewGroup, false);
                        C14360o3.A0A(inflate);
                        inflate.setTag(new C41158IJx(inflate));
                        C0f9.A0A(-1533685544, A03);
                        return inflate;
                    }
                };
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new C66702zn((Context) this.A01, (Fragment) this.A02, (C62862tP) this.A03, ((C65122xA) this.A05).A00, (C63762ux) this.A04);
            case 14:
                Context context4 = (Context) this.A01;
                InterfaceC63842v5 interfaceC63842v5 = (InterfaceC63842v5) this.A04;
                C65122xA c65122xA3 = (C65122xA) this.A05;
                return new C65792yH(context4, c65122xA3.A01, c65122xA3.A00, interfaceC63842v5, (C63872v8) this.A03, ((C63372uK) this.A02).A01);
            case Process.SIGTERM /* 15 */:
                Context context5 = (Context) this.A01;
                C65122xA c65122xA4 = (C65122xA) this.A05;
                return new C65772yF(context5, c65122xA4.A01, c65122xA4.A00, (C61252qn) this.A03, (C64032vO) this.A04, (C63972vI) this.A02);
            case 16:
                ((UserDetailFragment) this.A03).A0o();
                C34726FRp A07 = C28531Zo.A04.A02.A07((InterfaceC11380iw) this.A02, (UserSession) this.A05, C2EY.A1Q);
                A07.A06(((User) this.A04).getId());
                C3DN A003 = C3DN.A00.A00((Activity) this.A01);
                A07.A01();
                if (A003 != null) {
                    A003.A0K(A07.A00());
                }
                return C0eB.A00;
            default:
                C1ZF A004 = F1A.A00();
                FragmentActivity fragmentActivity = (FragmentActivity) this.A01;
                C69703Be c69703Be = (C69703Be) this.A05;
                A004.A03(fragmentActivity, c69703Be.A0T, (C38321qM) this.A02);
                ShareType shareType = (ShareType) this.A04;
                C47Z c47z = (C47Z) this.A03;
                C69783Bm c69783Bm = c69703Be.A0Z;
                if (c69783Bm.A01(c47z, shareType) && (c38321qM = c47z.A1C) != null) {
                    c69783Bm.A00(fragmentActivity, c38321qM, shareType, c69703Be.A0Y.getSessionId());
                }
                return C0eB.A00;
        }
    }
}
