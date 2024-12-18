package X;

import java.util.List;

/* renamed from: X.BFu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25256BFu {
    public boolean A00;
    public final C003501a A01;
    public final C25255BFt A02;

    public final boolean A00(long j) {
        Object obj;
        List list = this.A02.A01;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i < size) {
                obj = list.get(i);
                if (((C25254BFs) obj).A02 == j) {
                    break;
                }
                i++;
            } else {
                obj = null;
                break;
            }
        }
        C25254BFs c25254BFs = (C25254BFs) obj;
        if (c25254BFs == null) {
            return false;
        }
        return c25254BFs.A09;
    }

    public C25256BFu(C003501a c003501a, C25255BFt c25255BFt) {
        this.A01 = c003501a;
        this.A02 = c25255BFt;
    }
}
