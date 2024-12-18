package X;

import java.util.List;

/* renamed from: X.2Xs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51452Xs extends AbstractC51462Xt {
    public final int A00;

    public C51452Xs(AbstractC51432Xq abstractC51432Xq, int i) {
        super(abstractC51432Xq);
        this.A00 = i;
    }

    @Override // X.AbstractC51462Xt
    public final AbstractC107474ss A03(List list) {
        if (list.size() == 1) {
            return new XVe((AbstractC107474ss) list.get(0), this.A00);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("DelayTransitionSet is expected to have exactly one child, provided=");
        sb.append(list);
        throw new IllegalArgumentException(sb.toString());
    }
}
