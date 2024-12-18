package X;

import com.instagram.direct.model.mentions.MentionedEntity;
import com.instagram.direct.model.mentions.SendMentionData$MentionData;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Knu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46861Knu {
    public static SendMentionData$MentionData parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            SendMentionData$MentionData sendMentionData$MentionData = new SendMentionData$MentionData();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("mentioned_entity_list".equals(AbstractC166997dE.A0s(c16l))) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            MentionedEntity parseFromJson = AnonymousClass545.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    sendMentionData$MentionData.A00 = arrayList;
                }
                c16l.A0z();
            }
            return sendMentionData$MentionData;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
