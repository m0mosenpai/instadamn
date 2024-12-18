package X;

import android.view.View;
import android.widget.LinearLayout;

/* renamed from: X.Jkj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44430Jkj extends LinearLayout {
    public int A00;

    public final void A00() {
        if (AbstractC56862jK.A00(getContext())) {
            int i = 0;
            int childCount = getChildCount();
            while (i < childCount) {
                int i2 = this.A00;
                View childAt = getChildAt(i);
                C14360o3.A07(childAt);
                int i3 = i + 1;
                AbstractC58452m4.A00(childAt, i3, getChildCount(), AbstractC167007dF.A1P(i, i2));
                i = i3;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setSelectedIndex(int r7) {
        /*
            r6 = this;
            int r0 = r6.getChildCount()
            if (r7 >= r0) goto L14
            int r0 = r6.A00
            if (r7 != r0) goto L15
            android.view.View r0 = r6.getChildAt(r7)
            boolean r0 = r0.isSelected()
            if (r0 == 0) goto L15
        L14:
            return
        L15:
            r6.A00 = r7
            r4 = 0
            int r3 = r6.getChildCount()
        L1c:
            if (r4 >= r3) goto L14
            int r1 = r6.A00
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.fragment.stickertray.hscroll.tabs.IgdExpressionTrayHscrollTabView"
            android.view.View r5 = r6.getChildAt(r4)
            X.C14360o3.A0C(r5, r0)
            X.KKE r5 = (X.KKE) r5
            android.content.Context r0 = r5.getContext()
            if (r4 != r1) goto L70
            if (r0 == 0) goto L59
            r0 = 1
        L34:
            r5.setSelected(r0)
            boolean r0 = r5.isSelected()
            if (r0 == 0) goto L5c
            android.content.Context r2 = r5.getContext()
            r0 = 2131231801(0x7f080439, float:1.8079693E38)
            X.AbstractC31173DnH.A0z(r2, r5, r0)
            X.Kvs r0 = r5.A01
            boolean r0 = r0 instanceof X.KQB
            if (r0 == 0) goto L59
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r5.A02
            r0 = 2130970276(0x7f0406a4, float:1.7549258E38)
        L52:
            int r0 = X.AbstractC53242c7.A0H(r2, r0)
            X.AbstractC31177DnL.A0p(r2, r1, r0)
        L59:
            int r4 = r4 + 1
            goto L1c
        L5c:
            r0 = 0
            r5.setBackground(r0)
            X.Kvs r0 = r5.A01
            boolean r0 = r0 instanceof X.KQB
            if (r0 == 0) goto L59
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r5.A02
            android.content.Context r2 = r5.getContext()
            r0 = 2130970309(0x7f0406c5, float:1.7549324E38)
            goto L52
        L70:
            if (r0 == 0) goto L59
            r0 = 0
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44430Jkj.setSelectedIndex(int):void");
    }
}
