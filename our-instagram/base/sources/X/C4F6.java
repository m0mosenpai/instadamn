package X;

import com.instagram.direct.inbox.notes.NotesRepository;
import java.util.List;
import java.util.Map;

/* renamed from: X.4F6, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4F6 implements C4F7 {
    public final /* synthetic */ C92874Ed A00;
    public final /* synthetic */ C4FT A01;

    @Override // X.C4F7
    public final void Cn7(String str, String str2) {
        C14360o3.A0B(str, 0);
        this.A00.A03.A0Q(str, str2);
    }

    @Override // X.C4F7
    public final void D5l(String str, String str2, List list, List list2, int i, long j) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 3);
        NotesRepository notesRepository = this.A00.A03;
        AnonymousClass195 anonymousClass195 = notesRepository.A09;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        C19L c19l = ((C4A7) notesRepository).A01;
        notesRepository.A09 = AbstractC23641Du.A04(AnonymousClass191.A00, new PXx(notesRepository, list2, list, str2, null, i, 0, j), c19l);
    }

    @Override // X.C4F7
    public final void D5m(String str, String str2, List list, List list2, int i, long j) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 3);
        NotesRepository notesRepository = this.A00.A03;
        AnonymousClass195 anonymousClass195 = notesRepository.A09;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        C19L c19l = ((C4A7) notesRepository).A01;
        notesRepository.A09 = AbstractC23641Du.A04(AnonymousClass191.A00, new PXx(notesRepository, list2, list, str2, null, i, 1, j), c19l);
    }

    @Override // X.C4F7
    public final void DVz(String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        C92874Ed c92874Ed = this.A00;
        C4F0 c4f0 = c92874Ed.A02;
        if (!C14360o3.A0K(((Map) c4f0.A05.getValue()).get(str2), true)) {
            c4f0.A02(EnumC25577BSp.DOUBLE_CLICK, null, null, str, str2, c92874Ed.A07, null, null, null);
        }
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
        C4FT c4ft = this.A01;
        if (c4ft != null) {
            c4ft.A00();
        }
        this.A00.A05(num, new RunnableC49955M3w(c4ft, num), true);
    }

    public C4F6(C92874Ed c92874Ed, C4FT c4ft) {
        this.A00 = c92874Ed;
        this.A01 = c4ft;
    }

    @Override // X.C4F7
    public final void AMe(long j, String str) {
        C14360o3.A0B("❤️", 1);
        this.A00.A02(j);
    }

    @Override // X.C4F7
    public final void AOh(long j) {
        C92874Ed c92874Ed = this.A00;
        if (j != 0) {
            c92874Ed.A03.A0F(j, null);
        }
    }

    @Override // X.C4F7
    public final int BXK() {
        C92874Ed c92874Ed = this.A00;
        return c92874Ed.A03.A05(c92874Ed.A01.userId);
    }

    @Override // X.C4F7
    public final void Cn6(String str) {
        this.A00.A03.A0P(str);
    }
}
