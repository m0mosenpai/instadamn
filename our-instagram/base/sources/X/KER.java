package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.api.schemas.StickerTraySectionCTAType;

/* loaded from: classes8.dex */
public final class KER extends AbstractC65632xz {
    public final Context A00;
    public final InterfaceC186108Ne A01;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 2;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        C45127Jxw c45127Jxw = (C45127Jxw) obj;
        boolean A1R = AbstractC167007dF.A1R(0, anonymousClass306, c45127Jxw);
        if (c45127Jxw.A00 != null) {
            anonymousClass306.A7a(A1R ? 1 : 0);
        } else {
            anonymousClass306.A7a(0);
        }
    }

    public KER(Context context, InterfaceC186108Ne interfaceC186108Ne) {
        this.A00 = context;
        this.A01 = interfaceC186108Ne;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-902858661);
        AbstractC167007dF.A1D(view, 1, obj);
        if (i != 0) {
            if (i == 1) {
                Object tag = view.getTag();
                C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.SectionTitleWithCTAViewBinder.Holder");
                C47611L0w c47611L0w = (C47611L0w) tag;
                C45127Jxw c45127Jxw = (C45127Jxw) obj;
                InterfaceC186108Ne interfaceC186108Ne = this.A01;
                AbstractC25230BEn.A15(1, c47611L0w, c45127Jxw);
                c47611L0w.A02.setText(c45127Jxw.A01);
                if (interfaceC186108Ne != null) {
                    C45127Jxw c45127Jxw2 = (C45127Jxw) c45127Jxw.A00;
                    C14360o3.A0A(c45127Jxw2);
                    TextView textView = c47611L0w.A01;
                    textView.setText(c45127Jxw2.A01);
                    ViewOnClickListenerC48066LPr.A00(c47611L0w.A00, 24, c45127Jxw2, interfaceC186108Ne);
                    interfaceC186108Ne.Coa(textView, (StickerTraySectionCTAType) c45127Jxw2.A00);
                }
            } else {
                UnsupportedOperationException A1D = AbstractC166987dD.A1D("Unhandled view type");
                C0f9.A0A(-1292575543, A03);
                throw A1D;
            }
        } else {
            Object tag2 = view.getTag();
            C14360o3.A0C(tag2, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.SectionTitleViewBinder.Holder");
            C47284Kuv c47284Kuv = (C47284Kuv) tag2;
            C45127Jxw c45127Jxw3 = (C45127Jxw) obj;
            AbstractC25230BEn.A15(1, c47284Kuv, c45127Jxw3);
            TextView textView2 = c47284Kuv.A00;
            textView2.setText(c45127Jxw3.A01);
            AbstractC010103p.A0B(textView2, new UEP(c47284Kuv, 11));
        }
        C0f9.A0A(-333270273, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        View inflate;
        Object c47284Kuv;
        int A03 = C0f9.A03(867721477);
        C14360o3.A0B(viewGroup, 1);
        if (i != 0) {
            if (i == 1) {
                inflate = AbstractC31173DnH.A0C(AbstractC31172DnG.A09(this.A00), viewGroup, R.layout.layout_asset_picker_section_title_with_cta, false);
                c47284Kuv = new C47611L0w(inflate);
            } else {
                UnsupportedOperationException A1D = AbstractC166987dD.A1D("Unhandled view type");
                C0f9.A0A(316012470, A03);
                throw A1D;
            }
        } else {
            inflate = AbstractC31172DnG.A09(this.A00).inflate(R.layout.layout_asset_picker_section_title, viewGroup, false);
            C14360o3.A0C(inflate, "null cannot be cast to non-null type android.widget.TextView");
            c47284Kuv = new C47284Kuv((TextView) inflate);
        }
        inflate.setTag(c47284Kuv);
        C0f9.A0A(851976581, A03);
        return inflate;
    }
}
