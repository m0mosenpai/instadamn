package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC913345m;
import X.AnonymousClass001;
import X.AnonymousClass182;
import X.C1EM;
import X.C45R;
import X.C45T;
import X.C46K;
import X.EnumC912645f;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class DateTimeSerializerBase extends StdScalarSerializer implements C46K {
    public final DateFormat A00;
    public final Boolean A01;
    public final AtomicReference A02;

    public DateTimeSerializerBase A0E(Boolean bool, DateFormat dateFormat) {
        if (this instanceof DateSerializer) {
            return new DateTimeSerializerBase(bool, Date.class, dateFormat);
        }
        return new DateTimeSerializerBase(bool, Calendar.class, dateFormat);
    }

    public final void A0F(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Date date) {
        DateFormat dateFormat = this.A00;
        if (dateFormat == null) {
            EnumC912645f enumC912645f = EnumC912645f.WRITE_DATES_AS_TIMESTAMPS;
            C45R c45r = abstractC913345m.A05;
            if (c45r.A0C(enumC912645f)) {
                anonymousClass182.A0i(date.getTime());
                return;
            }
            DateFormat dateFormat2 = abstractC913345m.A03;
            if (dateFormat2 == null) {
                dateFormat2 = (DateFormat) ((C45T) c45r).A01.A08.clone();
                abstractC913345m.A03 = dateFormat2;
            }
            anonymousClass182.A0u(dateFormat2.format(date));
            return;
        }
        AtomicReference atomicReference = this.A02;
        DateFormat dateFormat3 = (DateFormat) atomicReference.getAndSet(null);
        if (dateFormat3 == null) {
            dateFormat3 = (DateFormat) dateFormat.clone();
        }
        anonymousClass182.A0u(dateFormat3.format(date));
        C1EM.A00(null, dateFormat3, atomicReference);
    }

    public final boolean A0G(AbstractC913345m abstractC913345m) {
        Boolean bool = this.A01;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.A00 == null) {
            if (abstractC913345m != null) {
                return abstractC913345m.A05.A0C(EnumC912645f.WRITE_DATES_AS_TIMESTAMPS);
            }
            throw new IllegalArgumentException(AnonymousClass001.A0R("Null SerializerProvider passed for ", super.A00.getName()));
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a7, code lost:
    
        if (r0.isEmpty() == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0101, code lost:
    
        if (r0 == false) goto L20;
     */
    @Override // X.C46K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.JsonSerializer ALs(X.InterfaceC65620ToB r9, X.AbstractC913345m r10) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.ALs(X.ToB, X.45m):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public DateTimeSerializerBase(Boolean bool, Class cls, DateFormat dateFormat) {
        super(cls);
        AtomicReference atomicReference;
        this.A01 = bool;
        this.A00 = dateFormat;
        if (dateFormat == null) {
            atomicReference = null;
        } else {
            atomicReference = new AtomicReference();
        }
        this.A02 = atomicReference;
    }
}
