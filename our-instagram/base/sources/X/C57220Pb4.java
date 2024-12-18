package X;

import com.facebook.rsys.audio.gen.AudioStream;
import com.facebook.rsys.call.gen.CallModel;
import com.facebook.rsys.call.gen.CallParticipant;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Pb4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C57220Pb4 extends C03E implements InterfaceC16660sJ {
    public static final C57220Pb4 A00 = new C57220Pb4();

    public C57220Pb4() {
        super(1, AbstractC53432NkL.class, "isBotAudioEnabled", "isBotAudioEnabled(Lcom/facebook/rsys/call/gen/CallModel;)Ljava/lang/Boolean;", 1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        CallModel callModel = (CallModel) obj;
        C14360o3.A0B(callModel, 0);
        boolean z = true;
        ArrayList arrayList = callModel.remoteParticipants;
        if (arrayList == null) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj2 = it.next();
                if (C14360o3.A0K(((CallParticipant) obj2).userId, "0")) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        CallParticipant callParticipant = (CallParticipant) obj2;
        if (callParticipant == null) {
            return true;
        }
        ArrayList arrayList2 = callParticipant.mediaState.audioStreams;
        C14360o3.A06(arrayList2);
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj3 = it2.next();
                if (((AudioStream) obj3).type == 9) {
                    break;
                }
            } else {
                obj3 = null;
                break;
            }
        }
        AudioStream audioStream = (AudioStream) obj3;
        if (audioStream == null) {
            return null;
        }
        if (audioStream.streamStateDesired != 3) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
