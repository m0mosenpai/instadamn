package X;

import java.io.IOException;

/* renamed from: X.MVy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50613MVy {
    public static final C51756Mtf A00(String str) {
        C51756Mtf c51756Mtf = null;
        if (str != null) {
            try {
                C16L A03 = AbstractC221915u.A00.A03(str);
                A03.A12();
                c51756Mtf = OOx.parseFromJson(A03);
                return c51756Mtf;
            } catch (IOException e) {
                AbstractC12120kG.A06("TrialParamsConverter", "Failed to deserialize TrialParams from ClipsDraft", e);
            }
        }
        return c51756Mtf;
    }
}
