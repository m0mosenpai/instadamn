package com.instagram.direct.inbox.notes;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C1JX;
import X.C45822KQb;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.inbox.notes.NotesRepository$createNoteEmojiReaction$1", f = "NotesRepository.kt", i = {}, l = {993}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class NotesRepository$createNoteEmojiReaction$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ NotesRepository A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotesRepository$createNoteEmojiReaction$1(NotesRepository notesRepository, String str, String str2, InterfaceC23621Ds interfaceC23621Ds, long j) {
        super(2, interfaceC23621Ds);
        this.A02 = notesRepository;
        this.A01 = j;
        this.A03 = str;
        this.A04 = str2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new NotesRepository$createNoteEmojiReaction$1(this.A02, this.A03, this.A04, interfaceC23621Ds, this.A01);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            NotesRepository notesRepository = this.A02;
            C45822KQb c45822KQb = new C45822KQb(notesRepository.A0C, notesRepository, this.A03, this.A04, this.A01);
            this.A00 = 1;
            if (c45822KQb.A05(this) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NotesRepository$createNoteEmojiReaction$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
