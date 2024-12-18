package X;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.module.annotations.ReactModule;

/* renamed from: X.Sdi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63137Sdi {
    public final String A00;
    public final InterfaceC08830cm A01;

    public static C63137Sdi A00(Class cls, InterfaceC08830cm interfaceC08830cm) {
        String name;
        ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
        if (reactModule == null) {
            C0I2.A04("ModuleSpec", AnonymousClass001.A0g("Could not find @ReactModule annotation on ", cls.getName(), ". So creating the module eagerly to get the name. Consider adding an annotation to make this Lazy"));
            name = ((NativeModule) interfaceC08830cm.get()).getName();
        } else {
            name = reactModule.name();
        }
        return new C63137Sdi(name, interfaceC08830cm);
    }

    public C63137Sdi(String str, InterfaceC08830cm interfaceC08830cm) {
        this.A01 = interfaceC08830cm;
        this.A00 = str;
    }

    public C63137Sdi(InterfaceC08830cm interfaceC08830cm) {
        this.A01 = interfaceC08830cm;
        this.A00 = null;
    }
}
