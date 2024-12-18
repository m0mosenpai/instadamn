package X;

import android.app.Dialog;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.common.collect.ImmutableMap;
import com.google.common.util.concurrent.SettableFuture;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.util.List;

/* loaded from: classes9.dex */
public final class N55 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "SmartGlassesEducationToolkitFragment";
    public int A00;
    public Dialog A01;
    public View A02;
    public View A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public ShimmerFrameLayout A0A;
    public ShimmerFrameLayout A0B;
    public ShimmerFrameLayout A0C;
    public C54845OMq A0D;
    public C56352iT A0E;
    public CircularImageView A0F;
    public IgImageView A0G;
    public IgImageView A0H;
    public IgImageView A0I;
    public IgdsListCell A0J;
    public IgdsListCell A0K;
    public IgdsListCell A0L;
    public IgdsListCell A0M;
    public Integer A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public AnonymousClass195 A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public Integer A0V;
    public final AbstractViewOnClickListenerC13340mK A0W;
    public final AbstractViewOnClickListenerC13340mK A0X;
    public final AbstractViewOnClickListenerC13340mK A0Y;
    public final String A0Z;
    public final InterfaceC09390do A0c;
    public final InterfaceC58362lv A0d;
    public final InterfaceC09390do A0b = AbstractC09440dt.A01(new C37061GUv(this, 4));
    public final InterfaceC09390do A0a = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "dev_options_xme_glasses_toolkit";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A0a;
        C23031Ai A0l = AbstractC25230BEn.A0l(interfaceC09390do);
        InterfaceC16530ry interfaceC16530ry = A0l.A8B;
        C0YR[] c0yrArr = C23031Ai.A8c;
        if (MSX.A0j(A0l, interfaceC16530ry, c0yrArr, 347).length() > 0) {
            C23031Ai A0l2 = AbstractC25230BEn.A0l(interfaceC09390do);
            this.A0O = MSX.A0j(A0l2, A0l2.A8B, c0yrArr, 347);
        }
        C23031Ai A0l3 = AbstractC25230BEn.A0l(interfaceC09390do);
        if (MSX.A0j(A0l3, A0l3.A8C, c0yrArr, 348).length() > 0) {
            C23031Ai A0l4 = AbstractC25230BEn.A0l(interfaceC09390do);
            this.A0P = MSX.A0j(A0l4, A0l4.A8C, c0yrArr, 348);
        }
        C23031Ai A0l5 = AbstractC25230BEn.A0l(interfaceC09390do);
        if (MSX.A0j(A0l5, A0l5.A8A, c0yrArr, 349).length() > 0) {
            C23031Ai A0l6 = AbstractC25230BEn.A0l(interfaceC09390do);
            this.A0Q = MSX.A0j(A0l6, A0l6.A8A, c0yrArr, 349);
        }
        ((C50936Mf5) this.A0c.getValue()).A00.A06(getViewLifecycleOwner(), this.A0d);
        C56352iT A01 = C56342iS.A01(new Ok3(this, 38), AbstractC31176DnK.A0C(requireView(), R.id.smart_glasses_education_toolkit_action_bar));
        this.A0E = A01;
        A01.A0X(OqT.A00);
        this.A0I = AbstractC31172DnG.A0a(view, R.id.smart_glasses_thumbnail_container);
        this.A07 = AbstractC166987dD.A0e(view, R.id.smart_glasses_device_name);
        this.A08 = AbstractC166987dD.A0e(view, R.id.smart_glasses_model_name);
        this.A0B = (ShimmerFrameLayout) view.findViewById(R.id.smart_glasses_image_shimmer_container);
        this.A0A = (ShimmerFrameLayout) view.findViewById(R.id.smart_glasses_device_name_shimmer_container);
        this.A0C = (ShimmerFrameLayout) view.findViewById(R.id.smart_glasses_model_name_shimmer_container);
        this.A02 = view.findViewById(R.id.smart_glasses_device_name_empty);
        this.A03 = view.findViewById(R.id.smart_glasses_model_name_empty);
        this.A0F = (CircularImageView) view.findViewById(R.id.smart_glasses_thumbnail_container_empty);
        View view2 = this.A02;
        if (view2 == null) {
            str = "headerGlassesDeviceNameEmpty";
        } else {
            view2.setVisibility(0);
            View view3 = this.A03;
            if (view3 == null) {
                str = "headerGlassesModelNameEmpty";
            } else {
                view3.setVisibility(0);
                CircularImageView circularImageView = this.A0F;
                if (circularImageView == null) {
                    str = "headerGlassesPictureEmpty";
                } else {
                    circularImageView.setVisibility(0);
                    ShimmerFrameLayout shimmerFrameLayout = this.A0C;
                    if (shimmerFrameLayout == null) {
                        str = "headerGlassesModelNameShimmer";
                    } else {
                        shimmerFrameLayout.A02();
                        ShimmerFrameLayout shimmerFrameLayout2 = this.A0A;
                        if (shimmerFrameLayout2 == null) {
                            str = "headerGlassesDeviceNameShimmer";
                        } else {
                            shimmerFrameLayout2.A02();
                            ShimmerFrameLayout shimmerFrameLayout3 = this.A0B;
                            if (shimmerFrameLayout3 == null) {
                                str = "headerGlassesImageShimmer";
                            } else {
                                shimmerFrameLayout3.A02();
                                TextView textView = this.A08;
                                if (textView == null) {
                                    str = "headerGlassesModelName";
                                } else {
                                    textView.setVisibility(8);
                                    TextView textView2 = this.A07;
                                    if (textView2 == null) {
                                        str = "headerGlassesDeviceName";
                                    } else {
                                        textView2.setVisibility(8);
                                        IgImageView igImageView = this.A0I;
                                        if (igImageView == null) {
                                            str = "headerUserProfilePicture";
                                        } else {
                                            igImageView.setVisibility(8);
                                            A02(this);
                                            IgdsListCell igdsListCell = this.A0K;
                                            String str2 = "glassesVersionListCell";
                                            if (igdsListCell != null) {
                                                igdsListCell.A06(2131974236);
                                                Drawable drawable = requireContext().getDrawable(R.drawable.instagram_glasses_pano_outline_24);
                                                if (drawable != null) {
                                                    IgdsListCell igdsListCell2 = this.A0K;
                                                    if (igdsListCell2 != null) {
                                                        igdsListCell2.A09(drawable);
                                                    }
                                                }
                                                IgdsListCell igdsListCell3 = this.A0J;
                                                str2 = "glassesMediaListCell";
                                                if (igdsListCell3 != null) {
                                                    igdsListCell3.A06(2131974238);
                                                    Drawable drawable2 = requireContext().getDrawable(R.drawable.instagram_photo_pano_outline_24);
                                                    if (drawable2 != null) {
                                                        IgdsListCell igdsListCell4 = this.A0J;
                                                        if (igdsListCell4 != null) {
                                                            igdsListCell4.A09(drawable2);
                                                        }
                                                    }
                                                    IgdsListCell igdsListCell5 = this.A0J;
                                                    if (igdsListCell5 != null) {
                                                        C0fQ.A00(this.A0X, igdsListCell5);
                                                        IgdsListCell igdsListCell6 = this.A0M;
                                                        str2 = "helpStreamingListCell";
                                                        if (igdsListCell6 != null) {
                                                            igdsListCell6.A06(2131974237);
                                                            IgdsListCell igdsListCell7 = this.A0M;
                                                            if (igdsListCell7 != null) {
                                                                C0fQ.A00(this.A0W, igdsListCell7);
                                                                IgdsListCell igdsListCell8 = this.A0L;
                                                                str2 = "helpGlassesContentListCell";
                                                                if (igdsListCell8 != null) {
                                                                    igdsListCell8.A06(2131974241);
                                                                    IgdsListCell igdsListCell9 = this.A0L;
                                                                    if (igdsListCell9 != null) {
                                                                        C0fQ.A00(this.A0Y, igdsListCell9);
                                                                        InterfaceC09390do interfaceC09390do2 = this.A0b;
                                                                        OKL okl = (OKL) interfaceC09390do2.getValue();
                                                                        Integer num = C05F.A0N;
                                                                        Integer num2 = C05F.A00;
                                                                        okl.A00(num, num2);
                                                                        ((OKL) interfaceC09390do2.getValue()).A00(num2, num2);
                                                                        ((OKL) interfaceC09390do2.getValue()).A00(C05F.A01, num2);
                                                                        ((OKL) interfaceC09390do2.getValue()).A00(C05F.A0C, num2);
                                                                        TextView textView3 = this.A06;
                                                                        if (textView3 == null) {
                                                                            str2 = "glassesConnectedLink";
                                                                        } else {
                                                                            C0fQ.A00(new ViewOnClickListenerC35689FpO(this, 26), textView3);
                                                                            A01(this);
                                                                            A00(this);
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
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A01(N55 n55) {
        InterfaceC09390do interfaceC09390do = n55.A0a;
        if (AbstractC195888lY.A01(n55.requireContext(), AbstractC166987dD.A0r(interfaceC09390do))) {
            C37101o8.A00(AbstractC195888lY.A00()).A00(n55.requireContext(), AbstractC166987dD.A0r(interfaceC09390do), new PH0(n55, 1), "sup:SupGlassesToolkit_ADD_CB");
        }
    }

    public static final void A02(N55 n55) {
        String str;
        String str2;
        String str3 = n55.A0P;
        if ((str3 == null || str3.length() == 0) && (((str = n55.A0O) == null || str.length() == 0) && ((str2 = n55.A0Q) == null || str2.length() == 0))) {
            return;
        }
        ShimmerFrameLayout shimmerFrameLayout = n55.A0A;
        String str4 = "headerGlassesDeviceNameShimmer";
        if (shimmerFrameLayout != null) {
            shimmerFrameLayout.A03();
            ShimmerFrameLayout shimmerFrameLayout2 = n55.A0A;
            if (shimmerFrameLayout2 != null) {
                shimmerFrameLayout2.setVisibility(8);
                View view = n55.A02;
                if (view == null) {
                    str4 = "headerGlassesDeviceNameEmpty";
                } else {
                    view.setVisibility(8);
                    TextView textView = n55.A07;
                    if (textView != null) {
                        textView.setVisibility(0);
                        ShimmerFrameLayout shimmerFrameLayout3 = n55.A0C;
                        String str5 = "headerGlassesModelNameShimmer";
                        if (shimmerFrameLayout3 != null) {
                            shimmerFrameLayout3.A03();
                            ShimmerFrameLayout shimmerFrameLayout4 = n55.A0C;
                            if (shimmerFrameLayout4 != null) {
                                shimmerFrameLayout4.setVisibility(8);
                                View view2 = n55.A03;
                                if (view2 == null) {
                                    str4 = "headerGlassesModelNameEmpty";
                                } else {
                                    view2.setVisibility(8);
                                    TextView textView2 = n55.A08;
                                    str5 = "headerGlassesModelName";
                                    if (textView2 != null) {
                                        textView2.setVisibility(0);
                                        ShimmerFrameLayout shimmerFrameLayout5 = n55.A0B;
                                        if (shimmerFrameLayout5 != null) {
                                            shimmerFrameLayout5.A03();
                                            ShimmerFrameLayout shimmerFrameLayout6 = n55.A0B;
                                            if (shimmerFrameLayout6 != null) {
                                                shimmerFrameLayout6.setVisibility(8);
                                                CircularImageView circularImageView = n55.A0F;
                                                if (circularImageView == null) {
                                                    str4 = "headerGlassesPictureEmpty";
                                                } else {
                                                    circularImageView.setVisibility(8);
                                                    IgImageView igImageView = n55.A0I;
                                                    str4 = "headerUserProfilePicture";
                                                    if (igImageView != null) {
                                                        igImageView.setVisibility(0);
                                                        TextView textView3 = n55.A08;
                                                        if (textView3 != null) {
                                                            textView3.setText(n55.A0P);
                                                            IgImageView igImageView2 = n55.A0I;
                                                            if (igImageView2 != null) {
                                                                igImageView2.setUrl(AbstractC166987dD.A0o(n55.A0a), AbstractC25225BEi.A0t(n55.A0O), n55);
                                                                IgdsListCell igdsListCell = n55.A0K;
                                                                if (igdsListCell == null) {
                                                                    str4 = "glassesVersionListCell";
                                                                } else {
                                                                    igdsListCell.A0K(String.valueOf(n55.A0Q), false);
                                                                    TextView textView4 = n55.A07;
                                                                    if (textView4 != null) {
                                                                        AbstractC25227BEk.A12(textView4, n55, 2131974234);
                                                                        return;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        C14360o3.A0F("headerGlassesImageShimmer");
                                        throw C00O.createAndThrow();
                                    }
                                }
                            }
                        }
                        C14360o3.A0F(str5);
                        throw C00O.createAndThrow();
                    }
                    C14360o3.A0F("headerGlassesDeviceName");
                    throw C00O.createAndThrow();
                }
            }
        }
        C14360o3.A0F(str4);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0a);
    }

    public N55() {
        C37061GUv c37061GUv = new C37061GUv(this, 5);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C37061GUv(new C37061GUv(this, 1), 2));
        this.A0c = AbstractC25225BEi.A0a(new C37061GUv(A00, 3), c37061GUv, new C57252Pba(18, null, A00), AbstractC25225BEi.A1D(C50936Mf5.class));
        this.A0Z = "sup:GlassesEducationToolkit";
        this.A0U = true;
        this.A0d = new MY1(this, 15);
        this.A0X = new NG6(this, 2);
        this.A0Y = new NG6(this, 3);
        this.A0W = new NG6(this, 1);
    }

    public static final void A00(N55 n55) {
        SettableFuture settableFuture;
        Context requireContext = n55.requireContext();
        UserSession A0r = AbstractC166987dD.A0r(n55.A0a);
        C14360o3.A0B(A0r, 1);
        if (StellaIpcDirectMessagingServiceClient._instance == null) {
            synchronized (StellaIpcDirectMessagingServiceClient.class) {
                StellaIpcDirectMessagingServiceClient._instance = (StellaIpcDirectMessagingServiceClient) A0r.A01(StellaIpcDirectMessagingServiceClient.class, new C50171MDy(8, requireContext, A0r));
            }
        }
        StellaIpcDirectMessagingServiceClient stellaIpcDirectMessagingServiceClient = StellaIpcDirectMessagingServiceClient._instance;
        OIP oip = new OIP(requireContext, ImmutableMap.of((Object) CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, (Object) "", (Object) TraceFieldType.RequestID, (Object) ""), A0r);
        if (stellaIpcDirectMessagingServiceClient != null) {
            settableFuture = stellaIpcDirectMessagingServiceClient.runIpcRequest(oip);
        } else {
            settableFuture = null;
        }
        C2OD.A03(new C55808OqJ(n55, 2), AbstractRunnableC133325zz.A02(new C64285T7u(5, new C50268MHx(1, oip, A0r)), settableFuture, C14250np.A00().A00), C1M8.A01);
    }

    public static final void A03(N55 n55, boolean z) {
        String str;
        if (AbstractC93174Ft.A03(n55.requireContext())) {
            Context requireContext = n55.requireContext();
            List list = C16930sl.A00;
            try {
                ContentResolver contentResolver = requireContext.getContentResolver();
                C14360o3.A07(contentResolver);
                list = C8a1.A02(contentResolver, "Meta View", false);
            } catch (SecurityException unused) {
            }
            n55.A0V = AbstractC43592JPx.A0s(list);
        }
        Integer num = n55.A0V;
        if (num == null) {
            str = "";
        } else {
            str = String.valueOf(num);
        }
        if (n55.A00 > 0 && z) {
            IgdsListCell igdsListCell = n55.A0J;
            if (igdsListCell != null) {
                igdsListCell.A0K(str, true);
                return;
            }
        } else {
            IgdsListCell igdsListCell2 = n55.A0J;
            if (igdsListCell2 != null) {
                igdsListCell2.A0K("", false);
                IgdsListCell igdsListCell3 = n55.A0J;
                if (igdsListCell3 != null) {
                    igdsListCell3.A0K(str, false);
                    return;
                }
            }
        }
        C14360o3.A0F("glassesMediaListCell");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-804281864);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.smart_glasses_education_toolkit_fragment, viewGroup, false);
        this.A0K = (IgdsListCell) inflate.requireViewById(R.id.glasses_version_list_cell);
        this.A0J = (IgdsListCell) inflate.requireViewById(R.id.glasses_media_list_cell);
        this.A0M = (IgdsListCell) inflate.requireViewById(R.id.help_streaming_list_cell);
        this.A0L = (IgdsListCell) inflate.requireViewById(R.id.help_content_list_cell);
        this.A04 = AbstractC166997dE.A0T(inflate, R.id.connectivity_title);
        this.A05 = AbstractC166997dE.A0T(inflate, R.id.connectivity_text);
        this.A06 = AbstractC166997dE.A0T(inflate, R.id.connectivity_link);
        this.A09 = AbstractC166997dE.A0T(inflate, R.id.health_percentage);
        this.A0H = AbstractC31172DnG.A0Z(inflate, R.id.connectivity_icon);
        this.A0G = AbstractC31172DnG.A0Z(inflate, R.id.battery_health_icon);
        C0f9.A09(669506726, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1717302220);
        super.onDestroyView();
        C54845OMq c54845OMq = this.A0D;
        if (c54845OMq != null) {
            c54845OMq.A06("sup:SupGlassesToolkit_KEY");
        }
        C0f9.A09(375021165, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-257238266);
        super.onPause();
        C54845OMq c54845OMq = this.A0D;
        if (c54845OMq != null) {
            c54845OMq.A02(0);
            this.A0T = false;
        }
        C0f9.A09(-1861473573, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(965491804);
        super.onResume();
        C54845OMq c54845OMq = this.A0D;
        if (c54845OMq != null) {
            InterfaceC58276PsU interfaceC58276PsU = c54845OMq.A0B;
            if (!interfaceC58276PsU.isConnected() && !this.A0T) {
                interfaceC58276PsU.release();
                PZC.A02(this, AbstractC25229BEm.A0a(this), 37);
            }
        }
        C0f9.A09(-1045779211, A02);
    }

    @Override // X.AbstractC59962oe, X.AbstractC59972of
    public final void onSetUserVisibleHint(boolean z, boolean z2) {
        AbstractC55106ObM A00;
        super.onSetUserVisibleHint(z, z2);
        if (z2) {
            if (!z) {
                C190308bo c190308bo = C190298bn.A03;
                InterfaceC09390do interfaceC09390do = this.A0a;
                C190298bn A01 = c190308bo.A01(AbstractC166987dD.A0r(interfaceC09390do));
                if (A01 != null) {
                    A01.A00();
                }
                C190298bn A012 = c190308bo.A01(AbstractC166987dD.A0r(interfaceC09390do));
                if (A012 != null && (A00 = A012.A00()) != null) {
                    A00.A08(new N1R(false));
                }
                C54845OMq c54845OMq = this.A0D;
                if (c54845OMq != null) {
                    c54845OMq.A06("sup:SupGlassesToolkit_KEY");
                    AnonymousClass195 anonymousClass195 = this.A0R;
                    if (anonymousClass195 != null) {
                        anonymousClass195.AGH(null);
                    }
                    InterfaceC09390do interfaceC09390do2 = this.A0c;
                    ((C50936Mf5) interfaceC09390do2.getValue()).A04.Egh(null);
                    ((C50936Mf5) interfaceC09390do2.getValue()).A03.Egh(EnumC53156NfB.A05);
                    C54845OMq c54845OMq2 = this.A0D;
                    if (c54845OMq2 != null) {
                        c54845OMq2.A02(0);
                        this.A0U = false;
                        return;
                    }
                }
                C14360o3.A0F("mediaStreamController");
                throw C00O.createAndThrow();
            }
            return;
        }
        if (!z) {
            return;
        }
        this.A0U = true;
        PZC.A02(this, AbstractC25229BEm.A0a(this), 38);
    }
}
