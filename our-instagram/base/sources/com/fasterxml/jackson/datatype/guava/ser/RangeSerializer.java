package com.fasterxml.jackson.datatype.guava.ser;

import X.AbstractC58318PtA;
import X.AbstractC58322PtE;
import X.AbstractC63023Sar;
import X.AbstractC910944l;
import X.AbstractC913345m;
import X.AnonymousClass182;
import X.C16R;
import X.C45R;
import X.C45T;
import X.C46K;
import X.C63105Sd9;
import X.InterfaceC65620ToB;
import X.SX7;
import X.TIF;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.google.common.collect.BoundType;
import com.google.common.collect.Cut;
import com.google.common.collect.Range;

/* loaded from: classes10.dex */
public class RangeSerializer extends StdSerializer implements C46K {
    public final AbstractC910944l A00;
    public final JsonSerializer A01;
    public final TIF A02;

    private void A03(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Range range) {
        BoundType boundType;
        BoundType boundType2;
        Cut cut = range.lowerBound;
        if (cut != Cut.BelowAll.A00) {
            TIF tif = this.A02;
            String str = tif.A01;
            JsonSerializer jsonSerializer = this.A01;
            if (jsonSerializer != null) {
                anonymousClass182.A0r(str);
                jsonSerializer.A0A(anonymousClass182, abstractC913345m, range.lowerBound.A01());
            } else {
                abstractC913345m.A0U(anonymousClass182, cut.A01(), str);
            }
            String str2 = tif.A00;
            Cut cut2 = range.lowerBound;
            if (cut2 instanceof Cut.BelowValue) {
                boundType2 = BoundType.CLOSED;
            } else {
                if (cut2 instanceof Cut.BelowAll) {
                    throw AbstractC58318PtA.A0Z();
                }
                if (cut2 instanceof Cut.AboveValue) {
                    boundType2 = BoundType.OPEN;
                } else {
                    throw AbstractC58318PtA.A0W("this statement should be unreachable");
                }
            }
            anonymousClass182.A0S(str2, boundType2.name());
        }
        Cut cut3 = range.upperBound;
        if (cut3 != Cut.AboveAll.A00) {
            TIF tif2 = this.A02;
            String str3 = tif2.A03;
            JsonSerializer jsonSerializer2 = this.A01;
            if (jsonSerializer2 != null) {
                anonymousClass182.A0r(str3);
                jsonSerializer2.A0A(anonymousClass182, abstractC913345m, range.upperBound.A01());
            } else {
                abstractC913345m.A0U(anonymousClass182, cut3.A01(), str3);
            }
            String str4 = tif2.A02;
            Cut cut4 = range.upperBound;
            if (cut4 instanceof Cut.BelowValue) {
                boundType = BoundType.OPEN;
            } else {
                if (cut4 instanceof Cut.BelowAll) {
                    throw AbstractC58318PtA.A0W("this statement should be unreachable");
                }
                if (cut4 instanceof Cut.AboveValue) {
                    boundType = BoundType.CLOSED;
                } else {
                    throw AbstractC58318PtA.A0Z();
                }
            }
            anonymousClass182.A0S(str4, boundType.name());
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A09(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, AbstractC63023Sar abstractC63023Sar, Object obj) {
        Range range = (Range) obj;
        anonymousClass182.A0F(range);
        SX7 A00 = AbstractC63023Sar.A00(anonymousClass182, C16R.A0D, abstractC63023Sar, range);
        A03(anonymousClass182, abstractC913345m, range);
        abstractC63023Sar.A03(anonymousClass182, A00);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        Range range = (Range) obj;
        anonymousClass182.A0p(range);
        A03(anonymousClass182, abstractC913345m, range);
        anonymousClass182.A0a();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ boolean A0B(AbstractC913345m abstractC913345m, Object obj) {
        Range range = (Range) obj;
        return range.lowerBound.equals(range.upperBound);
    }

    @Override // X.C46K
    public final JsonSerializer ALs(InterfaceC65620ToB interfaceC65620ToB, AbstractC913345m abstractC913345m) {
        C45R c45r = abstractC913345m.A05;
        TIF A00 = C63105Sd9.A00(((C45T) c45r).A01.A02, c45r);
        JsonSerializer jsonSerializer = this.A01;
        if (jsonSerializer == null) {
            AbstractC910944l abstractC910944l = this.A00;
            AbstractC910944l A0a = AbstractC58322PtE.A0a(abstractC910944l, 0);
            if (A0a.A00 != Object.class) {
                return new RangeSerializer(abstractC910944l, abstractC913345m.A0E(interfaceC65620ToB, A0a), A00);
            }
        } else {
            jsonSerializer = AbstractC58322PtE.A0b(interfaceC65620ToB, jsonSerializer, abstractC913345m, jsonSerializer instanceof C46K ? 1 : 0);
        }
        return new RangeSerializer(this.A00, jsonSerializer, A00);
    }

    public RangeSerializer(AbstractC910944l abstractC910944l, JsonSerializer jsonSerializer, TIF tif) {
        super(abstractC910944l);
        this.A00 = abstractC910944l;
        this.A01 = jsonSerializer;
        this.A02 = tif;
    }
}
