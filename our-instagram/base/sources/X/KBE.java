package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.direct.inbox.notes.models.NoteAudienceItem;
import com.instagram.direct.inbox.notes.ui.NoteAvatarView;

/* loaded from: classes8.dex */
public final class KBE extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "InvitedToCollabNoteBottomSheetFragment";
    public View A00;
    public C6C9 A01;
    public NoteAudienceItem A02;
    public C4F7 A03;
    public IgTextView A04;
    public IgTextView A05;
    public IgTextView A06;
    public NoteAvatarView A07;
    public final InterfaceC09390do A09 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A08 = AbstractC25225BEi.A0a(new MHM(this, 4), new MHM(this, 3), new C50170MDx(36, null, this), AbstractC25225BEi.A1D(C44524JmU.class));

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "note_invited_to_collab_note_bottom_sheet";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C0UO c0uo = ((C44524JmU) this.A08.getValue()).A03;
        JRY jry = new JRY(this, 42);
        AbstractC166987dD.A1Z(new MCI(c0uo, jry, this, null, 40), AbstractC25229BEm.A0a(this));
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A09);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00f9  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r16, android.view.ViewGroup r17, android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KBE.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
