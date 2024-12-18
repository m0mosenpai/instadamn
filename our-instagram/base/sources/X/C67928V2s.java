package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.V2s, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67928V2s extends AbstractC65632xz {
    public final Context A00;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return C05F.A00(4).length;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        C69343Vlp c69343Vlp = (C69343Vlp) obj;
        AbstractC167017dG.A1N(anonymousClass306, c69343Vlp);
        anonymousClass306.A7a(c69343Vlp.A00.intValue());
    }

    public C67928V2s(Context context) {
        this.A00 = context;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        View view2;
        int A03 = C0f9.A03(-2073517744);
        int A06 = AbstractC167007dF.A06(1, view, obj);
        int A04 = JQ0.A04(4, i);
        if (A04 != 0) {
            if (A04 != 1) {
                if (A04 != A06) {
                    if (A04 == 3) {
                        Object tag = view.getTag();
                        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.business.promote.binder.PromoteTemplateSelectionScreenTemplateRowViewBinder.Holder");
                        UJG ujg = (UJG) tag;
                        C69343Vlp c69343Vlp = (C69343Vlp) obj;
                        C14360o3.A0B(ujg, 0);
                        C14360o3.A0B(c69343Vlp, 1);
                        TextView textView = ujg.A02;
                        textView.setText(c69343Vlp.A04);
                        textView.setVisibility(0);
                        CharSequence charSequence = c69343Vlp.A05;
                        if (charSequence != null) {
                            TextView textView2 = ujg.A03;
                            textView2.setText(charSequence);
                            textView2.setVisibility(0);
                        }
                        C0fQ.A00(c69343Vlp.A01, ujg.A00);
                        view2 = ujg.A01;
                    } else {
                        RuntimeException runtimeException = new RuntimeException();
                        C0f9.A0A(-1522822216, A03);
                        throw runtimeException;
                    }
                } else {
                    Object tag2 = view.getTag();
                    C14360o3.A0C(tag2, "null cannot be cast to non-null type com.instagram.business.promote.binder.PromoteTemplateSelectionScreenThumbnailRowViewBinder.Holder");
                    UJH ujh = (UJH) tag2;
                    C69343Vlp c69343Vlp2 = (C69343Vlp) obj;
                    C14360o3.A0B(ujh, 0);
                    C14360o3.A0B(c69343Vlp2, 1);
                    ujh.A02.setText(c69343Vlp2.A04);
                    CharSequence charSequence2 = c69343Vlp2.A05;
                    if (charSequence2 != null) {
                        TextView textView3 = ujh.A01;
                        textView3.setVisibility(0);
                        textView3.setText(charSequence2);
                    }
                    RoundedCornerImageView roundedCornerImageView = ujh.A03;
                    ImageUrl imageUrl = c69343Vlp2.A03;
                    if (imageUrl != null) {
                        roundedCornerImageView.setUrl(imageUrl, c69343Vlp2.A02);
                        C0fQ.A00(c69343Vlp2.A01, ujh.A00);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            } else {
                Object tag3 = view.getTag();
                C14360o3.A0C(tag3, "null cannot be cast to non-null type com.instagram.business.promote.binder.PromoteTemplateSelectionScreenDescriptionRowViewBinder.Holder");
                UIU uiu = (UIU) tag3;
                C69343Vlp c69343Vlp3 = (C69343Vlp) obj;
                C14360o3.A0B(uiu, 0);
                C14360o3.A0B(c69343Vlp3, 1);
                TextView textView4 = uiu.A00;
                textView4.setText(c69343Vlp3.A04);
                view2 = textView4;
            }
            view2.setVisibility(0);
        } else {
            Object tag4 = view.getTag();
            C14360o3.A0C(tag4, "null cannot be cast to non-null type com.instagram.business.promote.binder.PromoteTemplateSelectionScreenHeaderRowViewBinder.Holder");
            UIV uiv = (UIV) tag4;
            C69343Vlp c69343Vlp4 = (C69343Vlp) obj;
            C14360o3.A0B(uiv, 0);
            C14360o3.A0B(c69343Vlp4, 1);
            TextView textView5 = uiv.A00;
            textView5.setText(c69343Vlp4.A04);
            textView5.setVisibility(0);
            if (c69343Vlp4.A00 == C05F.A00) {
                textView5.setTypeface(null, 1);
            }
        }
        C0f9.A0A(1538260973, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        Object uiv;
        int A03 = C0f9.A03(1818130572);
        C14360o3.A0B(viewGroup, 1);
        int A04 = JQ0.A04(4, i);
        if (A04 != 0) {
            if (A04 != 1) {
                if (A04 != 2) {
                    if (A04 == 3) {
                        viewGroup2 = (ViewGroup) AbstractC31175DnJ.A07(AbstractC31172DnG.A09(this.A00), viewGroup, R.layout.promote_row_with_chevron, false);
                        uiv = new UJG(viewGroup2);
                    } else {
                        RuntimeException runtimeException = new RuntimeException();
                        C0f9.A0A(-1443349362, A03);
                        throw runtimeException;
                    }
                } else {
                    viewGroup2 = (ViewGroup) AbstractC31175DnJ.A07(AbstractC31172DnG.A09(this.A00), viewGroup, R.layout.promote_preview_thumbnail_text_row, false);
                    uiv = new UJH(viewGroup2);
                }
            } else {
                viewGroup2 = (ViewGroup) AbstractC31175DnJ.A07(AbstractC31172DnG.A09(this.A00), viewGroup, R.layout.promote_preview_description_row, false);
                uiv = new UIU(viewGroup2);
            }
        } else {
            viewGroup2 = (ViewGroup) AbstractC31175DnJ.A07(AbstractC31172DnG.A09(this.A00), viewGroup, R.layout.promote_preview_header_row, false);
            uiv = new UIV(viewGroup2);
        }
        viewGroup2.setTag(uiv);
        C0f9.A0A(872195921, A03);
        return viewGroup2;
    }
}
