package X;

import android.os.Bundle;
import com.facebook.dsp.core.ColorData;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.meta.foa.cds.CdsBottomSheetDimmingBehaviour;
import com.meta.foa.cds.CdsBottomSheetTopSpan;
import com.meta.foa.cds.CdsOpenScreenConfig$BottomSheetMargins;
import com.meta.foa.cds.CdsOpenScreenDismissCallback;

/* renamed from: X.Vps, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69513Vps {
    public final C65981Txa A00(Bundle bundle) {
        Integer num;
        EnumC68205VFx enumC68205VFx;
        EnumC68200VFs enumC68200VFs;
        EnumC68201VFt enumC68201VFt;
        Integer num2;
        Object A02;
        Object A022;
        bundle.setClassLoader(C65981Txa.class.getClassLoader());
        int i = bundle.getInt("container_id");
        String string = bundle.getString("dark_mode_config");
        if (string != null) {
            num = U76.A00(string);
        } else {
            num = C05F.A0C;
        }
        String string2 = bundle.getString("drag_to_dismiss", U6G.A04.toString());
        C14360o3.A07(string2);
        U6G A00 = U6F.A00(string2);
        String string3 = bundle.getString(DatePickerDialogModule.ARG_MODE, U6H.A08.toString());
        C14360o3.A07(string3);
        U6H A002 = U6E.A00(string3);
        EnumC68205VFx enumC68205VFx2 = EnumC68205VFx.A08;
        String string4 = bundle.getString("background_mode", enumC68205VFx2.toString());
        C14360o3.A07(string4);
        EnumC68205VFx[] enumC68205VFxArr = EnumC68205VFx.A01;
        int length = enumC68205VFxArr.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                enumC68205VFx = enumC68205VFxArr[i2];
                if (C14360o3.A0K(enumC68205VFx.toString(), string4)) {
                    break;
                }
                i2++;
            } else {
                C50662Um.A03(C65981Txa.A0T, AnonymousClass001.A0R("Error finding BackgroundMode enum value for: ", string4));
                enumC68205VFx = enumC68205VFx2;
                break;
            }
        }
        EnumC68200VFs enumC68200VFs2 = EnumC68200VFs.A04;
        String string5 = bundle.getString("corner_style", enumC68200VFs2.toString());
        C14360o3.A07(string5);
        EnumC68200VFs[] enumC68200VFsArr = EnumC68200VFs.A01;
        int length2 = enumC68200VFsArr.length;
        int i3 = 0;
        while (true) {
            if (i3 < length2) {
                enumC68200VFs = enumC68200VFsArr[i3];
                if (C14360o3.A0K(enumC68200VFs.toString(), string5)) {
                    break;
                }
                i3++;
            } else {
                C50662Um.A03(C65981Txa.A0T, AnonymousClass001.A0R("Error finding Mode enum value for ", string5));
                enumC68200VFs = enumC68200VFs2;
                break;
            }
        }
        EnumC68201VFt enumC68201VFt2 = EnumC68201VFt.A04;
        String string6 = bundle.getString("dimmed_background_tap_to_dismiss", enumC68201VFt2.toString());
        C14360o3.A07(string6);
        EnumC68201VFt[] enumC68201VFtArr = EnumC68201VFt.A01;
        int length3 = enumC68201VFtArr.length;
        int i4 = 0;
        while (true) {
            if (i4 < length3) {
                enumC68201VFt = enumC68201VFtArr[i4];
                if (C14360o3.A0K(enumC68201VFt.toString(), string6)) {
                    break;
                }
                i4++;
            } else {
                C50662Um.A03(C65981Txa.A0T, AnonymousClass001.A0R("Error finding DimmedBackgroundTapToDismiss enum value for: ", string6));
                enumC68201VFt = enumC68201VFt2;
                break;
            }
        }
        if (bundle.containsKey("keyboard_soft_input_mode")) {
            num2 = AbstractC31179DnN.A0X(bundle, "keyboard_soft_input_mode");
        } else {
            num2 = null;
        }
        Integer A003 = U63.A00(bundle.getString("animation_type", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT));
        C14360o3.A07(A003);
        Integer A004 = U63.A00(bundle.getString("dismiss_animation_type", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT));
        C14360o3.A07(A004);
        int i5 = bundle.getInt("on_dismiss_callback", -1);
        if (i5 == -1) {
            A02 = null;
        } else {
            A02 = AbstractC66261U6f.A02(CdsOpenScreenDismissCallback.class, Integer.valueOf(i5));
        }
        CdsOpenScreenDismissCallback cdsOpenScreenDismissCallback = (CdsOpenScreenDismissCallback) A02;
        int i6 = bundle.getInt("custom_loading_view_resolver", -1);
        if (i6 == -1) {
            A022 = null;
        } else {
            A022 = AbstractC66261U6f.A02(C68894Vdq.class, Integer.valueOf(i6));
        }
        C68894Vdq c68894Vdq = (C68894Vdq) A022;
        boolean z = bundle.getBoolean("custom_loading_view_resolver", false);
        boolean z2 = bundle.getBoolean("native_disable_cancel_button_on_loading_screen", false);
        boolean z3 = bundle.getBoolean("clear_top_activity", false);
        ColorData colorData = (ColorData) bundle.getParcelable("dimmed_background_color");
        ColorData colorData2 = (ColorData) bundle.getParcelable("background_overlay_color");
        CdsOpenScreenConfig$BottomSheetMargins cdsOpenScreenConfig$BottomSheetMargins = (CdsOpenScreenConfig$BottomSheetMargins) bundle.getParcelable("bottom_sheet_margins");
        String string7 = bundle.getString("bloks_screen_id", null);
        CdsBottomSheetTopSpan cdsBottomSheetTopSpan = (CdsBottomSheetTopSpan) bundle.getParcelable("bottom_sheet_top_span");
        boolean z4 = bundle.getBoolean("slide_to_anchor_immediately");
        boolean z5 = bundle.getBoolean("force_gradient_background");
        CdsBottomSheetDimmingBehaviour cdsBottomSheetDimmingBehaviour = (CdsBottomSheetDimmingBehaviour) bundle.getParcelable("key_dimming_behaviour");
        if (cdsBottomSheetDimmingBehaviour == null) {
            cdsBottomSheetDimmingBehaviour = CdsBottomSheetDimmingBehaviour.Default.A00;
        }
        if (cdsOpenScreenConfig$BottomSheetMargins == null && AbstractC68607VXi.A00()) {
            enumC68200VFs = EnumC68200VFs.A05;
        }
        return new C65981Txa(c68894Vdq, colorData, colorData2, cdsBottomSheetDimmingBehaviour, cdsBottomSheetTopSpan, enumC68205VFx, cdsOpenScreenConfig$BottomSheetMargins, enumC68200VFs, enumC68201VFt, A00, A002, cdsOpenScreenDismissCallback, num, num2, A003, A004, string7, i, z3, z, z2, z4, z5);
    }
}
