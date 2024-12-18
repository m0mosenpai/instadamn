package X;

import android.view.View;
import com.instagram.archive.fragment.SelectHighlightsCoverFragment;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.direct.fragment.writewithai.RewriteTextBubbleViewPager;

/* renamed from: X.Ldm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48549Ldm implements InterfaceC62892tS {
    public final int A00;
    public final Object A01;

    public C48549Ldm(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ boolean CtU() {
        return false;
    }

    @Override // X.InterfaceC62892tS
    public final void DXP(int i, int i2) {
        if (this.A00 == 0 && i2 == 0 && i == 1) {
            ((SelectHighlightsCoverFragment) this.A01).mViewPager.A0Q = 1;
        }
    }

    @Override // X.InterfaceC62892tS
    public final void DXb(int i, int i2, boolean z) {
        if (2 - this.A00 == 0) {
            C45492KCh.A00((C45492KCh) this.A01);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (X.C14360o3.A0K(((X.AbstractC44757Jre) r2).A00, r6) == false) goto L23;
     */
    @Override // X.InterfaceC62892tS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Diy(X.C3VZ r11, X.C3VZ r12) {
        /*
            r10 = this;
            int r0 = r10.A00
            int r0 = 1 - r0
            if (r0 != 0) goto L85
            r3 = 0
            X.C14360o3.A0B(r11, r3)
            X.3VZ r0 = X.C3VZ.A03
            if (r11 != r0) goto L85
            java.lang.Object r7 = r10.A01
            com.instagram.creation.capture.gallery.ui.preview.GalleryPreviewMultiselectPager r7 = (com.instagram.creation.capture.gallery.ui.preview.GalleryPreviewMultiselectPager) r7
            int r8 = r7.getCurrentDataIndex()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            if (r8 < 0) goto L85
            X.KL2 r9 = r7.A03
            int r0 = r9.getCount()
            if (r8 >= r0) goto L85
            if (r1 == 0) goto L85
            int r0 = r9.getCount()
            if (r8 > r0) goto L63
            java.util.List r0 = r9.A03
            java.lang.Object r6 = r0.get(r8)
        L32:
            int r5 = r7.getChildCount()
            r4 = 0
        L37:
            if (r4 >= r5) goto L65
            android.view.View r0 = r7.getChildAt(r4)
            java.lang.Object r2 = r0.getTag()
            boolean r0 = r2 instanceof X.C45752KNf
            if (r0 == 0) goto L5c
            X.KNf r2 = (X.C45752KNf) r2
            if (r2 == 0) goto L5c
            if (r6 == 0) goto L54
            X.Jx2 r0 = r2.A00
            boolean r0 = X.C14360o3.A0K(r0, r6)
            r1 = 1
            if (r0 != 0) goto L55
        L54:
            r1 = 0
        L55:
            com.instagram.creation.capture.video.view.IgCaptureVideoPreviewView r0 = r2.A04
            if (r1 == 0) goto L5f
            r0.A06()
        L5c:
            int r4 = r4 + 1
            goto L37
        L5f:
            r0.A04()
            goto L5c
        L63:
            r6 = 0
            goto L32
        L65:
            java.util.List r0 = r9.A03
            java.lang.Object r0 = r0.get(r8)
            X.Jx2 r0 = (X.C45073Jx2) r0
            com.instagram.common.gallery.model.GalleryItem r2 = r0.A0B
            X.MN6 r0 = r7.A00
            if (r0 == 0) goto L85
            X.Lef r0 = (X.C48603Lef) r0
            X.C14360o3.A0B(r2, r3)
            X.JZs r0 = r0.A00
            r1 = 1
            X.GestureDetectorOnGestureListenerC43829JZs.A0B(r2, r0, r3, r1, r3)
            X.JZt r0 = r0.A14
            X.JZy r0 = r0.A0D
            r0.EdU(r2, r1, r1)
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48549Ldm.Diy(X.3VZ, X.3VZ):void");
    }

    @Override // X.InterfaceC62892tS
    public final void DrZ(int i, int i2) {
        if (3 - this.A00 == 0) {
            RewriteTextBubbleViewPager rewriteTextBubbleViewPager = (RewriteTextBubbleViewPager) this.A01;
            KL3 kl3 = rewriteTextBubbleViewPager.A03;
            if (i2 >= 0 && i2 < kl3.getCount()) {
                kl3.A00(i2, i);
                rewriteTextBubbleViewPager.A00 = i2;
                MNG mng = rewriteTextBubbleViewPager.A01;
                if (mng != null) {
                    String str = ((C45095JxP) kl3.A03.get(i2)).A02;
                    C14360o3.A0B(str, 0);
                    IgEditText igEditText = ((C48725Lgt) mng).A00.A03;
                    if (igEditText != null) {
                        igEditText.setText(AbstractC25225BEi.A0H(str));
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void DyE(int i, float f) {
        if (2 - this.A00 == 0) {
            ((C45492KCh) this.A01).A05 = false;
        }
    }

    @Override // X.InterfaceC62892tS
    public final void E0r(View view) {
    }

    @Override // X.InterfaceC62892tS
    public final void Diq(C3VZ c3vz, float f, float f2) {
    }
}
