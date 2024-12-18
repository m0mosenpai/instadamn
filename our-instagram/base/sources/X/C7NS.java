package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectShareTargetLoggingInfo;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7NS, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7NS {
    public static DirectShareTarget parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            DirectShareTarget directShareTarget = new DirectShareTarget();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                String str = null;
                ArrayList arrayList = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                ArrayList arrayList2 = null;
                if ("pending_recipient".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            PendingRecipient parseFromJson = C7NT.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    directShareTarget.A0Q = arrayList;
                } else if (AbstractC43591JPw.A00(148).equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str2 = c16l.A1P();
                    }
                    directShareTarget.A0I = str2;
                } else if ("full_name".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str3 = c16l.A1P();
                    }
                    directShareTarget.A0J = str3;
                } else if ("is_canonical".equals(A0q)) {
                    directShareTarget.A0R = c16l.A0d();
                } else if ("restriction_type".equals(A0q)) {
                    directShareTarget.A0D = Integer.valueOf(c16l.A1D());
                } else if ("collection_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str4 = c16l.A1P();
                    }
                    directShareTarget.A0G = str4;
                } else if ("collection_type".equals(A0q)) {
                    directShareTarget.A00 = c16l.A1D();
                } else if ("logging_info".equals(A0q)) {
                    directShareTarget.A08 = C7NU.parseFromJson(c16l);
                } else if ("is_cutover".equals(A0q)) {
                    directShareTarget.A0T = c16l.A0d();
                } else if ("thread_target".equals(A0q)) {
                    directShareTarget.A09 = C7NV.parseFromJson(c16l);
                } else if ("context_line".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str5 = c16l.A1P();
                    }
                    directShareTarget.A0H = str5;
                } else if ("secondary_context_line".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str6 = c16l.A1P();
                    }
                    directShareTarget.A0N = str6;
                } else if ("has_current_user".equals(A0q)) {
                    directShareTarget.A0A = Boolean.valueOf(c16l.A0d());
                } else if ("creator_subscriber_thread_info".equals(A0q)) {
                    directShareTarget.A05 = AbstractC125285lZ.parseFromJson(c16l);
                } else if ("creator_broadcast_thread_info".equals(A0q)) {
                    directShareTarget.A04 = AbstractC121425ei.parseFromJson(c16l);
                } else if ("discoverable_thread_info".equals(A0q)) {
                    directShareTarget.A06 = AbstractC125295lb.parseFromJson(c16l);
                } else if ("thread_subtype".equals(A0q)) {
                    directShareTarget.A01 = c16l.A1D();
                } else if ("share_sheet_section".equals(A0q)) {
                    directShareTarget.A0E = Integer.valueOf(c16l.A1D());
                } else if ("thread_picture_url".equals(A0q)) {
                    directShareTarget.A02 = AbstractC222616c.A00(c16l);
                } else if ("wa_group_thread_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str7 = c16l.A1P();
                    }
                    directShareTarget.A0O = str7;
                } else if ("ibc_category_type".equals(A0q)) {
                    directShareTarget.A0B = Boolean.valueOf(c16l.A0d());
                } else if ("preset_member_ids".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            Long valueOf = Long.valueOf(c16l.A0y());
                            if (valueOf != null) {
                                arrayList2.add(valueOf);
                            }
                        }
                    }
                    directShareTarget.A0P = arrayList2;
                } else if ("preset_type".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    directShareTarget.A0L = str;
                }
                c16l.A0z();
            }
            directShareTarget.A0D();
            return directShareTarget;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, DirectShareTarget directShareTarget) {
        anonymousClass182.A0d();
        if (directShareTarget.A0Q != null) {
            C16V.A03(anonymousClass182, "pending_recipient");
            for (PendingRecipient pendingRecipient : directShareTarget.A0Q) {
                if (pendingRecipient != null) {
                    C7NT.A00(anonymousClass182, pendingRecipient);
                }
            }
            anonymousClass182.A0Z();
        }
        String str = directShareTarget.A0I;
        if (str != null) {
            anonymousClass182.A0S(AbstractC43591JPw.A00(148), str);
        }
        String str2 = directShareTarget.A0J;
        if (str2 != null) {
            anonymousClass182.A0S("full_name", str2);
        }
        anonymousClass182.A0T("is_canonical", directShareTarget.A0R);
        Integer num = directShareTarget.A0D;
        if (num != null) {
            anonymousClass182.A0Q("restriction_type", num.intValue());
        }
        String str3 = directShareTarget.A0G;
        if (str3 != null) {
            anonymousClass182.A0S("collection_id", str3);
        }
        anonymousClass182.A0Q("collection_type", directShareTarget.A00);
        if (directShareTarget.A08 != null) {
            anonymousClass182.A0r("logging_info");
            DirectShareTargetLoggingInfo directShareTargetLoggingInfo = directShareTarget.A08;
            anonymousClass182.A0d();
            Double d = directShareTargetLoggingInfo.A01;
            if (d != null) {
                anonymousClass182.A0O("final_score", d.doubleValue());
            }
            Boolean bool = directShareTargetLoggingInfo.A00;
            if (bool != null) {
                anonymousClass182.A0T("is_from_server", bool.booleanValue());
            }
            anonymousClass182.A0a();
        }
        anonymousClass182.A0T("is_cutover", directShareTarget.A0T);
        InterfaceC83713oG interfaceC83713oG = directShareTarget.A09;
        if (interfaceC83713oG != null) {
            anonymousClass182.A0r("thread_target");
            C9CI c9ci = new C9CI(interfaceC83713oG);
            anonymousClass182.A0d();
            String str4 = c9ci.A06;
            if (str4 != null) {
                anonymousClass182.A0S("direct_thread_id", str4);
            }
            List<PendingRecipient> list = (List) c9ci.A01;
            if (list != null) {
                C16V.A03(anonymousClass182, "direct_pending_recipients");
                for (PendingRecipient pendingRecipient2 : list) {
                    if (pendingRecipient2 != null) {
                        C7NT.A00(anonymousClass182, pendingRecipient2);
                    }
                }
                anonymousClass182.A0Z();
            }
            Number number = (Number) c9ci.A04;
            if (number != null) {
                anonymousClass182.A0R("msys_thread_key", number.longValue());
            }
            Number number2 = (Number) c9ci.A03;
            if (number2 != null) {
                anonymousClass182.A0R("msys_thread_fbid", number2.longValue());
            }
            String str5 = c9ci.A07;
            if (str5 != null) {
                anonymousClass182.A0S("msys_transport_type", str5);
            }
            List<C54994OUd> list2 = (List) c9ci.A02;
            if (list2 != null) {
                C16V.A03(anonymousClass182, "msys_pending_recipients");
                for (C54994OUd c54994OUd : list2) {
                    if (c54994OUd != null) {
                        anonymousClass182.A0d();
                        String str6 = c54994OUd.A07;
                        if (str6 != null) {
                            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str6);
                        }
                        anonymousClass182.A0R("eimu", c54994OUd.A01);
                        anonymousClass182.A0Q("interop_user_type", c54994OUd.A00);
                        String str7 = c54994OUd.A09;
                        if (str7 != null) {
                            anonymousClass182.A0S(AbstractC58357Ptx.A00(), str7);
                        }
                        String str8 = c54994OUd.A05;
                        if (str8 != null) {
                            anonymousClass182.A0S("full_name", str8);
                        }
                        String str9 = c54994OUd.A08;
                        if (str9 != null) {
                            anonymousClass182.A0S("short_name", str9);
                        }
                        String str10 = c54994OUd.A06;
                        if (str10 != null) {
                            anonymousClass182.A0S("full_name_or_username", str10);
                        }
                        if (c54994OUd.A02 != null) {
                            anonymousClass182.A0r("profile_pic_url");
                            AbstractC222616c.A01(anonymousClass182, c54994OUd.A02);
                        }
                        anonymousClass182.A0T("is_verified", c54994OUd.A0H);
                        anonymousClass182.A0T("is_business", c54994OUd.A0B);
                        anonymousClass182.A0T("is_unavailable", c54994OUd.A0G);
                        anonymousClass182.A0T("is_blocking", c54994OUd.A0A);
                        anonymousClass182.A0T("is_restricted", c54994OUd.A0F);
                        anonymousClass182.A0T("is_connected", c54994OUd.A0C);
                        Integer num2 = c54994OUd.A04;
                        if (num2 != null) {
                            anonymousClass182.A0Q("reachability_status", num2.intValue());
                        }
                        anonymousClass182.A0T("is_messaging_blocking", c54994OUd.A0D);
                        anonymousClass182.A0T("is_messaging_psuedo_blocking", c54994OUd.A0E);
                        anonymousClass182.A0a();
                    }
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0a();
        }
        String str11 = directShareTarget.A0H;
        if (str11 != null) {
            anonymousClass182.A0S("context_line", str11);
        }
        String str12 = directShareTarget.A0N;
        if (str12 != null) {
            anonymousClass182.A0S("secondary_context_line", str12);
        }
        Boolean bool2 = directShareTarget.A0A;
        if (bool2 != null) {
            anonymousClass182.A0T("has_current_user", bool2.booleanValue());
        }
        if (directShareTarget.A05 != null) {
            anonymousClass182.A0r("creator_subscriber_thread_info");
            AbstractC125285lZ.A00(anonymousClass182, directShareTarget.A05);
        }
        if (directShareTarget.A04 != null) {
            anonymousClass182.A0r("creator_broadcast_thread_info");
            AbstractC121425ei.A00(anonymousClass182, directShareTarget.A04);
        }
        if (directShareTarget.A06 != null) {
            anonymousClass182.A0r("discoverable_thread_info");
            AbstractC125295lb.A00(anonymousClass182, directShareTarget.A06);
        }
        anonymousClass182.A0Q("thread_subtype", directShareTarget.A01);
        Integer num3 = directShareTarget.A0E;
        if (num3 != null) {
            anonymousClass182.A0Q("share_sheet_section", num3.intValue());
        }
        if (directShareTarget.A02 != null) {
            anonymousClass182.A0r("thread_picture_url");
            AbstractC222616c.A01(anonymousClass182, directShareTarget.A02);
        }
        String str13 = directShareTarget.A0O;
        if (str13 != null) {
            anonymousClass182.A0S("wa_group_thread_id", str13);
        }
        Boolean bool3 = directShareTarget.A0B;
        if (bool3 != null) {
            anonymousClass182.A0T("ibc_category_type", bool3.booleanValue());
        }
        if (directShareTarget.A0P != null) {
            C16V.A03(anonymousClass182, "preset_member_ids");
            for (Number number3 : directShareTarget.A0P) {
                if (number3 != null) {
                    anonymousClass182.A0i(number3.longValue());
                }
            }
            anonymousClass182.A0Z();
        }
        String str14 = directShareTarget.A0L;
        if (str14 != null) {
            anonymousClass182.A0S("preset_type", str14);
        }
        anonymousClass182.A0a();
    }
}
