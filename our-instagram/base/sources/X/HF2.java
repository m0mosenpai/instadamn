package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.api.schemas.ProductDiscountInformationDict;

/* loaded from: classes7.dex */
public final class HF2 extends AbstractC65632xz {
    public final ID3 A00;
    public final boolean A01;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC167007dF.A1K(anonymousClass306, obj);
        anonymousClass306.A7b(0, obj, 0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public HF2(ID3 id3, boolean z) {
        this.A01 = z;
        this.A00 = id3;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(536248320);
        AbstractC167017dG.A1P(view, obj);
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.discounts.DiscountsViewBinder.Holder");
        C41067IGk c41067IGk = (C41067IGk) tag;
        ProductDiscountInformationDict productDiscountInformationDict = (ProductDiscountInformationDict) obj;
        boolean z = this.A01;
        ID3 id3 = this.A00;
        C14360o3.A0B(c41067IGk, 0);
        AbstractC167017dG.A1Q(productDiscountInformationDict, id3);
        AbstractC37302Gc3.A06(c41067IGk.A02).setText(productDiscountInformationDict.getName());
        InterfaceC09390do interfaceC09390do = c41067IGk.A00;
        AbstractC37302Gc3.A06(interfaceC09390do).setText(productDiscountInformationDict.getDescription());
        if (z) {
            InterfaceC09390do interfaceC09390do2 = c41067IGk.A01;
            AbstractC37302Gc3.A06(interfaceC09390do2).setText(productDiscountInformationDict.getCtaText());
            ViewOnClickListenerC42034Ik3.A00(AbstractC167007dF.A0L(interfaceC09390do2), 70, id3, productDiscountInformationDict);
            AbstractC167017dG.A1W(interfaceC09390do2, 0);
        } else {
            AbstractC13880nE.A0U(AbstractC167007dF.A0L(interfaceC09390do), AbstractC166997dE.A05(AbstractC167007dF.A0L(interfaceC09390do).getResources()));
            AbstractC167007dF.A0L(c41067IGk.A01).setVisibility(8);
        }
        C0f9.A0A(626073807, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 1608836953);
        View A0C = AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.discounts_details_layout, false);
        A0C.setTag(new C41067IGk(A0C));
        C0f9.A0A(1492457914, A0G);
        return A0C;
    }
}
