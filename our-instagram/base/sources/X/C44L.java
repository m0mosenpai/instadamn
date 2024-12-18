package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.44L, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C44L {
    public static C44P parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C44N c44n = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Integer num = null;
            Boolean bool3 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            Integer num2 = null;
            String str10 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("creator_broadcast_chat_thread_preview_response".equals(A0q)) {
                    c44n = C44M.parseFromJson(c16l);
                } else if ("creator_igid".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("creator_username".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("group_image_background_uri".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("group_image_uri".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("invite_link".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("is_creator_verified".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("is_member".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("number_of_members".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("should_badge_channel".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if ("social_channel_invite_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("social_context_username".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if ("subtitle".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                } else if ("thread_igid".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str9 = null;
                    } else {
                        str9 = c16l.A1P();
                    }
                } else if ("thread_subtype".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str10 = null;
                    } else {
                        str10 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str9 == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("thread_igid", "ChannelsPreviewDictImpl");
            } else if (str10 == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00(DialogModule.KEY_TITLE, "ChannelsPreviewDictImpl");
            } else {
                return new C44P(c44n, bool, bool2, bool3, num, num2, str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C44P c44p) {
        anonymousClass182.A0d();
        C44O c44o = c44p.A00;
        if (c44o != null) {
            anonymousClass182.A0r("creator_broadcast_chat_thread_preview_response");
            C44N Esi = c44o.Esi();
            anonymousClass182.A0d();
            anonymousClass182.A0Q("audience_type", Esi.A00);
            anonymousClass182.A0T("is_added_to_inbox", Esi.A05);
            Boolean bool = Esi.A01;
            if (bool != null) {
                anonymousClass182.A0T("is_collaborator", bool.booleanValue());
            }
            Boolean bool2 = Esi.A02;
            if (bool2 != null) {
                anonymousClass182.A0T("is_follower", bool2.booleanValue());
            }
            Boolean bool3 = Esi.A03;
            if (bool3 != null) {
                anonymousClass182.A0T("is_invited_collaborator", bool3.booleanValue());
            }
            Boolean bool4 = Esi.A04;
            if (bool4 != null) {
                anonymousClass182.A0T("is_subscriber", bool4.booleanValue());
            }
            anonymousClass182.A0a();
        }
        String str = c44p.A06;
        if (str != null) {
            anonymousClass182.A0S("creator_igid", str);
        }
        String str2 = c44p.A07;
        if (str2 != null) {
            anonymousClass182.A0S("creator_username", str2);
        }
        String str3 = c44p.A08;
        if (str3 != null) {
            anonymousClass182.A0S("group_image_background_uri", str3);
        }
        String str4 = c44p.A09;
        if (str4 != null) {
            anonymousClass182.A0S("group_image_uri", str4);
        }
        String str5 = c44p.A0A;
        if (str5 != null) {
            anonymousClass182.A0S("invite_link", str5);
        }
        Boolean bool5 = c44p.A01;
        if (bool5 != null) {
            anonymousClass182.A0T("is_creator_verified", bool5.booleanValue());
        }
        Boolean bool6 = c44p.A02;
        if (bool6 != null) {
            anonymousClass182.A0T("is_member", bool6.booleanValue());
        }
        Integer num = c44p.A04;
        if (num != null) {
            anonymousClass182.A0Q("number_of_members", num.intValue());
        }
        Boolean bool7 = c44p.A03;
        if (bool7 != null) {
            anonymousClass182.A0T("should_badge_channel", bool7.booleanValue());
        }
        String str6 = c44p.A0B;
        if (str6 != null) {
            anonymousClass182.A0S("social_channel_invite_id", str6);
        }
        String str7 = c44p.A0C;
        if (str7 != null) {
            anonymousClass182.A0S("social_context_username", str7);
        }
        String str8 = c44p.A0D;
        if (str8 != null) {
            anonymousClass182.A0S("subtitle", str8);
        }
        String str9 = c44p.A0E;
        if (str9 != null) {
            anonymousClass182.A0S("thread_igid", str9);
        }
        Integer num2 = c44p.A05;
        if (num2 != null) {
            anonymousClass182.A0Q("thread_subtype", num2.intValue());
        }
        String str10 = c44p.A0F;
        if (str10 != null) {
            anonymousClass182.A0S(DialogModule.KEY_TITLE, str10);
        }
        anonymousClass182.A0a();
    }
}
