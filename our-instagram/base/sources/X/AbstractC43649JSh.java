package X;

import com.instagram.api.schemas.NoteCustomThemeImpl;
import com.instagram.api.schemas.NoteEmojiReactionInfo;
import com.instagram.api.schemas.NotePogVideoDict;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.direct.inbox.notes.models.NoteStyle;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.JSh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43649JSh {
    public static final String A01(UserSession userSession, User user) {
        C14360o3.A0B(user, 0);
        C2DS A00 = AbstractC28761aE.A00(userSession);
        List singletonList = Collections.singletonList(new PendingRecipient(user));
        C14360o3.A07(singletonList);
        return A00.BZR(null, null, null, singletonList).C7I();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001c. Please report as an issue. */
    public static final ArrayList A02(C6C9 c6c9, boolean z) {
        C0T6 c43654JSm;
        int i;
        ArrayList arrayList = new ArrayList();
        NoteStyle noteStyle = (NoteStyle) NoteStyle.A01.get(Integer.valueOf(c6c9.A01));
        if (noteStyle == null) {
            noteStyle = NoteStyle.A0E;
        }
        switch (noteStyle.ordinal()) {
            case 1:
                c43654JSm = new C43654JSm(c6c9);
                arrayList.add(c43654JSm);
                return arrayList;
            case 2:
                c43654JSm = new C43646JSe(c6c9);
                arrayList.add(c43654JSm);
                return arrayList;
            case 3:
            case 6:
            default:
                return arrayList;
            case 4:
                c43654JSm = new K2O(c6c9);
                arrayList.add(c43654JSm);
                return arrayList;
            case 5:
                i = 2;
                c43654JSm = new C9BI(c6c9, i);
                arrayList.add(c43654JSm);
                return arrayList;
            case 7:
                i = 6;
                c43654JSm = new C9BI(c6c9, i);
                arrayList.add(c43654JSm);
                return arrayList;
            case 8:
                i = 4;
                if (z) {
                    i = 5;
                }
                c43654JSm = new C9BI(c6c9, i);
                arrayList.add(c43654JSm);
                return arrayList;
            case 9:
                i = 3;
                c43654JSm = new C9BI(c6c9, i);
                arrayList.add(c43654JSm);
                return arrayList;
            case 10:
                i = 1;
                c43654JSm = new C9BI(c6c9, i);
                arrayList.add(c43654JSm);
                return arrayList;
            case 11:
                c43654JSm = new C9BI(c6c9, 0);
                arrayList.add(c43654JSm);
                return arrayList;
        }
    }

    public static final List A03(UserSession userSession, String str, String str2, String str3, List list, Map map) {
        String str4;
        NotePogVideoDict notePogVideoDict;
        boolean z;
        Boolean bool;
        C67x c67x;
        List list2;
        NoteEmojiReactionInfo noteEmojiReactionInfo;
        boolean A1a = AbstractC31175DnJ.A1a(str2);
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C6C9 c6c9 = (C6C9) it.next();
            C18A A00 = AnonymousClass189.A00(userSession);
            String str5 = c6c9.A0K;
            User A02 = A00.A02(str5);
            List list3 = null;
            if (A02 != null) {
                ArrayList A022 = A02(c6c9, false);
                int indexOf = list.indexOf(c6c9);
                int size = list.size();
                String A01 = A01(userSession, A02);
                NoteAudience A002 = BFV.A00(Integer.valueOf(c6c9.A00));
                AnonymousClass688 anonymousClass688 = c6c9.A07;
                if (anonymousClass688 != null && (list2 = anonymousClass688.A01) != null && (noteEmojiReactionInfo = (NoteEmojiReactionInfo) AbstractC001800i.A0J(list2)) != null) {
                    str4 = noteEmojiReactionInfo.A03;
                } else {
                    str4 = null;
                }
                C67s c67s = c6c9.A0A;
                if (c67s != null && (c67x = c67s.A09) != null) {
                    notePogVideoDict = c67x.A01;
                } else {
                    notePogVideoDict = null;
                }
                if (AbstractC31171DnF.A1W(userSession, str5) && anonymousClass688 != null) {
                    list3 = anonymousClass688.A01;
                }
                boolean z2 = c6c9.A0R;
                String str6 = c6c9.A0H;
                boolean A0K = C14360o3.A0K(str3, str6);
                NoteCustomThemeImpl noteCustomThemeImpl = c6c9.A06;
                if (map != null && (bool = (Boolean) map.get(str6)) != null) {
                    z = bool.booleanValue();
                } else {
                    z = false;
                }
                A1E.add(new C4F5(noteCustomThemeImpl, null, notePogVideoDict, A002, A02, false, Integer.valueOf(indexOf), Integer.valueOf(size), null, null, A01, str, str2, str4, A022, null, null, list3, null, null, 0, false, false, A0K, false, false, A1a, false, false, false, false, z2, z));
            }
        }
        return A1E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0168, code lost:
    
        if (r3 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (r45.A0H.equals("2") == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0160, code lost:
    
        if (r10 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00a2, code lost:
    
        if (r10 != null) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0120  */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.List, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C4F5 A00(X.C6C9 r45, com.instagram.common.session.UserSession r46, java.lang.Integer r47, int r48, int r49, boolean r50, boolean r51, boolean r52, boolean r53, boolean r54, boolean r55, boolean r56, boolean r57) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC43649JSh.A00(X.6C9, com.instagram.common.session.UserSession, java.lang.Integer, int, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):X.4F5");
    }
}
