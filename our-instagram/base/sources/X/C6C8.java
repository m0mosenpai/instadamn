package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.ImmutablePandoNoteEmojiReactionInfo;
import com.instagram.api.schemas.NoteBackgroundColor;
import com.instagram.api.schemas.NoteCustomThemeImpl;
import com.instagram.api.schemas.NoteEmojiReactionInfo;
import com.instagram.api.schemas.NoteEmojiReactionInfoIntf;
import com.instagram.api.schemas.NoteFontStyle;
import com.instagram.api.schemas.NoteReactionType;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.direct.inbox.notes.models.NoteStyle;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6C8, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6C8 {
    public static final NoteEmojiReactionInfo A00(NoteEmojiReactionInfoIntf noteEmojiReactionInfoIntf) {
        C14360o3.A0B(noteEmojiReactionInfoIntf, 0);
        String emoji = noteEmojiReactionInfoIntf.getEmoji();
        return new NoteEmojiReactionInfo(noteEmojiReactionInfoIntf.Bkj(), noteEmojiReactionInfoIntf.CDj(), noteEmojiReactionInfoIntf.Cf9(), emoji);
    }

    public static final AnonymousClass688 A01(UserSession userSession, AnonymousClass680 anonymousClass680) {
        User user;
        C111074zO Ext = ((AnonymousClass683) anonymousClass680.reinterpret(AnonymousClass683.class)).ExM(new C1DY((C1DV) C1DS.A00(userSession), (java.util.Set) new HashSet(), false)).A00.Ext();
        ImmutableList requiredCompactedTreeListField = anonymousClass680.getRequiredCompactedTreeListField(0, "reactions", AnonymousClass681.class, -1048951654);
        C14360o3.A07(requiredCompactedTreeListField);
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(requiredCompactedTreeListField, 10));
        Iterator<E> it = requiredCompactedTreeListField.iterator();
        while (it.hasNext()) {
            C2JS c2js = (C2JS) it.next();
            String requiredStringField = c2js.reinterpretRequired(0, C59489Qfm.class, 558195694).getRequiredStringField(0, "emoji");
            Boolean valueOf = Boolean.valueOf(c2js.reinterpretRequired(0, C59489Qfm.class, 558195694).getRequiredBooleanField(1, "is_unseen"));
            C2JS reinterpretRequired = c2js.reinterpretRequired(0, C59489Qfm.class, 558195694);
            C1DU A00 = C1DS.A00(userSession);
            ImmutablePandoNoteEmojiReactionInfo immutablePandoNoteEmojiReactionInfo = (ImmutablePandoNoteEmojiReactionInfo) reinterpretRequired.reinterpret(ImmutablePandoNoteEmojiReactionInfo.class);
            immutablePandoNoteEmojiReactionInfo.E9S(new C1DY((C1DV) A00, (java.util.Set) new HashSet(), false));
            NoteReactionType Bkj = immutablePandoNoteEmojiReactionInfo.Bkj();
            AnonymousClass676 anonymousClass676 = (AnonymousClass676) c2js.reinterpretRequired(0, C59489Qfm.class, 558195694).getRequiredTreeField(2, PublicKeyCredentialControllerUtility.JSON_KEY_USER, C66969UeG.class, 566429378).reinterpretRequired(0, AnonymousClass676.class, -1791809412);
            if (anonymousClass676 != null) {
                user = anonymousClass676.A0E(C1DS.A00(userSession));
            } else {
                user = null;
            }
            arrayList.add(new NoteEmojiReactionInfo(Bkj, user, valueOf, requiredStringField));
        }
        return new AnonymousClass688(Ext, arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        if (r20 != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C6C9 A03(com.instagram.common.session.UserSession r37, X.AnonymousClass674 r38, X.AnonymousClass677 r39, X.C18A r40) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6C8.A03(com.instagram.common.session.UserSession, X.674, X.677, X.18A):X.6C9");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C6C9 A04(UserSession userSession, AnonymousClass674 anonymousClass674, C59484Qfh c59484Qfh) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Integer num;
        User user;
        ImmutableList A0E;
        AnonymousClass675 anonymousClass675;
        AnonymousClass676 A0E2;
        String optionalStringField;
        ImmutableList A0E3;
        AnonymousClass675 anonymousClass6752;
        AnonymousClass676 A0E4;
        ImmutableList A0E5;
        ImmutableList A0E6;
        String requiredStringField = c59484Qfh.getRequiredStringField(0, "strong_id__");
        if (requiredStringField == null) {
            return null;
        }
        int i = NoteAudience.A07.A00;
        if (anonymousClass674 != null && (A0E6 = anonymousClass674.A0E()) != null) {
            arrayList = new ArrayList(AbstractC06950Ym.A1E(A0E6, 10));
            Iterator<E> it = A0E6.iterator();
            while (it.hasNext()) {
                arrayList.add(((AnonymousClass675) it.next()).A0E().A0E(C1DS.A00(userSession)));
            }
        } else {
            arrayList = null;
        }
        NoteBackgroundColor noteBackgroundColor = NoteBackgroundColor.A09;
        NoteFontStyle noteFontStyle = NoteFontStyle.A05;
        boolean coercedBooleanField = c59484Qfh.getCoercedBooleanField(2, "should_show_unseen_response_indicator");
        INC inc = new INC(C41673Id2.A00());
        C41603Iar c41603Iar = InterfaceC1347967p.A00;
        String optionalStringField2 = c59484Qfh.getOptionalStringField(1, "prompt_text");
        if (optionalStringField2 == null) {
            optionalStringField2 = "";
        }
        IN4 A00 = c41603Iar.A00(requiredStringField, optionalStringField2);
        if (anonymousClass674 != null && (A0E5 = anonymousClass674.A0E()) != null) {
            arrayList2 = new ArrayList(AbstractC06950Ym.A1E(A0E5, 10));
            Iterator<E> it2 = A0E5.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((AnonymousClass675) it2.next()).A0E().A0E(C1DS.A00(userSession)));
            }
        } else {
            arrayList2 = null;
        }
        A00.A04 = arrayList2;
        if (anonymousClass674 != null) {
            num = Integer.valueOf(anonymousClass674.getRequiredIntField(0, "num_pog_users"));
        } else {
            num = null;
        }
        A00.A01 = num;
        A00.A00 = Boolean.valueOf(c59484Qfh.getCoercedBooleanField(2, "should_show_unseen_response_indicator"));
        inc.A0B = A00.A00();
        C67s A002 = inc.A00();
        int i2 = NoteStyle.A0C.A00;
        C16930sl c16930sl = C16930sl.A00;
        String optionalStringField3 = c59484Qfh.getOptionalStringField(1, "prompt_text");
        if (optionalStringField3 == null) {
            optionalStringField3 = "";
        }
        if (anonymousClass674 != null && (A0E3 = anonymousClass674.A0E()) != null && (anonymousClass6752 = (AnonymousClass675) A0E3.get(0)) != null && (A0E4 = anonymousClass6752.A0E()) != null) {
            user = A0E4.A0E(C1DS.A00(userSession));
        } else {
            user = null;
        }
        if (user != null) {
            if (anonymousClass674 != null && (A0E = anonymousClass674.A0E()) != null && (anonymousClass675 = (AnonymousClass675) A0E.get(0)) != null && (A0E2 = anonymousClass675.A0E()) != null && (optionalStringField = A0E2.getOptionalStringField(4, "strong_id__")) != null) {
                return new C6C9(null, noteBackgroundColor, null, null, noteFontStyle, null, A002, null, null, user, false, null, null, requiredStringField, null, optionalStringField3, optionalStringField, arrayList, null, c16930sl, i, i2, -1L, -1L, false, false, false, coercedBooleanField);
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final User A05(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        User A02 = AnonymousClass189.A00(userSession).A02(userSession.userId);
        if (A02 == null) {
            return C08730cb.A00(userSession).A00();
        }
        return A02;
    }

    public static final C6C9 A02(C6CA c6ca, UserSession userSession) {
        AnonymousClass688 anonymousClass688;
        C6C9 c6c9 = (C6C9) c6ca;
        int i = c6c9.A00;
        List list = c6c9.A0L;
        Integer num = c6c9.A0F;
        NoteBackgroundColor noteBackgroundColor = NoteBackgroundColor.A09;
        boolean z = c6c9.A0O;
        long j = c6c9.A02;
        NoteCustomThemeImpl noteCustomThemeImpl = c6c9.A06;
        NoteCustomThemeImpl noteCustomThemeImpl2 = null;
        if (noteCustomThemeImpl != null) {
            noteCustomThemeImpl2 = noteCustomThemeImpl;
        }
        List list2 = c6c9.A0M;
        long j2 = c6c9.A03;
        NoteFontStyle noteFontStyle = NoteFontStyle.A05;
        String str = c6c9.A0G;
        boolean z2 = c6c9.A0P;
        String str2 = c6c9.A0H;
        boolean z3 = c6c9.A0Q;
        boolean z4 = c6c9.A0R;
        C67s c67s = c6c9.A0A;
        if (c67s != null) {
            C1DS.A00(userSession);
        } else {
            c67s = null;
        }
        int i2 = c6c9.A01;
        AnonymousClass688 anonymousClass6882 = c6c9.A07;
        if (anonymousClass6882 != null) {
            C111074zO Ext = anonymousClass6882.A00.Ext();
            List<NoteEmojiReactionInfoIntf> list3 = anonymousClass6882.A01;
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list3, 10));
            for (NoteEmojiReactionInfoIntf noteEmojiReactionInfoIntf : list3) {
                String emoji = noteEmojiReactionInfoIntf.getEmoji();
                arrayList.add(new NoteEmojiReactionInfo(noteEmojiReactionInfoIntf.Bkj(), noteEmojiReactionInfoIntf.CDj(), noteEmojiReactionInfoIntf.Cf9(), emoji));
            }
            anonymousClass688 = new AnonymousClass688(Ext, arrayList);
        } else {
            anonymousClass688 = null;
        }
        List<NoteEmojiReactionInfoIntf> list4 = c6c9.A0N;
        ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(list4, 10));
        for (NoteEmojiReactionInfoIntf noteEmojiReactionInfoIntf2 : list4) {
            String emoji2 = noteEmojiReactionInfoIntf2.getEmoji();
            arrayList2.add(new NoteEmojiReactionInfo(noteEmojiReactionInfoIntf2.Bkj(), noteEmojiReactionInfoIntf2.CDj(), noteEmojiReactionInfoIntf2.Cf9(), emoji2));
        }
        C68B c68b = c6c9.A09;
        if (c68b != null) {
            C1DS.A00(userSession);
        } else {
            c68b = null;
        }
        User user = c6c9.A0C;
        String str3 = c6c9.A0I;
        String str4 = c6c9.A0J;
        Boolean bool = c6c9.A0E;
        User user2 = c6c9.A0D;
        String str5 = c6c9.A0K;
        AnonymousClass689 anonymousClass689 = c6c9.A04;
        if (anonymousClass689 != null) {
            C1DS.A00(userSession);
        } else {
            anonymousClass689 = null;
        }
        return new C6C9(anonymousClass689, noteBackgroundColor, noteCustomThemeImpl2, anonymousClass688, noteFontStyle, c68b, c67s, null, user, user2, bool, num, str, str2, str3, str4, str5, list, list2, arrayList2, i, i2, j, j2, z, z2, z3, z4);
    }

    public static final String A06(NoteStyle noteStyle) {
        switch (noteStyle.ordinal()) {
            case 1:
                return "text";
            case 2:
                return "music";
            case 3:
            case 4:
            default:
                return "unknown";
            case 5:
                return "location";
            case 6:
                return "live";
            case 7:
                return "empty";
            case 8:
                return "prompt";
            case 9:
                return "note_chat";
            case 10:
                return "listening_now";
            case 11:
                return "gif";
        }
    }
}
