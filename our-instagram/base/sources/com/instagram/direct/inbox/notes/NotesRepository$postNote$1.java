package com.instagram.direct.inbox.notes;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AnonymousClass001;
import X.C0eB;
import X.C18A;
import X.C19L;
import X.C1JX;
import X.C45099JxT;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.MUD;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.direct.inbox.notes.models.NoteCreationSource;
import com.instagram.direct.inbox.notes.models.NoteStyle;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.inbox.notes.NotesRepository$postNote$1", f = "NotesRepository.kt", i = {}, l = {895}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class NotesRepository$postNote$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ NotesRepository A03;
    public final /* synthetic */ NoteAudience A04;
    public final /* synthetic */ C45099JxT A05;
    public final /* synthetic */ NoteCreationSource A06;
    public final /* synthetic */ NoteStyle A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ List A09;
    public final /* synthetic */ boolean A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotesRepository$postNote$1(NotesRepository notesRepository, NoteAudience noteAudience, C45099JxT c45099JxT, NoteCreationSource noteCreationSource, NoteStyle noteStyle, String str, List list, InterfaceC23621Ds interfaceC23621Ds, int i, boolean z) {
        super(2, interfaceC23621Ds);
        this.A02 = i;
        this.A03 = notesRepository;
        this.A08 = str;
        this.A04 = noteAudience;
        this.A07 = noteStyle;
        this.A06 = noteCreationSource;
        this.A05 = c45099JxT;
        this.A09 = list;
        this.A0A = z;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        int i = this.A02;
        NotesRepository notesRepository = this.A03;
        String str = this.A08;
        NoteAudience noteAudience = this.A04;
        NoteStyle noteStyle = this.A07;
        NotesRepository$postNote$1 notesRepository$postNote$1 = new NotesRepository$postNote$1(notesRepository, noteAudience, this.A05, this.A06, noteStyle, str, this.A09, interfaceC23621Ds, i, this.A0A);
        notesRepository$postNote$1.A01 = obj;
        return notesRepository$postNote$1;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        MUD mud;
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            C19L c19l = (C19L) this.A01;
            int i = this.A02;
            NotesRepository notesRepository = this.A03;
            NotesApi notesApi = notesRepository.A0C;
            C18A c18a = notesRepository.A0G;
            UserSession userSession = notesRepository.A0B;
            Context context = notesRepository.A0A;
            String str = this.A08;
            NoteAudience noteAudience = this.A04;
            NoteStyle noteStyle = this.A07;
            NoteCreationSource noteCreationSource = this.A06;
            C45099JxT c45099JxT = this.A05;
            String str2 = null;
            if (c45099JxT != null && (mud = c45099JxT.A07) != null && (str2 = mud.A01) == null) {
                int i2 = notesRepository.A00;
                notesRepository.A00 = i2 + 1;
                str2 = AnonymousClass001.A0O("1_", i2);
            }
            GraphqlOptimisticPostOperation graphqlOptimisticPostOperation = new GraphqlOptimisticPostOperation(context, userSession, notesApi, notesRepository, noteAudience, c45099JxT, noteCreationSource, noteStyle, c18a, str, str2, this.A09, c19l, i, this.A0A);
            this.A00 = 1;
            if (graphqlOptimisticPostOperation.A05(this) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NotesRepository$postNote$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
