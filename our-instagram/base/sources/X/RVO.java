package X;

import java.util.Collections;
import java.util.HashSet;

/* loaded from: classes10.dex */
public final class RVO extends AbstractC61607RqW {
    public final AbstractC61607RqW A00;
    public final java.util.Set A01;
    public final java.util.Set A02;
    public final java.util.Set A03;
    public final java.util.Set A04;
    public final java.util.Set A05;
    public final java.util.Set A06;

    public RVO(AbstractC61607RqW abstractC61607RqW, C63180Sef c63180Sef) {
        HashSet A1H = AbstractC166987dD.A1H();
        HashSet A1H2 = AbstractC166987dD.A1H();
        HashSet A1H3 = AbstractC166987dD.A1H();
        HashSet A1H4 = AbstractC166987dD.A1H();
        HashSet A1H5 = AbstractC166987dD.A1H();
        for (C62995SaJ c62995SaJ : c63180Sef.A03) {
            if (c62995SaJ.A00 == 0) {
                boolean A1P = AbstractC167007dF.A1P(c62995SaJ.A01, 2);
                Class cls = c62995SaJ.A02;
                if (A1P) {
                    A1H4.add(cls);
                } else {
                    A1H.add(cls);
                }
            } else {
                boolean A1P2 = AbstractC167007dF.A1P(c62995SaJ.A01, 2);
                Class cls2 = c62995SaJ.A02;
                if (A1P2) {
                    A1H5.add(cls2);
                } else {
                    A1H2.add(cls2);
                }
            }
        }
        java.util.Set set = c63180Sef.A05;
        if (!set.isEmpty()) {
            A1H.add(InterfaceC65284ThH.class);
        }
        this.A01 = Collections.unmodifiableSet(A1H);
        this.A02 = Collections.unmodifiableSet(A1H2);
        this.A06 = Collections.unmodifiableSet(A1H3);
        this.A04 = Collections.unmodifiableSet(A1H4);
        this.A05 = Collections.unmodifiableSet(A1H5);
        this.A03 = set;
        this.A00 = abstractC61607RqW;
    }
}
