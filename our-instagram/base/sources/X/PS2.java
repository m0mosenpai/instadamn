package X;

import android.graphics.RectF;
import android.net.Uri;
import com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class PS2 implements Runnable {
    public final /* synthetic */ VideoStickerAnythingProcessor A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ boolean A02;

    public PS2(VideoStickerAnythingProcessor videoStickerAnythingProcessor, List list, boolean z) {
        this.A00 = videoStickerAnythingProcessor;
        this.A01 = list;
        this.A02 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JSONArray jSONArray;
        int i;
        VideoStickerAnythingProcessor videoStickerAnythingProcessor = this.A00;
        C47Z c47z = videoStickerAnythingProcessor.A0A;
        if (c47z != null) {
            String str = c47z.A3t;
            Uri.Builder builder = new Uri.Builder();
            Uri.Builder scheme = builder.scheme("https");
            C54993OUc c54993OUc = videoStickerAnythingProcessor.A08;
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
                        RectF rectF = videoStickerAnythingProcessor.A03;
                        jSONArray = new JSONArray(new Map[]{AbstractC06930Yk.A06(AbstractC50523MSb.A0c("x", rectF.left), AbstractC50523MSb.A0c("y", rectF.top), AbstractC167007dF.A0o("input_type", 2)), AbstractC06930Yk.A06(AbstractC50523MSb.A0c("x", rectF.right), AbstractC50523MSb.A0c("y", rectF.bottom), AbstractC167007dF.A0o("input_type", 3))});
                    }
                    A0q.put("upload_id", Long.parseLong(str));
                    A0q.put("points", jSONArray);
                    boolean z = this.A02;
                    if (z) {
                        A0q.put("sticker_anything_audio_enabled", z);
                    }
                    java.net.URI uri = new java.net.URI(builder.build().toString());
                    videoStickerAnythingProcessor.Dca(EnumC53262Nh0.A0D);
                    videoStickerAnythingProcessor.ARE(uri, A0q);
                    VideoStickerAnythingProcessor.A03(AbstractC06930Yk.A06(AbstractC25229BEm.A1b("upload_id", str, AbstractC166987dD.A1L("points", jSONArray.toString()))));
                    return;
                } catch (JSONException e) {
                    VideoStickerAnythingProcessor.A03(AbstractC25233BEq.A0p("error_message", "[IGSegmentAnythingGenerateBoundingBoxPoints] Failed to convert points JSON to string.", AbstractC166987dD.A1L("error", e.toString())));
                    videoStickerAnythingProcessor.Dcb(EnumC53262Nh0.A0D, AbstractC167017dG.A0n(e, "Edit request failed ", AbstractC166987dD.A1C()));
                    return;
                }
            }
            C14360o3.A0F("igUploaderConfig");
            throw C00O.createAndThrow();
        }
    }
}
