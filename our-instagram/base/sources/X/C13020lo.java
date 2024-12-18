package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.0lo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13020lo extends AbstractC014105h {
    public final Object A00;
    public final Object A01;
    public final boolean A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13020lo(C10300gw c10300gw, boolean z, boolean z2) {
        super(c10300gw);
        Object exitTransition;
        boolean z3;
        Object obj;
        C14360o3.A0B(c10300gw, 1);
        Integer num = c10300gw.A00;
        Integer num2 = C05F.A01;
        Fragment fragment = c10300gw.A07;
        if (num == num2) {
            if (z) {
                exitTransition = fragment.getReenterTransition();
            } else {
                exitTransition = fragment.getEnterTransition();
            }
        } else if (z) {
            exitTransition = fragment.getReturnTransition();
        } else {
            exitTransition = fragment.getExitTransition();
        }
        this.A01 = exitTransition;
        if (num == num2) {
            if (z) {
                z3 = fragment.getAllowReturnTransitionOverlap();
            } else {
                z3 = fragment.getAllowEnterTransitionOverlap();
            }
        } else {
            z3 = true;
        }
        this.A02 = z3;
        if (z2) {
            if (z) {
                obj = fragment.getSharedElementReturnTransition();
            } else {
                obj = fragment.getSharedElementEnterTransition();
            }
        } else {
            obj = null;
        }
        this.A00 = obj;
    }

    private final C06v A00(Object obj) {
        if (obj == null) {
            return null;
        }
        C06v c06v = AbstractC016906o.A00;
        if (c06v.A0M(obj)) {
            return c06v;
        }
        C06v c06v2 = AbstractC016906o.A01;
        if (c06v2 != null && c06v2.A0M(obj)) {
            return c06v2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Transition ");
        sb.append(obj);
        sb.append(" for fragment ");
        sb.append(super.A00.A07);
        sb.append(" is not a valid framework Transition or AndroidX Transition");
        throw new IllegalArgumentException(sb.toString());
    }

    public final C06v A02() {
        Object obj = this.A01;
        C06v A00 = A00(obj);
        Object obj2 = this.A00;
        C06v A002 = A00(obj2);
        if (A00 != null) {
            if (A002 != null && A00 != A002) {
                StringBuilder sb = new StringBuilder();
                sb.append("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                sb.append(super.A00.A07);
                sb.append(" returned Transition ");
                sb.append(obj);
                sb.append(" which uses a different Transition  type than its shared element transition ");
                sb.append(obj2);
                throw new IllegalArgumentException(sb.toString());
            }
            return A00;
        }
        return A002;
    }
}
