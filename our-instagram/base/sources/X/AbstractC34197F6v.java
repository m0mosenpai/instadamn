package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectMessageSearchMessage;
import com.instagram.model.direct.DirectSearchResharedContent;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.F6v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34197F6v {
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, com.instagram.model.direct.DirectMessageSearchThread] */
    public static final ArrayList A00(UserSession userSession, List list) {
        ArrayList A12;
        String A07;
        String str;
        DirectMessageSearchMessage directMessageSearchMessage;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC37096GWf interfaceC37096GWf = (InterfaceC37096GWf) it.next();
            if (interfaceC37096GWf instanceof C36439G5o) {
                C36439G5o c36439G5o = (C36439G5o) interfaceC37096GWf;
                A12 = AbstractC166997dE.A12(c36439G5o, 0);
                for (C34511FIx c34511FIx : c36439G5o.A01) {
                    C43707JUs c43707JUs = c34511FIx.A01;
                    C34510FIw c34510FIw = c34511FIx.A00;
                    if (c34510FIw != null && c43707JUs != null && !Collections.unmodifiableList(c43707JUs.A1d).isEmpty()) {
                        User user = (User) Collections.unmodifiableList(c43707JUs.A1d).get(0);
                        ImageUrl Bhu = user.Bhu();
                        Boolean bool = c43707JUs.A0z;
                        ImageUrl imageUrl = null;
                        if (bool != null && bool.equals(true)) {
                            A07 = c43707JUs.A1L;
                            if (Collections.unmodifiableList(c43707JUs.A1d).size() > 1) {
                                imageUrl = AbstractC31177DnL.A0T(Collections.unmodifiableList(c43707JUs.A1d), 1);
                            }
                            str = "group";
                        } else {
                            A07 = AbstractC101904i3.A07(user);
                            str = "one_to_one";
                        }
                        ArrayList A1E2 = AbstractC166987dD.A1E();
                        Iterator A13 = AbstractC31174DnI.A13(c43707JUs.A1d);
                        while (A13.hasNext()) {
                            User A15 = AbstractC25226BEj.A15(A13);
                            ImageUrl imageUrl2 = PendingRecipient.A0g;
                            C14360o3.A0A(A15);
                            A1E2.add(new PendingRecipient(A15));
                        }
                        C34607FMq c34607FMq = c34510FIw.A00;
                        if (c34607FMq != null) {
                            String str2 = c34607FMq.A01;
                            String str3 = c34607FMq.A02;
                            long j = c34607FMq.A00;
                            String str4 = c43707JUs.A1E;
                            C14360o3.A07(str4);
                            ImmutableList A00 = AbstractC35065Fcc.A00(AbstractC31173DnH.A0L(c34607FMq.A04), AbstractC167007dF.A0A(c34607FMq.A02));
                            C14360o3.A0A(A00);
                            directMessageSearchMessage = new DirectMessageSearchMessage(A00, AbstractC31173DnH.A0L(A1E2), Bhu, imageUrl, str2, str3, A07, str4, str, j, 0L, -1L);
                        } else {
                            String str5 = c43707JUs.A1E;
                            C14360o3.A07(str5);
                            String str6 = c34510FIw.A01;
                            ImmutableList A0L = AbstractC31173DnH.A0L(A1E2);
                            C14360o3.A0B(A07, 3);
                            ?? obj = new Object();
                            obj.A08 = str5;
                            obj.A06 = str6;
                            obj.A09 = A07;
                            obj.A0A = str;
                            obj.A07 = "open";
                            obj.A04 = Bhu;
                            obj.A05 = imageUrl;
                            obj.A03 = A0L;
                            obj.A02 = 0L;
                            obj.A01 = 0L;
                            obj.A00 = -1L;
                            directMessageSearchMessage = obj;
                        }
                        A12.add(directMessageSearchMessage);
                    }
                }
            } else if (interfaceC37096GWf instanceof C36440G5p) {
                C36440G5p c36440G5p = (C36440G5p) interfaceC37096GWf;
                A12 = AbstractC166997dE.A12(c36440G5p, 1);
                for (C34512FIy c34512FIy : c36440G5p.A01) {
                    C38321qM c38321qM = c34512FIy.A00;
                    if (c38321qM != null) {
                        C14360o3.A0A(c38321qM);
                        A12.add(new DirectSearchResharedContent(userSession, c38321qM, AbstractC31171DnF.A0k(c34512FIy.A01)));
                    }
                }
            }
            A1E.addAll(A12);
        }
        return A1E;
    }
}
