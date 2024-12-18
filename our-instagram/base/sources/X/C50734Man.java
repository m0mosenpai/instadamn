package X;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telecom.CallAudioState;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.Collection;

/* renamed from: X.Man, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50734Man extends BroadcastReceiver {
    public final /* synthetic */ OMu A00;

    public C50734Man(OMu oMu) {
        this.A00 = oMu;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        EnumC53278NhG enumC53278NhG;
        CallAudioState callAudioState;
        Collection<BluetoothDevice> supportedBluetoothDevices;
        EnumC53278NhG enumC53278NhG2;
        C54757OHm c54757OHm;
        EnumC53278NhG enumC53278NhG3;
        int A01 = C0f9.A01(898106240);
        C0fM.A01(this, context, intent);
        AbstractC167007dF.A1K(context, intent);
        boolean z = false;
        boolean A1O = AbstractC167007dF.A1O(intent.getIntExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, 0));
        if (intent.getIntExtra("microphone", 0) > 0) {
            z = true;
        }
        String stringExtra = intent.getStringExtra(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        OMu oMu = this.A00;
        if (oMu instanceof N09) {
            N09 n09 = (N09) oMu;
            ((OMu) n09).A05.A00("onHeadsetPlugged, isHeadsetAttached=%b", Boolean.valueOf(A1O));
            C55739Op8 c55739Op8 = n09.audioManagerQplLogger;
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("is_headset_attached: ");
            A1C.append(A1O);
            A1C.append(", with_microphone: ");
            A1C.append(z);
            c55739Op8.Cnc("on_headset_plugged", MSZ.A0u(", headset_type: ", stringExtra, A1C));
            n09.aomIsHeadsetAttached = A1O;
            if (A1O) {
                n09.aomShouldSpeakerOnHeadsetUnplug = n09.A0D;
            } else {
                if (n09.A09.A05.A05()) {
                    enumC53278NhG3 = EnumC53278NhG.A02;
                } else if (n09.aomShouldSpeakerOnHeadsetUnplug || n09.aomDisableEarpieceMode) {
                    enumC53278NhG3 = EnumC53278NhG.A05;
                }
                n09.A08(enumC53278NhG3);
                enumC53278NhG2 = n09.aomCurrentAudioOutput;
                if (enumC53278NhG2 == EnumC53278NhG.A03 && n09.aomIsHeadsetAttached) {
                    enumC53278NhG2 = EnumC53278NhG.A04;
                }
                c54757OHm = n09.A08;
            }
            enumC53278NhG3 = EnumC53278NhG.A03;
            n09.A08(enumC53278NhG3);
            enumC53278NhG2 = n09.aomCurrentAudioOutput;
            if (enumC53278NhG2 == EnumC53278NhG.A03) {
                enumC53278NhG2 = EnumC53278NhG.A04;
            }
            c54757OHm = n09.A08;
        } else {
            N08 n08 = (N08) oMu;
            C55000OUz c55000OUz = ((OMu) n08).A05;
            Boolean valueOf = Boolean.valueOf(A1O);
            c55000OUz.A00("onHeadsetPlugged, isHeadsetAttached=%b", valueOf);
            n08.audioManagerQplLogger.Cnc("on_headset_plugged", StringFormatUtil.formatStrLocaleSafe("is_headset_attached: %b, with_microphone: %b, headset_type: %s", valueOf, Boolean.valueOf(z), stringExtra));
            n08.aomIsHeadsetAttached = A1O;
            if (A1O) {
                n08.aomShouldSpeakerOnHeadsetUnplug = n08.A0B();
                enumC53278NhG = EnumC53278NhG.A04;
            } else {
                C50758MbO A012 = C1W6.A01(n08.A05);
                if (A012 != null && (callAudioState = A012.getCallAudioState()) != null && (supportedBluetoothDevices = callAudioState.getSupportedBluetoothDevices()) != null && (!supportedBluetoothDevices.isEmpty())) {
                    enumC53278NhG = EnumC53278NhG.A02;
                } else if (!n08.aomShouldSpeakerOnHeadsetUnplug && !n08.aomDisableEarpieceMode) {
                    enumC53278NhG = EnumC53278NhG.A03;
                } else {
                    enumC53278NhG = EnumC53278NhG.A05;
                }
            }
            n08.A08(enumC53278NhG);
            enumC53278NhG2 = n08.aomCurrentAudioOutput;
            if (n08.A0A() && A1O) {
                enumC53278NhG2 = EnumC53278NhG.A04;
            }
            c54757OHm = n08.A03;
        }
        c54757OHm.A00(enumC53278NhG2);
        C0f9.A0E(-914884698, A01, intent);
    }
}
