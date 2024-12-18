package com.facebook.rsys.camera.gen;

import X.AbstractC25226BEj;
import X.AbstractC50523MSb;
import X.AnonymousClass001;
import X.C2N9;
import X.C55648OnZ;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes9.dex */
public class Camera {
    public static long sMcfTypeId;
    public final String identifier;
    public final String name;
    public static final Camera FRONT_FACING_CAMERA = new Camera("generic_front_facing", "Front facing camera");
    public static final Camera BACK_FACING_CAMERA = new Camera("generic_back_facing", "Back facing camera");
    public static final Camera DUAL_CAMERA = new Camera("generic_dual_camera", "Dual camera");
    public static C2N9 CONVERTER = C55648OnZ.A00(19);

    public static native Camera createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Camera)) {
            return false;
        }
        Camera camera = (Camera) obj;
        return this.identifier.equals(camera.identifier) && this.name.equals(camera.name);
    }

    public int hashCode() {
        return AbstractC25226BEj.A03(this.name, AbstractC50523MSb.A02(this.identifier));
    }

    public String toString() {
        return AnonymousClass001.A11("Camera{identifier=", this.identifier, ",name=", this.name, "}");
    }

    public Camera(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.identifier = str;
        this.name = str2;
    }
}
