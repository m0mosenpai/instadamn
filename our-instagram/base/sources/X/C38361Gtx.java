package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.shopping.ProductVariantDimension;

/* renamed from: X.Gtx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38361Gtx extends C2UU {
    public ProductVariantDimension A01;
    public JGT A02;
    public boolean A03;
    public boolean A04;
    public ImageUrl[] A05;
    public final InterfaceC11380iw A08;
    public String[] A06 = new String[0];
    public boolean[] A07 = new boolean[0];
    public int A00 = -1;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C38502GwN(AbstractC25227BEk.A0D(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.thumbnail_image_selector_item, false), this.A03);
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        C38294Gsd c38294Gsd;
        C38502GwN c38502GwN = (C38502GwN) c3oo;
        C14360o3.A0B(c38502GwN, 0);
        ImageUrl[] imageUrlArr = this.A05;
        if (imageUrlArr != null && this.A01 != null && this.A02 != null) {
            View view = c38502GwN.A01;
            Context context = view.getContext();
            ImageUrl imageUrl = imageUrlArr[i];
            if (imageUrl != null) {
                c38502GwN.A05.setUrl(imageUrl, this.A08);
            }
            boolean z = this.A07[i];
            float f = 0.5f;
            if (z) {
                f = 1.0f;
            }
            if (z) {
                c38294Gsd = null;
            } else {
                c38294Gsd = c38502GwN.A00;
                if (c38294Gsd == null) {
                    if (context != null) {
                        c38294Gsd = new C38294Gsd(context);
                    } else {
                        c38294Gsd = null;
                    }
                    c38502GwN.A00 = c38294Gsd;
                    if (c38294Gsd != null) {
                        c38294Gsd.A00 = R.dimen.abc_action_bar_elevation_material;
                    }
                }
            }
            c38502GwN.A03.setForeground(c38294Gsd);
            c38502GwN.A05.setAlpha(f);
            boolean z2 = false;
            c38502GwN.A07.A03(AbstractC31175DnJ.A01(this.A07[i] ? 1 : 0));
            c38502GwN.A06.A03(AbstractC31175DnJ.A01(this.A07[i] ? 1 : 0));
            if (this.A00 == i) {
                SpannableStringBuilder A0H = AbstractC25225BEi.A0H(this.A06[i]);
                AbstractC37302Gc3.A0q(A0H, new C138566Pm(), 0);
                c38502GwN.A04.setText(A0H);
                c38502GwN.A02.setVisibility(0);
            } else {
                c38502GwN.A04.setText(this.A06[i]);
                c38502GwN.A02.setVisibility(8);
            }
            if (this.A00 == i) {
                z2 = true;
            }
            view.setSelected(z2);
            if (!this.A07[i] && this.A04) {
                view.setOnClickListener(null);
                return;
            }
            ProductVariantDimension productVariantDimension = this.A01;
            if (productVariantDimension == null) {
                return;
            }
            ViewOnClickListenerC42028Ijx.A00(view, productVariantDimension, this, i, 5);
        }
    }

    public C38361Gtx(InterfaceC11380iw interfaceC11380iw) {
        this.A08 = interfaceC11380iw;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int i;
        int A03 = C0f9.A03(703008872);
        String[] strArr = this.A06;
        if (strArr != null) {
            i = strArr.length;
        } else {
            i = 0;
        }
        C0f9.A0A(-676319233, A03);
        return i;
    }
}
