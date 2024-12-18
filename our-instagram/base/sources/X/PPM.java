package X;

import android.net.Uri;
import com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessorV2;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class PPM implements Runnable {
    public final /* synthetic */ VideoStickerAnythingProcessorV2 A00;
    public final /* synthetic */ String A01;

    public PPM(VideoStickerAnythingProcessorV2 videoStickerAnythingProcessorV2, String str) {
        this.A00 = videoStickerAnythingProcessorV2;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoStickerAnythingProcessorV2 videoStickerAnythingProcessorV2 = this.A00;
        C47Z c47z = videoStickerAnythingProcessorV2.A0B;
        if (c47z != null) {
            String str = c47z.A3t;
            Uri.Builder builder = new Uri.Builder();
            Uri.Builder scheme = builder.scheme("https");
            C54993OUc c54993OUc = videoStickerAnythingProcessorV2.A09;
            if (c54993OUc != null) {
                scheme.encodedAuthority(c54993OUc.A09).path("api/v1/media/save_edit/");
                try {
                    JSONObject A0q = AbstractC31171DnF.A0q();
                    A0q.put("upload_id", Long.parseLong(str));
                    String str2 = this.A01;
                    A0q.put("edit_id", Long.parseLong(str2));
                    C54509O6m A01 = AbstractC1126356r.A01(A0q);
                    java.net.URI uri = new java.net.URI(builder.build().toString());
                    OML oml = videoStickerAnythingProcessorV2.A06;
                    if (oml != null) {
                        oml.A02("save_edit_start", C57286Pc8.A00);
                    }
                    OVd oVd = videoStickerAnythingProcessorV2.A0C;
                    if (oVd != null) {
                        Integer num = C05F.A01;
                        LinkedHashMap A1I = AbstractC166987dD.A1I();
                        C47Z c47z2 = videoStickerAnythingProcessorV2.A0B;
                        if (c47z2 != null) {
                            oVd.A01(new C51510Mow(videoStickerAnythingProcessorV2.A06, videoStickerAnythingProcessorV2, str, c47z2.A0G()), A01, num, uri, A1I);
                            OML oml2 = videoStickerAnythingProcessorV2.A06;
                            if (oml2 != null) {
                                oml2.A03(AbstractC06930Yk.A06(AbstractC25229BEm.A1b("upload_id", new C51397Mn3(str), AbstractC166987dD.A1L("edit_id", new C51397Mn3(str2)))));
                                return;
                            }
                            return;
                        }
                        C14360o3.A0F("pendingMedia");
                    } else {
                        C14360o3.A0F("httpRequestExecutor");
                    }
                    throw C00O.createAndThrow();
                } catch (JSONException e) {
                    OML oml3 = videoStickerAnythingProcessorV2.A06;
                    if (oml3 != null) {
                        oml3.A03(AbstractC25233BEq.A0p("error_message", new C51397Mn3("[IGSegmentAnything] Failed to save the sticker."), AbstractC166987dD.A1L("error", new C51397Mn3(e.toString()))));
                    }
                    OML oml4 = videoStickerAnythingProcessorV2.A06;
                    if (oml4 != null) {
                        oml4.A01("save_edit_start");
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
