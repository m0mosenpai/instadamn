package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.ConfirmationStyle;
import com.instagram.api.schemas.ConfirmationTitleStyle;
import com.instagram.api.schemas.MediaOptionStyle;
import com.instagram.api.schemas.UndoStyle;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3pj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC84423pj {
    public static C84433pm parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        String A1P3;
        String A1P4;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            ConfirmationStyle confirmationStyle = null;
            String str3 = null;
            ConfirmationTitleStyle confirmationTitleStyle = null;
            Boolean bool = null;
            ArrayList arrayList = null;
            C88373ws c88373ws = null;
            String str4 = null;
            MediaOptionStyle mediaOptionStyle = null;
            UndoStyle undoStyle = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("confirmation_body".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("confirmation_icon".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("confirmation_style".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P4 = null;
                    } else {
                        A1P4 = c16l.A1P();
                    }
                    confirmationStyle = (ConfirmationStyle) ConfirmationStyle.A01.get(A1P4);
                    if (confirmationStyle == null) {
                        confirmationStyle = ConfirmationStyle.A09;
                    }
                } else if ("confirmation_title".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("confirmation_title_style".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P3 = null;
                    } else {
                        A1P3 = c16l.A1P();
                    }
                    confirmationTitleStyle = (ConfirmationTitleStyle) ConfirmationTitleStyle.A01.get(A1P3);
                    if (confirmationTitleStyle == null) {
                        confirmationTitleStyle = ConfirmationTitleStyle.A06;
                    }
                } else if ("enable_word_wrapping".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("followup_options".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C88173wR parseFromJson = AbstractC88163wQ.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("followup_options_set".equals(A0q)) {
                    c88373ws = AbstractC88363wr.parseFromJson(c16l);
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("title_style".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    mediaOptionStyle = (MediaOptionStyle) MediaOptionStyle.A01.get(A1P2);
                    if (mediaOptionStyle == null) {
                        mediaOptionStyle = MediaOptionStyle.A08;
                    }
                } else if ("undo_style".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    undoStyle = (UndoStyle) UndoStyle.A01.get(A1P);
                    if (undoStyle == null) {
                        undoStyle = UndoStyle.A08;
                    }
                }
                c16l.A0z();
            }
            return new C84433pm(confirmationStyle, confirmationTitleStyle, c88373ws, mediaOptionStyle, undoStyle, bool, str, str2, str3, str4, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C84433pm c84433pm) {
        anonymousClass182.A0d();
        String str = c84433pm.A06;
        if (str != null) {
            anonymousClass182.A0S("confirmation_body", str);
        }
        String str2 = c84433pm.A07;
        if (str2 != null) {
            anonymousClass182.A0S("confirmation_icon", str2);
        }
        ConfirmationStyle confirmationStyle = c84433pm.A00;
        if (confirmationStyle != null) {
            anonymousClass182.A0S("confirmation_style", confirmationStyle.A00);
        }
        String str3 = c84433pm.A08;
        if (str3 != null) {
            anonymousClass182.A0S("confirmation_title", str3);
        }
        ConfirmationTitleStyle confirmationTitleStyle = c84433pm.A01;
        if (confirmationTitleStyle != null) {
            anonymousClass182.A0S("confirmation_title_style", confirmationTitleStyle.A00);
        }
        Boolean bool = c84433pm.A05;
        if (bool != null) {
            anonymousClass182.A0T("enable_word_wrapping", bool.booleanValue());
        }
        List<C88173wR> list = c84433pm.A0A;
        if (list != null) {
            C16V.A03(anonymousClass182, "followup_options");
            for (C88173wR c88173wR : list) {
                if (c88173wR != null) {
                    AbstractC88163wQ.A00(anonymousClass182, c88173wR);
                }
            }
            anonymousClass182.A0Z();
        }
        C88373ws c88373ws = c84433pm.A02;
        if (c88373ws != null) {
            anonymousClass182.A0r("followup_options_set");
            anonymousClass182.A0d();
            List<C88173wR> list2 = c88373ws.A00;
            if (list2 != null) {
                C16V.A03(anonymousClass182, "interested");
                for (C88173wR c88173wR2 : list2) {
                    if (c88173wR2 != null) {
                        AbstractC88163wQ.A00(anonymousClass182, c88173wR2);
                    }
                }
                anonymousClass182.A0Z();
            }
            List<C88173wR> list3 = c88373ws.A01;
            if (list3 != null) {
                C16V.A03(anonymousClass182, NetInfoModule.CONNECTION_TYPE_NONE);
                for (C88173wR c88173wR3 : list3) {
                    if (c88173wR3 != null) {
                        AbstractC88163wQ.A00(anonymousClass182, c88173wR3);
                    }
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0a();
        }
        String str4 = c84433pm.A09;
        if (str4 != null) {
            anonymousClass182.A0S(DialogModule.KEY_TITLE, str4);
        }
        MediaOptionStyle mediaOptionStyle = c84433pm.A03;
        if (mediaOptionStyle != null) {
            anonymousClass182.A0S("title_style", mediaOptionStyle.A00);
        }
        UndoStyle undoStyle = c84433pm.A04;
        if (undoStyle != null) {
            anonymousClass182.A0S("undo_style", undoStyle.A00);
        }
        anonymousClass182.A0a();
    }
}
