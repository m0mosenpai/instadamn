package X;

import com.facebook.mantle.ig.IGMantle;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import com.instagram.ml.remotepresence.RpModelDownloadManager;

/* loaded from: classes4.dex */
public final class B4E implements InterfaceC19960yQ {
    public final /* synthetic */ RpModelDownloadManager A00;
    public final /* synthetic */ C125025l8 A01;

    public B4E(RpModelDownloadManager rpModelDownloadManager, C125025l8 c125025l8) {
        this.A01 = c125025l8;
        this.A00 = rpModelDownloadManager;
    }

    @Override // X.InterfaceC19960yQ
    public final /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        IGMantle iGMantle = (IGMantle) obj;
        C125025l8 c125025l8 = this.A01;
        if (!c125025l8.A0B) {
            InterfaceC16660sJ interfaceC16660sJ = c125025l8.A08;
            InterfaceC09390do interfaceC09390do = c125025l8.A02;
            interfaceC16660sJ.invoke(interfaceC09390do.getValue());
            String str = c125025l8.A01;
            String str2 = (String) interfaceC09390do.getValue();
            ImmutableMap immutableMap = RegularImmutableMap.A02;
            C14360o3.A07(immutableMap);
            iGMantle.runMantleWithConfigStr(str, str2, immutableMap);
        } else {
            C129805tk c129805tk = c125025l8.A00;
            if (c129805tk != null) {
                c129805tk.A00.markerPoint(331812717, "MODEL_DOWNLOAD_START");
            }
            C2OD.A03(new Ft6(0, c125025l8, this.A00), iGMantle.runMantleWithConfigStr(c125025l8.A01, (String) c125025l8.A02.getValue(), (ImmutableMap) c125025l8.A04.getValue()), C1M8.A01);
        }
        return C0eB.A00;
    }
}
