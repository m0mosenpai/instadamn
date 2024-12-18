package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.modal.ModalActivity;

/* renamed from: X.LhW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48763LhW implements MRK {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ ContentNoteMetadata A03;
    public final /* synthetic */ C45216Jzw A04;
    public final /* synthetic */ C47364KwD A05;
    public final /* synthetic */ C4F7 A06;
    public final /* synthetic */ boolean A07;

    @Override // X.MRK
    public final void Chq(String str) {
        Bundle bundle;
        C14360o3.A0B(str, 0);
        UserSession userSession = this.A02;
        C1VW c1vw = C1VW.A00;
        if (c1vw != null) {
            c1vw.getFragmentFactory();
            bundle = AbstractC166987dD.A0b();
            bundle.putString("LocationFeedFragment.ARGUMENT_LOCATION_VENUE_ID", str);
        } else {
            bundle = null;
        }
        AbstractC25228BEl.A1G(this.A00, bundle, userSession, ModalActivity.class, "location_feed");
    }

    @Override // X.MRK
    public final void Cs1(String str) {
        C14360o3.A0B(str, 0);
        LKo lKo = LKo.A00;
        UserSession userSession = this.A02;
        lKo.A06(this.A00, EnumC25577BSp.REPLY_SHEET, this.A01, userSession, this.A03, str, true);
    }

    public C48763LhW(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, ContentNoteMetadata contentNoteMetadata, C45216Jzw c45216Jzw, C47364KwD c47364KwD, C4F7 c4f7, boolean z) {
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A01 = interfaceC11380iw;
        this.A04 = c45216Jzw;
        this.A03 = contentNoteMetadata;
        this.A07 = z;
        this.A06 = c4f7;
        this.A05 = c47364KwD;
    }

    @Override // X.MRK
    public final void Cqq() {
        LKo.A00.A04(this.A00, this.A01, this.A02, this.A04.A02.getId(), AbstractC167007dF.A1W(this.A03));
    }

    @Override // X.MRK
    public final void D01() {
        C47364KwD c47364KwD = this.A05;
        if (c47364KwD != null) {
            c47364KwD.A00.A05.D01();
        }
    }

    @Override // X.MRK
    public final boolean DW1() {
        return false;
    }

    @Override // X.MRK
    public final void Dvw(Bundle bundle) {
        AbstractC31177DnL.A0n(this.A00, bundle, this.A02, ModalActivity.class, "notes_creation");
    }

    @Override // X.MRK
    public final void E2o(ImageUrl imageUrl, ContentNoteMetadata contentNoteMetadata, NoteAudience noteAudience, String str, String str2, String str3, long j, boolean z) {
        String str4;
        AbstractC167027dH.A13(noteAudience, str, str2);
        C14360o3.A0B(str3, 5);
        LKo lKo = LKo.A00;
        UserSession userSession = this.A02;
        FragmentActivity fragmentActivity = this.A00;
        boolean z2 = this.A07;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        C4F7 c4f7 = this.A06;
        if (contentNoteMetadata != null) {
            str4 = contentNoteMetadata.A08;
        } else {
            str4 = null;
        }
        lKo.A07(fragmentActivity, interfaceC11380iw, userSession, imageUrl, contentNoteMetadata, c4f7, null, str, str2, j, z2, z, JY1.A07(userSession, str4));
    }

    @Override // X.MRK
    public final void FDR() {
        LKo.A00.A04(this.A00, this.A01, this.A02, this.A04.A02.getId(), AbstractC167007dF.A1W(this.A03));
    }
}
