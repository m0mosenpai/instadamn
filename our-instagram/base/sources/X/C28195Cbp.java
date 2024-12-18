package X;

import android.content.Context;
import com.instagram.api.schemas.NoteEmojiReactionInfoIntf;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Cbp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28195Cbp {
    public static final C28195Cbp A00 = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public final void A00(Context context, UserSession userSession, InterfaceC904941j interfaceC904941j, C39G c39g, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, String str, boolean z) {
        int i;
        Object obj;
        String str2;
        Integer num;
        String str3;
        Integer num2;
        ImageUrl imageUrl;
        List list;
        String str4;
        Integer num3;
        AbstractC25234BEr.A1P(userSession, interfaceC60442pS, c39g);
        List A3j = c38321qM.A3j();
        if (A3j != null) {
            Iterator it = A3j.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (C14360o3.A0K(((InterfaceC103524lS) obj).getId(), str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            InterfaceC103524lS interfaceC103524lS = (InterfaceC103524lS) obj;
            if (interfaceC103524lS != null) {
                if (C2TN.A05(userSession, interfaceC103524lS.getUserId())) {
                    String userId = interfaceC103524lS.getUserId();
                    if (userId == null) {
                        userId = "";
                    }
                    String text = interfaceC103524lS.getText();
                    if (text == null) {
                        text = "";
                    }
                    User CDj = interfaceC103524lS.CDj();
                    if (CDj != null) {
                        imageUrl = CDj.Bhu();
                    } else {
                        imageUrl = null;
                    }
                    String id = c38321qM.getId();
                    if (id == null) {
                        id = "";
                    }
                    String A2f = c38321qM.A2f();
                    Integer AdU = interfaceC103524lS.AdU();
                    String moduleName = interfaceC60442pS.getModuleName();
                    List Bkk = interfaceC103524lS.Bkk();
                    if (Bkk != null) {
                        list = AbstractC166987dD.A1E();
                        Iterator it2 = Bkk.iterator();
                        while (it2.hasNext()) {
                            list.add(((NoteEmojiReactionInfoIntf) it2.next()).ExL(C1DS.A00(userSession)));
                        }
                    } else {
                        list = C16930sl.A00;
                    }
                    String BJN = c38321qM.A0C.BJN();
                    String A1G = AbstractC25226BEj.A1G(c38321qM);
                    if (interfaceC904941j != null) {
                        str4 = interfaceC904941j.Am2();
                        num3 = interfaceC904941j.Am9();
                    } else {
                        str4 = null;
                        num3 = null;
                    }
                    c39g.DkQ(null, AbstractC27607CGd.A00(userSession, imageUrl, c38321qM.A1S(), AdU, 0, num3, userId, text, str, id, A2f, moduleName, BJN, A1G, str4, list), null, null, null, C05F.A00);
                    return;
                }
                User CDj2 = interfaceC103524lS.CDj();
                if (CDj2 == null) {
                    i = 2131956739;
                    String A0p = AbstractC166997dE.A0p(context, i);
                    C41451vu c41451vu = C41451vu.A01;
                    C146106i8 A0j = AbstractC25229BEm.A0j();
                    A0j.A0H = "content_note_detail_launcher_error";
                    A0j.A0D = A0p;
                    AbstractC166997dE.A1O(c41451vu, A0j.A00());
                }
                BSo bSo = BSo.A00;
                String moduleName2 = interfaceC60442pS.getModuleName();
                String BJN2 = c38321qM.A0C.BJN();
                String A1G2 = AbstractC25226BEj.A1G(c38321qM);
                String id2 = interfaceC103524lS.getId();
                if (id2 == null) {
                    id2 = "";
                }
                if (interfaceC904941j != null) {
                    str2 = interfaceC904941j.Am2();
                    num = interfaceC904941j.Am9();
                } else {
                    str2 = null;
                    num = null;
                }
                bSo.A06(userSession, num, moduleName2, BJN2, A1G2, id2, str2);
                String id3 = c38321qM.getId();
                if (id3 == null) {
                    id3 = "";
                }
                String A2f2 = c38321qM.A2f();
                String id4 = interfaceC103524lS.getId();
                String moduleName3 = interfaceC60442pS.getModuleName();
                String BJN3 = c38321qM.A0C.BJN();
                String A1G3 = AbstractC25226BEj.A1G(c38321qM);
                if (interfaceC904941j != null) {
                    str3 = interfaceC904941j.Am2();
                    num2 = interfaceC904941j.Am9();
                } else {
                    str3 = null;
                    num2 = null;
                }
                ContentNoteMetadata contentNoteMetadata = new ContentNoteMetadata(c38321qM.A1S(), CDj2, 0, num2, id3, A2f2, id4, moduleName3, BJN3, A1G3, str3, c38321qM.Cff());
                Integer num4 = C05F.A00;
                String text2 = interfaceC103524lS.getText();
                if (text2 == null) {
                    text2 = "";
                }
                Integer AdU2 = interfaceC103524lS.AdU();
                boolean A1T = AbstractC167007dF.A1T(interfaceC103524lS.BCr());
                c39g.DX7(null, interfaceC103524lS.AvO(), contentNoteMetadata, interfaceC60442pS, num4, AdU2, interfaceC103524lS.Asa(), text2, z, A1T);
                return;
            }
        }
        i = 2131956740;
        String A0p2 = AbstractC166997dE.A0p(context, i);
        C41451vu c41451vu2 = C41451vu.A01;
        C146106i8 A0j2 = AbstractC25229BEm.A0j();
        A0j2.A0H = "content_note_detail_launcher_error";
        A0j2.A0D = A0p2;
        AbstractC166997dE.A1O(c41451vu2, A0j2.A00());
    }
}
