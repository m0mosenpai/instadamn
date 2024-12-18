package X;

import android.content.ContentValues;
import android.os.Parcelable;
import android.os.Process;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.collect.ImmutableList;
import com.google.common.io.Closeables;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.smartsuggestion.model.SmartSuggestion;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.mediasize.ImageInfoImpl;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.user.model.User;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.2S3, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2S3 extends C2RB {
    @Override // X.C2RB
    public final /* bridge */ /* synthetic */ ContentValues A0B(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        C81663kb c81663kb = (C81663kb) obj;
        C14360o3.A0B(c81663kb, 0);
        ContentValues contentValues = new ContentValues();
        C9FY c9fy = new C9FY(12, contentValues, this, c81663kb, byteArrayOutputStream);
        if (((Boolean) c81663kb.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = c81663kb.A03.readLock();
            readLock.lock();
            try {
                c9fy.invoke();
                return contentValues;
            } finally {
                readLock.unlock();
            }
        }
        synchronized (c81663kb.A01) {
            c9fy.invoke();
        }
        return contentValues;
    }

    /* JADX WARN: Code restructure failed: missing block: B:827:0x0b8b, code lost:
    
        if (r0 != r1) goto L607;
     */
    /* JADX WARN: Removed duplicated region for block: B:822:0x0b7d  */
    @Override // X.C2RB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object A0C(X.C16L r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 3027
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2S3.A0C(X.16L, boolean):java.lang.Object");
    }

    @Override // X.C2RB
    public final String A0E() {
        return "thread_info";
    }

    @Override // X.C2RB
    public final String A0F() {
        return "threads";
    }

    public final ArrayList A0I(C2DX c2dx, List list) {
        C14360o3.A0B(list, 0);
        C14360o3.A0B(c2dx, 1);
        AbstractC09800fd.A01("DirectThreadSQLiteTable.parseThreadSummaries", 590653951);
        try {
            ArrayList arrayList = new ArrayList();
            try {
                Iterator it = list.iterator();
                int i = 0;
                while (it.hasNext()) {
                    byte[] bArr = (byte[]) it.next();
                    Object A0C = A0C(C07950bF.A04.A02(this.A00, bArr), false);
                    if (A0C != null) {
                        arrayList.add(A0C);
                    }
                    i += bArr.length;
                }
                c2dx.A03("thread_byte_size:", i);
            } catch (C90173zy | IOException unused) {
                C18950wb.A00.AEp("Error parsing json.", 20134884).report();
            }
            AbstractC09800fd.A00(1737581396);
            return arrayList;
        } catch (Throwable th) {
            AbstractC09800fd.A00(-1240768019);
            throw th;
        }
    }

    public final ArrayList A0J(C2DX c2dx, byte[] bArr) {
        AbstractC09800fd.A01("DirectThreadSQLiteTable.parseThreadSummaries", -628410635);
        try {
            ArrayList arrayList = new ArrayList();
            UserSession userSession = this.A00;
            C06090Tz c06090Tz = C06090Tz.A05;
            boolean A06 = C18U.A06(c06090Tz, userSession, 36326627231152130L);
            Object valueOf = Long.valueOf(C18U.A01(c06090Tz, userSession, 36608102207919796L));
            C07950bF c07950bF = null;
            int i = 0;
            try {
                if (A06) {
                    try {
                        try {
                            int myTid = Process.myTid();
                            i = Process.getThreadPriority(myTid);
                            C14360o3.A0C(valueOf, "null cannot be cast to non-null type kotlin.Int");
                            Process.setThreadPriority(myTid, ((Integer) valueOf).intValue());
                        } catch (C90173zy unused) {
                            C18950wb.A00.AEp("Error parsing json.", 20134884).report();
                        }
                    } catch (IOException unused2) {
                        C18950wb.A00.AEp("Error parsing json.", 20134884).report();
                    }
                }
                c07950bF = C07950bF.A04.A02(userSession, bArr);
                if (c07950bF.A11() == C16R.A0C) {
                    while (c07950bF.A1J() != C16R.A08) {
                        Object A0C = A0C(c07950bF, false);
                        if (A0C != null) {
                            arrayList.add(A0C);
                        }
                    }
                }
                c2dx.A03("thread_byte_size:", bArr.length);
                try {
                    Closeables.A00(c07950bF, true);
                } catch (IOException unused3) {
                }
                if (A06) {
                    Process.setThreadPriority(Process.myTid(), i);
                }
                AbstractC09800fd.A00(-648163192);
                return arrayList;
            } finally {
            }
        } catch (Throwable th) {
            AbstractC09800fd.A00(-7872596);
            throw th;
        }
    }

    @Override // X.C2RB
    public final /* bridge */ /* synthetic */ Object A0D(UserSession userSession, Object obj) {
        C81663kb c81663kb = (C81663kb) obj;
        C14360o3.A0B(c81663kb, 1);
        return AbstractC81673kc.A01(userSession, c81663kb);
    }

    @Override // X.C2RB
    public final /* bridge */ /* synthetic */ void A0G(AnonymousClass182 anonymousClass182, Object obj) {
        C81663kb c81663kb = (C81663kb) obj;
        C14360o3.A0B(c81663kb, 1);
        C80693iy c80693iy = c81663kb.A02;
        anonymousClass182.A0d();
        anonymousClass182.A0S("life_cycle_state", AbstractC127225p0.A00(c80693iy.A1h));
        if (c80693iy.A21 != null) {
            anonymousClass182.A0r("last_seen_at");
            anonymousClass182.A0d();
            for (Map.Entry entry : c80693iy.A21.entrySet()) {
                if (!C16V.A04(anonymousClass182, entry)) {
                    AbstractC80983jS.A00(anonymousClass182, (C80993jT) entry.getValue());
                }
            }
            anonymousClass182.A0a();
        }
        String str = c80693iy.A1q;
        if (str != null) {
            anonymousClass182.A0S(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        }
        String str2 = c80693iy.A1t;
        if (str2 != null) {
            anonymousClass182.A0S("thread_v2_id", str2);
        }
        Long l = c80693iy.A1i;
        if (l != null) {
            anonymousClass182.A0R("group_thread_jid", l.longValue());
        }
        String str3 = c80693iy.A1l;
        if (str3 != null) {
            anonymousClass182.A0S("last_mentioned_item_id", str3);
        }
        anonymousClass182.A0Q("reshare_send_count", c80693iy.A0D);
        anonymousClass182.A0Q("reshare_receive_count", c80693iy.A0C);
        anonymousClass182.A0Q("expiring_media_send_count", c80693iy.A03);
        anonymousClass182.A0Q("expiring_media_receive_count", c80693iy.A02);
        anonymousClass182.A0Q("thread_subtype", c80693iy.A0I);
        anonymousClass182.A0Q("seen_count", c80693iy.A0F);
        anonymousClass182.A0Q("active_count", c80693iy.A00);
        if (c80693iy.A1V != null) {
            anonymousClass182.A0r("inviter");
            User user = c80693iy.A1V;
            Parcelable.Creator creator = User.CREATOR;
            AbstractC38851rI.A08(anonymousClass182, user);
        }
        if (c80693iy.A29 != null) {
            C16V.A03(anonymousClass182, "recipients");
            for (User user2 : c80693iy.A29) {
                if (user2 != null) {
                    Parcelable.Creator creator2 = User.CREATOR;
                    AbstractC38851rI.A08(anonymousClass182, user2);
                }
            }
            anonymousClass182.A0Z();
        }
        Boolean bool = c80693iy.A1Z;
        if (bool != null) {
            anonymousClass182.A0T("is_group", bool.booleanValue());
        }
        Boolean bool2 = c80693iy.A1g;
        if (bool2 != null) {
            anonymousClass182.A0T("will_xac_be_readonly", bool2.booleanValue());
        }
        Boolean bool3 = c80693iy.A1d;
        if (bool3 != null) {
            anonymousClass182.A0T("is_xac_readonly", bool3.booleanValue());
        }
        Boolean bool4 = c80693iy.A1e;
        if (bool4 != null) {
            anonymousClass182.A0T("is_xac_thread", bool4.booleanValue());
        }
        if (c80693iy.A26 != null) {
            C16V.A03(anonymousClass182, "left_users");
            for (User user3 : c80693iy.A26) {
                if (user3 != null) {
                    Parcelable.Creator creator3 = User.CREATOR;
                    AbstractC38851rI.A08(anonymousClass182, user3);
                }
            }
            anonymousClass182.A0Z();
        }
        if (c80693iy.A22 != null) {
            C16V.A03(anonymousClass182, "thread_admins");
            for (String str4 : c80693iy.A22) {
                if (str4 != null) {
                    anonymousClass182.A0u(str4);
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0T("named", c80693iy.A2e);
        if (c80693iy.A2E != null) {
            anonymousClass182.A0r("nicknames");
            anonymousClass182.A0d();
            for (Map.Entry entry2 : c80693iy.A2E.entrySet()) {
                if (!C16V.A04(anonymousClass182, entry2)) {
                    anonymousClass182.A0u((String) entry2.getValue());
                }
            }
            anonymousClass182.A0a();
        }
        if (c80693iy.A2F != null) {
            anonymousClass182.A0r("nicknames_setting");
            anonymousClass182.A0d();
            for (Map.Entry entry3 : c80693iy.A2F.entrySet()) {
                if (!C16V.A04(anonymousClass182, entry3)) {
                    anonymousClass182.A0u((String) entry3.getValue());
                }
            }
            anonymousClass182.A0a();
        }
        if (c80693iy.A0T != null) {
            anonymousClass182.A0r("fan_club_eligibility");
            C9BW c9bw = c80693iy.A0T;
            anonymousClass182.A0d();
            Boolean bool5 = (Boolean) c9bw.A01;
            if (bool5 != null) {
                anonymousClass182.A0T("is_viewer_eligible_to_subscribe", bool5.booleanValue());
            }
            Boolean bool6 = (Boolean) c9bw.A00;
            if (bool6 != null) {
                anonymousClass182.A0T("is_viewer_eligible_for_free_trial", bool6.booleanValue());
            }
            anonymousClass182.A0a();
        }
        anonymousClass182.A0Q("thread_label", c80693iy.A0H);
        Boolean bool7 = c80693iy.A1b;
        if (bool7 != null) {
            anonymousClass182.A0T("is_pin", bool7.booleanValue());
        }
        anonymousClass182.A0R("pinned_timestamp", c80693iy.A0O);
        if (c80693iy.A0x != null) {
            anonymousClass182.A0r("theme");
            AbstractC127235p1.A00(anonymousClass182, c80693iy.A0x);
        }
        if (c80693iy.A0c != null) {
            anonymousClass182.A0r("theme_data");
            AbstractC65783Tu1.A00(anonymousClass182, c80693iy.A0c);
        }
        if (c80693iy.A0P != null) {
            anonymousClass182.A0r("snippet");
            C9BH c9bh = c80693iy.A0P;
            anonymousClass182.A0d();
            C206349Br c206349Br = (C206349Br) c9bh.A00;
            if (c206349Br != null) {
                anonymousClass182.A0r("last_message");
                anonymousClass182.A0d();
                String str5 = c206349Br.A02;
                if (str5 != null) {
                    anonymousClass182.A0S("text", str5);
                }
                anonymousClass182.A0R("timestamp", c206349Br.A01);
                anonymousClass182.A0a();
            }
            anonymousClass182.A0a();
        }
        if (c80693iy.A0X != null) {
            anonymousClass182.A0r("reminder");
            C51755Mte c51755Mte = c80693iy.A0X;
            anonymousClass182.A0d();
            Number number = (Number) c51755Mte.A00;
            if (number != null) {
                anonymousClass182.A0R("notification_time", number.longValue());
            }
            anonymousClass182.A0a();
        }
        if (c80693iy.A11 != null) {
            anonymousClass182.A0r("last_daily_prompt");
            C32067E6t c32067E6t = c80693iy.A11;
            anonymousClass182.A0d();
            String str6 = c32067E6t.A03;
            if (str6 != null) {
                anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str6);
            }
            String str7 = c32067E6t.A02;
            if (str7 != null) {
                anonymousClass182.A0S("item_id", str7);
            }
            Long l2 = c32067E6t.A00;
            if (l2 != null) {
                anonymousClass182.A0R("end_timestamp_s", l2.longValue());
            }
            String str8 = c32067E6t.A01;
            if (str8 != null) {
                anonymousClass182.A0S("grid_view_url", str8);
            }
            anonymousClass182.A0T("has_creator_replied", c32067E6t.A05);
            anonymousClass182.A0T("has_submissions", c32067E6t.A06);
            anonymousClass182.A0T("has_viewer_contributed", c32067E6t.A07);
            String str9 = c32067E6t.A04;
            if (str9 != null) {
                anonymousClass182.A0S("text", str9);
            }
            anonymousClass182.A0a();
        }
        if (c80693iy.A12 != null) {
            anonymousClass182.A0r("last_challenge_prompt");
            E6W e6w = c80693iy.A12;
            anonymousClass182.A0d();
            String str10 = e6w.A03;
            if (str10 != null) {
                anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str10);
            }
            String str11 = e6w.A05;
            if (str11 != null) {
                anonymousClass182.A0S("text", str11);
            }
            Long l3 = e6w.A01;
            if (l3 != null) {
                anonymousClass182.A0R("end_timestamp_s", l3.longValue());
            }
            anonymousClass182.A0T("is_active", e6w.A07);
            String str12 = e6w.A02;
            if (str12 != null) {
                anonymousClass182.A0S("grid_view_url", str12);
            }
            String str13 = e6w.A04;
            if (str13 != null) {
                anonymousClass182.A0S("prize", str13);
            }
            Integer num = e6w.A00;
            if (num != null) {
                anonymousClass182.A0Q("submission_count", num.intValue());
            }
            anonymousClass182.A0T("has_viewer_contributed", e6w.A06);
            anonymousClass182.A0a();
        }
        String str14 = c80693iy.A1n;
        if (str14 != null) {
            anonymousClass182.A0S("recurring_prompt_type", str14);
        }
        if (c80693iy.A2B != null) {
            C16V.A03(anonymousClass182, "most_recent_polls");
            for (C9CD c9cd : c80693iy.A2B) {
                if (c9cd != null) {
                    anonymousClass182.A0d();
                    String str15 = c9cd.A01;
                    if (str15 != null) {
                        anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str15);
                    }
                    String str16 = c9cd.A02;
                    if (str16 != null) {
                        anonymousClass182.A0S("text", str16);
                    }
                    anonymousClass182.A0T("has_viewer_voted", c9cd.A03);
                    Number number2 = (Number) c9cd.A00;
                    if (number2 != null) {
                        anonymousClass182.A0R("timestamp_s", number2.longValue());
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        if (c80693iy.A0b != null) {
            anonymousClass182.A0r("ongoing_live");
            C50679MYx c50679MYx = c80693iy.A0b;
            anonymousClass182.A0d();
            String str17 = c50679MYx.A00;
            if (str17 != null) {
                anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str17);
            }
            String str18 = c50679MYx.A01;
            if (str18 != null) {
                anonymousClass182.A0S(DialogModule.KEY_TITLE, str18);
            }
            anonymousClass182.A0a();
        }
        anonymousClass182.A0T("marked_as_unread", c80693iy.A2b);
        anonymousClass182.A0T("muted", c80693iy.A2d);
        anonymousClass182.A0T("mentions_muted", c80693iy.A2c);
        anonymousClass182.A0T("reactions_muted", c80693iy.A2h);
        anonymousClass182.A0T("vc_muted", c80693iy.A2l);
        anonymousClass182.A0T("is_translation_enabled", c80693iy.A2k);
        if (c80693iy.A20 != null) {
            anonymousClass182.A0r("thread_languages");
            anonymousClass182.A0d();
            for (Map.Entry entry4 : c80693iy.A20.entrySet()) {
                if (!C16V.A04(anonymousClass182, entry4)) {
                    anonymousClass182.A0u((String) entry4.getValue());
                }
            }
            anonymousClass182.A0a();
        }
        anonymousClass182.A0Q("translation_banner_impression_count", c80693iy.A0J);
        anonymousClass182.A0T("canonical", c80693iy.A2W);
        anonymousClass182.A0T("approval_required_for_new_members", c80693iy.A2T);
        anonymousClass182.A0T("has_restricted_user", c80693iy.A2Q);
        String str19 = c80693iy.A1s;
        if (str19 != null) {
            anonymousClass182.A0S("thread_title", str19);
        }
        if (c80693iy.A10 != null) {
            anonymousClass182.A0r("thread_image");
            C106414qv c106414qv = c80693iy.A10;
            anonymousClass182.A0d();
            ImageInfoImpl imageInfoImpl = c106414qv.A00;
            anonymousClass182.A0r("image_versions2");
            AbstractC39101rj.A00(anonymousClass182, imageInfoImpl);
            anonymousClass182.A0a();
        }
        anonymousClass182.A0T("pending", c80693iy.A2g);
        if (c80693iy.A24 != null) {
            C16V.A03(anonymousClass182, "icebreakers");
            for (C105954q9 c105954q9 : c80693iy.A24) {
                if (c105954q9 != null) {
                    C4q8.A00(anonymousClass182, c105954q9);
                }
            }
            anonymousClass182.A0Z();
        }
        if (c80693iy.A0U != null) {
            anonymousClass182.A0r("persistent_menu_icebreakers");
            C9BW c9bw2 = c80693iy.A0U;
            anonymousClass182.A0d();
            if (c9bw2.A01 != null) {
                C16V.A03(anonymousClass182, "persistent_icebreakers");
                for (C105954q9 c105954q92 : (List) c9bw2.A01) {
                    if (c105954q92 != null) {
                        C4q8.A00(anonymousClass182, c105954q92);
                    }
                }
                anonymousClass182.A0Z();
            }
            Boolean bool8 = (Boolean) c9bw2.A00;
            if (bool8 != null) {
                anonymousClass182.A0T("are_default_icebreakers", bool8.booleanValue());
            }
            anonymousClass182.A0a();
        }
        if (c80693iy.A0t != null) {
            anonymousClass182.A0r("public_chat_metadata");
            C81543kP c81543kP = c80693iy.A0t;
            anonymousClass182.A0d();
            anonymousClass182.A0Q("audience_type", c81543kP.A00);
            Integer num2 = c81543kP.A05;
            if (num2 != null) {
                anonymousClass182.A0Q("channel_end_source", num2.intValue());
            }
            anonymousClass182.A0Q("channel_end_timestamp", c81543kP.A01);
            anonymousClass182.A0T("is_public", c81543kP.A0Q);
            anonymousClass182.A0T("is_pinnable_to_viewer_profile", c81543kP.A0O);
            anonymousClass182.A0T("is_pinned_to_viewer_profile", c81543kP.A0P);
            anonymousClass182.A0T("is_added_to_inbox", c81543kP.A0I);
            anonymousClass182.A0T("is_periodic_polling_enabled", c81543kP.A0N);
            String str20 = c81543kP.A07;
            if (str20 != null) {
                anonymousClass182.A0S("creator_igid", str20);
            }
            if (c81543kP.A04 != null) {
                anonymousClass182.A0r("creator_profile_picture_url");
                AbstractC222616c.A01(anonymousClass182, c81543kP.A04);
            }
            String str21 = c81543kP.A08;
            if (str21 != null) {
                anonymousClass182.A0S("creator_username", str21);
            }
            if (c81543kP.A0D != null) {
                C16V.A03(anonymousClass182, "joined_collaborator_ids");
                for (String str22 : c81543kP.A0D) {
                    if (str22 != null) {
                        anonymousClass182.A0u(str22);
                    }
                }
                anonymousClass182.A0Z();
            }
            if (c81543kP.A0B != null) {
                C16V.A03(anonymousClass182, "invited_collaborator_ids");
                for (String str23 : c81543kP.A0B) {
                    if (str23 != null) {
                        anonymousClass182.A0u(str23);
                    }
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0Q("added_to_inbox_count", c81543kP.A02);
            anonymousClass182.A0T("is_subscribed_collaborator", c81543kP.A0R);
            if (c81543kP.A0E != null) {
                C16V.A03(anonymousClass182, "joined_moderator_ids");
                for (String str24 : c81543kP.A0E) {
                    if (str24 != null) {
                        anonymousClass182.A0u(str24);
                    }
                }
                anonymousClass182.A0Z();
            }
            if (c81543kP.A0C != null) {
                C16V.A03(anonymousClass182, "invited_moderator_ids");
                for (String str25 : c81543kP.A0C) {
                    if (str25 != null) {
                        anonymousClass182.A0u(str25);
                    }
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0T("is_creator_minor", c81543kP.A0K);
            anonymousClass182.A0T("has_creator_sent_msg", c81543kP.A0H);
            anonymousClass182.A0T("is_comments_enabled", c81543kP.A0J);
            anonymousClass182.A0T("is_hidden_in_messages_primary_tab", c81543kP.A0L);
            if (c81543kP.A0F != null) {
                C16V.A03(anonymousClass182, "social_context_facepile_users");
                for (C45127Jxw c45127Jxw : c81543kP.A0F) {
                    if (c45127Jxw != null) {
                        anonymousClass182.A0d();
                        String str26 = c45127Jxw.A01;
                        if (str26 != null) {
                            anonymousClass182.A0S(AbstractC31688Dvt.A02(27, 8, 55), str26);
                        }
                        if (c45127Jxw.A00 != null) {
                            anonymousClass182.A0r("profile_pic_url");
                            AbstractC222616c.A01(anonymousClass182, (ImageUrl) c45127Jxw.A00);
                        }
                        anonymousClass182.A0a();
                    }
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0T("is_xposting_eligible", c81543kP.A0S);
            if (c81543kP.A0G != null) {
                C16V.A03(anonymousClass182, "xposting_enabled_channels");
                for (C9CK c9ck : c81543kP.A0G) {
                    if (c9ck != null) {
                        FUX.A00(c9ck, anonymousClass182);
                    }
                }
                anonymousClass182.A0Z();
            }
            Integer num3 = c81543kP.A06;
            if (num3 != null) {
                anonymousClass182.A0Q("xposting_available_channel_count", num3.intValue());
            }
            if (c81543kP.A03 != null) {
                anonymousClass182.A0r("first_available_xpost_channel");
                FUX.A00(c81543kP.A03, anonymousClass182);
            }
            if (c81543kP.A09 != null) {
                C16V.A03(anonymousClass182, "hidden_emojis");
                for (String str27 : c81543kP.A09) {
                    if (str27 != null) {
                        anonymousClass182.A0u(str27);
                    }
                }
                anonymousClass182.A0Z();
            }
            if (c81543kP.A0A != null) {
                C16V.A03(anonymousClass182, "channel_milestones");
                for (FKZ fkz : c81543kP.A0A) {
                    if (fkz != null) {
                        anonymousClass182.A0d();
                        anonymousClass182.A0Q("milestone_value", fkz.A00);
                        String str28 = fkz.A01;
                        if (str28 != null) {
                            anonymousClass182.A0S("last_updated", str28);
                        }
                        String str29 = fkz.A02;
                        if (str29 != null) {
                            anonymousClass182.A0S("milestone_type", str29);
                        }
                        anonymousClass182.A0a();
                    }
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0T("is_linked_account_eligible_for_xposting", c81543kP.A0M);
            anonymousClass182.A0a();
        }
        if (c80693iy.A0Z != null) {
            anonymousClass182.A0r("ig_school_metadata");
            C45127Jxw c45127Jxw2 = c80693iy.A0Z;
            anonymousClass182.A0d();
            String str30 = c45127Jxw2.A01;
            if (str30 != null) {
                anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str30);
            }
            if (c45127Jxw2.A00 != null) {
                anonymousClass182.A0r("school_data");
                C31200Dnj c31200Dnj = (C31200Dnj) c45127Jxw2.A00;
                anonymousClass182.A0d();
                String str31 = c31200Dnj.A00;
                if (str31 != null) {
                    anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str31);
                }
                anonymousClass182.A0a();
            }
            anonymousClass182.A0a();
        }
        if (c80693iy.A0v != null) {
            anonymousClass182.A0r("ig_thread_capabilities");
            C81563kR c81563kR = c80693iy.A0v;
            anonymousClass182.A0d();
            anonymousClass182.A0R("capabilities_0", c81563kR.A00);
            anonymousClass182.A0R("capabilities_1", c81563kR.A01);
            anonymousClass182.A0a();
        }
        if (c80693iy.A0e != null) {
            anonymousClass182.A0r("welcome_message");
            C34498FIk c34498FIk = c80693iy.A0e;
            anonymousClass182.A0d();
            String str32 = c34498FIk.A01;
            if (str32 != null) {
                anonymousClass182.A0S("welcome_message_text", str32);
            }
            String str33 = c34498FIk.A00;
            if (str33 != null) {
                anonymousClass182.A0S("emoji", str33);
            }
            anonymousClass182.A0a();
        }
        String str34 = c80693iy.A1v;
        if (str34 != null) {
            anonymousClass182.A0S("video_call_id", str34);
        }
        String str35 = c80693iy.A1w;
        if (str35 != null) {
            anonymousClass182.A0S("encoded_server_data_info", str35);
        }
        anonymousClass182.A0T("thread_has_audio_only_call", c80693iy.A2K);
        anonymousClass182.A0Q("folder", c80693iy.A04);
        String str36 = c80693iy.A1j;
        if (str36 != null) {
            anonymousClass182.A0S("custom_folder_id", str36);
        }
        anonymousClass182.A0Q("input_mode", c80693iy.A06);
        String str37 = c80693iy.A1r;
        if (str37 != null) {
            anonymousClass182.A0S("thread_messages_oldest_cursor", str37);
        }
        anonymousClass182.A0T("has_older_thread_messages_on_server", c80693iy.A2O);
        anonymousClass182.A0T("has_older_shh_messages_to_page_to", c80693iy.A2N);
        String str38 = c80693iy.A1x;
        if (str38 != null) {
            anonymousClass182.A0S("visual_messages_newest_cursor", str38);
        }
        String str39 = c80693iy.A1y;
        if (str39 != null) {
            anonymousClass182.A0S("visual_messages_next_cursor", str39);
        }
        String str40 = c80693iy.A1z;
        if (str40 != null) {
            anonymousClass182.A0S("visual_messages_prev_cursor", str40);
        }
        anonymousClass182.A0T("has_newer_visual_messages_on_server", c80693iy.A2M);
        anonymousClass182.A0Q("unseen_visual_messages_server_count", c80693iy.A0M);
        if (c80693iy.A0s != null) {
            anonymousClass182.A0r("policy_violation");
            AbstractC31321Dpj.A00(anonymousClass182, c80693iy.A0s);
        }
        anonymousClass182.A0T("shh_mode_replay_eligible", c80693iy.A2o);
        anonymousClass182.A0T("shh_mode_enabled", c80693iy.A2n);
        if (c80693iy.A25 != null) {
            C16V.A03(anonymousClass182, "pending_user_ids");
            for (String str41 : c80693iy.A25) {
                if (str41 != null) {
                    anonymousClass182.A0u(str41);
                }
            }
            anonymousClass182.A0Z();
        }
        String str42 = c80693iy.A1p;
        if (str42 != null) {
            anonymousClass182.A0S("shh_mode_toggler_user_id", str42);
        }
        anonymousClass182.A0T("is_fanclub_subscriber_thread", c80693iy.A2a);
        anonymousClass182.A0T("is_creator_thread", c80693iy.A2Z);
        anonymousClass182.A0Q("ai_agent_social_signal_message_count", c80693iy.A01);
        anonymousClass182.A0T("is_business_thread", c80693iy.A2V);
        if (c80693iy.A1Q != null) {
            anonymousClass182.A0r("creator_subscriber_thread_response");
            AbstractC125285lZ.A00(anonymousClass182, c80693iy.A1Q);
        }
        if (c80693iy.A1P != null) {
            anonymousClass182.A0r("creator_broadcast_thread_data");
            AbstractC121425ei.A00(anonymousClass182, c80693iy.A1P);
        }
        if (c80693iy.A0y != null) {
            anonymousClass182.A0r("visual_thread");
            FGH fgh = c80693iy.A0y;
            anonymousClass182.A0d();
            anonymousClass182.A0R("last_visual_message_ts", fgh.A00);
            anonymousClass182.A0a();
        }
        anonymousClass182.A0Q("message_request_status", c80693iy.A08);
        if (c80693iy.A2C != null) {
            C16V.A03(anonymousClass182, "thread_context_items");
            for (C81583kT c81583kT : c80693iy.A2C) {
                if (c81583kT != null) {
                    anonymousClass182.A0d();
                    anonymousClass182.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, c81583kT.A00);
                    String str43 = c81583kT.A01;
                    if (str43 != null) {
                        anonymousClass182.A0S("text", str43);
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        String str44 = c80693iy.A1o;
        if (str44 != null) {
            anonymousClass182.A0S("responsiveness_category", str44);
        }
        Boolean bool9 = c80693iy.A1X;
        if (bool9 != null) {
            anonymousClass182.A0T("is_close_friend_thread", bool9.booleanValue());
        }
        Boolean bool10 = c80693iy.A1c;
        if (bool10 != null) {
            anonymousClass182.A0T("is_verified_thread", bool10.booleanValue());
        }
        EnumC81843l3 enumC81843l3 = c80693iy.A1O;
        if (enumC81843l3 != null) {
            anonymousClass182.A0S("biz_thread_throttling_state", enumC81843l3.A00);
        }
        Boolean bool11 = c80693iy.A1a;
        if (bool11 != null) {
            anonymousClass182.A0T("is_limited", bool11.booleanValue());
        }
        if (c80693iy.A23 != null) {
            C16V.A03(anonymousClass182, "label_items");
            for (C206419By c206419By : c80693iy.A23) {
                if (c206419By != null) {
                    anonymousClass182.A0d();
                    String str45 = c206419By.A02;
                    if (str45 != null) {
                        anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str45);
                    }
                    Integer num4 = (Integer) c206419By.A01;
                    if (num4 != null) {
                        anonymousClass182.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, AbstractC46786Kmh.A00(num4));
                    }
                    anonymousClass182.A0R("modified_at", c206419By.A00);
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        if (c80693iy.A0S != null) {
            anonymousClass182.A0r("persistent_menu");
            C9BW c9bw3 = c80693iy.A0S;
            anonymousClass182.A0d();
            if (c9bw3.A00 != null) {
                C16V.A03(anonymousClass182, "postback_items");
                for (C105954q9 c105954q93 : (List) c9bw3.A00) {
                    if (c105954q93 != null) {
                        C4q8.A00(anonymousClass182, c105954q93);
                    }
                }
                anonymousClass182.A0Z();
            }
            if (c9bw3.A01 != null) {
                C16V.A03(anonymousClass182, "url_items");
                for (C9CJ c9cj : (List) c9bw3.A01) {
                    if (c9cj != null) {
                        anonymousClass182.A0d();
                        String str46 = c9cj.A00;
                        if (str46 != null) {
                            anonymousClass182.A0S(DialogModule.KEY_TITLE, str46);
                        }
                        String str47 = c9cj.A01;
                        if (str47 != null) {
                            anonymousClass182.A0S("url", str47);
                        }
                        String str48 = c9cj.A02;
                        if (str48 != null) {
                            anonymousClass182.A0S("url_text", str48);
                        }
                        anonymousClass182.A0a();
                    }
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0a();
        }
        EnumC46982Dm enumC46982Dm = c80693iy.A1S;
        if (enumC46982Dm != null) {
            anonymousClass182.A0Q("system_folder", enumC46982Dm.A00);
        }
        anonymousClass182.A0Q("group_link_joinable_mode", c80693iy.A05);
        String str49 = c80693iy.A1k;
        if (str49 != null) {
            anonymousClass182.A0S("joinable_group_link", str49);
        }
        if (c80693iy.A1T != null) {
            anonymousClass182.A0r("smart_suggestion");
            SmartSuggestion smartSuggestion = c80693iy.A1T;
            anonymousClass182.A0d();
            Integer num5 = smartSuggestion.A03;
            if (num5 != null) {
                anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, AbstractC82353lx.A00(num5));
            }
            EnumC82333lv enumC82333lv = smartSuggestion.A02;
            if (enumC82333lv != null) {
                anonymousClass182.A0S(CacheBehaviorLogger.SOURCE, enumC82333lv.A01);
            }
            String str50 = smartSuggestion.A04;
            if (str50 != null) {
                anonymousClass182.A0S("body", str50);
            }
            String str51 = smartSuggestion.A06;
            if (str51 != null) {
                anonymousClass182.A0S(DialogModule.KEY_TITLE, str51);
            }
            String str52 = smartSuggestion.A05;
            if (str52 != null) {
                anonymousClass182.A0S(TraceFieldType.RequestID, str52);
            }
            if (smartSuggestion.A00 != null) {
                anonymousClass182.A0r("primary_cta");
                AbstractC82363ly.A00(anonymousClass182, smartSuggestion.A00);
            }
            if (smartSuggestion.A01 != null) {
                anonymousClass182.A0r("secondary_cta");
                AbstractC82363ly.A00(anonymousClass182, smartSuggestion.A01);
            }
            if (smartSuggestion.A07 != null) {
                anonymousClass182.A0r("additional_info");
                anonymousClass182.A0d();
                for (Map.Entry entry5 : smartSuggestion.A07.entrySet()) {
                    if (!C16V.A04(anonymousClass182, entry5)) {
                        anonymousClass182.A0u((String) entry5.getValue());
                    }
                }
                anonymousClass182.A0a();
            }
            anonymousClass182.A0a();
        }
        anonymousClass182.A0T("chat_activity_muted", c80693iy.A2S);
        if (c80693iy.A0a != null) {
            anonymousClass182.A0r("account_warning");
            C50679MYx c50679MYx2 = c80693iy.A0a;
            anonymousClass182.A0d();
            String str53 = c50679MYx2.A01;
            if (str53 != null) {
                anonymousClass182.A0S("harm", str53);
            }
            String str54 = c50679MYx2.A00;
            if (str54 != null) {
                anonymousClass182.A0S("connected_user_id", str54);
            }
            anonymousClass182.A0a();
        }
        anonymousClass182.A0T("has_reached_message_request_limit", c80693iy.A2P);
        String str55 = c80693iy.A1m;
        if (str55 != null) {
            anonymousClass182.A0S("lightweight_intervention_appealable_entity_id", str55);
        }
        Boolean bool12 = c80693iy.A1W;
        if (bool12 != null) {
            anonymousClass182.A0T("is_3p_api_user", bool12.booleanValue());
        }
        if (c80693iy.A0u != null) {
            anonymousClass182.A0r("ad_context_data");
            C111214zj c111214zj = c80693iy.A0u;
            anonymousClass182.A0d();
            anonymousClass182.A0R("ad_id", c111214zj.A00);
            anonymousClass182.A0a();
        }
        if (c80693iy.A0Y != null) {
            anonymousClass182.A0r("professional_metadata");
            C31200Dnj c31200Dnj2 = c80693iy.A0Y;
            anonymousClass182.A0d();
            String str56 = c31200Dnj2.A00;
            if (str56 != null) {
                anonymousClass182.A0S("ad_ig_media_id", str56);
            }
            anonymousClass182.A0a();
        }
        if (c80693iy.A0R != null) {
            anonymousClass182.A0r("ctd_outcome_upsell_setting");
            C9BW c9bw4 = c80693iy.A0R;
            anonymousClass182.A0d();
            Number number3 = (Number) c9bw4.A00;
            if (number3 != null) {
                anonymousClass182.A0Q("cooldown_days", number3.intValue());
            }
            Number number4 = (Number) c9bw4.A01;
            if (number4 != null) {
                anonymousClass182.A0Q("impression_limits", number4.intValue());
            }
            anonymousClass182.A0a();
        }
        anonymousClass182.A0T("is_appointment_booking_enabled", c80693iy.A2U);
        Boolean bool13 = c80693iy.A1f;
        if (bool13 != null) {
            anonymousClass182.A0T("should_upsell_nudge", bool13.booleanValue());
        }
        anonymousClass182.A0Q("shh_transport_mode", c80693iy.A0G);
        if (c80693iy.A0f != null) {
            anonymousClass182.A0r("btv_enabled_map");
            C81613kW c81613kW = c80693iy.A0f;
            anonymousClass182.A0d();
            anonymousClass182.A0Q("instamadillo_cutover", c81613kW.A01);
            anonymousClass182.A0r("item_type");
            C81623kX c81623kX = c81613kW.A04;
            anonymousClass182.A0d();
            anonymousClass182.A0Q("text", c81623kX.A01);
            anonymousClass182.A0Q("instamadillo_cutover", c81623kX.A00);
            anonymousClass182.A0a();
            anonymousClass182.A0R("ttlc", c81613kW.A03);
            anonymousClass182.A0Q("ever_ttlc_enabled", c81613kW.A00);
            anonymousClass182.A0T("instamadillo_eligible", c81613kW.A05);
            anonymousClass182.A0R("proton", c81613kW.A02);
            anonymousClass182.A0a();
        }
        if (c80693iy.A1R != null) {
            anonymousClass182.A0r("dm_settings");
            AbstractC1118652y.A00(anonymousClass182, c80693iy.A1R);
        }
        if (c80693iy.A0W != null) {
            anonymousClass182.A0r("dm_local_data");
            C51755Mte c51755Mte2 = c80693iy.A0W;
            anonymousClass182.A0d();
            if (c51755Mte2.A00 != null) {
                anonymousClass182.A0r("last_expired_message_info");
                C50679MYx c50679MYx3 = (C50679MYx) c51755Mte2.A00;
                anonymousClass182.A0d();
                String str57 = c50679MYx3.A00;
                if (str57 != null) {
                    anonymousClass182.A0S("message_id", str57);
                }
                String str58 = c50679MYx3.A01;
                if (str58 != null) {
                    anonymousClass182.A0S("message_sender_igid", str58);
                }
                anonymousClass182.A0a();
            }
            anonymousClass182.A0a();
        }
        if (c80693iy.A0V != null) {
            anonymousClass182.A0r("takedown_data");
            C51593Mql c51593Mql = c80693iy.A0V;
            anonymousClass182.A0d();
            anonymousClass182.A0R("takedown_timestamp", c51593Mql.A02);
            anonymousClass182.A0Q("takedown_state", c51593Mql.A01);
            anonymousClass182.A0a();
        }
        anonymousClass182.A0Q("read_receipts_disabled", c80693iy.A0A);
        anonymousClass182.A0Q("typing_indicator_disabled", c80693iy.A0K);
        anonymousClass182.A0Q("locked_status", c80693iy.A07);
        anonymousClass182.A0Q("notification_preview_controls", c80693iy.A09);
        anonymousClass182.A0Q("relevancy_score", c80693iy.A0B);
        anonymousClass182.A0T("outgoing_chat_activity_muted", c80693iy.A2m);
        anonymousClass182.A0T("outgoing_reels_together_activity_muted", c80693iy.A2I);
        String str59 = c80693iy.A1u;
        if (str59 != null) {
            anonymousClass182.A0S("unpublished_pro_page_id", str59);
        }
        anonymousClass182.A0T("creator_agent_enabled", c80693iy.A2Y);
        if (c80693iy.A2D != null) {
            anonymousClass182.A0r("creator_ai_enabled_map");
            anonymousClass182.A0d();
            for (Map.Entry entry6 : c80693iy.A2D.entrySet()) {
                if (!C16V.A04(anonymousClass182, entry6)) {
                    anonymousClass182.A0y(((Boolean) entry6.getValue()).booleanValue());
                }
            }
            anonymousClass182.A0a();
        }
        anonymousClass182.A0T("has_creator_ai_msg", c80693iy.A2R);
        anonymousClass182.A0T("is_stale", c80693iy.A2j);
        if (c80693iy.A0z != null) {
            anonymousClass182.A0r("instamadillo_cutover_metadata");
            C133205zm c133205zm = c80693iy.A0z;
            anonymousClass182.A0d();
            Long l4 = c133205zm.A00;
            if (l4 != null) {
                anonymousClass182.A0R("cutover_timestamp", l4.longValue());
            }
            Long l5 = c133205zm.A01;
            if (l5 != null) {
                anonymousClass182.A0R("undo_cutover_timestamp", l5.longValue());
            }
            anonymousClass182.A0a();
        }
        if (c80693iy.A2A != null) {
            C16V.A03(anonymousClass182, "pinned_message_metadata");
            for (L4Z l4z : c80693iy.A2A) {
                if (l4z != null) {
                    anonymousClass182.A0d();
                    String str60 = l4z.A02;
                    if (str60 != null) {
                        anonymousClass182.A0S("item_id", str60);
                    }
                    String str61 = l4z.A03;
                    if (str61 != null) {
                        anonymousClass182.A0S("message_id", str61);
                    }
                    String str62 = l4z.A06;
                    if (str62 != null) {
                        anonymousClass182.A0S("title_text", str62);
                    }
                    String str63 = l4z.A05;
                    if (str63 != null) {
                        anonymousClass182.A0S("subtitle_text", str63);
                    }
                    Long l6 = l4z.A01;
                    if (l6 != null) {
                        anonymousClass182.A0R("pinned_timestamp_ms", l6.longValue());
                    }
                    String str64 = l4z.A04;
                    if (str64 != null) {
                        anonymousClass182.A0S("preview_thumbnail_url", str64);
                    }
                    Boolean bool14 = l4z.A00;
                    if (bool14 != null) {
                        anonymousClass182.A0T("is_deleted_for_self", bool14.booleanValue());
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        if (c80693iy.A0Q != null) {
            anonymousClass182.A0r("nudge");
            AbstractC81653ka.A00(c80693iy.A0Q, anonymousClass182);
        }
        anonymousClass182.A0Q("scheduled_message_count", c80693iy.A0E);
        anonymousClass182.A0a();
    }

    public final ArrayList A0H(ImmutableList immutableList, boolean z) {
        String A00;
        AbstractC09800fd.A01("DirectThreadSQLiteTable.getRawThreadSummaries", 1032651679);
        if (z) {
            A00 = A04();
        } else {
            A00 = C2SA.A00(A04(), AnonymousClass001.A0R("is_permitted==", RealtimeSubscription.GRAPHQL_MQTT_VERSION));
        }
        if (immutableList != null && !immutableList.isEmpty()) {
            A00 = C2SA.A00(A00, AnonymousClass001.A0g("thread_id NOT IN ('", AbstractC93184Fu.A00("','", immutableList), "')"));
        }
        try {
            ArrayList A06 = A06(A00, null);
            AbstractC09800fd.A00(730295032);
            return A06;
        } catch (Throwable th) {
            AbstractC09800fd.A00(-518461474);
            throw th;
        }
    }

    public final C09530e4 A0K(Integer num, List list, boolean z) {
        String A00;
        AbstractC09800fd.A01("DirectThreadSQLiteTable.getLimitedRawThreadSummaries", -1767844150);
        if (z) {
            A00 = A04();
        } else {
            A00 = C2SA.A00(A04(), AnonymousClass001.A0R("is_permitted==", RealtimeSubscription.GRAPHQL_MQTT_VERSION));
        }
        if (!list.isEmpty()) {
            A00 = C2SA.A00(A00, AnonymousClass001.A0g("thread_id NOT IN ('", AbstractC93184Fu.A00("','", list), "')"));
        }
        try {
            C09530e4 A08 = A08(num, A00);
            AbstractC09800fd.A00(411116128);
            return A08;
        } catch (Throwable th) {
            AbstractC09800fd.A00(-526203444);
            throw th;
        }
    }

    public final void A0L(DirectThreadKey directThreadKey) {
        List list;
        String str = directThreadKey.A00;
        if ((str != null && A03(C2SA.A00(A04(), AnonymousClass001.A0S("thread_id=='", str, '\''))) > 0) || (list = directThreadKey.A02) == null || !(!list.isEmpty())) {
            return;
        }
        A03(C2SA.A00(A04(), AnonymousClass001.A0S("recipient_ids=='", AbstractC13670mt.A05(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, directThreadKey.A02), '\'')));
    }
}
