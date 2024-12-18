package X;

import android.widget.SeekBar;
import com.facebook.commonavatarliveediting.CommonSparkAvatarPreviewController;
import com.facebook.fbavatar.cdsavatareditor.liveediting.ig.FoaLiveEditingProvider;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.OlQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55532OlQ implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ C52240NAe A00;
    public final /* synthetic */ C6FG A01;
    public final /* synthetic */ C102884kP A02;
    public final /* synthetic */ boolean A03;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        C14360o3.A0B(seekBar, 0);
        C102884kP c102884kP = this.A02;
        float f = 100.0f;
        if (c102884kP.A02(46, 0.0f) > 0.0f) {
            f = 1.0f / c102884kP.A02(46, 0.0f);
        }
        float f2 = i / f;
        C6FG c6fg = this.A01;
        O6Z o6z = (O6Z) AnonymousClass634.A06(c6fg, c102884kP);
        if (o6z != null) {
            o6z.A00 = Float.valueOf(f2);
        }
        InterfaceC103384lE A0B = c102884kP.A0B(48);
        if (A0B != null) {
            Object A03 = C6FP.A03(c6fg, c102884kP, C6FW.A01, A0B);
            C14360o3.A0C(A03, AbstractC58317Pt9.A00(1));
            Map map = (Map) A03;
            LinkedHashMap A1I = AbstractC166987dD.A1I();
            Iterator A12 = AbstractC43593JPy.A12(map);
            while (A12.hasNext()) {
                Object next = A12.next();
                Object obj = map.get(next);
                if (obj != null) {
                    InterfaceC103384lE interfaceC103384lE = ((C1344465q) obj).A00;
                    C6FX c6fx = new C6FX();
                    c6fx.A03(Float.valueOf(f2), 0);
                    c6fx.A02(c6fg);
                    A1I.put(next, Float.valueOf(AbstractC43593JPy.A00(C6FP.A03(c6fg, c102884kP, c6fx.A00(), interfaceC103384lE), AbstractC111324zv.A00(38))));
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            O6T o6t = O6T.A01;
            if (o6t == null) {
                o6t = new O6T();
                O6T.A01 = o6t;
            }
            Iterator it = o6t.A00.iterator();
            while (it.hasNext()) {
                FoaLiveEditingProvider foaLiveEditingProvider = ((CommonSparkAvatarPreviewController) it.next()).A00;
                if (foaLiveEditingProvider != null) {
                    C55127Obo c55127Obo = foaLiveEditingProvider.A02;
                    if (c55127Obo == null) {
                        C14360o3.A0F("commonLiveEditingProvider");
                        throw C00O.createAndThrow();
                    }
                    c55127Obo.A0B.A06(AbstractC53674NoP.A00(), A1I);
                }
            }
        }
        InterfaceC103384lE A09 = c102884kP.A09();
        if (A09 != null) {
            C6FX c6fx2 = new C6FX();
            c6fx2.A03(Float.valueOf(f2), 0);
            c6fx2.A02(c6fg);
            C6FP.A03(c6fg, c102884kP, c6fx2.A00(), A09);
        }
        if (this.A03) {
            C52240NAe.A00(seekBar);
        }
    }

    public C55532OlQ(C52240NAe c52240NAe, C6FG c6fg, C102884kP c102884kP, boolean z) {
        this.A02 = c102884kP;
        this.A01 = c6fg;
        this.A00 = c52240NAe;
        this.A03 = z;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        C102884kP c102884kP = this.A02;
        InterfaceC103384lE A0B = c102884kP.A0B(40);
        C6FG c6fg = this.A01;
        if (A0B != null) {
            C6FP.A03(c6fg, c102884kP, AbstractC31179DnN.A0I(c6fg).A00(), A0B);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        C102884kP c102884kP = this.A02;
        AbstractC167007dF.A0J().postDelayed(new PT6(this.A00, this.A01, c102884kP, c102884kP.A0B(38)), 200L);
    }
}
