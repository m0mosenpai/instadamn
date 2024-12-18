package X;

import android.graphics.drawable.Drawable;
import com.facebook.systrace.Systrace;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.feed.widget.IgProgressImageView;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2nL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC59202nL implements InterfaceC59212nM {
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (r9 == null) goto L25;
     */
    @Override // X.InterfaceC59212nM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void DGC(android.graphics.drawable.Drawable r15, X.C59392ni r16, X.C2nP r17, java.lang.Throwable r18, long r19) {
        /*
            r14 = this;
            r0 = r14
            X.2nK r0 = (X.C59192nK) r0
            X.3Pd r2 = r0.A01
            com.instagram.common.ui.widget.imageview.IgImageView r5 = r0.A02
            r3 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r3)
            if (r0 == 0) goto L17
            r1 = 284805185(0x10f9c841, float:9.852172E-29)
            java.lang.String r0 = "IgVitoHelper.onFailure"
            X.C0fO.A01(r0, r1)
        L17:
            if (r2 == 0) goto L1c
            r2.DFp()     // Catch: java.lang.Throwable -> L6c
        L1c:
            r6 = r18
            boolean r0 = r6 instanceof X.C46343KfR     // Catch: java.lang.Throwable -> L6c
            r2 = 0
            if (r0 == 0) goto L2b
            r1 = r6
            X.KfR r1 = (X.C46343KfR) r1     // Catch: java.lang.Throwable -> L6c
        L26:
            X.1zH r7 = com.instagram.common.ui.widget.imageview.IgImageView.A0d     // Catch: java.lang.Throwable -> L6c
            com.instagram.common.typedurl.ImageUrl r10 = r5.A0C     // Catch: java.lang.Throwable -> L6c
            goto L2d
        L2b:
            r1 = r2
            goto L26
        L2d:
            if (r10 == 0) goto L64
            if (r1 == 0) goto L37
            java.lang.String r11 = r1.getMessage()     // Catch: java.lang.Throwable -> L6c
            if (r11 != 0) goto L48
        L37:
            if (r18 == 0) goto L43
            java.lang.Throwable r0 = r6.getCause()     // Catch: java.lang.Throwable -> L6c
            if (r0 == 0) goto L43
            java.lang.String r2 = r0.getMessage()     // Catch: java.lang.Throwable -> L6c
        L43:
            r11 = r2
            if (r1 != 0) goto L48
            r13 = 0
            goto L4e
        L48:
            int r13 = r1.A00     // Catch: java.lang.Throwable -> L6c
            X.3le r9 = r1.A01     // Catch: java.lang.Throwable -> L6c
            if (r9 != 0) goto L50
        L4e:
            X.3le r9 = X.EnumC82173le.A03     // Catch: java.lang.Throwable -> L6c
        L50:
            X.0iw r8 = r5.A07     // Catch: java.lang.Throwable -> L6c
            java.lang.String r12 = "undefined"
            r7.DLT(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L6c
            boolean r0 = com.facebook.systrace.Systrace.A0E(r3)
            if (r0 == 0) goto L63
            r0 = 394117838(0x177dc2ce, float:8.1994587E-25)
            X.C0fO.A00(r0)
        L63:
            return
        L64:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L6c
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L6c
            throw r0     // Catch: java.lang.Throwable -> L6c
        L6c:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r3)
            if (r0 == 0) goto L79
            r0 = 1011310938(0x3c47615a, float:0.0121692065)
            X.C0fO.A00(r0)
        L79:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC59202nL.DGC(android.graphics.drawable.Drawable, X.2ni, X.2nP, java.lang.Throwable, long):void");
    }

    @Override // X.InterfaceC59212nM
    public abstract void DH2(Drawable drawable, C59392ni c59392ni, C2nP c2nP, C3QB c3qb, int i, long j);

    @Override // X.InterfaceC59212nM
    public final void DMt(C2nP c2nP, Throwable th, long j) {
    }

    @Override // X.InterfaceC59212nM
    public final void DYr(Drawable drawable, C2nP c2nP, long j) {
    }

    @Override // X.InterfaceC59212nM
    public final void Dec(C59392ni c59392ni, C2nP c2nP, long j) {
    }

    @Override // X.InterfaceC59212nM
    public final void DpX(C59392ni c59392ni, C2nP c2nP, Object obj, long j) {
    }

    @Override // X.InterfaceC59212nM
    public void DMv(C2nP c2nP, C3QB c3qb, long j) {
        int i;
        int i2;
        Integer num;
        String str;
        EnumC59482nr enumC59482nr;
        C59192nK c59192nK = (C59192nK) this;
        IgImageView igImageView = c59192nK.A02;
        ImageUrl imageUrl = c59192nK.A00;
        InterfaceC16820sZ interfaceC16820sZ = c59192nK.A06;
        AtomicInteger atomicInteger = c59192nK.A03;
        InterfaceC16820sZ interfaceC16820sZ2 = c59192nK.A04;
        if (Systrace.A0E(1L)) {
            C0fO.A01("IgVitoHelper.onIntermediateImageSet", 1311697091);
        }
        Object obj = null;
        if (c3qb != null) {
            try {
                Map B3v = c3qb.B3v();
                if (B3v != null) {
                    obj = B3v.get("IMAGE_RENDERED");
                }
            } catch (Throwable th) {
                if (Systrace.A0E(1L)) {
                    C0fO.A00(-1339564307);
                }
                throw th;
            }
        }
        if ((obj instanceof EnumC59482nr) && (enumC59482nr = (EnumC59482nr) obj) != null) {
            i = enumC59482nr.ordinal();
        } else {
            i = -1;
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 3) {
                    interfaceC16820sZ2.invoke();
                    InterfaceC73023Pd interfaceC73023Pd = igImageView.A0D;
                    if (interfaceC73023Pd != null) {
                        String url = imageUrl.getUrl();
                        Object obj2 = c3qb.B3v().get("LOAD_SOURCE");
                        if (!(obj2 instanceof String) || (str = (String) obj2) == null) {
                            str = "undefined";
                        }
                        interfaceC73023Pd.DPX(new C73083Pj(null, url, str, 0, 0));
                    }
                    IgImageView.A0d.DLR(imageUrl);
                }
            } else {
                Object obj3 = c3qb.B3v().get("ENCODED_IMAGE_SIZE");
                if ((obj3 instanceof Integer) && (num = (Integer) obj3) != null) {
                    i2 = num.intValue();
                } else {
                    i2 = 0;
                }
                atomicInteger.set(i2);
                C3X6 c3x6 = igImageView.A0H;
                if (c3x6 != null) {
                    c3x6.Dbt(i2);
                }
            }
        } else {
            C3X8 c3x8 = igImageView.A0F;
            if (c3x8 != null) {
                c3qb.B3v().get("LOAD_SOURCE");
                IgProgressImageView.A02(((C3X7) c3x8).A00, C05F.A01);
            }
            interfaceC16820sZ.invoke();
        }
        if (Systrace.A0E(1L)) {
            C0fO.A00(-149565309);
        }
    }
}
