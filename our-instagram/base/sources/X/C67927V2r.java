package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.V2r, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67927V2r extends AbstractC65632xz {
    public final Context A00;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return C05F.A00(7).length;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        C69342Vlo c69342Vlo = (C69342Vlo) obj;
        AbstractC167017dG.A1N(anonymousClass306, c69342Vlo);
        anonymousClass306.A7a(c69342Vlo.A00.intValue());
    }

    public C67927V2r(Context context) {
        this.A00 = context;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0011. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [boolean, int] */
    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int i2;
        View view2;
        ImageUrl imageUrl;
        int A03 = C0f9.A03(-983867889);
        int A06 = AbstractC167007dF.A06(1, view, obj);
        switch (JQ0.A04(7, i)) {
            case 0:
            case 1:
            case 2:
            case 3:
                Context context = this.A00;
                Object tag = view.getTag();
                C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.business.promote.binder.PromotePaymentRowViewBinder.Holder");
                UJP ujp = (UJP) tag;
                C69342Vlo c69342Vlo = (C69342Vlo) obj;
                C14360o3.A0B(context, 0);
                C14360o3.A0B(ujp, 1);
                C14360o3.A0B(c69342Vlo, A06);
                TextView textView = ujp.A02;
                textView.setText(c69342Vlo.A04);
                textView.setVisibility(0);
                int intValue = c69342Vlo.A00.intValue();
                i2 = 8;
                if (intValue != 3) {
                    if (intValue == A06) {
                        CharSequence charSequence = c69342Vlo.A05;
                        if (charSequence != null) {
                            TextView textView2 = ujp.A03;
                            textView2.setText(charSequence);
                            textView2.setVisibility(0);
                        }
                        InterfaceC11380iw interfaceC11380iw = c69342Vlo.A02;
                        if (interfaceC11380iw != null && (imageUrl = c69342Vlo.A03) != null) {
                            ujp.A04.setUrl(imageUrl, interfaceC11380iw);
                        }
                        ujp.A01.setVisibility(8);
                        ujp.A04.setVisibility(0);
                    }
                    C0f9.A0A(1892198957, A03);
                    return;
                }
                AbstractC166987dD.A1O(context, textView, AbstractC53242c7.A0C(context));
                C0fQ.A00(c69342Vlo.A01, textView);
                view2 = ujp.A01;
                view2.setVisibility(i2);
                C0f9.A0A(1892198957, A03);
                return;
            case 4:
                Object tag2 = view.getTag();
                C14360o3.A0C(tag2, "null cannot be cast to non-null type com.instagram.business.promote.binder.PromotePaymentInlineFooterRowViewBinder.Holder");
                C66444UHu c66444UHu = (C66444UHu) tag2;
                C69342Vlo c69342Vlo2 = (C69342Vlo) obj;
                AbstractC25230BEn.A15(1, c66444UHu, c69342Vlo2);
                AbstractC31176DnK.A1G(c66444UHu.A00, c69342Vlo2.A04);
                C0f9.A0A(1892198957, A03);
                return;
            case 5:
            case 6:
                Object tag3 = view.getTag();
                C14360o3.A0C(tag3, "null cannot be cast to non-null type com.instagram.business.promote.binder.PromoteTaxRowViewBinder.Holder");
                C66473UIx c66473UIx = (C66473UIx) tag3;
                C69342Vlo c69342Vlo3 = (C69342Vlo) obj;
                ?? A1T = AbstractC31175DnJ.A1T(1, c66473UIx, c69342Vlo3);
                TextView textView3 = c66473UIx.A00;
                textView3.setText(c69342Vlo3.A04);
                textView3.setVisibility(A1T);
                if (c69342Vlo3.A00 == C05F.A0j) {
                    textView3.setTypeface(null, 1);
                }
                CharSequence charSequence2 = c69342Vlo3.A05;
                if (charSequence2 != null) {
                    TextView textView4 = c66473UIx.A01;
                    textView4.setText(charSequence2);
                    view2 = textView4;
                    i2 = A1T;
                    view2.setVisibility(i2);
                }
                C0f9.A0A(1892198957, A03);
                return;
            default:
                RuntimeException runtimeException = new RuntimeException();
                C0f9.A0A(911917168, A03);
                throw runtimeException;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        Object ujp;
        ViewGroup viewGroup2;
        int A0G = AbstractC25231BEo.A0G(viewGroup, 818330304);
        switch (JQ0.A04(7, i)) {
            case 0:
            case 1:
            case 2:
            case 3:
                ViewGroup viewGroup3 = (ViewGroup) AbstractC31175DnJ.A07(AbstractC31172DnG.A09(this.A00), viewGroup, R.layout.promote_row_with_chevron, false);
                ujp = new UJP(viewGroup3);
                viewGroup2 = viewGroup3;
                break;
            case 4:
                View inflate = AbstractC31172DnG.A09(this.A00).inflate(R.layout.promote_payment_inline_footer, viewGroup, false);
                C14360o3.A0C(inflate, "null cannot be cast to non-null type com.instagram.common.ui.base.IgTextView");
                IgTextView igTextView = (IgTextView) inflate;
                ujp = new C66444UHu(igTextView);
                viewGroup2 = igTextView;
                break;
            case 5:
            case 6:
                ViewGroup viewGroup4 = (ViewGroup) AbstractC31175DnJ.A07(AbstractC31172DnG.A09(this.A00), viewGroup, R.layout.promote_row_with_subtitle_text, false);
                ujp = new C66473UIx(viewGroup4);
                viewGroup2 = viewGroup4;
                break;
            default:
                RuntimeException runtimeException = new RuntimeException();
                C0f9.A0A(1171396499, A0G);
                throw runtimeException;
        }
        viewGroup2.setTag(ujp);
        C0f9.A0A(1318008119, A0G);
        return viewGroup2;
    }
}
