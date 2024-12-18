package com.fasterxml.jackson.databind.ser.impl;

import X.AbstractC58319PtB;
import X.AbstractC58321PtD;
import X.AbstractC63023Sar;
import X.AbstractC913345m;
import X.AnonymousClass182;
import X.C00O;
import X.C102314j6;
import X.C16R;
import X.RC7;
import X.SIM;
import X.SX7;
import X.SXY;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.util.Set;

/* loaded from: classes10.dex */
public class BeanAsArraySerializer extends BeanSerializerBase {
    public final BeanSerializerBase A00;

    public BeanAsArraySerializer(BeanSerializerBase beanSerializerBase) {
        super((SIM) null, beanSerializerBase, beanSerializerBase.A02);
        this.A00 = beanSerializerBase;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final JsonSerializer A07(SXY sxy) {
        return this.A00.A07(sxy);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase, com.fasterxml.jackson.databind.JsonSerializer
    public final void A09(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, AbstractC63023Sar abstractC63023Sar, Object obj) {
        if (this.A01 != null) {
            A0G(anonymousClass182, abstractC913345m, abstractC63023Sar, obj);
            return;
        }
        SX7 A0E = A0E(C16R.A0C, abstractC63023Sar, obj);
        abstractC63023Sar.A02(anonymousClass182, A0E);
        anonymousClass182.A0F(obj);
        A0J(anonymousClass182, abstractC913345m, obj);
        abstractC63023Sar.A03(anonymousClass182, A0E);
    }

    public final void A0J(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        RC7[] rc7Arr = this.A03;
        if (rc7Arr == null || abstractC913345m.A07 == null) {
            rc7Arr = this.A04;
        }
        int i = 0;
        try {
            int length = rc7Arr.length;
            while (i < length) {
                RC7 rc7 = rc7Arr[i];
                if (rc7 == null) {
                    anonymousClass182.A0b();
                } else {
                    rc7.A03(anonymousClass182, abstractC913345m, obj);
                }
                i++;
            }
        } catch (Exception e) {
            StdSerializer.A01(abstractC913345m, obj, rc7Arr[i].A04.A03, e);
            throw C00O.createAndThrow();
        } catch (StackOverflowError e2) {
            C102314j6 c102314j6 = new C102314j6(anonymousClass182, "Infinite recursion (StackOverflowError)", e2);
            c102314j6.A08(obj, rc7Arr[i].A04.A03);
            throw c102314j6;
        }
    }

    public final String toString() {
        return AbstractC58319PtB.A0t(((StdSerializer) this).A00, "BeanAsArraySerializer for ");
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        if (AbstractC58321PtD.A1V(abstractC913345m)) {
            RC7[] rc7Arr = this.A03;
            if (rc7Arr == null || abstractC913345m.A07 == null) {
                rc7Arr = this.A04;
            }
            if (rc7Arr.length == 1) {
                A0J(anonymousClass182, abstractC913345m, obj);
                return;
            }
        }
        anonymousClass182.A0o(obj);
        A0J(anonymousClass182, abstractC913345m, obj);
        anonymousClass182.A0Z();
    }

    public BeanAsArraySerializer(BeanSerializerBase beanSerializerBase, Set set, Set set2) {
        super(beanSerializerBase, set, set2);
        this.A00 = beanSerializerBase;
    }

    public BeanAsArraySerializer(SIM sim, BeanSerializerBase beanSerializerBase, Object obj) {
        super(sim, beanSerializerBase, obj);
        this.A00 = beanSerializerBase;
    }
}
