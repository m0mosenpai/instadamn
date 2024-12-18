package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.S3i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62237S3i {
    public static String A00(AbstractC64535TIr abstractC64535TIr) {
        int i;
        String str;
        int A00 = abstractC64535TIr.A00();
        StringBuilder A0q = AbstractC58318PtA.A0q(A00);
        for (int i2 = 0; i2 < A00; i2++) {
            RZ1 rz1 = (RZ1) abstractC64535TIr;
            if (rz1 instanceof RZ0) {
                RZ0 rz0 = (RZ0) rz1;
                int i3 = rz0.A00;
                if (((i3 - (i2 + 1)) | i2) < 0) {
                    if (i2 < 0) {
                        throw AbstractC58322PtE.A0g(i2);
                    }
                    throw AbstractC58323PtF.A0d(i2, i3);
                }
                i = ((RZ1) rz0).A00[rz0.A01 + i2];
            } else {
                i = rz1.A00[i2];
            }
            if (i != 34) {
                if (i != 39) {
                    if (i == 92) {
                        str = "\\\\";
                    } else {
                        switch (i) {
                            case 7:
                                str = "\\a";
                                break;
                            case 8:
                                str = "\\b";
                                break;
                            case 9:
                                str = "\\t";
                                break;
                            case 10:
                                str = "\\n";
                                break;
                            case 11:
                                str = "\\v";
                                break;
                            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                                str = "\\f";
                                break;
                            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                                str = "\\r";
                                break;
                            default:
                                if (i < 32 || i > 126) {
                                    AbstractC58323PtF.A1Q(A0q, i);
                                    i = (i & 7) + 48;
                                }
                                A0q.append((char) i);
                                continue;
                        }
                    }
                } else {
                    str = "\\'";
                }
            } else {
                str = "\\\"";
            }
            A0q.append(str);
        }
        return A0q.toString();
    }
}
