package com.instagram.direct.inbox.notes.reply;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C14360o3;
import X.C45052Jwh;
import X.C6C9;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.Jn3;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.inbox.notes.reply.NoteReplyViewModel$setNoteIdForPromptResponseReply$1", f = "NoteReplyViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class NoteReplyViewModel$setNoteIdForPromptResponseReply$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public /* synthetic */ Object A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ Jn3 A02;
    public final /* synthetic */ String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteReplyViewModel$setNoteIdForPromptResponseReply$1(Jn3 jn3, String str, InterfaceC23621Ds interfaceC23621Ds, long j) {
        super(2, interfaceC23621Ds);
        this.A03 = str;
        this.A02 = jn3;
        this.A01 = j;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        NoteReplyViewModel$setNoteIdForPromptResponseReply$1 noteReplyViewModel$setNoteIdForPromptResponseReply$1 = new NoteReplyViewModel$setNoteIdForPromptResponseReply$1(this.A02, this.A03, interfaceC23621Ds, this.A01);
        noteReplyViewModel$setNoteIdForPromptResponseReply$1.A00 = obj;
        return noteReplyViewModel$setNoteIdForPromptResponseReply$1;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NoteReplyViewModel$setNoteIdForPromptResponseReply$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        List list;
        Object obj2;
        AbstractC09560e7.A00(obj);
        C45052Jwh c45052Jwh = (C45052Jwh) ((Map) this.A00).get(this.A03);
        if (c45052Jwh != null && (list = c45052Jwh.A05) != null) {
            long j = this.A01;
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (C14360o3.A0K(((C6C9) obj2).A0H, String.valueOf(j))) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            C6C9 c6c9 = (C6C9) obj2;
            if (c6c9 != null) {
                Jn3.A02(c6c9, this.A02);
                return C0eB.A00;
            }
        }
        Jn3.A03(this.A02);
        return C0eB.A00;
    }
}
