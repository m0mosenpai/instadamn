package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.VLs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68306VLs {
    /* JADX WARN: Type inference failed for: r0v21, types: [X.4yw, X.4yt] */
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Integer num;
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        Object A032 = c6fw.A03(1);
        C14360o3.A0C(A032, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C102884kP c102884kP = (C102884kP) A032;
        U4G u4g = (U4G) AnonymousClass634.A06(C103064kh.A00(c6fq, c6fw, 2), (C102884kP) A03);
        Object A00 = C102884kP.A00(c102884kP, 36);
        if (!(A00 instanceof String) || A00 == null) {
            A00 = String.valueOf(C102884kP.A00(c102884kP, 36));
        }
        if (u4g != null) {
            String A0E = c102884kP.A0E();
            boolean A0U = c102884kP.A0U(true);
            String A0F = c102884kP.A0F();
            if (AbstractC79383gk.A03()) {
                List list = u4g.A01.A03;
                int size = list.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    String A0D = ((U48) list.get(i)).A01.A0D();
                    if (A0D != null && A0D.equals(A00)) {
                        if (i >= 0) {
                            int i2 = 0;
                            if (A0F != null) {
                                if (A0F.endsWith("%")) {
                                    AbstractC25241Le.A02("CollectionBinderUtils", "Offsets defined as a percentage value are not supported");
                                } else {
                                    try {
                                        i2 = (int) C6BE.A01(A0F);
                                    } catch (C41M unused) {
                                        AbstractC25241Le.A02("CollectionBinderUtils", "Error parsing offset when scrolling to index");
                                    }
                                }
                            }
                            U4E u4e = u4g.A02;
                            RecyclerView recyclerView = u4e.A07;
                            if (recyclerView != null) {
                                if (u4g.A00 == null) {
                                    ?? c110814yt = new C110814yt(recyclerView.getContext());
                                    c110814yt.A00 = 0;
                                    c110814yt.A03 = true;
                                    c110814yt.A01 = 0;
                                    u4g.A00 = c110814yt;
                                }
                                AbstractC61802rh abstractC61802rh = u4g.A05;
                                C69046Vgn c69046Vgn = null;
                                if (abstractC61802rh != null && i2 != 0 && (num = u4g.A07) != null && A0E != null && (!VSJ.A00(num).equalsIgnoreCase(A0E))) {
                                    c69046Vgn = new C69046Vgn(u4e.A07, abstractC61802rh, u4g.A00);
                                }
                                C110844yw c110844yw = u4g.A00;
                                c110844yw.A02 = c69046Vgn;
                                c110844yw.A0E(A0E);
                                c110844yw.A00 = i2;
                                c110844yw.A03 = A0U;
                                ((AbstractC110824yu) c110844yw).A00 = i;
                                AbstractC70663Fe abstractC70663Fe = u4e.A07.A0D;
                                if (abstractC70663Fe != null) {
                                    abstractC70663Fe.A10(c110844yw);
                                }
                            } else {
                                u4e.A00 = i;
                                if (A0E == null) {
                                    A0E = "";
                                }
                                u4e.A09 = A0E;
                                u4e.A03 = i2;
                                u4e.A0C = A0U;
                                return null;
                            }
                        }
                    } else {
                        i++;
                    }
                }
            } else {
                throw new RuntimeException("scrollToIndexById cannot be called from a background thread.");
            }
        }
        return null;
    }
}
