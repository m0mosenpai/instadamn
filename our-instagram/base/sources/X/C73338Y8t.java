package X;

import androidx.media3.common.Timeline;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* renamed from: X.Y8t, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73338Y8t implements YNJ {
    public static final InterfaceC216113n A08 = new C73442YDl(1);
    public static final Random A09 = new Random();
    public YOf A02;
    public String A03;
    public final InterfaceC216113n A06 = A08;
    public final C62960SZd A05 = new C62960SZd();
    public final C72843Xop A04 = new C72843Xop();
    public final HashMap A07 = AbstractC166987dD.A1G();
    public Timeline A01 = Timeline.A00;
    public long A00 = -1;

    @Override // X.YNJ
    public final synchronized void FC7(C72855XpB c72855XpB) {
        this.A02.getClass();
        if (!AbstractC167007dF.A1N(c72855XpB.A07.A02())) {
            C72796XnJ A00 = A00(this, c72855XpB.A01);
            String str = this.A03;
            if (str == null) {
                str = A00.A04;
                this.A03 = str;
            }
            if (!A00.A03) {
                A00.A03 = true;
            }
            String str2 = A00.A04;
            if (str2.equals(str) && !A00.A02) {
                A00.A02 = true;
                this.A02.Dks(c72855XpB, str2);
            }
        }
    }

    public static C72796XnJ A00(C73338Y8t c73338Y8t, int i) {
        HashMap hashMap = c73338Y8t.A07;
        Iterator A0k = AbstractC167007dF.A0k(hashMap);
        C72796XnJ c72796XnJ = null;
        while (A0k.hasNext()) {
            C72796XnJ c72796XnJ2 = (C72796XnJ) A0k.next();
            if (i == c72796XnJ2.A00) {
                c72796XnJ = c72796XnJ2;
            }
        }
        if (c72796XnJ == null) {
            String str = (String) c73338Y8t.A06.get();
            C72796XnJ c72796XnJ3 = new C72796XnJ(c73338Y8t, str, i);
            hashMap.put(str, c72796XnJ3);
            return c72796XnJ3;
        }
        return c72796XnJ;
    }

    public static void A01(C72855XpB c72855XpB, C73338Y8t c73338Y8t) {
        if (AbstractC167007dF.A1N(c72855XpB.A07.A02())) {
            String str = c73338Y8t.A03;
            if (str != null) {
                c73338Y8t.A07.get(str).getClass();
                c73338Y8t.A03 = null;
                return;
            }
            return;
        }
        c73338Y8t.A07.get(c73338Y8t.A03);
        c73338Y8t.A03 = A00(c73338Y8t, c72855XpB.A01).A04;
        c73338Y8t.FC7(c72855XpB);
    }
}
