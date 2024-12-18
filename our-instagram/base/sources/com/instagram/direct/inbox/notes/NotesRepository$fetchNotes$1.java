package com.instagram.direct.inbox.notes;

import X.AbstractC09560e7;
import X.AbstractC23611Dp;
import X.C006802i;
import X.C0eB;
import X.C14360o3;
import X.C1JX;
import X.C4AA;
import X.InterfaceC06180Ui;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.inbox.notes.NotesRepository$fetchNotes$1", f = "NotesRepository.kt", i = {}, l = {303, 305}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class NotesRepository$fetchNotes$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ NotesRepository A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotesRepository$fetchNotes$1(NotesRepository notesRepository, Integer num, InterfaceC23621Ds interfaceC23621Ds, boolean z, boolean z2) {
        super(2, interfaceC23621Ds);
        this.A04 = z;
        this.A03 = z2;
        this.A01 = notesRepository;
        this.A02 = num;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new NotesRepository$fetchNotes$1(this.A01, this.A02, interfaceC23621Ds, this.A04, this.A03);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NotesRepository$fetchNotes$1) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        String str;
        C1JX c1jx = C1JX.A02;
        int i = this.A00;
        if (i != 0) {
            if (i != 1) {
                AbstractC09560e7.A00(obj);
                return C0eB.A00;
            }
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            InterfaceC06180Ui interfaceC06180Ui = this.A01.A0N;
            this.A00 = 1;
            if (interfaceC06180Ui.emit(true, this) == c1jx) {
                return c1jx;
            }
        }
        NotesRepository notesRepository = this.A01;
        C4AA c4aa = notesRepository.A0D;
        Integer num = this.A02;
        C14360o3.A0B(num, 0);
        C006802i c006802i = c4aa.A00;
        c006802i.markerStart(275915771);
        c006802i.markerPoint(275915771, "notes_fetch_server_attempt");
        switch (num.intValue()) {
            case 1:
                str = "note_deleted";
                break;
            case 2:
                str = "note_muted";
                break;
            case 3:
                str = "user_restricted";
                break;
            case 4:
                str = "ptr";
                break;
            case 5:
                str = "inbox_foreground";
                break;
            case 6:
                str = "cold_start";
                break;
            case 7:
                str = "prompts_sheet";
                break;
            case 8:
                str = "quick_reply_sheet";
                break;
            case 9:
                str = "self_note_sheet";
                break;
            case 10:
                str = "other";
                break;
            case 11:
                str = "mc_updated_value_to_true";
                break;
            default:
                str = "inbox_rendered";
                break;
        }
        c006802i.markerAnnotate(275915771, "fetch_reason", str);
        boolean z = this.A04;
        this.A00 = 2;
        if (notesRepository.A0B(this, z) == c1jx) {
            return c1jx;
        }
        return C0eB.A00;
    }
}
