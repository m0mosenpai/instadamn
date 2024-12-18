package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.IdX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41703IdX {
    public C41596Iaj A00;
    public final UserSession A01;

    public C41703IdX(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
    }

    public final void A03(C41596Iaj c41596Iaj, String str, String str2, long j, long j2) {
        C41596Iaj A00;
        C14360o3.A0B(str2, 3);
        c41596Iaj.A08 = str;
        Long valueOf = Long.valueOf(j);
        c41596Iaj.A02 = valueOf;
        Long valueOf2 = Long.valueOf(j2);
        c41596Iaj.A03 = valueOf2;
        c41596Iaj.A04 = str2;
        this.A00 = c41596Iaj;
        UserSession userSession = this.A01;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A00(null, C12180kM.A05, userSession), "ig_survey_impression");
        if (A0f.isSampled()) {
            A0f.AAP("survey_id", str);
            A0f.A9K("tessa_config_id", valueOf);
            A0f.A9K("tessa_integration_point_id", valueOf2);
            A0f.A9K("ig_user_id", AbstractC25228BEl.A13(userSession.userId));
            AbstractC31171DnF.A1I(A0f, str2);
            if (this.A00 != null && (A00 = A00(A0f, this, "detailed_survey_type", null)) != null) {
                A0f.A9K("ig_media_id", A00.A00);
                if (this.A00 != null && A00(A0f, this, "notification_id", null) != null && A00(A0f, this, "notification_channel", null) != null && A00(A0f, this, "notification_type", null) != null) {
                    A0f.A9K("ad_campaign_id", null);
                    if (this.A00 != null && A00(A0f, this, "ad_tracking_token", null) != null) {
                        AbstractC37300Gc1.A0g(A0f, null);
                        C41596Iaj c41596Iaj2 = this.A00;
                        if (c41596Iaj2 != null && A00(A0f, this, "ranking_info_token", c41596Iaj2.A07) != null && A00(A0f, this, "canonical_inventory_source", null) != null) {
                            A0f.A9K("client_position", null);
                            if (this.A00 != null) {
                                A0f.A9K("feed_recs_post_position", null);
                                C41596Iaj c41596Iaj3 = this.A00;
                                if (c41596Iaj3 != null) {
                                    A0f.A9K("position_in_tray", c41596Iaj3.A01);
                                    C41596Iaj c41596Iaj4 = this.A00;
                                    if (c41596Iaj4 != null) {
                                        C41596Iaj A002 = A00(A0f, this, AbstractC111324zv.A00(104), c41596Iaj4.A06);
                                        if (A002 != null) {
                                            AbstractC25232BEp.A1L(A0f, "containing_tray_session_id", A002.A05);
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            C14360o3.A0F("baseEventFields");
            throw C00O.createAndThrow();
        }
    }

    public final void A04(List list, long j, long j2, long j3, boolean z) {
        C41596Iaj A00;
        Long[] A01 = A01(j, j2, z);
        long longValue = A01[0].longValue();
        long longValue2 = A01[1].longValue();
        if (this.A00 == null) {
            AbstractC12120kG.A07("RapidFeedbackLogger", "Unable to log survey response event ig_survey_response due to Base event fields not initialized from initial impression", null);
        } else {
            UserSession userSession = this.A01;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A00(null, C12180kM.A05, userSession), "ig_survey_response");
            if (A0f.isSampled()) {
                ArrayList A0q = AbstractC167017dG.A0q(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C09530e4 c09530e4 = (C09530e4) it.next();
                    String str = (String) c09530e4.A00;
                    Collection collection = (Collection) c09530e4.A01;
                    C0Zx c0Zx = new C0Zx();
                    c0Zx.A06("question_id", str);
                    c0Zx.A06(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, AbstractC31175DnJ.A0b(collection));
                    A0q.add(c0Zx);
                }
                C41596Iaj c41596Iaj = this.A00;
                if (c41596Iaj != null) {
                    String str2 = c41596Iaj.A08;
                    if (str2 != null) {
                        C41596Iaj A002 = A00(A0f, this, "survey_id", str2);
                        if (A002 != null) {
                            Long l = A002.A02;
                            if (l != null) {
                                A0f.A9K("tessa_config_id", l);
                                C41596Iaj c41596Iaj2 = this.A00;
                                if (c41596Iaj2 != null) {
                                    Long l2 = c41596Iaj2.A03;
                                    if (l2 != null) {
                                        A0f.A9K("tessa_integration_point_id", l2);
                                        A0f.A9K("ig_user_id", AbstractC25228BEl.A13(userSession.userId));
                                        C41596Iaj c41596Iaj3 = this.A00;
                                        if (c41596Iaj3 != null) {
                                            String str3 = c41596Iaj3.A04;
                                            if (str3 != null) {
                                                AbstractC31171DnF.A1I(A0f, str3);
                                                A0f.AAk("responses", A0q);
                                                A0f.A9K("page_dwell_time", Long.valueOf(longValue2));
                                                AbstractC37304Gc5.A12(A0f, longValue, j3);
                                                A0f.A9K(AbstractC111324zv.A00(1972), null);
                                                A0f.A9K(AbstractC111324zv.A00(1971), null);
                                                A0f.AAP(AbstractC111324zv.A00(1973), null);
                                                A0f.AAP("bakeoff_canonical_inventory_source", null);
                                                A0f.A9K(AbstractC111324zv.A00(1970), null);
                                                A0f.A9K("bakeoff_feed_recs_post_position", null);
                                                if (this.A00 != null && (A00 = A00(A0f, this, "detailed_survey_type", null)) != null) {
                                                    A0f.A9K("ig_media_id", A00.A00);
                                                    if (this.A00 != null && A00(A0f, this, "notification_id", null) != null && A00(A0f, this, "notification_channel", null) != null && A00(A0f, this, "notification_type", null) != null) {
                                                        A0f.A9K("ad_campaign_id", null);
                                                        if (this.A00 != null && A00(A0f, this, "ad_tracking_token", null) != null) {
                                                            AbstractC37300Gc1.A0g(A0f, null);
                                                            C41596Iaj c41596Iaj4 = this.A00;
                                                            if (c41596Iaj4 != null && A00(A0f, this, "ranking_info_token", c41596Iaj4.A07) != null && A00(A0f, this, "canonical_inventory_source", null) != null) {
                                                                A0f.A9K("client_position", null);
                                                                if (this.A00 != null) {
                                                                    A0f.A9K("feed_recs_post_position", null);
                                                                    C41596Iaj c41596Iaj5 = this.A00;
                                                                    if (c41596Iaj5 != null) {
                                                                        A0f.A9K("position_in_tray", c41596Iaj5.A01);
                                                                        C41596Iaj c41596Iaj6 = this.A00;
                                                                        if (c41596Iaj6 != null) {
                                                                            C41596Iaj A003 = A00(A0f, this, AbstractC111324zv.A00(104), c41596Iaj6.A06);
                                                                            if (A003 != null) {
                                                                                AbstractC25232BEp.A1L(A0f, "containing_tray_session_id", A003.A05);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                throw AbstractC166987dD.A14("Required value was null.");
                                            }
                                        }
                                    } else {
                                        throw AbstractC166987dD.A14("Required value was null.");
                                    }
                                }
                            } else {
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        }
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
                C14360o3.A0F("baseEventFields");
                throw C00O.createAndThrow();
            }
        }
        InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(AbstractC12220kQ.A02(this.A01), "ig_survey_response_debug");
        if (A0f2.isSampled()) {
            if (list.isEmpty()) {
                AbstractC12120kG.A07("RapidFeedbackLogger", "Unable to log survey response debug event ig_survey_response_debug due to empty list of responses", null);
            } else {
                A0f2.AAP("question_name", (String) ((C09530e4) AbstractC166987dD.A16(list)).A00);
                A0f2.Cht();
            }
        }
    }

    public final void A02(long j, long j2, long j3, boolean z) {
        C41596Iaj A00;
        Long[] A01 = A01(j, j2, z);
        long longValue = A01[0].longValue();
        long longValue2 = A01[1].longValue();
        if (this.A00 == null) {
            AbstractC12120kG.A07("RapidFeedbackLogger", "Unable to log survey exit event ig_survey_exit due to Base event fields not initialized from initial impression", null);
            return;
        }
        UserSession userSession = this.A01;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A00(null, C12180kM.A05, userSession), "ig_survey_exit");
        if (!A0f.isSampled()) {
            return;
        }
        C41596Iaj c41596Iaj = this.A00;
        if (c41596Iaj != null) {
            String str = c41596Iaj.A08;
            if (str != null) {
                C41596Iaj A002 = A00(A0f, this, "survey_id", str);
                if (A002 != null) {
                    Long l = A002.A02;
                    if (l != null) {
                        A0f.A9K("tessa_config_id", l);
                        C41596Iaj c41596Iaj2 = this.A00;
                        if (c41596Iaj2 != null) {
                            Long l2 = c41596Iaj2.A03;
                            if (l2 != null) {
                                A0f.A9K("tessa_integration_point_id", l2);
                                A0f.A9K("ig_user_id", AbstractC25228BEl.A13(userSession.userId));
                                C41596Iaj c41596Iaj3 = this.A00;
                                if (c41596Iaj3 != null) {
                                    String str2 = c41596Iaj3.A04;
                                    if (str2 != null) {
                                        AbstractC31171DnF.A1I(A0f, str2);
                                        A0f.A9K("page_dwell_time", Long.valueOf(longValue2));
                                        AbstractC37304Gc5.A12(A0f, longValue, j3);
                                        if (this.A00 != null && (A00 = A00(A0f, this, "detailed_survey_type", null)) != null) {
                                            A0f.A9K("ig_media_id", A00.A00);
                                            if (this.A00 != null && A00(A0f, this, "notification_id", null) != null && A00(A0f, this, "notification_channel", null) != null && A00(A0f, this, "notification_type", null) != null) {
                                                A0f.A9K("ad_campaign_id", null);
                                                if (this.A00 != null && A00(A0f, this, "ad_tracking_token", null) != null) {
                                                    AbstractC37300Gc1.A0g(A0f, null);
                                                    C41596Iaj c41596Iaj4 = this.A00;
                                                    if (c41596Iaj4 != null && A00(A0f, this, "ranking_info_token", c41596Iaj4.A07) != null && A00(A0f, this, "canonical_inventory_source", null) != null) {
                                                        A0f.A9K("client_position", null);
                                                        if (this.A00 != null) {
                                                            A0f.A9K("feed_recs_post_position", null);
                                                            C41596Iaj c41596Iaj5 = this.A00;
                                                            if (c41596Iaj5 != null) {
                                                                A0f.A9K("position_in_tray", c41596Iaj5.A01);
                                                                C41596Iaj c41596Iaj6 = this.A00;
                                                                if (c41596Iaj6 != null) {
                                                                    C41596Iaj A003 = A00(A0f, this, AbstractC111324zv.A00(104), c41596Iaj6.A06);
                                                                    if (A003 != null) {
                                                                        AbstractC25232BEp.A1L(A0f, "containing_tray_session_id", A003.A05);
                                                                        return;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        throw AbstractC166987dD.A14("Required value was null.");
                                    }
                                }
                            } else {
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        }
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        C14360o3.A0F("baseEventFields");
        throw C00O.createAndThrow();
    }

    public static C41596Iaj A00(InterfaceC02590Ai interfaceC02590Ai, C41703IdX c41703IdX, String str, String str2) {
        interfaceC02590Ai.AAP(str, str2);
        return c41703IdX.A00;
    }

    public static final Long[] A01(long j, long j2, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - j;
        long j4 = currentTimeMillis - j2;
        if (z) {
            j3 /= 1000;
            j4 /= 1000;
        }
        return new Long[]{Long.valueOf(j3), Long.valueOf(j4)};
    }
}
