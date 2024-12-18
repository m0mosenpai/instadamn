package X;

import com.instagram.api.schemas.ConfirmationStyle;
import com.instagram.api.schemas.ConfirmationTitleStyle;
import com.instagram.api.schemas.MediaOptionStyle;
import com.instagram.api.schemas.UndoStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class CUQ {
    public UndoStyle A00;
    public String A01;
    public String A02;
    public String A03;
    public List A04;
    public ConfirmationStyle A05;
    public ConfirmationTitleStyle A06;
    public InterfaceC88383wt A07;
    public MediaOptionStyle A08;
    public Boolean A09;
    public String A0A;
    public final InterfaceC84443pn A0B;

    public final C84433pm A00() {
        ArrayList arrayList;
        String str = this.A01;
        String str2 = this.A02;
        ConfirmationStyle confirmationStyle = this.A05;
        String str3 = this.A03;
        ConfirmationTitleStyle confirmationTitleStyle = this.A06;
        Boolean bool = this.A09;
        List list = this.A04;
        C88373ws c88373ws = null;
        if (list != null) {
            arrayList = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC25236BEt.A0v(arrayList, it);
            }
        } else {
            arrayList = null;
        }
        InterfaceC88383wt interfaceC88383wt = this.A07;
        if (interfaceC88383wt != null) {
            c88373ws = interfaceC88383wt.Etg();
        }
        return new C84433pm(confirmationStyle, confirmationTitleStyle, c88373ws, this.A08, this.A00, bool, str, str2, str3, this.A0A, arrayList);
    }

    public CUQ(InterfaceC84443pn interfaceC84443pn) {
        this.A0B = interfaceC84443pn;
        this.A01 = interfaceC84443pn.AqH();
        this.A02 = interfaceC84443pn.AqI();
        this.A05 = interfaceC84443pn.AqJ();
        this.A03 = interfaceC84443pn.AqK();
        this.A06 = interfaceC84443pn.AqL();
        this.A09 = interfaceC84443pn.B1m();
        this.A04 = interfaceC84443pn.B7a();
        this.A07 = interfaceC84443pn.B7b();
        this.A0A = interfaceC84443pn.getTitle();
        this.A08 = interfaceC84443pn.C92();
        this.A00 = interfaceC84443pn.CCV();
    }
}
