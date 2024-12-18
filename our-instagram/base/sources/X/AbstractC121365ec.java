package X;

import android.os.Parcelable;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.model.thread.ChannelsContextLine;
import com.instagram.user.model.User;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;

/* renamed from: X.5ec, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC121365ec {
    public static C121375ed parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C121375ed c121375ed = new C121375ed();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                ArrayList arrayList = null;
                if ("viewer_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str2 = c16l.A1P();
                    }
                    c121375ed.A08 = str2;
                } else if (ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID.equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str3 = c16l.A1P();
                    }
                    C14360o3.A0B(str3, 0);
                    c121375ed.A09 = str3;
                } else if ("thread_title".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str4 = c16l.A1P();
                    }
                    c121375ed.A0A = str4;
                } else if ("thread_type".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str5 = c16l.A1P();
                    }
                    c121375ed.A07 = str5;
                } else if ("thread_subtype".equals(A0q)) {
                    c121375ed.A01 = c16l.A1D();
                } else if ("users".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            Parcelable.Creator creator = User.CREATOR;
                            User A00 = AbstractC38851rI.A00(c16l, false);
                            if (A00 != null) {
                                arrayList.add(A00);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c121375ed.A0B = arrayList;
                } else if ("canonical".equals(A0q)) {
                    c121375ed.A0C = c16l.A0d();
                } else if ("named".equals(A0q)) {
                    c121375ed.A0F = c16l.A0d();
                } else if ("pending".equals(A0q)) {
                    c121375ed.A0G = c16l.A0d();
                } else if ("media_viewable".equals(A0q)) {
                    c121375ed.A0E = c16l.A0d();
                } else if ("creator_subscriber_thread_data".equals(A0q)) {
                    c121375ed.A04 = AbstractC125285lZ.parseFromJson(c16l);
                } else if ("creator_broadcast_thread_data".equals(A0q)) {
                    c121375ed.A03 = AbstractC121425ei.parseFromJson(c16l);
                } else if ("discoverable_thread_data".equals(A0q)) {
                    c121375ed.A05 = AbstractC125295lb.parseFromJson(c16l);
                } else if ("context_line".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c121375ed.A06 = str;
                } else if ("is_following_chat_creator".equals(A0q)) {
                    c121375ed.A0D = c16l.A0d();
                } else if ("share_sheet_section".equals(A0q)) {
                    c121375ed.A00 = c16l.A1D();
                } else if ("should_badge_in_invitations".equals(A0q)) {
                    c121375ed.A0H = c16l.A0d();
                } else if ("channels_context_lines_data".equals(A0q)) {
                    c121375ed.A02 = AbstractC121435ek.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c121375ed;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static String A00(C121375ed c121375ed) {
        StringWriter stringWriter = new StringWriter();
        C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
        A0A.A0d();
        String str = c121375ed.A08;
        if (str != null) {
            A0A.A0S("viewer_id", str);
        }
        String str2 = c121375ed.A09;
        if (str2 != null) {
            A0A.A0S(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
        }
        String str3 = c121375ed.A0A;
        if (str3 != null) {
            A0A.A0S("thread_title", str3);
        }
        String str4 = c121375ed.A07;
        if (str4 != null) {
            A0A.A0S("thread_type", str4);
        }
        A0A.A0Q("thread_subtype", c121375ed.A01);
        C16V.A03(A0A, "users");
        for (User user : c121375ed.A0B) {
            if (user != null) {
                Parcelable.Creator creator = User.CREATOR;
                AbstractC38851rI.A08(A0A, user);
            }
        }
        A0A.A0Z();
        A0A.A0T("canonical", c121375ed.A0C);
        A0A.A0T("named", c121375ed.A0F);
        A0A.A0T("pending", c121375ed.A0G);
        A0A.A0T("media_viewable", c121375ed.A0E);
        if (c121375ed.A04 != null) {
            A0A.A0r("creator_subscriber_thread_data");
            AbstractC125285lZ.A00(A0A, c121375ed.A04);
        }
        if (c121375ed.A03 != null) {
            A0A.A0r("creator_broadcast_thread_data");
            AbstractC121425ei.A00(A0A, c121375ed.A03);
        }
        if (c121375ed.A05 != null) {
            A0A.A0r("discoverable_thread_data");
            AbstractC125295lb.A00(A0A, c121375ed.A05);
        }
        String str5 = c121375ed.A06;
        if (str5 != null) {
            A0A.A0S("context_line", str5);
        }
        A0A.A0T("is_following_chat_creator", c121375ed.A0D);
        A0A.A0Q("share_sheet_section", c121375ed.A00);
        A0A.A0T("should_badge_in_invitations", c121375ed.A0H);
        if (c121375ed.A02 != null) {
            A0A.A0r("channels_context_lines_data");
            ChannelsContextLine channelsContextLine = c121375ed.A02;
            A0A.A0d();
            String str6 = channelsContextLine.A01;
            if (str6 != null) {
                A0A.A0S("primary_channel_context_line_channels_tab", str6);
            }
            String str7 = channelsContextLine.A00;
            if (str7 != null) {
                A0A.A0S("primary_channel_context_line_search", str7);
            }
            String str8 = channelsContextLine.A02;
            if (str8 != null) {
                A0A.A0S("secondary_channel_context_line_search", str8);
            }
            A0A.A0a();
        }
        A0A.A0a();
        A0A.close();
        return stringWriter.toString();
    }
}
