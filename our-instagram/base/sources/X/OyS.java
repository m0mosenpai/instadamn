package X;

import android.graphics.Bitmap;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.realtimeclient.RealtimeConstants;
import java.io.IOException;

/* loaded from: classes9.dex */
public final class OyS implements InterfaceC57938Pmi {
    public final /* synthetic */ NTX A00;
    public final /* synthetic */ String A01;

    public OyS(NTX ntx, String str) {
        this.A01 = str;
        this.A00 = ntx;
    }

    @Override // X.InterfaceC57938Pmi
    public final void DiH(boolean z, String str) {
        if (z) {
            try {
                C44059Jdk A00 = C44059Jdk.A00(this.A01, 0);
                C14360o3.A07(A00);
                String str2 = A00.A07;
                C14360o3.A07(str2);
                long j = A00.A03;
                NTX ntx = this.A00;
                ClipInfo A03 = MY3.A03(ntx.A0B, str2, j, j);
                A03.A00 = A03.A09 / A03.A06;
                if (A03.A0F != null) {
                    C55177Odh c55177Odh = ntx.A0D;
                    if (str != null) {
                        c55177Odh.A03(new C56612PBi(A03, str));
                        Bitmap bitmap = ntx.A02;
                        if (bitmap != null) {
                            ntx.A0J(new C51892Mwa(bitmap, C05F.A01, false, true));
                            ntx.A0C.A00(new PA4(RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, null, ntx.A08, true));
                            return;
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw MSW.A0y("clipInfo.videoFilePath is null");
            } catch (IOException e) {
                C0K8.A0F("RtcCallPhotoboothPresenter", "Failed to share to direct", e);
                NTX ntx2 = this.A00;
                C9GR.A01(ntx2.A0A, "direct_failed_to_send_video_to_thread_toast", 2131959373, 0);
                ntx2.A0C.A00(new PA4(RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, e.getMessage(), ntx2.A08, false));
                return;
            }
        }
        NTX ntx3 = this.A00;
        ntx3.A0C.A00(new PA4(RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, "Failed to save coverImage bitmap", ntx3.A08, false));
    }
}
