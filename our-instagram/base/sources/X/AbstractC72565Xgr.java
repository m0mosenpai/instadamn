package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Collections;

/* renamed from: X.Xgr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72565Xgr {
    public static void A00(AbstractC95034Pm abstractC95034Pm, byte b, int i) {
        if (i > 0) {
            if (b != 2) {
                if (b != 3) {
                    if (b != 4) {
                        if (b != 6) {
                            if (b != 8) {
                                if (b != 19) {
                                    int i2 = 0;
                                    switch (b) {
                                        case 10:
                                            abstractC95034Pm.A0A();
                                            return;
                                        case 11:
                                            abstractC95034Pm.A0a();
                                            return;
                                        case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                                            abstractC95034Pm.A0F(Collections.emptyMap());
                                            while (true) {
                                                byte b2 = abstractC95034Pm.A0B().A00;
                                                if (b2 == 0) {
                                                    abstractC95034Pm.A0I();
                                                    return;
                                                }
                                                A00(abstractC95034Pm, b2, i - 1);
                                            }
                                        case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                                            C73303Xzu A0D = abstractC95034Pm.A0D();
                                            while (true) {
                                                int i3 = A0D.A02;
                                                if (i3 < 0) {
                                                    throw new RuntimeException("Peeking into a map not supported, likely because it's sized");
                                                }
                                                if (i2 < i3) {
                                                    int i4 = i - 1;
                                                    A00(abstractC95034Pm, A0D.A00, i4);
                                                    A00(abstractC95034Pm, A0D.A01, i4);
                                                    i2++;
                                                } else {
                                                    return;
                                                }
                                            }
                                        case 14:
                                            C73294Xzj A0E = abstractC95034Pm.A0E();
                                            while (true) {
                                                int i5 = A0E.A01;
                                                if (i5 < 0) {
                                                    throw new RuntimeException("Peeking into a set not supported, likely because it's sized");
                                                }
                                                if (i2 < i5) {
                                                    A00(abstractC95034Pm, A0E.A00, i - 1);
                                                    i2++;
                                                } else {
                                                    return;
                                                }
                                            }
                                        case Process.SIGTERM /* 15 */:
                                            C73293Xzi A0C = abstractC95034Pm.A0C();
                                            while (true) {
                                                int i6 = A0C.A01;
                                                if (i6 < 0) {
                                                    throw new RuntimeException("Peeking into a list not supported, likely because it's sized");
                                                }
                                                if (i2 < i6) {
                                                    A00(abstractC95034Pm, A0C.A00, i - 1);
                                                    i2++;
                                                } else {
                                                    return;
                                                }
                                            }
                                        default:
                                            throw new RuntimeException(AnonymousClass001.A0O("Invalid type encountered during skipping: ", b));
                                    }
                                } else {
                                    abstractC95034Pm.A08();
                                }
                            } else {
                                abstractC95034Pm.A09();
                            }
                        } else {
                            abstractC95034Pm.A0H();
                        }
                    } else {
                        abstractC95034Pm.A07();
                    }
                } else {
                    abstractC95034Pm.A06();
                }
            } else {
                abstractC95034Pm.A0Z();
            }
        } else {
            throw new RuntimeException("Maximum skip depth exceeded");
        }
    }
}
