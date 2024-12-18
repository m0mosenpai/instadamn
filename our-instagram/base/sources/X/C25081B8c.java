package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.B8c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C25081B8c extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25081B8c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, int i) {
        super(1);
        this.A00 = i;
        this.A0A = obj;
        this.A09 = obj2;
        this.A03 = obj3;
        this.A01 = obj4;
        this.A05 = obj5;
        this.A07 = obj6;
        this.A06 = obj7;
        this.A02 = obj8;
        this.A04 = obj9;
        this.A08 = obj10;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2;
        C5TR A04;
        int i;
        Object c30536DcJ;
        InterfaceC16610sE A042;
        C84B c84b;
        C206169Az c206169Az;
        ViewGroup viewGroup;
        if (this.A00 != 0) {
            Bitmap bitmap = (Bitmap) obj;
            C14360o3.A0B(bitmap, 0);
            ((View) this.A05).setBackground(new BitmapDrawable(((View) this.A08).getContext().getResources(), bitmap));
            C81N c81n = (C81N) this.A07;
            boolean A1W = AbstractC167007dF.A1W(c81n.A0D);
            if (A1W) {
                c81n.A05().setVisibility(4);
            }
            C8NJ c8nj = (C8NJ) this.A0A;
            c8nj.A05 = false;
            C87H c87h = (C87H) this.A09;
            if (c87h.A0A.A02() == EnumC189218Zt.A05) {
                c8nj.A03 = -1;
            }
            C8MT c8mt = (C8MT) this.A04;
            C206169Az A00 = C9O8.A00(c8mt.A05, c8nj.A00);
            float f = A00.A03;
            C206169Az c206169Az2 = c8nj.A01;
            float f2 = (f / c206169Az2.A03) * 3.0f;
            float f3 = A00.A02 - c206169Az2.A02;
            float[] fArr = {(A00.A00 - c206169Az2.A00) * 0.5625f, A00.A01 - c206169Az2.A01};
            Matrix A0Q = AbstractC166987dD.A0Q();
            A0Q.setRotate((-c8nj.A01.A02) - f3);
            A0Q.mapPoints(fArr);
            float f4 = fArr[0] / 0.5625f;
            float f5 = c8nj.A01.A03;
            C206169Az c206169Az3 = new C206169Az(2, f2, -f3, f4 / f5, fArr[1] / f5);
            for (C51u c51u : c8nj.A07) {
                Object obj3 = c51u.A00;
                ((View) obj3).setClipToOutline(AbstractC166987dD.A1a(c51u.A01));
                if ((obj3 instanceof ViewGroup) && (viewGroup = (ViewGroup) obj3) != null) {
                    viewGroup.setClipChildren(AbstractC166987dD.A1a(c51u.A02));
                }
            }
            if (A1W) {
                c81n.A06().setTransform(null);
            } else {
                c81n.A05().setScaleX(1.0f);
                c81n.A05().setScaleY(1.0f);
            }
            c87h.A07(c87h.A00());
            c87h.A04();
            ClipsCreationViewModel clipsCreationViewModel = (ClipsCreationViewModel) this.A02;
            c87h.A09(clipsCreationViewModel.A0C);
            if (c206169Az3.equals(this.A01)) {
                C25024B5f.A02(clipsCreationViewModel, AbstractC141776au.A00(clipsCreationViewModel), 46);
            } else {
                C8NL c8nl = (C8NL) this.A03;
                C206169Az c206169Az4 = c8nj.A01;
                C9ZF A002 = C8NL.A00(c8nl);
                if (A002 != null) {
                    int i2 = A002.A02;
                    Integer valueOf = Integer.valueOf(i2);
                    if (c206169Az4.A00() && (c84b = (C84B) c8nl.A04.A0F.A02()) != null) {
                        Iterator it = C17s.A0C(0, c84b.A01.size()).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            int A0H = AbstractC166987dD.A0H(next);
                            if (valueOf != null && A0H == i2) {
                                c206169Az = AMG.A02(c206169Az3);
                            } else {
                                AbstractC115485Ki abstractC115485Ki = (AbstractC115485Ki) c84b.A04(A0H);
                                if (abstractC115485Ki != null) {
                                    c206169Az = abstractC115485Ki.A04();
                                } else {
                                    c206169Az = null;
                                }
                            }
                            if (AMG.A01(c206169Az).A00()) {
                                if (next != null) {
                                    C8NL.A03(c206169Az4, c206169Az3, c8nl, valueOf, true);
                                    c8nj.A01 = new C206169Az(0.0f, 0.0f, 15, 0.0f, 2, 0.0f);
                                }
                            }
                        }
                    }
                    c8nl.A04.A0k(AbstractC166987dD.A1J(AbstractC166987dD.A1L(valueOf, AMG.A02(c206169Az3))), true);
                }
            }
            c8nj.A04 = false;
            C206169Az c206169Az5 = c8nj.A01;
            c8mt.A09(c206169Az5.A03, c206169Az5.A02, c206169Az5.A00, c206169Az5.A01);
            c8nj.A04 = true;
            c8nj.A00 = 1.0f;
            c8mt.A00 = 1.0f;
            c8mt.A01 = 1.0f;
            c8mt.A08 = null;
            InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A06;
            if (interfaceC16820sZ != null) {
                interfaceC16820sZ.invoke();
            }
        } else {
            C6Nu c6Nu = (C6Nu) obj;
            C14360o3.A0B(c6Nu, 0);
            C26063Bfr c26063Bfr = (C26063Bfr) this.A0A;
            boolean z = c26063Bfr.A05;
            if (z) {
                c6Nu.CgH(null, CO3.A00);
            } else {
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A09;
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, abstractC12990ll, 36325081046266584L)) {
                    Object obj4 = this.A03;
                    obj2 = this.A01;
                    c6Nu.EoP(null, null, C5UA.A04(new C30536DcJ(1, obj4, c26063Bfr, obj2), 269924718, true));
                    c6Nu.CgH(null, CO3.A01);
                } else {
                    obj2 = this.A01;
                    c6Nu.CgH(null, C5UA.A04(new C30536DcJ(2, this.A03, c26063Bfr, obj2), 781073673, true));
                }
                List<C50726MaR> list = (List) c26063Bfr.A02;
                Object obj5 = this.A05;
                Object obj6 = this.A07;
                Object obj7 = this.A06;
                Object obj8 = this.A02;
                Object obj9 = this.A04;
                Object obj10 = this.A08;
                ArrayList A0q = AbstractC167017dG.A0q(list);
                for (C50726MaR c50726MaR : list) {
                    boolean z2 = c26063Bfr.A06;
                    int ordinal = ((C26003Ber) c50726MaR.A02).A01.ordinal();
                    if (ordinal != 5) {
                        if (ordinal != 7) {
                            if (ordinal != 4) {
                                if (ordinal == 3) {
                                    if (C18U.A06(c06090Tz, abstractC12990ll, 36325081045873365L)) {
                                        i = -1212900206;
                                        c30536DcJ = new C30714DfC(2, c50726MaR, obj5, obj9, obj2);
                                        A04 = C5UA.A04(c30536DcJ, i, true);
                                    } else {
                                        A0q.add(C0eB.A00);
                                    }
                                }
                            } else if (!C18U.A06(c06090Tz, abstractC12990ll, 36325081043317435L)) {
                                A0q.add(C0eB.A00);
                            } else {
                                i = 1863787473;
                                c30536DcJ = new C30536DcJ(3, c50726MaR, obj6, obj2);
                                A04 = C5UA.A04(c30536DcJ, i, true);
                            }
                        }
                        Object obj11 = obj2;
                        c6Nu.CgH(null, C5UA.A04(new C30714DfC(3, obj9, c50726MaR, obj7, obj11), -1661394091, true));
                        c6Nu.CgH(null, C5UA.A04(new C30714DfC(4, obj5, c50726MaR, obj10, obj11), -751562996, true));
                        A0q.add(C0eB.A00);
                    } else {
                        A04 = C5UA.A04(new C30556Dcd(2, c50726MaR, obj5, obj8, obj2, z2), -1528704108, true);
                    }
                    c6Nu.CgH(null, A04);
                    A0q.add(C0eB.A00);
                }
            }
            Object obj12 = c26063Bfr.A01;
            if (AbstractC166997dE.A1Z(obj12, true)) {
                A042 = CO3.A02;
            } else if (!z && AbstractC166997dE.A1Z(obj12, false) && c26063Bfr.A06) {
                A042 = C5UA.A04(new C30712DfA(this.A02, 21), 795031606, true);
            }
            c6Nu.CgH(null, A042);
        }
        return C0eB.A00;
    }
}
