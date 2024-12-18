package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.android.maps.model.LatLng;
import com.facebook.location.platform.api.Location;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.NoteBackgroundColor;
import com.instagram.api.schemas.NoteFontStyle;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.direct.inbox.notes.models.NoteStyle;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class LLE {
    public static final C45128JyU A02(Jx8 jx8) {
        C14360o3.A0B(jx8, 0);
        String str = jx8.A09;
        LatLng latLng = jx8.A02;
        C4F5 c4f5 = jx8.A03;
        User user = jx8.A04;
        long j = jx8.A01;
        String str2 = jx8.A08;
        boolean z = jx8.A0D;
        boolean z2 = jx8.A0E;
        boolean z3 = jx8.A0F;
        boolean z4 = jx8.A0A;
        int i = jx8.A00;
        String str3 = jx8.A07;
        boolean z5 = jx8.A0B;
        boolean z6 = jx8.A0C;
        boolean z7 = jx8.A0G;
        return new C45128JyU(latLng, c4f5, user, jx8.A05, str, str2, str3, jx8.A06, i, j, z, z2, z3, z4, false, z5, z6, z7, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static final C92984Et A05(UserSession userSession, Qi8 qi8) {
        EnumC92974Es enumC92974Es;
        int i;
        int i2;
        ?? r14;
        int i3;
        ?? r15;
        ImmutableList optionalCompactedTreeListField;
        String obj = qi8.getRequiredEnumField(0, "last_active_location_audience", EnumC46237KdD.UNSET_OR_UNRECOGNIZED_ENUM_VALUE).toString();
        EnumC92974Es[] values = EnumC92974Es.values();
        int length = values.length;
        int i4 = 0;
        while (true) {
            if (i4 < length) {
                enumC92974Es = values[i4];
                if (C14360o3.A0K(enumC92974Es.A00, obj)) {
                    break;
                }
                i4++;
            } else {
                enumC92974Es = EnumC92974Es.A0A;
                break;
            }
        }
        long requiredIntField = qi8.getRequiredIntField(1, "friend_map_last_seen_timestamp");
        C2JS A04 = qi8.A04(Qi3.class, "allowlist", -24372901);
        if (A04 != null) {
            i = A04.getRequiredIntField(0, "num_users");
        } else {
            i = 0;
        }
        C2JS optionalTreeField = qi8.getOptionalTreeField(3, "blocklist", Qi4.class, 734045612);
        if (optionalTreeField != null) {
            i2 = optionalTreeField.getRequiredIntField(0, "num_users");
        } else {
            i2 = 0;
        }
        C2JS optionalTreeField2 = qi8.getOptionalTreeField(4, "mutuals_checkup_info", Qi7.class, -147181074);
        if (optionalTreeField2 != null && (optionalCompactedTreeListField = optionalTreeField2.getOptionalCompactedTreeListField(0, "recent_mutual_users", Qi6.class, -1287974290)) != null) {
            r14 = AbstractC167017dG.A0q(optionalCompactedTreeListField);
            Iterator it = optionalCompactedTreeListField.iterator();
            while (it.hasNext()) {
                r14.add(((C67541Unf) AbstractC25225BEi.A0l(it).reinterpretRequired(0, C67541Unf.class, -508424204)).A0E(C1DS.A00(userSession)));
            }
        } else {
            r14 = C16930sl.A00;
        }
        C2JS optionalTreeField3 = qi8.getOptionalTreeField(4, "mutuals_checkup_info", Qi7.class, -147181074);
        if (optionalTreeField3 != null) {
            i3 = optionalTreeField3.getCoercedIntField(1, "other_mutuals_count");
        } else {
            i3 = 0;
        }
        ImmutableList optionalCompactedTreeListField2 = qi8.getOptionalCompactedTreeListField(5, "hidden_locations", Qi5.class, 312454470);
        if (optionalCompactedTreeListField2 != null) {
            r15 = AbstractC166987dD.A1E();
            Iterator it2 = optionalCompactedTreeListField2.iterator();
            while (it2.hasNext()) {
                C66993Uee c66993Uee = (C66993Uee) AbstractC25225BEi.A0l(it2).reinterpretRequired(0, C66993Uee.class, -1976689303);
                C14360o3.A07(c66993Uee);
                C45044JwZ A01 = A01(c66993Uee);
                if (A01 != null) {
                    r15.add(A01);
                }
            }
        } else {
            r15 = C16930sl.A00;
        }
        return new C92984Et(enumC92974Es, r14, r15, i, i2, i3, requiredIntField, false);
    }

    public static final List A06(List list) {
        C14360o3.A0B(list, 0);
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(A02((Jx8) it.next()));
        }
        return A0q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x009e, code lost:
    
        if (r1 == null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C4F5 A00(X.C6C9 r35, com.instagram.common.session.UserSession r36) {
        /*
            r24 = 0
            r5 = 1
            r3 = r35
            com.instagram.user.model.User r8 = r3.A0D
            java.util.ArrayList r2 = X.AbstractC166987dD.A1E()
            int r0 = r3.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.util.Map r0 = com.instagram.direct.inbox.notes.models.NoteStyle.A01
            java.lang.Object r0 = r0.get(r1)
            com.instagram.direct.inbox.notes.models.NoteStyle r0 = (com.instagram.direct.inbox.notes.models.NoteStyle) r0
            if (r0 != 0) goto L1d
            com.instagram.direct.inbox.notes.models.NoteStyle r0 = com.instagram.direct.inbox.notes.models.NoteStyle.A0E
        L1d:
            int r4 = r0.ordinal()
            if (r4 == r5) goto Lb0
            r1 = 2
            if (r4 == r1) goto Laa
            r0 = 5
            if (r4 == r0) goto La4
            r0 = 7
            if (r4 == r0) goto La3
            r0 = 4
            if (r4 != r0) goto L37
            X.K2O r0 = new X.K2O
            r0.<init>(r3)
        L34:
            r2.add(r0)
        L37:
            r0 = r36
            java.lang.String r14 = X.AbstractC43649JSh.A01(r0, r8)
            X.67s r1 = r3.A0A
            r4 = 0
            if (r1 == 0) goto L9d
            X.67x r0 = r1.A09
            if (r0 == 0) goto L9d
            com.instagram.api.schemas.NotePogVideoDict r6 = r0.A01
        L48:
            X.67x r0 = r1.A09
            if (r0 == 0) goto La1
            com.instagram.api.schemas.NotePogImageDict r5 = r0.A00
        L4e:
            java.util.List r0 = r3.A0N
            java.lang.Object r0 = X.AbstractC001800i.A0J(r0)
            com.instagram.api.schemas.NoteEmojiReactionInfo r0 = (com.instagram.api.schemas.NoteEmojiReactionInfo) r0
            if (r0 == 0) goto L9b
            java.lang.String r1 = r0.A03
        L5a:
            int r0 = r3.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.instagram.direct.inbox.notes.models.NoteAudience r7 = X.BFV.A00(r0)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r24)
            X.4F5 r3 = new X.4F5
            r10 = r4
            r11 = r4
            r12 = r4
            r13 = r4
            r15 = r4
            r16 = r4
            r18 = r2
            r19 = r4
            r20 = r4
            r21 = r4
            r22 = r4
            r23 = r4
            r25 = r24
            r26 = r24
            r27 = r24
            r28 = r24
            r29 = r24
            r30 = r24
            r31 = r24
            r32 = r24
            r33 = r24
            r34 = r24
            r35 = r24
            r36 = r24
            r17 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            return r3
        L9b:
            r1 = r4
            goto L5a
        L9d:
            r6 = r4
            if (r1 == 0) goto La1
            goto L48
        La1:
            r5 = r4
            goto L4e
        La3:
            r1 = 6
        La4:
            X.9BI r0 = new X.9BI
            r0.<init>(r3, r1)
            goto L34
        Laa:
            X.JSe r0 = new X.JSe
            r0.<init>(r3)
            goto L34
        Lb0:
            X.JSm r0 = new X.JSm
            r0.<init>(r3)
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LLE.A00(X.6C9, com.instagram.common.session.UserSession):X.4F5");
    }

    public static final C45044JwZ A01(C66993Uee c66993Uee) {
        String A07 = c66993Uee.A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        if (A07 != null) {
            String A08 = c66993Uee.A08(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            if (A08 == null) {
                A08 = "";
            }
            return new C45044JwZ(A07, A08, c66993Uee.getCoercedDoubleField(2, Location.LATITUDE), c66993Uee.getCoercedDoubleField(3, "longitude"), c66993Uee.getCoercedIntField(4, "radius"));
        }
        return null;
    }

    public static final Jx8 A03(C45119Jxo c45119Jxo, UserSession userSession) {
        C45103JxX c45103JxX;
        Integer num;
        int i = ((NoteAudience) c45119Jxo.A01).A00;
        NoteBackgroundColor noteBackgroundColor = NoteBackgroundColor.A09;
        NoteFontStyle noteFontStyle = NoteFontStyle.A05;
        C45099JxT c45099JxT = (C45099JxT) c45119Jxo.A02;
        C67s A01 = AbstractC92944En.A01(userSession, c45099JxT, null, (List) c45119Jxo.A04);
        int i2 = ((NoteStyle) c45119Jxo.A05).A00;
        String str = c45119Jxo.A06;
        User A10 = AbstractC166987dD.A10(userSession);
        String str2 = userSession.userId;
        C16930sl c16930sl = C16930sl.A00;
        C6C9 c6c9 = new C6C9(null, noteBackgroundColor, null, null, noteFontStyle, null, A01, null, null, A10, false, AbstractC25227BEk.A0o(), null, "0", null, str, str2, c16930sl, null, c16930sl, i, i2, -1L, -1L, false, false, false, false);
        if (c45099JxT == null || (c45103JxX = c45099JxT.A02) == null) {
            return null;
        }
        LatLng latLng = new LatLng(c45103JxX.A00, c45103JxX.A01);
        C4F5 A00 = A00(c6c9, userSession);
        User A0Y = AbstractC166997dE.A0Y(userSession);
        long A06 = AbstractC31177DnL.A06();
        boolean z = c45119Jxo.A07;
        if (AbstractC166997dE.A1Z(c45103JxX.A03, true)) {
            num = C05F.A00;
        } else {
            num = C05F.A0C;
        }
        return new Jx8(latLng, A00, A0Y, num, "CREATION_PIN_ID", "0", null, null, Integer.MAX_VALUE, A06, false, false, false, true, false, false, z);
    }

    public static final Jx8 A04(UserSession userSession, LYO lyo) {
        String str;
        InterfaceC1347767n interfaceC1347767n;
        C6C9 c6c9 = lyo.A01;
        C67s c67s = c6c9.A0A;
        if (c67s == null || (interfaceC1347767n = c67s.A0A) == null || (str = interfaceC1347767n.Bfe()) == null) {
            str = "OPTIMISTIC_PRESENCE_ID";
        }
        String str2 = c6c9.A0H;
        C45103JxX c45103JxX = lyo.A00;
        LatLng latLng = new LatLng(c45103JxX.A00, c45103JxX.A01);
        C4F5 A00 = A00(c6c9, userSession);
        User A10 = AbstractC166987dD.A10(userSession);
        long A06 = AbstractC31177DnL.A06();
        Integer num = lyo.A02;
        Integer num2 = C05F.A00;
        boolean A1X = AbstractC167007dF.A1X(num, num2);
        if (!AbstractC166997dE.A1Z(c45103JxX.A03, true)) {
            num2 = C05F.A0C;
        }
        return new Jx8(latLng, A00, A10, num2, str, str2, null, null, Integer.MAX_VALUE, A06, A1X, false, true, false, false, false, false);
    }
}
