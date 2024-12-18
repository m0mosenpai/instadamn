package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Jmb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44531Jmb extends AbstractC52922bZ {
    public C2JT A00;
    public final CRH A01;
    public final UserSession A02;
    public final C05A A03;
    public final C0UO A04;

    public C44531Jmb(CRH crh, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A01 = crh;
        this.A02 = userSession;
        C008002u A1H = AbstractC25225BEi.A1H(new C51748MtX(1));
        this.A03 = A1H;
        this.A04 = A1H;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ODZ A00(C2JT c2jt) {
        C2JS A03;
        Class cls;
        int i;
        String str;
        int i2;
        if (c2jt instanceof QoZ) {
            A03 = ((C2JS) c2jt).A03(QoY.class, "xfb_fetch_genai_personas_by_section(category:$category,section_id:$section_id)", -1537798237);
            if (A03 == null) {
                return null;
            }
            cls = QoW.class;
            i = 0;
            str = "edges";
            i2 = -1839407389;
        } else {
            if (!(c2jt instanceof QoU) || (A03 = ((C2JS) c2jt).A03(QoT.class, "xfb_fetch_continue_chatting_section_personas", -1771340093)) == null) {
                return null;
            }
            cls = QoR.class;
            i = 0;
            str = "edges";
            i2 = 1369971682;
        }
        return A03.getRequiredCompactedPaginableListEdgesField(i, str, cls, i2);
    }
}
