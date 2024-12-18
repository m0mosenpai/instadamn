package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import com.fbpay.util.tooltip.TooltipInfo;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class UvX extends C67677Uvp {
    public UvY A00;
    public final InterfaceC16660sJ A01;

    @Override // X.C67677Uvp
    public void setViewModel(UvM uvM) {
        C14360o3.A0B(uvM, 0);
        super.setViewModel(uvM);
        this.A00 = (UvY) uvM;
    }

    @Override // X.C67677Uvp
    public String getExistingError() {
        String str;
        String A0K;
        UvZ uvZ;
        UvY uvY = this.A00;
        if (uvY != null) {
            String str2 = (String) ((AbstractC129435t5) uvY).A05.A02();
            boolean z = true;
            if (str2 != null && str2.length() != 0 && (uvZ = uvY.A02) != null) {
                z = uvZ.A01(str2);
            }
            UvY uvY2 = this.A00;
            if (uvY2 != null) {
                String str3 = (String) ((AbstractC129435t5) uvY2).A05.A02();
                if (str3 != null && str3.length() != 0) {
                    str = EnumC61219RhJ.A06.A02(str3).A03;
                } else {
                    str = null;
                }
                UvY uvY3 = this.A00;
                if (uvY3 != null) {
                    if (uvY3.A03 && !z && str != null && !str.equals("Unknown")) {
                        String A0r = AbstractC166997dE.A0r(getResources(), str, 2131954884);
                        C14360o3.A07(A0r);
                        A0K = String.format(A0r, Arrays.copyOf(new Object[0], 0));
                    } else if (uvY3.A0J() != 0) {
                        Resources resources = getResources();
                        UvY uvY4 = this.A00;
                        if (uvY4 != null) {
                            A0K = resources.getString(uvY4.A0J());
                        }
                    } else {
                        UvY uvY5 = this.A00;
                        if (uvY5 != null) {
                            A0K = uvY5.A0K();
                            if (A0K != null) {
                                return A0K;
                            }
                            return "";
                        }
                    }
                    C14360o3.A07(A0K);
                    return A0K;
                }
            }
        }
        C14360o3.A0F("viewModel");
        throw C00O.createAndThrow();
    }

    public UvX(Context context) {
        super(context);
        this.A01 = new X59(this, 20);
    }

    public static final /* synthetic */ void A00(UvX uvX) {
        uvX.getTooltipInfo();
    }

    public final TooltipInfo getTooltipInfo() {
        return new TooltipInfo(2131954868, 0, 0, 0, 0, (int) TypedValue.applyDimension(1, 8.0f, AbstractC167007dF.A0K(AbstractC166997dE.A0L(this))));
    }

    @Override // X.C67677Uvp, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(445268877);
        super.onAttachedToWindow();
        UvY uvY = this.A00;
        if (uvY == null) {
            C14360o3.A0F("viewModel");
            throw C00O.createAndThrow();
        }
        uvY.A01.A09(new C9LO(13, this.A01));
        C0f9.A0D(194202932, A06);
    }

    @Override // X.C67677Uvp, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(-1880842770);
        super.onDetachedFromWindow();
        UvY uvY = this.A00;
        if (uvY == null) {
            C14360o3.A0F("viewModel");
            throw C00O.createAndThrow();
        }
        uvY.A01.A08(new C9LO(13, this.A01));
        C0f9.A0D(-1486030538, A06);
    }

    @Override // X.C67677Uvp, X.X9f
    public /* bridge */ /* synthetic */ void setViewModel(AbstractC129435t5 abstractC129435t5) {
        setViewModel((UvM) abstractC129435t5);
    }
}
