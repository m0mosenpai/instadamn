package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.GnC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37970GnC extends C17T implements InterfaceC84013ol {
    @Override // X.InterfaceC84013ol
    public final C84003ok F4A() {
        return new C84003ok(getBooleanValueByHashCode(-586140148));
    }

    @Override // X.InterfaceC84013ol
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        getShouldAllowRestore();
        A0X.put(AbstractC111324zv.A00(5346), Boolean.valueOf(getBooleanValueByHashCode(-586140148)));
        return AbstractC37304Gc5.A07(this, A0X);
    }

    @Override // X.InterfaceC84013ol
    public final boolean getShouldAllowRestore() {
        return getBooleanValueByHashCode(-586140148);
    }
}
