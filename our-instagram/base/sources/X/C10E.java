package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.10E, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C10E {
    public static final C20730zt A00 = new C20730zt(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);
    public static final C20730zt A01 = new C20730zt("PENDING");

    public static final C008002u A00(Object obj) {
        if (obj == null) {
            obj = AbstractC20780zy.A01;
        }
        return new C008002u(obj);
    }
}
