package X;

/* renamed from: X.Ttg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65765Ttg extends C1P1 {
    public final /* synthetic */ C65762Ttd A00;

    public C65765Ttg(C65762Ttd c65762Ttd) {
        this.A00 = c65762Ttd;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        String str;
        int A03 = C0f9.A03(-1027464057);
        C14360o3.A0B(abstractC115105If, 0);
        super.onFail(abstractC115105If);
        C65762Ttd c65762Ttd = this.A00;
        C9GR.A01(c65762Ttd.A0E, "promote_ads_manager_toast_update_error_rebranding", 2131970352, 0);
        C65763Tte c65763Tte = c65762Ttd.A07;
        String str2 = c65762Ttd.A0D;
        if (str2 == null) {
            str = "threadIdV2";
        } else {
            String str3 = c65762Ttd.A0C;
            if (str3 == null) {
                str = "participantId";
            } else {
                String str4 = c65762Ttd.A0B;
                if (str4 == null) {
                    str = "adMediaId";
                } else {
                    C65763Tte.A00(c65763Tte, "direct_in_thread_ctd_banner_resume_ad_failed", str2, str3, AbstractC167007dF.A0n("media_id", str4));
                    C0f9.A0A(1974933543, A03);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        int A03 = C0f9.A03(-1091974977);
        int A0N = AbstractC167017dG.A0N(obj, -15389011);
        super.onSuccess(obj);
        C65762Ttd c65762Ttd = this.A00;
        C65763Tte c65763Tte = c65762Ttd.A07;
        String str2 = c65762Ttd.A0D;
        if (str2 == null) {
            str = "threadIdV2";
        } else {
            String str3 = c65762Ttd.A0C;
            if (str3 == null) {
                str = "participantId";
            } else {
                String str4 = c65762Ttd.A0B;
                if (str4 == null) {
                    str = "adMediaId";
                } else {
                    C65763Tte.A00(c65763Tte, "direct_in_thread_ctd_banner_resume_ad_succeed", str2, str3, AbstractC167007dF.A0n("media_id", str4));
                    C0f9.A0A(1089090587, A0N);
                    C0f9.A0A(-1637715241, A03);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
