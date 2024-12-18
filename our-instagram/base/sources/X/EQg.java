package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.banner.IgdsBanner;

/* loaded from: classes6.dex */
public final class EQg extends AbstractC65632xz {
    public final Context A00;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public EQg(Context context) {
        this.A00 = context;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-233635277);
        C34468FHg c34468FHg = (C34468FHg) AbstractC31172DnG.A0x(view);
        IgdsBanner igdsBanner = c34468FHg.A00;
        igdsBanner.setBody(2131956310);
        igdsBanner.setAction(2131956309);
        igdsBanner.setIcon(R.drawable.instagram_collaborate_pano_outline_24);
        igdsBanner.setDismissible(true);
        igdsBanner.A02.setVisibility(0);
        igdsBanner.A01.setVisibility(8);
        igdsBanner.setOnClickListener(null);
        igdsBanner.A00 = new C36498G7w(2, c34468FHg, obj);
        C0f9.A0A(-1611154849, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-1571748927);
        IgdsBanner igdsBanner = (IgdsBanner) AbstractC31172DnG.A0A(LayoutInflater.from(this.A00), viewGroup, R.layout.layout_tag_list_footer_banner);
        igdsBanner.setTag(new C34468FHg(igdsBanner));
        C0f9.A0A(-633027529, A03);
        return igdsBanner;
    }
}
