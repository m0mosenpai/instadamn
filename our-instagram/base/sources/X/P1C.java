package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.business.scheduling.model.NonSupportedContentSchedulingFeatures;
import com.instagram.common.session.UserSession;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public final class P1C implements InterfaceC58169PqZ {
    public C52369NFj A00;
    public final AbstractC59962oe A01;
    public final InterfaceC58310Pt2 A02;
    public final InterfaceC58190Pqw A03;
    public final NKK A04;
    public final EnumC53380NjV A05;
    public final C81X A06;
    public final UserSession A07;
    public final boolean A08;

    public static final void A02(P1C p1c, Date date) {
        NonSupportedContentSchedulingFeatures nonSupportedContentSchedulingFeatures = null;
        NKK nkk = p1c.A04;
        if (date == null) {
            nkk.A07(NKK.A00(nkk.A04(), nkk, AbstractC25227BEk.A0p()));
        } else {
            nkk.A07(NKK.A00(nkk.A04(), nkk, Integer.valueOf((int) TimeUnit.MILLISECONDS.toSeconds(date.getTime()))));
            nonSupportedContentSchedulingFeatures = p1c.A02.CD1();
        }
        p1c.A03.ClS(nonSupportedContentSchedulingFeatures);
    }

    public static final void A00(C51735MtI c51735MtI, P1C p1c) {
        C52369NFj c52369NFj = p1c.A00;
        if (c52369NFj != null) {
            c52369NFj.setChecked(c51735MtI.A04);
            C52369NFj c52369NFj2 = p1c.A00;
            if (c52369NFj2 != null) {
                c52369NFj2.setEnabled(c51735MtI.A05);
                C52369NFj c52369NFj3 = p1c.A00;
                if (c52369NFj3 != null) {
                    c52369NFj3.setTitle(c51735MtI.A03);
                    C52369NFj c52369NFj4 = p1c.A00;
                    if (c52369NFj4 != null) {
                        c52369NFj4.setSubtitle(c51735MtI.A02);
                        boolean z = c51735MtI.A06;
                        C52369NFj c52369NFj5 = p1c.A00;
                        if (z) {
                            if (c52369NFj5 != null) {
                                c52369NFj5.A06();
                                return;
                            }
                        } else if (c52369NFj5 != null) {
                            c52369NFj5.A04();
                            return;
                        }
                    }
                }
            }
        }
        C14360o3.A0F("contentSchedulingSwitchCell");
        throw C00O.createAndThrow();
    }

    public static final void A01(P1C p1c) {
        new OIO(p1c.A01.requireActivity(), p1c.A07).A00((Date) ((C51735MtI) p1c.A04.A0A.getValue()).A01, C57525Pfz.A00(p1c, 36), MSW.A1E(p1c, 25), false);
        p1c.A03.ClT();
    }

    @Override // X.InterfaceC58169PqZ
    public final void ADu() {
        A00((C51735MtI) this.A04.A0A.getValue(), this);
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        Integer num;
        this.A03.ClU();
        Context requireContext = this.A01.requireContext();
        if (this.A08) {
            num = Integer.valueOf(R.drawable.instagram_clock_pano_outline_24);
        } else {
            num = null;
        }
        C52369NFj A01 = OOy.A01(requireContext, AbstractC166997dE.A0b(), null, num, 2131956754);
        this.A00 = A01;
        C52369NFj.A02(A01, this, 8);
        ViewOnClickListenerC55466OkL.A02(A01, 25, this);
        C52369NFj c52369NFj = this.A00;
        if (c52369NFj == null) {
            C14360o3.A0F("contentSchedulingSwitchCell");
            throw C00O.createAndThrow();
        }
        return c52369NFj;
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return this.A05;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A06;
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
        C05A c05a;
        C51735MtI c51735MtI;
        NKK nkk = this.A04;
        UserSession userSession = nkk.A05;
        if (C18U.A06(C06090Tz.A05, userSession, 36323783962996334L)) {
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            InterfaceC16530ry interfaceC16530ry = A00.A0b;
            C0YR[] c0yrArr = C23031Ai.A8c;
            int A0B = AbstractC43594JPz.A0B(A00, interfaceC16530ry, c0yrArr, 516);
            if (A0B < 3) {
                C23031Ai A002 = AbstractC23021Ah.A00(userSession);
                int i = A0B + 1;
                A002.A0b.Egi(A002, Integer.valueOf(i), c0yrArr[516]);
                c05a = nkk.A09;
                C51735MtI c51735MtI2 = (C51735MtI) c05a.getValue();
                c51735MtI = new C51735MtI(c51735MtI2.A01, c51735MtI2.A03, c51735MtI2.A02, 0, c51735MtI2.A05, c51735MtI2.A04, true);
            } else {
                c05a = nkk.A09;
                C51735MtI c51735MtI3 = (C51735MtI) c05a.getValue();
                c51735MtI = new C51735MtI(c51735MtI3.A01, c51735MtI3.A03, c51735MtI3.A02, 0, c51735MtI3.A05, c51735MtI3.A04, false);
            }
            c05a.Egh(c51735MtI);
        }
        AbstractC59962oe abstractC59962oe = this.A01;
        abstractC59962oe.requireActivity().getOnBackPressedDispatcher().A06(new C44439Jl3(this, 3), abstractC59962oe.getViewLifecycleOwner());
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        AbstractC166987dD.A1Z(C57173PZr.A02(viewLifecycleOwner, c07s, this, null, 27), C07Y.A00(viewLifecycleOwner));
    }

    public P1C(AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC58310Pt2 interfaceC58310Pt2, InterfaceC58190Pqw interfaceC58190Pqw, NKK nkk, boolean z) {
        AbstractC25234BEr.A1P(abstractC59962oe, userSession, interfaceC58310Pt2);
        AbstractC167017dG.A1T(nkk, interfaceC58190Pqw);
        this.A01 = abstractC59962oe;
        this.A07 = userSession;
        this.A08 = z;
        this.A02 = interfaceC58310Pt2;
        this.A04 = nkk;
        this.A03 = interfaceC58190Pqw;
        this.A06 = C81X.A0i;
        this.A05 = EnumC53380NjV.A0A;
    }
}
