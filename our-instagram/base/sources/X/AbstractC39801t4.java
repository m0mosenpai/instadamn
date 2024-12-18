package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.1t4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC39801t4 {
    public static final long A00;

    static {
        long j;
        long j2 = 0;
        for (Integer num : C05F.A00(14)) {
            switch (num.intValue()) {
                case 1:
                    j = 2;
                    break;
                case 2:
                    j = 4;
                    break;
                case 3:
                    j = 8;
                    break;
                case 4:
                    j = 16;
                    break;
                case 5:
                    j = 32;
                    break;
                case 6:
                    j = 64;
                    break;
                case 7:
                    j = 128;
                    break;
                case 8:
                    j = 256;
                    break;
                case 9:
                    j = 512;
                    break;
                case 10:
                    j = OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED;
                    break;
                case 11:
                    j = OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_NEEDED;
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    j = 8388608;
                    break;
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    j = 1073741824;
                    break;
                default:
                    j = 1;
                    break;
            }
            j2 |= j;
        }
        A00 = j2;
    }
}
