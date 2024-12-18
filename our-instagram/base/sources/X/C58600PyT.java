package X;

import com.instagram.location.impl.LocationPluginImpl;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.PyT, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58600PyT extends AbstractRunnableC14200nk {
    public final /* synthetic */ LocationPluginImpl A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58600PyT(LocationPluginImpl locationPluginImpl) {
        super(148, 4, false, false);
        this.A00 = locationPluginImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LocationPluginImpl locationPluginImpl = this.A00;
        synchronized (locationPluginImpl.A02) {
            try {
                try {
                    Map map = locationPluginImpl.A03;
                    Iterator A16 = AbstractC166997dE.A16(map);
                    while (A16.hasNext()) {
                        ((AbstractC128665rZ) A16.next()).A06();
                    }
                    map.clear();
                } catch (Exception e) {
                    C0K8.A0F("LocationPluginImpl", "Failed to stop locations on app background", e);
                }
            } finally {
                LocationPluginImpl.A06(locationPluginImpl);
            }
        }
    }
}
