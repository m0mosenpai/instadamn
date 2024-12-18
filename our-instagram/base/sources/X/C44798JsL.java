package X;

/* renamed from: X.JsL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44798JsL extends AbstractC49502Ph {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44798JsL(C1YP c1yp, Object obj, int i) {
        super(c1yp);
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.AbstractC49502Ph
    public final /* bridge */ /* synthetic */ void A01(InterfaceC37561ot interfaceC37561ot, Object obj) {
        if (this.A00 != 0) {
            C45091JxL c45091JxL = (C45091JxL) obj;
            String str = c45091JxL.A08;
            interfaceC37561ot.ADp(1, str);
            interfaceC37561ot.ADp(2, c45091JxL.A0C);
            interfaceC37561ot.ADi(3, c45091JxL.A00);
            interfaceC37561ot.ADi(4, c45091JxL.A01);
            interfaceC37561ot.ADi(5, c45091JxL.A02);
            Long l = c45091JxL.A06;
            if (l == null) {
                interfaceC37561ot.ADj(6);
            } else {
                interfaceC37561ot.ADi(6, l.longValue());
            }
            Long l2 = c45091JxL.A07;
            if (l2 == null) {
                interfaceC37561ot.ADj(7);
            } else {
                interfaceC37561ot.ADi(7, l2.longValue());
            }
            String str2 = c45091JxL.A0A;
            if (str2 == null) {
                interfaceC37561ot.ADj(8);
            } else {
                interfaceC37561ot.ADp(8, str2);
            }
            String str3 = c45091JxL.A0B;
            if (str3 == null) {
                interfaceC37561ot.ADj(9);
            } else {
                interfaceC37561ot.ADp(9, str3);
            }
            String str4 = c45091JxL.A09;
            if (str4 == null) {
                interfaceC37561ot.ADj(10);
            } else {
                interfaceC37561ot.ADp(10, str4);
            }
            Long l3 = c45091JxL.A05;
            if (l3 == null) {
                interfaceC37561ot.ADj(11);
            } else {
                interfaceC37561ot.ADi(11, l3.longValue());
            }
            Double d = c45091JxL.A03;
            if (d == null) {
                interfaceC37561ot.ADj(12);
            } else {
                interfaceC37561ot.ADg(12, d.doubleValue());
            }
            Double d2 = c45091JxL.A04;
            if (d2 == null) {
                interfaceC37561ot.ADj(13);
            } else {
                interfaceC37561ot.ADg(13, d2.doubleValue());
            }
            interfaceC37561ot.ADi(14, c45091JxL.A0D ? 1L : 0L);
            interfaceC37561ot.ADp(15, str);
            return;
        }
        C45087JxH c45087JxH = (C45087JxH) obj;
        long j = c45087JxH.A01;
        interfaceC37561ot.ADi(1, j);
        interfaceC37561ot.ADp(2, c45087JxH.A05);
        interfaceC37561ot.ADi(3, c45087JxH.A03);
        String str5 = c45087JxH.A04;
        if (str5 == null) {
            interfaceC37561ot.ADj(4);
        } else {
            interfaceC37561ot.ADp(4, str5);
        }
        interfaceC37561ot.ADi(5, c45087JxH.A00);
        interfaceC37561ot.ADi(6, c45087JxH.A02);
        interfaceC37561ot.ADi(7, c45087JxH.A07 ? 1L : 0L);
        interfaceC37561ot.ADi(8, c45087JxH.A06 ? 1L : 0L);
        interfaceC37561ot.ADi(9, j);
    }

    @Override // X.AbstractC29601bb
    public final String createQuery() {
        if (this.A00 != 0) {
            return "UPDATE OR ABORT `security_alert` SET `id` = ?,`user_id` = ?,`crypto_mailbox_type` = ?,`device_change_type` = ?,`device_id` = ?,`created_timestamp_ms` = ?,`first_read_timestamp_ms` = ?,`model` = ?,`platform` = ?,`location` = ?,`activity_feed_read_timestamp_ms` = ?,`latitude` = ?,`longitude` = ?,`is_confirm` = ? WHERE `id` = ?";
        }
        return "UPDATE OR ABORT `participant_device_change` SET `id` = ?,`user_id` = ?,`participantUserId` = ?,`device_name` = ?,`device_change_type` = ?,`device_change_timestamp_ms` = ?,`should_display_device_change_admin_message` = ?,`is_interop_participant` = ? WHERE `id` = ?";
    }
}
