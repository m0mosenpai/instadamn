package X;

import android.content.Context;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.8ef, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C191838ef {
    public final /* bridge */ /* synthetic */ C191858eh A00(Context context, InterfaceC191788ea interfaceC191788ea, String str, String str2, Map map, long j) {
        C191778eZ c191778eZ = (C191778eZ) interfaceC191788ea;
        C191858eh c191858eh = new C191858eh();
        ((AbstractC191868ei) c191858eh).A00 = context.getApplicationContext();
        BitSet bitSet = new BitSet(2);
        bitSet.clear();
        c191778eZ.getClass();
        c191858eh.A02 = c191778eZ.A00;
        bitSet.set(0);
        c191858eh.A03 = str;
        bitSet.set(1);
        c191858eh.A01 = j;
        c191858eh.A00 = j;
        c191858eh.A05 = (HashMap) map;
        c191858eh.A08 = c191778eZ.A03;
        c191858eh.A06 = c191778eZ.A01;
        c191858eh.A07 = c191778eZ.A02;
        AbstractC191878ej.A00(bitSet, new String[]{"session", "appId"});
        c191858eh.A04 = AbstractC191888ek.A00(c191858eh.A05, c191858eh.A03, str2);
        return c191858eh;
    }
}
