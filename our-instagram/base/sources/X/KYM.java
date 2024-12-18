package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class KYM extends C49489Lu2 {
    public final /* synthetic */ C49043LmV A00;
    public final /* synthetic */ C2DS A01;
    public final /* synthetic */ DirectThreadKey A02;
    public final /* synthetic */ MessageIdentifier A03;
    public final /* synthetic */ ArrayList A04;
    public final /* synthetic */ ArrayList A05;
    public final /* synthetic */ ArrayList A06;
    public final /* synthetic */ HashSet A07;
    public final /* synthetic */ C14510oO A08;
    public final /* synthetic */ boolean A09;

    public KYM(C49043LmV c49043LmV, C2DS c2ds, DirectThreadKey directThreadKey, MessageIdentifier messageIdentifier, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, HashSet hashSet, C14510oO c14510oO, boolean z) {
        this.A08 = c14510oO;
        this.A04 = arrayList;
        this.A02 = directThreadKey;
        this.A00 = c49043LmV;
        this.A03 = messageIdentifier;
        this.A01 = c2ds;
        this.A07 = hashSet;
        this.A06 = arrayList2;
        this.A05 = arrayList3;
        this.A09 = z;
    }

    @Override // X.C49489Lu2, X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        String str;
        this.A08.A00 = false;
        ArrayList arrayList = this.A04;
        C2DS c2ds = this.A01;
        DirectThreadKey directThreadKey = this.A02;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c2ds.A8E(AbstractC43592JPx.A0e(it), directThreadKey);
        }
        String str2 = directThreadKey.A00;
        if (str2 != null) {
            C49043LmV c49043LmV = this.A00;
            AbstractC162277Op.A01(c49043LmV.A05, str2, this.A07);
        }
        UserSession userSession = this.A00.A05;
        MessageIdentifier messageIdentifier = this.A03;
        if (messageIdentifier != null) {
            str = messageIdentifier.A01;
        } else {
            str = null;
        }
        C12210kP c12210kP = new C12210kP(userSession);
        c12210kP.A01 = "direct_thread";
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c12210kP.A00(), "direct_delete_message_undo");
        if (A0f.isSampled()) {
            AbstractC31171DnF.A1C(A0f, "undo");
            AbstractC31175DnJ.A1A(A0f, JRE.A09(directThreadKey));
            A0f.AAP("message_id", str);
            AbstractC43827JZq.A02(A0f, directThreadKey);
            A0f.Cht();
        }
    }
}
