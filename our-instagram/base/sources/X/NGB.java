package X;

import android.content.res.AssetManager;
import com.facebook.mobileconfig.MobileConfigManagerHolderImpl;
import java.io.File;
import java.util.HashSet;

/* loaded from: classes9.dex */
public final class NGB extends AbstractRunnableC14200nk {
    public final /* synthetic */ C46312At A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NGB(C46312At c46312At) {
        super(384189403, 3, false, false);
        this.A00 = c46312At;
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [X.19r, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        C114685Fy c114685Fy = this.A00.A00;
        if (c114685Fy != null) {
            OGu oGu = c114685Fy.A00;
            C229419w c229419w = oGu.A00.A01;
            MobileConfigManagerHolderImpl A00 = C228319l.A00(c229419w.A0A());
            if (A00 == null) {
                C0K8.A0D("MobileConfigFBTFactoryHolder", "MobileConfigFBTFactoryHolder:syncConfigsAndMayUpdateManager FBTMCSetupStatusNoManager");
                return;
            }
            MobileConfigManagerHolderImpl updateConfigsWithParamsListAndMayCreateManager = A00.updateConfigsWithParamsListAndMayCreateManager(10000);
            if (updateConfigsWithParamsListAndMayCreateManager == null) {
                return;
            }
            String directoryPathForSession = updateConfigsWithParamsListAndMayCreateManager.getDirectoryPathForSession();
            File A11 = AbstractC166987dD.A11(directoryPathForSession);
            int i = c229419w.A06;
            PUZ puz = new PUZ(oGu, C4G9.A03(A11, i));
            InterfaceC08830cm interfaceC08830cm = null;
            File file = null;
            InterfaceC228619o interfaceC228619o = null;
            HashSet A1H = AbstractC166987dD.A1H();
            boolean z = false;
            AssetManager assetManager = c229419w.A07;
            ?? obj = new Object();
            String bufferPathPostFix = updateConfigsWithParamsListAndMayCreateManager.getBufferPathPostFix();
            File file2 = c229419w.A0C;
            if (file2 != null) {
                file = file2;
            }
            InterfaceC08830cm interfaceC08830cm2 = c229419w.A0Y;
            if (interfaceC08830cm2 != null) {
                z = c229419w.A0F;
                interfaceC08830cm = interfaceC08830cm2;
            }
            InterfaceC228619o interfaceC228619o2 = c229419w.A08;
            if (interfaceC228619o2 != null) {
                interfaceC228619o = interfaceC228619o2;
            }
            C229419w c229419w2 = new C229419w(assetManager, interfaceC228619o, null, null, obj, new C228319l(), null, file, bufferPathPostFix, A1H, interfaceC08830cm, puz, null, null, i, -1, 1, false, z, false, false);
            c229419w2.A0F(updateConfigsWithParamsListAndMayCreateManager);
            String str = "/";
            if (directoryPathForSession.endsWith("/")) {
                str = "";
            }
            oGu.A00 = new C54513O6q(c229419w2, C4G9.A01(AbstractC166987dD.A11(AnonymousClass001.A0g(directoryPathForSession, str, "extra_data.json"))));
        }
    }
}
