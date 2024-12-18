package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.creation.capture.quickcapture.sundial.bottomsheet.BottomSheetViewController;
import java.util.List;

/* loaded from: classes9.dex */
public final class OXA {
    public C56274Oyj A00;
    public C56273Oyi A01;
    public C56272Oyh A02;
    public C56271Oyg A03;
    public final Context A04;
    public final UserSession A05;
    public final BottomSheetViewController A06;
    public final C50968Mfb A07;
    public final InterfaceC58112Ppb A08;

    public final void A03(InterfaceC58110PpZ interfaceC58110PpZ, List list, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3) {
        AbstractC167017dG.A1N(list, interfaceC58110PpZ);
        C56274Oyj c56274Oyj = this.A00;
        if (c56274Oyj == null) {
            c56274Oyj = new C56274Oyj(this.A05, new P02(interfaceC58110PpZ, this, list, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3));
            this.A00 = c56274Oyj;
        }
        this.A07.A00 = C05F.A0C;
        BottomSheetViewController bottomSheetViewController = this.A06;
        bottomSheetViewController.A03 = c56274Oyj;
        bottomSheetViewController.A02();
    }

    public final void A04(C49519LuY c49519LuY, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        C14360o3.A0B(c49519LuY, 0);
        C56271Oyg c56271Oyg = this.A03;
        if (c56271Oyg == null) {
            c56271Oyg = new C56271Oyg(new P00(this, interfaceC16820sZ, interfaceC16820sZ2));
            this.A03 = c56271Oyg;
        }
        if (c56271Oyg == null) {
            C14360o3.A0F("audioTrimmerBottomSheetContentController");
            throw C00O.createAndThrow();
        }
        c56271Oyg.A00 = c49519LuY;
        this.A07.A00 = C05F.A00;
        BottomSheetViewController bottomSheetViewController = this.A06;
        bottomSheetViewController.A03 = c56271Oyg;
        bottomSheetViewController.A02();
    }

    public final void A01() {
        AbstractC10360h2 abstractC10360h2;
        C56272Oyh c56272Oyh = this.A02;
        if (c56272Oyh != null && (abstractC10360h2 = c56272Oyh.A00) != null) {
            C14240no c14240no = new C14240no(abstractC10360h2);
            c14240no.A03(c56272Oyh.A01);
            c14240no.A00();
        }
        this.A02 = null;
    }

    public final void A02(InterfaceC58189Pqv interfaceC58189Pqv) {
        String str;
        InterfaceC24731Iq interfaceC24731Iq;
        Object c52454NIy;
        C50968Mfb c50968Mfb = this.A07;
        Integer num = c50968Mfb.A00;
        if (num != null) {
            switch (num.intValue()) {
                case -1:
                case 0:
                case 3:
                case 4:
                case 5:
                    break;
                case 1:
                    interfaceC24731Iq = c50968Mfb.A02;
                    c52454NIy = new NJ1(interfaceC58189Pqv);
                    break;
                case 2:
                    interfaceC24731Iq = c50968Mfb.A02;
                    c52454NIy = new C52454NIy(interfaceC58189Pqv);
                    break;
                default:
                    throw B4Z.A00();
            }
            interfaceC24731Iq.F8s(c52454NIy);
            c50968Mfb.A01 = interfaceC58189Pqv.getTitle();
        }
        BottomSheetViewController bottomSheetViewController = this.A06;
        String A00 = c50968Mfb.A00(this.A04);
        IgTextView igTextView = bottomSheetViewController.bottomSheetBottomTitle;
        if (igTextView != null) {
            TextView.BufferType bufferType = TextView.BufferType.NORMAL;
            igTextView.setText(A00, bufferType);
            IgTextView igTextView2 = bottomSheetViewController.bottomSheetTopTitle;
            if (igTextView2 != null) {
                igTextView2.setText(A00, bufferType);
                return;
            }
            str = "bottomSheetTopTitle";
        } else {
            str = "bottomSheetBottomTitle";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (X.AbstractC43840Ja3.A00(r8) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OXA(android.content.Context r6, android.view.ViewGroup r7, com.instagram.common.session.UserSession r8) {
        /*
            r5 = this;
            X.AbstractC167027dH.A13(r8, r6, r7)
            r5.<init>()
            r5.A05 = r8
            r5.A04 = r6
            X.Mfb r4 = new X.Mfb
            r4.<init>()
            r5.A07 = r4
            X.Oyk r2 = new X.Oyk
            r2.<init>(r5)
            r5.A08 = r2
            boolean r0 = X.C1H6.A03()
            if (r0 != 0) goto L25
            boolean r0 = X.AbstractC43840Ja3.A00(r8)
            r1 = 1
            if (r0 == 0) goto L26
        L25:
            r1 = 0
        L26:
            com.instagram.creation.capture.quickcapture.sundial.bottomsheet.BottomSheetViewController r0 = new com.instagram.creation.capture.quickcapture.sundial.bottomsheet.BottomSheetViewController
            r0.<init>(r6, r7, r2, r1)
            r5.A06 = r0
            X.07X r3 = X.AbstractC55832hO.A00(r7)
            if (r3 == 0) goto L3f
            X.0xP r2 = r4.A03
            r1 = 0
            r0 = 18
            X.PZV r0 = X.PZV.A02(r5, r1, r0)
            X.AbstractC50522MSa.A14(r3, r0, r2)
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OXA.<init>(android.content.Context, android.view.ViewGroup, com.instagram.common.session.UserSession):void");
    }

    public static final void A00(OXA oxa, InterfaceC16820sZ interfaceC16820sZ) {
        interfaceC16820sZ.invoke();
        BottomSheetViewController bottomSheetViewController = oxa.A06;
        InterfaceC58282Psa interfaceC58282Psa = bottomSheetViewController.A03;
        if (interfaceC58282Psa != null) {
            interfaceC58282Psa.D01();
        }
        bottomSheetViewController.A03 = null;
        ViewGroup viewGroup = bottomSheetViewController.bottomSheetContentView;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        } else {
            C14360o3.A0F("bottomSheetContentView");
            throw C00O.createAndThrow();
        }
    }
}
