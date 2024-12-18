package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.zero.sdk.staticdeps.json.JsonProvider;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public final class YDK implements YOx {
    public final C72695XlO A00;
    public final O6M A01;
    public final SLN A02;

    /* JADX WARN: Type inference failed for: r3v0, types: [X.YDP, java.lang.Object] */
    @Override // X.YOx
    public final YDP BIj() {
        YNw[] yNwArr = {new C73429YCy(this.A02), new C73430YCz(this.A01)};
        ?? obj = new Object();
        ArrayList A17 = AbstractC25225BEi.A17(2);
        obj.A00 = A17;
        int i = 0;
        do {
            A17.add(yNwArr[i]);
            i++;
        } while (i < 2);
        return obj;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.YCO, X.XXm] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.YCO, X.XXm] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.YDP, java.lang.Object] */
    @Override // X.YOx
    public final YDP Bq4() {
        XXm[] xXmArr = {new XYK(), new YCO(), new YCO(), new XYM()};
        ?? obj = new Object();
        ArrayList A17 = AbstractC25225BEi.A17(4);
        obj.A00 = A17;
        int i = 0;
        do {
            A17.add(xXmArr[i]);
            i++;
        } while (i < 4);
        return obj;
    }

    public final Y07 A00() {
        if (this.A01.A00.getString("zbd_state", null) == null) {
            return new Y07(null, 0L, false, false);
        }
        try {
            JsonProvider.get();
            throw AbstractC166987dD.A15("parseStrict");
        } catch (Exception e) {
            C0f5 AEp = C18950wb.A01.AEp("ZbdComponentProvider", 817900293);
            AEp.ABW(DialogModule.KEY_MESSAGE, "failed to parse initial state");
            AEp.ERI(e);
            AEp.report();
            return new Y07(null, 0L, false, false);
        }
    }

    public YDK(C72695XlO c72695XlO, O6M o6m, SLN sln) {
        this.A02 = sln;
        this.A01 = o6m;
        this.A00 = c72695XlO;
    }
}
