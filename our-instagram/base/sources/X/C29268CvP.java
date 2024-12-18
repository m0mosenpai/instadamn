package X;

import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.CvP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29268CvP implements C4F7 {
    public final /* synthetic */ ContentNoteMetadata A00;
    public final /* synthetic */ C27823COm A01;
    public final /* synthetic */ User A02;
    public final /* synthetic */ String A03;

    @Override // X.C4F7
    public final void AMe(long j, String str) {
    }

    @Override // X.C4F7
    public final int BXK() {
        return 1;
    }

    @Override // X.C4F7
    public final void Cn6(String str) {
    }

    @Override // X.C4F7
    public final void Cn7(String str, String str2) {
    }

    @Override // X.C4F7
    public final void D5l(String str, String str2, List list, List list2, int i, long j) {
    }

    @Override // X.C4F7
    public final void D5m(String str, String str2, List list, List list2, int i, long j) {
    }

    @Override // X.C4F7
    public final void DVz(String str, String str2) {
    }

    @Override // X.C4F7
    public final void DcD() {
    }

    @Override // X.C4F7
    public final void DcE(long j) {
    }

    @Override // X.C4F7
    public final void ECp(Integer num) {
        C14360o3.A0B(num, 0);
        AbstractC25651Mw.A00(this.A01.A00).E4s(new C70063Cq(this.A02, false, false, true, false));
    }

    public C29268CvP(ContentNoteMetadata contentNoteMetadata, C27823COm c27823COm, User user, String str) {
        this.A01 = c27823COm;
        this.A00 = contentNoteMetadata;
        this.A03 = str;
        this.A02 = user;
    }

    @Override // X.C4F7
    public final void AOh(long j) {
        UserSession userSession = this.A01.A00;
        ContentNoteMetadata contentNoteMetadata = this.A00;
        String str = contentNoteMetadata.A08;
        String str2 = contentNoteMetadata.A04;
        String str3 = contentNoteMetadata.A0A;
        AbstractC27605CGb.A00(userSession, new C29201Cu6(contentNoteMetadata.A05, contentNoteMetadata.A02), str, str2, contentNoteMetadata.A06, str3, this.A03, j);
    }
}
