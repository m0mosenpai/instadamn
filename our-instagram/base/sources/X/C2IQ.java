package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.2IQ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2IQ implements InterfaceC13050lr {
    public final C25671My A00;
    public final InterfaceC41501vz A01;
    public final InterfaceC41501vz A02;
    public final InterfaceC41501vz A03;
    public final InterfaceC41501vz A04;
    public final InterfaceC41501vz A05;
    public final InterfaceC41501vz A06;
    public final InterfaceC41501vz A07;
    public final InterfaceC41501vz A08;
    public final UserSession A09;
    public final C2IR A0A;

    public C2IQ(C25671My c25671My, UserSession userSession, C2IR c2ir) {
        C14360o3.A0B(c2ir, 2);
        C14360o3.A0B(c25671My, 3);
        this.A09 = userSession;
        this.A0A = c2ir;
        this.A00 = c25671My;
        this.A03 = new InterfaceC41501vz() { // from class: X.2Ie
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(324705144);
                int A032 = C0f9.A03(1215996574);
                C2IQ.this.A0A.A00("fetch_inbox_from_disk");
                C0f9.A0A(-986114043, A032);
                C0f9.A0A(670870146, A03);
            }
        };
        this.A06 = new InterfaceC41501vz() { // from class: X.2If
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(-167968563);
                C2In c2In = (C2In) obj;
                int A032 = C0f9.A03(663998924);
                C14360o3.A0B(c2In, 0);
                C2IQ c2iq = C2IQ.this;
                if (C14360o3.A0K(c2iq.A09.userId, c2In.A02)) {
                    c2iq.A0A.A00("seen_marker_updated");
                }
                C0f9.A0A(-1205391581, A032);
                C0f9.A0A(111281142, A03);
            }
        };
        this.A05 = new InterfaceC41501vz() { // from class: X.2Ig
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(2046897999);
                C48022Ip c48022Ip = (C48022Ip) obj;
                int A032 = C0f9.A03(722406451);
                C14360o3.A0B(c48022Ip, 0);
                if (c48022Ip.A01) {
                    C2IQ.this.A0A.A00("inbox_header_updated");
                }
                C0f9.A0A(-936015821, A032);
                C0f9.A0A(104172931, A03);
            }
        };
        this.A04 = new InterfaceC41501vz() { // from class: X.2Ih
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(-1434586650);
                int A032 = C0f9.A03(636542623);
                C2IQ.this.A0A.A00("thread_removed");
                C0f9.A0A(936570174, A032);
                C0f9.A0A(-499737647, A03);
            }
        };
        this.A08 = new InterfaceC41501vz() { // from class: X.2Ii
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(-54654788);
                int A032 = C0f9.A03(-1529858572);
                C2IQ.this.A0A.A00("next_page_of_visual_messages_added");
                C0f9.A0A(899907711, A032);
                C0f9.A0A(-1944426934, A03);
            }
        };
        this.A07 = new InterfaceC41501vz() { // from class: X.2Ij
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(582581820);
                C2Io c2Io = (C2Io) obj;
                int A032 = C0f9.A03(-1822452513);
                C14360o3.A0B(c2Io, 0);
                if (c2Io.A05) {
                    C2IR c2ir2 = C2IQ.this.A0A;
                    String str = "thread_left";
                    switch (c2Io.A01.intValue()) {
                        case 0:
                        case 22:
                            break;
                        case 1:
                            str = "message_added";
                            break;
                        case 2:
                            str = "message_updated";
                            break;
                        case 3:
                        case 5:
                        case Process.SIGTERM /* 15 */:
                        case 16:
                        case 17:
                        case Process.SIGSTOP /* 19 */:
                        default:
                            str = "unknown";
                            break;
                        case 4:
                            str = "message_removed";
                            break;
                        case 6:
                            str = "user_added_to_reactors_list";
                            break;
                        case 7:
                            str = "self_added_to_reactors_list_reason";
                            break;
                        case 8:
                            str = "user_removed_from_reactors_list";
                            break;
                        case 9:
                            str = "message_count_based_reactions_updated";
                            break;
                        case 10:
                            str = "batch_message_count_based_reactions_updated";
                            break;
                        case 11:
                            str = "visual_message_marked_as_seen";
                            break;
                        case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                            str = "voice_message_marked_as_seen";
                            break;
                        case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                            str = "permanent_media_message_marked_as_seen";
                            break;
                        case 14:
                            str = "thread_seen_state_changed";
                            break;
                        case 18:
                            str = "thread_unread_state_changed";
                            break;
                        case 20:
                            str = "thread_updated";
                            break;
                        case 21:
                            str = "thread_created";
                            break;
                    }
                    c2ir2.A00(str);
                }
                C0f9.A0A(-2102506555, A032);
                C0f9.A0A(566009914, A03);
            }
        };
        this.A02 = new InterfaceC41501vz() { // from class: X.2Ik
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(961356524);
                int A032 = C0f9.A03(-1879695836);
                C2IQ.this.A0A.A00("fetch_channels_folder_from_inbox_polling");
                C0f9.A0A(-1834895973, A032);
                C0f9.A0A(311351143, A03);
            }
        };
        this.A01 = new InterfaceC41501vz() { // from class: X.2Il
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(-339660593);
                int A032 = C0f9.A03(1966033881);
                C2IQ.this.A0A.A00("channel_invites_fetched");
                C0f9.A0A(1444234313, A032);
                C0f9.A0A(-742034848, A03);
            }
        };
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        C25671My c25671My = this.A00;
        c25671My.A02(this.A03, C2Im.class);
        c25671My.A02(this.A06, C2In.class);
        c25671My.A02(this.A07, C2Io.class);
        c25671My.A02(this.A05, C48022Ip.class);
        c25671My.A02(this.A04, C48032Iq.class);
        c25671My.A02(this.A08, C48042Ir.class);
        c25671My.A02(this.A02, C48052Is.class);
        c25671My.A02(this.A01, C48062It.class);
    }
}
