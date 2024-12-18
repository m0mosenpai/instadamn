package X;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.List;

/* renamed from: X.Bcs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25891Bcs extends C2UU {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final List A02;

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        C14360o3.A0B(c3oo, 0);
        if (c3oo instanceof C25919BdM) {
            C25919BdM c25919BdM = (C25919BdM) c3oo;
            InterfaceC31129DmC interfaceC31129DmC = (InterfaceC31129DmC) this.A02.get(i);
            InterfaceC11380iw interfaceC11380iw = this.A01;
            C14360o3.A0B(interfaceC31129DmC, 0);
            TextView A0e = AbstractC166987dD.A0e(c25919BdM.itemView, R.id.username_text_view);
            TextView A0e2 = AbstractC166987dD.A0e(c25919BdM.itemView, R.id.title_text_view);
            IgImageView igImageView = (IgImageView) c25919BdM.itemView.findViewById(R.id.thumbnail_image);
            Context context = c25919BdM.A00;
            A0e.setText(AbstractC167007dF.A0f(context, interfaceC31129DmC.getUsername(), 2131963245));
            A0e2.setText(interfaceC31129DmC.getTitle());
            if (interfaceC31129DmC.C8B() != null && !C14360o3.A0K(interfaceC31129DmC.C8B(), "")) {
                igImageView.setColorFilter((ColorFilter) null);
                igImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                AbstractC25235BEs.A1I(interfaceC11380iw, igImageView, interfaceC31129DmC.C8B());
            } else {
                igImageView.setColorFilter(AbstractC167007dF.A09(context, R.attr.igds_color_creation_tools_grey_06));
                igImageView.setScaleType(ImageView.ScaleType.CENTER);
                AbstractC166997dE.A19(context, igImageView, R.drawable.instagram_gif_pano_outline_24);
            }
        }
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        Context context = this.A00;
        return new C25919BdM(context, AbstractC25226BEj.A0R(LayoutInflater.from(context), viewGroup, R.layout.giphy_attribution_item, false));
    }

    public C25891Bcs(Context context, InterfaceC11380iw interfaceC11380iw, List list) {
        this.A00 = context;
        this.A02 = list;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1367550389);
        int size = this.A02.size();
        C0f9.A0A(-1852787164, A03);
        return size;
    }
}
