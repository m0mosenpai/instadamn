package X;

import android.os.Bundle;
import com.facebook.dsp.core.ColorData;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.meta.foa.cds.CdsBottomSheetDimmingBehaviour;
import com.meta.foa.cds.CdsBottomSheetTopSpan;
import com.meta.foa.cds.CdsOpenScreenConfig$BottomSheetMargins;
import com.meta.foa.cds.CdsOpenScreenDismissCallback;
import java.util.Map;

/* renamed from: X.Txa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65981Txa implements InterfaceC65469Tkm {
    public static final EnumC68205VFx A0N;
    public static final C69513Vps A0O = new Object();
    public static final EnumC68200VFs A0P;
    public static final EnumC68201VFt A0Q;
    public static final U6G A0R;
    public static final U6H A0S;
    public static final String A0T;
    public CdsOpenScreenDismissCallback A00;
    public Integer A01;
    public Integer A02;
    public final int A03;
    public final C68894Vdq A04;
    public final ColorData A05;
    public final ColorData A06;
    public final CdsBottomSheetDimmingBehaviour A07;
    public final CdsBottomSheetTopSpan A08;
    public final EnumC68205VFx A09;
    public final CdsOpenScreenConfig$BottomSheetMargins A0A;
    public final EnumC68200VFs A0B;
    public final EnumC68201VFt A0C;
    public final U6G A0D;
    public final U6H A0E;
    public final Integer A0F;
    public final Integer A0G;
    public final String A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.Vps] */
    static {
        Map map = C0YZ.A03;
        String A01 = AbstractC13230m9.A01(C65981Txa.class);
        C14360o3.A0C(A01, "null cannot be cast to non-null type kotlin.String");
        A0T = A01;
        A0R = U6G.A04;
        A0S = U6H.A08;
        A0N = EnumC68205VFx.A08;
        A0P = EnumC68200VFs.A04;
        A0Q = EnumC68201VFt.A04;
    }

    public final Bundle A00() {
        Bundle bundle = new Bundle();
        bundle.putInt("container_id", this.A03);
        bundle.putString("drag_to_dismiss", this.A0D.A00);
        bundle.putString(DatePickerDialogModule.ARG_MODE, this.A0E.A00);
        bundle.putString("background_mode", this.A09.A00);
        bundle.putString("dimmed_background_tap_to_dismiss", this.A0C.A00);
        Integer num = this.A0G;
        if (num != null) {
            bundle.putInt("keyboard_soft_input_mode", num.intValue());
        }
        Integer num2 = this.A01;
        if (num2 != null) {
            bundle.putString("animation_type", U63.A01(num2));
        }
        Integer num3 = this.A02;
        if (num3 != null) {
            bundle.putString("dismiss_animation_type", U63.A01(num3));
        }
        C68894Vdq c68894Vdq = this.A04;
        if (c68894Vdq != null) {
            bundle.putInt("custom_loading_view_resolver", AbstractC66261U6f.A00(c68894Vdq));
        }
        CdsOpenScreenDismissCallback cdsOpenScreenDismissCallback = this.A00;
        if (cdsOpenScreenDismissCallback != null) {
            bundle.putInt("on_dismiss_callback", AbstractC66261U6f.A00(cdsOpenScreenDismissCallback));
        }
        bundle.putBoolean("native_use_slide_animation_for_full_screen", this.A0K);
        bundle.putBoolean("native_disable_cancel_button_on_loading_screen", this.A0I);
        bundle.putBoolean("clear_top_activity", this.A0L);
        bundle.putParcelable("dimmed_background_color", this.A06);
        bundle.putParcelable("background_overlay_color", this.A05);
        bundle.putParcelable("bottom_sheet_margins", this.A0A);
        bundle.putString("corner_style", this.A0B.A00);
        bundle.setClassLoader(C65981Txa.class.getClassLoader());
        String str = this.A0H;
        if (str != null) {
            bundle.putString("bloks_screen_id", str);
        }
        bundle.putString("dark_mode_config", U76.A01(this.A0F));
        bundle.putParcelable("bottom_sheet_top_span", this.A08);
        bundle.putBoolean("slide_to_anchor_immediately", this.A0M);
        bundle.putBoolean("force_gradient_background", this.A0J);
        bundle.putParcelable("key_dimming_behaviour", this.A07);
        return bundle;
    }

    @Override // X.InterfaceC65469Tkm
    public final Integer BfI() {
        return null;
    }

    @Override // X.InterfaceC65469Tkm
    public final int Bql() {
        return this.A03;
    }

    public C65981Txa(C68894Vdq c68894Vdq, ColorData colorData, ColorData colorData2, CdsBottomSheetDimmingBehaviour cdsBottomSheetDimmingBehaviour, CdsBottomSheetTopSpan cdsBottomSheetTopSpan, EnumC68205VFx enumC68205VFx, CdsOpenScreenConfig$BottomSheetMargins cdsOpenScreenConfig$BottomSheetMargins, EnumC68200VFs enumC68200VFs, EnumC68201VFt enumC68201VFt, U6G u6g, U6H u6h, CdsOpenScreenDismissCallback cdsOpenScreenDismissCallback, Integer num, Integer num2, Integer num3, Integer num4, String str, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A03 = i;
        this.A0F = num;
        this.A0D = u6g;
        this.A0E = u6h;
        this.A09 = enumC68205VFx;
        this.A0C = enumC68201VFt;
        this.A0G = num2;
        this.A01 = num3;
        this.A02 = num4;
        this.A0L = z;
        this.A06 = colorData;
        this.A05 = colorData2;
        this.A0A = cdsOpenScreenConfig$BottomSheetMargins;
        this.A0B = enumC68200VFs;
        this.A00 = cdsOpenScreenDismissCallback;
        this.A04 = c68894Vdq;
        this.A0K = z2;
        this.A0I = z3;
        this.A0H = str;
        this.A08 = cdsBottomSheetTopSpan;
        this.A0M = z4;
        this.A0J = z5;
        this.A07 = cdsBottomSheetDimmingBehaviour;
    }
}
