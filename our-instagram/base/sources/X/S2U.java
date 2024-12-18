package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes10.dex */
public abstract class S2U {
    public static String A00(AbstractC64536TIs abstractC64536TIs) {
        String str;
        int A01 = abstractC64536TIs.A01();
        StringBuilder A0q = AbstractC58318PtA.A0q(A01);
        for (int i = 0; i < A01; i++) {
            RLN rln = (RLN) abstractC64536TIs;
            boolean z = rln instanceof RLM;
            RLN rln2 = rln;
            if (z) {
                RLM rlm = (RLM) rln;
                int i2 = rlm.A00;
                rln2 = rlm;
                if (((i2 - (i + 1)) | i) < 0) {
                    if (i < 0) {
                        throw AbstractC58322PtE.A0g(i);
                    }
                    throw AbstractC58323PtF.A0d(i, i2);
                }
            }
            int i3 = rln2.A00[i];
            if (i3 != 34) {
                if (i3 != 39) {
                    if (i3 != 92) {
                        switch (i3) {
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
                                if (i3 < 32 || i3 > 126) {
                                    AbstractC58323PtF.A1Q(A0q, i3);
                                    i3 = (i3 & 7) + 48;
                                }
                                A0q.append((char) i3);
                                continue;
                        }
                    } else {
                        str = "\\\\";
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
