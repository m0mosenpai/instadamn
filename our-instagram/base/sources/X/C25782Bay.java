package X;

import java.text.BreakIterator;

/* renamed from: X.Bay, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25782Bay extends AbstractC28843CoD {
    public static C25782Bay A01;
    public BreakIterator A00;

    @Override // X.InterfaceC30987Djj
    public final int[] AWL(int i) {
        int A012 = AbstractC28843CoD.A01(this);
        if (A012 > 0 && i < A012) {
            if (i < 0) {
                i = 0;
            }
            while (true) {
                BreakIterator breakIterator = this.A00;
                if (breakIterator == null) {
                    break;
                }
                boolean isBoundary = breakIterator.isBoundary(i);
                BreakIterator breakIterator2 = this.A00;
                if (!isBoundary) {
                    if (breakIterator2 == null) {
                        break;
                    }
                    i = breakIterator2.following(i);
                    if (i == -1) {
                        break;
                    }
                } else if (breakIterator2 != null) {
                    int following = breakIterator2.following(i);
                    if (following != -1) {
                        return A03(i, following);
                    }
                }
            }
            C14360o3.A0F("impl");
            throw C00O.createAndThrow();
        }
        return null;
    }

    @Override // X.InterfaceC30987Djj
    public final int[] E56(int i) {
        int A012 = AbstractC28843CoD.A01(this);
        if (A012 > 0 && i > 0) {
            if (i > A012) {
                i = A012;
            }
            while (true) {
                BreakIterator breakIterator = this.A00;
                if (breakIterator == null) {
                    break;
                }
                boolean isBoundary = breakIterator.isBoundary(i);
                BreakIterator breakIterator2 = this.A00;
                if (!isBoundary) {
                    if (breakIterator2 == null) {
                        break;
                    }
                    i = breakIterator2.preceding(i);
                    if (i == -1) {
                        break;
                    }
                } else if (breakIterator2 != null) {
                    int preceding = breakIterator2.preceding(i);
                    if (preceding != -1) {
                        return A03(preceding, i);
                    }
                }
            }
            C14360o3.A0F("impl");
            throw C00O.createAndThrow();
        }
        return null;
    }
}
