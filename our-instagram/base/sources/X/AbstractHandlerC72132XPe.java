package X;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.rti.mqtt.manager.MqttBackgroundServiceDelegate;

/* renamed from: X.XPe, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractHandlerC72132XPe extends Handler {
    public volatile boolean A00;
    public final /* synthetic */ MqttBackgroundServiceDelegate A01;

    public final void A00() {
        ((XXc) this).A00.A0H();
    }

    public final void A01() {
        ((XXc) this).A00.A0G();
    }

    public final void A02(int i, int i2, Intent intent) {
        ((XXc) this).A00.A0I(i, i2, intent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractHandlerC72132XPe(Looper looper, MqttBackgroundServiceDelegate mqttBackgroundServiceDelegate) {
        super(looper);
        this.A01 = mqttBackgroundServiceDelegate;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message != null) {
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        this.A01.A0H();
                        synchronized (this) {
                            this.A00 = true;
                            notifyAll();
                        }
                        return;
                    }
                    throw AbstractC166987dD.A14("Unsupported message");
                }
                if (!this.A00) {
                    this.A01.A0I(message.arg1, message.arg2, (Intent) message.obj);
                    return;
                }
                return;
            }
            this.A01.A0G();
            return;
        }
        throw AbstractC166987dD.A14("Message is null");
    }
}
