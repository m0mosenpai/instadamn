package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.model.venue.Venue;

/* loaded from: classes11.dex */
public final class V5D extends AbstractC66412zI {
    public final C68821Vcc A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View inflate = AbstractC25231BEo.A0O(viewGroup).inflate(R.layout.row_location_map, viewGroup, false);
        inflate.setTag(new C68827Vci(inflate));
        return new C3OO(inflate);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C70801WhH c70801WhH = (C70801WhH) interfaceC66482zP;
        AbstractC167017dG.A1N(c70801WhH, c3oo);
        Venue venue = c70801WhH.A02;
        if (venue.A00() != null && venue.A01() != null) {
            Object tag = c3oo.itemView.getTag();
            C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.maps.adapter.LocationMapRowViewBinder.Holder");
            AbstractC70052W0m.A00(this.A00, (C68827Vci) tag, venue);
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C70801WhH.class;
    }

    public V5D(C68821Vcc c68821Vcc) {
        this.A00 = c68821Vcc;
    }
}
