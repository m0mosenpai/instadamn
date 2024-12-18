package X;

import com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache;
import com.google.common.collect.ImmutableList;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

/* renamed from: X.6qX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150746qX {
    public final ARDFileCache A00;
    public final C150706qR A01;
    public final C0Gd A02;
    public final C150736qU A03;
    public final InterfaceC40711ue A04;

    public final void A00(EnumC150766qZ enumC150766qZ) {
        InterfaceC19610xo ARD;
        EnumC150766qZ enumC150766qZ2 = EnumC150766qZ.WITHDRAWN;
        C150706qR c150706qR = this.A01;
        if (enumC150766qZ != enumC150766qZ2) {
            ARD = c150706qR.A00.ARD();
            ARD.EEj("flmEffectsDeleted");
        } else {
            InterfaceC19630xq interfaceC19630xq = c150706qR.A00;
            if (interfaceC19630xq.getBoolean("flmEffectsDeleted", false)) {
                return;
            }
            java.util.Set allKeys = this.A00.getAllKeys();
            C14360o3.A07(allKeys);
            if (allKeys.isEmpty()) {
                ARD = interfaceC19630xq.ARD();
                ARD.E77("flmEffectsDeleted", true);
            } else {
                ImmutableList copyOf = ImmutableList.copyOf((Collection) allKeys);
                C14360o3.A07(copyOf);
                try {
                    AYB ayb = (AYB) AD3.class.getMethod("create", new Class[0]).invoke(null, new Object[0]);
                    ayb.A00.A05("effect_ids", copyOf);
                    ayb.A02 = true;
                    C1Dk A00 = ayb.A00();
                    C14360o3.A07(A00);
                    A00.setMaxToleratedCacheAgeMs(StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
                    A00.setFreshCacheAgeMs(StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
                    this.A04.ATV(new AXT(this), new AY0(this, allKeys), A00);
                    return;
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        ARD.apply();
    }

    public C150746qX(C150736qU c150736qU, ARDFileCache aRDFileCache, C150706qR c150706qR, C0Gd c0Gd, InterfaceC40711ue interfaceC40711ue) {
        this.A03 = c150736qU;
        this.A01 = c150706qR;
        this.A04 = interfaceC40711ue;
        this.A00 = aRDFileCache;
        this.A02 = c0Gd;
        c150736qU.A01.add(new InterfaceC58362lv() { // from class: X.6qY
            @Override // X.InterfaceC58362lv
            public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
                EnumC150766qZ enumC150766qZ = (EnumC150766qZ) obj;
                C14360o3.A0B(enumC150766qZ, 0);
                C150746qX.this.A00(enumC150766qZ);
            }
        });
        EnumC150766qZ enumC150766qZ = c150736qU.A04;
        enumC150766qZ = enumC150766qZ == null ? EnumC150766qZ.UNSET_OR_UNRECOGNIZED_ENUM_VALUE : enumC150766qZ;
        if (enumC150766qZ == EnumC150766qZ.UNSET_OR_UNRECOGNIZED_ENUM_VALUE) {
            c150736qU.A00();
        } else {
            A00(enumC150766qZ);
        }
    }
}
