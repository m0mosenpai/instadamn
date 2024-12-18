package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.android.billingclient.api.Purchase;
import com.facebook.react.modules.core.RCTNativeAppEventEmitter;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.nio.charset.Charset;
import java.util.HashMap;
import org.json.JSONException;

/* renamed from: X.Sjz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class DialogInterfaceOnClickListenerC63421Sjz implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public DialogInterfaceOnClickListenerC63421Sjz(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        DialogInterface.OnClickListener onClickListener;
        int i2;
        boolean matches;
        boolean matches2;
        boolean matches3;
        switch (this.A00) {
            case 0:
                try {
                    QIo qIo = (QIo) this.A02;
                    String str = qIo.A03;
                    String str2 = qIo.A04;
                    HashMap A1G = AbstractC166987dD.A1G();
                    A1G.put("productId", str);
                    A1G.put("purchaseToken", "mockPayment");
                    A1G.put("obfuscatedProfileId", str2);
                    A1G.put("obfuscatedAccountId", str2);
                    String A0d = AbstractC31175DnJ.A0d(A1G);
                    SPT spt = SPT.A01;
                    Charset charset = AbstractC50482Ts.A05;
                    C14360o3.A08(charset);
                    ((SLC) this.A01).A00.A0O(AbstractC166987dD.A1J(new Purchase(A0d, spt.A02(AbstractC58318PtA.A1a("mockSignature", charset)))), true);
                } catch (JSONException unused) {
                    ((SLC) this.A01).A00();
                }
                dialogInterface.dismiss();
                return;
            case 1:
                dialogInterface.cancel();
                onClickListener = ((C63198Sf0) this.A02).A07;
                if (onClickListener == null) {
                    return;
                }
                i2 = -2;
                break;
            case 2:
                dialogInterface.dismiss();
                onClickListener = ((C63198Sf0) this.A02).A09;
                if (onClickListener == null) {
                    return;
                }
                i2 = -1;
                break;
            case 3:
                Context context = (Context) this.A02;
                Intent A0E = AbstractC58318PtA.A0E("android.settings.FINGERPRINT_ENROLL");
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || A0E.resolveActivity(packageManager) == null) {
                    return;
                }
                C0b3.A00().A04().A0G(context, A0E);
                return;
            default:
                EnumC69983Ch enumC69983Ch = EnumC69983Ch.A06;
                C43846JaA c43846JaA = new C43846JaA(enumC69983Ch);
                c43846JaA.A05 = false;
                c43846JaA.A09 = true;
                c43846JaA.A0A = false;
                c43846JaA.A0C = false;
                c43846JaA.A0D = false;
                MediaCaptureConfig mediaCaptureConfig = new MediaCaptureConfig(c43846JaA);
                IgReactMediaPickerNativeModule igReactMediaPickerNativeModule = (IgReactMediaPickerNativeModule) this.A01;
                igReactMediaPickerNativeModule.mIgEventBus.A01(igReactMediaPickerNativeModule.mImageSelectedEventListener, C55986OtJ.class);
                Context context2 = (Context) this.A02;
                matches = igReactMediaPickerNativeModule.matches(context2, i, 2131971507);
                if (!matches) {
                    matches2 = igReactMediaPickerNativeModule.matches(context2, i, 2131971508);
                    if (!matches2) {
                        matches3 = igReactMediaPickerNativeModule.matches(context2, i, 2131971506);
                        if (!matches3) {
                            return;
                        }
                        igReactMediaPickerNativeModule.mCaptureFlowHelper.EoI(EnumC33447EqK.A0P, mediaCaptureConfig, enumC69983Ch);
                        return;
                    }
                    igReactMediaPickerNativeModule.mCaptureFlowHelper.EoK(EnumC33447EqK.A0P, mediaCaptureConfig, enumC69983Ch);
                    return;
                }
                ((RCTNativeAppEventEmitter) AbstractC58321PtD.A0b(igReactMediaPickerNativeModule).A03(RCTNativeAppEventEmitter.class)).emit(IgReactMediaPickerNativeModule.IG_MEDIA_PICKER_PHOTO_SELECTED, null);
                return;
        }
        onClickListener.onClick(dialogInterface, i2);
    }
}
