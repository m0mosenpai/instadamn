package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.Iterator;

/* renamed from: X.FsB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35835FsB implements InterfaceC48192Ji {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ InterfaceC16660sJ A06;
    public final /* synthetic */ C15370ps A07;
    public final /* synthetic */ boolean A08;

    public C35835FsB(Context context, UserSession userSession, Integer num, String str, String str2, InterfaceC16660sJ interfaceC16660sJ, C15370ps c15370ps, int i, boolean z) {
        this.A07 = c15370ps;
        this.A08 = z;
        this.A02 = userSession;
        this.A06 = interfaceC16660sJ;
        this.A01 = context;
        this.A00 = i;
        this.A03 = num;
        this.A05 = str;
        this.A04 = str2;
    }

    @Override // X.InterfaceC48192Ji
    public final void invoke(AnonymousClass436 anonymousClass436) {
        ImmutableList immutableList;
        C2JS A0l;
        String A07;
        ImmutableList requiredCompactedTreeListField;
        String A072;
        String str;
        C2Fb c2Fb;
        C2JS A0k;
        C2JS A03;
        if (anonymousClass436 != null && (A0k = AbstractC25225BEi.A0k(anonymousClass436)) != null && (A03 = A0k.A03(C59373QdW.class, AbstractC58317Pt9.A00(407), 135524158)) != null) {
            immutableList = A03.A06(C59372QdV.class, "nodes", 2112009342);
        } else {
            immutableList = null;
        }
        boolean z = this.A08;
        UserSession userSession = this.A02;
        C15370ps c15370ps = this.A07;
        String A00 = MSV.A00(32);
        Context context = this.A01;
        int i = this.A00;
        Integer num = this.A03;
        String str2 = this.A05;
        String str3 = this.A04;
        if (immutableList != null) {
            Iterator<E> it = immutableList.iterator();
            loop0: while (true) {
                if (!it.hasNext() || (A0l = AbstractC25225BEi.A0l(it)) == null) {
                    break;
                }
                boolean coercedBooleanField = A0l.getCoercedBooleanField(1, "consented");
                if (Boolean.valueOf(coercedBooleanField) != null && coercedBooleanField && z) {
                    AbstractC23021Ah.A00(userSession).A13("ai_agent_character_disclaimer_server_flag", true);
                    AbstractC162267Oo.A01(userSession, true);
                    break;
                }
                String A002 = AbstractC58317Pt9.A00(829);
                C2JS A04 = A0l.A04(C59371QdU.class, A002, -2024709336);
                if (A04 != null && (A07 = A04.A07("text")) != null) {
                    c15370ps.A00 = AbstractC25225BEi.A0H(A07);
                    C2JS A042 = A0l.A04(C59371QdU.class, A002, -2024709336);
                    if (A042 != null && (requiredCompactedTreeListField = A042.getRequiredCompactedTreeListField(1, "ranges", C59370QdT.class, -1393094026)) != null) {
                        Iterator<E> it2 = requiredCompactedTreeListField.iterator();
                        while (it2.hasNext()) {
                            C2JS A0l2 = AbstractC25225BEi.A0l(it2);
                            int coercedIntField = A0l2.getCoercedIntField(0, "offset");
                            String A0w = AbstractC25227BEk.A0w(A07, coercedIntField, A0l2.getCoercedIntField(1, "length") + coercedIntField);
                            C2JS A043 = A0l2.A04(QdS.class, "entity", -1723488533);
                            if (A043 == null || (A072 = A043.A07("url")) == null) {
                                break loop0;
                            }
                            if (A072.equals(A00)) {
                                str = "ai_terms";
                            } else {
                                str = "ai_at_meta";
                            }
                            if (A072.equals(A00)) {
                                c2Fb = C2Fb.A0L;
                            } else {
                                c2Fb = C2Fb.A0I;
                            }
                            Object obj = c15370ps.A00;
                            C14360o3.A0C(obj, AbstractC43591JPw.A00(1199));
                            AnonymousClass773.A04((SpannableStringBuilder) obj, new C33250Elk(context, userSession, c2Fb, num, str, str2, str3, A072, AbstractC167007dF.A09(context, i)), A0w);
                        }
                    }
                } else {
                    break;
                }
            }
        }
        if (c15370ps.A00 != null && z) {
            AbstractC34047F1a.A00(userSession);
        }
        this.A06.invoke(c15370ps.A00);
    }
}
