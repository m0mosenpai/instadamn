package X;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.MSw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50543MSw {
    public static final ConcurrentHashMap A00 = new ConcurrentHashMap();

    public static final InterfaceC100484fC A00(Context context, C55549Olj c55549Olj, String str, InterfaceC16660sJ interfaceC16660sJ) {
        InterfaceC09390do A002;
        AbstractC167017dG.A1O(str, interfaceC16660sJ);
        ConcurrentHashMap concurrentHashMap = A00;
        Object obj = concurrentHashMap.get(str);
        if (obj == null && (obj = concurrentHashMap.putIfAbsent(str, (A002 = AbstractC09440dt.A00(EnumC09460dv.A04, new ME8(context, interfaceC16660sJ, c55549Olj, str, 17))))) == null) {
            obj = A002;
        }
        return (InterfaceC100484fC) ((InterfaceC09390do) obj).getValue();
    }
}
