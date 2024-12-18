package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.model.venue.Venue;

/* loaded from: classes9.dex */
public final class OWd {
    public InterfaceC58116Ppf A00;
    public Venue A01;
    public Integer A02;
    public final int A03;
    public final C51143Mim A04;
    public final View A05;
    public final View A06;
    public final View A07;
    public final View A08;
    public final View A09;
    public final View A0A;
    public final ImageView A0B;
    public final TextView A0C;
    public final TextView A0D;
    public final RecyclerView A0E;

    public OWd(View view) {
        C14360o3.A0B(view, 1);
        this.A09 = view;
        this.A0A = AbstractC166997dE.A0S(view, R.id.venue_row);
        this.A0D = AbstractC167007dF.A0N(view, R.id.venue_name);
        this.A0C = AbstractC167007dF.A0N(view, R.id.venue_address);
        this.A0B = AbstractC31176DnK.A0D(view, R.id.location_balloon);
        RecyclerView recyclerView = (RecyclerView) AbstractC166997dE.A0R(view, R.id.suggested_locations_recyclerview);
        this.A0E = recyclerView;
        this.A06 = AbstractC166997dE.A0S(view, R.id.clear_button);
        this.A05 = AbstractC166997dE.A0S(view, R.id.arrow);
        this.A08 = AbstractC166997dE.A0S(view, R.id.location_label);
        this.A07 = AbstractC166997dE.A0S(view, R.id.metadata_location_first_row);
        C51143Mim c51143Mim = new C51143Mim(this);
        this.A04 = c51143Mim;
        this.A02 = C05F.A00;
        Context A0L = AbstractC166997dE.A0L(view);
        Resources resources = view.getResources();
        this.A03 = (int) Math.max(AbstractC13880nE.A0A(A0L) / 2.5d, resources.getDimension(R.dimen.ad_tag_max_width));
        AbstractC31174DnI.A17(A0L, recyclerView, false);
        recyclerView.setAdapter(c51143Mim);
        AbstractC37304Gc5.A0z(recyclerView, AbstractC166997dE.A05(resources), AbstractC166997dE.A08(resources));
    }

    public final void A01(InterfaceC58116Ppf interfaceC58116Ppf, Venue venue) {
        Integer num;
        this.A00 = interfaceC58116Ppf;
        ViewOnClickListenerC55462OkH.A01(this.A06, 9, this);
        this.A01 = venue;
        if (venue == null) {
            num = this.A02;
        } else {
            num = C05F.A01;
        }
        A00(this, num);
        this.A0B.setVisibility(0);
    }

    public static final void A00(OWd oWd, Integer num) {
        View view;
        String address;
        String str;
        String str2 = null;
        if (num == C05F.A00) {
            ViewOnClickListenerC55462OkH.A01(oWd.A07, 10, oWd);
            ImageView imageView = oWd.A0B;
            imageView.setImageResource(R.drawable.instagram_location_pano_outline_24);
            imageView.setColorFilter((ColorFilter) null);
            oWd.A0A.setVisibility(8);
            oWd.A06.setVisibility(8);
            oWd.A05.setVisibility(0);
            oWd.A08.setVisibility(0);
            int itemCount = oWd.A04.getItemCount();
            view = oWd.A0E;
            if (itemCount > 0) {
                view.setVisibility(0);
            }
            view.setVisibility(8);
        } else if (num == C05F.A01) {
            TextView textView = oWd.A0D;
            Venue venue = oWd.A01;
            if (venue != null) {
                textView.setText(venue.A00.getName());
                Venue venue2 = oWd.A01;
                if (venue2 != null && (address = venue2.A00.getAddress()) != null && address.length() != 0) {
                    TextView textView2 = oWd.A0C;
                    Venue venue3 = oWd.A01;
                    if (venue3 != null) {
                        str = venue3.A00.getAddress();
                    } else {
                        str = null;
                    }
                    textView2.setText(str);
                    textView2.setVisibility(0);
                } else {
                    oWd.A0C.setVisibility(8);
                }
                oWd.A0A.setVisibility(0);
                Venue venue4 = oWd.A01;
                if (venue4 != null && venue4.A00.BM8() != null && venue4.A00.BO9() != null) {
                    ViewOnClickListenerC55462OkH.A01(oWd.A07, 11, oWd);
                } else {
                    C0fQ.A00(ViewOnClickListenerC55446Ojv.A00, oWd.A07);
                }
                Venue venue5 = oWd.A01;
                if (venue5 != null) {
                    str2 = venue5.A03();
                }
                boolean equals = "facebook_events".equals(str2);
                ImageView imageView2 = oWd.A0B;
                int i = R.drawable.share_location;
                if (equals) {
                    i = R.drawable.event_icon;
                }
                imageView2.setImageResource(i);
                AbstractC31173DnH.A11(imageView2.getContext(), imageView2, R.color.badge_color);
                oWd.A0E.setVisibility(8);
                oWd.A08.setVisibility(8);
                oWd.A06.setVisibility(0);
                view = oWd.A05;
                view.setVisibility(8);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        oWd.A02 = num;
    }

    public final void A02(Venue venue) {
        Integer num;
        this.A01 = venue;
        if (venue != null) {
            num = C05F.A01;
        } else {
            num = C05F.A00;
        }
        A00(this, num);
    }
}
