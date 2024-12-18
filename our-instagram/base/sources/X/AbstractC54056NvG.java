package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.NvG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54056NvG {
    /* JADX WARN: Type inference failed for: r2v0, types: [com.instagram.pendingmedia.model.BrandedContentTag, java.lang.Object] */
    public static final List A00(C105824pt c105824pt) {
        ArrayList A12 = AbstractC166997dE.A12(c105824pt, 0);
        List<C102184io> list = c105824pt.A0l;
        if (list != null) {
            for (C102184io c102184io : list) {
                C14360o3.A0A(c102184io);
                C14360o3.A0B(c102184io, 1);
                ?? obj = new Object();
                String str = "";
                obj.A02 = "";
                obj.A01 = c102184io.A03;
                String str2 = c102184io.A04;
                if (str2 != null) {
                    str = str2;
                }
                obj.A02 = str;
                boolean z = false;
                obj.A04 = AbstractC167007dF.A1T(c102184io.A02);
                obj.A00 = c102184io.A00;
                Boolean bool = c102184io.A01;
                if (bool != null) {
                    z = bool.booleanValue();
                }
                obj.A03 = z;
                A12.add(obj);
            }
        }
        return AbstractC31172DnG.A19(A12);
    }
}
