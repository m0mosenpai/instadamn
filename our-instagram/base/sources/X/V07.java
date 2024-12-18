package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.android.maps.model.LatLng;
import com.facebook.maps.delegate.common.interfaces.MapOptions;
import com.facebook.maps.ttrc.common.MapboxTTRC;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes11.dex */
public abstract class V07 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "DirectLocationSharingMapBaseFragment";
    public C69271Vkf A00;
    public TFA A01;
    public UBT A02;
    public C66279U6z A03;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);

    public static final void A00(Drawable drawable, ImageUrl imageUrl, V07 v07, double d, double d2) {
        C69271Vkf c69271Vkf;
        if ((imageUrl == null && drawable == null) || (c69271Vkf = v07.A00) == null) {
            return;
        }
        C70394WTw c70394WTw = c69271Vkf.A01;
        AbstractC13880nE.A04(c70394WTw.A0G, 64);
        c69271Vkf.A01.A0A(new KYY(drawable, null, c70394WTw, imageUrl, null, "unused_media_id", null, null, d, d2, C1H4.A01(AbstractC13880nE.A04(v07.requireActivity(), 50)), false, false, false));
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewGroup A0C = AbstractC31176DnK.A0C(view, R.id.map_container);
        Context requireContext = requireContext();
        MapOptions mapOptions = new MapOptions();
        mapOptions.A05 = EnumC68183VFb.MAPBOX;
        if (this instanceof V7R) {
            str = "igd_pinned_location_xma";
        } else if (this instanceof V7T) {
            str = "igd_composer";
        } else {
            str = "igd_live_location_xma";
        }
        mapOptions.A08 = str;
        InterfaceC09390do interfaceC09390do = this.A04;
        mapOptions.A07 = C18U.A04(C06090Tz.A05, (AbstractC12990ll) interfaceC09390do.getValue(), 36875034425360446L);
        mapOptions.A03 = VGB.BOTTOM_LEFT;
        mapOptions.A0A = C1H6.A03();
        UBT ubt = new UBT(requireContext, mapOptions);
        this.A02 = ubt;
        A0C.addView(ubt);
        UBT ubt2 = this.A02;
        if (ubt2 != null) {
            ubt2.A05((UserSession) interfaceC09390do.getValue());
        }
        UBT ubt3 = this.A02;
        if (ubt3 != null) {
            ubt3.A03(bundle);
        }
        UBT ubt4 = this.A02;
        if (ubt4 != null) {
            ubt4.A04(new WWl(this, 2));
        }
    }

    public final void A03() {
        C69271Vkf c69271Vkf;
        TFA tfa = this.A01;
        if (tfa != null) {
            Location A00 = tfa.A00(__redex_internal_original_name);
            if (A00 != null) {
                A04(A00.getLatitude(), A00.getLongitude());
                C66279U6z c66279U6z = this.A03;
                if (c66279U6z != null && (c69271Vkf = this.A00) != null) {
                    c69271Vkf.A01.A0A(c66279U6z);
                    return;
                }
                return;
            }
            return;
        }
        C14360o3.A0F("locationManager");
        throw C00O.createAndThrow();
    }

    public final void A04(double d, double d2) {
        LatLng latLng = new LatLng(d, d2);
        C69271Vkf c69271Vkf = this.A00;
        if (c69271Vkf != null) {
            C70109W4g.A00(c69271Vkf.A01, latLng, 17.0f);
        }
    }

    public void A05(C69271Vkf c69271Vkf) {
        this.A00 = c69271Vkf;
        C66279U6z c66279U6z = new C66279U6z(requireContext(), c69271Vkf.A01, new WlJ(this));
        this.A03 = c66279U6z;
        C69271Vkf c69271Vkf2 = this.A00;
        if (c69271Vkf2 != null) {
            c69271Vkf2.A01.A0A(c66279U6z);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A04.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1337670918);
        super.onCreate(bundle);
        this.A01 = new TFA(requireContext(), (UserSession) this.A04.getValue());
        C0f9.A09(-1279239974, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onDestroyView() {
        int A02 = C0f9.A02(-1969338000);
        super.onDestroyView();
        UBT ubt = this.A02;
        if (ubt != null) {
            ubt.A00();
        }
        this.A02 = null;
        this.A03 = null;
        C0f9.A09(-1344481936, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        int A02 = C0f9.A02(1499793401);
        super.onPause();
        UBT ubt = this.A02;
        if (ubt != null && ubt.A01 != null) {
            MapboxTTRC.cancel(AbstractC43591JPw.A00(409));
        }
        C0f9.A09(222053406, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onResume() {
        int A02 = C0f9.A02(-1946123857);
        super.onResume();
        UBT ubt = this.A02;
        if (ubt != null) {
            ubt.A01();
        }
        C0f9.A09(1776270509, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(1204294490);
        super.onStart();
        UBT ubt = this.A02;
        if (ubt != null) {
            ubt.A02();
        }
        C0f9.A09(-738251718, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-916688495);
        super.onStop();
        C0f9.A09(928538707, A02);
    }
}
