package X;

import android.text.InputFilter;
import com.facebookpay.form.cell.logging.FormCellLoggingEvents;
import com.facebookpay.form.cell.text.formatter.TextFormatter;
import com.facebookpay.form.cell.text.util.TextFieldHandler;
import com.fbpay.theme.FBPayIcon;
import com.google.common.collect.ImmutableList;

/* loaded from: classes11.dex */
public class UvM extends AbstractC129435t5 {
    public ImmutableList A00;
    public InterfaceC16660sJ A01;
    public boolean A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final C58252li A06;
    public final C58252li A07;
    public final C2GS A08;
    public final C2GS A09;
    public final C2GS A0A;
    public final C2GS A0B;
    public final C2GS A0C;
    public final C2GS A0D;
    public final C2GS A0E;
    public final C2GS A0F;
    public final InterfaceC58362lv A0G;
    public final InterfaceC58362lv A0H;
    public final TextFormatter A0I;
    public final TextFieldHandler A0J;
    public final FBPayIcon A0K;
    public final Integer A0L;
    public final String A0M;
    public final String A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final int A0R;
    public final boolean A0S;

    public final void A0L() {
        C63167SeR.A00(this.A0D, false);
    }

    public final void A0M(String str) {
        if (str == null) {
            str = "";
        }
        this.A0F.A0B(new C69077VhT(str, true, false));
    }

    public static final InputFilter.LengthFilter A00(UvM uvM) {
        int i;
        C1LC A0I = AbstractC43592JPx.A0I(uvM.A00);
        int i2 = Integer.MAX_VALUE;
        while (A0I.hasNext()) {
            VKA vka = (VKA) A0I.next();
            if (vka instanceof C67665Uvd) {
                i = ((C67665Uvd) vka).A00;
            } else if (vka instanceof Uvc) {
                i = ((Uvc) vka).A00;
            } else {
                i = Integer.MAX_VALUE;
            }
            i2 = Math.min(i2, i);
        }
        C1LC A0I2 = AbstractC43592JPx.A0I(uvM.A00);
        while (A0I2.hasNext()) {
            if (A0I2.next() instanceof Uva) {
                return new InputFilter.LengthFilter(i2);
            }
        }
        return new InputFilter.LengthFilter(i2);
    }

    @Override // X.AbstractC129435t5
    public final void A0D(boolean z) {
        if (z && !A0F()) {
            MSX.A1B(this.A0A, true);
        }
        MSX.A1B(this.A06, !A0F());
    }

    @Override // X.AbstractC129435t5
    public final boolean A0E() {
        CharSequence charSequence = (CharSequence) super.A05.A02();
        if (charSequence != null && charSequence.length() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC129435t5
    public final boolean A0F() {
        if (super.A09 && super.A08) {
            String str = (String) super.A05.A02();
            C1LC A0I = AbstractC43592JPx.A0I(this.A00);
            while (A0I.hasNext()) {
                if (!((VKA) A0I.next()).A01(str)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    @Override // X.AbstractC129435t5
    public final boolean A0H() {
        if (this.A0S) {
            CharSequence charSequence = (CharSequence) super.A05.A02();
            if (charSequence != null && charSequence.length() != 0) {
                return true;
            }
        } else {
            TextFieldHandler textFieldHandler = this.A0J;
            boolean A1W = AbstractC167007dF.A1W(textFieldHandler);
            Object obj = super.A04.get(super.A02);
            if (A1W) {
                C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.String");
                return textFieldHandler.CL3((String) obj, (String) super.A05.A02());
            }
            C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.String");
            if (!C14360o3.A0K(obj, super.A05.A02())) {
                return true;
            }
        }
        return false;
    }

    public final int A0I() {
        String str = (String) super.A05.A02();
        C1LC A0I = AbstractC43592JPx.A0I(this.A00);
        while (A0I.hasNext()) {
            VKA vka = (VKA) A0I.next();
            if (!vka.A01(str)) {
                if (!vka.A01(str)) {
                    return vka.A01;
                }
                return 0;
            }
        }
        return 0;
    }

    public final int A0J() {
        int i;
        String str = (String) super.A05.A02();
        C1LC A0I = AbstractC43592JPx.A0I(this.A00);
        while (A0I.hasNext()) {
            VKA vka = (VKA) A0I.next();
            if (!vka.A01(str)) {
                if (!vka.A01(str)) {
                    return vka.A00;
                }
                return 0;
            }
        }
        if (this.A0O && (i = this.A0R) != 0) {
            return i;
        }
        return 0;
    }

    public final String A0K() {
        String str = (String) super.A05.A02();
        C1LC A0I = AbstractC43592JPx.A0I(this.A00);
        while (A0I.hasNext()) {
            VKA vka = (VKA) A0I.next();
            if (!vka.A01(str)) {
                if (!vka.A01(str)) {
                    return vka.A02;
                }
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.2GT, X.2GS] */
    public UvM(FormCellLoggingEvents formCellLoggingEvents, TextFormatter textFormatter, TextFieldHandler textFieldHandler, FBPayIcon fBPayIcon, ImmutableList immutableList, Integer num, String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        super(formCellLoggingEvents, i, i2, z, z2);
        String str4 = str;
        C14360o3.A0B(num, 12);
        this.A05 = i3;
        this.A0N = str2;
        this.A03 = i4;
        this.A04 = i5;
        this.A0L = num;
        this.A00 = immutableList;
        this.A0J = textFieldHandler;
        this.A0H = new C70302WQh(this, 51);
        this.A0G = new C70302WQh(this, 50);
        C2GS c2gs = new C2GS();
        this.A0B = c2gs;
        this.A0E = new C2GS();
        this.A0A = new C2GS();
        C2GS c2gs2 = new C2GS();
        this.A09 = c2gs2;
        this.A0F = new C2GS();
        this.A06 = new C58252li();
        this.A07 = new C58252li();
        this.A0C = new C2GT(null);
        this.A08 = new C2GS();
        this.A0D = new C2GS();
        C58252li c58252li = super.A05;
        c58252li.A0B(str4);
        super.A04.put(i2, str == null ? "" : str4);
        c2gs2.A0B(A00(this));
        C58252li c58252li2 = this.A06;
        c58252li2.A0E(this.A0E, this.A0H);
        c58252li2.A0E(c58252li, this.A0G);
        this.A0K = fBPayIcon;
        this.A0O = z3;
        this.A0R = i6;
        this.A0P = z4;
        this.A0I = textFormatter;
        if (textFormatter != null) {
            c2gs.A0B(textFormatter);
        }
        this.A0M = str3;
        this.A0Q = z5;
        this.A0S = z6;
    }
}
