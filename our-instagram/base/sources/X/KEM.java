package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes8.dex */
public final class KEM extends AbstractC65632xz {
    public final Context A00;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return C05F.A00(4).length;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        C47525Kys c47525Kys = (C47525Kys) obj;
        AbstractC167017dG.A1N(anonymousClass306, c47525Kys);
        anonymousClass306.A7a(c47525Kys.A00.intValue());
    }

    public KEM(Context context) {
        this.A00 = context;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        C47525Kys c47525Kys;
        IgTextView igTextView;
        int A03 = C0f9.A03(1455059213);
        int A06 = AbstractC167007dF.A06(1, view, obj);
        int A04 = JQ0.A04(4, i);
        if (A04 != 0) {
            if (A04 != A06 && A04 != 1) {
                if (A04 == 3) {
                    Object tag = view.getTag();
                    C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.business.promote.binder.PromoteLegalInfoFooterViewBinder.Holder");
                    C47263Kua c47263Kua = (C47263Kua) tag;
                    c47525Kys = (C47525Kys) obj;
                    C14360o3.A0B(c47263Kua, 0);
                    C14360o3.A0B(c47525Kys, 1);
                    igTextView = c47263Kua.A00;
                } else {
                    B4Z A00 = B4Z.A00();
                    C0f9.A0A(-262334219, A03);
                    throw A00;
                }
            } else {
                Object tag2 = view.getTag();
                C14360o3.A0C(tag2, "null cannot be cast to non-null type com.instagram.business.promote.binder.PromoteCenterDisplayBodyViewBinder.Holder");
                C47606L0r c47606L0r = (C47606L0r) tag2;
                c47525Kys = (C47525Kys) obj;
                C14360o3.A0B(c47606L0r, 0);
                C14360o3.A0B(c47525Kys, 1);
                igTextView = c47606L0r.A01;
            }
            AbstractC31176DnK.A1G(igTextView, c47525Kys.A01);
        } else {
            Object tag3 = view.getTag();
            C14360o3.A0C(tag3, "null cannot be cast to non-null type com.instagram.business.promote.binder.PromoteCenterDisplayTitleViewBinder.Holder");
            C47260KuX c47260KuX = (C47260KuX) tag3;
            C47525Kys c47525Kys2 = (C47525Kys) obj;
            C14360o3.A0B(c47260KuX, 0);
            C14360o3.A0B(c47525Kys2, 1);
            c47260KuX.A00.setText(c47525Kys2.A01);
        }
        C0f9.A0A(977834949, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        Object c47260KuX;
        View view;
        int A03 = C0f9.A03(1747124147);
        C14360o3.A0B(viewGroup, 1);
        int A04 = JQ0.A04(4, i);
        if (A04 != 0) {
            if (A04 != 2 && A04 != 1) {
                if (A04 == 3) {
                    IgTextView A0N = JQ0.A0N(AbstractC31172DnG.A09(this.A00), viewGroup, R.layout.promote_recycler_legal_info_footer_view);
                    c47260KuX = new C47263Kua(A0N);
                    view = A0N;
                } else {
                    B4Z A00 = B4Z.A00();
                    C0f9.A0A(-886857435, A03);
                    throw A00;
                }
            } else {
                View A07 = AbstractC31175DnJ.A07(AbstractC31172DnG.A09(this.A00), viewGroup, R.layout.promote_recycler_center_display_body_view, false);
                c47260KuX = new C47606L0r(A07, AbstractC25231BEo.A0d(A07, R.id.dot_text_view), AbstractC25231BEo.A0d(A07, R.id.text_view));
                view = A07;
            }
        } else {
            IgTextView A0N2 = JQ0.A0N(AbstractC31172DnG.A09(this.A00), viewGroup, R.layout.promote_recycler_center_display_title_view);
            c47260KuX = new C47260KuX(A0N2);
            view = A0N2;
        }
        view.setTag(c47260KuX);
        C0f9.A0A(510751137, A03);
        return view;
    }
}
