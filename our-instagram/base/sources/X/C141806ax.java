package X;

import com.instagram.reels.comments.viewmodel.StoryCommentsViewModel$CommentRotation$rotate$1;
import java.util.List;

/* renamed from: X.6ax, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141806ax {
    public int A00;
    public List A01;
    public AnonymousClass195 A02;
    public C05A A03;
    public final InterfaceC16820sZ A04;
    public final InterfaceC16610sE A05;
    public final C19L A06;

    public C141806ax(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16610sE interfaceC16610sE, C19L c19l) {
        C14360o3.A0B(c19l, 1);
        this.A06 = c19l;
        this.A05 = interfaceC16610sE;
        this.A04 = interfaceC16820sZ;
        this.A01 = C16930sl.A00;
        this.A00 = -1;
        this.A03 = new C008002u(false);
    }

    public final void A00() {
        this.A03.Egh(true);
    }

    public final void A01() {
        this.A03.Egh(false);
    }

    public final void A02(List list) {
        AnonymousClass195 anonymousClass195 = this.A02;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        this.A02 = null;
        this.A01 = list;
        if (!list.isEmpty()) {
            C19L c19l = this.A06;
            StoryCommentsViewModel$CommentRotation$rotate$1 storyCommentsViewModel$CommentRotation$rotate$1 = new StoryCommentsViewModel$CommentRotation$rotate$1(this, list, null);
            this.A02 = AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, storyCommentsViewModel$CommentRotation$rotate$1, c19l);
        }
    }
}
