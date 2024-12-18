package X;

import com.aiplatform.modelloaders.nativemodelloader.ig.IgVoltronModelLoader;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.AUg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23295AUg implements YNO {
    public final int A00;
    public final Object A01;

    public C23295AUg(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.YNO
    public final boolean ACS() {
        UserSession userSession;
        AtomicBoolean atomicBoolean;
        int i = this.A00;
        C8E7 c8e7 = IgVoltronModelLoader.Companion;
        switch (i) {
            case 1:
                atomicBoolean = c8e7.A00(((C72800XnN) this.A01).A03).arePytorchLibrariesLoaded;
                break;
            case 2:
            default:
                userSession = ((C72800XnN) this.A01).A03;
                atomicBoolean = c8e7.A00(userSession).areExecuTorchLibrariesLoaded;
                break;
            case 3:
                userSession = (UserSession) this.A01;
                atomicBoolean = c8e7.A00(userSession).areExecuTorchLibrariesLoaded;
                break;
        }
        return atomicBoolean.get();
    }
}
