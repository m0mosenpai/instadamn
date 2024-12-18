package X;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;

/* renamed from: X.ShS, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63319ShS {
    public static final C63136Sdh A00 = C63136Sdh.A00("x", "y");

    public static float A00(THX thx) {
        Integer A0E = thx.A0E();
        int intValue = A0E.intValue();
        if (intValue != 6) {
            if (intValue == 0) {
                thx.A0I();
                float A03 = AbstractC58321PtD.A03(thx);
                while (thx.A0Q()) {
                    thx.A0N();
                }
                thx.A0K();
                return A03;
            }
            throw AbstractC167007dF.A0c("Unknown value for token of type ", AbstractC61651RrR.A00(A0E));
        }
        return AbstractC58321PtD.A03(thx);
    }

    public static int A01(THX thx) {
        thx.A0I();
        int A0B = (int) (thx.A0B() * 255.0d);
        int A0B2 = (int) (thx.A0B() * 255.0d);
        int A0B3 = (int) (thx.A0B() * 255.0d);
        while (thx.A0Q()) {
            thx.A0N();
        }
        thx.A0K();
        return Color.argb(255, A0B, A0B2, A0B3);
    }

    public static PointF A02(THX thx, float f) {
        float A03;
        float A032;
        int intValue = thx.A0E().intValue();
        if (intValue != 6) {
            if (intValue != 0) {
                if (intValue == 2) {
                    thx.A0J();
                    A03 = 0.0f;
                    A032 = 0.0f;
                    while (thx.A0Q()) {
                        int A0D = thx.A0D(A00);
                        if (A0D != 0) {
                            if (A0D != 1) {
                                thx.A0M();
                                thx.A0N();
                            } else {
                                A032 = A00(thx);
                            }
                        } else {
                            A03 = A00(thx);
                        }
                    }
                    thx.A0L();
                } else {
                    throw AbstractC167007dF.A0c("Unknown point starts with ", AbstractC61651RrR.A00(thx.A0E()));
                }
            } else {
                thx.A0I();
                A03 = AbstractC58321PtD.A03(thx);
                A032 = AbstractC58321PtD.A03(thx);
                while (thx.A0E() != C05F.A01) {
                    thx.A0N();
                }
                thx.A0K();
            }
        } else {
            A03 = AbstractC58321PtD.A03(thx);
            A032 = AbstractC58321PtD.A03(thx);
            while (thx.A0Q()) {
                thx.A0N();
            }
        }
        return new PointF(A03 * f, A032 * f);
    }

    public static ArrayList A03(THX thx, float f) {
        ArrayList A1E = AbstractC166987dD.A1E();
        thx.A0I();
        while (thx.A0E() == C05F.A00) {
            thx.A0I();
            A1E.add(A02(thx, f));
            thx.A0K();
        }
        thx.A0K();
        return A1E;
    }
}
