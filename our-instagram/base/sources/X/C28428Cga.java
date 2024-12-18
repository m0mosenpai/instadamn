package X;

import android.view.View;
import androidx.compose.foundation.layout.WindowInsets;
import com.facebook.R;
import java.util.WeakHashMap;

/* renamed from: X.Cga, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28428Cga {
    public static final CTN A0N = new Object();
    public static final WeakHashMap A0O = new WeakHashMap();
    public int A00;
    public final C28746Cme A01;
    public final C28746Cme A02;
    public final C28746Cme A03;
    public final C28746Cme A04;
    public final C28746Cme A05;
    public final RunnableC202138wt A06;
    public final C28745Cmd A07;
    public final C28745Cmd A08;
    public final C28745Cmd A09;
    public final WindowInsets A0A;
    public final boolean A0B;
    public final C28746Cme A0C = new C28746Cme(4, "captionBar");
    public final C28746Cme A0D;
    public final C28746Cme A0E;
    public final C28746Cme A0F;
    public final C28745Cmd A0G;
    public final C28745Cmd A0H;
    public final C28745Cmd A0I;
    public final C28745Cmd A0J;
    public final C28745Cmd A0K;
    public final WindowInsets A0L;
    public final WindowInsets A0M;

    public final void A02(C011504d c011504d) {
        this.A0C.A00(c011504d);
        this.A02.A00(c011504d);
        this.A01.A00(c011504d);
        this.A03.A00(c011504d);
        this.A04.A00(c011504d);
        this.A05.A00(c011504d);
        this.A0E.A00(c011504d);
        this.A0F.A00(c011504d);
        this.A0D.A00(c011504d);
        C28745Cmd c28745Cmd = this.A0G;
        C011304b c011304b = c011504d.A00;
        A01(c28745Cmd, c011304b, 4);
        A01(this.A08, c011304b, 2);
        A01(this.A09, c011304b, 1);
        A01(this.A0I, c011304b, 7);
        A01(this.A0J, c011304b, 64);
        C007402o A07 = c011304b.A07();
        if (A07 != null) {
            C02I A00 = A07.A00();
            C28745Cmd c28745Cmd2 = this.A0K;
            c28745Cmd2.A00.Egh(AbstractC28287CdZ.A00(A00));
        }
        C3Z5.A05();
    }

    public final void A03(C011504d c011504d) {
        C28745Cmd c28745Cmd = this.A0H;
        c28745Cmd.A00.Egh(AbstractC28287CdZ.A00(c011504d.A00.A05(8)));
    }

    public C28428Cga(View view) {
        boolean z;
        Boolean bool;
        View view2;
        C28746Cme c28746Cme = new C28746Cme(128, "displayCutout");
        this.A01 = c28746Cme;
        C28746Cme c28746Cme2 = new C28746Cme(8, "ime");
        this.A02 = c28746Cme2;
        C28746Cme c28746Cme3 = new C28746Cme(32, "mandatorySystemGestures");
        this.A0D = c28746Cme3;
        this.A03 = new C28746Cme(2, "navigationBars");
        this.A04 = new C28746Cme(1, "statusBars");
        C28746Cme c28746Cme4 = new C28746Cme(7, "systemBars");
        this.A05 = c28746Cme4;
        C28746Cme c28746Cme5 = new C28746Cme(16, "systemGestures");
        this.A0E = c28746Cme5;
        C28746Cme c28746Cme6 = new C28746Cme(64, "tappableElement");
        this.A0F = c28746Cme6;
        C02I c02i = C02I.A04;
        C28745Cmd A00 = A00(c02i, "waterfall");
        this.A0K = A00;
        C28744Cmc c28744Cmc = new C28744Cmc(new C28744Cmc(c28746Cme4, c28746Cme2), c28746Cme);
        this.A0A = c28744Cmc;
        C28744Cmc c28744Cmc2 = new C28744Cmc(new C28744Cmc(new C28744Cmc(c28746Cme6, c28746Cme3), c28746Cme5), A00);
        this.A0M = c28744Cmc2;
        this.A0L = new C28744Cmc(c28744Cmc, c28744Cmc2);
        this.A0G = A00(c02i, "captionBarIgnoringVisibility");
        this.A08 = A00(c02i, "navigationBarsIgnoringVisibility");
        this.A09 = A00(c02i, "statusBarsIgnoringVisibility");
        this.A0I = A00(c02i, "systemBarsIgnoringVisibility");
        this.A0J = A00(c02i, "tappableElementIgnoringVisibility");
        this.A07 = A00(c02i, "imeAnimationTarget");
        this.A0H = A00(c02i, "imeAnimationSource");
        Object parent = view.getParent();
        Object obj = null;
        if ((parent instanceof View) && (view2 = (View) parent) != null) {
            obj = view2.getTag(R.id.consume_window_insets_tag);
        }
        if ((obj instanceof Boolean) && (bool = (Boolean) obj) != null) {
            z = bool.booleanValue();
        } else {
            z = true;
        }
        this.A0B = z;
        this.A06 = new RunnableC202138wt(this);
    }

    public static C28745Cmd A00(C02I c02i, String str) {
        return new C28745Cmd(AbstractC28287CdZ.A00(c02i), str);
    }

    public static void A01(C28745Cmd c28745Cmd, C011304b c011304b, int i) {
        c28745Cmd.A00.Egh(AbstractC28287CdZ.A00(c011304b.A06(i)));
    }
}
