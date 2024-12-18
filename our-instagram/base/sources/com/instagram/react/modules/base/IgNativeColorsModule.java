package com.instagram.react.modules.base;

import X.AbstractC166987dD;
import X.AbstractC25228BEl;
import X.AbstractC58321PtD;
import X.AbstractC58322PtE;
import X.R3M;
import com.facebook.R;
import com.facebook.fbreact.specs.NativeIGNativeColorsSpec;
import com.facebook.react.module.annotations.ReactModule;
import java.util.HashMap;
import java.util.Map;

@ReactModule(name = "IGNativeColors")
/* loaded from: classes10.dex */
public class IgNativeColorsModule extends NativeIGNativeColorsSpec {
    public static final String MODULE_NAME = "IGNativeColors";

    @Override // com.facebook.fbreact.specs.NativeIGNativeColorsSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "IGNativeColors";
    }

    public IgNativeColorsModule(R3M r3m) {
        super(r3m);
    }

    public static String parseColorInteger(int i) {
        return String.format("#%06X", AbstractC25228BEl.A1Y(i & 16777215));
    }

    @Override // com.facebook.fbreact.specs.NativeIGNativeColorsSpec
    public Map getTypedExportedConstants() {
        HashMap A1G = AbstractC166987dD.A1G();
        R3M A0b = AbstractC58321PtD.A0b(this);
        A1G.put("grey9", AbstractC58322PtE.A0m(A0b, R.color.grey_9));
        A1G.put("grey8", AbstractC58322PtE.A0m(A0b, R.color.gradient_dark));
        A1G.put("grey7", AbstractC58322PtE.A0m(A0b, R.color.gradient_light));
        A1G.put("grey6", AbstractC58322PtE.A0m(A0b, R.color.grey_6));
        A1G.put("grey5", AbstractC58322PtE.A0m(A0b, R.color.grey_5));
        A1G.put("grey4", AbstractC58322PtE.A0m(A0b, R.color.grey_4));
        A1G.put("grey3", AbstractC58322PtE.A0m(A0b, R.color.baseline_neutral_80));
        A1G.put("grey2", AbstractC58322PtE.A0m(A0b, R.color.grey_2));
        A1G.put("grey1", AbstractC58322PtE.A0m(A0b, R.color.grey_1));
        A1G.put("grey0", AbstractC58322PtE.A0m(A0b, R.color.grey_0));
        A1G.put("blue9", AbstractC58322PtE.A0m(A0b, R.color.blue_9));
        A1G.put("blue8", AbstractC58322PtE.A0m(A0b, R.color.blue_8));
        A1G.put("blue7", AbstractC58322PtE.A0m(A0b, R.color.blue_7));
        A1G.put("blue6", AbstractC58322PtE.A0m(A0b, R.color.blue_6));
        A1G.put("blue5", AbstractC58322PtE.A0m(A0b, R.color.badge_color));
        A1G.put("blue4", AbstractC58322PtE.A0m(A0b, R.color.blue_4));
        A1G.put("blue3", AbstractC58322PtE.A0m(A0b, R.color.blue_3));
        A1G.put("blue2", AbstractC58322PtE.A0m(A0b, R.color.blue_2));
        A1G.put("blue1", AbstractC58322PtE.A0m(A0b, R.color.blue_1));
        A1G.put("blue0", AbstractC58322PtE.A0m(A0b, R.color.blue_0));
        A1G.put("red9", AbstractC58322PtE.A0m(A0b, R.color.red_9));
        A1G.put("red8", AbstractC58322PtE.A0m(A0b, R.color.red_8));
        A1G.put("red7", AbstractC58322PtE.A0m(A0b, R.color.red_7));
        A1G.put("red6", AbstractC58322PtE.A0m(A0b, R.color.red_6));
        A1G.put("red5", AbstractC58322PtE.A0m(A0b, R.color.red_5));
        A1G.put("red4", AbstractC58322PtE.A0m(A0b, R.color.red_4));
        A1G.put("red3", AbstractC58322PtE.A0m(A0b, R.color.red_3));
        A1G.put("red2", AbstractC58322PtE.A0m(A0b, R.color.red_2));
        A1G.put("red1", AbstractC58322PtE.A0m(A0b, R.color.red_1));
        A1G.put("red0", AbstractC58322PtE.A0m(A0b, R.color.red_0));
        A1G.put("orange9", AbstractC58322PtE.A0m(A0b, R.color.orange_9));
        A1G.put("orange8", AbstractC58322PtE.A0m(A0b, R.color.orange_8));
        A1G.put("orange7", AbstractC58322PtE.A0m(A0b, R.color.orange_7));
        A1G.put("orange6", AbstractC58322PtE.A0m(A0b, R.color.orange_6));
        A1G.put("orange5", AbstractC58322PtE.A0m(A0b, R.color.clips_gradient_redesign_color_1));
        A1G.put("orange4", AbstractC58322PtE.A0m(A0b, R.color.orange_4));
        A1G.put("orange3", AbstractC58322PtE.A0m(A0b, R.color.orange_3));
        A1G.put("orange2", AbstractC58322PtE.A0m(A0b, R.color.orange_2));
        A1G.put("orange1", AbstractC58322PtE.A0m(A0b, R.color.orange_1));
        A1G.put("orange0", AbstractC58322PtE.A0m(A0b, R.color.orange_0));
        A1G.put("green9", AbstractC58322PtE.A0m(A0b, R.color.green_9));
        A1G.put("green8", AbstractC58322PtE.A0m(A0b, R.color.green_8));
        A1G.put("green7", AbstractC58322PtE.A0m(A0b, R.color.green_7));
        A1G.put("green6", AbstractC58322PtE.A0m(A0b, R.color.green_6));
        A1G.put("green5", AbstractC58322PtE.A0m(A0b, R.color.green_5));
        A1G.put("green4", AbstractC58322PtE.A0m(A0b, R.color.green_4));
        A1G.put("green3", AbstractC58322PtE.A0m(A0b, R.color.green_3));
        A1G.put("green2", AbstractC58322PtE.A0m(A0b, R.color.green_2));
        A1G.put("green1", AbstractC58322PtE.A0m(A0b, R.color.green_0));
        A1G.put("green0", AbstractC58322PtE.A0m(A0b, R.color.green_0));
        return A1G;
    }
}
