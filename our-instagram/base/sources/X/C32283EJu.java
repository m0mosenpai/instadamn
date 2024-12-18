package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.android.maps.StaticMapView$StaticMapOptions;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.maps.ui.IgStaticMapView;

/* renamed from: X.EJu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32283EJu extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "LoginNotificationApproveFragment";
    public double A00;
    public double A01;
    public TextView A02;
    public TextView A03;
    public UserSession A04;
    public Integer A05;
    public Integer A06 = C05F.A0C;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public View A0C;
    public View A0D;
    public TextView A0E;
    public TextView A0F;
    public TextView A0G;
    public TextView A0H;
    public IgSimpleImageView A0I;
    public String A0J;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "login_notification";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (this.A06 == C05F.A0C) {
            UserSession userSession = this.A04;
            String str = "userSession";
            if (userSession != null) {
                String username = AbstractC166997dE.A0Y(userSession).getUsername();
                String str2 = this.A09;
                if (str2 == null) {
                    str = "requestDeviceId";
                } else {
                    String str3 = this.A0B;
                    if (str3 == null) {
                        str = "twoFacIdentifier";
                    } else {
                        AbstractC32533EUj.A00(getParentFragmentManager(), this, FDL.A00(userSession, username, str2, str3, null), 11);
                        return;
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    private final void A00() {
        TextView textView;
        int i;
        TextView textView2 = this.A0G;
        if (textView2 != null) {
            FragmentActivity requireActivity = requireActivity();
            UserSession userSession = this.A04;
            if (userSession != null) {
                AnonymousClass773.A07(new Em0(requireActivity, userSession, AbstractC31173DnH.A01(requireActivity), 15), textView2, AbstractC166997dE.A0p(requireActivity, 2131965772), requireActivity.getString(2131965756));
                Integer num = this.A06;
                if (num == C05F.A0C) {
                    View view = this.A0D;
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    View view2 = this.A0C;
                    if (view2 != null) {
                        view2.setVisibility(0);
                    }
                    TextView textView3 = this.A0F;
                    if (textView3 != null) {
                        textView3.setVisibility(8);
                    }
                    TextView textView4 = this.A0E;
                    if (textView4 != null) {
                        AbstractC25227BEk.A12(textView4, this, 2131965755);
                    }
                    IgSimpleImageView igSimpleImageView = this.A0I;
                    if (igSimpleImageView != null) {
                        AbstractC166997dE.A19(requireContext(), igSimpleImageView, R.drawable.instagram_device_phone_pano_outline_24);
                        return;
                    }
                    return;
                }
                if (num == C05F.A0N) {
                    View view3 = this.A0C;
                    if (view3 != null) {
                        view3.setVisibility(8);
                    }
                    TextView textView5 = this.A0H;
                    if (textView5 != null) {
                        textView5.setText(2131965757);
                    }
                    TextView textView6 = this.A0F;
                    if (textView6 != null) {
                        textView6.setVisibility(0);
                        AbstractC31177DnL.A10(textView6, this, this.A0J, 2131965747);
                    }
                    IgSimpleImageView igSimpleImageView2 = this.A0I;
                    if (igSimpleImageView2 != null) {
                        AbstractC166997dE.A19(requireContext(), igSimpleImageView2, R.drawable.instagram_circle_check_pano_filled_24);
                    }
                    textView = this.A0E;
                    if (textView == null) {
                        return;
                    } else {
                        i = 2131965753;
                    }
                } else if (num == C05F.A0Y) {
                    View view4 = this.A0C;
                    if (view4 != null) {
                        view4.setVisibility(8);
                    }
                    TextView textView7 = this.A0H;
                    if (textView7 != null) {
                        AbstractC25227BEk.A12(textView7, this, 2131965758);
                    }
                    TextView textView8 = this.A0F;
                    if (textView8 != null) {
                        textView8.setVisibility(0);
                        AbstractC31177DnL.A10(textView8, this, this.A0J, 2131965762);
                    }
                    IgSimpleImageView igSimpleImageView3 = this.A0I;
                    if (igSimpleImageView3 != null) {
                        AbstractC166997dE.A19(requireContext(), igSimpleImageView3, R.drawable.instagram_circle_x_pano_filled_24);
                    }
                    textView = this.A0E;
                    if (textView == null) {
                        return;
                    } else {
                        i = 2131965754;
                    }
                } else {
                    Integer num2 = C05F.A00;
                    View view5 = this.A0D;
                    if (num == num2) {
                        if (view5 != null) {
                            view5.setVisibility(8);
                        }
                        C9GR.A06(requireContext(), 2131965767);
                        return;
                    } else {
                        if (view5 != null) {
                            view5.setVisibility(8);
                        }
                        C9GR.A0B(requireContext(), "something_went_wrong");
                        C0w9.A03("login_notification", "Unknown login notification state!");
                        return;
                    }
                }
                FragmentActivity requireActivity2 = requireActivity();
                UserSession userSession2 = this.A04;
                if (userSession2 != null) {
                    AnonymousClass773.A07(new Em0(requireActivity2, userSession2, AbstractC31173DnH.A01(requireActivity2), 14), textView, AbstractC166997dE.A0p(requireActivity2, 2131965768), requireActivity2.getString(i));
                    return;
                }
            }
            C14360o3.A0F("userSession");
            throw C00O.createAndThrow();
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A03(C32283EJu c32283EJu, Integer num) {
        if (c32283EJu.A0J == null) {
            c32283EJu.A0J = C23831Eq.A06(c32283EJu.requireContext(), System.currentTimeMillis());
        }
        c32283EJu.A06 = num;
        c32283EJu.A00();
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        UserSession userSession = this.A04;
        if (userSession == null) {
            AbstractC31171DnF.A0y();
            throw C00O.createAndThrow();
        }
        return userSession;
    }

    public static final void A01(Context context, C32283EJu c32283EJu) {
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        A0I.A0A(2131965752);
        A0I.A09(2131965751);
        A0I.A0J(new DialogInterfaceOnClickListenerC35319Fhu(c32283EJu, 14), 2131965750);
        AbstractC31176DnK.A16(null, A0I, 2131965761);
    }

    public static final void A02(Context context, C32283EJu c32283EJu) {
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        A0I.A0A(2131965766);
        A0I.A09(2131965765);
        A0I.A0J(new DialogInterfaceOnClickListenerC35319Fhu(c32283EJu, 15), 2131965764);
        AbstractC31176DnK.A16(null, A0I, 2131965761);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.Efu(2131965749);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 168 && i2 == -1) {
            C9GR.A07(requireContext(), 2131965760);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(557677236);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A04 = AbstractC31176DnK.A0S(this);
        this.A00 = requireArguments.getDouble("ARG_LOCATION_LATITUDE", 0.0d);
        this.A01 = requireArguments.getDouble("ARG_LOCATION_LONGITUDE", 0.0d);
        this.A07 = requireArguments.getString("ARG_DEVICE_NAME", "");
        this.A08 = requireArguments.getString("ARG_LOCATION_NAME", "");
        this.A0A = requireArguments.getString("ARG_TIMESTAMP", "");
        this.A09 = requireArguments.getString("ARG_REQUEST_DEVICE_ID", "");
        this.A0B = requireArguments.getString("ARG_TWO_FAC_IDENTIFIER", "");
        this.A05 = FDM.A00(requireArguments.getInt("ARG_USER_ACTION", 3));
        C0f9.A09(-1049868317, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IllegalStateException A14;
        int i;
        String str;
        String str2;
        int A02 = C0f9.A02(-1420501245);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.login_notification_approve, viewGroup, false);
        this.A0D = inflate;
        if (inflate != null) {
            this.A0H = AbstractC31180DnO.A06(inflate);
            View view = this.A0D;
            if (view != null) {
                this.A0E = AbstractC166997dE.A0T(view, R.id.description);
                View view2 = this.A0D;
                if (view2 != null) {
                    View requireViewById = view2.requireViewById(R.id.map_item);
                    C14360o3.A07(requireViewById);
                    this.A02 = AbstractC166997dE.A0T(requireViewById, R.id.left_button);
                    this.A03 = AbstractC166997dE.A0T(requireViewById, R.id.right_button);
                    this.A0I = (IgSimpleImageView) requireViewById.requireViewById(R.id.status_icon);
                    this.A0F = AbstractC166997dE.A0T(requireViewById, R.id.confirm_text);
                    this.A0C = requireViewById.requireViewById(R.id.button_container);
                    View view3 = this.A0D;
                    if (view3 != null) {
                        this.A0G = AbstractC166997dE.A0T(view3, R.id.footer);
                        Context requireContext = requireContext();
                        TextView A0N = AbstractC167007dF.A0N(requireViewById, R.id.title_message);
                        TextView A0N2 = AbstractC167007dF.A0N(requireViewById, R.id.body_message_timestamp);
                        TextView A0N3 = AbstractC167007dF.A0N(requireViewById, R.id.body_message_device);
                        IgStaticMapView igStaticMapView = (IgStaticMapView) AbstractC166997dE.A0R(requireViewById, R.id.login_activity_map_view);
                        TextView textView = this.A02;
                        if (textView != null) {
                            textView.setText(2131965748);
                            ViewOnClickListenerC35670Fp5.A00(textView, 20, requireContext, this);
                        }
                        TextView textView2 = this.A03;
                        if (textView2 != null) {
                            textView2.setText(2131965763);
                            ViewOnClickListenerC35670Fp5.A00(textView2, 21, requireContext, this);
                        }
                        igStaticMapView.A07 = VGB.TOP_RIGHT;
                        StaticMapView$StaticMapOptions staticMapView$StaticMapOptions = new StaticMapView$StaticMapOptions("review_suspicious_login_map");
                        staticMapView$StaticMapOptions.A02(this.A00, this.A01);
                        String str3 = this.A08;
                        if (str3 == null) {
                            str = "locationName";
                        } else {
                            A0N.setText(str3);
                            try {
                                str2 = this.A0A;
                            } catch (NumberFormatException unused) {
                                A0N2.setVisibility(8);
                            }
                            if (str2 == null) {
                                C14360o3.A0F("timestamp");
                                throw C00O.createAndThrow();
                            }
                            A0N2.setText(C23831Eq.A03(requireContext, Double.parseDouble(str2)));
                            String str4 = this.A07;
                            if (str4 == null) {
                                str = "deviceName";
                            } else {
                                A0N3.setText(str4);
                                staticMapView$StaticMapOptions.A03(11);
                                igStaticMapView.setMapOptions(staticMapView$StaticMapOptions);
                                A00();
                                View view4 = this.A0D;
                                C14360o3.A0C(view4, AbstractC111324zv.A00(2));
                                C0f9.A09(1704480117, A02);
                                return view4;
                            }
                        }
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    A14 = AbstractC166987dD.A14("Required value was null.");
                    i = -2035057396;
                } else {
                    A14 = AbstractC166987dD.A14("Required value was null.");
                    i = -1616287599;
                }
            } else {
                A14 = AbstractC166987dD.A14("Required value was null.");
                i = 1816131311;
            }
        } else {
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = 856983724;
        }
        C0f9.A09(i, A02);
        throw A14;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1974474473);
        super.onDestroyView();
        this.A0D = null;
        this.A0H = null;
        this.A0E = null;
        this.A0I = null;
        this.A02 = null;
        this.A03 = null;
        this.A0F = null;
        this.A0C = null;
        this.A0G = null;
        C0f9.A09(-1298607254, A02);
    }
}
