package X;

import android.graphics.RectF;
import android.net.Uri;
import com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessorV2;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class PS3 implements Runnable {
    public final /* synthetic */ VideoStickerAnythingProcessorV2 A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ boolean A02;

    public PS3(VideoStickerAnythingProcessorV2 videoStickerAnythingProcessorV2, List list, boolean z) {
        this.A00 = videoStickerAnythingProcessorV2;
        this.A01 = list;
        this.A02 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JSONArray jSONArray;
        int i;
        VideoStickerAnythingProcessorV2 videoStickerAnythingProcessorV2 = this.A00;
        C47Z c47z = videoStickerAnythingProcessorV2.A0B;
        if (c47z != null) {
            String str = c47z.A3t;
            Uri.Builder builder = new Uri.Builder();
            Uri.Builder scheme = builder.scheme("https");
            C54993OUc c54993OUc = videoStickerAnythingProcessorV2.A09;
            if (c54993OUc != null) {
                scheme.encodedAuthority(c54993OUc.A09).path("api/v1/media/upload_edit/");
                try {
                    JSONObject A0q = AbstractC31171DnF.A0q();
                    List<OLT> list = this.A01;
                    if (AbstractC166987dD.A1b(list)) {
                        ArrayList A1E = AbstractC166987dD.A1E();
                        for (OLT olt : list) {
                            float[] fArr = olt.A01;
                            C09530e4 A0c = AbstractC50523MSb.A0c("x", Math.max(Math.min(fArr[0], 0.9999f), 1.0E-4f));
                            C09530e4 A0c2 = AbstractC50523MSb.A0c("y", Math.max(Math.min(fArr[1], 0.9999f), 1.0E-4f));
                            switch (olt.A00.intValue()) {
                                case 2:
                                    i = 2;
                                    break;
                                case 3:
                                    i = 3;
                                    break;
                                default:
                                    i = 0;
                                    break;
                            }
                            A1E.add(AbstractC06930Yk.A06(AbstractC167007dF.A1b("input_type", Double.valueOf(i), A0c, A0c2)));
                        }
                        jSONArray = new JSONArray(A1E.toArray(new Map[0]));
                    } else {
                        RectF rectF = videoStickerAnythingProcessorV2.A02;
                        jSONArray = new JSONArray(new Map[]{AbstractC06930Yk.A06(AbstractC50523MSb.A0c("x", rectF.left), AbstractC50523MSb.A0c("y", rectF.top), AbstractC167007dF.A0o("input_type", 2)), AbstractC06930Yk.A06(AbstractC50523MSb.A0c("x", rectF.right), AbstractC50523MSb.A0c("y", rectF.bottom), AbstractC167007dF.A0o("input_type", 3))});
                    }
                    A0q.put("upload_id", Long.parseLong(str));
                    A0q.put("points", jSONArray);
                    boolean z = this.A02;
                    if (z) {
                        A0q.put("sticker_anything_audio_enabled", z);
                    }
                    java.net.URI uri = new java.net.URI(builder.build().toString());
                    OML oml = videoStickerAnythingProcessorV2.A06;
                    if (oml != null) {
                        oml.A02("upload_edit_start", C57288PcA.A00);
                    }
                    InterfaceC58135Ppy interfaceC58135Ppy = videoStickerAnythingProcessorV2.A05;
                    if (interfaceC58135Ppy != null) {
                        interfaceC58135Ppy.ARE(uri, A0q);
                    }
                    OML oml2 = videoStickerAnythingProcessorV2.A06;
                    if (oml2 != null) {
                        oml2.A03(AbstractC06930Yk.A06(AbstractC25229BEm.A1b("upload_id", new C51397Mn3(str), AbstractC166987dD.A1L("points", new C51397Mn3(AbstractC166987dD.A19(jSONArray))))));
                        return;
                    }
                    return;
                } catch (JSONException e) {
                    OML oml3 = videoStickerAnythingProcessorV2.A06;
                    if (oml3 != null) {
                        oml3.A03(AbstractC25233BEq.A0p("error_message", new C51397Mn3("[IGSegmentAnythingGenerateBoundingBoxPoints] Failed to convert points JSON to string."), AbstractC166987dD.A1L("error", new C51397Mn3(e.toString()))));
                    }
                    OML oml4 = videoStickerAnythingProcessorV2.A06;
                    if (oml4 != null) {
                        oml4.A01("upload_edit_start");
                        return;
                    }
                    return;
                }
            }
            C14360o3.A0F("igUploaderConfig");
            throw C00O.createAndThrow();
        }
    }
}
