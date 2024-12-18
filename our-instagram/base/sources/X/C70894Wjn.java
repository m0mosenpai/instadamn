package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.discovery.mediamap.fragment.LocationDetailFragment;
import com.instagram.discovery.mediamap.fragment.MediaMapFragment;
import com.instagram.discovery.mediamap.model.LocationPageInformation;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.model.reels.Reel;
import com.instagram.model.venue.Venue;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.user.model.User;

/* renamed from: X.Wjn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70894Wjn implements InterfaceC71953XCf {
    public MediaMapPin A00;
    public final View A01;
    public final View A02;
    public final ImageView A03;
    public final ImageView A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final Group A08;
    public final UserSession A09;
    public final CircularImageView A0A;
    public final LocationDetailFragment A0B;
    public final MediaMapFragment A0C;
    public final MediaMapFragment A0D;
    public final C70995WmB A0E;
    public final GradientSpinner A0F;
    public final int A0G;
    public final int A0H;
    public final Context A0I;
    public final ViewGroup A0J;

    @Override // X.InterfaceC71953XCf
    public final void ADa() {
        User user;
        int i;
        Reel reel;
        String str;
        ImageUrl imageUrl;
        ImageUrl A07;
        Venue A00 = AbstractC69973Vyo.A00(this.A00.A09);
        LocationPageInformation locationPageInformation = this.A00.A06;
        if (locationPageInformation != null) {
            user = locationPageInformation.A00();
        } else {
            user = null;
        }
        Context context = this.A0I;
        UserSession userSession = this.A09;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(WFD.A02(context, userSession, A00, "MEDIA_MAP"));
        String address = A00.A00.getAddress();
        if (locationPageInformation != null && user != null) {
            C06090Tz c06090Tz = C06090Tz.A05;
            C18U.A06(c06090Tz, userSession, 36315017934539728L);
            C18U.A06(c06090Tz, userSession, 36315636409896399L);
            str = user.getUsername();
            String Ani = user.A03.Ani();
            imageUrl = user.Bhu();
            LocationDetailFragment locationDetailFragment = this.A0B;
            CircularImageView circularImageView = this.A0A;
            circularImageView.setVisibility(0);
            circularImageView.setUrl(imageUrl, locationDetailFragment);
            i = 0;
            this.A01.setVisibility(0);
            this.A02.setVisibility(0);
            WNP.A00(this.A07, 38, this, user);
            WNP.A00(this.A05, 39, this, user);
            WNP.A00(this.A06, 40, this, user);
            if (Ani != null && !Ani.equals("")) {
                address = AnonymousClass001.A0g(address, ", ", Ani);
            }
            reel = C1OU.A04(userSession).A0M(user.getId());
        } else {
            C69619VsM c69619VsM = this.A0D.A05;
            String A05 = A00.A05();
            i = 0;
            C14360o3.A0B(A05, 0);
            reel = (Reel) c69619VsM.A03.get(A05);
            AbstractC13880nE.A0Y(this.A0J, this.A0G);
            str = null;
            imageUrl = null;
        }
        if (address != null && !address.isEmpty()) {
            if (spannableStringBuilder.length() == 0) {
                spannableStringBuilder.append((CharSequence) address);
            } else {
                spannableStringBuilder.append((CharSequence) AnonymousClass001.A0R(" · ", address));
            }
        }
        if (C18U.A06(C06090Tz.A06, userSession, 36315692244405750L)) {
            spannableStringBuilder.clear();
        }
        String name = A00.A00.getName();
        String obj = spannableStringBuilder.toString();
        WNU wnu = new WNU(this, 5);
        TextView textView = this.A07;
        textView.setText(name);
        Group group = this.A08;
        C0fQ.A00(wnu, group);
        textView.setVisibility(i);
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView textView2 = this.A05;
        if (isEmpty) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(str);
            textView2.setVisibility(i);
        }
        boolean isEmpty2 = TextUtils.isEmpty(obj);
        TextView textView3 = this.A06;
        if (isEmpty2) {
            textView3.setVisibility(8);
        } else {
            textView3.setText(obj);
            textView3.setVisibility(i);
        }
        textView.setGravity(8388611);
        ImageView imageView = this.A04;
        if (imageView.getVisibility() == 4) {
            imageView.setVisibility(8);
        }
        if (reel != null) {
            LocationDetailFragment locationDetailFragment2 = this.A0B;
            C69532Vqw c69532Vqw = new C69532Vqw(this);
            GradientSpinner gradientSpinner = this.A0F;
            gradientSpinner.setVisibility(i);
            if (imageUrl == null && (A07 = reel.A07()) != null) {
                this.A0A.setUrl(A07, locationDetailFragment2);
            }
            WNX.A00(group, this, c69532Vqw, reel, 32);
            WNX.A00(gradientSpinner, this, c69532Vqw, reel, 33);
            if (reel.A16(userSession)) {
                gradientSpinner.A04();
            } else {
                gradientSpinner.A02();
            }
            this.A0A.setOnClickListener(null);
        } else if (user == null) {
            this.A01.setVisibility(8);
            this.A02.setVisibility(8);
            group.setOnClickListener(null);
            int i2 = this.A0H;
            AbstractC13880nE.A0a(textView, i2);
            AbstractC13880nE.A0a(textView2, i2);
            AbstractC13880nE.A0a(textView3, i2);
        } else {
            GradientSpinner gradientSpinner2 = this.A0F;
            gradientSpinner2.setVisibility(4);
            gradientSpinner2.setOnClickListener(null);
            WNP.A00(this.A0A, 41, this, user);
        }
        C0fQ.A00(new WNU(this, 6), imageView);
        imageView.setVisibility(i);
        Drawable drawable = context.getDrawable(R.drawable.instagram_more_vertical_pano_outline_24);
        WNU wnu2 = new WNU(this, 4);
        String string = C02G.A01(context).getString(2131966888);
        ImageView imageView2 = this.A03;
        imageView2.setImageDrawable(drawable);
        C0fQ.A00(wnu2, imageView2);
        imageView2.setContentDescription(string);
        imageView2.setVisibility(i);
    }

    public C70894Wjn(ViewGroup viewGroup, UserSession userSession, LocationDetailFragment locationDetailFragment, MediaMapFragment mediaMapFragment, MediaMapFragment mediaMapFragment2, MediaMapPin mediaMapPin) {
        this.A0B = locationDetailFragment;
        this.A0I = locationDetailFragment.requireContext();
        this.A09 = userSession;
        this.A00 = mediaMapPin;
        this.A0D = mediaMapFragment;
        this.A0C = mediaMapFragment2;
        this.A0J = viewGroup;
        Resources resources = viewGroup.getResources();
        this.A0G = resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        this.A0H = resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        AbstractC13880nE.A0W(viewGroup, -2);
        this.A08 = (Group) viewGroup.requireViewById(R.id.location_detail_action_bar_title_layout);
        this.A05 = (TextView) viewGroup.requireViewById(R.id.location_detail_action_bar_sub_title);
        this.A06 = (TextView) viewGroup.requireViewById(R.id.location_detail_action_bar_sub_title_2);
        this.A07 = (TextView) viewGroup.requireViewById(R.id.location_detail_action_bar_title);
        this.A01 = viewGroup.requireViewById(R.id.location_detail_story_container);
        this.A02 = viewGroup.requireViewById(R.id.location_detail_story_separator);
        CircularImageView circularImageView = (CircularImageView) viewGroup.requireViewById(R.id.location_detail_story_image);
        this.A0A = circularImageView;
        GradientSpinner gradientSpinner = (GradientSpinner) viewGroup.requireViewById(R.id.gradient_spinner);
        this.A0F = gradientSpinner;
        this.A0E = new C70995WmB(circularImageView, gradientSpinner);
        this.A04 = (ImageView) viewGroup.requireViewById(R.id.x_button);
        this.A03 = (ImageView) viewGroup.requireViewById(R.id.accessory_button);
    }

    public static void A00(C70894Wjn c70894Wjn, User user) {
        String id = user.getId();
        UserSession userSession = c70894Wjn.A09;
        FragmentActivity requireActivity = c70894Wjn.A0B.requireActivity();
        String A00 = AbstractC111324zv.A00(111);
        AbstractC167017dG.A1P(userSession, requireActivity);
        C31368DqX A01 = AbstractC31402Dr6.A01(userSession, id, "discovery_map", A00);
        A01.A0O = null;
        AbstractC31177DnL.A0o(requireActivity, AbstractC37303Gc4.A02(userSession, A01), userSession, "profile");
        MediaMapFragment mediaMapFragment = c70894Wjn.A0D;
        AbstractC31173DnH.A1W(mediaMapFragment.A0E, mediaMapFragment.A0F, c70894Wjn.A00, "instagram_map_location_detail_tap_profile");
    }

    @Override // X.InterfaceC71953XCf
    public final void EYu(MediaMapPin mediaMapPin) {
        this.A00 = mediaMapPin;
    }
}
