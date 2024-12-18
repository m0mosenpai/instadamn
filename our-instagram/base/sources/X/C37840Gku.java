package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.ui.listview.StickyHeaderListView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.Gku, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37840Gku extends C1I2 implements InterfaceC60602pj, C38Y {
    public C38321qM A00;
    public C3FQ A01;
    public DirectShareTarget A02;
    public boolean A03;
    public boolean A04;
    public StickyHeaderListView A05;
    public boolean A06;
    public boolean A07;
    public final InterfaceC11380iw A08;
    public final UserSession A09;
    public final C2EC A0A;
    public final JX0 A0B;
    public final InterfaceC65282xQ A0C;
    public final C37841Gkv A0D;
    public final C37556GgC A0E;

    public C37840Gku(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC65282xQ interfaceC65282xQ, C37556GgC c37556GgC, Integer num, String str, String str2, String str3) {
        C09530e4 c09530e4;
        AbstractC167007dF.A1F(userSession, 2, str);
        this.A09 = userSession;
        this.A08 = interfaceC11380iw;
        this.A0C = interfaceC65282xQ;
        this.A0E = c37556GgC;
        C81663kb A0N = ((C2DU) AbstractC28761aE.A00(userSession)).A0N(str);
        this.A0A = A0N;
        this.A0B = C36911no.A00().E6g(userSession);
        if (A0N != null) {
            C3AY A00 = C4GQ.A00(this.A09, A0N);
            c09530e4 = AbstractC166987dD.A1L(A00.A00, A00.A01);
        } else {
            c09530e4 = null;
        }
        this.A0D = new C37841Gkv(context, interfaceC11380iw, userSession, num, str, str2, str3, c09530e4);
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final void D8S(View view) {
        C38321qM c38321qM;
        C120985dq A01;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        IgTextView igTextView;
        IgTextView igTextView2;
        int i;
        GradientSpinnerAvatarView gradientSpinnerAvatarView;
        C14360o3.A0B(view, 0);
        C37556GgC c37556GgC = this.A0E;
        this.A06 = AbstractC167007dF.A1W(c37556GgC);
        this.A05 = (StickyHeaderListView) view.findViewById(R.id.sticky_header_list);
        if (!this.A06) {
            this.A01 = C3FN.A00((ViewGroup) view.findViewById(android.R.id.list));
        } else {
            if (c37556GgC != null && (A01 = C37556GgC.A01(c37556GgC)) != null) {
                c38321qM = A01.A02;
            } else {
                c38321qM = null;
            }
            this.A00 = c38321qM;
        }
        C37841Gkv c37841Gkv = this.A0D;
        ViewOnClickListenerC35685FpK viewOnClickListenerC35685FpK = new ViewOnClickListenerC35685FpK(this, 22);
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.floating_send_stub);
        c37841Gkv.A01 = viewOnClickListenerC35685FpK;
        C14360o3.A0A(viewStub);
        View inflate = viewStub.inflate();
        c37841Gkv.A02 = inflate;
        IgImageView igImageView = null;
        if (inflate != null) {
            viewGroup = (ViewGroup) inflate.findViewById(R.id.button_container);
        } else {
            viewGroup = null;
        }
        c37841Gkv.A03 = viewGroup;
        View view2 = c37841Gkv.A02;
        if (view2 != null) {
            viewGroup2 = (ViewGroup) view2.findViewById(R.id.pill_container);
        } else {
            viewGroup2 = null;
        }
        c37841Gkv.A04 = viewGroup2;
        View view3 = c37841Gkv.A02;
        if (view3 != null) {
            igTextView = (IgTextView) view3.findViewById(R.id.send_cta);
        } else {
            igTextView = null;
        }
        c37841Gkv.A05 = igTextView;
        View view4 = c37841Gkv.A02;
        if (view4 != null) {
            igTextView2 = (IgTextView) view4.findViewById(R.id.sent_label);
        } else {
            igTextView2 = null;
        }
        c37841Gkv.A06 = igTextView2;
        int dimensionPixelSize = c37841Gkv.A0C.getResources().getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size);
        IgTextView igTextView3 = c37841Gkv.A05;
        int i2 = 0;
        if (igTextView3 != null) {
            igTextView3.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(dimensionPixelSize, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO));
        }
        IgTextView igTextView4 = c37841Gkv.A06;
        if (igTextView4 != null) {
            igTextView4.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(dimensionPixelSize, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO));
        }
        IgTextView igTextView5 = c37841Gkv.A06;
        if (igTextView5 != null) {
            i = igTextView5.getMeasuredWidth();
        } else {
            i = 0;
        }
        IgTextView igTextView6 = c37841Gkv.A05;
        if (igTextView6 != null) {
            i2 = igTextView6.getMeasuredWidth();
        }
        c37841Gkv.A00 = i - i2;
        View view5 = c37841Gkv.A02;
        if (view5 != null) {
            view5.setBackgroundResource(R.drawable.bg_dark_grey_gradient);
        }
        View view6 = c37841Gkv.A02;
        if (view6 != null) {
            gradientSpinnerAvatarView = (GradientSpinnerAvatarView) view6.findViewById(R.id.avatar_image_view);
        } else {
            gradientSpinnerAvatarView = null;
        }
        c37841Gkv.A08 = gradientSpinnerAvatarView;
        View view7 = c37841Gkv.A02;
        if (view7 != null) {
            igImageView = (IgImageView) view7.findViewById(R.id.checkmark);
        }
        c37841Gkv.A07 = igImageView;
        C09530e4 c09530e4 = c37841Gkv.A0Q;
        if (c09530e4 != null) {
            Object obj = c09530e4.A01;
            GradientSpinnerAvatarView gradientSpinnerAvatarView2 = c37841Gkv.A08;
            if (obj == null) {
                if (gradientSpinnerAvatarView2 != null) {
                    gradientSpinnerAvatarView2.A0F(null, c37841Gkv.A0H, (ImageUrl) c09530e4.A00);
                }
            } else if (gradientSpinnerAvatarView2 != null) {
                gradientSpinnerAvatarView2.A0G(null, c37841Gkv.A0H, (ImageUrl) c09530e4.A00, (ImageUrl) obj);
            }
        }
        ViewGroup viewGroup3 = c37841Gkv.A03;
        if (viewGroup3 != null) {
            C3P9 A0s = AbstractC166987dD.A0s(viewGroup3);
            A0s.A0D = true;
            A0s.A07 = true;
            C37846Gl0.A00(A0s, c37841Gkv, 0);
        }
        C38321qM c38321qM2 = this.A00;
        if (c38321qM2 != null) {
            A00(c38321qM2, c37841Gkv);
        }
        C38321qM A012 = A01();
        if (A012 != null) {
            A00(A012, c37841Gkv);
        }
        this.A07 = true;
        A03(this.A04);
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXR(int i) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXS(int i) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXc(int i, int i2) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DY0() {
    }

    @Override // X.C38Y
    public final /* synthetic */ void Dim(float f, float f2) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DrV() {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DrY(C120985dq c120985dq, int i) {
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
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onResume() {
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
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public final C38321qM A01() {
        InterfaceC65282xQ interfaceC65282xQ;
        C38321qM BQN;
        C120985dq A01;
        if (this.A06) {
            C37556GgC c37556GgC = this.A0E;
            if (c37556GgC != null && (A01 = C37556GgC.A01(c37556GgC)) != null) {
                return A01.A02;
            }
        } else {
            C3FQ c3fq = this.A01;
            if (c3fq != null) {
                int B6q = c3fq.B6q();
                C3FQ c3fq2 = this.A01;
                if (c3fq2 != null) {
                    int BM3 = c3fq2.BM3();
                    if (B6q <= BM3) {
                        int i = 0;
                        C38321qM c38321qM = null;
                        int i2 = 0;
                        while (true) {
                            C3FQ c3fq3 = this.A01;
                            if (c3fq3 == null) {
                                break;
                            }
                            View A04 = C81203jp.A04(null, c3fq3, B6q);
                            if (A04 != null && (interfaceC65282xQ = this.A0C) != null) {
                                C3FQ c3fq4 = this.A01;
                                if (c3fq4 != null) {
                                    int BDJ = B6q - c3fq4.BDJ();
                                    if (BDJ < interfaceC65282xQ.getCount()) {
                                        Object item = interfaceC65282xQ.getItem(BDJ);
                                        if ((item instanceof InterfaceC38371qR) && (BQN = ((InterfaceC38371qR) item).BQN()) != null) {
                                            if (c38321qM == null) {
                                                c38321qM = BQN;
                                            }
                                            int height = A04.getHeight();
                                            C3FQ c3fq5 = this.A01;
                                            if (c3fq5 == null) {
                                                break;
                                            }
                                            ViewGroup CFj = c3fq5.CFj();
                                            C14360o3.A07(CFj);
                                            int A012 = C81203jp.A01(CFj, A04, this.A05);
                                            if (height != 0) {
                                                int i3 = A012 / height;
                                                if (A012 > i && i3 > i2) {
                                                    i = A012;
                                                    c38321qM = BQN;
                                                    i2 = i3;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    break;
                                }
                            }
                            if (B6q == BM3) {
                                return c38321qM;
                            }
                            B6q++;
                        }
                    }
                }
            }
            C14360o3.A0F("scrollingList");
            throw C00O.createAndThrow();
        }
        return null;
    }

    public final void A02(C38321qM c38321qM) {
        this.A00 = c38321qM;
        if (c38321qM != null) {
            A00(c38321qM, this.A0D);
        }
    }

    public final void A03(boolean z) {
        this.A04 = z;
        if (this.A07) {
            C37841Gkv c37841Gkv = this.A0D;
            View view = c37841Gkv.A02;
            if (!z) {
                if (view != null && view.getVisibility() == 0) {
                    AbstractC167007dF.A0x(c37841Gkv.A02);
                    View view2 = c37841Gkv.A02;
                    if (view2 != null) {
                        view2.clearAnimation();
                    }
                    View view3 = c37841Gkv.A02;
                    if (view3 != null) {
                        view3.startAnimation(c37841Gkv.A0F);
                    }
                    ViewGroup viewGroup = c37841Gkv.A03;
                    if (viewGroup != null) {
                        viewGroup.startAnimation(c37841Gkv.A0G);
                    }
                }
                this.A00 = null;
                return;
            }
            if (view != null && view.getVisibility() == 8) {
                View view4 = c37841Gkv.A02;
                if (view4 != null) {
                    view4.setVisibility(0);
                }
                View view5 = c37841Gkv.A02;
                if (view5 != null) {
                    view5.clearAnimation();
                }
                View view6 = c37841Gkv.A02;
                if (view6 != null) {
                    view6.startAnimation(c37841Gkv.A0D);
                }
                ViewGroup viewGroup2 = c37841Gkv.A03;
                if (viewGroup2 != null) {
                    viewGroup2.startAnimation(c37841Gkv.A0E);
                }
            }
            C38321qM A01 = A01();
            this.A00 = A01;
            if (A01 == null) {
                return;
            }
            A00(A01, c37841Gkv);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0009, code lost:
    
        if (r2 <= 0) goto L8;
     */
    @Override // X.C38Y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DXa(int r2, int r3) {
        /*
            r1 = this;
            boolean r0 = r1.A03
            if (r0 == 0) goto Lf
            com.instagram.model.direct.DirectShareTarget r0 = r1.A02
            if (r0 == 0) goto Lb
            r0 = 1
            if (r2 > 0) goto Lc
        Lb:
            r0 = 0
        Lc:
            r1.A03(r0)
        Lf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37840Gku.DXa(int, int):void");
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroyView() {
        C37841Gkv c37841Gkv = this.A0D;
        ViewGroup viewGroup = c37841Gkv.A03;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(null);
        }
        c37841Gkv.A03 = null;
        c37841Gkv.A04 = null;
        c37841Gkv.A08 = null;
        c37841Gkv.A02 = null;
        c37841Gkv.A01 = null;
    }

    public static void A00(C38321qM c38321qM, C37841Gkv c37841Gkv) {
        Integer num;
        String id = c38321qM.getId();
        EnumC40111tc BRp = c38321qM.BRp();
        c37841Gkv.A0B = id;
        c37841Gkv.A0A = Integer.valueOf(BRp.A00);
        if (AbstractC001800i.A0u(c37841Gkv.A0N, id)) {
            num = C05F.A01;
        } else {
            num = C05F.A00;
        }
        if (num == c37841Gkv.A09) {
            C37841Gkv.A00(c37841Gkv, num);
        } else {
            C37841Gkv.A01(c37841Gkv, num);
        }
    }

    @Override // X.C38Y
    public final void Dj0(Integer num) {
        C38321qM A01;
        int A03 = C0f9.A03(-1705819912);
        if (this.A04 && (A01 = A01()) != null) {
            A00(A01, this.A0D);
            this.A00 = A01;
        }
        C0f9.A0A(-1409592954, A03);
    }

    @Override // X.C1I2
    public final void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
        C38321qM A01;
        int A03 = C0f9.A03(-1878729598);
        if (this.A04 && (A01 = A01()) != null) {
            A00(A01, this.A0D);
            this.A00 = A01;
        }
        C0f9.A0A(1431880248, A03);
    }

    @Override // X.C1I2
    public final void onScrollStateChanged(C3FQ c3fq, int i) {
        C0f9.A0A(-933575057, C0f9.A03(-45584028));
    }
}
