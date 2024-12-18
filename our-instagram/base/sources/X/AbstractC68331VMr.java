package X;

import com.facebook.video.heroplayer.ipc.AudioFocusLossSettings;
import java.util.ArrayList;

/* renamed from: X.VMr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68331VMr {
    /* JADX WARN: Type inference failed for: r4v0, types: [X.4AO, java.lang.Object] */
    public static final C4SS A00(C2BB c2bb, C69062VhD c69062VhD, String str) {
        String str2 = c69062VhD.A00;
        if (str2.length() <= 0) {
            str2 = c69062VhD.A01;
            if (str2.length() == 0) {
                str2 = "";
            }
        }
        C4AN A00 = C4AN.A00(AbstractC08820cl.A03(str2), c69062VhD.A02, AbstractC06930Yk.A0E());
        EnumC46372Az enumC46372Az = EnumC46372Az.IN_PLAY;
        Integer num = C05F.A00;
        String A002 = AbstractC111324zv.A00(3716);
        ?? obj = new Object();
        C4SS c4ss = new C4SS(new AudioFocusLossSettings(), enumC46372Az, obj, A00, null, num, A002, str, new ArrayList(), new ArrayList(), 0, 0, -1, -1, -1, -1, -1, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false);
        c4ss.A03 = c2bb;
        return c4ss;
    }
}
