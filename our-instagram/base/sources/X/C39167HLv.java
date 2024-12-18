package X;

import com.instagram.mediakit.model.MediaKitInsightType;
import java.util.List;

/* renamed from: X.HLv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39167HLv extends AbstractC56115Ova {
    public static final List A03 = AbstractC16960so.A1Q(MediaKitInsightType.A06, MediaKitInsightType.A05, MediaKitInsightType.A04);
    public final int A00;
    public final int A01;
    public final List A02;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public C39167HLv(C51850Mvs c51850Mvs, C56389P2a c56389P2a) {
        super(c51850Mvs, c56389P2a);
        ?? r1;
        List list = c51850Mvs.A06;
        if (list != null) {
            r1 = AbstractC166987dD.A1E();
            for (Object obj : list) {
                if (A03.contains(((H7W) obj).A00)) {
                    r1.add(obj);
                }
            }
        } else {
            r1 = C16930sl.A00;
        }
        this.A02 = r1;
        this.A01 = r1.size();
        this.A00 = AbstractC25226BEj.A05(r1);
    }
}
