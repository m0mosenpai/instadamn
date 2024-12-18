package X;

import com.facebook.zero.sdk.staticdeps.json.JsonProvider;
import java.io.IOException;

/* loaded from: classes12.dex */
public final class YDL implements YOx {
    public final VgV A00;
    public final FIA A01;
    public final C72741XmD A02;
    public final O6M A03;

    public final Y06 A00() {
        if (this.A03.A00.getString("cs_key", null) == null) {
            return new Y06(new Xl7(new YDP()), new C72863XpS(), false, false);
        }
        try {
            JsonProvider.get();
            throw AbstractC166987dD.A15("parseStrict");
        } catch (IOException unused) {
            return new Y06(new Xl7(new YDP()), new C72863XpS(), false, false);
        }
    }

    @Override // X.YOx
    public final YDP BIj() {
        YDP ydp = new YDP();
        ydp.A00(new C70509WZq(this.A01));
        ydp.A00(new C70508WZp(this.A00));
        ydp.A00(new C73423YCs(this.A03));
        ydp.A00(new YD0(this.A02));
        return ydp;
    }

    @Override // X.YOx
    public final YDP Bq4() {
        YDP ydp = new YDP();
        ydp.A00(new XYE());
        ydp.A00(new Object());
        ydp.A00(new Object());
        ydp.A00(new XYN());
        ydp.A00(new YCO());
        return ydp;
    }

    public YDL(VgV vgV, FIA fia, C72741XmD c72741XmD, O6M o6m) {
        this.A00 = vgV;
        this.A03 = o6m;
        this.A02 = c72741XmD;
        this.A01 = fia;
    }
}
