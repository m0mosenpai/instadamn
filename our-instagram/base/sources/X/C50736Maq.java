package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.Maq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50736Maq extends BroadcastReceiver {
    public final int A00;
    public final Object A01;

    public C50736Maq(C55100ObB c55100ObB, int i) {
        this.A00 = i;
        this.A01 = c55100ObB;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int A01;
        int i;
        String str;
        String str2;
        int i2;
        if (this.A00 != 0) {
            A01 = C0f9.A01(-152189397);
            C0fM.A01(this, context, intent);
            AbstractC167007dF.A1K(context, intent);
            if ("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
                if (intExtra == intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", 0)) {
                    i = -155654456;
                } else {
                    OGv oGv = ((C55100ObB) this.A01).A0G;
                    if (oGv != null) {
                        oGv.A00(intExtra);
                    }
                }
            }
            i = -1960729160;
        } else {
            A01 = C0f9.A01(1266213740);
            C0fM.A01(this, context, intent);
            boolean A1R = AbstractC167007dF.A1R(0, context, intent);
            if ("android.media.ACTION_SCO_AUDIO_STATE_UPDATED".equals(intent.getAction())) {
                C55100ObB c55100ObB = (C55100ObB) this.A01;
                int i3 = c55100ObB.A00;
                c55100ObB.A00 = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
                OGv oGv2 = c55100ObB.A0G;
                if (oGv2 != null) {
                    int i4 = c55100ObB.A00;
                    C55038OZk c55038OZk = oGv2.A00;
                    c55038OZk.A07.A00(AnonymousClass001.A02(i3, i4, "onScoAudioStateChanged: ", " --> "), new Object[0]);
                    InterfaceC58103PpS interfaceC58103PpS = c55038OZk.A06;
                    if (i3 != -1) {
                        if (i3 != 0) {
                            if (i3 != A1R) {
                                if (i3 != 2) {
                                    str = "invalid";
                                } else {
                                    str = RealtimeConstants.MQTT_CONNECTING;
                                }
                            } else {
                                str = RealtimeConstants.MQTT_CONNECTED;
                            }
                        } else {
                            str = RealtimeConstants.MQTT_DISCONNECTED;
                        }
                    } else {
                        str = "error";
                    }
                    if (i4 != -1) {
                        if (i4 != 0) {
                            if (i4 != A1R) {
                                if (i4 != 2) {
                                    str2 = "invalid";
                                } else {
                                    str2 = RealtimeConstants.MQTT_CONNECTING;
                                }
                            } else {
                                str2 = RealtimeConstants.MQTT_CONNECTED;
                            }
                        } else {
                            str2 = RealtimeConstants.MQTT_DISCONNECTED;
                        }
                    } else {
                        str2 = "error";
                    }
                    interfaceC58103PpS.Cnc("on_sco_audio_state_changed", AnonymousClass001.A0u("previous_state=", str, " state=", str2));
                    if (i4 == 0) {
                        if (i3 == A1R || i3 == 2) {
                            C55038OZk.A01(c55038OZk, false);
                        }
                        if (c55038OZk.A02 && (i2 = c55038OZk.A00) <= 3) {
                            interfaceC58103PpS.Cnc("restart bluetooth sco", AnonymousClass001.A0O("attempts=", i2));
                            Handler handler = c55038OZk.A03;
                            handler.removeMessages(A1R ? 1 : 0);
                            handler.sendEmptyMessage(A1R ? 1 : 0);
                        }
                    } else if (i4 == A1R) {
                        c55038OZk.A03.removeMessages(2);
                    }
                    O1X o1x = c55038OZk.A01;
                    if (o1x == null) {
                        C14360o3.A0F("callback");
                        throw C00O.createAndThrow();
                    }
                    o1x.A00.A0D();
                }
            }
            i = -1300995082;
        }
        C0f9.A0E(i, A01, intent);
    }
}
