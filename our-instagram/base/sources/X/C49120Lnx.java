package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.text.TightTextView;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.Lnx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49120Lnx implements C7QC {
    public final InterfaceC11380iw A00;
    public final C7Q7 A01;
    public final C7Q9 A02;
    public final C7Q6 A03 = new C49006Llu(this);
    public final InterfaceC165247aD A04;
    public final AnonymousClass988 A05;
    public final C162907Rb A06;

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        boolean A1R = AbstractC167007dF.A1R(0, viewGroup, layoutInflater);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_link_message, false);
        C49170Lon c49170Lon = new C49170Lon(A0R);
        FrameLayout frameLayout = c49170Lon.A04;
        Context A0L = AbstractC166997dE.A0L(A0R);
        AnonymousClass988 anonymousClass988 = this.A05;
        int A0C = AbstractC166987dD.A0C(A0L, 12);
        int A0C2 = AbstractC166987dD.A0C(A0L, 10);
        TightTextView tightTextView = c49170Lon.A07;
        tightTextView.setPadding(A0C, A0C2, A0C, A0C2);
        C7Q6 c7q6 = this.A03;
        C7Q7 c7q7 = this.A01;
        C7Q9 c7q9 = this.A02;
        InterfaceC165247aD interfaceC165247aD = this.A04;
        boolean z = anonymousClass988.A1U;
        C7QF c7qf = new C7QF(frameLayout, new C162897Ra((InterfaceC165207a9) interfaceC165247aD), c7q6, c7q7, c7q9, (InterfaceC165507ad) interfaceC165247aD, c49170Lon, z, A1R, AbstractC167007dF.A1Z(anonymousClass988.A0d));
        C7BK c7bk = new C7BK(c7qf, frameLayout, AbstractC167007dF.A0N(frameLayout, R.id.message_text), z);
        c49170Lon.EZ4(c7q7);
        c49170Lon.A01 = c7qf;
        tightTextView.setOnTouchListener(c7bk);
        frameLayout.setOnTouchListener(c7qf);
        this.A06.A00(c49170Lon);
        return c49170Lon;
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void ADy(C7QD c7qd, InterfaceC129555tK interfaceC129555tK) {
        int i;
        int i2;
        FrameLayout frameLayout;
        InterfaceC89443yk c49391LsP;
        C49170Lon c49170Lon = (C49170Lon) c7qd;
        C45895KSy c45895KSy = (C45895KSy) interfaceC129555tK;
        if (c49170Lon != null && c45895KSy != null) {
            C49399LsX c49399LsX = new C49399LsX(c49170Lon, c45895KSy);
            IgProgressImageView igProgressImageView = c49170Lon.A08;
            igProgressImageView.setVisibility(8);
            TightTextView tightTextView = c49170Lon.A06;
            tightTextView.setVisibility(8);
            TightTextView tightTextView2 = c49170Lon.A05;
            tightTextView2.setVisibility(8);
            View view = c49170Lon.A03;
            View view2 = view;
            view.setVisibility(8);
            InterfaceC11380iw interfaceC11380iw = this.A00;
            C7Y8 c7y8 = (C7Y8) this.A04;
            TightTextView tightTextView3 = c49170Lon.A07;
            CharSequence charSequence = c45895KSy.A02;
            tightTextView3.setText(charSequence);
            AbstractC46444Kh4 abstractC46444Kh4 = c45895KSy.A01;
            boolean z = abstractC46444Kh4 instanceof C45938KUp;
            if (z) {
                i = ((C45938KUp) abstractC46444Kh4).A00;
            } else {
                i = ((C45939KUq) abstractC46444Kh4).A00;
            }
            AbstractC13880nE.A0Y(tightTextView3, i);
            if (charSequence instanceof SpannableStringBuilder) {
                String str = c45895KSy.A03;
                C14360o3.A0C(charSequence, "null cannot be cast to non-null type android.text.SpannableStringBuilder");
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
                String str2 = c45895KSy.BSy().A01;
                InterfaceC165287aH interfaceC165287aH = (InterfaceC165287aH) c7y8;
                C14360o3.A0B(spannableStringBuilder, 0);
                Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C89403yg.class);
                C14360o3.A07(spans);
                for (C89403yg c89403yg : (C89403yg[]) spans) {
                    int intValue = c89403yg.A02.intValue();
                    if (intValue != 0) {
                        if (intValue == 6) {
                            c89403yg.A01 = c49399LsX;
                            c49391LsP = new C49398LsW(c7y8, str, str2);
                        }
                    } else {
                        c89403yg.A01 = c49399LsX;
                        c49391LsP = new C49391LsP(interfaceC165287aH);
                    }
                    c89403yg.A00 = c49391LsP;
                }
            }
            if (z) {
                i2 = ((C45938KUp) abstractC46444Kh4).A01;
            } else {
                i2 = ((C45939KUq) abstractC46444Kh4).A01;
            }
            tightTextView3.setTextColor(i2);
            if (z) {
                frameLayout = c49170Lon.A04;
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                layoutParams.width = -2;
                frameLayout.setLayoutParams(layoutParams);
            } else if (abstractC46444Kh4 instanceof C45939KUq) {
                C45939KUq c45939KUq = (C45939KUq) abstractC46444Kh4;
                AbstractC46443Kh3 abstractC46443Kh3 = c45939KUq.A04;
                AbstractC46443Kh3 abstractC46443Kh32 = c45939KUq.A03;
                C51753Mtc c51753Mtc = c45939KUq.A02;
                if (c51753Mtc == null) {
                    frameLayout = c49170Lon.A04;
                    ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
                    layoutParams2.width = -2;
                    frameLayout.setLayoutParams(layoutParams2);
                } else {
                    view2 = igProgressImageView;
                    int i3 = c51753Mtc.A01;
                    ImageUrl imageUrl = (ImageUrl) c51753Mtc.A02;
                    frameLayout = c49170Lon.A04;
                    ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
                    layoutParams3.width = i3;
                    frameLayout.setLayoutParams(layoutParams3);
                    igProgressImageView.setUrl(imageUrl, interfaceC11380iw);
                }
                view2.setVisibility(0);
                if (abstractC46443Kh3 instanceof C45936KUn) {
                    AbstractC13880nE.A0d(tightTextView2, ((C45936KUn) abstractC46443Kh3).A00);
                } else if (abstractC46443Kh3 instanceof C45937KUo) {
                    C45937KUo c45937KUo = (C45937KUo) abstractC46443Kh3;
                    String str3 = c45937KUo.A01;
                    int i4 = c45937KUo.A00;
                    AbstractC13880nE.A0d(tightTextView2, 0);
                    tightTextView.setText(str3);
                    tightTextView.setTextColor(i4);
                    tightTextView.setVisibility(0);
                } else {
                    throw B4Z.A00();
                }
                if (abstractC46443Kh32 instanceof C45936KUn) {
                    AbstractC13880nE.A0Y(tightTextView, ((C45936KUn) abstractC46443Kh32).A00);
                } else if (abstractC46443Kh32 instanceof C45937KUo) {
                    C45937KUo c45937KUo2 = (C45937KUo) abstractC46443Kh32;
                    String str4 = c45937KUo2.A01;
                    int i5 = c45937KUo2.A00;
                    AbstractC13880nE.A0Y(tightTextView, 0);
                    tightTextView2.setText(str4);
                    tightTextView2.setTextColor(i5);
                    tightTextView2.setVisibility(0);
                } else {
                    throw B4Z.A00();
                }
            } else {
                throw B4Z.A00();
            }
            AbstractC1580577p.A06(c49170Lon.A02, frameLayout, c45895KSy.A00, abstractC46444Kh4 instanceof C45939KUq);
            C7QH c7qh = c49170Lon.A01;
            if (c7qh != null) {
                ((C7QG) c7qh).A00 = c45895KSy;
            }
            this.A06.A02(c49170Lon, c45895KSy);
        }
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C49170Lon c49170Lon = (C49170Lon) c7qd;
        C14360o3.A0B(c49170Lon, 0);
        C7QH c7qh = c49170Lon.A01;
        if (c7qh != null) {
            ((C7QG) c7qh).A00 = null;
        }
        this.A06.A01(c49170Lon);
    }

    public C49120Lnx(InterfaceC11380iw interfaceC11380iw, InterfaceC165247aD interfaceC165247aD, AnonymousClass988 anonymousClass988) {
        this.A04 = interfaceC165247aD;
        this.A05 = anonymousClass988;
        this.A00 = interfaceC11380iw;
        this.A01 = new C7Q7(interfaceC165247aD);
        this.A02 = new C7Q9((InterfaceC165307aJ) interfaceC165247aD, anonymousClass988.A1U);
        this.A06 = new C162907Rb(AbstractC166987dD.A1J(new C49139LoI((C7W5) interfaceC165247aD)));
    }
}
