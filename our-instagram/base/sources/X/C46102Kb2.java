package X;

import com.meta.cal.AudioSessionError;
import com.meta.cal.AudioSessionInfo;
import com.meta.cal.AudioSessionResult;
import com.meta.cal.CaptionCallback;

/* renamed from: X.Kb2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46102Kb2 extends CaptionCallback {
    public int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C1580477o A02;
    public final /* synthetic */ L7E A03;

    public final void onCompleteText(String str, AudioSessionInfo audioSessionInfo) {
        String str2;
        C14360o3.A0B(audioSessionInfo, 1);
        if (str != null) {
            C14360o3.A0K(AbstractC25228BEl.A1A(str), "");
        }
        C1580477o c1580477o = this.A02;
        C129805tk c129805tk = c1580477o.A02;
        if (c129805tk != null) {
            int i = this.A01;
            String languageId = audioSessionInfo.getLanguageId();
            Double confidenceScoreLogP = audioSessionInfo.getConfidenceScoreLogP();
            if (languageId != null) {
                c129805tk.A00.markerAnnotate(331815788, i, "LANGUAGE_ID", languageId);
            }
            if (confidenceScoreLogP != null) {
                c129805tk.A00.markerAnnotate(331815788, i, "CONFIDENCE_SCORE", confidenceScoreLogP.doubleValue());
            }
            c129805tk.A00.markerPoint(331815788, i, "AUDIO_PROCESSING_END");
        }
        AudioSessionResult result = audioSessionInfo.getResult();
        if (result != null && result != AudioSessionResult.TRANSCRIPTION_ERROR) {
            L7E l7e = this.A03;
            if (str == null) {
                str = "";
            }
            C11T.A02(new M6P(new C51741MtQ(audioSessionInfo.getConfidenceScoreLogP(), str, audioSessionInfo.getLanguageId(), AbstractC167007dF.A1X(result, AudioSessionResult.UNSUPPORTED_LANGUAGE)), l7e.A00, l7e.A01, l7e.A02));
        } else {
            L7E l7e2 = this.A03;
            AudioSessionError error = audioSessionInfo.getError();
            if (error == null || (str2 = error.toString()) == null) {
                str2 = "Unknown error";
            }
            l7e2.A00(new Exception(str2));
        }
        c1580477o.A03.remove(this);
    }

    public final void onTentativeTextFragment(String str) {
    }

    public C46102Kb2(C1580477o c1580477o, L7E l7e, int i) {
        this.A03 = l7e;
        this.A02 = c1580477o;
        this.A01 = i;
    }

    public final void onTextFragment(String str) {
        this.A00++;
    }
}
