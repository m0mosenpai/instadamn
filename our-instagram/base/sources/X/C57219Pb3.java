package X;

import com.facebook.rsys.audio.gen.AudioStream;
import com.facebook.rsys.call.gen.CallModel;
import com.facebook.rsys.call.gen.ParticipantMediaState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.Pb3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C57219Pb3 extends C03E implements InterfaceC16660sJ {
    public static final C57219Pb3 A00 = new C57219Pb3();

    public C57219Pb3() {
        super(1, AbstractC53734NpR.class, "isSelfAudioOn", "isSelfAudioOn(Lcom/facebook/rsys/call/gen/CallModel;)Z", 1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z;
        CallModel callModel = (CallModel) obj;
        C14360o3.A0B(callModel, 0);
        ParticipantMediaState participantMediaState = callModel.selfParticipant.mediaState;
        if (participantMediaState != null) {
            ArrayList arrayList = participantMediaState.audioStreams;
            C14360o3.A06(arrayList);
            z = false;
            if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    int i = ((AudioStream) it.next()).streamState;
                    if (i != 3 && i != 2 && i != 0) {
                    }
                }
            }
            return Boolean.valueOf(z);
        }
        z = true;
        return Boolean.valueOf(z);
    }
}
