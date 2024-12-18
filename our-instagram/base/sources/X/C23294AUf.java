package X;

import com.aiplatform.modelloaders.nativemodelloader.ig.IgVoltronModelLoader;
import com.instagram.common.session.UserSession;

/* renamed from: X.AUf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23294AUf implements YNO {
    public final /* synthetic */ C8MQ A00;

    public C23294AUf(C8MQ c8mq) {
        this.A00 = c8mq;
    }

    @Override // X.YNO
    public final boolean ACS() {
        C8E7 c8e7 = IgVoltronModelLoader.Companion;
        UserSession userSession = this.A00.A03;
        if (c8e7.A00(userSession).arePytorchLibrariesLoaded.get() && c8e7.A00(userSession).areSentencePieceLibrariesLoaded.get()) {
            return true;
        }
        return false;
    }
}
