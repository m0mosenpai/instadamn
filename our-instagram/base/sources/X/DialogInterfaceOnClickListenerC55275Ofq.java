package X;

import android.content.DialogInterface;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.Ofq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class DialogInterfaceOnClickListenerC55275Ofq implements DialogInterface.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;

    public DialogInterfaceOnClickListenerC55275Ofq(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Integer num;
        Integer num2;
        AbstractC187378Sf A0M;
        C183558Ce c183558Ce;
        switch (this.A00) {
            case 0:
                C50868Mdz c50868Mdz = ((NI5) this.A02).A0K;
                int i2 = this.A01;
                ClipsCreationViewModel clipsCreationViewModel = c50868Mdz.A0E;
                C58252li c58252li = clipsCreationViewModel.A0G;
                C84B A0W = MSW.A0W(c58252li);
                if (A0W != null) {
                    num = Integer.valueOf(A0W.A01(i2));
                } else {
                    num = null;
                }
                C84B A0W2 = MSW.A0W(c58252li);
                if (A0W2 != null) {
                    num2 = Integer.valueOf(A0W2.A00(i2));
                } else {
                    num2 = null;
                }
                C141796aw A00 = AbstractC141776au.A00(c50868Mdz);
                MCA mca = new MCA(c50868Mdz, num, num2, null, i2, 4);
                AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
                AbstractC23641Du.A05(anonymousClass191, mca, A00);
                C84B A0W3 = MSW.A0W(c58252li);
                if (A0W3 != null) {
                    boolean A1P = AbstractC167007dF.A1P(MSW.A06(A0W3), 1);
                    C187358Sd c187358Sd = c50868Mdz.A0F;
                    if (c187358Sd.A0E() instanceof C187508Ss) {
                        A0M = new C187508Ss(false);
                    } else {
                        A0M = MSX.A0M();
                    }
                    c187358Sd.A0G(A0M);
                    clipsCreationViewModel.A0U(i2, true);
                    if (A1P && (c183558Ce = clipsCreationViewModel.A02) != null) {
                        c183558Ce.A00.A0G.A04.A00();
                    }
                }
                C448124l A0S = MSW.A0S(c50868Mdz.A0C);
                C25531Mh A08 = C25531Mh.A08(A0S.A02);
                if (AbstractC25226BEj.A1Z(A08)) {
                    A08.A0s("IG_CAMERA_CLIPS_SEGMENT_DELETED");
                    MSZ.A1H(A08, A0S, "CLIPS_SEGMENT_DELETED");
                    A08.A0Q("capture_format_index", AbstractC167007dF.A0d());
                    AbstractC167007dF.A14(A08, A0S.A04);
                    AbstractC50524MSc.A0G(A08, i2);
                    MSY.A19(A08, A0S);
                    AbstractC167017dG.A1D(A08);
                }
                AbstractC23641Du.A05(anonymousClass191, new MCA(c50868Mdz, num, num2, null, i2, 5), AbstractC141776au.A00(c50868Mdz));
                return;
            case 1:
                NI5 ni5 = (NI5) this.A02;
                if (ni5.A0M()) {
                    return;
                }
                MSX.A1L(ni5.A0J, this.A01);
                return;
            case 2:
                C56045OuH c56045OuH = (C56045OuH) this.A02;
                C50866Mdx c50866Mdx = c56045OuH.A03;
                C57249PbX c57249PbX = new C57249PbX(this.A01, 21, c56045OuH);
                O1O o1o = c50866Mdx.A00;
                if (o1o != null) {
                    InterfaceC58099PpO interfaceC58099PpO = (InterfaceC58099PpO) c50866Mdx.A02.A02.get(o1o);
                    if (interfaceC58099PpO != null) {
                        interfaceC58099PpO.cancelDetection();
                    }
                    C22C A01 = AnonymousClass229.A01(c50866Mdx.A04);
                    C22M c22m = ((C22F) A01).A04;
                    A01.A09.A0R(null, c22m.A0A, null, c22m.A0C, C81X.A1Z, null, null, null, "TIMELINE_MAGIC_CUT_CANCEL_TAP", null, null, null, true, false);
                    return;
                }
                c57249PbX.invoke();
                return;
            default:
                C54432O3m c54432O3m = (C54432O3m) ((N86) ((C26871BtY) this.A02).A09.getValue()).A03.A01.getValue();
                int i3 = this.A01;
                N81 n81 = c54432O3m.A00;
                C57155PYz.A00(n81, n81.A03(), i3, 26);
                return;
        }
    }
}
