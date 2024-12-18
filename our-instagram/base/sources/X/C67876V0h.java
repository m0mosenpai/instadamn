package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.android.maps.StaticMapView$StaticMapOptions;
import com.facebook.android.maps.model.LatLng;
import com.instagram.api.schemas.AdGeoLocationType;
import com.instagram.business.promote.model.AudienceGeoLocation;
import com.instagram.business.promote.model.DistanceUnit;
import com.instagram.business.promote.model.PendingLocation;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.maps.ui.IgStaticMapView;
import java.util.List;

/* renamed from: X.V0h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67876V0h extends AbstractC59962oe implements XAF {
    public static final String __redex_internal_original_name = "PromoteCreateAudienceLocationsLocalFragment";
    public View A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public C70399WUb A04;
    public PromoteData A05;
    public PromoteState A06;
    public IgSimpleImageView A07;
    public IgSimpleImageView A08;
    public IgdsSwitch A09;
    public IgStaticMapView A0A;
    public UserSession A0B;
    public final C1VW A0I = C1VW.A00;
    public final InterfaceC127465pP A0G = new C70963WlA(this, 0);
    public final MQC A0H = new C70966WlD(this, 0);
    public final InterfaceC190658cN A0F = new C70950Wkw(this, 5);
    public final View.OnClickListener A0D = new WNT(this, 37);
    public final View.OnClickListener A0C = new WNT(this, 36);
    public final XAB A0E = new C70647WeS(this);

    @Override // X.XAF
    public final void Dc7(PromoteState promoteState, Integer num) {
        C14360o3.A0B(num, 1);
        if (num == C05F.A0u) {
            A03(this);
            A01(A00());
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_create_audience_locations_local";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A0A = (IgStaticMapView) view.requireViewById(R.id.map_view);
        PromoteState promoteState = this.A06;
        if (promoteState != null) {
            promoteState.A0A(this);
            this.A09 = (IgdsSwitch) view.requireViewById(R.id.switch_button);
            PromoteData promoteData = this.A05;
            str = "promoteData";
            if (promoteData != null) {
                PendingLocation pendingLocation = promoteData.A0o;
                if (pendingLocation.A03 == null) {
                    pendingLocation.A03 = Boolean.valueOf(C1VW.isLocationPermitted(requireContext(), getSession(), "PROMOTE_AUDIENCE"));
                }
                IgdsSwitch igdsSwitch = this.A09;
                String str2 = "useCurrentLocationSwitch";
                if (igdsSwitch != null) {
                    PromoteData promoteData2 = this.A05;
                    if (promoteData2 != null) {
                        igdsSwitch.setChecked(promoteData2.A0o.A00());
                        IgdsSwitch igdsSwitch2 = this.A09;
                        if (igdsSwitch2 != null) {
                            igdsSwitch2.A07 = this.A0F;
                            View requireViewById = view.requireViewById(R.id.custom_address_entry);
                            this.A00 = requireViewById;
                            if (requireViewById == null) {
                                str2 = "customAddressEntry";
                            } else {
                                C0fQ.A00(this.A0D, requireViewById);
                                this.A03 = (TextView) view.requireViewById(R.id.custom_address_title);
                                this.A01 = (TextView) view.requireViewById(R.id.custom_address);
                                this.A02 = (TextView) view.requireViewById(R.id.custom_address_edit_button);
                                this.A07 = (IgSimpleImageView) view.requireViewById(R.id.custom_address_chevron_icon);
                                IgSimpleImageView igSimpleImageView = (IgSimpleImageView) view.requireViewById(R.id.custom_address_cross_icon);
                                this.A08 = igSimpleImageView;
                                if (igSimpleImageView == null) {
                                    str2 = "customAddressCrossIcon";
                                } else {
                                    C0fQ.A00(this.A0C, igSimpleImageView);
                                    A02(this);
                                    int A07 = AbstractC13880nE.A07(requireContext());
                                    int round = Math.round(A07 / 1.5f);
                                    IgStaticMapView igStaticMapView = this.A0A;
                                    if (igStaticMapView == null) {
                                        str2 = "mapView";
                                    } else {
                                        AbstractC43592JPx.A1H(igStaticMapView, A07, round);
                                        A01(A00());
                                        Context A0L = AbstractC166997dE.A0L(view);
                                        UserSession session = getSession();
                                        C69341Vln c69341Vln = new C69341Vln(view, "radius_slider");
                                        List A03 = WG3.A03(requireContext());
                                        PromoteData promoteData3 = this.A05;
                                        if (promoteData3 != null) {
                                            PromoteState promoteState2 = this.A06;
                                            if (promoteState2 != null) {
                                                VRU.A00(A0L, c69341Vln, promoteData3, promoteState2, session, A03);
                                                if (this.mUserVisibleHint) {
                                                    A03(this);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        str = "promoteState";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    private final LatLng A00() {
        PromoteData promoteData = this.A05;
        if (promoteData == null) {
            C14360o3.A0F("promoteData");
            throw C00O.createAndThrow();
        }
        PendingLocation pendingLocation = promoteData.A0o;
        if (pendingLocation.A00()) {
            C70179WFe c70179WFe = VZI.A00;
            return C70179WFe.A00(getSession());
        }
        AudienceGeoLocation audienceGeoLocation = pendingLocation.A02;
        if (audienceGeoLocation == null) {
            return new LatLng(0.0d, 0.0d);
        }
        return new LatLng(audienceGeoLocation.A00, audienceGeoLocation.A01);
    }

    private final void A01(LatLng latLng) {
        int i;
        String str;
        StaticMapView$StaticMapOptions staticMapView$StaticMapOptions = new StaticMapView$StaticMapOptions("promote_audience_creation_map");
        staticMapView$StaticMapOptions.A02(latLng.A00, latLng.A01);
        int A03 = AbstractC31173DnH.A03(getContext(), requireContext(), R.attr.igds_color_legibility_gradient);
        C70179WFe c70179WFe = VZI.A00;
        Context requireContext = requireContext();
        PromoteData promoteData = this.A05;
        if (promoteData == null) {
            str = "promoteData";
        } else {
            int i2 = promoteData.A0o.A00;
            if (C70179WFe.A01(requireContext) == DistanceUnit.A04) {
                i = C1H4.A01(i2 * 1609.34f);
            } else {
                i = i2 * 1000;
            }
            staticMapView$StaticMapOptions.A04(latLng, A03, i);
            IgStaticMapView igStaticMapView = this.A0A;
            if (igStaticMapView == null) {
                str = "mapView";
            } else {
                igStaticMapView.setMapOptions(staticMapView$StaticMapOptions);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A02(C67876V0h c67876V0h) {
        TextView textView;
        Context requireContext;
        Context context;
        int i;
        PromoteData promoteData = c67876V0h.A05;
        String str = null;
        if (promoteData != null) {
            boolean A00 = promoteData.A0o.A00();
            String str2 = "customAddressEntry";
            View view = c67876V0h.A00;
            if (A00) {
                if (view != null) {
                    view.setVisibility(8);
                    return;
                }
            } else if (view != null) {
                view.setVisibility(0);
                PromoteData promoteData2 = c67876V0h.A05;
                if (promoteData2 != null) {
                    AudienceGeoLocation audienceGeoLocation = promoteData2.A0o.A02;
                    str2 = "customAddressDisplayName";
                    TextView textView2 = c67876V0h.A03;
                    if (audienceGeoLocation == null) {
                        if (textView2 != null) {
                            textView2.setVisibility(8);
                            TextView textView3 = c67876V0h.A01;
                            if (textView3 != null) {
                                textView3.setText(2131970507);
                                textView = c67876V0h.A01;
                                if (textView != null) {
                                    requireContext = c67876V0h.requireContext();
                                    context = c67876V0h.getContext();
                                    i = R.attr.igds_color_primary_text;
                                    AbstractC166987dD.A1O(requireContext, textView, AbstractC53242c7.A0H(context, i));
                                    return;
                                }
                            }
                        }
                        C14360o3.A0F("customAddressTitle");
                    } else {
                        if (textView2 != null) {
                            textView2.setVisibility(0);
                            PromoteData promoteData3 = c67876V0h.A05;
                            if (promoteData3 != null) {
                                PendingLocation pendingLocation = promoteData3.A0o;
                                C14360o3.A06(pendingLocation);
                                TextView textView4 = c67876V0h.A01;
                                if (textView4 != null) {
                                    AudienceGeoLocation audienceGeoLocation2 = pendingLocation.A02;
                                    if (audienceGeoLocation2 != null) {
                                        str = audienceGeoLocation2.A05;
                                    }
                                    textView4.setText(str);
                                    textView = c67876V0h.A01;
                                    if (textView != null) {
                                        requireContext = c67876V0h.requireContext();
                                        context = c67876V0h.getContext();
                                        i = R.attr.igds_color_secondary_text;
                                        AbstractC166987dD.A1O(requireContext, textView, AbstractC53242c7.A0H(context, i));
                                        return;
                                    }
                                }
                            }
                        }
                        C14360o3.A0F("customAddressTitle");
                    }
                    throw C00O.createAndThrow();
                }
            }
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
        C14360o3.A0F("promoteData");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, com.instagram.business.promote.model.AudienceGeoLocation] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.instagram.business.promote.model.AudienceGeoLocation] */
    public static final void A03(C67876V0h c67876V0h) {
        PromoteData promoteData = c67876V0h.A05;
        String str = "promoteData";
        if (promoteData != null) {
            PendingLocation pendingLocation = promoteData.A0o;
            if (pendingLocation.A00()) {
                C70179WFe c70179WFe = VZI.A00;
                LatLng A00 = C70179WFe.A00(c67876V0h.getSession());
                double d = A00.A00;
                Double valueOf = Double.valueOf(d);
                double d2 = A00.A01;
                String string = c67876V0h.getString(2131970508, valueOf, Double.valueOf(d2));
                C14360o3.A07(string);
                PromoteData promoteData2 = c67876V0h.A05;
                if (promoteData2 != null) {
                    PendingLocation pendingLocation2 = promoteData2.A0o;
                    int i = pendingLocation2.A00;
                    ?? obj = new Object();
                    obj.A06 = null;
                    obj.A05 = string;
                    obj.A03 = null;
                    obj.A00 = d;
                    obj.A01 = d2;
                    obj.A02 = i;
                    obj.A04 = null;
                    obj.A08 = null;
                    obj.A07 = null;
                    pendingLocation2.A01 = obj;
                }
            } else {
                AudienceGeoLocation audienceGeoLocation = pendingLocation.A02;
                if (audienceGeoLocation != null) {
                    String str2 = audienceGeoLocation.A06;
                    String str3 = audienceGeoLocation.A05;
                    AdGeoLocationType adGeoLocationType = audienceGeoLocation.A03;
                    double d3 = audienceGeoLocation.A00;
                    double d4 = audienceGeoLocation.A01;
                    String str4 = audienceGeoLocation.A04;
                    String str5 = audienceGeoLocation.A08;
                    String str6 = audienceGeoLocation.A07;
                    int i2 = pendingLocation.A00;
                    ?? obj2 = new Object();
                    obj2.A06 = str2;
                    obj2.A05 = str3;
                    obj2.A03 = adGeoLocationType;
                    obj2.A00 = d3;
                    obj2.A01 = d4;
                    obj2.A02 = i2;
                    obj2.A04 = str4;
                    obj2.A08 = str5;
                    obj2.A07 = str6;
                    pendingLocation.A02 = obj2;
                }
            }
            PromoteState promoteState = c67876V0h.A06;
            if (promoteState == null) {
                str = "promoteState";
            } else {
                PromoteState.A01(promoteState, C05F.A02);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A04(C67876V0h c67876V0h, boolean z) {
        PromoteData promoteData = c67876V0h.A05;
        if (promoteData == null) {
            C14360o3.A0F("promoteData");
            throw C00O.createAndThrow();
        }
        promoteData.A0o.A03 = Boolean.valueOf(z);
        A03(c67876V0h);
        c67876V0h.A01(c67876V0h.A00());
        A02(c67876V0h);
    }

    @Override // X.AbstractC59962oe
    /* renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final UserSession getSession() {
        UserSession userSession = this.A0B;
        if (userSession != null) {
            return userSession;
        }
        C14360o3.A0F("session");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1566373024);
        super.onCreate(bundle);
        this.A05 = InterfaceC72021XFj.A00(this);
        this.A06 = XFZ.A00(this);
        PromoteData promoteData = this.A05;
        if (promoteData == null) {
            C14360o3.A0F("promoteData");
            throw C00O.createAndThrow();
        }
        this.A0B = promoteData.A0y;
        this.A04 = C70399WUb.A00(getSession());
        C0f9.A09(-1647482808, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-530303958);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_create_audience_locations_local_view, viewGroup, false);
        C0f9.A09(1332412964, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1002817415);
        PromoteState promoteState = this.A06;
        if (promoteState == null) {
            C14360o3.A0F("promoteState");
            throw C00O.createAndThrow();
        }
        promoteState.A0B(this);
        super.onDestroyView();
        C0f9.A09(1631690410, A02);
    }

    @Override // X.AbstractC59962oe, X.AbstractC59972of
    public final void onSetUserVisibleHint(boolean z, boolean z2) {
        super.onSetUserVisibleHint(z, z2);
        if (z) {
            A03(this);
        }
    }
}
