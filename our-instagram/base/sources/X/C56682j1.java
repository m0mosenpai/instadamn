package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.media.MediaPlayer;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2j1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C56682j1 {
    public SparseArray A02;
    public C56692j2 A03;
    public C56702j3 A04;
    public java.util.Set A05;
    public Paint A07;
    public PorterDuffXfermode A08;
    public PorterDuffXfermode A09;
    public PorterDuffXfermode A0A;
    public final RectF A0C;
    public final AbstractC56582ir A0D;
    public final AbstractC56652iy A0E;
    public final Map A0F;
    public final RectF[] A0G;
    public final Matrix A0B = new Matrix();
    public int A01 = 0;
    public float A00 = 1.0f;
    public boolean A06 = false;

    public static void A00(AbstractC56612iu abstractC56612iu, C56692j2 c56692j2) {
        AbstractC1348968m abstractC1348968m = abstractC56612iu.A0V;
        if (abstractC1348968m != null) {
            C1349968y c1349968y = abstractC1348968m.A08;
            if (c1349968y != null) {
                c56692j2.A03 = Math.max(c56692j2.A03, c1349968y.A01.length);
            }
            AbstractC1348868e abstractC1348868e = abstractC1348968m.A03;
            if (abstractC1348868e != null) {
                c56692j2.A03 = Math.max(c56692j2.A03, ((C1349968y[]) abstractC1348868e.A00)[0].A01.length);
            }
            C1349768w c1349768w = abstractC1348968m.A01;
            if (c1349768w != null) {
                c56692j2.A00 = Math.max(c56692j2.A00, c1349768w.A01.length);
            }
            AbstractC1348868e abstractC1348868e2 = abstractC1348968m.A02;
            if (abstractC1348868e2 != null) {
                c56692j2.A00 = Math.max(c56692j2.A00, ((C1349768w[]) abstractC1348868e2.A00)[0].A01.length);
            }
        }
        C56562ip c56562ip = abstractC56612iu.A0f;
        if (c56562ip != null) {
            c56692j2.A01 = Math.max(c56692j2.A01, c56562ip.A02.length);
            c56692j2.A02 = Math.max(c56692j2.A02, c56562ip.A03.length);
        }
        AbstractC1348868e abstractC1348868e3 = abstractC56612iu.A0a;
        if (abstractC1348868e3 != null) {
            for (C56562ip c56562ip2 : (C56562ip[]) abstractC1348868e3.A00) {
                c56692j2.A01 = Math.max(c56692j2.A01, c56562ip2.A02.length);
                c56692j2.A02 = Math.max(c56692j2.A02, c56562ip2.A03.length);
            }
        }
        C56562ip c56562ip3 = abstractC56612iu.A0e;
        if (c56562ip3 != null) {
            c56692j2.A01 = Math.max(c56692j2.A01, c56562ip3.A02.length);
            c56692j2.A02 = Math.max(c56692j2.A02, c56562ip3.A03.length);
        }
        AbstractC1348868e abstractC1348868e4 = abstractC56612iu.A0Y;
        if (abstractC1348868e4 != null) {
            for (C56562ip c56562ip4 : (C56562ip[]) abstractC1348868e4.A00) {
                c56692j2.A01 = Math.max(c56692j2.A01, c56562ip4.A02.length);
                c56692j2.A02 = Math.max(c56692j2.A02, c56562ip4.A03.length);
            }
        }
        AbstractC56612iu abstractC56612iu2 = abstractC56612iu.A0W;
        if (abstractC56612iu2 != null) {
            A00(abstractC56612iu2, c56692j2);
            return;
        }
        AbstractC56612iu[] abstractC56612iuArr = abstractC56612iu.A0x;
        if (abstractC56612iuArr == null) {
            return;
        }
        for (AbstractC56612iu abstractC56612iu3 : abstractC56612iuArr) {
            A00(abstractC56612iu3, c56692j2);
        }
    }

    public final Paint A01(PorterDuff.Mode mode) {
        PorterDuffXfermode porterDuffXfermode;
        Paint paint = this.A07;
        if (paint == null) {
            paint = new Paint(1);
            this.A07 = paint;
        }
        if (mode == null) {
            paint.setXfermode(null);
        } else {
            int i = AbstractC138216Oc.A00[mode.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        porterDuffXfermode = this.A08;
                        if (porterDuffXfermode == null) {
                            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
                            this.A08 = porterDuffXfermode;
                        }
                    }
                } else {
                    porterDuffXfermode = this.A0A;
                    if (porterDuffXfermode == null) {
                        porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
                        this.A0A = porterDuffXfermode;
                    }
                }
            } else {
                porterDuffXfermode = this.A09;
                if (porterDuffXfermode == null) {
                    porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
                    this.A09 = porterDuffXfermode;
                }
            }
            this.A07.setXfermode(porterDuffXfermode);
        }
        return this.A07;
    }

    public final C1349268q A02(int i) {
        List list;
        AbstractC56582ir abstractC56582ir = this.A0D;
        C141566aZ c141566aZ = abstractC56582ir.A01;
        if (c141566aZ != null && (list = c141566aZ.A00) != null) {
            if (i >= 0 && i < list.size()) {
                return (C1349268q) abstractC56582ir.A01.A00.get(i);
            }
            throw new Exception("index out of range");
        }
        throw new Exception("no assets/bitmaps in the document");
    }

    public final void A03(int i) {
        MediaPlayer mediaPlayer;
        this.A01 = i;
        java.util.Set<C66610UOx> set = this.A05;
        if (set != null) {
            for (C66610UOx c66610UOx : set) {
                if (i == 2 && (mediaPlayer = c66610UOx.A00) != null && mediaPlayer.isPlaying()) {
                    c66610UOx.A00.pause();
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.2j2, java.lang.Object] */
    public C56682j1(AbstractC56582ir abstractC56582ir) {
        HashMap hashMap;
        int i = 0;
        this.A0D = abstractC56582ir;
        AbstractC56652iy[] abstractC56652iyArr = abstractC56582ir.A04;
        AbstractC56652iy abstractC56652iy = abstractC56652iyArr[abstractC56582ir.A00];
        this.A0E = abstractC56652iy;
        ?? obj = new Object();
        this.A03 = obj;
        for (AbstractC56652iy abstractC56652iy2 : abstractC56652iyArr) {
            A00(abstractC56652iy2.A02, obj);
        }
        this.A04 = new C56702j3();
        AbstractC56602it abstractC56602it = abstractC56652iy.A03;
        this.A0C = new RectF(0.0f, 0.0f, abstractC56602it.A01, abstractC56602it.A00);
        this.A0G = new RectF[2];
        while (true) {
            RectF[] rectFArr = this.A0G;
            if (i >= 2) {
                break;
            }
            rectFArr[i] = new RectF();
            i++;
        }
        if (this.A0D.A02 != null) {
            hashMap = new HashMap();
        } else {
            hashMap = null;
        }
        this.A0F = hashMap;
    }
}
