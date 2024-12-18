package X;

import com.instagram.tagging.widget.MediaTagHintsLayout;

/* renamed from: X.3tB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC86383tB {
    public static final void A00(C75113Zb c75113Zb, C3YG c3yg, boolean z) {
        C14360o3.A0B(c75113Zb, 0);
        MediaTagHintsLayout mediaTagHintsLayout = c3yg.A02;
        mediaTagHintsLayout.A01();
        mediaTagHintsLayout.A02(c75113Zb.A07(c3yg.A00, -1), z);
    }

    public static final void A01(C101734hi c101734hi, C3YG c3yg, boolean z) {
        C14360o3.A0B(c101734hi, 0);
        C75113Zb c75113Zb = c101734hi.A01;
        int i = c101734hi.A00;
        C86393tC A07 = c75113Zb.A07(i, -1);
        if (c101734hi.A03) {
            A07.A05 = true;
            MediaTagHintsLayout mediaTagHintsLayout = c3yg.A02;
            mediaTagHintsLayout.A01();
            mediaTagHintsLayout.A02(A07, false);
            return;
        }
        if (c75113Zb == c3yg.A01 && c75113Zb.A03 == c3yg.A00) {
            return;
        }
        MediaTagHintsLayout mediaTagHintsLayout2 = c3yg.A02;
        mediaTagHintsLayout2.setTags(c101734hi.A02);
        mediaTagHintsLayout2.A01();
        C75113Zb c75113Zb2 = c3yg.A01;
        if (c75113Zb2 != null) {
            c75113Zb2.A0M(c3yg, Integer.valueOf(c3yg.A00), true);
        }
        c3yg.A00 = i;
        c3yg.A01 = c75113Zb;
        c75113Zb.A0L(c3yg, Integer.valueOf(i), true);
        if (!z) {
            return;
        }
        c3yg.A00();
    }
}
