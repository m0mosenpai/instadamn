package X;

import android.text.Layout;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import java.util.List;

/* renamed from: X.6R3, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6R3 extends AbstractC138926Qy {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public C57482kN A05;
    public C6R2 A06;
    public int A07;
    public List A08;
    public boolean A09;
    public boolean A0A;
    public final int A0B;
    public final int A0C;
    public final UserSession A0D;
    public final IgTextView A0E;
    public final InterfaceC56392iX A0F;
    public final InterfaceC56392iX A0G;
    public final C41181vS A0H;
    public final C41551w4 A0I;
    public final C6QX A0J;
    public final C141596ac A0K;
    public final C138876Qt A0L;
    public final C138866Qr A0M;
    public final InterfaceC145596hI A0N;
    public final C138896Qv A0O;
    public final String A0P;
    public final boolean A0Q;
    public final C138886Qu A0R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6R3(UserSession userSession, InterfaceC56392iX interfaceC56392iX, InterfaceC56392iX interfaceC56392iX2, C41181vS c41181vS, C41551w4 c41551w4, C138886Qu c138886Qu, C141596ac c141596ac, C138876Qt c138876Qt, C138866Qr c138866Qr, InterfaceC145596hI interfaceC145596hI, C138896Qv c138896Qv, boolean z) {
        super(c138866Qr, EnumC138936Qz.A02);
        int i;
        int i2;
        int A00;
        int i3;
        int i4;
        C14360o3.A0B(interfaceC56392iX, 1);
        C14360o3.A0B(interfaceC56392iX2, 2);
        C14360o3.A0B(c138866Qr, 3);
        this.A0G = interfaceC56392iX;
        this.A0F = interfaceC56392iX2;
        this.A0M = c138866Qr;
        this.A0L = c138876Qt;
        this.A0I = c41551w4;
        this.A0H = c41181vS;
        this.A0K = c141596ac;
        this.A0D = userSession;
        this.A0R = c138886Qu;
        this.A0O = c138896Qv;
        this.A0N = interfaceC145596hI;
        if (z) {
            i = c138866Qr.A07;
        } else {
            i = super.A02;
        }
        this.A04 = i;
        if (z) {
            i2 = c138866Qr.A07;
        } else {
            i2 = super.A00;
        }
        this.A02 = i2;
        IgTextView igTextView = (IgTextView) interfaceC56392iX.getView();
        this.A0E = igTextView;
        C6QX A0G = c41181vS.A0G();
        if (A0G != null) {
            this.A0J = A0G;
            String str = A0G.A06;
            if (str != null) {
                this.A0P = str;
                C1P8.A02(userSession);
                int A0C = AbstractC13950nL.A0C(A0G.A07, -16777216);
                this.A0C = A0C;
                if (C1P8.A02(userSession)) {
                    A00 = AbstractC41735Ie7.A00(A0G);
                } else {
                    A00 = C6RX.A00(A0G);
                }
                this.A01 = A00;
                if (c41181vS.A15()) {
                    i3 = c138866Qr.A05;
                } else {
                    i3 = (int) (c138866Qr.A0E * 0.2f);
                }
                this.A0B = i3;
                boolean A0h = AbstractC130925vf.A0h(c41181vS);
                this.A06 = C6R2.A05;
                C38321qM c38321qM = c41181vS.A0b;
                c38321qM.getClass();
                this.A0Q = AbstractC41071vF.A0N(userSession, c38321qM);
                C14360o3.A0B(igTextView, 0);
                igTextView.setMovementMethod(C6R6.A00);
                igTextView.setClickable(false);
                igTextView.setLongClickable(false);
                igTextView.setMaxLines(c138876Qt.A02);
                igTextView.setTextAlignment(c138876Qt.A03);
                C6RY.A07(igTextView, c138876Qt.A01);
                C6RY.A06(igTextView, c138876Qt.A00);
                igTextView.setTextColor(A0C);
                if (A0h) {
                    C5FJ c5fj = this.A0J.A00;
                    if (c5fj != null) {
                        C138866Qr c138866Qr2 = this.A0M;
                        float f = c138866Qr2.A0F;
                        Float CHj = c5fj.CHj();
                        if (CHj != null) {
                            super.A03 = (int) (CHj.floatValue() * f);
                            float f2 = c138866Qr2.A0E;
                            Float BDW = c5fj.BDW();
                            if (BDW != null) {
                                super.A01 = (int) (BDW.floatValue() * f2);
                                Float Bzu = c5fj.Bzu();
                                if (Bzu != null) {
                                    int floatValue = (int) (f * Bzu.floatValue());
                                    Float Bzw = c5fj.Bzw();
                                    if (Bzw != null) {
                                        int floatValue2 = (int) (f2 * Bzw.floatValue());
                                        int A06 = A06();
                                        this.A06 = new C6R2(A06, A04(), floatValue, floatValue2, false);
                                        IgTextView igTextView2 = this.A0E;
                                        this.A05 = C6RY.A05(Layout.Alignment.ALIGN_NORMAL, igTextView2, C6RY.A00(igTextView2, A06));
                                        igTextView2.setMaxWidth(A06());
                                        i4 = A04();
                                    } else {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    IgTextView igTextView3 = this.A0E;
                    int A002 = C6RY.A00(igTextView3, A06());
                    this.A05 = C6RY.A05(AbstractC130925vf.A05(this.A0H), igTextView3, A002);
                    if (this.A0Q) {
                        IgTextView igTextView4 = (IgTextView) this.A0F.getView();
                        C138876Qt c138876Qt2 = this.A0L;
                        C14360o3.A0B(igTextView4, 0);
                        C14360o3.A0B(c138876Qt2, 1);
                        C6RY.A07(igTextView4, c138876Qt2.A01);
                        C6RY.A06(igTextView4, 12.0f);
                        igTextView4.setText(2131952223);
                        igTextView4.setTextColor(this.A0C);
                        C57482kN A05 = C6RY.A05(Layout.Alignment.ALIGN_NORMAL, igTextView4, A002);
                        CharSequence text = igTextView4.getText();
                        C14360o3.A07(text);
                        this.A00 = C6RY.A02(A05, text, Integer.MAX_VALUE) + this.A0M.A0G;
                        CharSequence text2 = igTextView4.getText();
                        C14360o3.A07(text2);
                        C6RY.A08(igTextView4, A05, text2, this.A01);
                    }
                    String str2 = this.A0P;
                    C57482kN c57482kN = this.A05;
                    if (c57482kN == null) {
                        C14360o3.A0F("textLayoutParams");
                        throw C00O.createAndThrow();
                    }
                    int A02 = C6RY.A02(c57482kN, str2, igTextView3.getMaxLines());
                    this.A03 = A02;
                    super.A01 = A02 + this.A00;
                    int A04 = A04();
                    i4 = this.A0B;
                    if (A04 <= i4) {
                        return;
                    }
                }
                A01(this, i4);
                return;
            }
            throw new IllegalStateException(AnonymousClass001.A0R("Caption model text should not be null for ad ", this.A0H.A0V(this.A0D)));
        }
        throw new IllegalStateException(AnonymousClass001.A0R("StoryAdCaption model should not be null for ad ", c41181vS.A0V(userSession)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r0 != false) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v57, types: [android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v62, types: [android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.text.SpannableString, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(final X.C6R3 r34) {
        /*
            Method dump skipped, instructions count: 1445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6R3.A00(X.6R3):void");
    }

    public static final void A01(C6R3 c6r3, int i) {
        String str = c6r3.A0P;
        C57482kN c57482kN = c6r3.A05;
        if (c57482kN == null) {
            C14360o3.A0F("textLayoutParams");
            throw C00O.createAndThrow();
        }
        int i2 = c6r3.A00;
        int A01 = C6RY.A01(c57482kN, str, i - i2);
        c6r3.A0E.setMaxLines(A01);
        int A02 = C6RY.A02(c57482kN, str, A01);
        c6r3.A03 = A02;
        ((AbstractC138926Qy) c6r3).A01 = A02 + i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ff, code lost:
    
        if (r8.A09 != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C6R3 r8, X.C6R2 r9) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6R3.A02(X.6R3, X.6R2):void");
    }
}
