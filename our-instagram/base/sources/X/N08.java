package X;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothManager;
import android.bluetooth.BluetoothProfile;
import android.telecom.CallAudioState;
import java.util.Collection;
import java.util.List;

/* loaded from: classes9.dex */
public final class N08 extends OMu {
    public BluetoothHeadset A00;
    public List A01;
    public final BluetoothProfile.ServiceListener A02;
    public final C54757OHm A03;
    public final C55100ObB A04;
    public final C1W6 A05;
    public final InterfaceC09390do A06;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.Npq, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ N08(android.content.Context r11, android.media.AudioManager r12, X.C54757OHm r13, X.C55100ObB r14, X.InterfaceC58103PpS r15, X.C55000OUz r16, X.OMO r17, X.C54156Nws r18, X.C1W6 r19, java.util.concurrent.ExecutorService r20) {
        /*
            r10 = this;
            X.Npq r4 = new X.Npq
            r4.<init>()
            r0 = 4
            r3 = r12
            X.C14360o3.A0B(r12, r0)
            r1 = r10
            r2 = r11
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r10.A04 = r14
            r10.A03 = r13
            r0 = r19
            r10.A05 = r0
            java.util.ArrayList r0 = X.AbstractC166987dD.A1E()
            r10.A01 = r0
            r0 = 14
            X.0sx r0 = X.C57549PgN.A01(r11, r0)
            r10.A06 = r0
            X.OfG r0 = new X.OfG
            r0.<init>(r10)
            r10.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N08.<init>(android.content.Context, android.media.AudioManager, X.OHm, X.ObB, X.PpS, X.OUz, X.OMO, X.Nws, X.1W6, java.util.concurrent.ExecutorService):void");
    }

    public final void A0C() {
        super.A05.A00("updateAudioOutput to %s", this.aomCurrentAudioOutput);
        this.A03.A00(this.aomCurrentAudioOutput);
    }

    @Override // X.OMu
    public final void A02() {
        super.A02();
        this.A05.A00.remove(this);
    }

    @Override // X.OMu
    public final void A03() {
        C50758MbO A01;
        Collection<BluetoothDevice> supportedBluetoothDevices;
        BluetoothAdapter adapter;
        super.A03();
        C1W6 c1w6 = this.A05;
        c1w6.A00.add(this);
        BluetoothManager bluetoothManager = (BluetoothManager) this.A06.getValue();
        if (bluetoothManager != null && (adapter = bluetoothManager.getAdapter()) != null) {
            adapter.getProfileProxy(super.A01, this.A02, 1);
        }
        if (this.aomDisableEarpieceMode && !this.aomIsHeadsetAttached && (A01 = C1W6.A01(c1w6)) != null) {
            CallAudioState callAudioState = A01.getCallAudioState();
            if (callAudioState != null && (supportedBluetoothDevices = callAudioState.getSupportedBluetoothDevices()) != null) {
                AbstractC001800i.A0A(supportedBluetoothDevices);
            }
            A01.setAudioRoute(8);
        }
        EnumC53278NhG A012 = A01();
        C14360o3.A0B(A012, 0);
        this.aomCurrentAudioOutput = A012;
        A0C();
        A07();
        A06();
        A05();
    }

    @Override // X.OMu
    public final void A04() {
        super.A04();
        EnumC53278NhG enumC53278NhG = EnumC53278NhG.A03;
        C14360o3.A0B(enumC53278NhG, 0);
        this.aomCurrentAudioOutput = enumC53278NhG;
    }
}
