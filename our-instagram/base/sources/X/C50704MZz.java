package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.MZz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C50704MZz {
    public final Context A00;

    public static void A06(InterfaceC02590Ai interfaceC02590Ai, C50704MZz c50704MZz) {
        interfaceC02590Ai.AAP("connection", AbstractC15820qc.A08(c50704MZz.A00));
    }

    public C50704MZz(Context context) {
        this.A00 = context;
    }

    public static void A02(InterfaceC02590Ai interfaceC02590Ai, UserSession userSession, C47Z c47z, C50703MZy c50703MZy) {
        interfaceC02590Ai.AAP("ingest_id", c50703MZy.A0H());
        interfaceC02590Ai.AAP("ingest_surface", C50702MZx.A01(userSession, c47z));
    }

    public static void A03(InterfaceC02590Ai interfaceC02590Ai, C50703MZy c50703MZy) {
        interfaceC02590Ai.A7v("is_carousel_item", Boolean.valueOf(c50703MZy.A0J()));
    }

    public static void A04(InterfaceC02590Ai interfaceC02590Ai, C50703MZy c50703MZy, Long l, String str) {
        interfaceC02590Ai.A9K(str, l);
        interfaceC02590Ai.A9K(AbstractC111324zv.A00(1096), c50703MZy.A0B());
        interfaceC02590Ai.A9K(AbstractC111324zv.A00(1105), c50703MZy.A0D());
    }

    public static void A05(InterfaceC02590Ai interfaceC02590Ai, C50703MZy c50703MZy, String str, String str2) {
        interfaceC02590Ai.AAP(str, str2);
        interfaceC02590Ai.AAP("media_type", AbstractC44300Jhr.A00(C50702MZx.A00(c50703MZy.A02)));
    }

    public Map A07() {
        Runtime runtime = Runtime.getRuntime();
        return AbstractC06930Yk.A07(AbstractC25230BEn.A1b("free_memory_bytes", String.valueOf(runtime.freeMemory() + (runtime.maxMemory() - runtime.totalMemory()))));
    }
}
