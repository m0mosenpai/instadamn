package X;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgTextView;
import java.util.regex.Pattern;

/* renamed from: X.6R4, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6R4 extends AbstractC138926Qy {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public IgTextView A04;
    public C6R2 A05;
    public CharSequence A06;
    public boolean A07;
    public boolean A08;
    public C57482kN A09;
    public final IgFrameLayout A0A;
    public final InterfaceC56392iX A0B;
    public final C41181vS A0C;
    public final C41551w4 A0D;
    public final C22956AAa A0E;
    public final C141596ac A0F;
    public final C138866Qr A0G;
    public final InterfaceC145596hI A0H;
    public final C138896Qv A0I;
    public final InterfaceC09390do A0J;
    public final InterfaceC09390do A0K;
    public final double A0L;
    public final UserSession A0M;
    public final C138886Qu A0N;
    public final C138876Qt A0O;
    public final String A0P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C6R4(com.instagram.common.session.UserSession r14, X.InterfaceC56392iX r15, X.C41181vS r16, X.C41551w4 r17, X.C138886Qu r18, X.C141596ac r19, X.C138876Qt r20, X.C138866Qr r21, X.InterfaceC145596hI r22, X.C138896Qv r23) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6R4.<init>(com.instagram.common.session.UserSession, X.2iX, X.1vS, X.1w4, X.6Qu, X.6ac, X.6Qt, X.6Qr, X.6hI, X.6Qv):void");
    }

    private final void A00() {
        SpannableStringBuilder A01;
        boolean z;
        boolean z2;
        String str;
        int i;
        int i2;
        CharSequence charSequence = this.A0P;
        C14360o3.A0C(charSequence, "null cannot be cast to non-null type kotlin.CharSequence");
        if (this.A08) {
            C42805Iwh c42805Iwh = new C42805Iwh(this);
            C57482kN c57482kN = this.A09;
            int i3 = this.A02;
            int intValue = ((Number) this.A0K.getValue()).intValue();
            C22956AAa c22956AAa = this.A0E;
            Boolean bool = c22956AAa.A01;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = true;
            }
            Boolean bool2 = c22956AAa.A02;
            if (bool2 != null) {
                z2 = bool2.booleanValue();
            } else {
                z2 = true;
            }
            C138866Qr c138866Qr = this.A0G;
            C14360o3.A0B(charSequence, 0);
            C14360o3.A0B(c57482kN, 1);
            C139106Rr c139106Rr = new C139106Rr(c42805Iwh);
            if (z) {
                str = c138866Qr.A0K;
            } else {
                str = c138866Qr.A0L;
            }
            SpannableString spannableString = new SpannableString(str);
            String obj = spannableString.toString();
            if (obj != null) {
                i = obj.length();
            } else {
                i = 0;
            }
            spannableString.setSpan(c139106Rr, 0, i, 33);
            if (z2) {
                if (z) {
                    i2 = c138866Qr.A0L.length() + 1;
                } else {
                    i2 = 0;
                }
                int i4 = i;
                if (i < i2) {
                    i4 = i2;
                }
                if (i2 < i4) {
                    spannableString.setSpan(new UnderlineSpan(), i2, i4, 33);
                }
            }
            spannableString.setSpan(new ForegroundColorSpan(AbstractC13950nL.A07(intValue, 0.8f)), 0, i, 33);
            charSequence = C6RY.A04(spannableString, c57482kN, charSequence, i3);
        }
        UserSession userSession = this.A0M;
        boolean A02 = C1P8.A02(userSession);
        int intValue2 = ((Number) this.A0K.getValue()).intValue();
        C138886Qu c138886Qu = this.A0N;
        if (A02) {
            A01 = AbstractC41735Ie7.A01(userSession, c138886Qu, charSequence, intValue2);
        } else {
            A01 = C6RX.A01(userSession, c138886Qu, charSequence, intValue2);
            C14360o3.A0A(A01);
        }
        this.A06 = A01;
    }

    private final void A01() {
        int i;
        String str = this.A0P;
        C57482kN c57482kN = this.A09;
        int A01 = C6RY.A01(c57482kN, str, (int) this.A0L);
        int min = Math.min(A01, this.A0F.A0G);
        this.A02 = min;
        if (A01 > min) {
            this.A08 = true;
        }
        super.A03 = C6RY.A03(c57482kN, str, min);
        super.A01 = C6RY.A02(c57482kN, str, this.A02);
        Float f = this.A0E.A05;
        if (f != null) {
            float floatValue = f.floatValue();
            C138866Qr c138866Qr = this.A0G;
            i = (int) (((c138866Qr.A0E * floatValue) - (A04() / 2)) - (c138866Qr.A0I / 2));
        } else {
            i = -1;
        }
        this.A05 = new C6R2(A06(), A04(), 0, i, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        if (r11 <= r9) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A08() {
        /*
            r15 = this;
            X.2iX r8 = r15.A0B
            int r0 = r8.CGb()
            r7 = 8
            if (r0 == r7) goto L8c
            X.6ac r6 = r15.A0F
            float r4 = r6.A07
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r10 = 0
            r5 = 1
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L8c
            float r9 = r6.A06
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 == 0) goto L8c
            X.6R2 r1 = r15.A05
            int r0 = r1.A03
            float r11 = (float) r0
            r15.A01 = r11
            int r0 = r1.A00
            float r3 = (float) r0
            float r12 = r11 + r3
            X.6Qr r2 = r15.A0G
            int r0 = r2.A0I
            float r1 = (float) r0
            float r12 = r12 + r1
            r15.A00 = r12
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r0 >= 0) goto L35
            r10 = 1
        L35:
            r15.A07 = r10
            r14 = r11
            r0 = r9
            if (r10 == 0) goto L3d
            r14 = r4
            r0 = r12
        L3d:
            float r14 = r14 - r0
            int r0 = r2.A03
            float r13 = (float) r0
            int r0 = r2.A02
            float r0 = (float) r0
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 > 0) goto L57
            int r0 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r0 > 0) goto L57
            if (r10 == 0) goto L4f
            r11 = r12
        L4f:
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 > 0) goto L66
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 > 0) goto L66
        L57:
            int r0 = r2.A04
            float r0 = (float) r0
            if (r10 == 0) goto L97
            float r4 = r4 - r0
            float r4 = r4 - r1
            float r4 = r4 - r3
        L5f:
            android.view.View r0 = r8.getView()
            r0.setTranslationY(r4)
        L66:
            boolean r0 = r15.A07
            if (r0 == 0) goto L8d
            float r0 = r15.A01
            double r3 = (double) r0
            int r0 = r2.A0E
            double r1 = (double) r0
            r9 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            double r1 = r1 * r9
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L8c
        L7a:
            int r0 = r15.A02
            if (r0 <= r5) goto L9a
            r6.A0G = r5
            r15.A01()
            r15.A00()
            r15.A09()
            r15.A08()
        L8c:
            return
        L8d:
            float r1 = r15.A00
            int r0 = r2.A0E
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L8c
            goto L7a
        L97:
            float r4 = r9 + r0
            goto L5f
        L9a:
            r8.setVisibility(r7)
            com.instagram.common.ui.base.IgTextView r0 = r15.A04
            r0.setVisibility(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6R4.A08():void");
    }

    public final void A09() {
        int i;
        if (this.A05.A03 == -1) {
            this.A0B.setVisibility(8);
            this.A04.setVisibility(8);
            return;
        }
        InterfaceC56392iX interfaceC56392iX = this.A0B;
        interfaceC56392iX.setVisibility(0);
        IgTextView igTextView = this.A04;
        igTextView.setVisibility(0);
        if (!this.A08) {
            igTextView.setTextAlignment(4);
        }
        igTextView.setMaxLines(this.A02);
        igTextView.setText(this.A06);
        igTextView.setTextColor(((Number) this.A0K.getValue()).intValue());
        Drawable background = interfaceC56392iX.getView().getBackground();
        InterfaceC09390do interfaceC09390do = this.A0J;
        background.setTint(((Number) interfaceC09390do.getValue()).intValue());
        interfaceC56392iX.getView().setBackground(background);
        interfaceC56392iX.getView().setTranslationY(this.A05.A03);
        C138896Qv c138896Qv = this.A0I;
        c138896Qv.A01("caption_showed", String.valueOf(!this.A05.A04));
        C6R2 c6r2 = this.A05;
        if (c6r2.A04) {
            return;
        }
        c138896Qv.A00("caption_width", c6r2.A01);
        c138896Qv.A00("caption_height", this.A05.A00);
        c138896Qv.A00("caption_position_start_x", this.A05.A02);
        c138896Qv.A00("caption_position_start_y", this.A05.A03);
        String obj = this.A06.toString();
        c138896Qv.A01("short_caption_text", obj);
        c138896Qv.A01("is_caption_fully_displayed", String.valueOf(!this.A08));
        c138896Qv.A01("caption_num_hashtags_showed", String.valueOf(AbstractC85433rY.A03(obj).size()));
        Integer num = null;
        c138896Qv.A01("caption_num_mentions_showed", String.valueOf(AbstractC85433rY.A05(obj, false).size()));
        Pattern pattern = AbstractC13670mt.A00;
        if (obj != null) {
            i = obj.length();
        } else {
            i = 0;
        }
        c138896Qv.A01("caption_num_char_showed", String.valueOf(i));
        c138896Qv.A01("caption_num_lines_showed", String.valueOf(this.A02));
        C38321qM c38321qM = this.A0C.A0b;
        if (c38321qM != null) {
            num = Integer.valueOf(c38321qM.A0o());
        }
        c138896Qv.A01("caption_num_char_total", String.valueOf(num));
        c138896Qv.A01("caption_text_color", AbstractC13950nL.A0F(igTextView.getCurrentTextColor()));
        c138896Qv.A01("caption_background_color", AbstractC13950nL.A0F(((Number) interfaceC09390do.getValue()).intValue()));
        c138896Qv.A00("caption_font_size", (int) igTextView.getTextSize());
        c138896Qv.A00("caption_line_height", igTextView.getLineHeight());
        c138896Qv.A01("is_systematic_caption", "true");
    }
}
