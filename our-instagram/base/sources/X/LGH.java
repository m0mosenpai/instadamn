package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.io.IOException;
import java.io.StringWriter;

/* loaded from: classes8.dex */
public final class LGH {
    public C50679MYx A00;
    public C47791L8x A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public String A0b;
    public String A0c;
    public String A0d;
    public String A0e;
    public String A0f;
    public String A0g;
    public String A0h;
    public String A0i;
    public String A0j;
    public String A0k;
    public String A0l;
    public String A0m;
    public String A0n;
    public String A0o;
    public String A0p;
    public String A0q;
    public String A0r;
    public String A0s;
    public String A0t;
    public String A0u;
    public String A0v;
    public String A0w;
    public boolean A0x;

    public final String A00() {
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0S = AbstractC167007dF.A0S(stringWriter);
            A0S.A0S("is_shh_mode", this.A0O);
            C47791L8x c47791L8x = this.A01;
            if (c47791L8x != null) {
                A0S.A0r("poll");
                A0S.A0u(AbstractC46844Knd.A00(c47791L8x));
            }
            String str = this.A0p;
            if (str != null) {
                A0S.A0S(AbstractC31688Dvt.A00(), str);
            }
            String str2 = this.A0w;
            if (str2 != null) {
                A0S.A0S(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
            }
            A0S.A0S("action", this.A0D);
            String str3 = this.A0Q;
            if (str3 != null) {
                A0S.A0S("item_type", str3);
            }
            String str4 = this.A0t;
            if (str4 != null) {
                A0S.A0S("target_item_type", str4);
            }
            String str5 = this.A0u;
            if (str5 != null) {
                A0S.A0S("text", str5);
            }
            String str6 = this.A0R;
            if (str6 != null) {
                A0S.A0S("mentioned_user_ids", str6);
            }
            Boolean bool = this.A03;
            if (bool != null) {
                A0S.A0T("send_silently", bool.booleanValue());
            }
            String str7 = this.A0v;
            if (str7 != null) {
                A0S.A0S("text_sent_with_reshare_type", str7);
            }
            String str8 = this.A0L;
            if (str8 != null) {
                A0S.A0S("client_context", str8);
            }
            String str9 = this.A0X;
            if (str9 != null) {
                A0S.A0S("offline_threading_id", str9);
            }
            String str10 = this.A0E;
            if (str10 != null) {
                A0S.A0S("activity_status", str10);
            }
            Boolean bool2 = this.A02;
            if (bool2 != null) {
                A0S.A0T("is_x_transport_forward", bool2.booleanValue());
            }
            String str11 = this.A0h;
            if (str11 != null) {
                A0S.A0S("reaction_type", str11);
            }
            String str12 = this.A0g;
            if (str12 != null) {
                A0S.A0S("reaction_status", str12);
            }
            String str13 = this.A0N;
            if (str13 != null) {
                A0S.A0S("emoji", str13);
            }
            String str14 = this.A0q;
            if (str14 != null) {
                A0S.A0S("super_react_type", str14);
            }
            String str15 = this.A0f;
            if (str15 != null) {
                A0S.A0S("reaction_action_source", str15);
            }
            String str16 = this.A0K;
            if (str16 != null) {
                A0S.A0S("avatar_reaction", str16);
            }
            String str17 = this.A0P;
            if (str17 != null) {
                A0S.A0S("item_id", str17);
            }
            String str18 = this.A0Z;
            if (str18 != null) {
                A0S.A0S("original_message_client_context", str18);
            }
            String str19 = this.A0W;
            if (str19 != null) {
                A0S.A0S("node_type", str19);
            }
            A0S.A0T("sampled", this.A0x);
            String str20 = this.A0U;
            if (str20 != null) {
                A0S.A0S("mutation_token", str20);
            }
            String str21 = this.A0o;
            if (str21 != null) {
                A0S.A0S("send_attribution", str21);
            }
            String str22 = this.A0l;
            if (str22 != null) {
                A0S.A0S("replied_to_item_id", str22);
            }
            String str23 = this.A0k;
            if (str23 != null) {
                A0S.A0S("replied_to_client_context", str23);
            }
            String str24 = this.A0m;
            if (str24 != null) {
                A0S.A0S("replied_to_target_type", str24);
            }
            String str25 = this.A0j;
            if (str25 != null) {
                A0S.A0S("replied_to_action_source", str25);
            }
            String str26 = this.A0n;
            if (str26 != null) {
                A0S.A0S("replied_to_user_id", str26);
            }
            Long l = this.A0A;
            if (l != null) {
                A0S.A0R("ephemeral_duration_sec", l.longValue());
            }
            Long l2 = this.A0B;
            if (l2 != null) {
                A0S.A0R("ephemeral_view_duration_sec", l2.longValue());
            }
            String str27 = this.A0e;
            if (str27 != null) {
                A0S.A0S(AbstractC111324zv.A00(263), str27);
            }
            String str28 = this.A0S;
            if (str28 != null) {
                A0S.A0S("media_id", str28);
            }
            String str29 = this.A0a;
            if (str29 != null) {
                A0S.A0S("postback_payload", str29);
            }
            String str30 = this.A0b;
            if (str30 != null) {
                A0S.A0S("power_up_data", str30);
            }
            String str31 = this.A0d;
            if (str31 != null) {
                A0S.A0S("private_reply_post_link", str31);
            }
            String str32 = this.A0c;
            if (str32 != null) {
                A0S.A0S("private_reply_comment_id", str32);
            }
            String str33 = this.A0V;
            if (str33 != null) {
                A0S.A0S("nav_chain", str33);
            }
            String str34 = this.A0T;
            if (str34 != null) {
                A0S.A0S("mentioned_entities", str34);
            }
            String str35 = this.A0M;
            if (str35 != null) {
                A0S.A0S("commands", str35);
            }
            String str36 = this.A0J;
            if (str36 != null) {
                A0S.A0S("attachment_fbid", str36);
            }
            Boolean bool3 = this.A05;
            if (bool3 != null) {
                A0S.A0T("should_xpost", bool3.booleanValue());
            }
            C50679MYx c50679MYx = this.A00;
            if (c50679MYx != null) {
                A0S.A0r("prompt_data");
                LCD.A00(c50679MYx, A0S);
            }
            Integer num = this.A06;
            if (num != null) {
                A0S.A0Q("seed", num.intValue());
            }
            String str37 = this.A0G;
            if (str37 != null) {
                A0S.A0S("ai_product", str37);
            }
            String str38 = this.A0I;
            if (str38 != null) {
                A0S.A0S("associated_multimodal_item_id", str38);
            }
            String str39 = this.A0H;
            if (str39 != null) {
                A0S.A0S("associated_multimodal_client_context", str39);
            }
            Integer num2 = this.A07;
            if (num2 != null) {
                A0S.A0Q("is_written_with_ai", num2.intValue());
            }
            String str40 = this.A0F;
            if (str40 != null) {
                A0S.A0S("ai_assistant_extras", str40);
            }
            Boolean bool4 = this.A04;
            if (bool4 != null) {
                A0S.A0T("should_skip_genai_eval", bool4.booleanValue());
            }
            Integer num3 = this.A09;
            if (num3 != null) {
                A0S.A0Q("thread_label", AbstractC46786Kmh.A00(num3));
            }
            Long l3 = this.A0C;
            if (l3 != null) {
                A0S.A0R("scheduled_timestamp", l3.longValue());
            }
            String str41 = this.A0Y;
            if (str41 != null) {
                A0S.A0S("opaque_message", str41);
            }
            Integer num4 = this.A08;
            if (num4 != null) {
                A0S.A0Q("opaque_message_type", num4.intValue());
            }
            String str42 = this.A0s;
            if (str42 != null) {
                A0S.A0S("target_item_id", str42);
            }
            String str43 = this.A0r;
            if (str43 != null) {
                A0S.A0S("supplemental_key", str43);
            }
            String str44 = this.A0i;
            if (str44 != null) {
                A0S.A0S("recipient_users", str44);
            }
            return AbstractC167017dG.A0l(A0S, stringWriter);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, X.L7F] */
    public LGH(C50679MYx c50679MYx, C47791L8x c47791L8x, C47948LGd c47948LGd, C2EY c2ey, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, Integer num2, Integer num3, Integer num4, Long l, Long l2, Long l3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, boolean z, boolean z2) {
        String str31 = null;
        this.A0p = str;
        this.A0w = str2;
        this.A0D = str3;
        this.A0Q = null;
        this.A0t = null;
        this.A0u = str4;
        this.A0R = str5;
        this.A03 = bool;
        this.A0v = str6;
        this.A0L = str7;
        this.A0E = str8;
        this.A02 = bool2;
        this.A0h = null;
        this.A0g = null;
        this.A0N = null;
        this.A0q = null;
        this.A0f = null;
        this.A0K = null;
        this.A0P = null;
        this.A0Z = null;
        this.A0W = null;
        this.A0x = z;
        this.A0U = str9;
        this.A0o = str10;
        this.A0l = str11;
        this.A0k = str12;
        this.A0m = str13;
        this.A0j = str14;
        this.A0n = str15;
        this.A0A = l;
        this.A0B = l2;
        this.A0e = null;
        this.A0S = null;
        this.A0a = str16;
        this.A0b = str17;
        this.A0d = str18;
        this.A0c = str19;
        this.A0V = null;
        this.A0T = str20;
        this.A0M = str21;
        this.A0J = str22;
        this.A05 = bool3;
        this.A00 = c50679MYx;
        this.A06 = num;
        this.A0G = str23;
        this.A0I = str24;
        this.A0H = str25;
        this.A07 = num2;
        this.A0F = str26;
        this.A04 = bool4;
        this.A09 = num3;
        this.A0C = l3;
        this.A0Y = str27;
        this.A08 = num4;
        this.A0s = str28;
        this.A0r = str29;
        this.A0i = str30;
        this.A0X = str7;
        C1QN c1qn = C1QM.A00;
        C14360o3.A07(c1qn);
        this.A0V = c1qn.A02.A02;
        this.A0O = z2 ? RealtimeSubscription.GRAPHQL_MQTT_VERSION : "0";
        if (c2ey != null) {
            this.A0Q = c2ey.A00;
            AbstractC46902Koj abstractC46902Koj = AbstractC46902Koj.$redex_init_class;
            switch (c2ey.ordinal()) {
                case 2:
                case 5:
                case 110:
                    return;
                case 9:
                case 10:
                    if (c47948LGd != null) {
                        this.A0h = c47948LGd.A09;
                        this.A0g = c47948LGd.A07;
                        this.A0P = c47948LGd.A02;
                        this.A0Z = c47948LGd.A04;
                        this.A0W = "item";
                        this.A0t = c47948LGd.A03;
                        this.A0N = c47948LGd.A01;
                        this.A0q = c47948LGd.A08;
                        this.A0f = c47948LGd.A05;
                        L7F l7f = c47948LGd.A00;
                        if (l7f != null) {
                            String str32 = l7f.A00;
                            String str33 = l7f.A01;
                            ?? obj = new Object();
                            obj.A00 = str32;
                            obj.A01 = str33;
                            obj.A02 = null;
                            StringWriter stringWriter = new StringWriter();
                            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                            LC7.A00(A0A, obj);
                            A0A.close();
                            str31 = stringWriter.toString();
                        }
                        this.A0K = str31;
                        return;
                    }
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    A1C.append("Content type == ");
                    A1C.append(c2ey);
                    throw AbstractC166987dD.A14(AbstractC166997dE.A0x(" but DirectReactionMutation is null", A1C));
                case Process.SIGTERM /* 15 */:
                case Process.SIGSTOP /* 19 */:
                    this.A0e = this.A0P;
                    return;
                case 37:
                case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                    this.A0S = this.A0P;
                    return;
                case 69:
                    this.A01 = c47791L8x;
                    return;
                default:
                    throw AbstractC37303Gc4.A0M(c2ey, "Unhandled direct share type: ", AbstractC166987dD.A1C());
            }
        }
    }

    public LGH() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "send_item", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false);
    }
}
