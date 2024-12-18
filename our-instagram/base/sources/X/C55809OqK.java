package X;

import com.instagram.location.impl.LocationPluginImpl;
import com.instagram.location.impl.LocationSignalPackageImpl;
import java.util.Map;

/* renamed from: X.OqK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55809OqK implements C2JL {
    public final /* synthetic */ LocationPluginImpl A00;
    public final /* synthetic */ InterfaceC57959Pn5 A01;

    public C55809OqK(LocationPluginImpl locationPluginImpl, InterfaceC57959Pn5 interfaceC57959Pn5) {
        this.A00 = locationPluginImpl;
        this.A01 = interfaceC57959Pn5;
    }

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
        Map map = this.A00.A04;
        InterfaceC57959Pn5 interfaceC57959Pn5 = this.A01;
        if (map.containsKey(interfaceC57959Pn5)) {
            map.remove(interfaceC57959Pn5);
        }
    }

    @Override // X.C2JL
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C202098wp c202098wp = (C202098wp) obj;
        Map map = this.A00.A04;
        InterfaceC57959Pn5 interfaceC57959Pn5 = this.A01;
        if (map.containsKey(interfaceC57959Pn5)) {
            try {
                interfaceC57959Pn5.DQG(new LocationSignalPackageImpl(c202098wp));
            } finally {
                map.remove(interfaceC57959Pn5);
            }
        }
    }
}
