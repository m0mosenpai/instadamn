package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Wpc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71190Wpc implements Cloneable {
    public Integer A00;
    public boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !AbstractC167017dG.A1Z(this, obj)) {
                return false;
            }
            C71190Wpc c71190Wpc = (C71190Wpc) obj;
            if (this.A00 != c71190Wpc.A00 || this.A01 != c71190Wpc.A01) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int i = (this.A01 ? 1 : 0) * 31;
        int intValue = this.A00.intValue();
        switch (intValue) {
            case 1:
                str = "BOX_BLUR";
                break;
            case 2:
                str = "GAUSS_BLUR";
                break;
            case 3:
                str = "FLASH";
                break;
            case 4:
                str = "LEAK";
                break;
            case 5:
                str = "LEAK_COMPOSITE";
                break;
            case 6:
                str = "PS";
                break;
            case 7:
                str = "PS_COMPOSITE";
                break;
            case 8:
                str = "FR";
                break;
            case 9:
                str = "FR_COMPOSITE";
                break;
            case 10:
                str = "FR_BW";
                break;
            case 11:
                str = "FR_BW_COMPOSITE";
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                str = "VHS";
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                str = "VHS_COMPOSITE";
                break;
            default:
                str = "COPY";
                break;
        }
        return i + str.hashCode() + intValue;
    }

    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C71190Wpc clone() {
        try {
            Object clone = super.clone();
            C14360o3.A0C(clone, "null cannot be cast to non-null type com.instagram.camera.effect.mq.poses.PosesFramesGLRenderer.PosesGLRendererProgramConfig");
            return (C71190Wpc) clone;
        } catch (CloneNotSupportedException unused) {
            return this;
        }
    }
}
