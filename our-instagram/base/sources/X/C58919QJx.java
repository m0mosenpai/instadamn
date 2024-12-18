package X;

import android.content.Intent;

/* renamed from: X.QJx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58919QJx extends AbstractC94474Mz {
    public final C64082Syy A00;

    @Override // X.C4N0
    public final void A02() {
        C64082Syy c64082Syy = this.A00;
        Intent A0E = AbstractC58318PtA.A0E("com.facebook.rti.mqtt.ACTION_MQTT_CONFIG_CHANGED");
        A0E.setPackage(c64082Syy.A00.getPackageName());
        AbstractC58322PtE.A0Z().A0C(c64082Syy.A00, A0E);
    }

    public C58919QJx(C64082Syy c64082Syy, String str, String str2, String str3) {
        str.getClass();
        this.A01 = str;
        str2.getClass();
        this.A03 = str2;
        str3.getClass();
        this.A02 = str3;
        A01();
        this.A00 = c64082Syy;
    }
}
