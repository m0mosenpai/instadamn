package X;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.Lui, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49529Lui implements MPA {
    public final /* synthetic */ java.util.Set A00;

    public C49529Lui(java.util.Set set) {
        this.A00 = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.MPA
    public final InterfaceC19390xP AYC(Activity activity, C12N c12n, AbstractC12990ll abstractC12990ll) {
        Object c49531Luk;
        AbstractC167027dH.A12(activity, abstractC12990ll, c12n);
        java.util.Set set = this.A00;
        LinkedHashSet<EnumC33446EqJ> A0l = AbstractC31171DnF.A0l();
        LinkedHashSet A0l2 = AbstractC31171DnF.A0l();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            EnumC33446EqJ.A00((EnumC33446EqJ) it.next(), A0l);
        }
        for (EnumC33446EqJ enumC33446EqJ : A0l) {
            int i = 1;
            C83743oJ c83743oJ = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            switch (enumC33446EqJ.ordinal()) {
                case 0:
                    c49531Luk = new C49530Luj(c83743oJ, objArr5 == true ? 1 : 0, i);
                    break;
                case 1:
                    throw AbstractC43594JPz.A0o(enumC33446EqJ, "Not yet supported provider type ", AbstractC166987dD.A1C());
                case 2:
                case 7:
                case 8:
                    throw AbstractC43594JPz.A0o(enumC33446EqJ, "Unexpected provider group found: ", AbstractC166987dD.A1C());
                case 3:
                    c49531Luk = new C49532Lul(C64956Tab.A00);
                    break;
                case 4:
                    c49531Luk = new C49533Lum(objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0, i);
                    break;
                case 5:
                    c49531Luk = new C49531Luk(objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, i);
                    break;
                case 6:
                    c49531Luk = new Object();
                    break;
                default:
                    throw B4Z.A00();
            }
            A0l2.add(c49531Luk);
        }
        ArrayList A0q = AbstractC167017dG.A0q(A0l2);
        Iterator it2 = A0l2.iterator();
        while (it2.hasNext()) {
            A0q.add(((MPA) it2.next()).AYC(activity, c12n, abstractC12990ll));
        }
        return AnonymousClass111.A03(A0q);
    }
}
