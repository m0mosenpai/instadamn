package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.expresscheckout.models.EcpUIConfiguration;
import com.facebookpay.logging.LoggingContext;

/* renamed from: X.Uwp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67723Uwp extends AbstractC66388UEw implements XCE {
    public ContextThemeWrapper A00;
    public ShimmerFrameLayout A01;
    public ShimmerFrameLayout A02;
    public ShimmerFrameLayout A03;
    public UFK A04;
    public ECPHandler A05;
    public EcpUIConfiguration A06;
    public LoggingContext A07;

    @Override // X.AbstractC66388UEw, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            View requireViewById = view.requireViewById(R.id.title_shimmer_view);
            C14360o3.A0C(requireViewById, "null cannot be cast to non-null type com.facebook.shimmer.ShimmerFrameLayout");
            this.A03 = (ShimmerFrameLayout) requireViewById;
            View requireViewById2 = view.requireViewById(R.id.subtitle_shimmer_view);
            C14360o3.A0C(requireViewById2, "null cannot be cast to non-null type com.facebook.shimmer.ShimmerFrameLayout");
            this.A02 = (ShimmerFrameLayout) requireViewById2;
            View requireViewById3 = view.requireViewById(R.id.body_shimmer_view);
            C14360o3.A0C(requireViewById3, "null cannot be cast to non-null type com.facebook.shimmer.ShimmerFrameLayout");
            this.A01 = (ShimmerFrameLayout) requireViewById3;
            ViewGroup viewGroup = (ViewGroup) view.requireViewById(R.id.ecp_loading_layout);
            EcpUIConfiguration ecpUIConfiguration = this.A06;
            if (ecpUIConfiguration == null) {
                str = "ecpUIConfiguration";
            } else {
                if (ecpUIConfiguration.A07.A07) {
                    WFM wfm = VYM.A00;
                    C14360o3.A0A(viewGroup);
                    wfm.A04(viewGroup);
                }
                ShimmerFrameLayout shimmerFrameLayout = this.A03;
                if (shimmerFrameLayout != null) {
                    C2FP.A0A();
                    requireContext();
                    Drawable drawable = activity.getDrawable(R.drawable.fbpay_shimmer_background);
                    if (drawable != null) {
                        C2FP.A0A();
                        AbstractC65702TsY.A0t(requireContext(), drawable, shimmerFrameLayout, R.color.igds_primary_text);
                        ShimmerFrameLayout shimmerFrameLayout2 = this.A02;
                        if (shimmerFrameLayout2 != null) {
                            C2FP.A0A();
                            requireContext();
                            Drawable drawable2 = activity.getDrawable(R.drawable.fbpay_shimmer_background);
                            if (drawable2 != null) {
                                C2FP.A0A();
                                AbstractC65702TsY.A0t(requireContext(), drawable2, shimmerFrameLayout2, R.color.igds_primary_text);
                                ShimmerFrameLayout shimmerFrameLayout3 = this.A01;
                                str = "bodyShimmerView";
                                if (shimmerFrameLayout3 != null) {
                                    C2FP.A0A();
                                    requireContext();
                                    Drawable drawable3 = activity.getDrawable(R.drawable.fbpay_shimmer_background);
                                    if (drawable3 != null) {
                                        C2FP.A0A();
                                        AbstractC65702TsY.A0t(requireContext(), drawable3, shimmerFrameLayout3, R.color.igds_primary_text);
                                        ShimmerFrameLayout shimmerFrameLayout4 = this.A03;
                                        if (shimmerFrameLayout4 != null) {
                                            AbstractC68349VNj.A00(shimmerFrameLayout4, null);
                                            ShimmerFrameLayout shimmerFrameLayout5 = this.A02;
                                            if (shimmerFrameLayout5 != null) {
                                                AbstractC68349VNj.A00(shimmerFrameLayout5, null);
                                                ShimmerFrameLayout shimmerFrameLayout6 = this.A01;
                                                if (shimmerFrameLayout6 != null) {
                                                    AbstractC68349VNj.A00(shimmerFrameLayout6, null);
                                                    ShimmerFrameLayout shimmerFrameLayout7 = this.A03;
                                                    if (shimmerFrameLayout7 != null) {
                                                        shimmerFrameLayout7.setVisibility(0);
                                                        ShimmerFrameLayout shimmerFrameLayout8 = this.A02;
                                                        if (shimmerFrameLayout8 != null) {
                                                            shimmerFrameLayout8.setVisibility(0);
                                                            ShimmerFrameLayout shimmerFrameLayout9 = this.A01;
                                                            if (shimmerFrameLayout9 != null) {
                                                                shimmerFrameLayout9.setVisibility(0);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                        C14360o3.A0F("subtitleShimmerView");
                        throw C00O.createAndThrow();
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                C14360o3.A0F("titleShimmerView");
                throw C00O.createAndThrow();
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        UFK ufk = this.A04;
        if (ufk != null) {
            AbstractC31180DnO.A1F(this, ufk.A06, new X58(this, 44), 32);
            UFK ufk2 = this.A04;
            if (ufk2 != null) {
                AbstractC31180DnO.A1F(this, ufk2.A05, new X58(this, 45), 32);
                return;
            }
        }
        C14360o3.A0F("ecpUrlViewModel");
        throw C00O.createAndThrow();
    }

    @Override // X.XCE
    public final void ETZ(ECPHandler eCPHandler) {
        this.A05 = eCPHandler;
        UFK ufk = this.A04;
        if (ufk != null) {
            if (eCPHandler != null) {
                ECPHandler eCPHandler2 = ufk.A00;
                if (eCPHandler2 != null && !eCPHandler2.equals(eCPHandler)) {
                    throw new IllegalStateException("Cannot override previous ECP handler with a new handler for the same checkout ViewModel instance");
                }
                ufk.A00 = eCPHandler;
                return;
            }
            throw new IllegalStateException("Attempting to set null value for EcpHandler. This will result in lossy event-handling behavior");
        }
    }

    @Override // X.XCE
    public final boolean D1o(LoggingContext loggingContext, Integer num) {
        boolean A1a = AbstractC167017dG.A1a(num, loggingContext);
        UFK ufk = this.A04;
        if (ufk == null) {
            C14360o3.A0F("ecpUrlViewModel");
            throw C00O.createAndThrow();
        }
        ufk.A00(loggingContext, num);
        return A1a;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1206022619);
        super.onCreate(bundle);
        UFK ufk = (UFK) new C52942bb(this).A00(UFK.class);
        this.A04 = ufk;
        ECPHandler eCPHandler = this.A05;
        if (eCPHandler != null) {
            if (ufk != null) {
                ECPHandler eCPHandler2 = ufk.A00;
                if (eCPHandler2 != null && !eCPHandler2.equals(eCPHandler)) {
                    throw new IllegalStateException("Cannot override previous ECP handler with a new handler for the same checkout ViewModel instance");
                }
                ufk.A00 = eCPHandler;
            }
            C14360o3.A0F("ecpUrlViewModel");
            throw C00O.createAndThrow();
        }
        UFK ufk2 = this.A04;
        if (ufk2 != null) {
            Bundle requireArguments = requireArguments();
            ufk2.A06.A0B(null);
            ufk2.A05.A0B(null);
            String string = requireArguments.getString(AbstractC63083Sc6.A00());
            if (string != null) {
                ufk2.A04 = string;
                String string2 = requireArguments.getString("product_id");
                if (string2 != null) {
                    ufk2.A02 = string2;
                    String string3 = requireArguments.getString("order_id");
                    if (string3 != null) {
                        ufk2.A01 = string3;
                        String string4 = requireArguments.getString("receiver_id");
                        if (string4 != null) {
                            ufk2.A03 = string4;
                            String str = ufk2.A04;
                            if (str == null) {
                                C14360o3.A0F("sessionId");
                                throw C00O.createAndThrow();
                            }
                            String str2 = ufk2.A02;
                            if (str2 == null) {
                                C14360o3.A0F("productId");
                                throw C00O.createAndThrow();
                            }
                            String str3 = ufk2.A01;
                            if (str3 == null) {
                                C14360o3.A0F("orderId");
                                throw C00O.createAndThrow();
                            }
                            Parcelable parcelable = requireArguments.getParcelable("ECP_UI_CONFIGURATION");
                            if (parcelable != null) {
                                C19L c19l = (C19L) ufk2.A07.getValue();
                                AbstractC23641Du.A05(AnonymousClass191.A00, new C71766X2c(parcelable, ufk2, string4, str, str3, str2, null, 0), c19l);
                                Parcelable parcelable2 = requireArguments().getParcelable("ECP_UI_CONFIGURATION");
                                C14360o3.A0C(parcelable2, "null cannot be cast to non-null type com.facebookpay.expresscheckout.models.EcpUIConfiguration");
                                this.A06 = (EcpUIConfiguration) parcelable2;
                                C0f9.A09(1152000562, A02);
                                return;
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        C14360o3.A0F("ecpUrlViewModel");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(2080278597);
        ContextThemeWrapper A00 = AbstractC66388UEw.A00(this, layoutInflater);
        this.A00 = A00;
        View inflate = layoutInflater.cloneInContext(A00).inflate(R.layout.ecp_loading_content_fragment, viewGroup, false);
        C0f9.A09(-1458969016, A02);
        return inflate;
    }

    @Override // X.AbstractC66388UEw, androidx.fragment.app.Fragment
    public final void onResume() {
        String str;
        int A02 = C0f9.A02(-1345204402);
        super.onResume();
        ContextThemeWrapper contextThemeWrapper = this.A00;
        if (contextThemeWrapper == null) {
            str = "viewContext";
        } else {
            EcpUIConfiguration ecpUIConfiguration = this.A06;
            if (ecpUIConfiguration == null) {
                str = "ecpUIConfiguration";
            } else {
                AbstractC68346VNg.A00(contextThemeWrapper, this, ecpUIConfiguration.A07, null, null, new X2w(this, 15), X4E.A00, false, false);
                C0f9.A09(1738224917, A02);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
