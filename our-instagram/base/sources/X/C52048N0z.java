package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.N0z, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52048N0z extends AbstractC55211OeV {
    public JSONObject A05;
    public JSONObject A06;
    public JSONObject A07;
    public JSONObject A08;
    public int A00 = 3;
    public JSONArray A02 = AbstractC31171DnF.A0p();
    public JSONArray A04 = AbstractC31171DnF.A0p();
    public JSONArray A01 = AbstractC31171DnF.A0p();
    public JSONArray A03 = AbstractC31171DnF.A0p();

    private final String A00() {
        boolean z;
        int i = this.A00;
        synchronized (this) {
            z = super.A00;
        }
        if (i == 4) {
            if (z) {
                return "call";
            }
            return "ringing";
        }
        if (z) {
            return "live";
        }
        return "in_preview";
    }

    public static final JSONObject A01(C52048N0z c52048N0z, C51664Mrv c51664Mrv, long j) {
        String str;
        JSONObject A0q = AbstractC31171DnF.A0q();
        A0q.put("sample_rate", c51664Mrv.A02);
        A0q.put(TraceFieldType.Bitrate, c51664Mrv.A00);
        A0q.put("channels", c51664Mrv.A01);
        A0q.put("codec_profile", AbstractC53760NqC.A00(c51664Mrv.A04));
        A0q.put("start_time_ms", j);
        A0q.put("end_time_ms", -1L);
        if (c52048N0z.A00 == 4) {
            str = "call_stage";
        } else {
            str = "livestream_stage";
        }
        A0q.put(str, c52048N0z.A00());
        return A0q;
    }

    public static final JSONObject A02(C52048N0z c52048N0z, C51712Msh c51712Msh, long j) {
        String str;
        JSONObject A0q = AbstractC31171DnF.A0q();
        A0q.put("codec", ONI.A01(c51712Msh.A06));
        A0q.put(IgReactMediaPickerNativeModule.WIDTH, c51712Msh.A05);
        A0q.put(IgReactMediaPickerNativeModule.HEIGHT, c51712Msh.A03);
        A0q.put("frame_rate", c51712Msh.A02);
        A0q.put("i_frame_interval", c51712Msh.A04);
        A0q.put(TraceFieldType.Bitrate, c51712Msh.A00);
        A0q.put("start_time_ms", j);
        A0q.put("end_time_ms", -1L);
        if (c52048N0z.A00 == 4) {
            str = "call_stage";
        } else {
            str = "livestream_stage";
        }
        A0q.put(str, c52048N0z.A00());
        return A0q;
    }
}
