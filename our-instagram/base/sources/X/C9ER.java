package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.SeekBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.user.model.User;
import go.Seq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9ER, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9ER extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9ER(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                C685836v c685836v = (C685836v) this.A01;
                return new IEX(c685836v.A02, c685836v.A0A);
            case 1:
                C685836v c685836v2 = (C685836v) this.A01;
                UserSession userSession = c685836v2.A0A;
                return new InterfaceC81083jd(c685836v2.A02, userSession, c685836v2, (C81053ja) c685836v2.A1M.getValue(), c685836v2.A0K) { // from class: X.3jc
                    public final Fragment A00;
                    public final UserSession A01;
                    public final InterfaceC686136y A02;
                    public final C81053ja A03;
                    public final InterfaceC60442pS A04;

                    {
                        C14360o3.A0B(r5, 5);
                        this.A02 = c685836v2;
                        this.A01 = userSession;
                        this.A00 = r2;
                        this.A04 = r6;
                        this.A03 = r5;
                    }

                    @Override // X.InterfaceC81083jd
                    public final void Dmh(C38321qM c38321qM, C37905Gm2 c37905Gm2, C79743hP c79743hP, C75113Zb c75113Zb, int i) {
                        C14360o3.A0B(c38321qM, 1);
                        C14360o3.A0B(c75113Zb, 2);
                        if (this.A00.getActivity() != null && c79743hP.A00().getIgImageView().A0G()) {
                            this.A03.A00(c79743hP.A09, c38321qM, c37905Gm2, c79743hP, c75113Zb, c79743hP.A0A, i);
                        }
                    }

                    @Override // X.AnonymousClass370
                    public final JG7 BQm() {
                        return this.A02.BQm();
                    }

                    @Override // X.InterfaceC81083jd
                    public final void DBW(C38321qM c38321qM, C37905Gm2 c37905Gm2, C79743hP c79743hP, C75113Zb c75113Zb, int i) {
                        if (this.A00.getActivity() != null && c79743hP.A00().getIgImageView().A0G()) {
                            this.A03.A01(c79743hP.A01(), c38321qM, c37905Gm2, c75113Zb, i);
                        }
                    }
                };
            case 2:
                C685836v c685836v3 = (C685836v) this.A01;
                UserSession userSession2 = c685836v3.A0A;
                return new InterfaceC87013uH(c685836v3.A02, c685836v3.A03, userSession2, c685836v3, c685836v3.A0K) { // from class: X.3uG
                    public final Fragment A00;
                    public final AbstractC10360h2 A01;
                    public final UserSession A02;
                    public final InterfaceC60442pS A03;
                    public final InterfaceC686136y A04;

                    @Override // X.InterfaceC87013uH
                    public final void DAX(C38321qM c38321qM, C75113Zb c75113Zb) {
                        UserSession userSession3;
                        String A0B;
                        C14360o3.A0B(c38321qM, 0);
                        C14360o3.A0B(c75113Zb, 1);
                        if (!(!C06P.A01(this.A01)) && (A0B = AbstractC41071vF.A0B((userSession3 = this.A02), c38321qM)) != null) {
                            I9X.A00(this.A00.requireActivity(), userSession3, new C5SE(userSession3, c38321qM, c75113Zb.A06()), c38321qM, this.A03, A0B, AbstractC41071vF.A0C(userSession3, c38321qM), AbstractC41071vF.A0A(userSession3, c38321qM), AbstractC41071vF.A0G(userSession3, c38321qM));
                        }
                    }

                    @Override // X.InterfaceC87013uH
                    public final void DZV(C38321qM c38321qM, C75113Zb c75113Zb) {
                        C14360o3.A0B(c38321qM, 0);
                        C14360o3.A0B(c75113Zb, 1);
                        if (C06P.A01(this.A01)) {
                            UserSession userSession3 = this.A02;
                            InterfaceC60442pS interfaceC60442pS = this.A03;
                            AbstractC41559Ia8.A00(this.A00.requireActivity(), userSession3, new C5SE(userSession3, c38321qM, c75113Zb.A06()), c38321qM, interfaceC60442pS, J8O.A00, 1);
                        }
                    }

                    {
                        this.A04 = c685836v3;
                        this.A02 = userSession2;
                        this.A00 = r1;
                        this.A03 = r5;
                        this.A01 = r2;
                    }
                };
            case 3:
                C685836v c685836v4 = (C685836v) this.A01;
                return new A7P(c685836v4.A02, c685836v4.A0W);
            case 4:
                return new C42618Itb(((C685836v) this.A01).A0o);
            case 5:
                return new C42624Ith((C685836v) this.A01);
            case 6:
                C685836v c685836v5 = (C685836v) this.A01;
                return new C42626Itj(c685836v5, (C81053ja) c685836v5.A1M.getValue());
            case 7:
                C685836v c685836v6 = (C685836v) this.A01;
                UserSession userSession3 = c685836v6.A0A;
                Fragment fragment = c685836v6.A02;
                C684436h c684436h = c685836v6.A06;
                InterfaceC60442pS interfaceC60442pS = c685836v6.A0K;
                AbstractC10360h2 abstractC10360h2 = c685836v6.A03;
                InterfaceC61432r6 interfaceC61432r6 = c685836v6.A0n;
                C1M1 c1m1 = (C1M1) c685836v6.A2E.getValue();
                String str = c685836v6.A0w;
                C38E c38e = c685836v6.A0e;
                String str2 = c685836v6.A0v;
                InterfaceC65282xQ interfaceC65282xQ = c685836v6.A0O;
                InterfaceC114745Gf interfaceC114745Gf = c685836v6.A0I;
                return new C75443aB(fragment, abstractC10360h2, c684436h, userSession3, c685836v6.A0G, interfaceC114745Gf, c685836v6, interfaceC60442pS, interfaceC65282xQ, c685836v6.A0W, c685836v6.A0Z, c38e, interfaceC61432r6, c1m1, str, str2);
            case 8:
                C685836v c685836v7 = (C685836v) this.A01;
                UserSession userSession4 = c685836v7.A0A;
                Fragment fragment2 = c685836v7.A02;
                InterfaceC60442pS interfaceC60442pS2 = c685836v7.A0K;
                return new InterfaceC86223st(fragment2.getContext(), fragment2, userSession4, c685836v7, (C81053ja) c685836v7.A1M.getValue(), interfaceC60442pS2, c685836v7.A0w) { // from class: X.3ss
                    public final Context A00;
                    public final Fragment A01;
                    public final UserSession A02;
                    public final InterfaceC686136y A03;
                    public final C81053ja A04;
                    public final InterfaceC60442pS A05;
                    public final String A06;

                    {
                        C14360o3.A0B(r6, 5);
                        this.A03 = c685836v7;
                        this.A02 = userSession4;
                        this.A01 = fragment2;
                        this.A05 = interfaceC60442pS2;
                        this.A04 = r6;
                        this.A06 = r8;
                        this.A00 = r2;
                    }

                    @Override // X.InterfaceC86223st
                    public final void DBR(C38321qM c38321qM, C37905Gm2 c37905Gm2, C81303k0 c81303k0, C75113Zb c75113Zb, int i) {
                        Fragment fragment3 = this.A01;
                        if (fragment3.getActivity() != null && c81303k0.A0N.getIgImageView().A0G()) {
                            this.A04.A01(c81303k0.A0T, c38321qM, c37905Gm2, c75113Zb, i);
                            C3YJ c3yj = c81303k0.A0Q;
                            UserSession userSession5 = this.A02;
                            InterfaceC60442pS interfaceC60442pS3 = this.A05;
                            AbstractC40646I0e.A00(fragment3.getContext(), userSession5, (IEX) ((C685836v) this.A03).A1c.getValue(), c38321qM, interfaceC60442pS3, c75113Zb, c3yj, this.A06, true);
                        }
                    }

                    @Override // X.InterfaceC86223st
                    public final void Dmb(C38321qM c38321qM, C37905Gm2 c37905Gm2, C81303k0 c81303k0, C75113Zb c75113Zb, int i) {
                        C14360o3.A0B(c38321qM, 0);
                        C14360o3.A0B(c75113Zb, 1);
                        if (this.A01.getActivity() != null && c81303k0.A0N.getIgImageView().A0G()) {
                            this.A04.A00(c81303k0.A0T, c38321qM, c37905Gm2, c81303k0, c75113Zb, c81303k0.A0Q, i);
                        }
                    }

                    @Override // X.AnonymousClass370
                    public final JG7 BQm() {
                        return this.A03.BQm();
                    }
                };
            case 9:
                C685836v c685836v8 = (C685836v) this.A01;
                UserSession userSession5 = c685836v8.A0A;
                InterfaceC60442pS interfaceC60442pS3 = c685836v8.A0K;
                Fragment fragment3 = c685836v8.A02;
                User user = c685836v8.A0p;
                C684736k c684736k = c685836v8.A0S;
                return new C909443m(fragment3, c685836v8.A03, userSession5, c685836v8.A0B, interfaceC60442pS3, c684736k, user);
            case 10:
                C685836v c685836v9 = (C685836v) this.A01;
                Fragment fragment4 = c685836v9.A02;
                UserSession userSession6 = c685836v9.A0A;
                AbstractC10360h2 abstractC10360h22 = c685836v9.A03;
                InterfaceC60442pS interfaceC60442pS4 = c685836v9.A0K;
                C1M1 c1m12 = (C1M1) c685836v9.A2E.getValue();
                C57332k8 c57332k8 = c685836v9.A0T;
                C684636j c684636j = c685836v9.A0E;
                C690138n c690138n = c685836v9.A0J;
                String str3 = c685836v9.A0w;
                InterfaceC61432r6 interfaceC61432r62 = c685836v9.A0n;
                AnonymousClass388 anonymousClass388 = c685836v9.A0f;
                InterfaceC114705Ga interfaceC114705Ga = c685836v9.A0F;
                boolean z = c685836v9.A2U;
                InterfaceC114755Gg interfaceC114755Gg = c685836v9.A0c;
                EnumC114765Gh enumC114765Gh = c685836v9.A0q;
                C25671My c25671My = c685836v9.A08;
                boolean z2 = c685836v9.A2R;
                return new C79853ha(fragment4, abstractC10360h22, c685836v9.A05, c25671My, userSession6, c684636j, interfaceC114705Ga, c690138n, c685836v9, interfaceC60442pS4, c57332k8, c685836v9.A0Z, interfaceC114755Gg, anonymousClass388, interfaceC61432r62, c1m12, enumC114765Gh, str3, c685836v9.A0u, z, z2);
            case 11:
                C685836v c685836v10 = (C685836v) this.A01;
                return new C79543h1(c685836v10.A02, c685836v10.A0A, c685836v10, c685836v10.A0K, c685836v10.A0O, c685836v10.A0U, c685836v10.A0p);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C685836v c685836v11 = (C685836v) this.A01;
                return new C42459Ir0(c685836v11.A02, c685836v11.A0A, c685836v11, c685836v11.A0K, c685836v11.A0U);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C685836v c685836v12 = (C685836v) this.A01;
                return new C42811Iwn(c685836v12.A0A, c685836v12, c685836v12.A0K, c685836v12.A0L, c685836v12.A0f, c685836v12.A0n);
            case 14:
                C685836v c685836v13 = (C685836v) this.A01;
                return new InterfaceC80063hv(c685836v13.A02, c685836v13.A0W) { // from class: X.3hu
                    public final Fragment A00;
                    public final C33P A01;

                    /* JADX WARN: Code restructure failed: missing block: B:13:0x0069, code lost:
                    
                        if ((!r2.isEmpty()) != true) goto L15;
                     */
                    @Override // X.InterfaceC80063hv
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void DSK(X.C51757Mtg r19) {
                        /*
                            Method dump skipped, instructions count: 407
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C80053hu.DSK(X.Mtg):void");
                    }

                    {
                        this.A00 = r1;
                        this.A01 = r2;
                    }
                };
            case Process.SIGTERM /* 15 */:
                C685836v c685836v14 = (C685836v) this.A01;
                UserSession userSession7 = c685836v14.A0A;
                Fragment fragment5 = c685836v14.A02;
                C79973hm c79973hm = (C79973hm) c685836v14.A1K.getValue();
                InterfaceC60442pS interfaceC60442pS5 = c685836v14.A0K;
                String str4 = c685836v14.A0w;
                C1M1 c1m13 = (C1M1) c685836v14.A2E.getValue();
                User user2 = c685836v14.A0p;
                return new C86293t1(fragment5, c685836v14.A06, userSession7, c685836v14.A0B, c79973hm, interfaceC60442pS5, (C3t0) c685836v14.A1Y.getValue(), user2, c1m13, str4);
            case 16:
                C685836v c685836v15 = (C685836v) this.A01;
                return new InterfaceC86433tG(c685836v15.A0A, c685836v15.A0K, c685836v15.A0w) { // from class: X.3tF
                    public final UserSession A00;
                    public final InterfaceC60442pS A01;
                    public final String A02;

                    @Override // X.InterfaceC86433tG
                    public final void Ds8(C38321qM c38321qM) {
                        C14360o3.A0B(c38321qM, 0);
                        UserSession userSession8 = this.A00;
                        if (!AbstractC76503bu.A00(userSession8, c38321qM)) {
                            AbstractC41775Ier.A08(userSession8, c38321qM, this.A01, this.A02);
                        }
                    }

                    {
                        this.A00 = r1;
                        this.A01 = r2;
                        this.A02 = r3;
                    }
                };
            case 17:
                C685836v c685836v16 = (C685836v) this.A01;
                C33F c33f = c685836v16.A0R;
                Fragment fragment6 = c685836v16.A02;
                return new InterfaceC75543aL(fragment6, c685836v16, c33f, (InterfaceC60682pr) fragment6) { // from class: X.3aK
                    public final Fragment A00;
                    public final InterfaceC686136y A01;
                    public final C33F A02;
                    public final InterfaceC60682pr A03;

                    {
                        C14360o3.A0B(r5, 3);
                        this.A01 = c685836v16;
                        this.A02 = c33f;
                        this.A03 = r5;
                        this.A00 = fragment6;
                    }

                    @Override // X.InterfaceC75543aL
                    public final void CzT(View view) {
                        Fragment fragment7 = this.A00;
                        Context context = fragment7.getContext();
                        C33F c33f2 = this.A02;
                        if (c33f2 != null && fragment7.mView != null && context != null) {
                            ViewParent parent = this.A03.getScrollingViewProxy().getParent();
                            C14360o3.A0C(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                            String string = context.getString(2131973187);
                            C14360o3.A07(string);
                            c33f2.A00((ViewGroup) parent, string, new C207019Eg(view, 33), 1000L, true);
                        }
                    }

                    @Override // X.C37A
                    public final InterfaceC690038m BDf() {
                        throw C00O.createAndThrow();
                    }
                };
            case 18:
                C685836v c685836v17 = (C685836v) this.A01;
                UserSession userSession8 = c685836v17.A0A;
                User user3 = c685836v17.A0p;
                return new InterfaceC86963uC(c685836v17.A02, c685836v17.A03, userSession8, c685836v17, c685836v17.A0K, c685836v17.A0L, c685836v17.A0P, c685836v17.A0n, user3, (C1M1) c685836v17.A2E.getValue(), c685836v17.A0r, c685836v17.A0x) { // from class: X.3uB
                    public long A00;
                    public final Fragment A01;
                    public final AbstractC10360h2 A02;
                    public final UserSession A03;
                    public final InterfaceC60442pS A04;
                    public final C1M1 A05;
                    public final Long A06;
                    public final String A07;
                    public final InterfaceC685936w A08;
                    public final C24461Hp A09;
                    public final C689838k A0A;
                    public final C33F A0B;
                    public final InterfaceC61432r6 A0C;
                    public final User A0D;

                    {
                        C14360o3.A0B(r7, 7);
                        this.A03 = userSession8;
                        this.A0D = user3;
                        this.A01 = r2;
                        this.A02 = r3;
                        this.A04 = r6;
                        this.A0C = r9;
                        this.A0A = r7;
                        this.A0B = r8;
                        this.A05 = r11;
                        this.A08 = c685836v17;
                        this.A06 = r12;
                        this.A07 = r13;
                        this.A09 = AbstractC24451Ho.A00(userSession8);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // X.InterfaceC86963uC
                    public final void D66(InterfaceC16820sZ interfaceC16820sZ) {
                        ViewGroup viewGroup;
                        C14360o3.A0B(interfaceC16820sZ, 0);
                        C33F c33f2 = this.A0B;
                        if (c33f2 != null) {
                            Fragment fragment7 = this.A01;
                            if (fragment7.getContext() != null) {
                                ViewParent parent = ((InterfaceC60682pr) fragment7).getScrollingViewProxy().getParent();
                                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                                    String string = fragment7.requireContext().getString(2131975776);
                                    C14360o3.A07(string);
                                    c33f2.A00(viewGroup, string, interfaceC16820sZ, 500L, true);
                                }
                            }
                        }
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:57:0x0170, code lost:
                    
                        if (X.C18U.A06(X.C06090Tz.A05, r7, 36328147649641713L) == false) goto L57;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:59:0x0174, code lost:
                    
                        if (r10 != false) goto L59;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:60:0x0185, code lost:
                    
                        r61 = false;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:62:0x018b, code lost:
                    
                        if (r63.CdW() == false) goto L66;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:63:0x018d, code lost:
                    
                        r54 = true;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:64:0x019a, code lost:
                    
                        if (X.C18U.A06(X.C06090Tz.A05, r7, 36330758989693961L) == false) goto L67;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:65:0x019e, code lost:
                    
                        r23 = r6.getModuleName();
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:66:0x01a3, code lost:
                    
                        if (r5 == null) goto L76;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:67:0x01a5, code lost:
                    
                        r9 = r5.A03;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:68:0x01a7, code lost:
                    
                        r36 = X.C2TN.A02(r7, r63);
                        r37 = r6.isOrganicEligible();
                        r38 = r6.isSponsoredEligible();
                        r14 = X.EnumC120785dO.COMMENT_BUTTON;
                        r3 = r62.A05;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:69:0x01b7, code lost:
                    
                        if (r3 == null) goto L75;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:70:0x01b9, code lost:
                    
                        r27 = X.IQ1.A01(r3);
                        r28 = X.IQ1.A00(r3);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:71:0x01c1, code lost:
                    
                        r3 = r64.A03;
                        r6 = r64.getPosition();
                        r24 = r9;
                        X.AnonymousClass548.A00().A00().A00(r62.A01.requireActivity(), null, new X.C26025BfE(r14, null, java.lang.Integer.valueOf(r3), java.lang.Integer.valueOf(r6), null, java.lang.Integer.valueOf(r64.A0W), null, r8, null, r23, r24, null, null, r27, r28, null, java.lang.String.valueOf(r62.A06), r62.A07, X.AnonymousClass471.A03(r63), null, null, r63.A0s(), r36, r37, r38, r39, false, r64.A2U, false, false, r63.A63(), false, false, false, false, false, false, r51, false, r63.A4t(), r54, false, false, false, false, false, r51, r61), r7, null, null, X.C18U.A06(X.C06090Tz.A05, r7, 36318741671516604L), false, r63.CdW());
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:72:0x0252, code lost:
                    
                        return;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:74:0x0253, code lost:
                    
                        r27 = null;
                        r28 = null;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:75:0x0259, code lost:
                    
                        r9 = null;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:76:0x019c, code lost:
                    
                        r54 = false;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:77:0x0176, code lost:
                    
                        r61 = true;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:78:0x0183, code lost:
                    
                        if (X.C18U.A06(X.C06090Tz.A05, r7, 36328147649707250L) != false) goto L62;
                     */
                    @Override // X.InterfaceC86963uC
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void D67(X.C38321qM r63, X.C75113Zb r64, int r65, boolean r66) {
                        /*
                            Method dump skipped, instructions count: 614
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C86953uB.D67(X.1qM, X.3Zb, int, boolean):void");
                    }
                };
            case Process.SIGSTOP /* 19 */:
                return new InterfaceC77113cx((C685836v) this.A01) { // from class: X.3cv
                    public final InterfaceC686136y A00;

                    {
                        C14360o3.A0B(r2, 1);
                        this.A00 = r2;
                    }

                    @Override // X.C37L
                    public final AnonymousClass388 BRS() {
                        return this.A00.BRS();
                    }

                    @Override // X.C37J
                    public final InterfaceC86963uC BRs() {
                        return this.A00.BRs();
                    }

                    @Override // X.C37X
                    public final JG2 BRu() {
                        return this.A00.BRu();
                    }

                    @Override // X.AnonymousClass376
                    public final InterfaceC909343k BRw() {
                        return this.A00.BRw();
                    }

                    @Override // X.InterfaceC687437l
                    public final BC8 BRx() {
                        return this.A00.BRx();
                    }

                    @Override // X.C37U
                    public final InterfaceC85133r1 BS2() {
                        return this.A00.BS2();
                    }

                    @Override // X.InterfaceC686737e
                    public final InterfaceC79903hf BRv() {
                        throw C00O.createAndThrow();
                    }

                    @Override // X.C37B
                    public final InterfaceC31076DlJ C56() {
                        throw C00O.createAndThrow();
                    }
                };
            case 20:
                C685836v c685836v18 = (C685836v) this.A01;
                UserSession userSession9 = c685836v18.A0A;
                Fragment fragment7 = c685836v18.A02;
                InterfaceC60442pS interfaceC60442pS6 = c685836v18.A0K;
                InterfaceC61432r6 interfaceC61432r63 = c685836v18.A0n;
                C1M1 c1m14 = (C1M1) c685836v18.A2E.getValue();
                return new C42499Ire(fragment7, userSession9, interfaceC60442pS6, c685836v18.A0Q, c685836v18.A0a, c685836v18.A0g, interfaceC61432r63, c1m14, c685836v18.A0q, c685836v18.A0r, c685836v18.A0x);
            case 21:
                C685836v c685836v19 = (C685836v) this.A01;
                Fragment fragment8 = c685836v19.A02;
                UserSession userSession10 = c685836v19.A0A;
                C79853ha c79853ha = (C79853ha) c685836v19.A1l.getValue();
                return new C79893he(fragment8, c685836v19.A08, userSession10, c685836v19.A0B, c79853ha, c685836v19.A0S);
            case 22:
                C685836v c685836v20 = (C685836v) this.A01;
                UserSession userSession11 = c685836v20.A0A;
                Fragment fragment9 = c685836v20.A02;
                InterfaceC60442pS interfaceC60442pS7 = c685836v20.A0K;
                InterfaceC61432r6 interfaceC61432r64 = c685836v20.A0n;
                return new C909243j(fragment9, userSession11, c685836v20, c685836v20, (C79983hn) c685836v20.A1O.getValue(), interfaceC60442pS7, c685836v20.A0U, c685836v20.A0d, interfaceC61432r64);
            case 23:
                C685836v c685836v21 = (C685836v) this.A01;
                return new C42503Iri(c685836v21.A02.requireActivity(), c685836v21.A0A, c685836v21.A0K);
            case 24:
                return new InterfaceC85133r1(((C685836v) this.A01).A0W) { // from class: X.3r0
                    public final C33P A00;

                    @Override // X.InterfaceC85133r1
                    public final boolean Dzp(MotionEvent motionEvent, C75113Zb c75113Zb) {
                        C4S6 c4s6;
                        C3Y7 c3y7;
                        C86033sa BS3;
                        View view;
                        C14360o3.A0B(c75113Zb, 1);
                        if (!c75113Zb.A0l.A00() || (c4s6 = this.A00.A0G.A02) == null || (c3y7 = c4s6.A08) == null || (BS3 = c3y7.BS3()) == null || (view = (View) BS3.A03.getValue()) == null) {
                            return false;
                        }
                        return view.onTouchEvent(motionEvent);
                    }

                    {
                        this.A00 = r1;
                    }
                };
            case 25:
                C685836v c685836v22 = (C685836v) this.A01;
                return new InterfaceC76043b9(c685836v22, c685836v22.A0W, c685836v22.A0Y) { // from class: X.3b7
                    public final InterfaceC686136y A00;
                    public final C33P A01;
                    public final C38W A02;

                    {
                        C14360o3.A0B(r4, 3);
                        this.A00 = c685836v22;
                        this.A01 = r3;
                        this.A02 = r4;
                    }

                    @Override // X.InterfaceC76043b9
                    public final void DXy(C38321qM c38321qM, C3Y7 c3y7, C75113Zb c75113Zb, int i) {
                        C38321qM c38321qM2;
                        C14360o3.A0B(c38321qM, 0);
                        C14360o3.A0B(c75113Zb, 1);
                        if (c38321qM.A5M()) {
                            c38321qM2 = c38321qM.A1e(c75113Zb.A03);
                            if (c38321qM2 == null) {
                                return;
                            }
                        } else {
                            c38321qM2 = c38321qM;
                        }
                        if (c38321qM2.BRp() == EnumC40111tc.A0a) {
                            this.A01.A08(c38321qM, c3y7, c75113Zb, null, i);
                        }
                    }

                    @Override // X.InterfaceC76043b9
                    public final void Dg6(View view, C38321qM c38321qM, int i) {
                        C14360o3.A0B(c38321qM, 0);
                        this.A00.AmF().Dg6(view, c38321qM, i);
                    }

                    @Override // X.C37M
                    public final InterfaceC80083hx Ai8() {
                        return this.A00.Ai8();
                    }

                    @Override // X.C37K
                    public final InterfaceC86673tf ApH() {
                        return this.A00.ApH();
                    }

                    @Override // X.AnonymousClass372
                    public final C39G Ar3() {
                        return this.A00.Ar3();
                    }

                    @Override // X.C37Y
                    public final InterfaceC80023hr B5t() {
                        return this.A00.B5t();
                    }

                    @Override // X.C37Q
                    public final InterfaceC81083jd BNt() {
                        return this.A00.BNt();
                    }

                    @Override // X.C37Q
                    public final InterfaceC86223st BQy() {
                        return this.A00.BQy();
                    }

                    @Override // X.C37C
                    public final C3h2 BRL() {
                        return this.A00.BRL();
                    }

                    @Override // X.C37D
                    public final InterfaceC80063hv BRf() {
                        return this.A00.BRf();
                    }

                    @Override // X.InterfaceC686236z
                    public final InterfaceC86303t2 BRj() {
                        return this.A00.BRj();
                    }

                    @Override // X.AnonymousClass374
                    public final InterfaceC86433tG BRk() {
                        return this.A00.BRk();
                    }

                    @Override // X.AnonymousClass377
                    public final InterfaceC79883hd BS5() {
                        return this.A00.BS5();
                    }

                    @Override // X.InterfaceC687637n
                    public final InterfaceC690738t BTh() {
                        return this.A00.BTh();
                    }

                    @Override // X.C37N
                    public final SeekBar.OnSeekBarChangeListener Bs2() {
                        return this.A00.Bs2();
                    }

                    @Override // X.C37V
                    public final C39D CHG() {
                        return this.A00.CHG();
                    }

                    @Override // X.InterfaceC76053bA
                    public final void DGZ(AbstractC39656Hil abstractC39656Hil) {
                        C38X c38x;
                        C4ZQ c4zq;
                        InterfaceC41201vU interfaceC41201vU;
                        String sessionId;
                        String sessionId2;
                        C38W c38w = this.A02;
                        if (abstractC39656Hil instanceof C39155HLj) {
                            C39155HLj c39155HLj = (C39155HLj) abstractC39656Hil;
                            c38w.A01.A06(c39155HLj.A00, c39155HLj.A01);
                            return;
                        }
                        if (abstractC39656Hil instanceof C39154HLi) {
                            C38X c38x2 = c38w.A01;
                            C39154HLi c39154HLi = (C39154HLi) abstractC39656Hil;
                            boolean z3 = c39154HLi.A01;
                            ViewOnTouchListenerC97504Zk viewOnTouchListenerC97504Zk = c39154HLi.A00;
                            C14360o3.A0B(viewOnTouchListenerC97504Zk, 1);
                            if (!z3) {
                                return;
                            }
                            viewOnTouchListenerC97504Zk.A06.post(new RunnableC71513WvI(viewOnTouchListenerC97504Zk, c38x2.A04));
                            return;
                        }
                        if (abstractC39656Hil instanceof C39159HLn) {
                            C39159HLn c39159HLn = (C39159HLn) abstractC39656Hil;
                            c38w.A01.A07(c39159HLn.A01, c39159HLn.A02, c39159HLn.A04, c39159HLn.A03, c39159HLn.A00);
                            return;
                        }
                        if (abstractC39656Hil instanceof C39160HLo) {
                            C38X c38x3 = c38w.A01;
                            C39160HLo c39160HLo = (C39160HLo) abstractC39656Hil;
                            InterfaceC41201vU interfaceC41201vU2 = c39160HLo.A02;
                            Wm1 wm1 = c39160HLo.A04;
                            int i = c39160HLo.A00;
                            c38x3.A05(c39160HLo.A01, interfaceC41201vU2, c39160HLo.A03, wm1, i);
                            return;
                        }
                        if (abstractC39656Hil instanceof C39157HLl) {
                            C38X c38x4 = c38w.A01;
                            C39157HLl c39157HLl = (C39157HLl) abstractC39656Hil;
                            PromptStickerModel promptStickerModel = c39157HLl.A02;
                            C38321qM c38321qM = c39157HLl.A01;
                            C1M1 c1m15 = c38w.A02;
                            if (c1m15 instanceof InterfaceC43589JPu) {
                                sessionId2 = ((InterfaceC43589JPu) c1m15).CGJ();
                            } else {
                                sessionId2 = c1m15.getSessionId();
                            }
                            c38x4.A04(c39157HLl.A00, c38321qM, promptStickerModel, sessionId2);
                            return;
                        }
                        if (abstractC39656Hil instanceof C39153HLh) {
                            C38X c38x5 = c38w.A01;
                            Fragment fragment10 = c38w.A00;
                            C39153HLh c39153HLh = (C39153HLh) abstractC39656Hil;
                            PromptStickerModel promptStickerModel2 = c39153HLh.A01;
                            C38321qM c38321qM2 = c39153HLh.A00;
                            C1M1 c1m16 = c38w.A02;
                            if (c1m16 instanceof InterfaceC43589JPu) {
                                sessionId = ((InterfaceC43589JPu) c1m16).CGJ();
                            } else {
                                sessionId = c1m16.getSessionId();
                            }
                            c38x5.A03(fragment10, c38321qM2, promptStickerModel2, sessionId);
                            return;
                        }
                        if (abstractC39656Hil instanceof C39158HLm) {
                            C39158HLm c39158HLm = (C39158HLm) abstractC39656Hil;
                            c38w.A01.A02(c39158HLm.A00, c39158HLm.A01, c39158HLm.A02, c38w.A02.getSessionId());
                            return;
                        }
                        if (abstractC39656Hil instanceof C39156HLk) {
                            c38x = c38w.A01;
                            C39156HLk c39156HLk = (C39156HLk) abstractC39656Hil;
                            c4zq = c39156HLk.A00;
                            interfaceC41201vU = c39156HLk.A01;
                        } else if (abstractC39656Hil instanceof C39152HLg) {
                            c38x = c38w.A01;
                            C39152HLg c39152HLg = (C39152HLg) abstractC39656Hil;
                            c4zq = c39152HLg.A00;
                            interfaceC41201vU = c39152HLg.A01;
                        } else {
                            throw new RuntimeException();
                        }
                        String sessionId3 = c38w.A02.getSessionId();
                        C14360o3.A0B(c4zq, 0);
                        C14360o3.A0B(interfaceC41201vU, 1);
                        C14360o3.A0B(sessionId3, 2);
                        AbstractC37670Gi3.A0b(c38x.A03, c38x.A02, interfaceC41201vU.BQN(), sessionId3, c4zq.Cdl());
                    }
                };
            case 26:
                C685836v c685836v23 = (C685836v) this.A01;
                UserSession userSession12 = c685836v23.A0A;
                Fragment fragment10 = c685836v23.A02;
                C33P c33p = c685836v23.A0W;
                return new InterfaceC79883hd(fragment10, userSession12, (C79863hb) c685836v23.A1L.getValue(), c685836v23.A0N, c685836v23.A0O, c33p) { // from class: X.3hc
                    public final Fragment A00;
                    public final UserSession A01;
                    public final C79863hb A02;
                    public final AbstractC61692rW A03;
                    public final InterfaceC65282xQ A04;
                    public final C33P A05;

                    {
                        C14360o3.A0B(r4, 5);
                        this.A01 = userSession12;
                        this.A00 = fragment10;
                        this.A05 = c33p;
                        this.A04 = r6;
                        this.A02 = r4;
                        this.A03 = r5;
                    }

                    @Override // X.InterfaceC79883hd
                    public final void DLe(C73083Pj c73083Pj, C38321qM c38321qM, C75113Zb c75113Zb) {
                        String str5;
                        C14360o3.A0B(c38321qM, 1);
                        C14360o3.A0B(c75113Zb, 2);
                        c75113Zb.A0I(c73083Pj);
                        C33P c33p2 = this.A05;
                        if (c33p2.A0B == null) {
                            C33U c33u = c33p2.A0F;
                            if ((!c33u.A0Q || ((!c33u.A09 || !c33u.A06) && !C33U.A07(c33u))) && c73083Pj.A02 != null && c38321qM.Cff()) {
                                c33u.A0D.sendEmptyMessage(0);
                            }
                        }
                        AbstractC61692rW abstractC61692rW = this.A03;
                        if (abstractC61692rW != null && abstractC61692rW.A0A(((InterfaceC11380iw) this.A00).getModuleName())) {
                            if (c73083Pj.A02 == null && c73083Pj.A04 == null && c73083Pj.A03 == null) {
                                abstractC61692rW.A02(c38321qM);
                                return;
                            }
                            String id = c38321qM.getId();
                            boolean A06 = C18U.A06(C06090Tz.A05, this.A01, 36322714515941811L);
                            if (c38321qM.Cff() && id != null && !abstractC61692rW.A06.contains(id) && A06) {
                                C38321qM A00 = c33p2.A00();
                                if (c38321qM.getId() != null) {
                                    String id2 = c38321qM.getId();
                                    if (A00 != null) {
                                        str5 = A00.getId();
                                    } else {
                                        str5 = null;
                                    }
                                    if (C14360o3.A0K(id2, str5)) {
                                        return;
                                    }
                                }
                            }
                            abstractC61692rW.A03(c38321qM);
                        }
                    }

                    @Override // X.InterfaceC79883hd
                    public final void DRI(C38321qM c38321qM, IgProgressImageView igProgressImageView) {
                        C14360o3.A0B(c38321qM, 0);
                    }
                };
            case 27:
                return new InterfaceC75403a7(((C685836v) this.A01).A0X) { // from class: X.3a6
                    public final C36Q A00;

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r2v1, types: [X.36W, X.2n8] */
                    @Override // X.InterfaceC75403a7
                    public final void A8A(C79233gU c79233gU, int i) {
                        C14360o3.A0B(c79233gU, 1);
                        C36Q c36q = this.A00;
                        if (c36q != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(i);
                            sb.append(':');
                            C84923qg c84923qg = c79233gU.A01;
                            sb.append(c84923qg.A0E);
                            sb.append(':');
                            sb.append(c84923qg.A0G);
                            String obj = sb.toString();
                            UserSession userSession13 = c36q.A01;
                            C36V c36v = c36q.A00;
                            Object obj2 = c36v.A03;
                            C36V c36v2 = C36V.A02;
                            ?? c59072n8 = new C59072n8(obj2, c79233gU, obj);
                            c59072n8.A00 = userSession13;
                            c59072n8.A00 = c36v;
                            c59072n8.A01 = c36v.A00;
                            C36R c36r = c36q.A05;
                            C14360o3.A06(obj2);
                            c36r.Ctv(c59072n8, (C38321qM) obj2, c79233gU);
                            c36q.A03.A01(new C36V(c59072n8), obj);
                        }
                    }

                    @Override // X.InterfaceC75403a7
                    public final void EDq(View view, int i, Object obj, Object obj2) {
                        String A0H;
                        C14360o3.A0B(obj, 2);
                        C14360o3.A0B(obj2, 3);
                        C36Q c36q = this.A00;
                        if (c36q != null) {
                            if (obj2 instanceof C79233gU) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(i);
                                sb.append(':');
                                C84923qg c84923qg = ((C79233gU) obj2).A01;
                                sb.append(c84923qg.A0E);
                                sb.append(':');
                                sb.append(c84923qg.A0G);
                                A0H = sb.toString();
                            } else {
                                C38321qM A02 = C3XH.A02(obj);
                                if (A02 == null || (A0H = AnonymousClass001.A0H(A02.getId(), ':', i)) == null) {
                                    throw new IllegalStateException("Tried to to register view with unknown model");
                                }
                            }
                            c36q.A05.DeT(view, i, obj, obj2);
                            C57112jm c57112jm = c36q.A02;
                            c57112jm.A05(view, c36q.A03.A00(A0H));
                            AbstractC79253gW.A00(c57112jm);
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r2v0, types: [X.36W, X.2n8] */
                    @Override // X.InterfaceC75403a7
                    public final void A87(int i) {
                        C36Q c36q = this.A00;
                        if (c36q != null) {
                            Object obj = c36q.A00.A03;
                            C14360o3.A06(obj);
                            String A0H = AnonymousClass001.A0H(((C38321qM) obj).getId(), ':', i);
                            UserSession userSession13 = c36q.A01;
                            C36V c36v = c36q.A00;
                            Object obj2 = c36v.A03;
                            Object obj3 = c36v.A04;
                            C36V c36v2 = C36V.A02;
                            ?? c59072n8 = new C59072n8(obj2, obj3, A0H);
                            c59072n8.A00 = userSession13;
                            c59072n8.A00 = c36v;
                            c59072n8.A01 = c36v.A00;
                            C36R c36r = c36q.A05;
                            C14360o3.A06(obj2);
                            Object obj4 = c36q.A00.A04;
                            C14360o3.A06(obj4);
                            c36r.Ctt(c59072n8, (C38321qM) obj2, (C75113Zb) obj4);
                            c36q.A03.A01(c59072n8.A01(), A0H);
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r2v0, types: [X.36W, X.2n8] */
                    @Override // X.InterfaceC75403a7
                    public final void A8C(int i) {
                        C36Q c36q = this.A00;
                        if (c36q != null) {
                            Object obj = c36q.A00.A03;
                            C14360o3.A06(obj);
                            String A0H = AnonymousClass001.A0H(((C38321qM) obj).getId(), ':', i);
                            UserSession userSession13 = c36q.A01;
                            C36V c36v = c36q.A00;
                            Object obj2 = c36v.A03;
                            Object obj3 = c36v.A04;
                            C36V c36v2 = C36V.A02;
                            ?? c59072n8 = new C59072n8(obj2, obj3, A0H);
                            c59072n8.A00 = userSession13;
                            c59072n8.A00 = c36v;
                            c59072n8.A01 = c36v.A00;
                            c36q.A05.Ctw(c59072n8);
                            c36q.A03.A01(c59072n8.A01(), A0H);
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r2v0, types: [X.36W, X.2n8] */
                    @Override // X.InterfaceC75403a7
                    public final void A8D(int i) {
                        C36Q c36q = this.A00;
                        if (c36q != null) {
                            Object obj = c36q.A00.A03;
                            C14360o3.A06(obj);
                            String A0H = AnonymousClass001.A0H(((C38321qM) obj).getId(), ':', i);
                            UserSession userSession13 = c36q.A01;
                            C36V c36v = c36q.A00;
                            Object obj2 = c36v.A03;
                            Object obj3 = c36v.A04;
                            C36V c36v2 = C36V.A02;
                            ?? c59072n8 = new C59072n8(obj2, obj3, A0H);
                            c59072n8.A00 = userSession13;
                            c59072n8.A00 = c36v;
                            c59072n8.A01 = c36v.A00;
                            C36R c36r = c36q.A05;
                            C14360o3.A06(obj2);
                            Object obj4 = c36q.A00.A04;
                            C14360o3.A06(obj4);
                            c36r.Ctx(c59072n8, (C38321qM) obj2, (C75113Zb) obj4);
                            c36q.A03.A01(c59072n8.A01(), A0H);
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r2v0, types: [X.36W, X.2n8] */
                    @Override // X.InterfaceC75403a7
                    public final void A8a(int i) {
                        C36Q c36q = this.A00;
                        if (c36q != null) {
                            Object obj = c36q.A00.A03;
                            C14360o3.A06(obj);
                            String A0H = AnonymousClass001.A0H(((C38321qM) obj).getId(), ':', i);
                            UserSession userSession13 = c36q.A01;
                            C36V c36v = c36q.A00;
                            Object obj2 = c36v.A03;
                            Object obj3 = c36v.A04;
                            C36V c36v2 = C36V.A02;
                            ?? c59072n8 = new C59072n8(obj2, obj3, A0H);
                            c59072n8.A00 = userSession13;
                            c59072n8.A00 = c36v;
                            c59072n8.A01 = c36v.A00;
                            c36q.A05.Cty(c59072n8);
                            c36q.A03.A01(c59072n8.A01(), A0H);
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r2v0, types: [X.36W, X.2n8] */
                    @Override // X.InterfaceC75403a7
                    public final void A8n(int i) {
                        C36Q c36q = this.A00;
                        if (c36q != null) {
                            Object obj = c36q.A00.A03;
                            C14360o3.A06(obj);
                            String A0H = AnonymousClass001.A0H(((C38321qM) obj).getId(), ':', i);
                            UserSession userSession13 = c36q.A01;
                            C36V c36v = c36q.A00;
                            Object obj2 = c36v.A03;
                            Object obj3 = c36v.A04;
                            C36V c36v2 = C36V.A02;
                            ?? c59072n8 = new C59072n8(obj2, obj3, A0H);
                            c59072n8.A00 = userSession13;
                            c59072n8.A00 = c36v;
                            c59072n8.A01 = c36v.A00;
                            C36R c36r = c36q.A05;
                            C14360o3.A06(obj2);
                            Object obj4 = c36q.A00.A04;
                            C14360o3.A06(obj4);
                            c36r.Cu0(c59072n8, (C38321qM) obj2, (C75113Zb) obj4);
                            c36q.A03.A01(c59072n8.A01(), A0H);
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r2v0, types: [X.36W, X.2n8] */
                    @Override // X.InterfaceC75403a7
                    public final void AAH(int i) {
                        C36Q c36q = this.A00;
                        if (c36q != null) {
                            Object obj = c36q.A00.A03;
                            C14360o3.A06(obj);
                            String A0H = AnonymousClass001.A0H(((C38321qM) obj).getId(), ':', i);
                            UserSession userSession13 = c36q.A01;
                            C36V c36v = c36q.A00;
                            Object obj2 = c36v.A03;
                            Object obj3 = c36v.A04;
                            C36V c36v2 = C36V.A02;
                            ?? c59072n8 = new C59072n8(obj2, obj3, A0H);
                            c59072n8.A00 = userSession13;
                            c59072n8.A00 = c36v;
                            c59072n8.A01 = c36v.A00;
                            C36R c36r = c36q.A05;
                            C14360o3.A06(obj2);
                            Object obj4 = c36q.A00.A04;
                            C14360o3.A06(obj4);
                            c36r.Cu3(c59072n8, (C38321qM) obj2, (C75113Zb) obj4, i);
                            c36q.A03.A01(c59072n8.A01(), A0H);
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r1v2, types: [X.36W, X.2n8] */
                    @Override // X.InterfaceC75403a7
                    public final void E5n(C38321qM c38321qM, C75113Zb c75113Zb) {
                        C36Q c36q = this.A00;
                        if (c36q != null) {
                            C38321qM c38321qM2 = null;
                            C40971v4 c40971v4 = c36q.A00.A00;
                            if (c40971v4 != null) {
                                c38321qM2 = c40971v4.A0K;
                            }
                            if (!c38321qM.equals(c38321qM2)) {
                                UserSession userSession13 = c36q.A01;
                                String id = c38321qM.getId();
                                if (id != null) {
                                    ?? c59072n8 = new C59072n8(c38321qM, c75113Zb, id);
                                    c59072n8.A00 = userSession13;
                                    c36q.A05.Cu2(c59072n8, c38321qM, c75113Zb);
                                    c36q.A00 = new C36V(c59072n8);
                                    return;
                                }
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r1v1, types: [X.36W, X.2n8] */
                    @Override // X.InterfaceC75403a7
                    public final void E5o(C75113Zb c75113Zb, C40971v4 c40971v4) {
                        C36Q c36q = this.A00;
                        if (c36q != null) {
                            UserSession userSession13 = c36q.A01;
                            C38321qM c38321qM = c40971v4.A0K;
                            String id = c38321qM.getId();
                            if (id != null) {
                                C36V c36v = C36V.A02;
                                ?? c59072n8 = new C59072n8(c38321qM, c75113Zb, id);
                                c59072n8.A00 = userSession13;
                                c59072n8.A01 = c40971v4;
                                c36q.A05.Cu2(c59072n8, c38321qM, c75113Zb);
                                c36q.A00 = new C36V(c59072n8);
                                return;
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                    }

                    @Override // X.InterfaceC75403a7
                    public final void F9l(View view) {
                        C36Q c36q = this.A00;
                        if (c36q != null) {
                            c36q.A02.A04(view);
                            AbstractC79253gW.A00 = null;
                        }
                    }

                    {
                        this.A00 = r1;
                    }
                };
            case 28:
                C685836v c685836v24 = (C685836v) this.A01;
                return C39E.A00(c685836v24.A02.requireActivity(), c685836v24.A0K, c685836v24.A0A);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                C685836v c685836v25 = (C685836v) this.A01;
                return new AnonymousClass428(c685836v25.A02, c685836v25.A0A) { // from class: X.427
                    public final Fragment A00;
                    public final UserSession A01;

                    @Override // X.AnonymousClass428
                    public final void D3Q(String str5, String str6) {
                        C14360o3.A0B(str6, 1);
                        UserSession userSession13 = this.A01;
                        C31368DqX A01 = AbstractC31402Dr6.A01(userSession13, str5, AbstractC111324zv.A00(2830), str6);
                        C140966Yy c140966Yy = new C140966Yy(this.A00.requireActivity(), userSession13);
                        c140966Yy.A08();
                        c140966Yy.A0D(AbstractC31364DqT.A03().A01.A02(userSession13, A01.A03()));
                        c140966Yy.A04();
                    }

                    {
                        this.A01 = r2;
                        this.A00 = r1;
                    }
                };
            case 30:
                C685836v c685836v26 = (C685836v) this.A01;
                return new C37517GfZ(c685836v26.A02, c685836v26.A0A);
            case 31:
                C685836v c685836v27 = (C685836v) this.A01;
                return new AnonymousClass420(c685836v27.A02, c685836v27.A08, c685836v27.A0A, c685836v27.A0K);
            case 32:
                C685836v c685836v28 = (C685836v) this.A01;
                return new C37518Gfa(c685836v28.A02, c685836v28.A0A);
            case 33:
                C685836v c685836v29 = (C685836v) this.A01;
                return new C29276CvX(c685836v29.A02.requireActivity(), c685836v29.A0A);
            case 34:
                C685836v c685836v30 = (C685836v) this.A01;
                UserSession userSession13 = c685836v30.A0A;
                InterfaceC60442pS interfaceC60442pS8 = c685836v30.A0K;
                return new C42932Iyk(c685836v30.A02, userSession13, c685836v30, interfaceC60442pS8, c685836v30.A0O, c685836v30.A0l, (C1M1) c685836v30.A2E.getValue(), c685836v30.A0w);
            case 35:
                C685836v c685836v31 = (C685836v) this.A01;
                UserSession userSession14 = c685836v31.A0A;
                InterfaceC60442pS interfaceC60442pS9 = c685836v31.A0K;
                return new C42935Iyn(c685836v31.A02, userSession14, c685836v31, interfaceC60442pS9, c685836v31.A0l, c685836v31.A0w);
            case 36:
                C685836v c685836v32 = (C685836v) this.A01;
                UserSession userSession15 = c685836v32.A0A;
                return new C37513GfV(c685836v32.A02, c685836v32.A08, userSession15, c685836v32.A0C, c685836v32.A0D);
            case 37:
                return new InterfaceC60682pr(((C685836v) this.A01).A02) { // from class: X.39A
                    public final Fragment A00;

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v1, types: [X.3FQ, java.lang.Object] */
                    @Override // X.InterfaceC60682pr
                    public final C3FQ getScrollingViewProxy() {
                        Fragment fragment11 = this.A00;
                        if (fragment11.mView != null) {
                            C3FQ scrollingViewProxy = ((InterfaceC60682pr) fragment11).getScrollingViewProxy();
                            C14360o3.A0A(scrollingViewProxy);
                            return scrollingViewProxy;
                        }
                        return new Object();
                    }

                    {
                        this.A00 = r1;
                    }
                };
            case 38:
                return new SeekBar.OnSeekBarChangeListener(((C685836v) this.A01).A0W) { // from class: X.3hk
                    public final C33P A00;

                    @Override // android.widget.SeekBar.OnSeekBarChangeListener
                    public final void onProgressChanged(SeekBar seekBar, int i, boolean z3) {
                    }

                    @Override // android.widget.SeekBar.OnSeekBarChangeListener
                    public final void onStopTrackingTouch(SeekBar seekBar) {
                        C14360o3.A0B(seekBar, 0);
                        this.A00.A0G.A0P(seekBar.getProgress());
                    }

                    @Override // android.widget.SeekBar.OnSeekBarChangeListener
                    public final void onStartTrackingTouch(SeekBar seekBar) {
                        this.A00.A0G.A0U("seek");
                    }

                    {
                        this.A00 = r1;
                    }
                };
            case 39:
                Object obj = this.A01;
                if (obj != null) {
                    return obj;
                }
                return new C43052J1s(1);
            case 40:
                C685836v c685836v33 = (C685836v) this.A01;
                UserSession userSession16 = c685836v33.A0A;
                InterfaceC60442pS interfaceC60442pS10 = c685836v33.A0K;
                return new C37510GfS(c685836v33.A02, userSession16, interfaceC60442pS10, c685836v33.A0O, c685836v33.A0k, c685836v33.A0w);
            case Seq.NULL_REFNUM /* 41 */:
                C685836v c685836v34 = (C685836v) this.A01;
                return new InterfaceC75603aR(c685836v34.A02, c685836v34.A03, c685836v34.A0A, c685836v34.A0K) { // from class: X.3aQ
                    public final AbstractC10360h2 A00;
                    public final Fragment A01;
                    public final UserSession A02;
                    public final InterfaceC60442pS A03;

                    @Override // X.InterfaceC75603aR
                    public final void DmH(C38321qM c38321qM, C75113Zb c75113Zb) {
                    }

                    @Override // X.InterfaceC75603aR
                    public final void DmJ(String str5) {
                        FragmentActivity activity;
                        if (!(!C06P.A01(this.A00)) && (activity = this.A01.getActivity()) != null) {
                            UserSession userSession17 = this.A02;
                            List list = (List) FCM.A00(userSession17).A00.get(str5);
                            if (list != null) {
                                ArrayList arrayList = new ArrayList(list.size());
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((User) it.next()).getId());
                                }
                                C140966Yy c140966Yy = new C140966Yy(activity, userSession17);
                                c140966Yy.A08();
                                c140966Yy.A0B(null, AbstractC31412DrH.A00().A00.CsY(userSession17, str5, null, arrayList, null, false));
                                c140966Yy.A04();
                            }
                        }
                    }

                    {
                        this.A02 = r3;
                        this.A03 = r4;
                        this.A01 = r1;
                        this.A00 = r2;
                    }
                };
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                C685836v c685836v35 = (C685836v) this.A01;
                return new C42493IrY(c685836v35.A02, c685836v35, (C81053ja) c685836v35.A1M.getValue(), c685836v35.A0o);
            case 43:
                return new Aj5((C81053ja) ((C685836v) this.A01).A1M.getValue());
            case 44:
                C685836v c685836v36 = (C685836v) this.A01;
                UserSession userSession17 = c685836v36.A0A;
                String str5 = c685836v36.A0w;
                InterfaceC60442pS interfaceC60442pS11 = c685836v36.A0K;
                Fragment fragment11 = c685836v36.A02;
                String str6 = c685836v36.A0s;
                C33P c33p2 = c685836v36.A0W;
                C1M1 c1m15 = (C1M1) c685836v36.A2E.getValue();
                return new C29394CxR(fragment11, c685836v36.A03, (InterfaceC11380iw) fragment11, userSession17, c685836v36, interfaceC60442pS11, c33p2, c1m15, str5, str6);
            case 45:
                C685836v c685836v37 = (C685836v) this.A01;
                return new C690338p(c685836v37.A0A, c685836v37.A0M, c685836v37.A0O);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                C685836v c685836v38 = (C685836v) this.A01;
                UserSession userSession18 = c685836v38.A0A;
                InterfaceC60442pS interfaceC60442pS12 = c685836v38.A0K;
                return new C692639m(c685836v38.A02, c685836v38.A03, userSession18, c685836v38, (C692539l) c685836v38.A1N.getValue(), interfaceC60442pS12, c685836v38.A0M, c685836v38.A0O, (C1M1) c685836v38.A2E.getValue());
            case 47:
                return new InterfaceC76533by(((C685836v) this.A01).A0B) { // from class: X.3bx
                    public final C57112jm A00;

                    @Override // X.InterfaceC76533by
                    public final C57112jm CGS() {
                        return this.A00;
                    }

                    {
                        this.A00 = r1;
                    }
                };
            case 48:
                C685836v c685836v39 = (C685836v) this.A01;
                return new GFS(c685836v39.A02, c685836v39.A0A, c685836v39.A0f);
            default:
                C685836v c685836v40 = (C685836v) this.A01;
                return new C37502GfK(c685836v40.A02.requireActivity(), c685836v40.A0A, c685836v40.A0K, c685836v40.A0s, c685836v40.A0w);
        }
    }
}
