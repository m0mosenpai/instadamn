package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

/* renamed from: X.XgB, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72542XgB {
    public static WFT[] A00(C72750XmR c72750XmR, C72772Xmp c72772Xmp) {
        int i;
        int i2 = c72750XmR.A00;
        Y0y[] y0yArr = c72750XmR.A02;
        WFT[] wftArr = new WFT[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            Y0y y0y = y0yArr[i3];
            WFT wft = y0y.A00;
            if (wft == null) {
                String str = y0y.A02;
                if (str.equalsIgnoreCase(IgReactMediaPickerNativeModule.WIDTH)) {
                    i = c72772Xmp.A02;
                } else if (str.equalsIgnoreCase(IgReactMediaPickerNativeModule.HEIGHT)) {
                    i = c72772Xmp.A01;
                } else if (str.equalsIgnoreCase("duration")) {
                    i = c72772Xmp.A00 / 1000;
                } else {
                    wft = y0y.A01.A00(y0y.A02);
                }
                wft = new WFT(i);
            }
            wftArr[i3] = wft;
        }
        return wftArr;
    }
}
