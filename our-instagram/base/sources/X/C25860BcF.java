package X;

import com.facebook.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.enums.EnumEntries;

/* renamed from: X.BcF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25860BcF extends AbstractC52922bZ {
    public final C27261C1e A00;
    public final String A01;
    public final C05A A02;
    public final C05A A03;
    public final C0UO A04;
    public final C0UO A05;
    public final C0UO A06;
    public final C0UO A07;
    public final C05A A08;
    public final C05A A09;

    public C25860BcF(C27261C1e c27261C1e, String str) {
        C14360o3.A0B(c27261C1e, 1);
        this.A00 = c27261C1e;
        this.A01 = str;
        C008002u A00 = C10E.A00(null);
        this.A03 = A00;
        this.A07 = AbstractC208910l.A02(A00);
        C008002u A002 = C10E.A00(null);
        this.A02 = A002;
        this.A04 = AbstractC208910l.A02(A002);
        EnumEntries enumEntries = C7R.A01;
        ArrayList A0q = AbstractC167017dG.A0q(enumEntries);
        Iterator<E> it = enumEntries.iterator();
        while (it.hasNext()) {
            A0q.add(A00((C7R) it.next()));
        }
        C008002u A003 = C10E.A00(A0q);
        this.A09 = A003;
        this.A06 = AbstractC208910l.A02(A003);
        C008002u A004 = C10E.A00(AbstractC16960so.A1Q(new C51740MtP("S", false, 8), new C51740MtP("M", false, 8), new C51740MtP("T", false, 8), new C51740MtP("W", false, 8), new C51740MtP("T", false, 8), new C51740MtP("F", false, 8), new C51740MtP("S", false, 8)));
        this.A08 = A004;
        this.A05 = AbstractC208910l.A02(A004);
    }

    public static final C26034BfN A00(C7R c7r) {
        int i;
        int i2;
        int i3;
        C7R c7r2;
        int ordinal = c7r.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    i = R.drawable.instagram_reach_pano_outline_24;
                    i2 = 2131955098;
                    i3 = 2131955097;
                    c7r2 = C7R.A04;
                } else {
                    throw B4Z.A00();
                }
            } else {
                i = R.drawable.instagram_roll_call_chat_pano_outline_24;
                i2 = 2131955103;
                i3 = 2131955102;
                c7r2 = C7R.A05;
            }
        } else {
            i = R.drawable.instagram_media_pano_outline_24;
            i2 = 2131955092;
            i3 = 2131955091;
            c7r2 = C7R.A03;
        }
        return new C26034BfN(c7r2, i, i2, i3);
    }
}
