package X;

import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;
import com.instagram.contentnotes.domain.immersivereply.ContentNotesImmersiveReplyContent;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CTb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27942CTb {
    public final C27926CSl A00;

    public final void A00(String str, String str2, boolean z) {
        EnumC46276Ke8 enumC46276Ke8;
        C14360o3.A0B(str, 0);
        C27926CSl c27926CSl = this.A00;
        if (!AbstractC001900j.A0T(str)) {
            ContentNotesImmersiveReplyContent contentNotesImmersiveReplyContent = c27926CSl.A01;
            if (contentNotesImmersiveReplyContent.A0F) {
                List list = contentNotesImmersiveReplyContent.A0B;
                ArrayList A0q = AbstractC167017dG.A0q(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    A0q.add(new PendingRecipient(AbstractC25226BEj.A15(it)));
                }
                if (!A0q.isEmpty()) {
                    DirectShareTarget directShareTarget = new DirectShareTarget(new C122145g6(A0q), null, A0q, true);
                    UserSession userSession = c27926CSl.A00;
                    C1DX A00 = C1DW.A00(userSession);
                    ContentNoteMetadata contentNoteMetadata = contentNotesImmersiveReplyContent.A02;
                    C38321qM A02 = A00.A02(contentNoteMetadata.A08);
                    if (A02 != null) {
                        C28531Zo.A04.A05(null, userSession, A02, directShareTarget, contentNoteMetadata.A04, str, contentNoteMetadata.A05);
                    }
                }
            } else {
                UserSession userSession2 = c27926CSl.A00;
                C18A A002 = AnonymousClass189.A00(userSession2);
                String str3 = contentNotesImmersiveReplyContent.A05;
                User A022 = A002.A02(str3);
                if (A022 != null) {
                    DirectShareTarget directShareTarget2 = new DirectShareTarget(A022);
                    Long A0j = AbstractC25231BEo.A0j(0, contentNotesImmersiveReplyContent.A07);
                    if (A0j != null) {
                        C28531Zo c28531Zo = C28531Zo.A04;
                        String str4 = contentNotesImmersiveReplyContent.A08;
                        String str5 = contentNotesImmersiveReplyContent.A06;
                        String A0g = AnonymousClass001.A0g(str2, "\n", str);
                        C14360o3.A07(A0g);
                        ExtendedImageUrl extendedImageUrl = new ExtendedImageUrl(A022.Bhu());
                        ContentNoteMetadata contentNoteMetadata2 = contentNotesImmersiveReplyContent.A02;
                        String str6 = contentNoteMetadata2.A08;
                        c28531Zo.A08(userSession2, contentNoteMetadata2.A00, directShareTarget2, extendedImageUrl, contentNoteMetadata2.A01, Boolean.valueOf(C28531Zo.A04.A0I(userSession2, directShareTarget2)), A0j, str, str4, str5, A0g, str6, contentNoteMetadata2.A07, null);
                    }
                    ContentNoteMetadata contentNoteMetadata3 = contentNotesImmersiveReplyContent.A02;
                    String str7 = contentNoteMetadata3.A04;
                    String str8 = contentNoteMetadata3.A06;
                    Integer num = contentNoteMetadata3.A03;
                    String str9 = contentNoteMetadata3.A05;
                    Integer num2 = contentNoteMetadata3.A02;
                    if (z) {
                        enumC46276Ke8 = EnumC46276Ke8.REACTION;
                    } else {
                        enumC46276Ke8 = EnumC46276Ke8.TEXT;
                    }
                    BSo.A01(enumC46276Ke8, userSession2, num, num2, str3, str7, str8, str9);
                }
            }
            c27926CSl.A03.Egh(EnumC27368C5x.A02);
            if (z) {
                c27926CSl.A02.Egh(str);
            }
        }
    }

    public C27942CTb(C27926CSl c27926CSl) {
        this.A00 = c27926CSl;
    }
}
