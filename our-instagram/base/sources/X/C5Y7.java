package X;

/* renamed from: X.5Y7, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5Y7 {
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005f, code lost:
    
        if ((r5 & 6) == 4) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C2DC A00(X.C5Tl r8, int r9, int r10) {
        /*
            r0 = 1166152236(0x4582122c, float:4162.2715)
            r8.Eno(r0)
            boolean r0 = X.C0fH.A02()
            if (r0 == 0) goto L14
            r1 = 853657414(0x32e1c746, float:2.6284066E-8)
            java.lang.String r0 = "com.instagram.compose.core.drawable.igPainterResource (IgPainterResource.kt:15)"
            X.C0fH.A01(r1, r0)
        L14:
            r5 = r10 & 14
            r0 = 1245234963(0x4a38c713, float:3027396.8)
            r8.Eno(r0)
            boolean r0 = X.C0fH.A02()
            if (r0 == 0) goto L2a
            r1 = -990840282(0xffffffffc4f0fa26, float:-1927.8171)
            java.lang.String r0 = "com.meta.compose.resources.metaPainterResource (MetaPainterResource.kt:25)"
            X.C0fH.A01(r1, r0)
        L2a:
            X.5UP r1 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.A01
            r4 = r8
            X.5Tk r4 = (X.C117505Tk) r4
            X.59P r0 = X.C117505Tk.A04(r4)
            java.lang.Object r7 = X.C5UT.A01(r1, r0)
            android.content.Context r7 = (android.content.Context) r7
            X.5UP r1 = X.AbstractC117955Vf.A00
            X.59P r0 = X.C117505Tk.A04(r4)
            java.lang.Object r6 = X.C5UT.A01(r1, r0)
            X.5Vi r6 = (X.InterfaceC117985Vi) r6
            r0 = 1251912036(0x4a9ea964, float:5199026.0)
            r8.Eno(r0)
            boolean r3 = r8.AH4(r6)
            r0 = r5 & 14
            r0 = r0 ^ 6
            r2 = 4
            if (r0 <= r2) goto L5c
            boolean r0 = r8.AH2(r9)
            if (r0 != 0) goto L61
        L5c:
            r1 = r5 & 6
            r0 = 0
            if (r1 != r2) goto L62
        L61:
            r0 = 1
        L62:
            r0 = r0 | r3
            java.lang.Object r5 = r8.EEc()
            if (r0 != 0) goto L6d
            java.lang.Object r0 = X.C5UI.A00
            if (r5 != r0) goto L78
        L6d:
            android.graphics.drawable.Drawable r1 = r6.AR6(r7, r9)
            if (r1 != 0) goto L9d
            X.BaB r5 = X.C25772BaB.A00
        L75:
            r8.FBy(r5)
        L78:
            X.2DC r5 = (X.C2DC) r5
            r1 = 0
            X.C117505Tk.A0L(r4, r1)
            boolean r0 = X.C0fH.A02()
            if (r0 == 0) goto L8a
            r0 = -550756033(0xffffffffdf2c213f, float:-1.2403264E19)
            X.C0fH.A00(r0)
        L8a:
            X.C117505Tk.A0L(r4, r1)
            boolean r0 = X.C0fH.A02()
            if (r0 == 0) goto L99
            r0 = -58211721(0xfffffffffc87c277, float:-5.6392343E36)
            X.C0fH.A00(r0)
        L99:
            X.C117505Tk.A0L(r4, r1)
            return r5
        L9d:
            boolean r0 = r1 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto Lb7
            android.graphics.drawable.BitmapDrawable r1 = (android.graphics.drawable.BitmapDrawable) r1
            android.graphics.Bitmap r1 = r1.getBitmap()
            X.C14360o3.A07(r1)
            X.6LZ r0 = new X.6LZ
            r0.<init>(r1)
            X.6If r5 = new X.6If
            r5.<init>(r0)
        Lb4:
            X.2DC r5 = (X.C2DC) r5
            goto L75
        Lb7:
            boolean r0 = r1 instanceof android.graphics.drawable.ColorDrawable
            if (r0 == 0) goto Lcd
            android.graphics.drawable.ColorDrawable r1 = (android.graphics.drawable.ColorDrawable) r1
            int r0 = r1.getColor()
            long r2 = (long) r0
            r0 = 32
            long r2 = r2 << r0
            long r0 = X.C1132359l.A01
            X.Ba9 r5 = new X.Ba9
            r5.<init>(r2)
            goto Lb4
        Lcd:
            android.graphics.drawable.Drawable r0 = r1.mutate()
            X.C14360o3.A07(r0)
            X.5Y8 r5 = new X.5Y8
            r5.<init>(r0)
            goto Lb4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5Y7.A00(X.5Tl, int, int):X.2DC");
    }
}
