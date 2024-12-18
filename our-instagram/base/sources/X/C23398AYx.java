package X;

import android.view.Surface;

/* renamed from: X.AYx, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23398AYx implements InterfaceC176157sY {
    public final /* synthetic */ InterfaceC176157sY A00;
    public final /* synthetic */ C176247sh A01;

    public C23398AYx(InterfaceC176157sY interfaceC176157sY, C176247sh c176247sh) {
        this.A01 = c176247sh;
        this.A00 = interfaceC176157sY;
    }

    public static void A00(InterfaceC176157sY interfaceC176157sY, C176247sh c176247sh, String str) {
        AbstractC223559ty abstractC223559ty = new AbstractC223559ty(23000, str);
        c176247sh.A0D.Cl9(abstractC223559ty, "start_recording_video_failed", "AbstractVideoRecordingTrack", "", "addVideoOutputToMediapipeline", null, c176247sh.hashCode());
        c176247sh.release();
        interfaceC176157sY.DE8(abstractC223559ty);
    }

    @Override // X.InterfaceC176157sY
    public final void DE8(AbstractC223559ty abstractC223559ty) {
        C176247sh c176247sh = this.A01;
        c176247sh.A0D.Cl9(abstractC223559ty, "start_recording_video_failed", "AbstractVideoRecordingTrack", "", "start", null, AbstractC166987dD.A0M(c176247sh));
        c176247sh.release();
        this.A00.DE8(abstractC223559ty);
    }

    @Override // X.InterfaceC176157sY
    public final void onSuccess() {
        C23417AZq c23417AZq;
        C176247sh c176247sh = this.A01;
        InterfaceC176157sY interfaceC176157sY = this.A00;
        InterfaceC176007sJ interfaceC176007sJ = (InterfaceC176007sJ) c176247sh.A0F.get();
        if (interfaceC176007sJ == null) {
            A00(interfaceC176157sY, c176247sh, "VideoOutputProvider is null while adding to Mediapipeline");
            return;
        }
        BES bes = c176247sh.A06;
        if (bes != null && (c23417AZq = c176247sh.A05) != null) {
            Surface BI6 = bes.BI6();
            c176247sh.A01 = BI6;
            if (BI6 == null) {
                A00(interfaceC176157sY, c176247sh, "Recording Surface is null");
                return;
            }
            if (!c23417AZq.A02) {
                C176507t8 c176507t8 = new C176507t8(BI6, false);
                c176507t8.A09 = 1;
                c176247sh.A07 = c176507t8;
                c176507t8.A0D = false;
                interfaceC176007sJ.A9q(c176247sh.A07);
                InterfaceC176037sM interfaceC176037sM = c176247sh.A0D;
                interfaceC176037sM.Ckz(19, "recording_start_video_finished");
                interfaceC176037sM.Cl9(null, "start_recording_video_finished", "AbstractVideoRecordingTrack", "", null, null, AbstractC166987dD.A0M(c176247sh));
                interfaceC176157sY.onSuccess();
                ABV abv = c176247sh.A02;
                if (abv == null) {
                    return;
                }
                abv.A00();
                c176247sh.A02 = null;
                return;
            }
            throw AbstractC166987dD.A18(AbstractC111324zv.A00(1701));
        }
        A00(interfaceC176157sY, c176247sh, "mVideoEncoder or mConfig are null while adding to Mediapipeline");
    }
}
