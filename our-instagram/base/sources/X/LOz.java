package X;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class LOz implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public LOz(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        float f;
        String str;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(1751998996);
                ((C46015KYd) this.A02).A01.A02.A03(new C56463P5a((C38321qM) this.A01));
                i = 934390479;
                break;
            case 1:
                A05 = C0f9.A05(-1097724683);
                L8E l8e = (L8E) this.A02;
                if (l8e.A00) {
                    C97574Zs c97574Zs = (C97574Zs) this.A01;
                    int i2 = l8e.A02;
                    C97564Zr c97564Zr = c97574Zs.A00;
                    C141596ac c141596ac = c97564Zr.A06;
                    if (c141596ac != null) {
                        f = (c141596ac.A0A / 1000.0f) * c141596ac.A0B;
                    } else {
                        f = 0.0f;
                    }
                    InterfaceC97544Zo interfaceC97544Zo = c97564Zr.A05;
                    if (interfaceC97544Zo != null) {
                        C101394gx A00 = c97564Zr.A00();
                        String str2 = c97564Zr.A08;
                        if (str2 != null) {
                            String str3 = c97564Zr.A07;
                            if (str3 != null) {
                                interfaceC97544Zo.DZY(c97564Zr.A03, A00, c97564Zr, str2, str3, f, i2);
                            } else {
                                str = "mediaDeliveryClassString";
                            }
                        } else {
                            str = "mediaId";
                        }
                    } else {
                        str = "delegate";
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                i = -1874968847;
                break;
            case 2:
                A05 = C0f9.A05(-2143010582);
                ((C51361MmM) this.A02).A0B.invoke(this.A01);
                i = 476020738;
                break;
            case 3:
                A05 = C0f9.A05(-1006549670);
                ((InterfaceC16660sJ) this.A01).invoke(this.A02);
                i = -645812176;
                break;
            case 4:
                A05 = C0f9.A05(2024236669);
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - AbstractC46487Khl.A00 >= 2000) {
                    AbstractC46487Khl.A00 = currentTimeMillis;
                    ((InterfaceC16660sJ) this.A02).invoke(this.A01);
                }
                i = -1891805188;
                break;
            case 5:
                A05 = C0f9.A05(1174630948);
                MR8 mr8 = (MR8) this.A01;
                C14360o3.A0A(view);
                Integer num = ((JTJ) this.A02).A03;
                C14360o3.A07(num);
                mr8.DjM(view, num);
                i = -212894224;
                break;
            case 6:
                A05 = C0f9.A05(-2028821040);
                MR8 mr82 = (MR8) this.A01;
                C14360o3.A0A(view);
                Integer num2 = ((JTJ) this.A02).A03;
                C14360o3.A07(num2);
                mr82.DjM(view, num2);
                i = -339296854;
                break;
            case 7:
                A05 = AbstractC43593JPy.A03(view, 1385752418);
                ((C47817L9z) this.A02).A00();
                ((View.OnClickListener) this.A01).onClick(view);
                i = 1715110873;
                break;
            case 8:
                A05 = C0f9.A05(-977962669);
                C47678L3l c47678L3l = (C47678L3l) this.A01;
                InterfaceC50403MNf interfaceC50403MNf = c47678L3l.A00;
                InterfaceC50403MNf interfaceC50403MNf2 = (InterfaceC50403MNf) this.A02;
                if (interfaceC50403MNf != interfaceC50403MNf2) {
                    c47678L3l.A00 = interfaceC50403MNf2;
                    int i3 = 0;
                    while (true) {
                        ArrayList arrayList = c47678L3l.A04;
                        if (i3 < arrayList.size()) {
                            L0P l0p = (L0P) arrayList.get(i3);
                            l0p.A00.setSelected(AbstractC167007dF.A1X(l0p.A01, c47678L3l.A00));
                            i3++;
                        } else {
                            c47678L3l.A03.Drn(interfaceC50403MNf2);
                        }
                    }
                }
                i = -1920455392;
                break;
            case 9:
                A05 = C0f9.A05(49004101);
                ((C43999Jcm) this.A02).A00.Cup(((C43960Jc9) this.A01).A02);
                i = 1722985483;
                break;
            default:
                K5T k5t = (K5T) this.A01;
                View view2 = (View) this.A02;
                Iterator it = k5t.A07.iterator();
                while (it.hasNext()) {
                    AbstractC43592JPx.A09(it).setVisibility(0);
                }
                view2.setVisibility(8);
                return;
        }
        C0f9.A0C(i, A05);
    }
}
