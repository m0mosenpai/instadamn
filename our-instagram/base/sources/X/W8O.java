package X;

import com.instagram.realtimeclient.RealtimeSubscription;
import java.io.File;

/* loaded from: classes11.dex */
public final class W8O {
    public static final W8O A00 = new Object();

    public static final C09530e4 A00(File file) {
        String str;
        file.getPath();
        String name = file.getName();
        C14360o3.A07(name);
        if (AbstractC002300n.A0h(name, "InShot", true)) {
            str = "2";
        } else {
            String name2 = file.getName();
            C14360o3.A07(name2);
            if (AbstractC002300n.A0h(name2, "YouCut", true)) {
                str = "3";
            } else {
                String name3 = file.getName();
                C14360o3.A07(name3);
                if (AbstractC002300n.A0h(name3, "lv_", true)) {
                    str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
                } else {
                    String name4 = file.getName();
                    C14360o3.A07(name4);
                    if (AbstractC002300n.A0h(name4, "km_", true)) {
                        str = "4";
                    } else {
                        String name5 = file.getName();
                        C14360o3.A07(name5);
                        if (!new C11L("[0-9a-fA-F]{32}").A08(AbstractC001900j.A0G(".mp4", name5))) {
                            str = "unknown";
                        } else {
                            str = "5";
                        }
                    }
                }
            }
        }
        return new C09530e4(str, "unknown");
    }
}
