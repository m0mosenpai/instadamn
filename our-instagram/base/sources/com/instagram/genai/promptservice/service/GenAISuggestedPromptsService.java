package com.instagram.genai.promptservice.service;

import X.AbstractC111324zv;
import X.AbstractC133095zb;
import X.AbstractC166987dD;
import X.AbstractC25225BEi;
import X.AbstractC31187DnW;
import X.AbstractC43591JPw;
import X.AbstractC58317Pt9;
import X.C2JS;
import X.C50679MYx;
import X.C51723Mt0;
import X.C51757Mtg;
import X.C5Hb;
import X.EnumC53298Nha;
import X.QmQ;
import X.QmS;
import X.QmT;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class GenAISuggestedPromptsService {
    public static final GenAISuggestedPromptsService A00 = new Object();

    public static final ArrayList A00(List list) {
        C5Hb c5Hb;
        C2JS optionalTreeField;
        String A07;
        ImmutableList requiredCompactedStringListField;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2JS A0l = AbstractC25225BEi.A0l(it);
            String A072 = A0l.A07("text");
            boolean z = true;
            if (A072 != null && A072.length() != 0) {
                String str = null;
                String A09 = A0l.A09(AbstractC111324zv.A00(542));
                if (A0l.getOptionalEnumField(3, AbstractC111324zv.A00(1196), EnumC53298Nha.UNSET_OR_UNRECOGNIZED_ENUM_VALUE) != EnumC53298Nha.TRENDING) {
                    z = false;
                }
                String A0B = A0l.A0B("generated_content_id");
                C2JS optionalTreeField2 = A0l.getOptionalTreeField(6, "metadata", QmT.class, 1938749531);
                if (optionalTreeField2 != null && (requiredCompactedStringListField = optionalTreeField2.getRequiredCompactedStringListField(0, AbstractC58317Pt9.A00(374))) != null) {
                    c5Hb = AbstractC133095zb.A03(requiredCompactedStringListField);
                } else {
                    c5Hb = null;
                }
                C2JS optionalTreeField3 = A0l.getOptionalTreeField(6, "metadata", QmT.class, 1938749531);
                C50679MYx c50679MYx = null;
                if (optionalTreeField3 != null && (optionalTreeField = optionalTreeField3.getOptionalTreeField(1, "author", QmS.class, 2095970621)) != null && (A07 = optionalTreeField.A07("instagram_user_id")) != null) {
                    c50679MYx = new C50679MYx(A07, optionalTreeField.getOptionalStringField(1, AbstractC31187DnW.A01()), 49);
                }
                C2JS optionalTreeField4 = A0l.getOptionalTreeField(5, AbstractC58317Pt9.A00(280), QmQ.class, -1052619497);
                if (optionalTreeField4 != null) {
                    str = optionalTreeField4.A07(AbstractC43591JPw.A00(79));
                }
                A1E.add(new C51723Mt0(new C51757Mtg(c5Hb, c50679MYx, str, 17), A072, A09, A0B, z));
            }
        }
        return A1E;
    }
}
