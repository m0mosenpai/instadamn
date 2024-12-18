package com.instagram.direct.inbox.notes;

import X.AbstractC166987dD;
import X.AbstractC25234BEr;
import X.AbstractC43594JPz;
import X.C14360o3;
import X.C18A;
import X.C19L;
import X.C45099JxT;
import X.C45103JxX;
import X.C6C9;
import X.L6J;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.direct.inbox.notes.models.NoteCreationSource;
import com.instagram.direct.inbox.notes.models.NoteStyle;
import java.util.List;

/* loaded from: classes8.dex */
public final class GraphqlOptimisticPostOperation extends OptimisticNetworkOperation {
    public C6C9 A00;
    public C6C9 A01;
    public boolean A02;
    public final Context A03;
    public final C45103JxX A04;
    public final UserSession A05;
    public final NotesRepository A06;
    public final NoteAudience A07;
    public final C45099JxT A08;
    public final NoteStyle A09;
    public final C18A A0A;
    public final String A0B;
    public final String A0C;
    public final List A0D;
    public final List A0E;
    public final C19L A0F;
    public final int A0G;
    public final NotesApi A0H;
    public final L6J A0I;
    public final boolean A0J;

    /* JADX WARN: Code restructure failed: missing block: B:218:0x055f, code lost:
    
        if (r7 != r2) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.3Du, X.3Dw] */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v5, types: [X.3o9, X.5Kb] */
    /* JADX WARN: Type inference failed for: r20v9 */
    /* JADX WARN: Type inference failed for: r9v20, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v28, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // com.instagram.direct.inbox.notes.OptimisticNetworkOperation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(com.instagram.direct.inbox.notes.NotesApi r35, java.util.List r36, X.InterfaceC23621Ds r37) {
        /*
            Method dump skipped, instructions count: 1499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.inbox.notes.GraphqlOptimisticPostOperation.A02(com.instagram.direct.inbox.notes.NotesApi, java.util.List, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphqlOptimisticPostOperation(Context context, UserSession userSession, NotesApi notesApi, NotesRepository notesRepository, NoteAudience noteAudience, C45099JxT c45099JxT, NoteCreationSource noteCreationSource, NoteStyle noteStyle, C18A c18a, String str, String str2, List list, C19L c19l, int i, boolean z) {
        super(notesApi);
        C45103JxX c45103JxX;
        AbstractC43594JPz.A1P(notesApi, c18a);
        C14360o3.A0B(c19l, 7);
        AbstractC25234BEr.A0l(8, str, noteAudience, noteStyle, noteCreationSource);
        C14360o3.A0B(list, 14);
        this.A0G = i;
        this.A0H = notesApi;
        this.A06 = notesRepository;
        this.A0A = c18a;
        this.A05 = userSession;
        this.A03 = context;
        this.A0F = c19l;
        this.A0C = str;
        this.A07 = noteAudience;
        this.A09 = noteStyle;
        this.A08 = c45099JxT;
        this.A0B = str2;
        this.A0E = list;
        this.A0J = z;
        this.A02 = true;
        this.A0D = AbstractC166987dD.A1E();
        this.A0I = new L6J(context, userSession);
        if (c45099JxT != null) {
            c45103JxX = c45099JxT.A02;
        } else {
            c45103JxX = null;
        }
        this.A04 = c45103JxX;
    }
}
