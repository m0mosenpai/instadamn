package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class KZC extends C4A7 {
    public long A00;
    public List A01;
    public final long A02;
    public final UserSession A03;
    public final C47562KzX A04;
    public final C23031Ai A05;
    public final C19L A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ KZC(UserSession userSession, C19L c19l) {
        super("NotesPromptSuggestionRepository", c19l);
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        C47562KzX c47562KzX = new C47562KzX(userSession, AbstractC40691uc.A01(userSession));
        AbstractC167017dG.A1R(userSession, A00);
        this.A06 = c19l;
        this.A03 = userSession;
        this.A05 = A00;
        this.A04 = c47562KzX;
        InterfaceC19630xq interfaceC19630xq = A00.A01;
        this.A01 = AbstractC001800i.A0U(AbstractC001800i.A0X(interfaceC19630xq.C2v("suggested_prompts_in_notes")));
        this.A00 = AbstractC31175DnJ.A03(interfaceC19630xq, "suggested_prompts_in_notes_last_updated_timestamp");
        this.A02 = AbstractC43593JPy.A09(TimeUnit.HOURS) * C18U.A01(C06090Tz.A05, userSession, 36607230329624116L);
    }
}
