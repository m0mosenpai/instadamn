package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;
import com.instagram.user.model.User;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1Q0, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Q0 implements InterfaceC13060ls {
    public final Context A00;
    public final File A01;

    public C1Q0(Context context) {
        C14360o3.A0B(context, 1);
        this.A00 = context;
        this.A01 = (File) C1Q3.A00.getValue();
    }

    @Override // X.InterfaceC13060ls
    public final void Cww(AbstractC12990ll abstractC12990ll) {
        UserSession userSession;
        String str;
        C14360o3.A0B(abstractC12990ll, 0);
        Context context = this.A00;
        if (new C1CM(context).A07(true)) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, abstractC12990ll, 36331209961260244L) && (abstractC12990ll instanceof UserSession) && (userSession = (UserSession) abstractC12990ll) != null) {
                C1Q3.A00();
                java.util.Set keySet = C1Q3.A02.keySet();
                String str2 = userSession.userId;
                C1DX A00 = C1DW.A00(userSession);
                java.util.Set A0k = AbstractC001800i.A0k(A00.A01.keySet());
                ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A0k, 10));
                Iterator it = A0k.iterator();
                while (it.hasNext()) {
                    arrayList.add(A00.A02((String) it.next()));
                }
                List A0X = AbstractC001800i.A0X(arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : A0X) {
                    C38321qM c38321qM = (C38321qM) obj;
                    if (ProductType.CLIPS == c38321qM.A1z()) {
                        User CDj = c38321qM.A0C.CDj();
                        if (CDj != null) {
                            str = CDj.getId();
                        } else {
                            str = null;
                        }
                        if (C14360o3.A0K(str, str2)) {
                            arrayList2.add(obj);
                        }
                    }
                }
                arrayList2.size();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : arrayList2) {
                    if (!AbstractC001800i.A0u(keySet, ((C38321qM) obj2).getId())) {
                        arrayList3.add(obj2);
                    }
                }
                arrayList3.size();
                arrayList2.size();
                keySet.size();
                for (C38321qM c38321qM2 : AbstractC001800i.A0d(arrayList3, (int) C18U.A01(c06090Tz, userSession, 36612684938025368L))) {
                    C121275eQ A03 = AbstractC50633MWu.A03(context, userSession, AbstractC50633MWu.A05(context, c38321qM2, "SelfVideoDownloadManager", true, true));
                    A03.A00 = new NFR(c38321qM2, this);
                    c38321qM2.getId();
                    C1GJ.A03(A03);
                }
            }
        }
    }

    @Override // X.InterfaceC13060ls
    public final void Cwy(AbstractC12990ll abstractC12990ll) {
    }
}
