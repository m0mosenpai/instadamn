package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Gd5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37363Gd5 {
    public static Map A00(InterfaceC84033on interfaceC84033on) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC84033on.getAdditionalAudioUsername() != null) {
            A1I.put("additional_audio_username", interfaceC84033on.getAdditionalAudioUsername());
        }
        if (interfaceC84033on.Ady() != null) {
            InterfaceC84013ol Ady = interfaceC84033on.Ady();
            if (Ady != null) {
                treeUpdaterJNI = Ady.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("audio_reattribution_info", treeUpdaterJNI);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
