package X;

import com.instagram.api.schemas.NoteBackgroundColor;
import com.instagram.api.schemas.NoteCustomTheme;
import com.instagram.api.schemas.NoteCustomThemeImpl;
import com.instagram.api.schemas.NoteEmojiReactionInfoIntf;
import com.instagram.api.schemas.NoteFontStyle;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ING {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C68A A04;
    public NoteBackgroundColor A05;
    public NoteCustomTheme A06;
    public AnonymousClass684 A07;
    public NoteFontStyle A08;
    public C68C A09;
    public C67R A0A;
    public C68E A0B;
    public User A0C;
    public User A0D;
    public Boolean A0E;
    public Integer A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public List A0L;
    public List A0M;
    public List A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public final C6CA A0S;

    public final C6C9 A01() {
        AnonymousClass689 anonymousClass689;
        C67s c67s;
        AnonymousClass688 anonymousClass688;
        C68B c68b;
        C68D c68d;
        C1DY A0b = AbstractC25235BEs.A0b(new C37761pD(null));
        int i = this.A00;
        List list = this.A0L;
        Integer num = this.A0F;
        NoteBackgroundColor noteBackgroundColor = this.A05;
        boolean z = this.A0O;
        C68A c68a = this.A04;
        if (c68a != null) {
            anonymousClass689 = c68a.EsK(A0b);
        } else {
            anonymousClass689 = null;
        }
        long j = this.A02;
        NoteCustomTheme noteCustomTheme = this.A06;
        NoteCustomThemeImpl ExJ = noteCustomTheme != null ? noteCustomTheme.ExJ() : null;
        List list2 = this.A0M;
        long j2 = this.A03;
        NoteFontStyle noteFontStyle = this.A08;
        String str = this.A0G;
        boolean z2 = this.A0P;
        String str2 = this.A0H;
        boolean z3 = this.A0Q;
        boolean z4 = this.A0R;
        C67R c67r = this.A0A;
        if (c67r != null) {
            c67s = c67r.ExR(A0b);
        } else {
            c67s = null;
        }
        int i2 = this.A01;
        AnonymousClass684 anonymousClass684 = this.A07;
        if (anonymousClass684 != null) {
            anonymousClass688 = anonymousClass684.ExM(A0b);
        } else {
            anonymousClass688 = null;
        }
        List list3 = this.A0N;
        ArrayList A0q = AbstractC167017dG.A0q(list3);
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            A0q.add(((NoteEmojiReactionInfoIntf) it.next()).ExK(A0b));
        }
        C68C c68c = this.A09;
        if (c68c != null) {
            c68b = c68c.ExQ(A0b);
        } else {
            c68b = null;
        }
        C68E c68e = this.A0B;
        if (c68e != null) {
            c68d = (C68D) c68e;
        } else {
            c68d = null;
        }
        return new C6C9(anonymousClass689, noteBackgroundColor, ExJ, anonymousClass688, noteFontStyle, c68b, c67s, c68d, this.A0C, this.A0D, this.A0E, num, str, str2, this.A0I, this.A0J, this.A0K, list, list2, A0q, i, i2, j, j2, z, z2, z3, z4);
    }

    public ING(C6C9 c6c9) {
        this.A0S = c6c9;
        this.A00 = c6c9.A00;
        this.A0L = c6c9.A0L;
        this.A0F = c6c9.A0F;
        this.A05 = c6c9.A05;
        this.A0O = c6c9.A0O;
        this.A04 = c6c9.A04;
        this.A02 = c6c9.A02;
        this.A06 = c6c9.A06;
        this.A0M = c6c9.A0M;
        this.A03 = c6c9.A03;
        this.A08 = c6c9.A08;
        this.A0G = c6c9.A0G;
        this.A0P = c6c9.A0P;
        this.A0H = c6c9.A0H;
        this.A0Q = c6c9.A0Q;
        this.A0R = c6c9.A0R;
        this.A0A = c6c9.A0A;
        this.A01 = c6c9.A01;
        this.A07 = c6c9.A07;
        this.A0N = c6c9.A0N;
        this.A09 = c6c9.A09;
        this.A0B = c6c9.A0B;
        this.A0C = c6c9.A0C;
        this.A0I = c6c9.A0I;
        this.A0J = c6c9.A0J;
        this.A0E = c6c9.A0E;
        this.A0D = c6c9.A0D;
        this.A0K = c6c9.A0K;
    }

    public final C6C9 A00() {
        AbstractC167017dG.A0x();
        return A01();
    }
}
