package X;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public final class JZW extends AbstractC65852TvD {
    public final WeakReference A02;
    public int A01 = 0;
    public int A00 = 0;

    @Override // X.AbstractC65852TvD
    public final void A00(int i) {
        this.A00 = this.A01;
        this.A01 = i;
    }

    @Override // X.AbstractC65852TvD
    public final void A01(int i) {
        boolean z;
        TabLayout tabLayout = (TabLayout) this.A02.get();
        if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.A0c.size()) {
            int i2 = this.A01;
            if (i2 == 0 || (i2 == 2 && this.A00 == 0)) {
                z = true;
            } else {
                z = false;
            }
            tabLayout.A0F(tabLayout.A07(i), z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r6.A0A(r9, r8, r1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0017, code lost:
    
        if (r5 == 2) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r7.A00 == 1) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r7.A00 == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        r4 = true;
     */
    @Override // X.AbstractC65852TvD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(int r8, float r9, int r10) {
        /*
            r7 = this;
            java.lang.ref.WeakReference r0 = r7.A02
            java.lang.Object r6 = r0.get()
            com.google.android.material.tabs.TabLayout r6 = (com.google.android.material.tabs.TabLayout) r6
            if (r6 == 0) goto L21
            int r5 = r7.A01
            r4 = 0
            r3 = 2
            r2 = 1
            if (r5 != r3) goto L16
            int r0 = r7.A00
            r1 = 0
            if (r0 != r2) goto L19
        L16:
            r1 = 1
            if (r5 != r3) goto L1d
        L19:
            int r0 = r7.A00
            if (r0 == 0) goto L1e
        L1d:
            r4 = 1
        L1e:
            r6.A0A(r9, r8, r1, r4)
        L21:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JZW.A02(int, float, int):void");
    }

    public JZW(TabLayout tabLayout) {
        this.A02 = AbstractC25225BEi.A16(tabLayout);
    }
}
