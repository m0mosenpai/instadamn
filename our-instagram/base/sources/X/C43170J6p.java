package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import java.io.File;

/* renamed from: X.J6p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43170J6p extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public int A01;
    public Object A02;
    public boolean A03;
    public final int A04 = 0;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43170J6p(C38335GtV c38335GtV, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A05 = c38335GtV;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        if (this.A04 != 0) {
            C43170J6p c43170J6p = new C43170J6p((C38335GtV) this.A05, interfaceC23621Ds);
            c43170J6p.A02 = obj;
            return c43170J6p;
        }
        return new C43170J6p((C25865BcK) this.A05, interfaceC23621Ds, (byte[]) this.A02, this.A00, this.A03);
    }

    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C38335GtV c38335GtV;
        C38959HDl c38959HDl;
        ?? r8;
        boolean CR4;
        int i;
        int i2 = this.A04;
        C1JX c1jx = C1JX.A02;
        if (i2 != 0) {
            boolean z = true;
            if (this.A01 != 0) {
                CR4 = this.A03;
                int i3 = this.A00;
                c38959HDl = (C38959HDl) this.A02;
                AbstractC09560e7.A00(obj);
                i = i3;
            } else {
                AbstractC09560e7.A00(obj);
                AbstractC39653Hii abstractC39653Hii = (AbstractC39653Hii) this.A02;
                if (abstractC39653Hii instanceof C37752GjR) {
                    c38335GtV = (C38335GtV) this.A05;
                    AbstractC166997dE.A1Y(c38335GtV.A0O, true);
                } else if (abstractC39653Hii instanceof C37818GkY) {
                    c38335GtV = (C38335GtV) this.A05;
                    C05A c05a = c38335GtV.A0P;
                    Boolean A0a = AbstractC166997dE.A0a();
                    c05a.Egh(A0a);
                    c38335GtV.A0O.Egh(A0a);
                    C37818GkY c37818GkY = (C37818GkY) abstractC39653Hii;
                    C38959HDl c38959HDl2 = (C38959HDl) c37818GkY.A01;
                    c38959HDl = c38959HDl2.A06;
                    if (c38959HDl == null) {
                        c38959HDl = c38959HDl2;
                    }
                    InterfaceC88553xD A01 = c38959HDl.A01();
                    if (A01 != null) {
                        r8 = A01.CQ9();
                    } else {
                        r8 = 0;
                    }
                    if (c37818GkY.A0D && !c37818GkY.A0G) {
                        AbstractC166997dE.A1Y(c38335GtV.A0N, true);
                        c38335GtV.A0L.Egh(c38959HDl);
                        CR4 = c38959HDl.CR4();
                        InterfaceC24731Iq interfaceC24731Iq = c38335GtV.A0H;
                        C53055NdU c53055NdU = new C53055NdU(c38335GtV.A0D, r8, CR4, c37818GkY.A09.size());
                        this.A02 = c38959HDl;
                        this.A00 = r8;
                        this.A03 = CR4;
                        this.A01 = 1;
                        i = r8;
                        if (interfaceC24731Iq.EMz(c53055NdU, this) == c1jx) {
                            return c1jx;
                        }
                    }
                } else if (abstractC39653Hii instanceof C38971HDz) {
                    C38335GtV c38335GtV2 = (C38335GtV) this.A05;
                    C05A c05a2 = c38335GtV2.A0P;
                    Boolean A0a2 = AbstractC166997dE.A0a();
                    c05a2.Egh(A0a2);
                    c38335GtV2.A0O.Egh(A0a2);
                    c38335GtV2.A0N.Egh(A0a2);
                    c38335GtV2.A09.A0S(((C38971HDz) abstractC39653Hii).A01);
                }
                AbstractC166997dE.A1Y(c38335GtV.A0N, false);
            }
            if (!CR4 && c38959HDl.A01() != null) {
                AbstractC52922bZ abstractC52922bZ = (AbstractC52922bZ) this.A05;
                if (i == 0) {
                    z = false;
                }
                AbstractC166987dD.A1Z(new PZK(abstractC52922bZ, null, 21, z), AbstractC141776au.A00(abstractC52922bZ));
            }
            C50679MYx c50679MYx = c38959HDl.A02;
            if (c50679MYx != null) {
                ((C38335GtV) this.A05).A00 = c50679MYx;
            }
        } else if (this.A01 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            C25865BcK c25865BcK = (C25865BcK) this.A05;
            byte[] bArr = (byte[]) this.A02;
            int i4 = this.A00;
            boolean z2 = this.A03;
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            C14360o3.A0A(decodeByteArray);
            Matrix matrix = new Matrix();
            matrix.postRotate(i4);
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            C0fK.A03(decodeByteArray);
            Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, width, height, matrix, true);
            C14360o3.A07(createBitmap);
            if (z2) {
                Matrix matrix2 = new Matrix();
                matrix2.preScale(-1.0f, 1.0f);
                int width2 = createBitmap.getWidth();
                int height2 = createBitmap.getHeight();
                C0fK.A03(createBitmap);
                createBitmap = Bitmap.createBitmap(createBitmap, 0, 0, width2, height2, matrix2, true);
                C14360o3.A0A(createBitmap);
            }
            File file = new File(C50472Tr.A01(), "temp.jpg");
            C1NC.A0M(createBitmap, file);
            String path = file.getPath();
            C14360o3.A07(path);
            InterfaceC06180Ui interfaceC06180Ui = c25865BcK.A04;
            C23819AgU c23819AgU = new C23819AgU(path, c25865BcK.A02);
            this.A01 = 1;
            if (interfaceC06180Ui.emit(c23819AgU, this) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C43170J6p) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43170J6p(C25865BcK c25865BcK, InterfaceC23621Ds interfaceC23621Ds, byte[] bArr, int i, boolean z) {
        super(2, interfaceC23621Ds);
        this.A05 = c25865BcK;
        this.A02 = bArr;
        this.A00 = i;
        this.A03 = z;
    }
}
