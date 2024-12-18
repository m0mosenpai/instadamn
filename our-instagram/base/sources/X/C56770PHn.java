package X;

import android.app.Activity;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.mediakit.model.MediaKitInsightType;
import com.instagram.mediakit.model.MediaKitSectionType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.PHn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56770PHn implements C7XU {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C56770PHn(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.C7XU
    public final void DAy() {
        InterfaceC57838Pl4[] interfaceC57838Pl4Arr;
        InterfaceC57838Pl4 p5t;
        Object obj;
        switch (this.A00) {
            case 0:
                new C31727DwY((C50674MYs) this.A01).A05((Activity) this.A02);
                return;
            case 1:
                C189478aR c189478aR = (C189478aR) this.A01;
                KFE kfe = (KFE) this.A02;
                c189478aR.A02(kfe.A0A, kfe.A0H);
                return;
            case 2:
                boolean z = false;
                if (AbstractC166997dE.A1Z(this.A01, false)) {
                    C49088LnE c49088LnE = (C49088LnE) this.A02;
                    if (C14360o3.A0K(c49088LnE.A02.A01.A00, C125535lz.A00)) {
                        z = true;
                        C143266dR c143266dR = c49088LnE.A01;
                        if (c143266dR.A02()) {
                            AbstractC59962oe abstractC59962oe = c49088LnE.A03;
                            C07S c07s = C07S.STARTED;
                            C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
                            AbstractC166987dD.A1Z(new MCM(viewLifecycleOwner, c07s, c143266dR, c49088LnE, null, 14), C07Y.A00(viewLifecycleOwner));
                            c143266dR.A00();
                            return;
                        }
                    }
                }
                C49088LnE c49088LnE2 = (C49088LnE) this.A02;
                c49088LnE2.A09.D01();
                if (!z || !c49088LnE2.A06.A00()) {
                    return;
                }
                c49088LnE2.A08.A00();
                return;
            case 3:
                C45487KCc c45487KCc = (C45487KCc) this.A02;
                MRK mrk = c45487KCc.A0P;
                if (mrk == null) {
                    return;
                }
                long A00 = C45487KCc.A00(c45487KCc);
                C45842KQx c45842KQx = (C45842KQx) this.A01;
                NoteAudience noteAudience = c45842KQx.A06;
                String str = c45842KQx.A08;
                String str2 = c45842KQx.A0G;
                mrk.E2o(c45842KQx.A04, c45842KQx.A05, noteAudience, str, str2, c45842KQx.A0B, A00, c45842KQx.A0N);
                return;
            default:
                C51053Mh7 A0l = MSW.A0l(((N4J) this.A02).A02);
                MediaKitSectionType mediaKitSectionType = (MediaKitSectionType) this.A01;
                AbstractC55033OXz.A00(OPN.A01(mediaKitSectionType), A0l, C05F.A0P, null, null, AbstractC166987dD.A1G());
                int ordinal = mediaKitSectionType.ordinal();
                if (ordinal != 3) {
                    if (ordinal != 2) {
                        if (ordinal != 1) {
                            C51850Mvs A002 = OZE.A00(MediaKitSectionType.A07, String.valueOf(A0l.A07.A02.A04.size()), "");
                            String str3 = A002.A03;
                            String str4 = A002.A04;
                            MediaKitSectionType mediaKitSectionType2 = A002.A01;
                            AbstractC167017dG.A0x();
                            PZM.A01(A0l, new C51850Mvs(null, mediaKitSectionType2, "", str3, str4, null, null), AbstractC141776au.A00(A0l), 29);
                            return;
                        }
                        interfaceC57838Pl4Arr = new InterfaceC57838Pl4[1];
                        p5t = new P5Q(String.valueOf(A0l.A07.A02.A04.size()));
                    } else {
                        OLz oLz = A0l.A07.A02;
                        C51850Mvs A003 = OZE.A00(MediaKitSectionType.A05, String.valueOf(oLz.A04.size()), "Insights");
                        C51850Mvs A004 = Nv9.A00(null, A003.A01, "", A003.A03, A003.A04, null, C16930sl.A00);
                        List<MediaKitInsightType> list = C39167HLv.A03;
                        ArrayList A0q = AbstractC167017dG.A0q(list);
                        for (MediaKitInsightType mediaKitInsightType : list) {
                            Iterator it = oLz.A03.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj = it.next();
                                    if (((H7W) obj).A00 == mediaKitInsightType) {
                                        if (obj != null) {
                                        }
                                    }
                                }
                            }
                            C14360o3.A0B(mediaKitInsightType, 0);
                            obj = new H7W(new H7W(mediaKitInsightType, "-").A00, "-");
                            A0q.add(obj);
                        }
                        List list2 = A004.A05;
                        String str5 = A004.A02;
                        String str6 = A004.A03;
                        C51849Mvr c51849Mvr = A004.A00;
                        String str7 = A004.A04;
                        MediaKitSectionType mediaKitSectionType3 = A004.A01;
                        C14360o3.A0B(str6, 2);
                        AbstractC167017dG.A1T(str7, mediaKitSectionType3);
                        PZM.A01(A0l, new C51850Mvs(c51849Mvr, mediaKitSectionType3, str5, str6, str7, list2, A0q), AbstractC141776au.A00(A0l), 29);
                        return;
                    }
                } else {
                    interfaceC57838Pl4Arr = new InterfaceC57838Pl4[1];
                    p5t = new P5T(String.valueOf(A0l.A07.A02.A04.size()));
                }
                interfaceC57838Pl4Arr[0] = p5t;
                A0l.A03(interfaceC57838Pl4Arr);
                return;
        }
    }

    @Override // X.C7XU
    public final void DB3() {
    }
}
