package X;

import com.instagram.realtimeclient.RealtimeConstants;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Kf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71823Kf implements InterfaceC71833Kg {
    public static final C71823Kf A00 = new Object();
    public static final C006802i A01 = C006802i.A0p;

    public static final void A00(int i, int i2) {
        if (i2 >= Math.max(C1AD.A01(C06090Tz.A05, 18587080858865891L), 500L)) {
            InterfaceC19610xo ARD = AbstractC19730y1.A00(AbstractC12960li.A00).A00.ARD();
            ARD.E77("notification_controller_cache_oversized", true);
            ARD.apply();
        }
        C006802i c006802i = A01;
        c006802i.markerAnnotate(813576146, i, "has_over_sized_cache", AbstractC19730y1.A00(AbstractC12960li.A00).A00.getBoolean("notification_controller_cache_oversized", false));
        c006802i.markerAnnotate(813576146, i, "in_memory_cache_size", i2);
        c006802i.markerEnd(813576146, i, (short) 2);
    }

    @Override // X.InterfaceC71833Kg
    public final void Ems(Integer num, String str, int i, boolean z) {
        String str2;
        C14360o3.A0B(num, 3);
        C006802i c006802i = A01;
        c006802i.markerStart(813576146, i);
        c006802i.markerAnnotate(813576146, i, "category", str);
        c006802i.markerAnnotate(813576146, i, "is_direct", RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING.equals(str));
        c006802i.markerAnnotate(813576146, i, "is_cold_start", true);
        if (num.intValue() != 0) {
            str2 = "V2";
        } else {
            str2 = "V1";
        }
        c006802i.markerAnnotate(813576146, i, "controller_version", str2);
    }

    @Override // X.InterfaceC71833Kg
    public final void EpM(Collection collection, int i) {
        C14360o3.A0B(collection, 1);
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ((List) it.next()).size();
        }
        A00(i, i2);
    }

    @Override // X.InterfaceC71833Kg
    public final void AUj(int i, String str) {
        C006802i c006802i = A01;
        if (str == null) {
            str = "";
        }
        c006802i.markerAnnotate(813576146, i, AbstractC111324zv.A00(406), str);
        c006802i.markerEnd(813576146, i, (short) 3);
    }

    @Override // X.InterfaceC71833Kg
    public final void EpN(InterfaceC16820sZ interfaceC16820sZ, int i) {
        A00(i, ((Number) interfaceC16820sZ.invoke()).intValue());
    }
}
