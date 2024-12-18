package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.9F0, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9F0 extends C0YY implements InterfaceC16610sE {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2;
        int i3;
        switch (this.A00) {
            case 0:
                C5W3 c5w3 = (C5W3) obj;
                int intValue = ((Number) obj2).intValue();
                int intValue2 = ((Number) obj3).intValue();
                Spannable spannable = (Spannable) this.A02;
                InterfaceC16600sD interfaceC16600sD = (InterfaceC16600sD) this.A01;
                AbstractC119845bi abstractC119845bi = c5w3.A05;
                C5W5 c5w5 = c5w3.A08;
                if (c5w5 == null) {
                    c5w5 = C5W5.A04;
                }
                C122165gC c122165gC = c5w3.A06;
                if (c122165gC != null) {
                    i2 = c122165gC.A00;
                } else {
                    i2 = 0;
                }
                C122165gC c122165gC2 = new C122165gC(i2);
                C122175gD c122175gD = c5w3.A07;
                if (c122175gD != null) {
                    i3 = c122175gD.A00;
                } else {
                    i3 = 1;
                }
                final Typeface typeface = (Typeface) interfaceC16600sD.invoke(abstractC119845bi, c5w5, c122165gC2, new C122175gD(i3));
                spannable.setSpan(new MetricAffectingSpan(typeface) { // from class: X.9HL
                    public final Typeface A00;

                    @Override // android.text.style.CharacterStyle
                    public final void updateDrawState(TextPaint textPaint) {
                        textPaint.setTypeface(this.A00);
                    }

                    @Override // android.text.style.MetricAffectingSpan
                    public final void updateMeasureState(TextPaint textPaint) {
                        textPaint.setTypeface(this.A00);
                    }

                    {
                        this.A00 = typeface;
                    }
                }, intValue, intValue2, 33);
                return C0eB.A00;
            case 1:
                String str = (String) obj;
                C14360o3.A0B(str, 0);
                ((C5yI) this.A01).Drz(str, ((InterfaceC132245y2) this.A02).Bet().A03, (String) obj2, (String) obj3);
                return C0eB.A00;
            case 2:
                C5Tl c5Tl = (C5Tl) obj2;
                if ((((Number) obj3).intValue() & 17) == 16 && c5Tl.Bxj()) {
                    c5Tl.Em9();
                } else {
                    if (C0fH.A02()) {
                        C0fH.A01(-1850775872, "com.instagram.barcelona.feed.post.ui.FeedPostRow.<anonymous> (FeedPostRow.kt:1704)");
                    }
                    InterfaceC132245y2 interfaceC132245y2 = (InterfaceC132245y2) this.A02;
                    C26148BhZ c26148BhZ = (C26148BhZ) interfaceC132245y2;
                    String str2 = c26148BhZ.A02;
                    boolean z = c26148BhZ.A03;
                    c5Tl.Eno(-1659039715);
                    Object obj4 = this.A01;
                    boolean AH4 = c5Tl.AH4(obj4) | c5Tl.AH4(interfaceC132245y2);
                    Object EEc = c5Tl.EEc();
                    if (AH4 || EEc == C5UI.A00) {
                        EEc = new MHW(3, obj4, interfaceC132245y2);
                        c5Tl.FBy(EEc);
                    }
                    C117505Tk.A0L((C117505Tk) c5Tl, false);
                    CEO.A00(c5Tl, null, str2, (InterfaceC16820sZ) EEc, 0, 8, z);
                    if (C0fH.A02()) {
                        C0fH.A00(1509704106);
                    }
                }
                return C0eB.A00;
            case 3:
                C73083Pj c73083Pj = (C73083Pj) obj;
                C75113Zb c75113Zb = (C75113Zb) obj2;
                C905741s c905741s = (C905741s) obj3;
                C14360o3.A0B(c73083Pj, 0);
                C14360o3.A0B(c75113Zb, 1);
                C14360o3.A0B(c905741s, 2);
                ((C101024gI) this.A02).A01.DLg(c73083Pj, c905741s, (C38321qM) this.A01, c75113Zb);
                return C0eB.A00;
            case 4:
                View view = (View) obj;
                InterfaceC60442pS interfaceC60442pS = (InterfaceC60442pS) obj2;
                EnumC71343Hv enumC71343Hv = (EnumC71343Hv) obj3;
                C14360o3.A0B(view, 0);
                C14360o3.A0B(interfaceC60442pS, 1);
                C14360o3.A0B(enumC71343Hv, 2);
                C38321qM c38321qM = (C38321qM) this.A01;
                UserSession userSession = ((C75563aN) this.A02).A00;
                C14360o3.A0B(c38321qM, 0);
                C71313Hs A00 = C71313Hs.A00(userSession);
                A00.A0A(view, new C79623hD(null, userSession, c38321qM, interfaceC60442pS));
                A00.A05(view, enumC71343Hv);
                return C0eB.A00;
            case 5:
                C76293bZ c76293bZ = (C76293bZ) obj;
                C76853cX c76853cX = (C76853cX) obj2;
                C14360o3.A0B(c76293bZ, 0);
                C14360o3.A0B(c76853cX, 1);
                C14360o3.A0B(obj3, 2);
                return Boolean.valueOf(C75563aN.A01((C38321qM) this.A01, (C75563aN) this.A02, c76293bZ, c76853cX));
            case 6:
                C86203sr c86203sr = (C86203sr) obj;
                Activity activity = (Activity) obj2;
                Context context = (Context) obj3;
                C14360o3.A0B(c86203sr, 0);
                C14360o3.A0B(context, 2);
                C86193sq c86193sq = C86193sq.A00;
                ExtendedImageUrl A1q = ((C38321qM) this.A01).A1q(context);
                int A0G = AbstractC53242c7.A0G(context, AbstractC57322k7.A01(((C79293ga) this.A02).A00)) + c86203sr.A00 + C30D.A00;
                if (activity != null) {
                    i = AbstractC56402iY.A01(activity);
                } else {
                    i = 0;
                }
                return c86193sq.A01(context, A1q, A0G + i, 0);
            default:
                String str3 = (String) obj;
                C38620GyN c38620GyN = (C38620GyN) obj2;
                C14360o3.A0B(str3, 0);
                C14360o3.A0B(c38620GyN, 1);
                ((C39D) this.A01).Epd((C38321qM) this.A02, c38620GyN, (C39447HbZ) obj3, str3);
                return C0eB.A00;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9F0(int i, Object obj, Object obj2) {
        super(3);
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }
}
