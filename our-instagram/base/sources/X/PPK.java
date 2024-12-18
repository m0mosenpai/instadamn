package X;

import android.net.Uri;
import com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessor;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class PPK implements Runnable {
    public final /* synthetic */ VideoStickerAnythingProcessor A00;
    public final /* synthetic */ String A01;

    public PPK(VideoStickerAnythingProcessor videoStickerAnythingProcessor, String str) {
        this.A00 = videoStickerAnythingProcessor;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoStickerAnythingProcessor videoStickerAnythingProcessor = this.A00;
        C47Z c47z = videoStickerAnythingProcessor.A0A;
        if (c47z != null) {
            String str = c47z.A3t;
            Uri.Builder builder = new Uri.Builder();
            Uri.Builder scheme = builder.scheme("https");
            C54993OUc c54993OUc = videoStickerAnythingProcessor.A08;
            if (c54993OUc != null) {
                scheme.encodedAuthority(c54993OUc.A09).path("api/v1/media/save_edit/");
                try {
                    JSONObject A0q = AbstractC31171DnF.A0q();
                    A0q.put("upload_id", Long.parseLong(str));
                    String str2 = this.A01;
                    A0q.put("edit_id", Long.parseLong(str2));
                    C54509O6m A01 = AbstractC1126356r.A01(A0q);
                    java.net.URI uri = new java.net.URI(builder.build().toString());
                    videoStickerAnythingProcessor.Dca(EnumC53262Nh0.A0E);
                    OVd oVd = videoStickerAnythingProcessor.A0B;
                    if (oVd != null) {
                        Integer num = C05F.A01;
                        LinkedHashMap A1I = AbstractC166987dD.A1I();
                        C47Z c47z2 = videoStickerAnythingProcessor.A0A;
                        if (c47z2 != null) {
                            oVd.A01(new C51509Mov(videoStickerAnythingProcessor, videoStickerAnythingProcessor, str, c47z2.A0G()), A01, num, uri, A1I);
                            VideoStickerAnythingProcessor.A03(AbstractC06930Yk.A06(AbstractC25229BEm.A1b("upload_id", str, AbstractC166987dD.A1L("edit_id", str2))));
                            return;
                        }
                        C14360o3.A0F("pendingMedia");
                    } else {
                        C14360o3.A0F("httpRequestExecutor");
                    }
                    throw C00O.createAndThrow();
                } catch (JSONException e) {
                    VideoStickerAnythingProcessor.A03(AbstractC25233BEq.A0p("error_message", "[IGSegmentAnything] Failed to save the sticker.", AbstractC166987dD.A1L("error", e.toString())));
                    videoStickerAnythingProcessor.Dcb(EnumC53262Nh0.A0E, AbstractC167017dG.A0n(e, "Save edit request failed ", AbstractC166987dD.A1C()));
                    return;
                }
            }
            C14360o3.A0F("igUploaderConfig");
            throw C00O.createAndThrow();
        }
    }
}
