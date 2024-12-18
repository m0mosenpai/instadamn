package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.gallery.GalleryView;
import java.util.List;

/* renamed from: X.LGu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47958LGu {
    public C47322KvX A00;
    public MR9 A01;
    public MPG A02;
    public GalleryView A03;
    public final Context A04;
    public final UserSession A05;
    public final C195398kf A06;
    public final C47817L9z A07;
    public final InterfaceC50495MQy A08;
    public final LGC A09;
    public final L9H A0A;
    public final Boolean A0B;
    public final boolean A0C;

    /* JADX WARN: Code restructure failed: missing block: B:68:0x019f, code lost:
    
        if (r0 != null) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v6, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r6v7, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [android.view.View, android.view.ViewGroup] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C47958LGu(android.view.View r21, X.AbstractC018607g r22, X.EnumC188968Ym r23, com.instagram.common.session.UserSession r24, X.C2AH r25, X.InterfaceC50495MQy r26, X.L9H r27, java.lang.Boolean r28, int r29, int r30, boolean r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47958LGu.<init>(android.view.View, X.07g, X.8Ym, com.instagram.common.session.UserSession, X.2AH, X.MQy, X.L9H, java.lang.Boolean, int, int, boolean, boolean, boolean):void");
    }

    public static final void A00(C47958LGu c47958LGu) {
        int i;
        Integer num = c47958LGu.A0A.A02;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 10;
        }
        GalleryView galleryView = c47958LGu.A03;
        if (galleryView == null) {
            C14360o3.A0F("galleryView");
            throw C00O.createAndThrow();
        }
        galleryView.setMaxMultiSelectCount(i);
    }

    public final List A01() {
        GalleryView galleryView = this.A03;
        if (galleryView == null) {
            C14360o3.A0F("galleryView");
            throw C00O.createAndThrow();
        }
        return AbstractC166987dD.A1F(galleryView.A0Y);
    }

    public final void A02() {
        GalleryView galleryView = this.A03;
        if (galleryView == null) {
            C14360o3.A0F("galleryView");
            throw C00O.createAndThrow();
        }
        if (GalleryView.A0A(galleryView)) {
            if (AbstractC47033Kqq.A00(galleryView.A07)) {
                C48263LXm c48263LXm = galleryView.A09;
                if (c48263LXm != null) {
                    c48263LXm.A00.A08();
                    return;
                }
                return;
            }
            C189088Yy c189088Yy = galleryView.A06;
            if (c189088Yy != null) {
                ((C18240vB) C189088Yy.A0K.getValue()).ATO(new C180387zS(c189088Yy));
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    public final void A03() {
        GalleryView galleryView = this.A03;
        if (galleryView == null) {
            C14360o3.A0F("galleryView");
            throw C00O.createAndThrow();
        }
        if (AbstractC93174Ft.A03(AbstractC166997dE.A0L(galleryView)) && !galleryView.A0M) {
            C195838lR c195838lR = galleryView.A0A;
            if (c195838lR != null) {
                c195838lR.A00();
            }
            galleryView.A0A = null;
            GalleryView.A04(galleryView);
            galleryView.A0C();
        }
    }

    public final void A04() {
        GalleryView galleryView = this.A03;
        if (galleryView == null) {
            C14360o3.A0F("galleryView");
            throw C00O.createAndThrow();
        }
        galleryView.A0B();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A05() {
        /*
            r3 = this;
            X.LGC r1 = r3.A09
            boolean r0 = r1.A02
            if (r0 == 0) goto L17
            androidx.recyclerview.widget.RecyclerView r1 = r1.A03
            int r0 = r1.getChildCount()
            if (r0 == 0) goto L15
            int r0 = r1.computeVerticalScrollOffset()
            r2 = 0
        L13:
            if (r0 != 0) goto L16
        L15:
            r2 = 1
        L16:
            return r2
        L17:
            com.instagram.ui.widget.gallery.GalleryView r0 = r3.A03
            if (r0 != 0) goto L25
            java.lang.String r0 = "galleryView"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L25:
            android.widget.GridView r1 = r0.A0T
            int r0 = r1.getVisibility()
            r2 = 0
            if (r0 != 0) goto L15
            int r0 = r1.getChildCount()
            if (r0 == 0) goto L15
            int r0 = r1.getFirstVisiblePosition()
            if (r0 != 0) goto L16
            android.view.View r0 = r1.getChildAt(r2)
            int r0 = r0.getTop()
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47958LGu.A05():boolean");
    }

    public final boolean A06() {
        boolean z;
        LGC lgc = this.A09;
        lgc.A05.A00();
        if (lgc.A02) {
            LGC.A00(lgc);
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (AbstractC166987dD.A1b(A01())) {
                A04();
            } else {
                return false;
            }
        }
        return true;
    }
}
