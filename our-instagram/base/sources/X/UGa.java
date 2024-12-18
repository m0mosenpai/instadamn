package X;

import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.api.schemas.AdGeoLocationType;
import com.instagram.business.promote.model.AudienceGeoLocation;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class UGa extends C2UU {
    public List A00;
    public final XAA A01;

    public UGa(XAA xaa) {
        C14360o3.A0B(xaa, 1);
        this.A01 = xaa;
        this.A00 = new ArrayList();
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C66474UIy(AbstractC25227BEk.A0D(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.location_typeahead_item_view, false), this.A01);
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        int i2;
        C66474UIy c66474UIy = (C66474UIy) c3oo;
        C14360o3.A0B(c66474UIy, 0);
        AudienceGeoLocation audienceGeoLocation = (AudienceGeoLocation) this.A00.get(i);
        C14360o3.A0B(audienceGeoLocation, 0);
        TextView textView = c66474UIy.A00;
        String str = audienceGeoLocation.A05;
        if (str != null) {
            textView.setText(str);
            TextView textView2 = c66474UIy.A01;
            AdGeoLocationType adGeoLocationType = audienceGeoLocation.A03;
            if (adGeoLocationType != null) {
                int ordinal = adGeoLocationType.ordinal();
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                i2 = 2131952245;
                                if (ordinal != 14) {
                                    i2 = 2131952244;
                                }
                            } else {
                                i2 = 2131952247;
                            }
                        } else {
                            i2 = 2131952242;
                        }
                    } else {
                        i2 = 2131952246;
                    }
                } else {
                    i2 = 2131952243;
                }
                textView2.setText(i2);
                WNP.A00(c66474UIy.itemView, 3, audienceGeoLocation, c66474UIy);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(1299539326);
        int size = this.A00.size();
        C0f9.A0A(-842344788, A03);
        return size;
    }
}
