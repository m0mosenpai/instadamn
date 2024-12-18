package X;

import com.facebook.systrace.Systrace;

/* renamed from: X.60N, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C60N extends C58J implements InterfaceC114155Db, InterfaceC1129458d {
    public C114205Dh A00;
    public String A01;
    public InterfaceC16620sF A02;
    public boolean A03;
    public final C18240vB A04;

    public C60N(String str, InterfaceC16620sF interfaceC16620sF) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(interfaceC16620sF, 2);
        this.A01 = str;
        this.A02 = interfaceC16620sF;
        this.A04 = new C18240vB(AbstractC14350nz.A00());
    }

    @Override // X.InterfaceC114155Db
    public final void DJc(final InterfaceC1131459c interfaceC1131459c) {
        C14360o3.A0B(interfaceC1131459c, 0);
        if (C18U.A06(C06090Tz.A05, (AbstractC12990ll) C5Zy.A00(AbstractC117935Vd.A00, this), 36326266455406382L)) {
            A00(interfaceC1131459c, this);
        } else {
            this.A04.ATO(new AbstractRunnableC14200nk() { // from class: X.6Kx
                @Override // java.lang.Runnable
                public final void run() {
                    C60N.A00(interfaceC1131459c, this);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1719668807, 3, false, false);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        if ((X.C5YC.A00(r5) / X.C119055aN.A00(r7)) < 0.5f) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.InterfaceC1131459c r11, X.C60N r12) {
        /*
            r9 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r9)
            if (r0 == 0) goto L10
            r1 = -1064423877(0xffffffffc08e2e3b, float:-4.4431434)
            java.lang.String r0 = "VPVDModifierNode.verifyVisibilityThreshold"
            X.C0fO.A01(r0, r1)
        L10:
            boolean r0 = r12.A08     // Catch: java.lang.Throwable -> Lb1
            r3 = 0
            if (r0 == 0) goto La1
            X.5Dh r5 = r12.A00     // Catch: java.lang.IllegalArgumentException -> L82 java.lang.IllegalStateException -> L8a java.lang.NullPointerException -> L92 java.lang.IndexOutOfBoundsException -> L9a java.lang.Throwable -> Lb1
            if (r5 != 0) goto L4d
            X.5UP r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.A01     // Catch: java.lang.IllegalArgumentException -> L82 java.lang.IllegalStateException -> L8a java.lang.NullPointerException -> L92 java.lang.IndexOutOfBoundsException -> L9a java.lang.Throwable -> Lb1
            java.lang.Object r0 = X.C5Zy.A00(r0, r12)     // Catch: java.lang.IllegalArgumentException -> L82 java.lang.IllegalStateException -> L8a java.lang.NullPointerException -> L92 java.lang.IndexOutOfBoundsException -> L9a java.lang.Throwable -> Lb1
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.IllegalArgumentException -> L82 java.lang.IllegalStateException -> L8a java.lang.NullPointerException -> L92 java.lang.IndexOutOfBoundsException -> L9a java.lang.Throwable -> Lb1
            android.app.Activity r0 = X.AbstractC13330mJ.A00(r0)     // Catch: java.lang.IllegalArgumentException -> L82 java.lang.IllegalStateException -> L8a java.lang.NullPointerException -> L92 java.lang.IndexOutOfBoundsException -> L9a java.lang.Throwable -> Lb1
            int r6 = X.AbstractC57322k7.A00(r0)     // Catch: java.lang.IllegalArgumentException -> L82 java.lang.IllegalStateException -> L8a java.lang.NullPointerException -> L92 java.lang.IndexOutOfBoundsException -> L9a java.lang.Throwable -> Lb1
            android.graphics.Rect r5 = new android.graphics.Rect     // Catch: java.lang.IllegalArgumentException -> L82 java.lang.IllegalStateException -> L8a java.lang.NullPointerException -> L92 java.lang.IndexOutOfBoundsException -> L9a java.lang.Throwable -> Lb1
            r5.<init>()     // Catch: java.lang.IllegalArgumentException -> L82 java.lang.IllegalStateException -> L8a java.lang.NullPointerException -> L92 java.lang.IndexOutOfBoundsException -> L9a java.lang.Throwable -> Lb1
            android.view.Window r0 = r0.getWindow()     // Catch: java.lang.IllegalArgumentException -> L82 java.lang.IllegalStateException -> L8a java.lang.NullPointerException -> L92 java.lang.IndexOutOfBoundsException -> L9a java.lang.Throwable -> Lb1
            android.view.View r0 = r0.getDecorView()     // Catch: java.lang.IllegalArgumentException -> L82 java.lang.IllegalStateException -> L8a java.lang.NullPointerException -> L92 java.lang.IndexOutOfBoundsException -> L9a java.lang.Throwable -> Lb1
            r0.getWindowVisibleDisplayFrame(r5)     // Catch: java.lang.IllegalArgumentException -> L82 java.lang.IllegalStateException -> L8a java.lang.NullPointerException -> L92 java.lang.IndexOutOfBoundsException -> L9a java.lang.Throwable -> Lb1
            int r0 = r5.left     // Catch: java.lang.IllegalArgumentException -> L82 java.lang.IllegalStateException -> L8a java.lang.NullPointerException -> L92 java.lang.IndexOutOfBoundsException -> L9a java.lang.Throwable -> Lb1
            float r4 = (float) r0     // Catch: java.lang.IllegalArgumentException -> L82 java.lang.IllegalStateException -> L8a java.lang.NullPointerException -> L92 java.lang.IndexOutOfBoundsException -> L9a java.lang.Throwable -> Lb1
            int r0 = r5.top     // Catch: java.lang.IllegalArgumentException -> L82 java.lang.IllegalStateException -> L8a java.lang.NullPointerException -> L92 java.lang.IndexOutOfBoundsException -> L9a java.lang.Throwable -> Lb1
            float r2 = (float) r0     // Catch: java.lang.IllegalArgumentException -> L82 java.lang.IllegalStateException -> L8a java.lang.NullPointerException -> L92 java.lang.IndexOutOfBoundsException -> L9a java.lang.Throwable -> Lb1
            int r0 = r5.right     // Catch: java.lang.IllegalArgumentException -> L82 java.lang.IllegalStateException -> L8a java.lang.NullPointerException -> L92 java.lang.IndexOutOfBoundsException -> L9a java.lang.Throwable -> Lb1
            float r1 = (float) r0     // Catch: java.lang.IllegalArgumentException -> L82 java.lang.IllegalStateException -> L8a java.lang.NullPointerException -> L92 java.lang.IndexOutOfBoundsException -> L9a java.lang.Throwable -> Lb1
            int r0 = r5.bottom     // Catch: java.lang.IllegalArgumentException -> L82 java.lang.IllegalStateException -> L8a java.lang.NullPointerException -> L92 java.lang.IndexOutOfBoundsException -> L9a java.lang.Throwable -> Lb1
            int r0 = r0 - r6
            float r0 = (float) r0     // Catch: java.lang.IllegalArgumentException -> L82 java.lang.IllegalStateException -> L8a java.lang.NullPointerException -> L92 java.lang.IndexOutOfBoundsException -> L9a java.lang.Throwable -> Lb1
            X.5Dh r5 = new X.5Dh     // Catch: java.lang.IllegalArgumentException -> L82 java.lang.IllegalStateException -> L8a java.lang.NullPointerException -> L92 java.lang.IndexOutOfBoundsException -> L9a java.lang.Throwable -> Lb1
            r5.<init>(r4, r2, r1, r0)     // Catch: java.lang.IllegalArgumentException -> L82 java.lang.IllegalStateException -> L8a java.lang.NullPointerException -> L92 java.lang.IndexOutOfBoundsException -> L9a java.lang.Throwable -> Lb1
            r12.A00 = r5     // Catch: java.lang.IllegalArgumentException -> L82 java.lang.IllegalStateException -> L8a java.lang.NullPointerException -> L92 java.lang.IndexOutOfBoundsException -> L9a java.lang.Throwable -> Lb1
        L4d:
            long r7 = r11.Bxd()     // Catch: java.lang.IllegalArgumentException -> L82 java.lang.IllegalStateException -> L8a java.lang.NullPointerException -> L92 java.lang.IndexOutOfBoundsException -> L9a java.lang.Throwable -> Lb1
            X.5Dh r0 = X.AbstractC119495b6.A01(r11)     // Catch: java.lang.IllegalArgumentException -> L82 java.lang.IllegalStateException -> L8a java.lang.NullPointerException -> L92 java.lang.IndexOutOfBoundsException -> L9a java.lang.Throwable -> Lb1
            X.5Dh r0 = r0.A04(r5)     // Catch: java.lang.IllegalArgumentException -> L82 java.lang.IllegalStateException -> L8a java.lang.NullPointerException -> L92 java.lang.IndexOutOfBoundsException -> L9a java.lang.Throwable -> Lb1
            long r5 = r0.A01()     // Catch: java.lang.IllegalArgumentException -> L82 java.lang.IllegalStateException -> L8a java.lang.NullPointerException -> L92 java.lang.IndexOutOfBoundsException -> L9a java.lang.Throwable -> Lb1
            float r4 = X.C5YC.A02(r5)     // Catch: java.lang.IllegalArgumentException -> L82 java.lang.IllegalStateException -> L8a java.lang.NullPointerException -> L92 java.lang.IndexOutOfBoundsException -> L9a java.lang.Throwable -> Lb1
            r0 = 32
            long r1 = r7 >> r0
            int r0 = (int) r1     // Catch: java.lang.IllegalArgumentException -> L82 java.lang.IllegalStateException -> L8a java.lang.NullPointerException -> L92 java.lang.IndexOutOfBoundsException -> L9a java.lang.Throwable -> Lb1
            float r0 = (float) r0     // Catch: java.lang.IllegalArgumentException -> L82 java.lang.IllegalStateException -> L8a java.lang.NullPointerException -> L92 java.lang.IndexOutOfBoundsException -> L9a java.lang.Throwable -> Lb1
            float r4 = r4 / r0
            r2 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 < 0) goto L7d
            float r1 = X.C5YC.A00(r5)     // Catch: java.lang.IllegalArgumentException -> L82 java.lang.IllegalStateException -> L8a java.lang.NullPointerException -> L92 java.lang.IndexOutOfBoundsException -> L9a java.lang.Throwable -> Lb1
            int r0 = X.C119055aN.A00(r7)     // Catch: java.lang.IllegalArgumentException -> L82 java.lang.IllegalStateException -> L8a java.lang.NullPointerException -> L92 java.lang.IndexOutOfBoundsException -> L9a java.lang.Throwable -> Lb1
            float r0 = (float) r0     // Catch: java.lang.IllegalArgumentException -> L82 java.lang.IllegalStateException -> L8a java.lang.NullPointerException -> L92 java.lang.IndexOutOfBoundsException -> L9a java.lang.Throwable -> Lb1
            float r1 = r1 / r0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r0 = 1
            if (r1 >= 0) goto L7e
        L7d:
            r0 = 0
        L7e:
            r12.A01(r0)     // Catch: java.lang.IllegalArgumentException -> L82 java.lang.IllegalStateException -> L8a java.lang.NullPointerException -> L92 java.lang.IndexOutOfBoundsException -> L9a java.lang.Throwable -> Lb1
            goto La4
        L82:
            java.lang.String r1 = "VPVDModifierNode"
            java.lang.String r0 = "Error analyzing layout info in vpvd modifier node due to illegal argument exception (layout no longer exists)"
            X.C0w9.A03(r1, r0)     // Catch: java.lang.Throwable -> Lb1
            goto La1
        L8a:
            java.lang.String r1 = "VPVDModifierNode"
            java.lang.String r0 = "Error analyzing layout info in vpvd modifier node due to illegal state exception (layout not attached)"
            X.C0w9.A03(r1, r0)     // Catch: java.lang.Throwable -> Lb1
            goto La1
        L92:
            java.lang.String r1 = "VPVDModifierNode"
            java.lang.String r0 = "Error analyzing layout info in vpvd modifier node due to null pointer"
            X.C0w9.A03(r1, r0)     // Catch: java.lang.Throwable -> Lb1
            goto La1
        L9a:
            java.lang.String r1 = "VPVDModifierNode"
            java.lang.String r0 = "Error analyzing layout info in vpvd modifier node due to index out of bounds exception (layout no longer exists)"
            X.C0w9.A03(r1, r0)     // Catch: java.lang.Throwable -> Lb1
        La1:
            r12.A01(r3)     // Catch: java.lang.Throwable -> Lb1
        La4:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r9)
            if (r0 == 0) goto Lb0
            r0 = -230769625(0xfffffffff23ebc27, float:-3.7778953E30)
            X.C0fO.A00(r0)
        Lb0:
            return
        Lb1:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r9)
            if (r0 == 0) goto Lbe
            r0 = -2118026445(0xffffffff81c17b33, float:-7.1073785E-38)
            X.C0fO.A00(r0)
        Lbe:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60N.A00(X.59c, X.60N):void");
    }

    private final void A01(boolean z) {
        if (z != this.A03) {
            this.A03 = z;
            if (Systrace.A0E(1L)) {
                C0fO.A01("VPVDModifierNode.onItemVisibleChange", -1942111052);
            }
            try {
                this.A02.invoke(this.A01, Boolean.valueOf(z));
                if (Systrace.A0E(1L)) {
                    C0fO.A00(1718963006);
                }
            } catch (Throwable th) {
                if (Systrace.A0E(1L)) {
                    C0fO.A00(1162139274);
                }
                throw th;
            }
        }
    }
}
