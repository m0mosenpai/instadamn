package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Gdo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37408Gdo {
    public static final List A00(List list) {
        C102134ij c102134ij;
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC102164im interfaceC102164im = (InterfaceC102164im) it.next();
            C14360o3.A0B(interfaceC102164im, 0);
            C84823qW c84823qW = new C84823qW(EnumC75383a5.A09, interfaceC102164im.CI1(), interfaceC102164im.CIa(), interfaceC102164im.CIh(), interfaceC102164im.CHf(), interfaceC102164im.BDR(), interfaceC102164im.Bpa(), interfaceC102164im.CVk(), interfaceC102164im.Cdh(), interfaceC102164im.CUY(), interfaceC102164im.Ayd(), interfaceC102164im.AdC(), interfaceC102164im.getId());
            InterfaceC102144ik CFz = interfaceC102164im.CFz();
            C102134ij c102134ij2 = null;
            if (CFz != null) {
                c102134ij = CFz.ErA();
            } else {
                c102134ij = null;
            }
            c84823qW.A0D = c102134ij;
            InterfaceC102144ik AeA = interfaceC102164im.AeA();
            if (AeA != null) {
                C102134ij ErA = AeA.ErA();
                String Aei = interfaceC102164im.Aei();
                c102134ij2 = new C102134ij(ErA.A00, ErA.A01, ErA.A02, ErA.A03, ErA.A04, Aei, ErA.A06, interfaceC102164im.B3Q(), ErA.A08, ErA.A09);
            }
            c84823qW.A0C = c102134ij2;
            String userId = interfaceC102164im.getUserId();
            if (userId != null) {
                c84823qW.A1o = userId;
            }
            arrayList.add(c84823qW);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.IeH, java.lang.Object] */
    public static final List A01(List list) {
        C41743IeH c41743IeH;
        C114665Fw c114665Fw;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC43581JMp interfaceC43581JMp = (InterfaceC43581JMp) it.next();
            C14360o3.A0B(interfaceC43581JMp, 0);
            C84823qW c84823qW = new C84823qW(EnumC75383a5.A0D, interfaceC43581JMp.CI1(), interfaceC43581JMp.CIa(), interfaceC43581JMp.CIh(), interfaceC43581JMp.CHf(), interfaceC43581JMp.BDR(), interfaceC43581JMp.Bpa(), interfaceC43581JMp.CVk(), interfaceC43581JMp.Cdh(), interfaceC43581JMp.CUY(), interfaceC43581JMp.Ayd(), interfaceC43581JMp.AdC(), interfaceC43581JMp.getId());
            InterfaceC43552JLm Agd = interfaceC43581JMp.Agd();
            if (Agd != null) {
                c41743IeH = new Object();
                C41743IeH.A00(c41743IeH);
                c41743IeH.A09 = Agd.getId();
                C914346k AgU = Agd.AgU();
                c41743IeH.A03 = AgU;
                if (AgU != null) {
                    c114665Fw = AbstractC40567Hyn.A00(AgU);
                } else {
                    c114665Fw = null;
                }
                c41743IeH.A02 = c114665Fw;
                c41743IeH.A07 = Agd.Age();
            } else {
                c41743IeH = 0;
            }
            c84823qW.A1F = c41743IeH;
            A0q.add(c84823qW);
        }
        return A0q;
    }
}
