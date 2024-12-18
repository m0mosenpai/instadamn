package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.direct.model.mentions.MentionedEntity;
import com.instagram.direct.model.mentions.SendMentionData$MentionData;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.1b4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29271b4 extends AbstractC29011ae {
    public static final C1OZ A0Q = new C1OZ() { // from class: X.1b5
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            AbstractC09800fd.A01("DirectSendTextMessageMutation-serialize", 1289893017);
            try {
                C29271b4 c29271b4 = (C29271b4) obj;
                anonymousClass182.A0d();
                String str = c29271b4.A0L;
                if (str != null) {
                    anonymousClass182.A0S("text", str);
                }
                if (c29271b4.A0N != null) {
                    C16V.A03(anonymousClass182, "mentioned_user_ids");
                    for (String str2 : c29271b4.A0N) {
                        if (str2 != null) {
                            anonymousClass182.A0u(str2);
                        }
                    }
                    anonymousClass182.A0Z();
                }
                String str3 = c29271b4.A0F;
                if (str3 != null) {
                    anonymousClass182.A0S("after_post_action", str3);
                }
                if (c29271b4.A03 != null) {
                    anonymousClass182.A0r("replied_to_message");
                    AbstractC43642JSa.A01(anonymousClass182, c29271b4.A03);
                }
                if (c29271b4.A01 != null) {
                    anonymousClass182.A0r("forwarding_params");
                    FUT.A00(anonymousClass182, c29271b4.A01);
                }
                String str4 = c29271b4.A0J;
                if (str4 != null) {
                    anonymousClass182.A0S("postback_payload", str4);
                }
                if (c29271b4.A02 != null) {
                    anonymousClass182.A0r("power_up_data");
                    L7G l7g = c29271b4.A02;
                    anonymousClass182.A0d();
                    anonymousClass182.A0Q("style", l7g.A00);
                    anonymousClass182.A0a();
                }
                if (c29271b4.A05 != null) {
                    anonymousClass182.A0r("private_reply_info");
                    AbstractC47855LCa.A00(anonymousClass182, c29271b4.A05);
                }
                if (c29271b4.A04 != null) {
                    anonymousClass182.A0r("mentioned_entities");
                    SendMentionData$MentionData sendMentionData$MentionData = c29271b4.A04;
                    anonymousClass182.A0d();
                    if (sendMentionData$MentionData.A00 != null) {
                        C16V.A03(anonymousClass182, "mentioned_entity_list");
                        for (MentionedEntity mentionedEntity : sendMentionData$MentionData.A00) {
                            if (mentionedEntity != null) {
                                AnonymousClass545.A00(anonymousClass182, mentionedEntity);
                            }
                        }
                        anonymousClass182.A0Z();
                    }
                    anonymousClass182.A0a();
                }
                Boolean bool = c29271b4.A08;
                if (bool != null) {
                    anonymousClass182.A0T("is_suggested_reply", bool.booleanValue());
                }
                Boolean bool2 = c29271b4.A0A;
                if (bool2 != null) {
                    anonymousClass182.A0T("send_silently", bool2.booleanValue());
                }
                Boolean bool3 = c29271b4.A09;
                if (bool3 != null) {
                    anonymousClass182.A0T("is_x_transport_forward", bool3.booleanValue());
                }
                if (c29271b4.A0M != null) {
                    C16V.A03(anonymousClass182, "commands");
                    for (C206179Ba c206179Ba : c29271b4.A0M) {
                        if (c206179Ba != null) {
                            LCF.A00(c206179Ba, anonymousClass182);
                        }
                    }
                    anonymousClass182.A0Z();
                }
                anonymousClass182.A0T("btt_dual_send", c29271b4.A0O);
                if (c29271b4.A07 != null) {
                    anonymousClass182.A0r("attachment");
                    C47Y.A01(anonymousClass182, c29271b4.A07);
                }
                if (c29271b4.A00 != null) {
                    anonymousClass182.A0r("prompt_data");
                    LCD.A00(c29271b4.A00, anonymousClass182);
                }
                Integer num = c29271b4.A0B;
                if (num != null) {
                    anonymousClass182.A0Q("seed", num.intValue());
                }
                Integer num2 = c29271b4.A0C;
                if (num2 != null) {
                    anonymousClass182.A0Q("is_written_with_ai", num2.intValue());
                }
                String str5 = c29271b4.A0G;
                if (str5 != null) {
                    anonymousClass182.A0S("prompt_fbid", str5);
                }
                anonymousClass182.A0T("should_skip_genai_eval", c29271b4.A0P);
                Integer num3 = c29271b4.A0D;
                if (num3 != null) {
                    anonymousClass182.A0Q("thread_label", AbstractC46786Kmh.A00(num3));
                }
                Long l = c29271b4.A0E;
                if (l != null) {
                    anonymousClass182.A0R("scheduled_timestamp_sec", l.longValue());
                }
                AbstractC47856LCb.A00(anonymousClass182, c29271b4);
                anonymousClass182.A0a();
                AbstractC09800fd.A00(1285266029);
            } catch (Throwable th) {
                AbstractC09800fd.A00(561153397);
                throw th;
            }
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return AbstractC46981Kq0.parseFromJson(c16l);
        }
    };
    public C50679MYx A00;

    @Deprecated
    public DirectForwardingParams A01;
    public L7G A02;
    public AnonymousClass442 A03;
    public SendMentionData$MentionData A04;
    public C47588Kzy A05;
    public C2EY A06;
    public C47Z A07;
    public Boolean A08;
    public Boolean A09;
    public Boolean A0A;
    public Integer A0B;
    public Integer A0C;
    public Integer A0D;
    public Long A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public List A0M;
    public List A0N;
    public boolean A0O;
    public boolean A0P;

    @Override // X.C1OW
    public final String A02() {
        return "send_text_message";
    }

    public static C29271b4 A00(C31481er c31481er, String str) {
        String str2 = str;
        JTa jTa = ((C1OW) c31481er).A02;
        DirectThreadKey C7Q = c31481er.C7Q();
        if (str == null) {
            str2 = "";
        }
        return new C29271b4(null, null, null, null, jTa, null, null, C7Q, null, null, null, false, false, null, null, null, c31481er.A04, Long.valueOf(c31481er.A00), null, str2, NetInfoModule.CONNECTION_TYPE_NONE, null, null, null, null, null, false);
    }

    @Override // X.AbstractC29011ae
    public final AnonymousClass442 A03() {
        return this.A03;
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        return this.A0L;
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A1i;
    }

    public C29271b4(C50679MYx c50679MYx, L7G l7g, AnonymousClass442 anonymousClass442, SendMentionData$MentionData sendMentionData$MentionData, JTa jTa, C47588Kzy c47588Kzy, EnumC46200Kcc enumC46200Kcc, DirectThreadKey directThreadKey, C2EY c2ey, C47Z c47z, Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2, Integer num3, Long l, Long l2, Long l3, String str, String str2, String str3, String str4, String str5, List list, List list2, boolean z) {
        super(jTa, directThreadKey, l, l2.longValue());
        this.A08 = false;
        this.A0A = false;
        this.A0O = false;
        this.A0L = str;
        this.A07 = c47z;
        this.A0F = str2;
        this.A0N = list;
        this.A03 = anonymousClass442;
        this.A0J = str3;
        this.A02 = l7g;
        this.A05 = c47588Kzy;
        this.A04 = sendMentionData$MentionData;
        this.A08 = bool;
        ((AbstractC29011ae) this).A01 = enumC46200Kcc;
        this.A0K = str4;
        this.A0A = bool2;
        this.A09 = bool3;
        this.A0M = list2;
        this.A06 = c2ey;
        this.A0O = false;
        this.A00 = c50679MYx;
        this.A0B = num;
        this.A0C = num2;
        this.A0G = str5;
        this.A0P = z;
        this.A0D = num3;
        this.A0E = l3;
    }

    public C29271b4(AnonymousClass442 anonymousClass442, JTa jTa, EnumC46200Kcc enumC46200Kcc, DirectThreadKey directThreadKey, C2EY c2ey, Long l, Long l2, String str) {
        this(null, null, anonymousClass442, null, jTa, null, enumC46200Kcc, directThreadKey, c2ey, null, null, false, false, null, null, null, l, l2, null, str, NetInfoModule.CONNECTION_TYPE_NONE, null, null, null, null, null, false);
    }

    public C29271b4() {
        this.A08 = false;
        this.A0A = false;
        this.A0O = false;
    }
}
