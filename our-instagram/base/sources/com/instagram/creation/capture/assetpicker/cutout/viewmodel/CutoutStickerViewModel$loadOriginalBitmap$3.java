package com.instagram.creation.capture.assetpicker.cutout.viewmodel;

import X.AbstractC001800i;
import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC223599u2;
import X.AbstractC23611Dp;
import X.AbstractC23641Du;
import X.AbstractC28121CaU;
import X.AbstractC37300Gc1;
import X.AbstractC72460Xe6;
import X.C05A;
import X.C05F;
import X.C0eB;
import X.C1JX;
import X.C44812Jsj;
import X.C45112Jxh;
import X.C4A7;
import X.C72147XQc;
import X.C72149XQe;
import X.C8OP;
import X.C8OS;
import X.C9VJ;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.JQ0;
import X.OLT;
import X.PZO;
import X.Y4d;
import android.graphics.Bitmap;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.assetpicker.cutout.viewmodel.CutoutStickerViewModel$loadOriginalBitmap$3", f = "CutoutStickerViewModel.kt", i = {0, 0, 0}, l = {150}, m = "invokeSuspend", n = {"this_$iv", "name$iv", "start$iv$iv"}, s = {"L$0", "L$1", "J$0"})
/* loaded from: classes8.dex */
public final class CutoutStickerViewModel$loadOriginalBitmap$3 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public boolean A06;
    public final /* synthetic */ Bitmap A07;
    public final /* synthetic */ C8OP A08;
    public final /* synthetic */ boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CutoutStickerViewModel$loadOriginalBitmap$3(Bitmap bitmap, C8OP c8op, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(2, interfaceC23621Ds);
        this.A08 = c8op;
        this.A07 = bitmap;
        this.A09 = z;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new CutoutStickerViewModel$loadOriginalBitmap$3(this.A07, this.A08, interfaceC23621Ds, this.A09);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C8OP c8op;
        String str;
        Bitmap bitmap;
        boolean z;
        long currentTimeMillis;
        C8OP c8op2;
        Object value;
        Object value2;
        StringBuilder A11;
        float[] fArr;
        Object value3;
        C8OS c8os;
        Object value4;
        Object value5;
        C8OS c8os2;
        Object value6;
        C8OS c8os3;
        C44812Jsj c44812Jsj;
        List<PointF> list;
        Object value7;
        C8OS c8os4;
        C45112Jxh c45112Jxh;
        Object obj2 = obj;
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            currentTimeMillis = this.A01;
            z = this.A06;
            bitmap = (Bitmap) this.A05;
            c8op = (C8OP) this.A04;
            str = (String) this.A03;
            c8op2 = (C8OP) this.A02;
            AbstractC09560e7.A00(obj2);
        } else {
            AbstractC09560e7.A00(obj2);
            c8op = this.A08;
            str = "Auto segmentation";
            bitmap = this.A07;
            z = this.A09;
            currentTimeMillis = System.currentTimeMillis();
            C4A7 c4a7 = (C4A7) c8op.A0F.getValue();
            this.A02 = c8op;
            this.A03 = "Auto segmentation";
            this.A04 = c8op;
            this.A05 = bitmap;
            this.A06 = z;
            this.A01 = currentTimeMillis;
            this.A00 = 1;
            obj2 = AbstractC23641Du.A00(this, c4a7.A01.Arv(), new PZO(bitmap, c4a7, null, 3, z));
            if (obj2 == c1jx) {
                return c1jx;
            }
            c8op2 = c8op;
        }
        AbstractC223599u2 abstractC223599u2 = (AbstractC223599u2) obj2;
        if (abstractC223599u2 instanceof C9VJ) {
            if (z) {
                AbstractC72460Xe6 abstractC72460Xe6 = (AbstractC72460Xe6) AbstractC001800i.A0O(((C9VJ) abstractC223599u2).A00, 2);
                ArrayList A1E = AbstractC166987dD.A1E();
                if (abstractC72460Xe6 instanceof C72149XQe) {
                    if (((C72149XQe) abstractC72460Xe6).A00 != null) {
                        A1E.add(new OLT(C05F.A0C, new float[]{r12.left / bitmap.getWidth(), r12.top / bitmap.getHeight()}));
                        A1E.add(new OLT(C05F.A0N, new float[]{r12.right / bitmap.getWidth(), r12.bottom / bitmap.getHeight()}));
                    }
                } else if ((abstractC72460Xe6 instanceof C72147XQc) && (list = ((C72147XQc) abstractC72460Xe6).A00) != null) {
                    for (PointF pointF : list) {
                        A1E.add(new OLT(C05F.A00, new float[]{pointF.x / bitmap.getWidth(), pointF.y / bitmap.getHeight()}));
                    }
                }
                C05A c05a = c8op.A0H;
                do {
                    value7 = c05a.getValue();
                    c8os4 = (C8OS) value7;
                    C45112Jxh c45112Jxh2 = c8os4.A03;
                    if (c45112Jxh2 != null) {
                        c45112Jxh = C45112Jxh.A00(c45112Jxh2, A1E);
                    } else {
                        c45112Jxh = null;
                    }
                } while (!c05a.AIi(value7, new C8OS(c8os4.A02, c8os4.A00, c8os4.A01, c45112Jxh, c8os4.A04, c8os4.A05, c8os4.A08, c8os4.A07, c8os4.A06)));
            }
            Object A0O = AbstractC001800i.A0O(((C9VJ) abstractC223599u2).A00, 1);
            if ((A0O instanceof C44812Jsj) && (c44812Jsj = (C44812Jsj) A0O) != null) {
                fArr = c44812Jsj.A00;
            } else {
                fArr = null;
            }
            C05A c05a2 = c8op.A0H;
            do {
                value3 = c05a2.getValue();
                c8os = (C8OS) value3;
            } while (!c05a2.AIi(value3, new C8OS(c8os.A02, c8os.A00, c8os.A01, c8os.A03, c8os.A04, c8os.A05, fArr, c8os.A07, c8os.A06)));
            int i = AbstractC28121CaU.A00;
            if (fArr != null && bitmap != null) {
                int width = bitmap.getWidth() * bitmap.getHeight();
                int length = fArr.length;
                if (length != width) {
                    if (bitmap.getWidth() * bitmap.getHeight() == length) {
                        Bitmap A02 = Y4d.A00.A02(bitmap, fArr);
                        do {
                            value6 = c05a2.getValue();
                            c8os3 = (C8OS) value6;
                        } while (!c05a2.AIi(value6, new C8OS(c8os3.A02, A02, c8os3.A01, c8os3.A03, c8os3.A04, C05F.A01, c8os3.A08, c8os3.A07, c8os3.A06)));
                    }
                } else {
                    Bitmap A01 = Y4d.A01(fArr, bitmap.getWidth(), bitmap.getHeight());
                    do {
                        value5 = c05a2.getValue();
                        c8os2 = (C8OS) value5;
                    } while (!c05a2.AIi(value5, new C8OS(c8os2.A02, bitmap, A01, c8os2.A03, c8os2.A04, C05F.A01, c8os2.A08, c8os2.A07, c8os2.A06)));
                }
            }
            do {
                value4 = c05a2.getValue();
            } while (!JQ0.A1X((C8OS) value4, C05F.A0C, value4, c05a2));
        } else {
            C05A c05a3 = c8op.A0H;
            do {
                value = c05a3.getValue();
            } while (!JQ0.A1X((C8OS) value, C05F.A0C, value, c05a3));
        }
        long A00 = AbstractC37300Gc1.A00(currentTimeMillis);
        C05A c05a4 = c8op2.A07;
        do {
            value2 = c05a4.getValue();
            A11 = AbstractC166997dE.A11((String) value2);
            A11.append('\n');
            A11.append(str);
            A11.append(" took ");
            A11.append(A00);
        } while (!c05a4.AIi(value2, AbstractC166997dE.A0x("ms", A11)));
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CutoutStickerViewModel$loadOriginalBitmap$3) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
