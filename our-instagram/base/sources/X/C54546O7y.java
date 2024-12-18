package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.O7y, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54546O7y {
    public final Map A00;
    public final Map A01;

    public C54546O7y() {
        LinkedHashMap A06 = AbstractC06930Yk.A06(AbstractC166987dD.A1L(1, C56437P3y.A00), AbstractC166987dD.A1L(2, C56436P3x.A00), AbstractC166987dD.A1L(3, C56423P3k.A00), AbstractC166987dD.A1L(4, C56416P3d.A00), AbstractC166987dD.A1L(5, C56419P3g.A00), AbstractC166987dD.A1L(6, C56433P3u.A00), AbstractC166987dD.A1L(7, C56422P3j.A00), AbstractC166987dD.A1L(8, C56424P3l.A00), AbstractC166987dD.A1L(9, C56417P3e.A00), AbstractC166987dD.A1L(10, C56420P3h.A00), AbstractC166987dD.A1L(11, C56425P3m.A00), AbstractC166987dD.A1L(12, C56435P3w.A00), AbstractC166987dD.A1L(13, C56434P3v.A00), AbstractC166987dD.A1L(14, C56428P3p.A00), AbstractC166987dD.A1L(15, C56429P3q.A00), AbstractC166987dD.A1L(16, C56438P3z.A00), AbstractC166987dD.A1L(17, C56421P3i.A00), AbstractC166987dD.A1L(18, C56432P3t.A00), AbstractC166987dD.A1L(19, C56418P3f.A00), AbstractC166987dD.A1L(20, C56415P3c.A00), AbstractC166987dD.A1L(21, C56427P3o.A00), AbstractC166987dD.A1L(22, C56426P3n.A00), AbstractC166987dD.A1L(24, C56430P3r.A00), AbstractC166987dD.A1L(25, C56431P3s.A00));
        this.A00 = A06;
        ArrayList A0k = MSY.A0k(A06);
        Iterator A14 = AbstractC166997dE.A14(A06);
        while (A14.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A14);
            AbstractC166997dE.A1R(A1K.getValue(), A1K.getKey(), A0k);
        }
        this.A01 = AbstractC06930Yk.A08(A0k);
    }
}
