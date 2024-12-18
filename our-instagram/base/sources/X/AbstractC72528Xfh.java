package X;

/* renamed from: X.Xfh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72528Xfh {
    public static void A00(C72857XpD c72857XpD, C0XX c0xx) {
        if (!c72857XpD.A0B && c72857XpD.A0C) {
            if (c72857XpD.A08 <= c72857XpD.A06 - c72857XpD.A0D) {
                c0xx.BTP().A03(AbstractC43591JPw.A00(419), Integer.valueOf(c72857XpD.A00));
                c0xx.BTP().A02("total_messages_duration", c72857XpD.A08);
                c0xx.BTP().A02("longest_message_duration", c72857XpD.A03);
                String str = c72857XpD.A0A;
                if (str != null) {
                    c0xx.BTP().A03("st200ms_longest_message_origin", str);
                }
                c0xx.BTP().A03("native_poll_once_count", Integer.valueOf(c72857XpD.A01));
                c0xx.BTP().A02("native_poll_once_duration", c72857XpD.A07);
                c0xx.BTP().A03("st200ms_messages_count", Integer.valueOf(c72857XpD.A02));
                c0xx.BTP().A02("longest_wait_time", c72857XpD.A05);
                c0xx.BTP().A03("longest_wait_message", c72857XpD.A09);
                c0xx.BTP().A02("longest_wait_message_duration", c72857XpD.A04);
            }
        }
    }
}
