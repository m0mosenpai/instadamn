package X;

import com.instagram.pendingmedia.model.ClipInfo;
import java.util.HashMap;

/* renamed from: X.Nvp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54091Nvp {
    public static HashMap A00(C47Z c47z, C50665MYi c50665MYi) {
        EnumC40111tc enumC40111tc;
        ClipInfo clipInfo = c47z.A1N;
        String str = clipInfo.A0F;
        if (str == null) {
            C0w9.A04("VideoFilePath is null in StitchedClipInfo", AbstractC167017dG.A0n(clipInfo, "clip info: ", AbstractC166987dD.A1C()), 100);
            str = "";
        }
        String str2 = c47z.A3t;
        C14360o3.A0B(str2, 1);
        HashMap A00 = new C69616VsJ(null, str2, str, null).A00();
        A00.put("video_asset_id_list", AbstractC31171DnF.A0p().put(VN6.A00(str)).toString());
        if (c47z.A0z()) {
            enumC40111tc = EnumC40111tc.A0a;
        } else {
            enumC40111tc = c47z.A1G;
        }
        A00.put("media_type", AbstractC37303Gc4.A0X(enumC40111tc.toString()));
        A00.put("source_type", C50702MZx.A01(c50665MYi.A00, c47z));
        return A00;
    }
}
