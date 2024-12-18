package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.GnB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37969GnB extends C17T implements InterfaceC84103ov {
    @Override // X.InterfaceC84103ov
    public final C84093ou F4B() {
        return new C84093ou(getBooleanValueByHashCode(566986125));
    }

    @Override // X.InterfaceC84103ov
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        getCanAddTag();
        A0X.put("can_add_tag", Boolean.valueOf(getBooleanValueByHashCode(566986125)));
        return AbstractC37304Gc5.A07(this, A0X);
    }

    @Override // X.InterfaceC84103ov
    public final boolean getCanAddTag() {
        return getBooleanValueByHashCode(566986125);
    }
}
