package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.util.LruCache;
import android.util.Size;
import android.view.GestureDetector;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.AudienceList;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel;
import com.instagram.creation.capture.quickcapture.thirdpartymedia.GiphyClipsBrowserFragment;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.reels.store.ReelStore;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;
import go.Seq;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class BAO extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public static Object A00(Object obj, BAO bao) {
        C14360o3.A0B(obj, 0);
        return bao.A02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BAO(int i, Object obj, Object obj2) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        int i;
        C195868lW c195868lW;
        C8JT c8jt;
        Integer num;
        C8IW c8iw;
        Rect rect;
        int i2;
        int i3;
        InterfaceC16660sJ interfaceC16660sJ;
        InterfaceC197178nn interfaceC197178nn;
        InterfaceC16660sJ interfaceC16660sJ2;
        Object decodeFile;
        String str2;
        List unmodifiableList;
        C6Er c6Er;
        switch (this.A00) {
            case 0:
                Q08 q08 = (Q08) obj;
                C14360o3.A0B(q08, 0);
                AnonymousClass630 anonymousClass630 = (AnonymousClass630) this.A01;
                C70694WfH c70694WfH = (C70694WfH) this.A02;
                C1339263a c1339263a = c70694WfH.A00;
                synchronized (c1339263a.A0A) {
                    c6Er = c1339263a.A00;
                }
                anonymousClass630.A0I(new C6FO(c6Er), C70694WfH.A00(q08, c70694WfH, C05F.A01), "acq", c70694WfH.A01);
                return C0eB.A00;
            case 1:
                SVX svx = (SVX) obj;
                if (svx != null && (unmodifiableList = Collections.unmodifiableList(svx.A00)) != null) {
                    SJK sjk = (SJK) this.A02;
                    Iterator it = unmodifiableList.iterator();
                    while (it.hasNext()) {
                        sjk.A04.add(new C62518SEu(((AbstractC62588SHo) it.next()).A00));
                    }
                }
                ((InterfaceC16660sJ) this.A01).invoke(svx);
                ((SJK) this.A02).A08.invoke();
                return C0eB.A00;
            case 2:
                C07T lifecycle = ((C07X) this.A02).getLifecycle();
                MU2 mu2 = new MU2(this.A01, 3);
                lifecycle.A09(mu2);
                return new C25240BEy(12, mu2, lifecycle);
            case 3:
                InterfaceC113515Ao interfaceC113515Ao = (InterfaceC113515Ao) obj;
                List<C127015of> list = (List) A00(interfaceC113515Ao, this);
                Object obj2 = this.A01;
                ArrayList A0q = AbstractC167017dG.A0q(list);
                for (C127015of c127015of : list) {
                    A0q.add(new C137476Ks((String) c127015of.A02, new C29899DGn(18, c127015of, obj2)));
                }
                interfaceC113515Ao.EOx(AbstractC120875de.A03, A0q);
                return C0eB.A00;
            case 4:
            case 6:
            default:
                return ((InterfaceC16660sJ) this.A01).invoke(((List) this.A02).get(AbstractC166987dD.A0H(obj)));
            case 5:
                View view = (View) obj;
                C14360o3.A0B(view, 0);
                ((InterfaceC30989Djo) this.A01).ADv(view, this.A02);
                return C0eB.A00;
            case 7:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                decodeFile = this.A02;
                interfaceC16660sJ.invoke(decodeFile);
                return C0eB.A00;
            case 8:
                C137576Ld c137576Ld = (C137576Ld) obj;
                C14360o3.A0B(c137576Ld, 0);
                return c137576Ld.A00(new C30174DRe(this.A01, (int) C5YC.A02(c137576Ld.A00.Bxc()), this.A02, (int) C5YC.A00(c137576Ld.A00.Bxc()), 3));
            case 9:
                COV cov = (COV) obj;
                C14360o3.A0B(cov, 0);
                C26546Bo5 c26546Bo5 = (C26546Bo5) this.A02;
                C76223bS c76223bS = (C76223bS) this.A01;
                InterfaceC30790DgR A03 = C26546Bo5.A03(c76223bS, c26546Bo5);
                C26103Bgn c26103Bgn = new C26103Bgn(AbstractC77623dm.A03(c76223bS, R.color.grey_8_40_transparent));
                C26076Bg5 c26076Bg5 = cov.A00;
                ((List) c26076Bg5.A01).add(new C26091Bgb(null, c26103Bgn, A03, 3));
                InterfaceC30790DgR A032 = C26546Bo5.A03(c76223bS, c26546Bo5);
                C26103Bgn c26103Bgn2 = new C26103Bgn(AbstractC77623dm.A03(c76223bS, R.color.white_5_transparent));
                Context context = c76223bS.A05.A0C;
                C14360o3.A07(context);
                ((List) c26076Bg5.A01).add(new C26094Bge(null, c26103Bgn2, A032, null, AbstractC13690mv.A00(context, 1.0f), 4.0f, 0.0f, 3, 0, 0));
                return C0eB.A00;
            case 10:
                InterfaceC30808Dgj interfaceC30808Dgj = (InterfaceC30808Dgj) obj;
                C25523BQl c25523BQl = (C25523BQl) A00(interfaceC30808Dgj, this);
                C25523BQl.A03((C51762Yz) this.A01, interfaceC30808Dgj, c25523BQl, c25523BQl.A0I);
                return C0eB.A00;
            case 11:
                C2YN c2yn = (C2YN) obj;
                C26619BpG c26619BpG = (C26619BpG) A00(c2yn, this);
                c2yn.A02(new C30485DbU(28, this.A01, c26619BpG), new Object[]{c26619BpG.A00, c26619BpG.A04});
                return C0eB.A00;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C26573BoW c26573BoW = (C26573BoW) this.A02;
                C26573BoW.A03(c26573BoW.A00, (C76223bS) this.A01, c26573BoW);
                return C0eB.A00;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C2XB c2xb = (C2XB) obj;
                C14360o3.A0B(c2xb, 0);
                C77123cy c77123cy = (C77123cy) ((C37838Gks) this.A01).A05;
                View view2 = c2xb.A01;
                C2XV.A00();
                c77123cy.A00 = view2;
                return Boolean.valueOf(((GestureDetector) this.A02).onTouchEvent(c2xb.A00));
            case 14:
                C212089ad c212089ad = (C212089ad) this.A02;
                InterfaceC16610sE interfaceC16610sE = c212089ad.A02;
                String str3 = c212089ad.A00;
                String str4 = c212089ad.A01;
                boolean z = c212089ad.A03;
                interfaceC16610sE.invoke(str3, str4, Boolean.valueOf(z));
                ((C131325wL) this.A01).A02(z, false, false);
                return C0eB.A00;
            case Process.SIGTERM /* 15 */:
                InterfaceC31035DkZ interfaceC31035DkZ = (InterfaceC31035DkZ) obj;
                C14360o3.A0B(interfaceC31035DkZ, 0);
                BRG brg = (BRG) this.A02;
                String str5 = brg.A03.A09;
                C14360o3.A0B(str5, 0);
                long A033 = AbstractC167027dH.A03(str5);
                brg.A04.DQj((FragmentActivity) this.A01, brg.A01, brg.A02, (EnumC27426C8t) interfaceC31035DkZ, A033);
                return C0eB.A00;
            case 16:
                BRG brg2 = (BRG) this.A02;
                BRG.A05((C76223bS) this.A01, brg2.A03, brg2);
                return C0eB.A00;
            case 17:
                C14360o3.A0B(obj, 0);
                ((C51762Yz) this.A01).A00();
                interfaceC16660sJ2 = ((BRG) this.A02).A06;
                interfaceC16660sJ2.invoke(obj);
                return C0eB.A00;
            case 18:
                InterfaceC80043ht interfaceC80043ht = (InterfaceC80043ht) this.A01;
                SocialContextBubbleUiState socialContextBubbleUiState = (SocialContextBubbleUiState) this.A02;
                String str6 = socialContextBubbleUiState.A09;
                C14360o3.A0B(str6, 0);
                long A034 = AbstractC167027dH.A03(str6);
                int i4 = socialContextBubbleUiState.A00;
                SocialContextType socialContextType = socialContextBubbleUiState.A02;
                if (socialContextType == SocialContextType.A05) {
                    str2 = socialContextBubbleUiState.A08;
                } else {
                    str2 = null;
                }
                interfaceC80043ht.DHY(socialContextType, str2, i4, A034);
                return C0eB.A00;
            case Process.SIGSTOP /* 19 */:
                String A0Q = AbstractC167027dH.A0Q(obj);
                C28359CfJ.A00((GestureDetector) this.A02);
                ((InterfaceC80043ht) this.A01).Dxx(A0Q);
                return C0eB.A00;
            case 20:
                String A0Q2 = AbstractC167027dH.A0Q(obj);
                C28359CfJ.A00((GestureDetector) this.A02);
                ((InterfaceC80043ht) this.A01).DK7(A0Q2);
                return C0eB.A00;
            case 21:
                ((Handler) this.A02).removeCallbacksAndMessages(null);
                ((Handler) this.A01).removeCallbacksAndMessages(null);
                return C0eB.A00;
            case 22:
                String A0Q3 = AbstractC167027dH.A0Q(obj);
                InterfaceC16660sJ interfaceC16660sJ3 = (InterfaceC16660sJ) this.A01;
                if (interfaceC16660sJ3 != null) {
                    interfaceC16660sJ3.invoke(A0Q3);
                }
                ((KEH) this.A02).A04(A0Q3, -1L);
                return C0eB.A00;
            case 23:
                InterfaceC1131459c interfaceC1131459c = (InterfaceC1131459c) obj;
                ((InterfaceC74953Yl) A00(interfaceC1131459c, this)).Egh(new C119055aN(interfaceC1131459c.Bxd()));
                ((InterfaceC74953Yl) this.A01).Egh(new C119365at(interfaceC1131459c.Chn(0L)));
                return C0eB.A00;
            case 24:
                C43830JZt c43830JZt = (C43830JZt) this.A02;
                GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs = c43830JZt.A0F.A00;
                C43830JZt c43830JZt2 = gestureDetectorOnGestureListenerC43829JZs.A14;
                View view3 = c43830JZt2.A0G.A02.A03.A01;
                C195448kk A00 = AbstractC195438kj.A00(gestureDetectorOnGestureListenerC43829JZs.A0z);
                if (GestureDetectorOnGestureListenerC43829JZs.A0S(gestureDetectorOnGestureListenerC43829JZs) && !gestureDetectorOnGestureListenerC43829JZs.A1O && (!((Collection) A00.A06.getValue()).isEmpty())) {
                    C43851JaF c43851JaF = gestureDetectorOnGestureListenerC43829JZs.A16;
                    Activity activity = (Activity) AbstractC13320mI.A01(gestureDetectorOnGestureListenerC43829JZs.getContext(), Activity.class);
                    if (view3 == null) {
                        view3 = gestureDetectorOnGestureListenerC43829JZs.A11.A01;
                    }
                    View view4 = view3;
                    List A01 = C9KQ.A01((List) c43830JZt2.A0H.A06.getValue());
                    Resources resources = gestureDetectorOnGestureListenerC43829JZs.getResources();
                    C14360o3.A07(resources);
                    EnumC58132lV B7C = gestureDetectorOnGestureListenerC43829JZs.A17.B7C();
                    C14360o3.A07(B7C);
                    C14360o3.A0B(activity, 0);
                    if (!c43851JaF.A02 && view4 != null) {
                        UserSession userSession = c43851JaF.A04;
                        if (AbstractC166987dD.A0x(userSession).getInt("meta_gallery_tooltip_impression_count", 0) < 1 && C18U.A06(C06090Tz.A05, userSession, 36316645727146553L)) {
                            ArrayList A0q2 = AbstractC167017dG.A0q(A01);
                            Iterator it2 = A01.iterator();
                            while (it2.hasNext()) {
                                A0q2.add(((C24164Ann) it2.next()).A02);
                            }
                            c43851JaF.A00(AbstractC34762FTh.A00(activity, view4, userSession, B7C, AbstractC34762FTh.A01(resources, A0q2)));
                        }
                    }
                }
                ((C43848JaC) this.A01).A00(c43830JZt.A0C());
                c43830JZt.A0I(c43830JZt.A0B());
                GestureDetectorOnGestureListenerC43829JZs.A0F(gestureDetectorOnGestureListenerC43829JZs);
                return C0eB.A00;
            case 25:
                GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs2 = (GestureDetectorOnGestureListenerC43829JZs) this.A02;
                AbstractC226309yn.A00(AbstractC166997dE.A0L(gestureDetectorOnGestureListenerC43829JZs2));
                if (this.A01 == gestureDetectorOnGestureListenerC43829JZs2.A0B) {
                    gestureDetectorOnGestureListenerC43829JZs2.A0a(C05F.A00, true);
                }
                return C0eB.A00;
            case 26:
                if (obj == null) {
                    interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                    interfaceC197178nn = ((P0A) this.A02).A0I;
                    decodeFile = BitmapFactory.decodeFile(interfaceC197178nn.Avl());
                    interfaceC16660sJ.invoke(decodeFile);
                    return C0eB.A00;
                }
                interfaceC16660sJ2 = (InterfaceC16660sJ) this.A01;
                interfaceC16660sJ2.invoke(obj);
                return C0eB.A00;
            case 27:
                if (obj == null) {
                    interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                    interfaceC197178nn = ((C56208OxH) this.A02).A09;
                    decodeFile = BitmapFactory.decodeFile(interfaceC197178nn.Avl());
                    interfaceC16660sJ.invoke(decodeFile);
                    return C0eB.A00;
                }
                interfaceC16660sJ2 = (InterfaceC16660sJ) this.A01;
                interfaceC16660sJ2.invoke(obj);
                return C0eB.A00;
            case 28:
                C54830OLp c54830OLp = (C54830OLp) obj;
                ((AbstractC51163Mj6) A00(c54830OLp, this)).A01(c54830OLp.A02);
                ((AbstractC51163Mj6) this.A01).A01(c54830OLp.A00);
                return C0eB.A00;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                ((Medium) this.A02).A0I = bool;
                ((InterfaceC56392iX) this.A01).setVisibility(AbstractC167007dF.A05(booleanValue ? 1 : 0));
                return C0eB.A00;
            case 30:
                UserSession userSession2 = (UserSession) A00(obj, this);
                C14360o3.A0B(userSession2, 1);
                InterfaceC73153Pq interfaceC73153Pq = (InterfaceC73153Pq) ((C73133Po) ((InterfaceC73103Pl) userSession2.A01(C73133Po.class, new C57526Pg0(userSession2, 7)))).A00.getValue();
                C1DX A002 = C1DW.A00(userSession2);
                C1OU c1ou = C1OU.$redex_init_class;
                ReelStore A035 = ReelStore.A03(userSession2);
                C14360o3.A07(A035);
                return new GalleryMemoriesViewModel(userSession2, (C1810981l) this.A01, A002, C188758Xr.A00, interfaceC73153Pq, C1AT.A01(userSession2).A04(C1AV.A2B, obj.getClass()), A035);
            case 31:
                C8MR c8mr = (C8MR) this.A02;
                c8mr.A00();
                if (obj != null) {
                    C183978Ee c183978Ee = (C183978Ee) this.A01;
                    C14360o3.A0B(c183978Ee, 0);
                    C210749Tw c210749Tw = c8mr.A00;
                    if (c210749Tw != null) {
                        String A06 = c183978Ee.A06();
                        Size size = new Size(c183978Ee.A09, c183978Ee.A06);
                        C14360o3.A0B(A06, 0);
                        List list2 = (List) c210749Tw.A00.get(A06);
                        Object obj3 = null;
                        if (list2 != null) {
                            ArrayList A1E = AbstractC166987dD.A1E();
                            for (Object obj4 : list2) {
                                if (((C9VG) obj4).A00 > 0.7f) {
                                    A1E.add(obj4);
                                }
                            }
                            ArrayList<RectF> A0i = AbstractC167007dF.A0i(A1E);
                            Iterator it3 = A1E.iterator();
                            while (it3.hasNext()) {
                                A0i.add(((C9VG) it3.next()).A01);
                            }
                            ArrayList A0i2 = AbstractC167007dF.A0i(A0i);
                            for (RectF rectF : A0i) {
                                float f = 5.0f / 100.0f;
                                int height = (int) (size.getHeight() * f);
                                int height2 = size.getHeight() - height;
                                int width = (int) (size.getWidth() * f);
                                int width2 = size.getWidth() - width;
                                float f2 = rectF.left;
                                int i5 = 1;
                                int i6 = (int) f2;
                                if (f2 < width) {
                                    i6 = 1;
                                }
                                float f3 = rectF.top;
                                if (f3 >= height) {
                                    i5 = (int) f3;
                                }
                                float f4 = rectF.right;
                                if (f4 > width2) {
                                    i2 = size.getWidth();
                                } else {
                                    i2 = (int) f4;
                                }
                                float f5 = rectF.bottom;
                                if (f5 > height2) {
                                    i3 = size.getHeight();
                                } else {
                                    i3 = (int) f5;
                                }
                                A0i2.add(AbstractC166987dD.A0V(i6, i5, i2, i3));
                            }
                            if (A0i2.isEmpty()) {
                                rect = AbstractC166987dD.A0U();
                            } else {
                                Iterator it4 = A0i2.iterator();
                                if (it4.hasNext()) {
                                    obj3 = it4.next();
                                    while (it4.hasNext()) {
                                        Rect rect2 = (Rect) obj3;
                                        rect2.union((Rect) it4.next());
                                        obj3 = rect2;
                                    }
                                }
                                rect = (Rect) obj3;
                            }
                            if (rect != null) {
                                int i7 = 0;
                                boolean A1P = AbstractC167007dF.A1P(rect.left, 1);
                                boolean A1P2 = AbstractC167007dF.A1P(rect.top, 1);
                                boolean A1P3 = AbstractC167007dF.A1P(rect.right, c183978Ee.A09);
                                if (rect.bottom == c183978Ee.A06) {
                                    i7 = 1;
                                }
                                Rect A0V = AbstractC166987dD.A0V(A1P ? 1 : 0, A1P2 ? 1 : 0, A1P3 ? 1 : 0, i7);
                                boolean equals = AbstractC166987dD.A0U().equals(rect);
                                C183608Cl c183608Cl = c8mr.A05;
                                if (c183608Cl != null) {
                                    c183608Cl.A01 = !equals;
                                    C05A c05a = c183608Cl.A05;
                                    do {
                                    } while (!c05a.AIi(c05a.getValue(), A0V));
                                }
                            }
                        }
                    }
                }
                return C0eB.A00;
            case 32:
                C183978Ee c183978Ee2 = (C183978Ee) obj;
                ((C24061Alx) A00(c183978Ee2, this)).A03.A04(new C8WN(new C198308pf(c183978Ee2), (JIN) this.A01));
                return C0eB.A00;
            case 33:
                File file = (File) obj;
                C14360o3.A0B(file, 0);
                C9U1.A00(new C218669lc(C8IU.A03(file, 1, 0), (JIN) this.A01), (C9U1) this.A02);
                return C0eB.A00;
            case 34:
                C8DN c8dn = ((C172437mC) this.A02).A0F;
                String str7 = ((C187018Qu) this.A01).A01;
                C8Y8 A003 = C8DN.A00(c8dn);
                if (A003 != null) {
                    C8Y8.A0A(A003, Collections.singletonList(str7), 1);
                }
                return C0eB.A00;
            case 35:
                C8DN c8dn2 = ((C172437mC) this.A02).A0F;
                C187018Qu c187018Qu = (C187018Qu) this.A01;
                String str8 = c187018Qu.A01;
                String str9 = c187018Qu.A02;
                boolean z2 = c187018Qu.A05;
                C8Y8 A004 = C8DN.A00(c8dn2);
                if (A004 != null) {
                    AudienceList audienceList = new AudienceList(str8, str9, false, z2, z2);
                    UserSession userSession3 = A004.A05;
                    new FRU(A004.A0G, userSession3).A02(EnumC33505Ere.AUDIENCE_LONG_PRESS, str8, str9);
                    AbstractC59962oe abstractC59962oe = A004.A02;
                    AbstractC35049FcM.A02(audienceList, abstractC59962oe, userSession3, 9413, AbstractC167007dF.A1R(0, userSession3, abstractC59962oe));
                }
                return C0eB.A00;
            case 36:
                C172437mC c172437mC = (C172437mC) this.A02;
                UserSession userSession4 = c172437mC.A0C;
                Activity activity2 = c172437mC.A08;
                InterfaceC1816483t interfaceC1816483t = (InterfaceC1816483t) this.A01;
                AbstractC35258Fgs.A05(activity2, userSession4, interfaceC1816483t.BAt(), interfaceC1816483t.getName());
                return C0eB.A00;
            case 37:
                ((C172437mC) this.A02).A0F.A0H(((InterfaceC1816483t) this.A01).BAt(), false);
                return C0eB.A00;
            case 38:
                C8DN c8dn3 = ((C172437mC) this.A02).A0F;
                String BAt = ((InterfaceC1816483t) this.A01).BAt();
                C8Y8 A005 = C8DN.A00(c8dn3);
                if (A005 != null) {
                    A005.A0F(BAt);
                }
                return C0eB.A00;
            case 39:
                AbstractC52972be abstractC52972be = (AbstractC52972be) obj;
                C14360o3.A0B(abstractC52972be, 0);
                InterfaceC61162qe interfaceC61162qe = (InterfaceC61162qe) abstractC52972be.A00(C183638Co.A00);
                if (interfaceC61162qe != null) {
                    C183858Dl c183858Dl = new C183858Dl();
                    UserSession userSession5 = (UserSession) this.A02;
                    return new C210769Ty(userSession5, new C183888Do(userSession5, (C183878Dn) interfaceC61162qe.Bnn().A00(C183878Dn.class, new C9ES(c183858Dl, 10)), C16910sj.A00), (C1810281e) this.A01);
                }
                throw AbstractC166987dD.A14("No repository store owner found");
            case 40:
                Iterable iterable = (Iterable) obj;
                C14360o3.A0B(iterable, 0);
                c195868lW = (C195868lW) this.A01;
                c195868lW.A0u = AbstractC001800i.A0X(iterable);
                c8jt = (C8JT) this.A02;
                if (C1810981l.A05(C81W.A0z, c8jt.A1F) && (c8iw = c8jt.A0C) != null) {
                    C8JT.A0r(c8jt);
                    c8iw.A00(c195868lW);
                    return C0eB.A00;
                }
                if (c8jt.A1k.A03.A0N()) {
                    C8JT.A0r(c8jt);
                    C8JT.A13(c8jt, c195868lW);
                    return C0eB.A00;
                }
                if (c8jt.A0T != null) {
                    C8JT.A0r(c8jt);
                    if (!C8JT.A1V(c8jt)) {
                        num = C05F.A01;
                        C8JT.A14(c8jt, c195868lW, num);
                    }
                }
                return C0eB.A00;
            case Seq.NULL_REFNUM /* 41 */:
                c195868lW = (C195868lW) obj;
                c8jt = (C8JT) A00(c195868lW, this);
                if (!C8JT.A1V(c8jt)) {
                    C8JT.A0h(c8jt);
                }
                if (C1810981l.A05(C81W.A0z, c8jt.A1F) && (c8iw = c8jt.A0C) != null) {
                    AbstractC166987dD.A0u(c8jt.A1D).A00(c8jt.A1t);
                    c8iw.A00(c195868lW);
                    return C0eB.A00;
                }
                if (!c8jt.A1k.A03.A0N()) {
                    if (!C8JT.A1V(c8jt)) {
                        num = (Integer) this.A01;
                        C8JT.A14(c8jt, c195868lW, num);
                    }
                    return C0eB.A00;
                }
                C8JT.A13(c8jt, c195868lW);
                return C0eB.A00;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                View view5 = (View) this.A01;
                View A0S = AbstractC166997dE.A0S(view5, R.id.mini_timeline_middle_seekbar);
                Context context2 = view5.getContext();
                Resources resources2 = context2.getResources();
                EnumC189218Zt enumC189218Zt = EnumC189218Zt.A04;
                int i8 = R.dimen.account_discovery_bottom_gap;
                if (obj == enumC189218Zt) {
                    i8 = R.dimen.abc_dialog_padding_material;
                }
                AbstractC226879zj.A00(A0S, resources2.getDimension(i8));
                C52133N5h c52133N5h = (C52133N5h) this.A02;
                C50860Mdr c50860Mdr = c52133N5h.A05;
                if (c50860Mdr == null) {
                    str = "miniTimelineViewModel";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                c52133N5h.requireContext();
                ClipsCreationViewModel clipsCreationViewModel = c52133N5h.A04;
                if (clipsCreationViewModel != null) {
                    c50860Mdr.A0E((c52133N5h.A00 / 2) - ((int) context2.getResources().getDimension(R.dimen.account_discovery_bottom_gap)), AbstractC167007dF.A1X(obj, enumC189218Zt), ((C84B) clipsCreationViewModel.A0c.getValue()).A05());
                    return C0eB.A00;
                }
                str = "clipsCreationViewModel";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 43:
                LruCache lruCache = (LruCache) obj;
                C56050OuP c56050OuP = (C56050OuP) this.A02;
                if (!c56050OuP.A0N.A0s()) {
                    AbstractC187378Sf A0E = ((C187358Sd) this.A01).A0E();
                    if (A0E instanceof AbstractC187488Sq) {
                        C52408NHe c52408NHe = c56050OuP.A0J;
                        C14360o3.A0A(lruCache);
                        int segmentIndex = ((AbstractC187488Sq) A0E).getSegmentIndex();
                        C14360o3.A0B(lruCache, 0);
                        AbstractC53445NkY abstractC53445NkY = (AbstractC53445NkY) ((AbstractC51134Mid) c52408NHe).A03.get(segmentIndex);
                        if (abstractC53445NkY instanceof C52429NHz) {
                            InterfaceC115505Kk interfaceC115505Kk = ((C52429NHz) abstractC53445NkY).A00;
                            if (interfaceC115505Kk != null) {
                                ArrayList A1F = AbstractC166987dD.A1F(c52408NHe.A05);
                                C183298Bb c183298Bb = c52408NHe.A0A;
                                String str10 = (String) new C206899Du(c183298Bb.A00(), 49).invoke(interfaceC115505Kk);
                                int A0H = AbstractC166987dD.A0H(c183298Bb.A00().A05.invoke(interfaceC115505Kk));
                                C51683MsE c51683MsE = new C51683MsE(null, A0H, c183298Bb.A00().A02, c183298Bb.A00().A01, true);
                                for (int i9 = 0; i9 < A0H; i9++) {
                                    Bitmap bitmap = (Bitmap) lruCache.get(new C206369Bt(str10, AbstractC166987dD.A0H(c183298Bb.A00().A07.invoke(Integer.valueOf(i9), interfaceC115505Kk)), 2));
                                    if (bitmap != null) {
                                        c51683MsE.A00(i9, bitmap);
                                    }
                                }
                                A1F.set(segmentIndex, AbstractC166987dD.A1L(str10, c51683MsE));
                                C66582za A006 = AbstractC66552zX.A00(new C9U8(c52408NHe.A05, A1F));
                                c52408NHe.A05 = A1F;
                                A006.A02(new C55584OmN(c52408NHe));
                            } else {
                                AbstractC12120kG.A07(MSV.A00(862), MSV.A00(1707), null);
                            }
                        }
                    } else if (A0E instanceof C8TG) {
                        C52408NHe c52408NHe2 = c56050OuP.A0J;
                        C14360o3.A0A(lruCache);
                        c52408NHe2.A07(lruCache);
                    }
                }
                return C0eB.A00;
            case 44:
                float A09 = AbstractC166987dD.A09(obj);
                boolean z3 = ((C187358Sd) this.A01).A0E() instanceof AbstractC187488Sq;
                C56050OuP c56050OuP2 = (C56050OuP) this.A02;
                if (z3) {
                    FilmstripTimelineView A04 = c56050OuP2.A04();
                    if (A04 != null) {
                        A04.setSeekPosition(A09);
                    }
                } else {
                    c56050OuP2.A05();
                }
                return C0eB.A00;
            case 45:
                List list3 = (List) obj;
                NIW niw = (NIW) A00(list3, this);
                NIW.A00(niw, (AudioOverlayTrack) this.A01, ((AbstractC50863Mdu) niw).A01.A02, list3);
                return C0eB.A00;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                C128175qm c128175qm = (C128175qm) obj;
                C14360o3.A0B(c128175qm, 0);
                ClipsSharingDraftViewModel clipsSharingDraftViewModel = (ClipsSharingDraftViewModel) this.A02;
                C183348Bh A007 = AbstractC183338Bg.A00(clipsSharingDraftViewModel.A04);
                String str11 = c128175qm.A0T;
                C14360o3.A0B(str11, 0);
                AHF A008 = C183348Bh.A00(A007);
                A008.A04.put("clips_session_id", str11);
                A008.A04("draft_update_tried");
                clipsSharingDraftViewModel.A07.A0N(((MXY) this.A01).A01(c128175qm));
                return C0eB.A00;
            case 47:
                boolean z4 = true;
                if (AbstractC166987dD.A09(obj) <= 0.0f) {
                    ClipsCreationViewModel clipsCreationViewModel2 = ((N6Y) this.A02).A02;
                    if (clipsCreationViewModel2 != null) {
                        if (!AbstractC166987dD.A1b((List) clipsCreationViewModel2.A0K.A0S.getValue())) {
                            z4 = false;
                        }
                    }
                    str = "clipsCreationViewModel";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                TextView textView = (TextView) this.A01;
                if (z4) {
                    i = ((N6Y) this.A02).A00;
                } else {
                    i = 2131953310;
                }
                textView.setText(i);
                C51159Mj2 c51159Mj2 = ((N6Y) this.A02).A03;
                if (c51159Mj2 == null) {
                    str = "voiceEffectsGridAdapter";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                c51159Mj2.A00 = z4;
                c51159Mj2.notifyDataSetChanged();
                return C0eB.A00;
            case 48:
                Medium medium = (Medium) obj;
                C14360o3.A0B(medium, 0);
                ViewOnTouchListenerC48086LQl viewOnTouchListenerC48086LQl = ((GiphyClipsBrowserFragment) this.A02).A04;
                if (viewOnTouchListenerC48086LQl == null) {
                    str = "peekController";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                String str12 = ((C45056Jwl) this.A01).A05;
                C14360o3.A0B(str12, 0);
                if (!viewOnTouchListenerC48086LQl.A07 && C14360o3.A0K(viewOnTouchListenerC48086LQl.A06, str12)) {
                    boolean z5 = false;
                    C4S7 c4s7 = new C4S7(medium, 0);
                    c4s7.A00 = true;
                    String str13 = medium.A0X;
                    Integer num2 = C05F.A1F;
                    String A0j = AbstractC167017dG.A0j();
                    if (str13 != null && str13.length() > 0) {
                        z5 = true;
                    }
                    viewOnTouchListenerC48086LQl.A0J.A08(viewOnTouchListenerC48086LQl.A0H, new C75363a3(null, null, null, null, null, num2, null, A0j, null, str13, null, null, null, null, null, null, null, null, null, -1, -1, -1L, false, false, false, true, false, false, z5, false), c4s7, str13, AbstractC43591JPw.A00(1016), 1.0f, -1, 0, true, true);
                }
                return C0eB.A00;
        }
    }
}
