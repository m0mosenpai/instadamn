package X;

import com.facebook.common.smartgc.art.ArtSmartGc;
import com.facebook.common.smartgc.dalvik.DalvikSmartGc;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public abstract class S9Z {
    public static InterfaceC65540TmD A00;
    public static final AtomicBoolean A01;
    public static final AbstractC63987SxJ[] A03 = new AbstractC63987SxJ[8];
    public static final C63988SxK[] A02 = new C63988SxK[8];

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.TmD] */
    /* JADX WARN: Type inference failed for: r0v9 */
    static {
        ?? r0;
        if (!DalvikSmartGc.CAN_RUN_ON_THIS_PLATFORM) {
            if (!ArtSmartGc.CAN_RUN_ON_THIS_PLATFORM) {
                r0 = C63986SxG.A00;
            } else {
                r0 = new Object();
            }
        } else {
            r0 = new Object();
        }
        A00 = r0;
        A01 = AbstractC166997dE.A17();
    }
}
