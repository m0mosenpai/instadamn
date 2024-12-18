package com.instagram.ml.imagecrop.ig;

import X.AbstractC09560e7;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C1NC;
import X.C203498z8;
import X.C85L;
import X.C85M;
import X.C85X;
import X.InterfaceC16620sF;
import X.InterfaceC16820sZ;
import X.InterfaceC203488z7;
import X.InterfaceC23621Ds;
import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.HashMap;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.ml.imagecrop.ig.IgSmartImageCropController$predictAsync$2", f = "IgSmartImageCropController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class IgSmartImageCropController$predictAsync$2 extends AbstractC23611Dp implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C85L A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ InterfaceC16820sZ A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgSmartImageCropController$predictAsync$2(C85L c85l, String str, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, int i3) {
        super(2, interfaceC23621Ds);
        this.A03 = c85l;
        this.A02 = i;
        this.A00 = i2;
        this.A04 = str;
        this.A01 = i3;
        this.A05 = interfaceC16820sZ;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C85L c85l = this.A03;
        int i = this.A02;
        int i2 = this.A00;
        return new IgSmartImageCropController$predictAsync$2(c85l, this.A04, interfaceC23621Ds, this.A05, i, i2, this.A01);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((IgSmartImageCropController$predictAsync$2) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i;
        AbstractC09560e7.A00(obj);
        final C85L c85l = this.A03;
        C85M c85m = c85l.A01;
        final int i2 = this.A02;
        c85m.A00 = i2;
        final int i3 = this.A00;
        float f = i2 / i3;
        int i4 = 224;
        if (i2 >= i3) {
            i4 = (int) (f * 224.0f);
            i = 224;
        } else {
            i = (int) (224.0f / f);
        }
        Integer valueOf = Integer.valueOf(i4);
        Integer valueOf2 = Integer.valueOf(i);
        final String str = this.A04;
        int intValue = valueOf.intValue();
        int intValue2 = valueOf2.intValue();
        final int i5 = this.A01;
        final Bitmap A0F = C1NC.A0F(str, intValue, intValue2, i5);
        if (A0F != null) {
            final InterfaceC16820sZ interfaceC16820sZ = this.A05;
            C85X c85x = c85l.A00;
            c85x.A01 = new InterfaceC203488z7() { // from class: X.8z6
                @Override // X.InterfaceC203488z7
                public final /* bridge */ /* synthetic */ void DaC(Object obj2) {
                    Number number = (Number) obj2;
                    final C85L c85l2 = c85l;
                    c85l2.A00.A01 = null;
                    if (number != null) {
                        if (number.intValue() <= 1) {
                            final String str2 = str;
                            final int i6 = i2;
                            final int i7 = i3;
                            final int i8 = i5;
                            Bitmap bitmap = A0F;
                            final InterfaceC16820sZ interfaceC16820sZ2 = interfaceC16820sZ;
                            C14360o3.A0B(str2, 0);
                            C14360o3.A0B(interfaceC16820sZ2, 5);
                            C85M c85m2 = c85l2.A01;
                            c85m2.A02 = new InterfaceC203488z7() { // from class: X.8zC
                                @Override // X.InterfaceC203488z7
                                public final /* bridge */ /* synthetic */ void DaC(Object obj3) {
                                    int i9;
                                    int i10;
                                    int i11;
                                    int i12;
                                    int i13;
                                    Rect rect = (Rect) obj3;
                                    C85L c85l3 = C85L.this;
                                    c85l3.A01.A02 = null;
                                    if (rect != null) {
                                        HashMap hashMap = c85l3.A02;
                                        String str3 = str2;
                                        int i14 = i6;
                                        int i15 = i7;
                                        int i16 = i8;
                                        Rect rect2 = new Rect();
                                        if (i16 != 0) {
                                            if (i16 != 90) {
                                                if (i16 != 180) {
                                                    if (i16 == 270) {
                                                        i10 = i14 - rect.bottom;
                                                        rect2.left = i10;
                                                        i11 = rect.left;
                                                    }
                                                    hashMap.put(str3, rect2);
                                                } else {
                                                    rect2.left = rect.left;
                                                    rect2.top = (i15 - rect.top) - rect.height();
                                                    rect2.right = rect2.left + rect.width();
                                                    i12 = rect2.top;
                                                    i13 = rect.height();
                                                    i9 = i12 + i13;
                                                }
                                            } else {
                                                i10 = rect.top;
                                                rect2.left = i10;
                                                i11 = i15 - rect.right;
                                            }
                                            rect2.top = i11;
                                            rect2.right = i10 + rect.height();
                                            i12 = rect2.top;
                                            i13 = rect.width();
                                            i9 = i12 + i13;
                                        } else {
                                            rect2.left = rect.left;
                                            rect2.top = rect.top;
                                            rect2.right = rect.right;
                                            i9 = rect.bottom;
                                        }
                                        rect2.bottom = i9;
                                        hashMap.put(str3, rect2);
                                    }
                                    interfaceC16820sZ2.invoke();
                                }
                            };
                            c85m2.A01 = new C203498z8(bitmap);
                            c85m2.A00();
                        } else {
                            interfaceC16820sZ.invoke();
                        }
                        A0F.recycle();
                    }
                }
            };
            c85x.A00 = new C203498z8(A0F);
            c85x.A00();
        }
        return C0eB.A00;
    }
}
