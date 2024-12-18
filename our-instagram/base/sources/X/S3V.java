package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes10.dex */
public abstract class S3V {
    public static String A00(final AbstractC58536Px4 input) {
        int i;
        String str;
        int A02 = input.A02();
        StringBuilder A0q = AbstractC58318PtA.A0q(A02);
        for (int i2 = 0; i2 < A02; i2++) {
            C58535Px3 c58535Px3 = (C58535Px3) input;
            if (c58535Px3 instanceof C60803RTo) {
                C60803RTo c60803RTo = (C60803RTo) c58535Px3;
                int i3 = c60803RTo.A00;
                if (((i3 - (i2 + 1)) | i2) < 0) {
                    if (i2 < 0) {
                        throw AbstractC58322PtE.A0g(i2);
                    }
                    throw AbstractC58323PtF.A0d(i2, i3);
                }
                i = ((C58535Px3) c60803RTo).A00[c60803RTo.A01 + i2];
            } else {
                i = c58535Px3.A00[i2];
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
