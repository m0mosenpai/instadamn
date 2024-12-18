package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.DemarcatorActionType;
import com.instagram.api.schemas.DemarcatorStyleEnum;
import com.instagram.api.schemas.FeedItemType;
import java.io.IOException;

/* renamed from: X.4y5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC110344y5 {
    public static C110414yD parseFromJson(C16L c16l) {
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
            Integer num = null;
            Integer num2 = null;
            C110374y9 c110374y9 = null;
            C110394yB c110394yB = null;
            String str = null;
            Boolean bool = null;
            C39561sd c39561sd = null;
            Boolean bool2 = null;
            String str2 = null;
            DemarcatorActionType demarcatorActionType = null;
            String str3 = null;
            DemarcatorActionType demarcatorActionType2 = null;
            DemarcatorStyleEnum demarcatorStyleEnum = null;
            String str4 = null;
            String str5 = null;
            FeedItemType feedItemType = null;
            Integer num3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("brs_severity".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("global_position".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                } else if ("group".equals(A0q)) {
                    c110374y9 = AbstractC110364y8.parseFromJson(c16l);
                } else if ("group_set".equals(A0q)) {
                    c110394yB = AbstractC110354y7.parseFromJson(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("is_pause".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("item_client_gap_rules".equals(A0q)) {
                    c39561sd = AbstractC39551sc.parseFromJson(c16l);
                } else if ("pause".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("primary_action_text".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("primary_action_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P4 = null;
                    } else {
                        A1P4 = c16l.A1P();
                    }
                    demarcatorActionType = (DemarcatorActionType) DemarcatorActionType.A01.get(A1P4);
                    if (demarcatorActionType == null) {
                        demarcatorActionType = DemarcatorActionType.A05;
                    }
                } else if ("secondary_action_text".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("secondary_action_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P3 = null;
                    } else {
                        A1P3 = c16l.A1P();
                    }
                    demarcatorActionType2 = (DemarcatorActionType) DemarcatorActionType.A01.get(A1P3);
                    if (demarcatorActionType2 == null) {
                        demarcatorActionType2 = DemarcatorActionType.A05;
                    }
                } else if ("style".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    demarcatorStyleEnum = (DemarcatorStyleEnum) DemarcatorStyleEnum.A01.get(A1P2);
                    if (demarcatorStyleEnum == null) {
                        demarcatorStyleEnum = DemarcatorStyleEnum.A08;
                    }
                } else if ("subtitle".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("uplift_item_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    feedItemType = (FeedItemType) FeedItemType.A01.get(A1P);
                    if (feedItemType == null) {
                        feedItemType = FeedItemType.A2e;
                    }
                } else if ("view_state_item_type".equals(A0q)) {
                    num3 = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            return new C110414yD(demarcatorActionType, demarcatorActionType2, demarcatorStyleEnum, feedItemType, c39561sd, c110394yB, c110374y9, bool, bool2, num, num2, num3, str, str2, str3, str4, str5);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
