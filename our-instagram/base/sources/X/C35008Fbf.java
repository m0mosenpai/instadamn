package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Fbf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35008Fbf {
    public MUD A00;
    public C32024E5c A01;
    public List A02;
    public final List A03;
    public final List A04;
    public final List A05;
    public final List A06;
    public final List A07;

    /* JADX WARN: Type inference failed for: r0v37, types: [X.E5c, java.lang.Object] */
    public C35008Fbf(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        C16930sl c16930sl = C16930sl.A00;
        this.A02 = c16930sl;
        this.A03 = AbstractC16960so.A1Q(new MUD("Most likely to ...", "Most likely to ", 4), new MUD("Also known as ...", "Also known as ", 4), new MUD("Secretly a pro at ...", "Secretly a pro at ", 4), new MUD("Aspiring ...", "Aspiring ", 4), new MUD((Integer) 1, "Song lyrics that best describe me", "\"\"", 30), new MUD("Insert witty quote here", "", 4));
        this.A04 = AbstractC16960so.A1Q(new MUD("I ❤️ ...", "I ❤️", 4), new MUD("My pets: 🐶🐱🐢", (String) null, 6), new MUD("Proud to be 🏁 ", (String) null, 6), new MUD("Bet you can't beat me at ...", "Bet you can't beat me at ", 4), new MUD("Top 5 emojis with no context", "", 4), new MUD((Integer) 17, "President of the ... fan club", "President of the fan club ", 30));
        this.A05 = AbstractC16960so.A1Q(new MUD("📺 Binge watching:", (String) null, 6), new MUD("📚 Currently reading: ", (String) null, 6), new MUD("🎥 Fave movie:", "🎥 Fave movie: ", 4), new MUD("🎶 Fave artist: ...", "🎶 Fave artist: ", 4), new MUD("🏟️ Fave sport: ", (String) null, 6), new MUD("🧶 Fave hobby: ", (String) null, 6));
        this.A06 = AbstractC16960so.A1Q(new MUD("Secret menu order: ...", "Secret menu order: ", 4), new MUD("🔥 Currently obsessed with ...", "🔥 Currently obsessed with ", 4), new MUD((Integer) 29, "If you can't handle me at my ... \n you don't deserve me at my ...", "If you can't handle me at my \n you don't deserve me at my ", 30), new MUD("𝓲𝓽 𝓶𝓮 ", (String) null, 6), new MUD("Sun 🌞, moon 🌙, rising ⬆️ ", (String) null, 6), new MUD("˚˖ ͙֒✧˚. aesthetic˚˖ ͙֒✧˚. ", (String) null, 6));
        this.A07 = c16930sl;
        this.A00 = A00(userSession);
        ?? obj = new Object();
        obj.A02 = null;
        obj.A04 = false;
        obj.A03 = false;
        obj.A01 = 0;
        obj.A00 = 0;
        obj.A05 = false;
        this.A01 = obj;
    }

    public final void A01(UserSession userSession) {
        String str;
        C14360o3.A0B(userSession, 0);
        String str2 = this.A00.A02;
        MUD A00 = A00(userSession);
        if (A00 != null) {
            str = A00.A02;
        } else {
            str = null;
        }
        if (C14360o3.A0K(str2, str)) {
            A00 = A00(userSession);
        }
        C32024E5c c32024E5c = this.A01;
        c32024E5c.A04 = false;
        c32024E5c.A01++;
        this.A00 = A00;
    }

    private final MUD A00(UserSession userSession) {
        if (C18U.A06(C06090Tz.A06, userSession, 36330840594269233L)) {
            if (this.A02.isEmpty()) {
                this.A02 = C0eM.A1H(AbstractC001800i.A0S(this.A06, AbstractC001800i.A0S(this.A05, AbstractC001800i.A0S(this.A04, this.A03))));
            }
            MUD mud = (MUD) AbstractC166987dD.A16(this.A02);
            this.A02 = AbstractC001800i.A0c(this.A02, 1);
            return mud;
        }
        List list = this.A03;
        C50722Ut c50722Ut = AbstractC50712Us.A00;
        int size = list.size();
        AbstractC50712Us abstractC50712Us = AbstractC50712Us.A01;
        Object obj = list.get(abstractC50712Us.A05(size));
        List list2 = this.A04;
        Object obj2 = list2.get(abstractC50712Us.A05(list2.size()));
        List list3 = this.A05;
        Object obj3 = list3.get(abstractC50712Us.A05(list3.size()));
        List list4 = this.A06;
        List A1Q = AbstractC16960so.A1Q((MUD) obj, (MUD) obj2, (MUD) obj3, (MUD) list4.get(abstractC50712Us.A05(list4.size())));
        return (MUD) A1Q.get(abstractC50712Us.A05(A1Q.size()));
    }
}
