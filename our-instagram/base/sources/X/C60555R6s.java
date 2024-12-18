package X;

import android.content.Context;
import android.content.Intent;
import org.json.JSONObject;

/* renamed from: X.R6s, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60555R6s extends C4N0 {
    public final Context A00;
    public volatile C4N1 A01 = new C4N1(AbstractC31171DnF.A0q());

    @Override // X.C4N0
    public final C4N1 A00() {
        return this.A01;
    }

    public C60555R6s(Context context) {
        this.A00 = context;
    }

    @Override // X.C4N0
    public final void A01() {
        JSONObject A0q = AbstractC31171DnF.A0q();
        A04(A0q);
        this.A01 = new C4N1(A0q);
    }

    @Override // X.C4N0
    public final void A02() {
        C05290Qb A0Z = AbstractC58322PtE.A0Z();
        Intent A0E = AbstractC58318PtA.A0E("com.facebook.rti.mqtt.ACTION_MQTT_CONFIG_CHANGED");
        Context context = this.A00;
        A0Z.A0C(context, A0E.setPackage(context.getPackageName()));
    }
}
