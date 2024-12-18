package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes7.dex */
public final class HF3 extends AbstractC65632xz {
    public final InterfaceC11380iw A00;
    public final ILC A01;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public HF3(InterfaceC11380iw interfaceC11380iw, ILC ilc) {
        this.A00 = interfaceC11380iw;
        this.A01 = ilc;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A0G = AbstractC25231BEo.A0G(view, 1374547160);
        C14360o3.A0B(obj, 2);
        if (i == 0) {
            IIT iit = (IIT) obj;
            InterfaceC11380iw interfaceC11380iw = this.A00;
            ILC ilc = this.A01;
            C14360o3.A0B(iit, 1);
            AbstractC167007dF.A1E(interfaceC11380iw, 2, ilc);
            Object tag = view.getTag();
            if (tag != null) {
                C41143IJi c41143IJi = (C41143IJi) tag;
                ImageUrl imageUrl = iit.A00;
                C14360o3.A07(imageUrl);
                String str = iit.A03;
                C14360o3.A07(str);
                String str2 = null;
                String str3 = iit.A01;
                c41143IJi.A05.setUrl(imageUrl, interfaceC11380iw);
                c41143IJi.A03.setText(str);
                if (str3 != null && str3.length() != 0) {
                    str2 = str3;
                }
                TextView textView = c41143IJi.A02;
                int i2 = 8;
                if (str2 != null) {
                    i2 = 0;
                }
                textView.setVisibility(i2);
                textView.setText(str2);
                c41143IJi.A00.setVisibility(8);
                c41143IJi.A04.setVisibility(AbstractC31175DnJ.A01(ilc.A00(iit) ? 1 : 0));
                View view2 = c41143IJi.A01;
                float f = 0.3f;
                if (ilc.A00(iit)) {
                    f = 1.0f;
                }
                view2.setAlpha(f);
                ViewOnClickListenerC38053Gog.A03(view2, 4, iit, ilc);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        C0f9.A0A(1856122870, A0G);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 989717910);
        if (i == 0) {
            View A0C = AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.brand_row_layout, false);
            A0C.setTag(new C41143IJi(A0C));
            C0f9.A0A(1823356280, A0G);
            return A0C;
        }
        IllegalStateException A0U = AbstractC31175DnJ.A0U("Unexpected view type: ", i);
        C0f9.A0A(-554187798, A0G);
        throw A0U;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
