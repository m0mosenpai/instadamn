package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import com.instagram.user.model.User;
import go.Seq;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: X.9EG, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9EG extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9EG(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                C691939f c691939f = (C691939f) this.A01;
                return new C41695IdO(c691939f.A00, c691939f.A01.C9D());
            case 1:
                return new C76543bz(((C691939f) this.A01).A01.CCX());
            case 2:
                return new C85033qr(((C691939f) this.A01).A00);
            case 3:
                return new IL3(((C691839e) this.A01).A00);
            case 4:
                return new C691839e(((C61142qc) this.A01).A00);
            case 5:
                return Boolean.valueOf(((C89673z8) this.A01).A00.A05);
            case 6:
                return new C3H9((int) C18U.A01(C06090Tz.A05, (AbstractC12990ll) this.A01, 36608540295173880L));
            case 7:
                return AbstractC37876GlW.A00(((C690138n) this.A01).A01);
            case 8:
                return AbstractC92484Cf.A00(((C4CZ) this.A01).A01);
            case 9:
                C3VT c3vt = (C3VT) this.A01;
                InterfaceC65282xQ interfaceC65282xQ = c3vt.A03;
                if (interfaceC65282xQ instanceof InterfaceC65222xK) {
                    C1GL c1gl = (C1GL) c3vt.A00;
                    C57112jm c57112jm = c3vt.A02;
                    UserSession userSession = c3vt.A01;
                    C14360o3.A0C(interfaceC65282xQ, "null cannot be cast to non-null type com.instagram.feed.ui.adapter.MediaListProviderAdapter");
                    return new C37466Gek(userSession, c1gl, c57112jm, (InterfaceC65222xK) interfaceC65282xQ);
                }
                throw new IllegalArgumentException("To Support comment lazy loading, implement MediaListProviderAdapter for your adapter");
            case 10:
                C685836v c685836v = (C685836v) this.A01;
                UserSession userSession2 = c685836v.A0A;
                InterfaceC60442pS interfaceC60442pS = c685836v.A0K;
                return new C692639m(c685836v.A02, c685836v.A03, userSession2, c685836v, (C692539l) c685836v.A1N.getValue(), interfaceC60442pS, c685836v.A0M, c685836v.A0O, (C1M1) c685836v.A2E.getValue());
            case 11:
                C685836v c685836v2 = (C685836v) this.A01;
                UserSession userSession3 = c685836v2.A0A;
                Fragment fragment = c685836v2.A02;
                String str = c685836v2.A0s;
                return new C4CZ(fragment, userSession3, c685836v2.A0K, c685836v2.A0W, c685836v2.A0m, str);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C685836v c685836v3 = (C685836v) this.A01;
                return new C37508GfQ(c685836v3.A02, c685836v3.A0A);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C685836v c685836v4 = (C685836v) this.A01;
                return new G7L(c685836v4.A02, c685836v4.A0A, c685836v4.A0K);
            case 14:
                final C75443aB c75443aB = (C75443aB) ((C685836v) this.A01).A1i.getValue();
                return new InterfaceC89303yW(c75443aB) { // from class: X.3yV
                    public final InterfaceC75453aC A00;

                    {
                        C14360o3.A0B(c75443aB, 1);
                        this.A00 = c75443aB;
                    }

                    @Override // X.InterfaceC89303yW
                    public final void D3f(C38321qM c38321qM, C75113Zb c75113Zb, int i) {
                        this.A00.D3f(c38321qM, c75113Zb, i);
                    }
                };
            case Process.SIGTERM /* 15 */:
                C685836v c685836v5 = (C685836v) this.A01;
                final UserSession userSession4 = c685836v5.A0A;
                final Fragment fragment2 = c685836v5.A02;
                return new InterfaceC80083hx(fragment2, userSession4) { // from class: X.3hw
                    public final Fragment A00;
                    public final UserSession A01;

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // X.InterfaceC80083hx
                    public final void D0O() {
                        Fragment fragment3 = this.A00;
                        FragmentActivity activity = fragment3.getActivity();
                        if (activity != null) {
                            C63397SjR c63397SjR = new C63397SjR(activity, this.A01, C2Fb.A0h, MSV.A00(50), false);
                            c63397SjR.A0S = ((InterfaceC11380iw) fragment3).getModuleName();
                            c63397SjR.A0A();
                        }
                    }

                    {
                        this.A01 = userSession4;
                        this.A00 = fragment2;
                    }
                };
            case 16:
                C685836v c685836v6 = (C685836v) this.A01;
                UserSession userSession5 = c685836v6.A0A;
                return new G7K(c685836v6.A02, c685836v6.Abd(), userSession5, c685836v6.A0K);
            case 17:
                final C685836v c685836v7 = (C685836v) this.A01;
                final Fragment fragment3 = c685836v7.A02;
                final UserSession userSession6 = c685836v7.A0A;
                final C79863hb c79863hb = (C79863hb) c685836v7.A1L.getValue();
                final AbstractC61692rW abstractC61692rW = c685836v7.A0N;
                return new InterfaceC101004gG(fragment3, userSession6, c685836v7, c79863hb, abstractC61692rW) { // from class: X.4gF
                    public final Fragment A00;
                    public final UserSession A01;
                    public final InterfaceC686136y A02;
                    public final C79863hb A03;
                    public final AbstractC61692rW A04;

                    {
                        C14360o3.A0B(c79863hb, 4);
                        this.A02 = c685836v7;
                        this.A00 = fragment3;
                        this.A01 = userSession6;
                        this.A03 = c79863hb;
                        this.A04 = abstractC61692rW;
                    }

                    @Override // X.InterfaceC101004gG
                    public final void DLg(C73083Pj c73083Pj, C905741s c905741s, C38321qM c38321qM, C75113Zb c75113Zb) {
                        C14360o3.A0B(c38321qM, 1);
                        c75113Zb.A0I(c73083Pj);
                        AbstractC61692rW abstractC61692rW2 = this.A04;
                        if (abstractC61692rW2 != null && abstractC61692rW2.A0A(((InterfaceC11380iw) this.A00).getModuleName())) {
                            if (c73083Pj.A02 == null && c73083Pj.A04 == null && c73083Pj.A03 == null) {
                                abstractC61692rW2.A02(c38321qM);
                            } else {
                                abstractC61692rW2.A03(c38321qM);
                            }
                        }
                    }

                    @Override // X.InterfaceC101004gG
                    public final void DRG(C38321qM c38321qM) {
                    }

                    @Override // X.C37R
                    public final InterfaceC101074gN Am7() {
                        return this.A02.Am7();
                    }

                    @Override // X.C37P
                    public final BC9 AmP() {
                        return this.A02.AmP();
                    }

                    @Override // X.C37C
                    public final C3h2 BRL() {
                        return this.A02.BRL();
                    }

                    @Override // X.InterfaceC686236z
                    public final InterfaceC86303t2 BRj() {
                        return this.A02.BRj();
                    }

                    @Override // X.AnonymousClass374
                    public final InterfaceC86433tG BRk() {
                        return this.A02.BRk();
                    }

                    @Override // X.C37H
                    public final AnonymousClass428 BZ0() {
                        return this.A02.BZ0();
                    }

                    @Override // X.AnonymousClass379
                    public final AnonymousClass421 BZ3() {
                        return this.A02.BZ3();
                    }
                };
            case 18:
                final C685836v c685836v8 = (C685836v) this.A01;
                final Fragment fragment4 = c685836v8.A02;
                final C81053ja c81053ja = (C81053ja) c685836v8.A1M.getValue();
                final UserSession userSession7 = c685836v8.A0A;
                return new InterfaceC101074gN(fragment4, userSession7, c685836v8, c81053ja) { // from class: X.4gM
                    public final UserSession A00;
                    public final Fragment A01;
                    public final InterfaceC686136y A02;
                    public final C81053ja A03;

                    {
                        C14360o3.A0B(c81053ja, 3);
                        this.A01 = fragment4;
                        this.A02 = c685836v8;
                        this.A03 = c81053ja;
                        this.A00 = userSession7;
                    }

                    @Override // X.InterfaceC101074gN
                    public final void Dmc(C905741s c905741s, C38321qM c38321qM, C37905Gm2 c37905Gm2, C75113Zb c75113Zb, int i, int i2) {
                        C14360o3.A0B(c38321qM, 0);
                        if (c905741s.A0F.getIgImageView().A0G()) {
                            if (c75113Zb.A02 != i2) {
                                C903540u c903540u = C903540u.A00;
                                UserSession userSession8 = this.A00;
                                if (c903540u.A01(userSession8, c38321qM) && C18U.A06(C06090Tz.A05, userSession8, 2342173678009533401L)) {
                                    ReboundViewPager reboundViewPager = c905741s.A01;
                                    if (reboundViewPager != null) {
                                        reboundViewPager.A0L(i2, 0.0f);
                                        return;
                                    }
                                    return;
                                }
                            }
                            UserSession userSession9 = this.A00;
                            if (C903540u.A00(userSession9, c38321qM.A5v()) && C18U.A06(C06090Tz.A05, userSession9, 36330668796167130L)) {
                                FragmentActivity requireActivity = this.A01.requireActivity();
                                C116875Qr c116875Qr = new C116875Qr(ClipsViewerSource.A1S, userSession9);
                                c116875Qr.A1D = c38321qM.getId();
                                c116875Qr.A0R = Integer.valueOf(i2);
                                c116875Qr.A1a = true;
                                c116875Qr.A05 = 0;
                                AbstractC86593tX.A0X(requireActivity, c116875Qr.A00(), userSession9);
                                return;
                            }
                            this.A03.A00(c905741s.A0J, c38321qM, c37905Gm2, null, c75113Zb, c905741s.A0I, i);
                        }
                    }

                    @Override // X.AnonymousClass370
                    public final JG7 BQm() {
                        return this.A02.BQm();
                    }

                    @Override // X.InterfaceC101074gN
                    public final void DBS(C905741s c905741s, C38321qM c38321qM, C37905Gm2 c37905Gm2, C75113Zb c75113Zb, int i) {
                        if (c905741s.A0F.getIgImageView().A0G()) {
                            this.A03.A01(c905741s.A0J, c38321qM, c37905Gm2, c75113Zb, i);
                        }
                    }
                };
            case Process.SIGSTOP /* 19 */:
                final C685836v c685836v9 = (C685836v) this.A01;
                final UserSession userSession8 = c685836v9.A0A;
                final C81053ja c81053ja2 = (C81053ja) c685836v9.A1M.getValue();
                return new InterfaceC904041a(userSession8, c685836v9, c81053ja2) { // from class: X.41Z
                    public final UserSession A00;
                    public final InterfaceC686136y A01;
                    public final C81053ja A02;

                    {
                        C14360o3.A0B(c81053ja2, 3);
                        this.A01 = c685836v9;
                        this.A00 = userSession8;
                        this.A02 = c81053ja2;
                    }

                    @Override // X.InterfaceC904141b
                    public final void DBT(C69228Vjw c69228Vjw, C38321qM c38321qM, C37905Gm2 c37905Gm2, C75113Zb c75113Zb, int i) {
                        C14360o3.A0B(c38321qM, 0);
                        C14360o3.A0B(c75113Zb, 1);
                        this.A02.A01(c69228Vjw.A03, c38321qM, c37905Gm2, c75113Zb, i);
                    }

                    @Override // X.InterfaceC904141b
                    public final void Dme(C69228Vjw c69228Vjw, C38321qM c38321qM, C37905Gm2 c37905Gm2, C75113Zb c75113Zb, int i) {
                        C14360o3.A0B(c38321qM, 0);
                        C14360o3.A0B(c75113Zb, 1);
                        this.A02.A00(c69228Vjw.A03, c38321qM, c37905Gm2, null, c75113Zb, null, i);
                    }

                    @Override // X.AnonymousClass370
                    public final JG7 BQm() {
                        return this.A01.BQm();
                    }
                };
            case 20:
                C685836v c685836v10 = (C685836v) this.A01;
                UserSession userSession9 = c685836v10.A0A;
                Fragment fragment5 = c685836v10.A02;
                InterfaceC60442pS interfaceC60442pS2 = c685836v10.A0K;
                InterfaceC65282xQ interfaceC65282xQ2 = c685836v10.A0O;
                C36Y c36y = c685836v10.A0H;
                InterfaceC61432r6 interfaceC61432r6 = c685836v10.A0n;
                return new C3VT(fragment5, userSession9, c685836v10.A0B, c36y, c685836v10, interfaceC60442pS2, interfaceC65282xQ2, c685836v10.A0X, interfaceC61432r6);
            case 21:
                C685836v c685836v11 = (C685836v) this.A01;
                ViewOnKeyListenerC677333n viewOnKeyListenerC677333n = c685836v11.A0b;
                if (viewOnKeyListenerC677333n != null) {
                    return viewOnKeyListenerC677333n;
                }
                return new ViewOnKeyListenerC677333n(c685836v11.A02.requireContext(), c685836v11.A0A, c685836v11.A0K, C33O.A00());
            case 22:
                final C685836v c685836v12 = (C685836v) this.A01;
                final Fragment fragment6 = c685836v12.A02;
                final C81053ja c81053ja3 = (C81053ja) c685836v12.A1M.getValue();
                final C676533f c676533f = c685836v12.A0o;
                final C79863hb c79863hb2 = (C79863hb) c685836v12.A1L.getValue();
                return new InterfaceC904541f(fragment6, c685836v12, c79863hb2, c81053ja3, c676533f) { // from class: X.41e
                    public final Fragment A00;
                    public final InterfaceC686136y A01;
                    public final C79863hb A02;
                    public final C81053ja A03;
                    public final C676533f A04;

                    {
                        C14360o3.A0B(c81053ja3, 3);
                        C14360o3.A0B(c79863hb2, 5);
                        this.A01 = c685836v12;
                        this.A00 = fragment6;
                        this.A03 = c81053ja3;
                        this.A04 = c676533f;
                        this.A02 = c79863hb2;
                    }

                    @Override // X.InterfaceC904541f
                    public final void DLi(C73083Pj c73083Pj, C81473kH c81473kH, C38321qM c38321qM, C75113Zb c75113Zb) {
                        C14360o3.A0B(c38321qM, 1);
                        c75113Zb.A0I(c73083Pj);
                    }

                    @Override // X.InterfaceC904641g
                    public final void DnZ(C81473kH c81473kH, C38321qM c38321qM, C37905Gm2 c37905Gm2, C75113Zb c75113Zb, int i) {
                        C14360o3.A0B(c38321qM, 0);
                        C14360o3.A0B(c75113Zb, 1);
                        this.A03.A01(c81473kH.A01, c38321qM, c37905Gm2, c75113Zb, i);
                    }

                    @Override // X.InterfaceC904641g
                    public final void Dna(C81473kH c81473kH, C38321qM c38321qM, C75113Zb c75113Zb, ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk, int i) {
                        C14360o3.A0B(c38321qM, 1);
                        C14360o3.A0B(c81473kH, 4);
                        C676533f c676533f2 = this.A04;
                        if (!c676533f2.A02()) {
                            MediaFrameLayout mediaFrameLayout = c81473kH.A09;
                            if (mediaFrameLayout.getParent() instanceof InterfaceC73933Tf) {
                                c676533f2.A01(mediaFrameLayout, c81473kH.A02, c38321qM, scaleGestureDetectorOnScaleGestureListenerC81153jk, c75113Zb.A03, i);
                            }
                        }
                    }

                    @Override // X.InterfaceC904641g
                    public final void Dnb(C81473kH c81473kH, C38321qM c38321qM, C37905Gm2 c37905Gm2, C75113Zb c75113Zb, int i) {
                        C14360o3.A0B(c38321qM, 0);
                        C14360o3.A0B(c75113Zb, 1);
                        if (this.A00.getActivity() != null) {
                            if (c81473kH.A06.CXh() || c81473kH.A05.CXh()) {
                                this.A03.A00(c81473kH.A09, c38321qM, c37905Gm2, null, c75113Zb, c81473kH.A07, i);
                            }
                        }
                    }

                    @Override // X.InterfaceC687137i
                    public final JPY AmO() {
                        return this.A01.AmO();
                    }

                    @Override // X.AnonymousClass374
                    public final InterfaceC86433tG BRk() {
                        return this.A01.BRk();
                    }
                };
            case 23:
                C685836v c685836v13 = (C685836v) this.A01;
                return new C42446Iqn(c685836v13, (C81053ja) c685836v13.A1M.getValue());
            case 24:
                final C685836v c685836v14 = (C685836v) this.A01;
                final Fragment fragment7 = c685836v14.A02;
                final C81053ja c81053ja4 = (C81053ja) c685836v14.A1M.getValue();
                final UserSession userSession10 = c685836v14.A0A;
                return new InterfaceC105254of(fragment7, userSession10, c685836v14, c81053ja4) { // from class: X.4oe
                    public final UserSession A00;
                    public final Fragment A01;
                    public final InterfaceC686136y A02;
                    public final C81053ja A03;

                    {
                        C14360o3.A0B(c81053ja4, 3);
                        this.A01 = fragment7;
                        this.A02 = c685836v14;
                        this.A03 = c81053ja4;
                        this.A00 = userSession10;
                    }

                    @Override // X.AnonymousClass370
                    public final JG7 BQm() {
                        return this.A02.BQm();
                    }

                    @Override // X.InterfaceC105254of
                    public final void DBV(C105184oY c105184oY, C38321qM c38321qM, C37905Gm2 c37905Gm2, C75113Zb c75113Zb, int i) {
                        if (c105184oY.A0E.getIgImageView().A0G()) {
                            this.A03.A01(c105184oY.A0J, c38321qM, c37905Gm2, c75113Zb, i);
                        }
                    }

                    @Override // X.InterfaceC105254of
                    public final void Dmg(C38321qM c38321qM, C37905Gm2 c37905Gm2, C3Y7 c3y7, C75113Zb c75113Zb, int i, int i2) {
                        ReboundViewPager reboundViewPager;
                        C14360o3.A0B(c38321qM, 0);
                        C14360o3.A0B(c75113Zb, 1);
                        if (c75113Zb.A02 != i2) {
                            C903540u c903540u = C903540u.A00;
                            UserSession userSession11 = this.A00;
                            if (c903540u.A01(userSession11, c38321qM) && C18U.A06(C06090Tz.A05, userSession11, 2342173678009533401L)) {
                                if ((c3y7 instanceof C105184oY) && (reboundViewPager = ((C105184oY) c3y7).A04) != null) {
                                    reboundViewPager.A0L(i2, 0.0f);
                                    return;
                                }
                                return;
                            }
                        }
                        UserSession userSession12 = this.A00;
                        if (C903540u.A00(userSession12, c38321qM.A5v()) && C18U.A06(C06090Tz.A05, userSession12, 36330668796167130L)) {
                            FragmentActivity requireActivity = this.A01.requireActivity();
                            int i3 = c75113Zb.A05;
                            C116875Qr c116875Qr = new C116875Qr(ClipsViewerSource.A1S, userSession12);
                            c116875Qr.A1D = c38321qM.getId();
                            c116875Qr.A0R = Integer.valueOf(i2);
                            c116875Qr.A1a = true;
                            c116875Qr.A05 = i3;
                            AbstractC86593tX.A0X(requireActivity, c116875Qr.A00(), userSession12);
                            return;
                        }
                        this.A03.A00(c3y7.BQt(), c38321qM, c37905Gm2, c3y7, c75113Zb, null, i);
                    }
                };
            case 25:
                final C685836v c685836v15 = (C685836v) this.A01;
                final Fragment fragment8 = c685836v15.A02;
                final UserSession userSession11 = c685836v15.A0A;
                final C79863hb c79863hb3 = (C79863hb) c685836v15.A1L.getValue();
                final C33P c33p = c685836v15.A0W;
                final AbstractC61692rW abstractC61692rW2 = c685836v15.A0N;
                return new C41V(fragment8, userSession11, c685836v15, c79863hb3, abstractC61692rW2, c33p) { // from class: X.41U
                    public final Fragment A00;
                    public final UserSession A01;
                    public final InterfaceC686136y A02;
                    public final C79863hb A03;
                    public final AbstractC61692rW A04;
                    public final C33P A05;

                    {
                        C14360o3.A0B(c79863hb3, 4);
                        this.A02 = c685836v15;
                        this.A00 = fragment8;
                        this.A01 = userSession11;
                        this.A03 = c79863hb3;
                        this.A05 = c33p;
                        this.A04 = abstractC61692rW2;
                    }

                    @Override // X.C41V
                    public final void DLh(C73083Pj c73083Pj, C105184oY c105184oY, C38321qM c38321qM, C75113Zb c75113Zb) {
                        String str2;
                        C14360o3.A0B(c38321qM, 1);
                        C14360o3.A0B(c75113Zb, 2);
                        c75113Zb.A0I(c73083Pj);
                        AbstractC61692rW abstractC61692rW3 = this.A04;
                        if (abstractC61692rW3 != null && abstractC61692rW3.A0A(((InterfaceC11380iw) this.A00).getModuleName())) {
                            if (c73083Pj.A02 == null && c73083Pj.A04 == null && c73083Pj.A03 == null) {
                                abstractC61692rW3.A02(c38321qM);
                                return;
                            }
                            String id = c38321qM.getId();
                            boolean A06 = C18U.A06(C06090Tz.A05, this.A01, 36322714515941811L);
                            if (c38321qM.Cff() && id != null && !abstractC61692rW3.A06.contains(id) && A06) {
                                C38321qM A00 = this.A05.A00();
                                if (c38321qM.getId() != null) {
                                    String id2 = c38321qM.getId();
                                    if (A00 != null) {
                                        str2 = A00.getId();
                                    } else {
                                        str2 = null;
                                    }
                                    if (C14360o3.A0K(id2, str2)) {
                                        return;
                                    }
                                }
                            }
                            abstractC61692rW3.A03(c38321qM);
                        }
                    }

                    @Override // X.C41V
                    public final void DRH(C38321qM c38321qM) {
                    }

                    @Override // X.C41V
                    public final void DXy(C38321qM c38321qM, C3Y7 c3y7, C75113Zb c75113Zb, int i) {
                        C38321qM c38321qM2;
                        C14360o3.A0B(c38321qM, 0);
                        if (c38321qM.A5M()) {
                            c38321qM2 = c38321qM.A1e(c75113Zb.A03);
                            if (c38321qM2 == null) {
                                return;
                            }
                        } else {
                            c38321qM2 = c38321qM;
                        }
                        if (c38321qM2.BRp() == EnumC40111tc.A0a) {
                            this.A05.A08(c38321qM, c3y7, c75113Zb, null, i);
                        }
                    }

                    @Override // X.C37P
                    public final BC9 AmP() {
                        return this.A02.AmP();
                    }

                    @Override // X.C37S
                    public final InterfaceC105254of AmS() {
                        return this.A02.AmS();
                    }

                    @Override // X.C37C
                    public final C3h2 BRL() {
                        return this.A02.BRL();
                    }

                    @Override // X.C37D
                    public final InterfaceC80063hv BRf() {
                        return this.A02.BRf();
                    }

                    @Override // X.InterfaceC686236z
                    public final InterfaceC86303t2 BRj() {
                        return this.A02.BRj();
                    }

                    @Override // X.C37H
                    public final AnonymousClass428 BZ0() {
                        return this.A02.BZ0();
                    }

                    @Override // X.AnonymousClass379
                    public final AnonymousClass421 BZ3() {
                        return this.A02.BZ3();
                    }
                };
            case 26:
                C685836v c685836v16 = (C685836v) this.A01;
                return new C42606ItP(c685836v16.A02, c685836v16.A0A, c685836v16.A0K);
            case 27:
                C685836v c685836v17 = (C685836v) this.A01;
                return new C42453Iqu(c685836v17.A0A, c685836v17, (C81053ja) c685836v17.A1M.getValue(), c685836v17.A0K, c685836v17.A0o);
            case 28:
                C685836v c685836v18 = (C685836v) this.A01;
                UserSession userSession12 = c685836v18.A0A;
                InterfaceC60442pS interfaceC60442pS3 = c685836v18.A0K;
                return new C37509GfR(c685836v18.A02, userSession12, interfaceC60442pS3, c685836v18.A0O, c685836v18.A0k, c685836v18.A0w);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                C685836v c685836v19 = (C685836v) this.A01;
                return new C42455Iqw(c685836v19.A02, c685836v19.A0A, c685836v19, c685836v19.A0K, c685836v19.A0w, c685836v19.A0s);
            case 30:
                return new C37503GfL((C685836v) this.A01);
            case 31:
                C685836v c685836v20 = (C685836v) this.A01;
                final FragmentActivity requireActivity = c685836v20.A02.requireActivity();
                final UserSession userSession13 = c685836v20.A0A;
                final AnonymousClass388 anonymousClass388 = c685836v20.A0f;
                return new InterfaceC86673tf(requireActivity, userSession13, anonymousClass388) { // from class: X.3te
                    public final FragmentActivity A00;
                    public final UserSession A01;
                    public final AnonymousClass388 A02;

                    @Override // X.InterfaceC86673tf
                    public final void D5v(C38321qM c38321qM, C75113Zb c75113Zb) {
                        C14360o3.A0B(c38321qM, 0);
                        C14360o3.A0B(c75113Zb, 1);
                        this.A02.Di5(c38321qM, c75113Zb, c75113Zb.getPosition());
                    }

                    {
                        this.A00 = requireActivity;
                        this.A01 = userSession13;
                        this.A02 = anonymousClass388;
                    }

                    @Override // X.InterfaceC86673tf
                    public final void D5w(C38321qM c38321qM, C75113Zb c75113Zb) {
                        FB6.A00().A04(this.A00, this.A01);
                    }
                };
            case 32:
                C685836v c685836v21 = (C685836v) this.A01;
                UserSession userSession14 = c685836v21.A0A;
                return new C79973hm(c685836v21.A02, userSession14, c685836v21.A0W, c685836v21.A0g, c685836v21.A2S);
            case 33:
                C685836v c685836v22 = (C685836v) this.A01;
                final UserSession userSession15 = c685836v22.A0A;
                final C33P c33p2 = c685836v22.A0W;
                return new Object(userSession15, c33p2) { // from class: X.3hb
                    public final UserSession A00;
                    public final C33P A01;

                    {
                        this.A00 = userSession15;
                        this.A01 = c33p2;
                    }
                };
            case 34:
                C685836v c685836v23 = (C685836v) this.A01;
                UserSession userSession16 = c685836v23.A0A;
                Fragment fragment9 = c685836v23.A02;
                InterfaceC60442pS interfaceC60442pS4 = c685836v23.A0K;
                C33P c33p3 = c685836v23.A0W;
                InterfaceC61432r6 interfaceC61432r62 = c685836v23.A0n;
                boolean z = c685836v23.A2T;
                C1M1 c1m1 = (C1M1) c685836v23.A2E.getValue();
                String str2 = c685836v23.A0w;
                return new C81053ja(fragment9, userSession16, c685836v23, interfaceC60442pS4, c685836v23.A0L, c685836v23.A0Q, c33p3, c685836v23.A0Z, c685836v23.A0a, interfaceC61432r62, c1m1, str2, z);
            case 35:
                C685836v c685836v24 = (C685836v) this.A01;
                UserSession userSession17 = c685836v24.A0A;
                Fragment fragment10 = c685836v24.A02;
                C1Y1 c1y1 = c685836v24.A0a;
                return new C692539l(fragment10, userSession17, c685836v24, c685836v24.A0K, c685836v24.A0O, c1y1, c685836v24.A0w);
            case 36:
                C685836v c685836v25 = (C685836v) this.A01;
                UserSession userSession18 = c685836v25.A0A;
                Fragment fragment11 = c685836v25.A02;
                C25671My c25671My = c685836v25.A08;
                C1M1 c1m12 = (C1M1) c685836v25.A2E.getValue();
                InterfaceC60442pS interfaceC60442pS5 = c685836v25.A0K;
                String str3 = c685836v25.A0t;
                return new C79983hn(fragment11, c25671My, userSession18, c685836v25, interfaceC60442pS5, c685836v25.A0L, c685836v25.A0g, c1m12, str3, String.valueOf(c685836v25.A0r), c685836v25.A0x);
            case 37:
                C685836v c685836v26 = (C685836v) this.A01;
                UserSession userSession19 = c685836v26.A0A;
                Fragment fragment12 = c685836v26.A02;
                InterfaceC60442pS interfaceC60442pS6 = c685836v26.A0K;
                C1M1 c1m13 = (C1M1) c685836v26.A2E.getValue();
                return new C39C(fragment12, c685836v26.A04, userSession19, interfaceC60442pS6, c685836v26.A0W, c685836v26.Br6(), c1m13, C39B.A0G);
            case 38:
                C685836v c685836v27 = (C685836v) this.A01;
                return new C39O(c685836v27.A0A, c685836v27.A0K, c685836v27.A0h, c685836v27.A0i);
            case 39:
                C685836v c685836v28 = (C685836v) this.A01;
                return new C49376LsA(c685836v28.A02, c685836v28.A0A, c685836v28, c685836v28.A0K);
            case 40:
                C685836v c685836v29 = (C685836v) this.A01;
                UserSession userSession20 = c685836v29.A0A;
                Fragment fragment13 = c685836v29.A02;
                InterfaceC65282xQ interfaceC65282xQ3 = c685836v29.A0O;
                InterfaceC60442pS interfaceC60442pS7 = c685836v29.A0K;
                return new C87293um(fragment13, c685836v29.A07, userSession20, (C1GL) fragment13, interfaceC60442pS7, interfaceC65282xQ3);
            case Seq.NULL_REFNUM /* 41 */:
                final C685836v c685836v30 = (C685836v) this.A01;
                final Fragment fragment14 = c685836v30.A02;
                final C57462kL c57462kL = c685836v30.A0V;
                final InterfaceC60442pS interfaceC60442pS8 = c685836v30.A0K;
                return new C4FX(fragment14, c685836v30, c685836v30, interfaceC60442pS8, c57462kL) { // from class: X.4FW
                    public final Fragment A00;
                    public final InterfaceC686136y A01;
                    public final C685836v A02;
                    public final InterfaceC60442pS A03;
                    public final C57462kL A04;

                    {
                        C14360o3.A0B(c57462kL, 4);
                        this.A01 = c685836v30;
                        this.A02 = c685836v30;
                        this.A00 = fragment14;
                        this.A04 = c57462kL;
                        this.A03 = interfaceC60442pS8;
                    }

                    @Override // X.AnonymousClass373
                    public final InterfaceC75453aC BQw() {
                        return this.A01.BQw();
                    }

                    @Override // X.C37F
                    public final InterfaceC76043b9 BS4() {
                        return this.A01.BS4();
                    }

                    @Override // X.InterfaceC686637d
                    public final InterfaceC909543n BR7() {
                        throw C00O.createAndThrow();
                    }

                    @Override // X.InterfaceC686537c
                    public final InterfaceC144646fk BRM() {
                        throw C00O.createAndThrow();
                    }

                    @Override // X.InterfaceC687037h
                    public final InterfaceC75543aL BRn() {
                        throw C00O.createAndThrow();
                    }

                    @Override // X.AnonymousClass378
                    public final InterfaceC60682pr Br6() {
                        throw C00O.createAndThrow();
                    }

                    @Override // X.C37B
                    public final InterfaceC31076DlJ C56() {
                        throw C00O.createAndThrow();
                    }
                };
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                final C685836v c685836v31 = (C685836v) this.A01;
                final Fragment fragment15 = c685836v31.A02;
                final UserSession userSession21 = c685836v31.A0A;
                final InterfaceC65282xQ interfaceC65282xQ4 = c685836v31.A0O;
                final C33P c33p4 = c685836v31.A0W;
                final C79973hm c79973hm = (C79973hm) c685836v31.A1K.getValue();
                final C79983hn c79983hn = (C79983hn) c685836v31.A1O.getValue();
                final C57462kL c57462kL2 = c685836v31.A0V;
                final C38T c38t = c685836v31.A0j;
                final C689438f c689438f = c685836v31.A0m;
                final C1M1 c1m14 = (C1M1) c685836v31.A2E.getValue();
                return new InterfaceC80023hr(fragment15, userSession21, c685836v31, c79973hm, c79983hn, interfaceC65282xQ4, c57462kL2, c33p4, c38t, c689438f, c1m14) { // from class: X.3hq
                    public final Fragment A00;
                    public final UserSession A01;
                    public final InterfaceC686136y A02;
                    public final C79973hm A03;
                    public final C79983hn A04;
                    public final InterfaceC65282xQ A05;
                    public final C57462kL A06;
                    public final C33P A07;
                    public final C38T A08;
                    public final C689438f A09;
                    public final C1M1 A0A;

                    {
                        C14360o3.A0B(c79973hm, 6);
                        C14360o3.A0B(c79983hn, 7);
                        C14360o3.A0B(c57462kL2, 8);
                        C14360o3.A0B(c38t, 9);
                        C14360o3.A0B(c689438f, 10);
                        C14360o3.A0B(c1m14, 11);
                        this.A02 = c685836v31;
                        this.A00 = fragment15;
                        this.A01 = userSession21;
                        this.A05 = interfaceC65282xQ4;
                        this.A07 = c33p4;
                        this.A03 = c79973hm;
                        this.A04 = c79983hn;
                        this.A06 = c57462kL2;
                        this.A08 = c38t;
                        this.A09 = c689438f;
                        this.A0A = c1m14;
                    }

                    @Override // X.InterfaceC80023hr
                    public final void D3o(C38321qM c38321qM, C75113Zb c75113Zb) {
                        C14360o3.A0B(c38321qM, 0);
                        C14360o3.A0B(c75113Zb, 1);
                        this.A09.A00(null, null, this.A00, c38321qM, c75113Zb, C2Fb.A1h, null);
                    }

                    @Override // X.InterfaceC80023hr
                    public final void D4x(C8JW c8jw, C3x9 c3x9, C38321qM c38321qM, C75113Zb c75113Zb) {
                        C14360o3.A0B(c75113Zb, 1);
                        this.A02.BQw().D4x(c8jw, c3x9, c38321qM, c75113Zb);
                    }

                    @Override // X.InterfaceC80023hr
                    public final void DGY(C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS9, C75113Zb c75113Zb) {
                        C14360o3.A0B(c38321qM, 0);
                        C14360o3.A0B(c75113Zb, 1);
                        C14360o3.A0B(interfaceC60442pS9, 2);
                        UserSession userSession22 = this.A01;
                        C82713mZ A02 = AbstractC82703mY.A02(userSession22, c38321qM, interfaceC60442pS9, this.A0A, Integer.valueOf(c75113Zb.getPosition()), -1, "feed_video_end_scene_impression");
                        if (A02 != null) {
                            A02.A01 = c38321qM.A0l();
                            A02.A5R = "end_scene";
                            C11520jB c11520jB = new C11520jB();
                            UserSession userSession23 = this.A06.A00;
                            C06090Tz c06090Tz = C06090Tz.A05;
                            Boolean valueOf = Boolean.valueOf(C18U.A06(c06090Tz, userSession23, 36329238572056795L));
                            Map map = c11520jB.A00;
                            map.put("mid_nudge_auto_dismiss_enabled", valueOf);
                            map.put("mid_nudge_auto_dismiss_duration", Double.valueOf(C18U.A00(c06090Tz, userSession23, 37173663502238308L)));
                            A02.A0E(c11520jB);
                            C32U.A0C(userSession22, A02, c38321qM, interfaceC60442pS9, null);
                        }
                    }

                    @Override // X.InterfaceC80023hr
                    public final void DGc(C38321qM c38321qM) {
                        C14360o3.A0B(c38321qM, 0);
                        this.A05.CtR(c38321qM);
                        this.A07.A0G.A0M();
                    }

                    @Override // X.InterfaceC80023hr
                    public final void DOU(C38321qM c38321qM) {
                        User CDj;
                        String A00;
                        C14360o3.A0B(c38321qM, 0);
                        FragmentActivity activity = this.A00.getActivity();
                        if (activity != null && (CDj = c38321qM.A0C.CDj()) != null && (A00 = AbstractC76433bn.A00(CDj)) != null) {
                            C1YY A01 = FVI.A01();
                            UserSession userSession22 = this.A01;
                            java.util.Set set = FE3.A00;
                            A01.A05(activity, userSession22, A00, AbstractC111324zv.A00(2185));
                        }
                    }

                    @Override // X.InterfaceC80023hr
                    public final void DOW(View view, InterfaceC11380iw interfaceC11380iw, C38321qM c38321qM, C75113Zb c75113Zb, String str4) {
                        C14360o3.A0B(c38321qM, 0);
                        C14360o3.A0B(c75113Zb, 1);
                        C14360o3.A0B(interfaceC11380iw, 2);
                        this.A03.A00(view, EnumC120795dP.A0M, EnumC116885Qs.A04, interfaceC11380iw, c38321qM, c75113Zb, null, true);
                    }

                    @Override // X.InterfaceC80023hr
                    public final void DOY(InterfaceC11380iw interfaceC11380iw, C38321qM c38321qM, C38321qM c38321qM2, C75113Zb c75113Zb) {
                        C14360o3.A0B(c38321qM, 0);
                        C14360o3.A0B(c75113Zb, 1);
                        C14360o3.A0B(interfaceC11380iw, 2);
                        List asList = Arrays.asList(C128085qc.A02(c38321qM), C128085qc.A02(c38321qM2));
                        this.A03.A00(null, EnumC120795dP.A0N, EnumC116885Qs.A03, interfaceC11380iw, c38321qM, c75113Zb, asList, false);
                    }

                    @Override // X.InterfaceC80023hr
                    public final void DOZ(C38321qM c38321qM, C75113Zb c75113Zb) {
                        C14360o3.A0B(c38321qM, 0);
                        C14360o3.A0B(c75113Zb, 1);
                        this.A04.A00(c38321qM, c75113Zb, "endcard_reshare_button", c75113Zb.getPosition());
                    }

                    @Override // X.InterfaceC80023hr
                    public final void DOb(View view, InterfaceC11380iw interfaceC11380iw, C38321qM c38321qM, C75113Zb c75113Zb, boolean z2) {
                        EnumC120795dP enumC120795dP;
                        C14360o3.A0B(c38321qM, 0);
                        C14360o3.A0B(c75113Zb, 1);
                        C14360o3.A0B(interfaceC11380iw, 2);
                        if (z2) {
                            enumC120795dP = EnumC120795dP.A07;
                        } else {
                            enumC120795dP = EnumC120795dP.A0u;
                        }
                        this.A03.A00(view, enumC120795dP, EnumC116885Qs.A04, interfaceC11380iw, c38321qM, c75113Zb, null, false);
                    }

                    @Override // X.InterfaceC80023hr
                    public final void DOc(View view, EnumC116885Qs enumC116885Qs, InterfaceC11380iw interfaceC11380iw, C38321qM c38321qM, C75113Zb c75113Zb) {
                        EnumC116885Qs enumC116885Qs2 = enumC116885Qs;
                        C14360o3.A0B(c38321qM, 0);
                        C14360o3.A0B(c75113Zb, 1);
                        C14360o3.A0B(interfaceC11380iw, 2);
                        C79973hm c79973hm2 = this.A03;
                        if (enumC116885Qs == null) {
                            enumC116885Qs2 = EnumC116885Qs.A02;
                        }
                        c79973hm2.A00(view, EnumC120795dP.A0v, enumC116885Qs2, interfaceC11380iw, c38321qM, c75113Zb, null, false);
                    }

                    @Override // X.InterfaceC80023hr
                    public final void EDc(View view, C38321qM c38321qM, String str4) {
                        C38T c38t2 = this.A08;
                        String A0R = AnonymousClass001.A0R("thumb_", c38321qM.getId());
                        C9JZ c9jz = new C9JZ(c38321qM, null, str4, null, true);
                        C59062n7 c59062n7 = C59062n7.A07;
                        C59072n8 c59072n8 = new C59072n8(c9jz, 0, A0R);
                        c59072n8.A00(c38t2.A01);
                        c38t2.A00.A05(view, c59072n8.A01());
                    }
                };
            case 43:
                C685836v c685836v32 = (C685836v) this.A01;
                return new C42657IuE(c685836v32.A02, c685836v32.A0A, c685836v32, (C692539l) c685836v32.A1N.getValue(), c685836v32.A0O);
            case 44:
                C685836v c685836v33 = (C685836v) this.A01;
                return new C37506GfO(c685836v33.A02, c685836v33.Abd(), c685836v33.A0A);
            case 45:
                final C685836v c685836v34 = (C685836v) this.A01;
                final UserSession userSession22 = c685836v34.A0A;
                final C33P c33p5 = c685836v34.A0W;
                final Fragment fragment16 = c685836v34.A02;
                final C25671My c25671My2 = c685836v34.A08;
                final InterfaceC65282xQ interfaceC65282xQ5 = c685836v34.A0O;
                final InterfaceC60442pS interfaceC60442pS9 = c685836v34.A0K;
                final InterfaceC60682pr interfaceC60682pr = (InterfaceC60682pr) fragment16;
                return new InterfaceC690038m(fragment16, c25671My2, userSession22, c685836v34, interfaceC60442pS9, interfaceC65282xQ5, c33p5, interfaceC60682pr) { // from class: X.38l
                    public final Fragment A00;
                    public final C25671My A01;
                    public final UserSession A02;
                    public final InterfaceC686136y A03;
                    public final InterfaceC60442pS A04;
                    public final InterfaceC65282xQ A05;
                    public final C33P A06;
                    public final InterfaceC60682pr A07;

                    {
                        C14360o3.A0B(c25671My2, 4);
                        C14360o3.A0B(interfaceC60682pr, 7);
                        this.A02 = userSession22;
                        this.A06 = c33p5;
                        this.A00 = fragment16;
                        this.A01 = c25671My2;
                        this.A05 = interfaceC65282xQ5;
                        this.A04 = interfaceC60442pS9;
                        this.A07 = interfaceC60682pr;
                        this.A03 = c685836v34;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:19:0x0075 A[ORIG_RETURN, RETURN] */
                    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
                    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
                    /* JADX WARN: Removed duplicated region for block: B:33:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:34:0x0079  */
                    /* JADX WARN: Removed duplicated region for block: B:35:0x007c  */
                    @Override // X.InterfaceC690038m
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void DKd(com.instagram.api.schemas.MediaControlEventSourceEnum r25, X.C38321qM r26, X.EnumC75193Zm r27, X.C75113Zb r28) {
                        /*
                            Method dump skipped, instructions count: 820
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C689938l.DKd(com.instagram.api.schemas.MediaControlEventSourceEnum, X.1qM, X.3Zm, X.3Zb):void");
                    }
                };
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                C685836v c685836v35 = (C685836v) this.A01;
                UserSession userSession23 = c685836v35.A0A;
                Fragment fragment17 = c685836v35.A02;
                C38H c38h = new C38H();
                c38h.A07 = true;
                return new C3t0(fragment17, c685836v35.Abd(), userSession23, new ReelViewerConfig(c38h));
            case 47:
                C685836v c685836v36 = (C685836v) this.A01;
                return new C29275CvW(c685836v36.A02, c685836v36.A0K, c685836v36.A0A);
            case 48:
                C685836v c685836v37 = (C685836v) this.A01;
                return new C42834IxA(c685836v37.A02, c685836v37.A0A);
            default:
                C685836v c685836v38 = (C685836v) this.A01;
                return new C37515GfX(c685836v38.A02, c685836v38.Abd(), c685836v38.A0A);
        }
    }
}
