package X;

import android.os.Bundle;
import com.instagram.discovery.mediamap.fragment.LocationDetailFragment;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.modal.ModalActivity;
import com.instagram.model.venue.Venue;

/* renamed from: X.Vqv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69531Vqv {
    public final /* synthetic */ LocationDetailFragment A00;

    public C69531Vqv(LocationDetailFragment locationDetailFragment) {
        this.A00 = locationDetailFragment;
    }

    public final void A00(MediaMapPin mediaMapPin) {
        LocationDetailFragment locationDetailFragment = this.A00;
        Venue A00 = AbstractC69973Vyo.A00(mediaMapPin.A09);
        if (mediaMapPin.A06 != null) {
            Bundle bundle = new Bundle();
            bundle.putString("location_id_key", A00.A05());
            bundle.putString("fb_page_id_key", A00.A04());
            bundle.putString("info_page_logging_entry_point", "map_location_sheet");
            bundle.putParcelable(AbstractC111324zv.A00(467), mediaMapPin.A06);
            C6XJ c6xj = new C6XJ(locationDetailFragment.requireActivity(), bundle, locationDetailFragment.getSession(), ModalActivity.class, "location_info");
            c6xj.A08();
            c6xj.A0C(locationDetailFragment.requireContext());
        }
    }
}
