package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC166987dD;
import X.AbstractC43593JPy;
import X.AbstractC913345m;
import X.AnonymousClass182;
import X.C45R;
import X.C45T;
import X.EnumC912645f;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

/* loaded from: classes10.dex */
public class StdKeySerializers$Default extends StdSerializer {
    public final int A00;

    public StdKeySerializers$Default(Class cls, int i) {
        super(cls, false);
        this.A00 = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        String l;
        switch (this.A00) {
            case 1:
                Date date = (Date) obj;
                EnumC912645f enumC912645f = EnumC912645f.WRITE_DATE_KEYS_AS_TIMESTAMPS;
                C45R c45r = abstractC913345m.A05;
                if (c45r.A0C(enumC912645f)) {
                    l = String.valueOf(date.getTime());
                    break;
                } else {
                    DateFormat dateFormat = abstractC913345m.A03;
                    if (dateFormat == null) {
                        dateFormat = (DateFormat) ((C45T) c45r).A01.A08.clone();
                        abstractC913345m.A03 = dateFormat;
                    }
                    l = dateFormat.format(date);
                    break;
                }
            case 2:
                long timeInMillis = ((Calendar) obj).getTimeInMillis();
                EnumC912645f enumC912645f2 = EnumC912645f.WRITE_DATE_KEYS_AS_TIMESTAMPS;
                C45R c45r2 = abstractC913345m.A05;
                if (c45r2.A0C(enumC912645f2)) {
                    l = String.valueOf(timeInMillis);
                    break;
                } else {
                    DateFormat dateFormat2 = abstractC913345m.A03;
                    if (dateFormat2 == null) {
                        dateFormat2 = (DateFormat) ((C45T) c45r2).A01.A08.clone();
                        abstractC913345m.A03 = dateFormat2;
                    }
                    l = AbstractC43593JPy.A10(dateFormat2, timeInMillis);
                    break;
                }
            case 3:
                l = ((Class) obj).getName();
                break;
            case 4:
                EnumC912645f enumC912645f3 = EnumC912645f.WRITE_ENUMS_USING_TO_STRING;
                C45R c45r3 = abstractC913345m.A05;
                if (!c45r3.A0C(enumC912645f3)) {
                    Enum r7 = (Enum) obj;
                    if (c45r3.A0C(EnumC912645f.WRITE_ENUM_KEYS_USING_INDEX)) {
                        l = String.valueOf(r7.ordinal());
                        break;
                    } else {
                        l = r7.name();
                        break;
                    }
                }
                l = obj.toString();
                break;
            case 5:
            case 6:
                l = Long.toString(AbstractC166987dD.A0N(obj));
                break;
            case 7:
                l = ((C45T) abstractC913345m.A05).A01.A00.A05((byte[]) obj);
                break;
            default:
                l = obj.toString();
                break;
        }
        anonymousClass182.A0r(l);
    }
}
