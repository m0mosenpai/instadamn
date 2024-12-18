package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.creation.capture.assetpicker.cutout.CutoutStickerCreationController$genericCutoutAiProcessorExceptionHandler$$inlined$CoroutineExceptionHandler$1;
import com.instagram.creation.capture.assetpicker.cutout.data.CutoutStickerRepository;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.LeT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48591LeT implements MSD {
    public static final String __redex_internal_original_name = "CutoutStickerCreationController";
    public InterfaceC137546La A00;
    public ComposeView A01;
    public IgTextView A02;
    public IgTextView A03;
    public AbstractC47286Kux A04;
    public C47806L9o A05;
    public L7y A06;
    public IgdsMediaButton A07;
    public IgdsMediaButton A08;
    public IgdsMediaButton A09;
    public IgdsMediaButton A0A;
    public IgdsMediaButton A0B;
    public IgdsMediaButton A0C;
    public Integer A0D;
    public boolean A0E;
    public View A0F;
    public final long A0G;
    public final long A0H;
    public final Activity A0I;
    public final View A0J;
    public final ViewStub A0K;
    public final ViewStub A0L;
    public final Fragment A0M;
    public final C57312k6 A0N;
    public final InterfaceC11380iw A0O;
    public final UserSession A0P;
    public final C25875Bca A0Q;
    public final InterfaceC186068Na A0R;
    public final C8OP A0S;
    public final Integer A0T;
    public final String A0U;
    public final String A0V;
    public final java.util.Set A0W;
    public final InterfaceC09390do A0X;
    public final InterfaceC09390do A0Y;
    public final InterfaceC09390do A0Z;
    public final InterfaceC09390do A0a;
    public final InterfaceC018407e A0b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v20, types: [X.6cX, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v21, types: [X.6cX, java.lang.Object] */
    @Override // X.MSD
    public final void E2K() {
        Medium medium;
        C57312k6 c57312k6;
        CutoutStickerCreationController$genericCutoutAiProcessorExceptionHandler$$inlined$CoroutineExceptionHandler$1 cutoutStickerCreationController$genericCutoutAiProcessorExceptionHandler$$inlined$CoroutineExceptionHandler$1;
        InterfaceC16620sF mc7;
        View view;
        this.A0R.DWm();
        AbstractC47286Kux abstractC47286Kux = this.A04;
        if (abstractC47286Kux != null) {
            if (abstractC47286Kux instanceof KN8) {
                medium = ((KN8) abstractC47286Kux).A02;
            } else {
                medium = ((KN7) abstractC47286Kux).A00;
            }
            View view2 = this.A0F;
            if (view2 == null) {
                view2 = this.A0K.inflate();
                java.util.Set set = this.A0W;
                set.clear();
                if (this.A0D == C05F.A15) {
                    Context context = view2.getContext();
                    AbstractC31172DnG.A1B(context, view2, AbstractC53242c7.A0H(context, R.attr.igds_color_media_background));
                }
                C14360o3.A0A(view2);
                set.add(view2);
                ViewStub viewStub = this.A0L;
                if (viewStub.getParent() != null) {
                    view = viewStub.inflate();
                } else {
                    view = this.A0J;
                }
                Context A0L = AbstractC166997dE.A0L(view2);
                C14360o3.A0A(view);
                this.A05 = new C47806L9o(A0L, view, (ShimmerFrameLayout) view2.requireViewById(R.id.imageview_shimmer_container));
                UserSession userSession = this.A0P;
                this.A06 = new L7y(A0L, view, userSession);
                ViewOnClickListenerC48064LPp.A00(view2.requireViewById(R.id.cutout_sticker_creation_back_button), 64, this);
                TextView A0T = AbstractC166997dE.A0T(view2, R.id.cutout_sticker_creation_title_label);
                AbstractC166987dD.A1P(A0T.getContext(), A0T, 2131957421);
                C8OP c8op = this.A0S;
                C15340po c15340po = new C15340po(new PYw(this, null, 11), AbstractC208910l.A02(c8op.A09));
                Fragment fragment = this.A0M;
                AbstractC18560vj.A03(C07Y.A00(fragment), c15340po);
                AbstractC31178DnM.A11(fragment, new B5g(this, null, 10), AbstractC208910l.A02(c8op.A0A));
                ComposeView composeView = (ComposeView) view2.requireViewById(R.id.cutout_image_compose_view);
                composeView.setViewCompositionStrategy(C25320BIp.A00);
                CY5.A01(composeView, userSession, this.A0U, AbstractC27785CNa.A00);
                this.A01 = composeView;
                IgdsMediaButton igdsMediaButton = (IgdsMediaButton) view2.requireViewById(R.id.cutout_select_sticker_button);
                Context context2 = igdsMediaButton.getContext();
                int i = 2131957409;
                if (this.A0T == C05F.A01) {
                    i = 2131957410;
                }
                igdsMediaButton.setLabel(context2.getString(i));
                C0fQ.A00(new KLE(view2, this, igdsMediaButton), igdsMediaButton);
                this.A0C = igdsMediaButton;
                IgdsMediaButton igdsMediaButton2 = (IgdsMediaButton) view2.requireViewById(R.id.cutout_sticker_next_button);
                igdsMediaButton2.setLabel(igdsMediaButton2.getContext().getString(2131957404));
                ViewOnClickListenerC48064LPp.A00(igdsMediaButton2, 67, this);
                this.A07 = igdsMediaButton2;
                IgdsMediaButton igdsMediaButton3 = (IgdsMediaButton) view2.requireViewById(R.id.cutout_sticker_save_button);
                igdsMediaButton3.setLabel(igdsMediaButton3.getContext().getString(2131957401));
                ViewOnClickListenerC23249ASk.A00(igdsMediaButton3, 9, this);
                this.A0A = igdsMediaButton3;
                IgdsMediaButton igdsMediaButton4 = (IgdsMediaButton) view2.requireViewById(R.id.cutout_manual_refinement_button);
                igdsMediaButton4.setLabel(igdsMediaButton4.getContext().getString(2131957408));
                C0fQ.A00(new KLF(this, 0, 42), igdsMediaButton4);
                this.A08 = igdsMediaButton4;
                IgTextView A0X = AbstractC31172DnG.A0X(view2, R.id.cutout_manual_refinement_footer);
                AbstractC166987dD.A1P(A0X.getContext(), A0X, 2131957445);
                this.A02 = A0X;
                IgTextView A0X2 = AbstractC31172DnG.A0X(view2, R.id.create_video_sticker_footer);
                AbstractC166987dD.A1P(A0X2.getContext(), A0X2, 2131957442);
                this.A03 = A0X2;
                IgdsMediaButton igdsMediaButton5 = (IgdsMediaButton) view2.requireViewById(R.id.cutout_undo_selection_button);
                ?? obj = new Object();
                obj.A00 = R.drawable.instagram_undo_pano_outline_24;
                igdsMediaButton5.setStartAddOn(obj, igdsMediaButton5.getContext().getString(2131952154));
                ViewOnClickListenerC48064LPp.A00(igdsMediaButton5, 65, this);
                this.A0B = igdsMediaButton5;
                IgdsMediaButton igdsMediaButton6 = (IgdsMediaButton) view2.requireViewById(R.id.cutout_redo_selection_button);
                ?? obj2 = new Object();
                obj2.A00 = R.drawable.instagram_redo_pano_outline_24;
                igdsMediaButton6.setStartAddOn(obj2, igdsMediaButton6.getContext().getString(2131952150));
                ViewOnClickListenerC48064LPp.A00(igdsMediaButton6, 66, this);
                this.A09 = igdsMediaButton6;
                AbstractC31178DnM.A11(fragment, new MC7((InterfaceC23621Ds) null, this, view2, 24), c8op.A0I);
                this.A0F = view2;
            }
            view2.setVisibility(0);
            this.A0E = false;
            AbstractC47286Kux abstractC47286Kux2 = this.A04;
            if (abstractC47286Kux2 instanceof KN7) {
                c57312k6 = this.A0N;
                cutoutStickerCreationController$genericCutoutAiProcessorExceptionHandler$$inlined$CoroutineExceptionHandler$1 = new CutoutStickerCreationController$genericCutoutAiProcessorExceptionHandler$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key, this, new MHQ(this, 14));
                mc7 = new B5g(medium, this, null, 13);
            } else if (abstractC47286Kux2 instanceof KN8) {
                c57312k6 = this.A0N;
                C50190MEx c50190MEx = C50190MEx.A00;
                C14360o3.A0B(c50190MEx, 0);
                cutoutStickerCreationController$genericCutoutAiProcessorExceptionHandler$$inlined$CoroutineExceptionHandler$1 = new CutoutStickerCreationController$genericCutoutAiProcessorExceptionHandler$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key, this, c50190MEx);
                mc7 = new MC7(abstractC47286Kux2, medium, this, null, 25);
            } else {
                AbstractC166987dD.A1T(C18950wb.A01, "CutoutStickerCreationController: error during image processing: cause Invalid state: Sticker mode not set", 245701013);
                return;
            }
            AbstractC23641Du.A05(cutoutStickerCreationController$genericCutoutAiProcessorExceptionHandler$$inlined$CoroutineExceptionHandler$1, mc7, c57312k6);
        }
    }

    public static final String A00(C48591LeT c48591LeT) {
        Resources resources;
        int i;
        AbstractC47286Kux abstractC47286Kux = c48591LeT.A04;
        if (abstractC47286Kux instanceof KN7) {
            resources = c48591LeT.A0I.getResources();
            i = 2131957405;
        } else {
            if (!(abstractC47286Kux instanceof KN8) || c48591LeT.A0S.A0F() == C05F.A01) {
                return "";
            }
            resources = c48591LeT.A0I.getResources();
            i = 2131957406;
        }
        String string = resources.getString(i);
        C14360o3.A0A(string);
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C48591LeT r13) {
        /*
            X.8OP r3 = r13.A0S
            java.lang.Integer r1 = r3.A0F()
            if (r1 == 0) goto L4b
            X.0do r0 = r13.A0X
            java.lang.Object r4 = r0.getValue()
            X.8EV r4 = (X.C8EV) r4
            java.lang.Integer r6 = X.C05F.A01
            boolean r2 = X.AbstractC167007dF.A1X(r1, r6)
            java.lang.Integer r5 = r13.A0T
            java.lang.Integer r0 = r3.A0F()
            if (r0 != r6) goto L4c
            X.LAD r0 = r3.A00
            if (r0 == 0) goto L4c
            java.util.List r0 = r0.A02()
            if (r0 == 0) goto L4c
            int r1 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L4c
            java.lang.Long r8 = X.AbstractC31171DnF.A0V(r1)
        L36:
            X.Kux r0 = r13.A04
            boolean r0 = r0 instanceof X.KN7
            if (r0 == 0) goto L3e
            java.lang.Integer r6 = X.C05F.A00
        L3e:
            java.lang.Integer r11 = r13.A0D
            X.AbstractC167017dG.A1Q(r5, r6)
            r7 = 0
            if (r2 == 0) goto L4e
            java.lang.String r9 = "use_manual_seg_sticker_button_tapped"
            X.C8EV.A00(r4, r5, r6, r7, r8, r9)
        L4b:
            return
        L4c:
            r8 = 0
            goto L36
        L4e:
            java.lang.String r13 = "use_auto_seg_sticker_button_tapped"
            r8 = r4
            r9 = r5
            r10 = r6
            r12 = r7
            X.C8EV.A00(r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48591LeT.A01(X.LeT):void");
    }

    @Override // X.MSD
    public final java.util.Set Acr() {
        return this.A0W;
    }

    @Override // X.MSD
    public final boolean CJQ() {
        Integer num;
        IgdsMediaButton igdsMediaButton;
        C0UO c0uo = this.A0S.A0I;
        if (AbstractC43592JPx.A0X(c0uo).A05 != null && AbstractC43592JPx.A0X(c0uo).A05 != C05F.A0C && AbstractC43592JPx.A0X(c0uo).A05 != C05F.A0u && AbstractC43592JPx.A0X(c0uo).A05 != C05F.A0N && !this.A0E) {
            boolean A06 = C18U.A06(C06090Tz.A05, this.A0P, 36323483315088680L);
            Context context = this.A0I;
            if (A06) {
                context = AbstractC53172bz.A01(context);
            }
            C193328hC A0I = AbstractC31171DnF.A0I(context);
            A0I.A0A(2131957415);
            A0I.A09(2131957411);
            A0I.A0L(DialogInterfaceOnClickListenerC48023LMs.A00(this, 15), 2131957412);
            A0I.A0I(null, 2131957413);
            IgdsMediaButton igdsMediaButton2 = this.A0C;
            if ((igdsMediaButton2 != null && igdsMediaButton2.isEnabled()) || ((igdsMediaButton = this.A0A) != null && igdsMediaButton.isEnabled())) {
                A0I.A0H(DialogInterfaceOnClickListenerC48023LMs.A00(this, 14), 2131957414);
            }
            AbstractC166987dD.A1W(A0I);
            return true;
        }
        if (this.A0D == C05F.A1F && AbstractC43592JPx.A0X(c0uo).A05 == C05F.A0N) {
            this.A0R.D95();
            return true;
        }
        if (this.A04 instanceof KN8) {
            this.A0R.DEz();
        }
        C8EV c8ev = (C8EV) this.A0X.getValue();
        Integer num2 = this.A0T;
        if (this.A04 instanceof KN7) {
            num = C05F.A00;
        } else {
            num = C05F.A01;
        }
        Integer num3 = this.A0D;
        C14360o3.A0B(num2, 0);
        C14360o3.A0B(num, 1);
        C8EV.A00(c8ev, num2, num, num3, null, "sticker_creation_quitted");
        return false;
    }

    @Override // X.MSD
    public final void CxN() {
        this.A0R.D5Y();
    }

    @Override // X.MSD
    public final void DhN() {
    }

    @Override // X.MSD
    public final void close() {
        C8OP c8op;
        AnonymousClass195 anonymousClass195;
        if ((!(this.A04 instanceof KN7)) && ((anonymousClass195 = (c8op = this.A0S).A03) == null || anonymousClass195.CRW())) {
            ((CutoutStickerRepository) c8op.A0F.getValue()).A01();
        }
        this.A04 = null;
        C47806L9o c47806L9o = this.A05;
        if (c47806L9o != null) {
            c47806L9o.A01();
        }
        C47806L9o c47806L9o2 = this.A05;
        if (c47806L9o2 != null) {
            c47806L9o2.A00();
        }
        L7y l7y = this.A06;
        if (l7y != null) {
            l7y.A00();
        }
        AbstractC167007dF.A0x(this.A0F);
        ComposeView composeView = this.A01;
        if (composeView != null) {
            CY5.A01(composeView, this.A0P, this.A0U, AbstractC27785CNa.A01);
        }
        this.A0S.A0G();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0U;
    }

    @Override // X.MSD
    public final /* synthetic */ boolean isScrolledToBottom() {
        return false;
    }

    @Override // X.MSD
    public final /* synthetic */ boolean isScrolledToTop() {
        return false;
    }

    public C48591LeT(Activity activity, View view, ViewStub viewStub, ViewStub viewStub2, Fragment fragment, InterfaceC018407e interfaceC018407e, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC186068Na interfaceC186068Na, Integer num, Integer num2, String str) {
        C52942bb c52942bb;
        AbstractC37302Gc3.A1U(viewStub, viewStub2);
        C14360o3.A0B(userSession, 6);
        C14360o3.A0B(num2, 13);
        this.A0M = fragment;
        this.A0b = interfaceC018407e;
        this.A0K = viewStub;
        this.A0L = viewStub2;
        this.A0J = view;
        this.A0P = userSession;
        this.A0O = interfaceC11380iw;
        this.A0R = interfaceC186068Na;
        this.A0I = activity;
        this.A0V = str;
        this.A0T = num;
        this.A0D = num2;
        this.A0Y = MHQ.A00(this, 13);
        C0eR c0eR = fragment.mLifecycleRegistry;
        C14360o3.A07(c0eR);
        this.A0N = AbstractC57302k5.A00(c0eR);
        this.A0W = AbstractC31171DnF.A0l();
        this.A0X = AbstractC09440dt.A01(new MHQ(this, 10));
        boolean A1a = AbstractC31178DnM.A1a(this.A0Y);
        Application application = activity.getApplication();
        C14360o3.A07(application);
        C8OO c8oo = new C8OO(application, userSession);
        if (A1a) {
            c52942bb = new C52942bb(c8oo, interfaceC018407e);
        } else {
            c52942bb = new C52942bb(c8oo, fragment);
        }
        this.A0S = (C8OP) c52942bb.A00(C8OP.class);
        this.A0Q = (C25875Bca) new C52942bb(new KFZ(C5YB.A00(250.0f, 250.0f)), fragment).A00(C25875Bca.class);
        this.A0G = 360L;
        this.A0H = 512L;
        this.A0a = MHQ.A00(this, 16);
        this.A0Z = MHQ.A00(this, 15);
        this.A0U = "cutout_sticker_creation";
    }
}
