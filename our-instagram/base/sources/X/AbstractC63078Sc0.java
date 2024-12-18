package X;

/* renamed from: X.Sc0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63078Sc0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final C2JT A00(C2JT c2jt) {
        C2JT c2jt2 = null;
        if (c2jt instanceof QpE) {
            C2JS A03 = ((C2JS) c2jt).A03(QpD.class, "xfb_fetch_genai_persona_discovery_paginated_layout(focused_section:$focused_section)", -1506725993);
            if (A03 != null) {
                c2jt2 = (QpC) A03.A02(QpC.class, "sections_query", -1178621019);
            }
        } else {
            if (!(c2jt instanceof QpM)) {
                return null;
            }
            C2JS A032 = ((C2JS) c2jt).A03(QpL.class, "xfb_fetch_genai_persona_discovery_paginated_layout(focused_section:$focused_section)", -508970197);
            if (A032 != null) {
                c2jt2 = (QpK) A032.A02(QpK.class, "union_sections_query", -1833591441);
            }
        }
        return c2jt2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ODZ A01(C2JT c2jt) {
        C2JS c2js;
        Class cls;
        int i;
        String str;
        int i2;
        if (c2jt instanceof QpC) {
            c2js = (C2JS) c2jt;
            cls = QpA.class;
            i = 0;
            str = "edges";
            i2 = -237310242;
        } else if (c2jt instanceof QpK) {
            c2js = (C2JS) c2jt;
            cls = QpI.class;
            i = 0;
            str = "edges";
            i2 = -609830347;
        } else {
            return null;
        }
        return c2js.getRequiredCompactedPaginableListEdgesField(i, str, cls, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C59979Qs1 A02(C2JT c2jt) {
        C2JS optionalTreeField;
        C2JS reinterpretIfFulfillsType;
        if (c2jt instanceof QpA) {
            reinterpretIfFulfillsType = ((C2JS) c2jt).A03(Qp9.class, "node", -275832008);
        } else {
            if (!(c2jt instanceof QpI) || (optionalTreeField = ((C2JS) c2jt).getOptionalTreeField(0, "node", QpH.class, -658497755)) == null) {
                return null;
            }
            reinterpretIfFulfillsType = optionalTreeField.reinterpretIfFulfillsType(0, "XFBGENAIPersonaSection", QpG.class, 1257802499);
        }
        if (reinterpretIfFulfillsType == null) {
            return null;
        }
        return (C59979Qs1) reinterpretIfFulfillsType.A01(C59979Qs1.class, 1054269527);
    }
}
