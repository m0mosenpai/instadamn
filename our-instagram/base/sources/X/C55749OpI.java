package X;

/* renamed from: X.OpI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55749OpI implements InterfaceC58182Pqn {
    public final C69605Vs8 A00;
    public final boolean A01;
    public final C54675ODb A02;
    public final java.util.Set A03 = AbstractC31171DnF.A0l();
    public final boolean A04;

    @Override // X.InterfaceC58182Pqn
    public final boolean Ejx(EnumC53220NgI enumC53220NgI, String str) {
        C14360o3.A0B(enumC53220NgI, 1);
        C09530e4 A1L = AbstractC166987dD.A1L(str, enumC53220NgI);
        java.util.Set set = this.A03;
        if (set.contains(A1L)) {
            return false;
        }
        set.add(A1L);
        return true;
    }

    public static void A00(U3t u3t, C55749OpI c55749OpI, String str) {
        u3t.CnT("call_type", str);
        u3t.CnU("is_rsys", true);
        u3t.AAO("call_ui_shown");
        u3t.AAO("signaling_connected");
        u3t.AAO("media_connected");
        u3t.AAO("self_first_frame_rendered");
        u3t.AAO("remote_first_frame_rendered");
        if (c55749OpI.A01) {
            u3t.AAO("remote_audio_played");
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.PsT, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.WXu, X.PsT] */
    @Override // X.InterfaceC58182Pqn
    public final InterfaceC58275PsT BXS(Long l) {
        InterfaceC72008XEw interfaceC72008XEw;
        if (this.A04) {
            C69605Vs8 c69605Vs8 = this.A00;
            long A03 = AbstractC31178DnM.A03(l);
            C103284l3 c103284l3 = c69605Vs8.A02;
            synchronized (c103284l3) {
                interfaceC72008XEw = (InterfaceC72008XEw) c103284l3.A00.get(A03);
            }
            if (interfaceC72008XEw != null) {
                return new AbstractC70464WXu(interfaceC72008XEw);
            }
        }
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.WXu, X.PsS] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.PsS, java.lang.Object] */
    @Override // X.InterfaceC58182Pqn
    public final InterfaceC58274PsS CA6(Long l) {
        InterfaceC72008XEw interfaceC72008XEw;
        C69605Vs8 c69605Vs8 = this.A00;
        long A03 = AbstractC31178DnM.A03(l);
        C103284l3 c103284l3 = c69605Vs8.A02;
        synchronized (c103284l3) {
            interfaceC72008XEw = (InterfaceC72008XEw) c103284l3.A00.get(A03);
        }
        if (interfaceC72008XEw == null) {
            return new Object();
        }
        return new AbstractC70464WXu(interfaceC72008XEw);
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x00e3, code lost:
    
        if (r3 == 7) goto L62;
     */
    @Override // X.InterfaceC58182Pqn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dhv(X.AbstractC53622NnT r16, java.lang.Long r17) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55749OpI.Dhv(X.NnT, java.lang.Long):void");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.WXu, X.PsS] */
    @Override // X.InterfaceC58182Pqn
    public final InterfaceC58274PsS EnP(Boolean bool, boolean z, boolean z2) {
        Integer num;
        if (z) {
            num = C05F.A0Y;
        } else {
            num = C05F.A0N;
        }
        Boolean valueOf = Boolean.valueOf(z2);
        String str = "group";
        if (3 - num.intValue() == 0) {
            str = "1p";
        }
        U3t A00 = this.A00.A00(816061304);
        if (valueOf != null) {
            A00.CnU("is_video", valueOf.booleanValue());
        }
        A00(A00, this, str);
        return new AbstractC70464WXu(A00);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.WXu, X.PsT] */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.PsT, java.lang.Object] */
    @Override // X.InterfaceC58182Pqn
    public final InterfaceC58275PsT Eng() {
        if (!this.A04) {
            return new Object();
        }
        U3t A00 = this.A00.A00(746591017);
        A00.AAO("alert_ack_notification");
        A00.AAO("notif_displayed");
        A00.AAO("notification_parsed");
        A00.AAO("notif_removed");
        A00.AAO("reach_rtc_intent_handler_activity");
        A00.AAO("launch_call_activity");
        A00.AAO("call_activity_on_resume");
        A00.AAO("incoming_call_screen_displayed");
        return new AbstractC70464WXu(A00);
    }

    public C55749OpI(C54675ODb c54675ODb, C69605Vs8 c69605Vs8, boolean z, boolean z2) {
        this.A01 = z;
        this.A04 = z2;
        this.A00 = c69605Vs8;
        this.A02 = c54675ODb;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.WXu, X.PsS] */
    @Override // X.InterfaceC58182Pqn
    public final InterfaceC58274PsS EnV(Boolean bool, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        U3t A00 = this.A00.A00(816066612);
        if (valueOf != null) {
            A00.CnU("is_video", valueOf.booleanValue());
        }
        A00(A00, this, "group_join");
        return new AbstractC70464WXu(A00);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.WXu, X.PsS] */
    @Override // X.InterfaceC58182Pqn
    public final InterfaceC58274PsS Enj(Boolean bool, String str, boolean z, boolean z2) {
        Integer A0Z = MSX.A0Z(z ? 1 : 0);
        Boolean valueOf = Boolean.valueOf(z2);
        int intValue = A0Z.intValue();
        String str2 = "group";
        if (intValue == 0) {
            str2 = "1p";
        }
        U3t A00 = this.A00.A00(816066612);
        if (valueOf != null) {
            A00.CnU("is_video", valueOf.booleanValue());
        }
        A00.CnT("call_type", str2);
        A00.CnU("is_rsys", true);
        A00.CnT("link_source", str);
        A00.AAO("call_ui_shown");
        if (intValue != 0) {
            A00.AAO("signaling_connected");
            A00.AAO("media_connected");
        } else {
            A00.AAO("signaling_connected");
        }
        if (AbstractC166997dE.A1Z(valueOf, true)) {
            A00.AAO("self_first_frame_rendered");
        }
        return new AbstractC70464WXu(A00);
    }
}
