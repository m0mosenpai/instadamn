package X;

import com.facebook.cameracore.mediapipeline.arengineservices.modules.DynamicServiceModule;
import java.util.AbstractCollection;

/* loaded from: classes4.dex */
public final class AWQ implements BDA {
    public final C203848zt A00;

    public static void A00(C203848zt c203848zt, InterfaceC1820085k interfaceC1820085k, C0Gd c0Gd, AbstractCollection abstractCollection) {
        abstractCollection.add(new DynamicServiceModule(new AWQ(c203848zt), interfaceC1820085k, c0Gd));
    }

    @Override // X.BDA
    public final String BUh() {
        C203848zt c203848zt = this.A00;
        String str = c203848zt.A01;
        if (str != null) {
            return str;
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Invalid configuration key: ");
        A1C.append(c203848zt);
        throw AbstractC166987dD.A12(AbstractC166997dE.A0x(" Please set moduleClassName in ServiceTypeKey constructor, or use a valid ServiceTypeKey.", A1C));
    }

    @Override // X.BDA
    public final EnumC150506pz Btj() {
        return this.A00.A00;
    }

    @Override // X.BDA
    public final boolean CVz(AnonymousClass904 anonymousClass904) {
        if (anonymousClass904 != null && AnonymousClass904.A01(anonymousClass904, this.A00)) {
            return true;
        }
        return false;
    }

    public AWQ(C203848zt c203848zt) {
        this.A00 = c203848zt;
    }
}
