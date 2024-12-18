package X;

/* renamed from: X.Lhd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48770Lhd implements InterfaceC50427MOh {
    public final /* synthetic */ C45487KCc A00;

    public C48770Lhd(C45487KCc c45487KCc) {
        this.A00 = c45487KCc;
    }

    @Override // X.InterfaceC50427MOh
    public final void DK3(double d, long j) {
        String str;
        C45487KCc c45487KCc = this.A00;
        C135976Dc A0V = AbstractC43594JPz.A0V(c45487KCc.A0i);
        if (AbstractC167007dF.A1Z(c45487KCc.A0g)) {
            str = "ig_friend_map";
        } else {
            str = "note_quick_reply_sheet";
        }
        Long l = c45487KCc.A0Z;
        Long l2 = null;
        if (l != null) {
            long longValue = l.longValue();
            LLB llb = c45487KCc.A0Q;
            if (llb == null) {
                C14360o3.A0F("notesReplyComposerBarController");
                throw C00O.createAndThrow();
            }
            Long l3 = llb.A0E;
            if (l3 != null) {
                l2 = Long.valueOf(l3.longValue() - longValue);
            }
        }
        A0V.A0S(l2, str, d, j, c45487KCc.A0b);
    }
}
