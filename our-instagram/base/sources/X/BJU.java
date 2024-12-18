package X;

import android.content.Context;
import android.text.Spanned;
import android.view.View;

/* loaded from: classes5.dex */
public final class BJU implements InterfaceC77833eB {
    public final C6FG A00;

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ Object ADU(Context context, Object obj, Object obj2, Object obj3) {
        Spanned spanned;
        View view = (View) obj;
        if (obj3 instanceof C6BM) {
            C6BM c6bm = (C6BM) obj3;
            C6FG c6fg = this.A00;
            AbstractC167017dG.A1P(c6bm, view);
            CharSequence charSequence = c6bm.A04;
            if ((charSequence instanceof Spanned) && (spanned = (Spanned) charSequence) != null && c6fg.A02.AgS().BGp() != null) {
                Object[] spans = spanned.getSpans(0, spanned.length(), C131815xH.class);
                C14360o3.A07(spans);
                for (Object obj4 : spans) {
                    C131815xH c131815xH = (C131815xH) obj4;
                    C6FG c6fg2 = c131815xH.A05;
                    C102884kP c102884kP = c131815xH.A06;
                    InterfaceC59172nI A00 = C6BY.A00(C6BR.A00(c6fg2, c102884kP), null);
                    C27771Wf A02 = C6BR.A02(c6fg2, c102884kP);
                    C14360o3.A0B(c102884kP, 0);
                    MEB meb = new MEB(1, "BloksRichTextImageSpan", C131815xH.A07, c131815xH, C59232nO.A01().A02(c131815xH.A02, A02, A00, c102884kP.A0S(74, false)), C6BR.A01(c6fg2, c102884kP));
                    c131815xH.A01 = meb;
                    meb.invoke();
                    c131815xH.A00 = view;
                }
            }
        }
        return null;
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        Spanned spanned;
        View view = (View) obj;
        if (obj3 instanceof C6BM) {
            C6BM c6bm = (C6BM) obj3;
            view.setContentDescription(null);
            C6FG c6fg = this.A00;
            C14360o3.A0B(c6bm, 1);
            CharSequence charSequence = c6bm.A04;
            if ((charSequence instanceof Spanned) && (spanned = (Spanned) charSequence) != null && c6fg.A02.AgS().BGp() != null) {
                Object[] spans = spanned.getSpans(0, spanned.length(), C131815xH.class);
                C14360o3.A07(spans);
                for (Object obj5 : spans) {
                    C131815xH c131815xH = (C131815xH) obj5;
                    c131815xH.A00 = null;
                    C59232nO.A00().EEL(c131815xH.A03);
                }
            }
        }
    }

    public BJU(C6FG c6fg) {
        this.A00 = c6fg;
    }

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ Class CBk() {
        return getClass();
    }

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ String getDescription() {
        return AbstractC25228BEl.A1B(this);
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ boolean Ek2(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }
}
