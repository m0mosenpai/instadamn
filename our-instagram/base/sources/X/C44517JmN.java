package X;

import com.instagram.direct.reactions.tabbedreaction.repository.DirectTabbedEmojiReactionRepository;
import java.util.List;
import java.util.Map;

/* renamed from: X.JmN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44517JmN extends AbstractC52922bZ {
    public int A00;
    public final int A01;
    public final DirectTabbedEmojiReactionRepository A02;
    public final Map A03 = AbstractC166987dD.A1I();

    public final void A00(String str, String str2, String str3, String str4, int i, boolean z) {
        String str5;
        C05A c05a = (C05A) this.A03.get(str4);
        if (c05a != null) {
            if (z && AbstractC166987dD.A1b((List) ((C51757Mtg) c05a.getValue()).A01)) {
                return;
            }
            int i2 = this.A00;
            int i3 = this.A01;
            if (i2 - i3 > i || i2 + i3 < i) {
                return;
            }
            if (!z && ((str5 = ((C51757Mtg) c05a.getValue()).A02) == null || str5.length() == 0)) {
                return;
            }
            Object obj = ((C51757Mtg) c05a.getValue()).A00;
            KWY kwy = KWY.A00;
            if (C14360o3.A0K(obj, kwy)) {
                return;
            }
            C51757Mtg c51757Mtg = (C51757Mtg) c05a.getValue();
            List list = (List) c51757Mtg.A01;
            String str6 = c51757Mtg.A02;
            AbstractC167007dF.A1D(list, 0, kwy);
            c05a.Egh(new C51757Mtg(kwy, str6, list));
            AbstractC166987dD.A1Z(new D50(this, c05a, str3, str2, str, null, 4), AbstractC141776au.A00(this));
        }
    }

    public C44517JmN(DirectTabbedEmojiReactionRepository directTabbedEmojiReactionRepository, int i) {
        this.A02 = directTabbedEmojiReactionRepository;
        this.A01 = i;
    }
}
