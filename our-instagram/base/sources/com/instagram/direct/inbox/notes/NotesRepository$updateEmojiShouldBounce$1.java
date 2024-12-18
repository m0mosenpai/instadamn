package com.instagram.direct.inbox.notes;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.inbox.notes.NotesRepository$updateEmojiShouldBounce$1", f = "NotesRepository.kt", i = {}, l = {1884, 1888}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class NotesRepository$updateEmojiShouldBounce$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ NotesRepository A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotesRepository$updateEmojiShouldBounce$1(NotesRepository notesRepository, String str, String str2, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A03 = str;
        this.A01 = notesRepository;
        this.A02 = str2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new NotesRepository$updateEmojiShouldBounce$1(this.A01, this.A03, this.A02, interfaceC23621Ds);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0052 A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.1JX r4 = X.C1JX.A02
            int r0 = r9.A00
            r7 = 2
            r5 = 1
            if (r0 == 0) goto Le
            X.AbstractC09560e7.A00(r10)
        Lb:
            X.0eB r4 = X.C0eB.A00
            return r4
        Le:
            X.AbstractC09560e7.A00(r10)
            java.lang.String r1 = r9.A03
            r6 = 0
            com.instagram.direct.inbox.notes.NotesRepository r8 = r9.A01
            if (r1 == 0) goto L53
            X.05A r0 = r8.A0Z
            X.Jwh r0 = X.AbstractC43594JPz.A0W(r1, r0)
            if (r0 == 0) goto Lb
            java.util.List r0 = r0.A05
            if (r0 == 0) goto Lb
            java.lang.String r3 = r9.A02
            java.util.Iterator r2 = r0.iterator()
        L2a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r1 = r2.next()
            boolean r0 = X.AbstractC43592JPx.A1Z(r1, r3)
            if (r0 == 0) goto L2a
            r6 = r1
        L3b:
            X.6C9 r6 = (X.C6C9) r6
            if (r6 == 0) goto Lb
            X.0Ui r3 = r8.A0L
            java.lang.String r1 = r6.A0H
            r0 = 11
            X.MtP r2 = new X.MtP
            r2.<init>(r1, r5, r0)
            r9.A00 = r5
        L4c:
            java.lang.Object r0 = r3.emit(r2, r9)
            if (r0 != r4) goto Lb
            return r4
        L53:
            X.05A r0 = r8.A0X
            java.lang.Iterable r0 = X.AbstractC31172DnG.A0w(r0)
            java.lang.String r3 = r9.A02
            java.util.Iterator r2 = r0.iterator()
        L5f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L70
            java.lang.Object r1 = r2.next()
            boolean r0 = X.AbstractC43592JPx.A1Z(r1, r3)
            if (r0 == 0) goto L5f
            r6 = r1
        L70:
            X.6C9 r6 = (X.C6C9) r6
            if (r6 == 0) goto Lb
            X.0Ui r3 = r8.A0L
            java.lang.String r1 = r6.A0H
            r0 = 11
            X.MtP r2 = new X.MtP
            r2.<init>(r1, r5, r0)
            r9.A00 = r7
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.inbox.notes.NotesRepository$updateEmojiShouldBounce$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NotesRepository$updateEmojiShouldBounce$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
