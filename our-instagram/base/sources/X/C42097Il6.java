package X;

import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.DayOfTheWeek;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Il6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42097Il6 implements InterfaceC48192Ji {
    public final /* synthetic */ C2OR A00;

    public C42097Il6(C2OR c2or) {
        this.A00 = c2or;
    }

    @Override // X.InterfaceC48192Ji
    public final void invoke(AnonymousClass436 anonymousClass436) {
        C2JS c2js;
        Boolean bool;
        ImmutableList requiredCompactedTreeListField;
        if (anonymousClass436 != null && (c2js = (C2JS) anonymousClass436.Bos()) != null) {
            String A00 = AbstractC58317Pt9.A00(821);
            C2JS optionalTreeField = c2js.getOptionalTreeField(0, A00, QoF.class, 504197741);
            if (optionalTreeField != null) {
                bool = AbstractC31174DnI.A0o(optionalTreeField, AbstractC58317Pt9.A00(848), 1);
            } else {
                bool = null;
            }
            C2JS optionalTreeField2 = c2js.getOptionalTreeField(0, A00, QoF.class, 504197741);
            if (optionalTreeField2 != null && (requiredCompactedTreeListField = optionalTreeField2.getRequiredCompactedTreeListField(0, AbstractC58317Pt9.A00(349), QoE.class, 1190652765)) != null) {
                ArrayList A0i = AbstractC167007dF.A0i(requiredCompactedTreeListField);
                Iterator<E> it = requiredCompactedTreeListField.iterator();
                while (it.hasNext()) {
                    C2JS c2js2 = (C2JS) it.next();
                    ImmutableList requiredCompactedEnumListField = c2js2.getRequiredCompactedEnumListField(0, "days", EnumC223119sq.A02);
                    C14360o3.A07(requiredCompactedEnumListField);
                    ArrayList A0i2 = AbstractC167007dF.A0i(requiredCompactedEnumListField);
                    Iterator<E> it2 = requiredCompactedEnumListField.iterator();
                    while (it2.hasNext()) {
                        Object obj = DayOfTheWeek.A01.get(((EnumC223119sq) it2.next()).name());
                        if (obj == null) {
                            obj = DayOfTheWeek.A0A;
                        }
                        A0i2.add(obj);
                    }
                    A0i.add(new URF(AbstractC37304Gc5.A0Z(c2js2, "end_time", 1), AbstractC37304Gc5.A0Z(c2js2, TraceFieldType.StartTime, 3), c2js2.A09("label"), A0i2));
                }
                C2OR.A00(this.A00, bool, A0i);
            }
        }
    }
}
