package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.S2s, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62222S2s {
    public static String A00(AbstractC64539TIv abstractC64539TIv) {
        String str;
        int A05 = abstractC64539TIv.A05();
        StringBuilder A0q = AbstractC58318PtA.A0q(A05);
        for (int i = 0; i < A05; i++) {
            int A02 = abstractC64539TIv.A02(i);
            if (A02 != 34) {
                if (A02 != 39) {
                    if (A02 == 92) {
                        str = "\\\\";
                    } else {
                        switch (A02) {
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
                                if (A02 < 32 || A02 > 126) {
                                    AbstractC58323PtF.A1Q(A0q, A02);
                                    A02 = (A02 & 7) + 48;
                                }
                                A0q.append((char) A02);
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
