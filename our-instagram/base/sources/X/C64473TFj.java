package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import com.facebook.CustomTabMainActivity;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.modules.core.RCTNativeAppEventEmitter;
import com.instagram.inappbrowser.fragments.BrowserLiteInMainProcessIGActivity;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

/* renamed from: X.TFj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64473TFj implements InterfaceC41501vz {
    public final int A00;
    public final Object A01;

    public C64473TFj(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03;
        int i;
        AppearanceModule appearanceModule;
        int i2;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-1999696735);
                int A032 = C0f9.A03(433870676);
                ((Activity) this.A01).finish();
                C0f9.A0A(919652038, A032);
                i = 297500813;
                break;
            case 1:
                A03 = C0f9.A03(-2101827479);
                int A033 = C0f9.A03(656529472);
                Context context = (Context) this.A01;
                Intent A08 = MSW.A08(context, CustomTabMainActivity.class);
                A08.setAction("CustomTabMainActivity.action_refresh");
                A08.putExtra("CustomTabMainActivity.extra_url", ((C64471TFh) obj).A00);
                A08.addFlags(603979776);
                AbstractC58322PtE.A0Z().A0G(context, A08);
                C0f9.A0A(1080329223, A033);
                i = -1542350723;
                break;
            case 2:
                A03 = C0f9.A03(-1969825554);
                C2In c2In = (C2In) obj;
                int A0N = AbstractC167017dG.A0N(c2In, 2025812776);
                C63535Sp2 c63535Sp2 = (C63535Sp2) this.A01;
                if (c63535Sp2.A06.contains(c2In.A01.A00)) {
                    C63535Sp2.A00(c63535Sp2);
                }
                C0f9.A0A(95108642, A0N);
                i = -3592376;
                break;
            case 3:
                A03 = C0f9.A03(410458121);
                int A034 = C0f9.A03(-1108798576);
                C63535Sp2.A00((C63535Sp2) this.A01);
                C0f9.A0A(-336955676, A034);
                i = -1690311252;
                break;
            case 4:
                A03 = C0f9.A03(2146786212);
                C3KD c3kd = (C3KD) obj;
                int A0N2 = AbstractC167017dG.A0N(c3kd, -1434014928);
                ((BrowserLiteInMainProcessIGActivity) this.A01).By1().A0A(c3kd.A01);
                C0f9.A0A(-717186273, A0N2);
                i = -389832557;
                break;
            case 5:
                A03 = C0f9.A03(418446448);
                int A035 = C0f9.A03(-883704906);
                C64489TFz c64489TFz = (C64489TFz) this.A01;
                C63343Shy A00 = C64489TFz.A00(c64489TFz.A01, c64489TFz);
                Context context2 = ((C2W4) obj).A00;
                Q21 A04 = A00.A04();
                if (A04 != null && (appearanceModule = (AppearanceModule) A04.A04(AppearanceModule.class)) != null) {
                    appearanceModule.onConfigurationChanged(context2);
                }
                C0f9.A0A(1160674529, A035);
                i = -1948385990;
                break;
            case 6:
                A03 = C0f9.A03(1133240067);
                int A036 = C0f9.A03(-314715424);
                C64489TFz c64489TFz2 = (C64489TFz) this.A01;
                C63343Shy c63343Shy = c64489TFz2.A02;
                if (c63343Shy != null && c63343Shy.A0I == C05F.A00) {
                    c64489TFz2.A03();
                }
                C0f9.A0A(-1766937893, A036);
                i = -556582579;
                break;
            default:
                A03 = C0f9.A03(1331388095);
                C55986OtJ c55986OtJ = (C55986OtJ) obj;
                int A037 = C0f9.A03(-282627961);
                IgReactMediaPickerNativeModule igReactMediaPickerNativeModule = (IgReactMediaPickerNativeModule) this.A01;
                IgReactMediaPickerNativeModule.access$000(igReactMediaPickerNativeModule);
                if (c55986OtJ != null) {
                    String obj2 = AbstractC167007dF.A0I(c55986OtJ.A00).toString();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(obj2, options);
                    int i3 = options.outWidth;
                    int i4 = options.outHeight;
                    WritableNativeMap A0c = AbstractC58321PtD.A0c();
                    A0c.putInt(IgReactMediaPickerNativeModule.WIDTH, i3);
                    A0c.putInt(IgReactMediaPickerNativeModule.HEIGHT, i4);
                    A0c.putString("uri", obj2);
                    R3M reactApplicationContextIfActiveOrWarn = igReactMediaPickerNativeModule.getReactApplicationContextIfActiveOrWarn();
                    if (reactApplicationContextIfActiveOrWarn != null) {
                        ((RCTNativeAppEventEmitter) reactApplicationContextIfActiveOrWarn.A03(RCTNativeAppEventEmitter.class)).emit(IgReactMediaPickerNativeModule.IG_MEDIA_PICKER_PHOTO_SELECTED, A0c);
                    }
                    i2 = -2086119507;
                } else {
                    i2 = 22112552;
                }
                C0f9.A0A(i2, A037);
                i = 789025769;
                break;
        }
        C0f9.A0A(i, A03);
    }
}
