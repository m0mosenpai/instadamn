package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Lhs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48785Lhs implements GXY {
    public final /* synthetic */ C31446Drq A00;
    public final /* synthetic */ C31606DuY A01;
    public final /* synthetic */ JSB A02;

    public C48785Lhs(C31446Drq c31446Drq, C31606DuY c31606DuY, JSB jsb) {
        this.A01 = c31606DuY;
        this.A02 = jsb;
        this.A00 = c31446Drq;
    }

    @Override // X.GXY
    public final void Dsp() {
        String str;
        C43945Jbu c43945Jbu = this.A01.A02;
        c43945Jbu.A01 = null;
        c43945Jbu.A00 = null;
        JSB jsb = this.A02;
        String str2 = this.A00.A02;
        if (jsb.A0C) {
            Map map = jsb.A01;
            Iterator A12 = AbstractC43593JPy.A12(map);
            while (A12.hasNext()) {
                Object next = A12.next();
                C51761Mtk c51761Mtk = (C51761Mtk) map.get(next);
                if (c51761Mtk != null) {
                    MRV mrv = (MRV) c51761Mtk.A00;
                    if (mrv != null) {
                        str = mrv.getId();
                    } else {
                        str = null;
                    }
                } else {
                    str = null;
                }
                if (C14360o3.A0K(str, str2)) {
                    map.put(next, null);
                }
            }
        }
    }
}
